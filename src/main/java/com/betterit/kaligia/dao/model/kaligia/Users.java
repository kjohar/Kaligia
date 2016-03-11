package com.betterit.kaligia.dao.model.kaligia;

import java.io.Serializable;
import java.util.Date;

public class Users implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column kaligia.users.user_id
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	private Integer userId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column kaligia.users.login_id
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	private String loginId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column kaligia.users.firstname
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	private String firstname;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column kaligia.users.lastname
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	private String lastname;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column kaligia.users.passwd
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	private String passwd;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column kaligia.users.status
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	private String status;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column kaligia.users.type
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	private String type;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column kaligia.users.role_id
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	private Integer roleId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column kaligia.users.email
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	private String email;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column kaligia.users.phone
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	private String phone;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column kaligia.users.supervisor
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	private String supervisor;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column kaligia.users.start_date
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	private Date startDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column kaligia.users.end_date
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	private Date endDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table kaligia.users
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column kaligia.users.user_id
	 * @return  the value of kaligia.users.user_id
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column kaligia.users.user_id
	 * @param userId  the value for kaligia.users.user_id
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column kaligia.users.login_id
	 * @return  the value of kaligia.users.login_id
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	public String getLoginId() {
		return loginId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column kaligia.users.login_id
	 * @param loginId  the value for kaligia.users.login_id
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	public void setLoginId(String loginId) {
		this.loginId = loginId == null ? null : loginId.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column kaligia.users.firstname
	 * @return  the value of kaligia.users.firstname
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column kaligia.users.firstname
	 * @param firstname  the value for kaligia.users.firstname
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname == null ? null : firstname.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column kaligia.users.lastname
	 * @return  the value of kaligia.users.lastname
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column kaligia.users.lastname
	 * @param lastname  the value for kaligia.users.lastname
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname == null ? null : lastname.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column kaligia.users.passwd
	 * @return  the value of kaligia.users.passwd
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	public String getPasswd() {
		return passwd;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column kaligia.users.passwd
	 * @param passwd  the value for kaligia.users.passwd
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	public void setPasswd(String passwd) {
		this.passwd = passwd == null ? null : passwd.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column kaligia.users.status
	 * @return  the value of kaligia.users.status
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column kaligia.users.status
	 * @param status  the value for kaligia.users.status
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	public void setStatus(String status) {
		this.status = status == null ? null : status.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column kaligia.users.type
	 * @return  the value of kaligia.users.type
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	public String getType() {
		return type;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column kaligia.users.type
	 * @param type  the value for kaligia.users.type
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	public void setType(String type) {
		this.type = type == null ? null : type.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column kaligia.users.role_id
	 * @return  the value of kaligia.users.role_id
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	public Integer getRoleId() {
		return roleId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column kaligia.users.role_id
	 * @param roleId  the value for kaligia.users.role_id
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column kaligia.users.email
	 * @return  the value of kaligia.users.email
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column kaligia.users.email
	 * @param email  the value for kaligia.users.email
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	public void setEmail(String email) {
		this.email = email == null ? null : email.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column kaligia.users.phone
	 * @return  the value of kaligia.users.phone
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column kaligia.users.phone
	 * @param phone  the value for kaligia.users.phone
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	public void setPhone(String phone) {
		this.phone = phone == null ? null : phone.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column kaligia.users.supervisor
	 * @return  the value of kaligia.users.supervisor
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	public String getSupervisor() {
		return supervisor;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column kaligia.users.supervisor
	 * @param supervisor  the value for kaligia.users.supervisor
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	public void setSupervisor(String supervisor) {
		this.supervisor = supervisor == null ? null : supervisor.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column kaligia.users.start_date
	 * @return  the value of kaligia.users.start_date
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column kaligia.users.start_date
	 * @param startDate  the value for kaligia.users.start_date
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column kaligia.users.end_date
	 * @return  the value of kaligia.users.end_date
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column kaligia.users.end_date
	 * @param endDate  the value for kaligia.users.end_date
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
}