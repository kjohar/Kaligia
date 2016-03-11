package com.betterit.kaligia.dao.repository.kaligia;

import com.betterit.kaligia.dao.model.kaligia.Site;
import com.betterit.kaligia.dao.model.kaligia.SiteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SiteMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.site
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	int deleteByExample(SiteExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.site
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	int deleteByPrimaryKey(Integer siteId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.site
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	int insert(Site record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.site
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	int insertSelective(Site record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.site
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	List<Site> selectByExample(SiteExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.site
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	Site selectByPrimaryKey(Integer siteId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.site
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	int updateByExampleSelective(@Param("record") Site record, @Param("example") SiteExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.site
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	int updateByExample(@Param("record") Site record, @Param("example") SiteExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.site
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	int updateByPrimaryKeySelective(Site record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.site
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	int updateByPrimaryKey(Site record);
}