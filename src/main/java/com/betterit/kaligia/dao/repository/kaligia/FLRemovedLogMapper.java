package com.betterit.kaligia.dao.repository.kaligia;

import com.betterit.kaligia.dao.model.kaligia.FLRemovedLog;
import com.betterit.kaligia.dao.model.kaligia.FLRemovedLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FLRemovedLogMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.flremovedlog
	 * @mbggenerated  Fri Mar 11 11:31:47 EST 2016
	 */
	int deleteByExample(FLRemovedLogExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.flremovedlog
	 * @mbggenerated  Fri Mar 11 11:31:47 EST 2016
	 */
	int insert(FLRemovedLog record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.flremovedlog
	 * @mbggenerated  Fri Mar 11 11:31:47 EST 2016
	 */
	int insertSelective(FLRemovedLog record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.flremovedlog
	 * @mbggenerated  Fri Mar 11 11:31:47 EST 2016
	 */
	List<FLRemovedLog> selectByExample(FLRemovedLogExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.flremovedlog
	 * @mbggenerated  Fri Mar 11 11:31:47 EST 2016
	 */
	int updateByExampleSelective(@Param("record") FLRemovedLog record, @Param("example") FLRemovedLogExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.flremovedlog
	 * @mbggenerated  Fri Mar 11 11:31:47 EST 2016
	 */
	int updateByExample(@Param("record") FLRemovedLog record, @Param("example") FLRemovedLogExample example);
}