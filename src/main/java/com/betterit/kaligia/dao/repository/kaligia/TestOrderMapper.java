package com.betterit.kaligia.dao.repository.kaligia;

import com.betterit.kaligia.dao.model.kaligia.TestOrder;
import com.betterit.kaligia.dao.model.kaligia.TestOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestOrderMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.testorder
	 * @mbggenerated  Wed Feb 24 13:03:15 EST 2016
	 */
	int deleteByExample(TestOrderExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.testorder
	 * @mbggenerated  Wed Feb 24 13:03:15 EST 2016
	 */
	int deleteByPrimaryKey(Integer orderId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.testorder
	 * @mbggenerated  Wed Feb 24 13:03:15 EST 2016
	 */
	int insert(TestOrder record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.testorder
	 * @mbggenerated  Wed Feb 24 13:03:15 EST 2016
	 */
	int insertSelective(TestOrder record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.testorder
	 * @mbggenerated  Wed Feb 24 13:03:15 EST 2016
	 */
	List<TestOrder> selectByExample(TestOrderExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.testorder
	 * @mbggenerated  Wed Feb 24 13:03:15 EST 2016
	 */
	TestOrder selectByPrimaryKey(Integer orderId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.testorder
	 * @mbggenerated  Wed Feb 24 13:03:15 EST 2016
	 */
	int updateByExampleSelective(@Param("record") TestOrder record, @Param("example") TestOrderExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.testorder
	 * @mbggenerated  Wed Feb 24 13:03:15 EST 2016
	 */
	int updateByExample(@Param("record") TestOrder record, @Param("example") TestOrderExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.testorder
	 * @mbggenerated  Wed Feb 24 13:03:15 EST 2016
	 */
	int updateByPrimaryKeySelective(TestOrder record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.testorder
	 * @mbggenerated  Wed Feb 24 13:03:15 EST 2016
	 */
	int updateByPrimaryKey(TestOrder record);
}