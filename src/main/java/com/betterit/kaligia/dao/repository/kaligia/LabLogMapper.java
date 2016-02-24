package com.betterit.kaligia.dao.repository.kaligia;

import com.betterit.kaligia.dao.model.kaligia.LabLog;
import com.betterit.kaligia.dao.model.kaligia.LabLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LabLogMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.lablog
	 * @mbggenerated  Tue Feb 23 15:44:22 EST 2016
	 */
	int deleteByExample(LabLogExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.lablog
	 * @mbggenerated  Tue Feb 23 15:44:22 EST 2016
	 */
	int insert(LabLog record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.lablog
	 * @mbggenerated  Tue Feb 23 15:44:22 EST 2016
	 */
	int insertSelective(LabLog record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.lablog
	 * @mbggenerated  Tue Feb 23 15:44:22 EST 2016
	 */
	List<LabLog> selectByExample(LabLogExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.lablog
	 * @mbggenerated  Tue Feb 23 15:44:22 EST 2016
	 */
	int updateByExampleSelective(@Param("record") LabLog record, @Param("example") LabLogExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.lablog
	 * @mbggenerated  Tue Feb 23 15:44:22 EST 2016
	 */
	int updateByExample(@Param("record") LabLog record, @Param("example") LabLogExample example);
}