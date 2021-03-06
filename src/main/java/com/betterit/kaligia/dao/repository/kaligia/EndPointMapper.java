package com.betterit.kaligia.dao.repository.kaligia;

import com.betterit.kaligia.dao.model.kaligia.EndPoint;
import com.betterit.kaligia.dao.model.kaligia.EndPointExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EndPointMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.endpoint
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	int deleteByExample(EndPointExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.endpoint
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	int deleteByPrimaryKey(Integer endPointId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.endpoint
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	int insert(EndPoint record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.endpoint
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	int insertSelective(EndPoint record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.endpoint
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	List<EndPoint> selectByExample(EndPointExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.endpoint
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	EndPoint selectByPrimaryKey(Integer endPointId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.endpoint
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	int updateByExampleSelective(@Param("record") EndPoint record, @Param("example") EndPointExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.endpoint
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	int updateByExample(@Param("record") EndPoint record, @Param("example") EndPointExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.endpoint
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	int updateByPrimaryKeySelective(EndPoint record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.endpoint
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	int updateByPrimaryKey(EndPoint record);
}