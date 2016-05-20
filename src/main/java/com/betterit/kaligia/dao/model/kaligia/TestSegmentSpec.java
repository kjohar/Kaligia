package com.betterit.kaligia.dao.model.kaligia;

import java.io.Serializable;

public class TestSegmentSpec implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column kaligia.testsegmentspec.segment_id
	 * @mbggenerated  Mon Mar 28 12:28:14 EDT 2016
	 */
	private Integer segmentId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column kaligia.testsegmentspec.device_id
	 * @mbggenerated  Mon Mar 28 12:28:14 EDT 2016
	 */
	private Integer deviceId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column kaligia.testsegmentspec.name
	 * @mbggenerated  Mon Mar 28 12:28:14 EDT 2016
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column kaligia.testsegmentspec.value
	 * @mbggenerated  Mon Mar 28 12:28:14 EDT 2016
	 */
	private String value;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column kaligia.testsegmentspec.unit
	 * @mbggenerated  Mon Mar 28 12:28:14 EDT 2016
	 */
	private String unit;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table kaligia.testsegmentspec
	 * @mbggenerated  Mon Mar 28 12:28:14 EDT 2016
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column kaligia.testsegmentspec.segment_id
	 * @return  the value of kaligia.testsegmentspec.segment_id
	 * @mbggenerated  Mon Mar 28 12:28:14 EDT 2016
	 */
	public Integer getSegmentId() {
		return segmentId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column kaligia.testsegmentspec.segment_id
	 * @param segmentId  the value for kaligia.testsegmentspec.segment_id
	 * @mbggenerated  Mon Mar 28 12:28:14 EDT 2016
	 */
	public void setSegmentId(Integer segmentId) {
		this.segmentId = segmentId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column kaligia.testsegmentspec.device_id
	 * @return  the value of kaligia.testsegmentspec.device_id
	 * @mbggenerated  Mon Mar 28 12:28:14 EDT 2016
	 */
	public Integer getDeviceId() {
		return deviceId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column kaligia.testsegmentspec.device_id
	 * @param deviceId  the value for kaligia.testsegmentspec.device_id
	 * @mbggenerated  Mon Mar 28 12:28:14 EDT 2016
	 */
	public void setDeviceId(Integer deviceId) {
		this.deviceId = deviceId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column kaligia.testsegmentspec.name
	 * @return  the value of kaligia.testsegmentspec.name
	 * @mbggenerated  Mon Mar 28 12:28:14 EDT 2016
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column kaligia.testsegmentspec.name
	 * @param name  the value for kaligia.testsegmentspec.name
	 * @mbggenerated  Mon Mar 28 12:28:14 EDT 2016
	 */
	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column kaligia.testsegmentspec.value
	 * @return  the value of kaligia.testsegmentspec.value
	 * @mbggenerated  Mon Mar 28 12:28:14 EDT 2016
	 */
	public String getValue() {
		return value;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column kaligia.testsegmentspec.value
	 * @param value  the value for kaligia.testsegmentspec.value
	 * @mbggenerated  Mon Mar 28 12:28:14 EDT 2016
	 */
	public void setValue(String value) {
		this.value = value == null ? null : value.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column kaligia.testsegmentspec.unit
	 * @return  the value of kaligia.testsegmentspec.unit
	 * @mbggenerated  Mon Mar 28 12:28:14 EDT 2016
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column kaligia.testsegmentspec.unit
	 * @param unit  the value for kaligia.testsegmentspec.unit
	 * @mbggenerated  Mon Mar 28 12:28:14 EDT 2016
	 */
	public void setUnit(String unit) {
		this.unit = unit == null ? null : unit.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.testsegmentspec
	 * @mbggenerated  Mon Mar 28 12:28:14 EDT 2016
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", segmentId=").append(segmentId);
		sb.append(", deviceId=").append(deviceId);
		sb.append(", name=").append(name);
		sb.append(", value=").append(value);
		sb.append(", unit=").append(unit);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}