package com.betterit.kaligia.dao.repository.kaligia;

import com.betterit.kaligia.dao.model.kaligia.TestProcedure;
import com.betterit.kaligia.dao.model.kaligia.TestProcedureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestProcedureMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.testprocedure
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	int deleteByExample(TestProcedureExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.testprocedure
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	int deleteByPrimaryKey(Integer procedureId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.testprocedure
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	int insert(TestProcedure record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.testprocedure
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	int insertSelective(TestProcedure record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.testprocedure
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	List<TestProcedure> selectByExample(TestProcedureExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.testprocedure
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	TestProcedure selectByPrimaryKey(Integer procedureId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.testprocedure
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	int updateByExampleSelective(@Param("record") TestProcedure record, @Param("example") TestProcedureExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.testprocedure
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	int updateByExample(@Param("record") TestProcedure record, @Param("example") TestProcedureExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.testprocedure
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	int updateByPrimaryKeySelective(TestProcedure record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.testprocedure
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	int updateByPrimaryKey(TestProcedure record);
}