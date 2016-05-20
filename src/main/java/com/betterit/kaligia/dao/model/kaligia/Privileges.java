package com.betterit.kaligia.dao.model.kaligia;

import java.io.Serializable;

public class Privileges implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column kaligia.privileges.priv_id
	 * @mbggenerated  Mon Mar 28 12:28:14 EDT 2016
	 */
	private Integer privId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column kaligia.privileges.name
	 * @mbggenerated  Mon Mar 28 12:28:14 EDT 2016
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column kaligia.privileges.description
	 * @mbggenerated  Mon Mar 28 12:28:14 EDT 2016
	 */
	private String description;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table kaligia.privileges
	 * @mbggenerated  Mon Mar 28 12:28:14 EDT 2016
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column kaligia.privileges.priv_id
	 * @return  the value of kaligia.privileges.priv_id
	 * @mbggenerated  Mon Mar 28 12:28:14 EDT 2016
	 */
	public Integer getPrivId() {
		return privId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column kaligia.privileges.priv_id
	 * @param privId  the value for kaligia.privileges.priv_id
	 * @mbggenerated  Mon Mar 28 12:28:14 EDT 2016
	 */
	public void setPrivId(Integer privId) {
		this.privId = privId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column kaligia.privileges.name
	 * @return  the value of kaligia.privileges.name
	 * @mbggenerated  Mon Mar 28 12:28:14 EDT 2016
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column kaligia.privileges.name
	 * @param name  the value for kaligia.privileges.name
	 * @mbggenerated  Mon Mar 28 12:28:14 EDT 2016
	 */
	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column kaligia.privileges.description
	 * @return  the value of kaligia.privileges.description
	 * @mbggenerated  Mon Mar 28 12:28:14 EDT 2016
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column kaligia.privileges.description
	 * @param description  the value for kaligia.privileges.description
	 * @mbggenerated  Mon Mar 28 12:28:14 EDT 2016
	 */
	public void setDescription(String description) {
		this.description = description == null ? null : description.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.privileges
	 * @mbggenerated  Mon Mar 28 12:28:14 EDT 2016
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", privId=").append(privId);
		sb.append(", name=").append(name);
		sb.append(", description=").append(description);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}