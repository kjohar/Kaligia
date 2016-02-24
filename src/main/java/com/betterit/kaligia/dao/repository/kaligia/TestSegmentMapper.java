package com.betterit.kaligia.dao.repository.kaligia;

import com.betterit.kaligia.dao.model.kaligia.TestSegment;
import com.betterit.kaligia.dao.model.kaligia.TestSegmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestSegmentMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.testsegment
	 * @mbggenerated  Wed Feb 24 13:03:15 EST 2016
	 */
	int deleteByExample(TestSegmentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.testsegment
	 * @mbggenerated  Wed Feb 24 13:03:15 EST 2016
	 */
	int deleteByPrimaryKey(Integer segmentId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.testsegment
	 * @mbggenerated  Wed Feb 24 13:03:15 EST 2016
	 */
	int insert(TestSegment record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.testsegment
	 * @mbggenerated  Wed Feb 24 13:03:15 EST 2016
	 */
	int insertSelective(TestSegment record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.testsegment
	 * @mbggenerated  Wed Feb 24 13:03:15 EST 2016
	 */
	List<TestSegment> selectByExample(TestSegmentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.testsegment
	 * @mbggenerated  Wed Feb 24 13:03:15 EST 2016
	 */
	TestSegment selectByPrimaryKey(Integer segmentId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.testsegment
	 * @mbggenerated  Wed Feb 24 13:03:15 EST 2016
	 */
	int updateByExampleSelective(@Param("record") TestSegment record, @Param("example") TestSegmentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.testsegment
	 * @mbggenerated  Wed Feb 24 13:03:15 EST 2016
	 */
	int updateByExample(@Param("record") TestSegment record, @Param("example") TestSegmentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.testsegment
	 * @mbggenerated  Wed Feb 24 13:03:15 EST 2016
	 */
	int updateByPrimaryKeySelective(TestSegment record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.testsegment
	 * @mbggenerated  Wed Feb 24 13:03:15 EST 2016
	 */
	int updateByPrimaryKey(TestSegment record);
}