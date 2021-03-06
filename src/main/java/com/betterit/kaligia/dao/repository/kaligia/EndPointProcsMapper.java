package com.betterit.kaligia.dao.repository.kaligia;

import com.betterit.kaligia.dao.model.kaligia.EndPointProcs;
import com.betterit.kaligia.dao.model.kaligia.EndPointProcsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EndPointProcsMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.endpointprocs
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	int deleteByExample(EndPointProcsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.endpointprocs
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	int insert(EndPointProcs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.endpointprocs
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	int insertSelective(EndPointProcs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.endpointprocs
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	List<EndPointProcs> selectByExample(EndPointProcsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.endpointprocs
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	int updateByExampleSelective(@Param("record") EndPointProcs record, @Param("example") EndPointProcsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.endpointprocs
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	int updateByExample(@Param("record") EndPointProcs record, @Param("example") EndPointProcsExample example);
}