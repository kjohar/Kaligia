package com.betterit.kaligia.dao.model.kaligia;

import java.io.Serializable;
import java.util.Date;

public class Site implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column kaligia.site.site_id
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	private Integer siteId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column kaligia.site.name
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column kaligia.site.type
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	private String type;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column kaligia.site.address
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	private String address;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column kaligia.site.city
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	private String city;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column kaligia.site.state
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	private String state;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column kaligia.site.country
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	private String country;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column kaligia.site.zip
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	private String zip;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column kaligia.site.contact
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	private String contact;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column kaligia.site.phone
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	private String phone;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column kaligia.site.creation_date
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	private Date creationDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column kaligia.site.created_by
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	private Integer createdBy;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table kaligia.site
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column kaligia.site.site_id
	 * @return  the value of kaligia.site.site_id
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	public Integer getSiteId() {
		return siteId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column kaligia.site.site_id
	 * @param siteId  the value for kaligia.site.site_id
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	public void setSiteId(Integer siteId) {
		this.siteId = siteId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column kaligia.site.name
	 * @return  the value of kaligia.site.name
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column kaligia.site.name
	 * @param name  the value for kaligia.site.name
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column kaligia.site.type
	 * @return  the value of kaligia.site.type
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	public String getType() {
		return type;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column kaligia.site.type
	 * @param type  the value for kaligia.site.type
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	public void setType(String type) {
		this.type = type == null ? null : type.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column kaligia.site.address
	 * @return  the value of kaligia.site.address
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column kaligia.site.address
	 * @param address  the value for kaligia.site.address
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	public void setAddress(String address) {
		this.address = address == null ? null : address.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column kaligia.site.city
	 * @return  the value of kaligia.site.city
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	public String getCity() {
		return city;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column kaligia.site.city
	 * @param city  the value for kaligia.site.city
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	public void setCity(String city) {
		this.city = city == null ? null : city.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column kaligia.site.state
	 * @return  the value of kaligia.site.state
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	public String getState() {
		return state;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column kaligia.site.state
	 * @param state  the value for kaligia.site.state
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	public void setState(String state) {
		this.state = state == null ? null : state.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column kaligia.site.country
	 * @return  the value of kaligia.site.country
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column kaligia.site.country
	 * @param country  the value for kaligia.site.country
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	public void setCountry(String country) {
		this.country = country == null ? null : country.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column kaligia.site.zip
	 * @return  the value of kaligia.site.zip
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	public String getZip() {
		return zip;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column kaligia.site.zip
	 * @param zip  the value for kaligia.site.zip
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	public void setZip(String zip) {
		this.zip = zip == null ? null : zip.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column kaligia.site.contact
	 * @return  the value of kaligia.site.contact
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	public String getContact() {
		return contact;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column kaligia.site.contact
	 * @param contact  the value for kaligia.site.contact
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	public void setContact(String contact) {
		this.contact = contact == null ? null : contact.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column kaligia.site.phone
	 * @return  the value of kaligia.site.phone
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column kaligia.site.phone
	 * @param phone  the value for kaligia.site.phone
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	public void setPhone(String phone) {
		this.phone = phone == null ? null : phone.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column kaligia.site.creation_date
	 * @return  the value of kaligia.site.creation_date
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	public Date getCreationDate() {
		return creationDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column kaligia.site.creation_date
	 * @param creationDate  the value for kaligia.site.creation_date
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column kaligia.site.created_by
	 * @return  the value of kaligia.site.created_by
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	public Integer getCreatedBy() {
		return createdBy;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column kaligia.site.created_by
	 * @param createdBy  the value for kaligia.site.created_by
	 * @mbggenerated  Thu Mar 10 20:02:18 EST 2016
	 */
	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}
}