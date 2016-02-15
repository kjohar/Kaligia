/**
 * 
 */
package com.betterit.kaligia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import com.oceanoptics.omnidriver.api.wrapper.Wrapper;
import com.oceanoptics.omnidriver.features.buffer.DataBuffer;
import com.oceanoptics.omnidriver.features.thermoelectric.ThermoElectricWrapper;

/**
 * @author Kaide Johar
 *
 */
public class TestRun {
	
	private static final Logger log = LoggerFactory.getLogger(TestRun.class);
	
	private String name;
	private String description;
	private String type;
	private Integer integrationTime;
	private Integer restTime;
	private Integer scanToAverage;
	private Integer darkCurrentCorrectFlag;
	private Integer nonlinearityCorrectFlag;
	private Integer boxcarWidth;
	private Integer spectrometerIndex;
	private double[] spectraM;
	private double[] wavelengthM;
	private Date ts;
	private String created_by;
	private int testcase_id;
	private int run_id;
	private int subject_id;
	private int specimen_id;
	private int user_id;
	private int site_id;
	private int run_no;
	private String status;
	private JdbcTemplate jdbc;

	
	public TestRun (String name, 
					String description, 
					String type,
					Integer integrationTime, 
					Integer restTime,
					Integer scanToAverage,
					Integer darkCurrent,
					Integer nonLinear,
					Integer boxcarWidth,
					Integer spectrometerIndex,
					Integer run_no,
					JdbcTemplate jdbc) {
		this.ts = new Date();
		this.name = name;
		this.description = description;
		this.type = type;
		this.integrationTime = integrationTime;
		this.restTime = restTime;
		this.scanToAverage = scanToAverage;
		this.darkCurrentCorrectFlag = darkCurrent;
		this.nonlinearityCorrectFlag = nonLinear;
		this.boxcarWidth = boxcarWidth;
		this.spectrometerIndex = spectrometerIndex;
		this.jdbc = jdbc;
		this.created_by="Kaide Johar";
		this.testcase_id = 0;
		this.run_id = 0;
		this.subject_id=1;
		this.specimen_id = 1;
		this.user_id = 2;
		this.site_id = 1;
		this.run_no = run_no;
		this.status = "New";
	}
	
	public Integer doTestRun() {
		
		//Create testrun in DB
		log.info("Name:" + name);
		log.info("description:" + description);
		log.info("type:" + type);
		log.info("integrationTime:" + integrationTime);
		log.info("restTime:" + restTime);
		log.info("scanToAverage:" + scanToAverage);
		log.info("darkCurrentCorrectFlag:" + darkCurrentCorrectFlag);
		log.info("nonlinearityCorrectFlag:" + nonlinearityCorrectFlag);
		log.info("boxcarWidth:" + boxcarWidth);
		log.info("spectrometerIndex:" + spectrometerIndex);
		log.info("Created By:" + created_by);

		
		//Initialize Device
		
		Wrapper wrapper_t;
		DataBuffer bufferCtrl_t;
		
		try {

		wrapper_t = new Wrapper();
		wrapper_t.openAllSpectrometers();
		bufferCtrl_t = wrapper_t.getFeatureControllerDataBuffer(spectrometerIndex);
		
		ThermoElectricWrapper tecController = wrapper_t.getFeatureControllerThermoElectric(spectrometerIndex);
			double detTemp = tecController.getDetectorTemperatureCelsius();
			log.info("Detector temperature: " + detTemp + " deg C");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			log.info("Spectrometer Initialization Failed");
			return 100;
		}

		// Set Parameters
		SpectraAcquisition singleMeasurement = new SpectraAcquisition(integrationTime, restTime, scanToAverage, darkCurrentCorrectFlag, nonlinearityCorrectFlag, boxcarWidth, spectrometerIndex, wrapper_t, bufferCtrl_t);
		singleMeasurement.setParameters();
		singleMeasurement.setBuffer();
		
		//Run Test
		singleMeasurement.getSpectra();
		spectraM = singleMeasurement.returnSpectra();
		wavelengthM = singleMeasurement.returnWavelength();
		
		
		/*
		// Hard Coded for testing
		wavelengthM = new double[10];
		spectraM = new double[10];		
		for (int j = 0; j < 10; j++) {
			wavelengthM[j]=j+1;
			spectraM[j]=j+1;
		}
		*/
		
		//Print Result
		for (int j = 0; j < spectraM.length; j++) {
			if (Double.toString(spectraM[j]) != null)
				System.out.println(wavelengthM[j] + "\t" + spectraM[j]);
		}
					
		//Store Results
		//TO DO
		int rr = insertTestRun();
		if (rr > 0) {
			log.info("Test Case insert failed");
			return 100;
		}
		
		TestResult tr = new TestResult(run_id,run_no, wavelengthM, spectraM, jdbc);
		tr.insertResults();
		
		return 0;
	}
	
	public int insertTestRun() {
		
		final String inTC = "insert into kaligia.testcase (name, description, type, creation_date, created_by)" 
							+ "values (?, ?, ?, ?, ?);";
		
		KeyHolder keyHolder = new GeneratedKeyHolder();
		
		int rr;
		try {
			rr = jdbc.update(
					new PreparedStatementCreator() {
						public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
			    	            PreparedStatement ps = connection.prepareStatement(inTC, new String[]{"testcase_id"});
			    	            ps.setString(1, name + "_" + ts.toString() + "_" + run_no);
			    	            ps.setString(2, description);
			    	            ps.setString(3, type);
			    	            ps.setTimestamp(4, new Timestamp(ts.getTime()));
			    	            ps.setInt(5, user_id);
								return ps;
						}
					},
					keyHolder);
		} catch (DataAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			log.info("Insert into TestCase failed.");
			return 100;
		}
		
		log.info("Inserted " + rr + " row in testcase" + " ID: " + keyHolder.getKey().intValue());
		testcase_id = keyHolder.getKey().intValue();
		
		insertTestDevices("Laser 830");
		insertTestDevices("Spectrometer QE Pro");
		
		insertTestCaseSpec(2, "IntegrationTime", integrationTime.toString(), "s");
		insertTestCaseSpec(2, "ScansToAverage",  scanToAverage.toString(), "");
		insertTestCaseSpec(2, "BoxcarWidth", boxcarWidth.toString(), "pixel");
		insertTestCaseSpec(2, "ElectricDark", darkCurrentCorrectFlag.toString(), "");
		insertTestCaseSpec(2, "NonLinearityCorrection", nonlinearityCorrectFlag.toString(), "");
		insertTestCaseSpec(0, "Delay", restTime.toString(), "s");
		insertTestCaseSpec(0, "Repeat", "1", "");
		
		insertSubSpec();
		
		final String inRun = "insert into kaligia.testrun (name, testcase_id, specimen_id, status, start_time, end_time, creation_date, run_by, validity, notes, site_id)" 
				+ "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

		try {
			rr = jdbc.update(
				new PreparedStatementCreator() {
					public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
				            PreparedStatement ps = connection.prepareStatement(inRun, new String[]{"run_id"});
				            ps.setString(1, name + "_" + ts.toString() + "_" + run_no);
				            ps.setInt(2, testcase_id);
				            ps.setInt(3, specimen_id);
							ps.setString(4, status);
				            ps.setTimestamp(5, new Timestamp(ts.getTime()));
							ps.setTimestamp(6, new Timestamp(ts.getTime()));
							ps.setTimestamp(7, new Timestamp(ts.getTime()));
				            ps.setInt(8, user_id);
							ps.setString(9, "Test");
							ps.setString(10, "Test");
							ps.setInt(11, site_id);
							return ps;
					}
				},
				keyHolder);
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			log.info("Insert into TestRun failed.");
			return 100;
		}
		
		log.info("Inserted " + rr + " row in testrun" + " ID: " + keyHolder.getKey().intValue());
		run_id = keyHolder.getKey().intValue();
		
		return 0;
	}
	
	public int insertTestCaseSpec(int device_id, String param, String value, String unit) {
		
		final String inTCS = "insert into kaligia.testcasespec (testcase_id, device_id, name, value, unit) values (?, ?, ?, ?, ?);";
		log.debug(inTCS);
		
		int rr;
		try {
			rr = jdbc.update(
					new PreparedStatementCreator() {
						public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
			    	            PreparedStatement ps = connection.prepareStatement(inTCS);
			    	            ps.setInt(1, testcase_id);
			    	            if(device_id > 0) {
			    	            	ps.setInt(2, device_id);
			    	            } else {
			    	            	ps.setNull(2, java.sql.Types.NULL);
			    	            }
			    	            ps.setString(3, param);
			    	            ps.setString(4, value);
			    	            ps.setString(5, unit);
								return ps;
						}
					});
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			log.info("Insert into TestCaseSpec Failed");
			return 100;
		}
		
		log.info("Inserted " + rr + " row in testcasespec" + " Param: " + param + " Value: " + value);
		return 0;
	}
	
	public int insertTestDevices(String device) {
		
		final String qryD = "select device_id from kaligia.device where name = '" + device + "';";
		log.debug(qryD);
		
		Integer device_id = jdbc.queryForObject(qryD, Integer.class);

		log.info("Device Name: " + device + " ID: " + device_id);
		
		final String inTD = "insert into kaligia.testdevices (testcase_id, device_id) values (?, ?);";
		
		int rr;
		
		try {
			rr = jdbc.update(
					new PreparedStatementCreator() {
						public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
			    	            PreparedStatement ps = connection.prepareStatement(inTD);
			    	            ps.setInt(1, testcase_id);
			    	            ps.setInt(2, device_id);
								return ps;
						}
					});
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			log.info("Insert into TestDevice failed");
			return 100;
		}
		
		log.info("Inserted " + rr + " row in testdevice");
		return 0;
	}
	
	public int insertSubSpec() {
		
		final String qryS = "select subject_id from kaligia.subject where name = '" + name + "';";
		log.debug(qryS);
		int rr = 0;
		KeyHolder keyHolder = new GeneratedKeyHolder();

		try {
			
			subject_id = jdbc.queryForObject(qryS, Integer.class);
			
		} catch (EmptyResultDataAccessException emp) {
			
			//Insert subject
			final String inSub = "insert into kaligia.subject (name, age, gender) values (?, ?, ?);";
			try {
				rr = jdbc.update(
						new PreparedStatementCreator() {
							public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
				    	            PreparedStatement ps = connection.prepareStatement(inSub, new String[]{"subject_id"});
				    	            ps.setString(1, name);
				    	            ps.setInt(2, 0);
				    	            ps.setString(3, "M/F");
				    	           return ps;
							}
						},
						keyHolder);
			} catch (DataAccessException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				log.info("Insert into Subject failed.");
				return 100;
			}
			
			log.info("Inserted " + rr + " row in subject" + " ID: " + keyHolder.getKey().intValue());
			subject_id = keyHolder.getKey().intValue();
			
			//Insert Specimen
			final String inSpec = "insert into kaligia.specimen (name, type, subject_id, creation_date, created_by) values (?, ?, ?, ?, ?);";
			try {
				rr = jdbc.update(
						new PreparedStatementCreator() {
							public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
				    	            PreparedStatement ps = connection.prepareStatement(inSpec, new String[]{"specimen_id"});
				    	            ps.setString(1, name);
				    	            ps.setString(2, "Skin");
				    	            ps.setInt(3,  subject_id);
				    	            ps.setTimestamp(4, new Timestamp(ts.getTime()));
				    	            ps.setInt(5,  user_id);
				    	           return ps;
							}
						},
						keyHolder);
			} catch (DataAccessException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				log.info("Insert into Specimen failed.");
				return 100;
			}
			
			log.info("Inserted " + rr + " row in specimen" + " ID: " + keyHolder.getKey().intValue());
			specimen_id = keyHolder.getKey().intValue();
			return 0;

		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			log.info("Failed to get subject");
			return 100;
		}
		
		//Get specimen
		final String qrySP = "select specimen_id from kaligia.specimen where subject_id = " + subject_id + ";";
		try {
			specimen_id = jdbc.queryForObject(qrySP, Integer.class);
		} catch(EmptyResultDataAccessException emp) {
			//Insert Specimen
			final String inSpec = "insert into kaligia.specimen (name, type, subject_id, creation_date, created_by) values (?, ?, ?, ?, ?);";
			try {
				rr = jdbc.update(
						new PreparedStatementCreator() {
							public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
				    	            PreparedStatement ps = connection.prepareStatement(inSpec, new String[]{"specimen_id"});
				    	            ps.setString(1, name);
				    	            ps.setString(2, "Skin");
				    	            ps.setInt(3,  subject_id);
				    	            ps.setTimestamp(4, new Timestamp(ts.getTime()));
				    	            ps.setInt(5,  user_id);
				    	           return ps;
							}
						},
						keyHolder);
			} catch (DataAccessException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				log.info("Insert into Specimen failed.");
				return 100;
			}

		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			log.info("Failed to get subject");
			return 100;
		}
		
		log.info("Subject ID: " + subject_id + " Specimen ID: " + specimen_id);
		return 0;
	}
}
