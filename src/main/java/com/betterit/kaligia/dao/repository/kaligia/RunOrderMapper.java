package com.betterit.kaligia.dao.repository.kaligia;

import com.betterit.kaligia.dao.model.kaligia.RunOrder;
import com.betterit.kaligia.dao.model.kaligia.RunOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RunOrderMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.runorder
	 * @mbggenerated  Thu Feb 25 22:09:43 EST 2016
	 */
	int deleteByExample(RunOrderExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.runorder
	 * @mbggenerated  Thu Feb 25 22:09:43 EST 2016
	 */
	int deleteByPrimaryKey(Integer runId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.runorder
	 * @mbggenerated  Thu Feb 25 22:09:43 EST 2016
	 */
	int insert(RunOrder record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.runorder
	 * @mbggenerated  Thu Feb 25 22:09:43 EST 2016
	 */
	int insertSelective(RunOrder record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.runorder
	 * @mbggenerated  Thu Feb 25 22:09:43 EST 2016
	 */
	List<RunOrder> selectByExample(RunOrderExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.runorder
	 * @mbggenerated  Thu Feb 25 22:09:43 EST 2016
	 */
	RunOrder selectByPrimaryKey(Integer runId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.runorder
	 * @mbggenerated  Thu Feb 25 22:09:43 EST 2016
	 */
	int updateByExampleSelective(@Param("record") RunOrder record, @Param("example") RunOrderExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.runorder
	 * @mbggenerated  Thu Feb 25 22:09:43 EST 2016
	 */
	int updateByExample(@Param("record") RunOrder record, @Param("example") RunOrderExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.runorder
	 * @mbggenerated  Thu Feb 25 22:09:43 EST 2016
	 */
	int updateByPrimaryKeySelective(RunOrder record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.runorder
	 * @mbggenerated  Thu Feb 25 22:09:43 EST 2016
	 */
	int updateByPrimaryKey(RunOrder record);
}