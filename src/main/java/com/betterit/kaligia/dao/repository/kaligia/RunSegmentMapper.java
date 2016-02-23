package com.betterit.kaligia.dao.repository.kaligia;

import com.betterit.kaligia.dao.model.kaligia.RunSegment;
import com.betterit.kaligia.dao.model.kaligia.RunSegmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RunSegmentMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.runsegment
	 * @mbggenerated  Tue Feb 23 15:44:22 EST 2016
	 */
	int deleteByExample(RunSegmentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.runsegment
	 * @mbggenerated  Tue Feb 23 15:44:22 EST 2016
	 */
	int deleteByPrimaryKey(Integer runSegmentId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.runsegment
	 * @mbggenerated  Tue Feb 23 15:44:22 EST 2016
	 */
	int insert(RunSegment record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.runsegment
	 * @mbggenerated  Tue Feb 23 15:44:22 EST 2016
	 */
	int insertSelective(RunSegment record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.runsegment
	 * @mbggenerated  Tue Feb 23 15:44:22 EST 2016
	 */
	List<RunSegment> selectByExample(RunSegmentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.runsegment
	 * @mbggenerated  Tue Feb 23 15:44:22 EST 2016
	 */
	RunSegment selectByPrimaryKey(Integer runSegmentId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.runsegment
	 * @mbggenerated  Tue Feb 23 15:44:22 EST 2016
	 */
	int updateByExampleSelective(@Param("record") RunSegment record, @Param("example") RunSegmentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.runsegment
	 * @mbggenerated  Tue Feb 23 15:44:22 EST 2016
	 */
	int updateByExample(@Param("record") RunSegment record, @Param("example") RunSegmentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.runsegment
	 * @mbggenerated  Tue Feb 23 15:44:22 EST 2016
	 */
	int updateByPrimaryKeySelective(RunSegment record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.runsegment
	 * @mbggenerated  Tue Feb 23 15:44:22 EST 2016
	 */
	int updateByPrimaryKey(RunSegment record);
}