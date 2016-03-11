package com.betterit.kaligia.dao.repository.kaligia;

import com.betterit.kaligia.dao.model.kaligia.RolePrivs;
import com.betterit.kaligia.dao.model.kaligia.RolePrivsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RolePrivsMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.roleprivs
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	int deleteByExample(RolePrivsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.roleprivs
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	int insert(RolePrivs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.roleprivs
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	int insertSelective(RolePrivs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.roleprivs
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	List<RolePrivs> selectByExample(RolePrivsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.roleprivs
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	int updateByExampleSelective(@Param("record") RolePrivs record, @Param("example") RolePrivsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.roleprivs
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	int updateByExample(@Param("record") RolePrivs record, @Param("example") RolePrivsExample example);
}