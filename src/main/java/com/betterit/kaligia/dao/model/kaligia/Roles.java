package com.betterit.kaligia.dao.model.kaligia;

import java.io.Serializable;

public class Roles implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column kaligia.roles.role_id
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	private Integer roleId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column kaligia.roles.name
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column kaligia.roles.description
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	private String description;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table kaligia.roles
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column kaligia.roles.role_id
	 * @return  the value of kaligia.roles.role_id
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	public Integer getRoleId() {
		return roleId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column kaligia.roles.role_id
	 * @param roleId  the value for kaligia.roles.role_id
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column kaligia.roles.name
	 * @return  the value of kaligia.roles.name
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column kaligia.roles.name
	 * @param name  the value for kaligia.roles.name
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column kaligia.roles.description
	 * @return  the value of kaligia.roles.description
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column kaligia.roles.description
	 * @param description  the value for kaligia.roles.description
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	public void setDescription(String description) {
		this.description = description == null ? null : description.trim();
	}
}