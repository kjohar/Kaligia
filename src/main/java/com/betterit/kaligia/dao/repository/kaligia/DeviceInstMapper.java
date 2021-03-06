package com.betterit.kaligia.dao.repository.kaligia;

import com.betterit.kaligia.dao.model.kaligia.DeviceInst;
import com.betterit.kaligia.dao.model.kaligia.DeviceInstExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceInstMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.deviceinst
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	int deleteByExample(DeviceInstExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.deviceinst
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	int deleteByPrimaryKey(Integer deviceInstId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.deviceinst
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	int insert(DeviceInst record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.deviceinst
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	int insertSelective(DeviceInst record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.deviceinst
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	List<DeviceInst> selectByExample(DeviceInstExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.deviceinst
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	DeviceInst selectByPrimaryKey(Integer deviceInstId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.deviceinst
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	int updateByExampleSelective(@Param("record") DeviceInst record, @Param("example") DeviceInstExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.deviceinst
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	int updateByExample(@Param("record") DeviceInst record, @Param("example") DeviceInstExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.deviceinst
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	int updateByPrimaryKeySelective(DeviceInst record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.deviceinst
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	int updateByPrimaryKey(DeviceInst record);
}