package com.betterit.kaligia.dao.repository.kaligia;

import com.betterit.kaligia.dao.model.kaligia.TestProcedureSpecs;
import com.betterit.kaligia.dao.model.kaligia.TestProcedureSpecsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestProcedureSpecsMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.testprocedurespecs
	 * @mbggenerated  Mon Mar 28 12:28:14 EDT 2016
	 */
	int deleteByExample(TestProcedureSpecsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.testprocedurespecs
	 * @mbggenerated  Mon Mar 28 12:28:14 EDT 2016
	 */
	int insert(TestProcedureSpecs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.testprocedurespecs
	 * @mbggenerated  Mon Mar 28 12:28:14 EDT 2016
	 */
	int insertSelective(TestProcedureSpecs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.testprocedurespecs
	 * @mbggenerated  Mon Mar 28 12:28:14 EDT 2016
	 */
	List<TestProcedureSpecs> selectByExample(TestProcedureSpecsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.testprocedurespecs
	 * @mbggenerated  Mon Mar 28 12:28:14 EDT 2016
	 */
	int updateByExampleSelective(@Param("record") TestProcedureSpecs record,
			@Param("example") TestProcedureSpecsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.testprocedurespecs
	 * @mbggenerated  Mon Mar 28 12:28:14 EDT 2016
	 */
	int updateByExample(@Param("record") TestProcedureSpecs record,
			@Param("example") TestProcedureSpecsExample example);
}