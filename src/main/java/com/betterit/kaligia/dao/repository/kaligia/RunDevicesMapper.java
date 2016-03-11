package com.betterit.kaligia.dao.repository.kaligia;

import com.betterit.kaligia.dao.model.kaligia.RunDevices;
import com.betterit.kaligia.dao.model.kaligia.RunDevicesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RunDevicesMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.rundevices
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	int deleteByExample(RunDevicesExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.rundevices
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	int insert(RunDevices record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.rundevices
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	int insertSelective(RunDevices record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.rundevices
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	List<RunDevices> selectByExample(RunDevicesExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.rundevices
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	int updateByExampleSelective(@Param("record") RunDevices record, @Param("example") RunDevicesExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.rundevices
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	int updateByExample(@Param("record") RunDevices record, @Param("example") RunDevicesExample example);
}