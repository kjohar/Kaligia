package com.betterit.kaligia.dao.model.kaligia;

import java.io.Serializable;
import java.util.Date;

public class Specimen implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column kaligia.specimen.specimen_id
	 * @mbggenerated  Tue Feb 23 15:44:22 EST 2016
	 */
	private Integer specimenId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column kaligia.specimen.subject_id
	 * @mbggenerated  Tue Feb 23 15:44:22 EST 2016
	 */
	private Integer subjectId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column kaligia.specimen.name
	 * @mbggenerated  Tue Feb 23 15:44:22 EST 2016
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column kaligia.specimen.type
	 * @mbggenerated  Tue Feb 23 15:44:22 EST 2016
	 */
	private String type;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column kaligia.specimen.creation_date
	 * @mbggenerated  Tue Feb 23 15:44:22 EST 2016
	 */
	private Date creationDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column kaligia.specimen.created_by
	 * @mbggenerated  Tue Feb 23 15:44:22 EST 2016
	 */
	private Integer createdBy;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table kaligia.specimen
	 * @mbggenerated  Tue Feb 23 15:44:22 EST 2016
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column kaligia.specimen.specimen_id
	 * @return  the value of kaligia.specimen.specimen_id
	 * @mbggenerated  Tue Feb 23 15:44:22 EST 2016
	 */
	public Integer getSpecimenId() {
		return specimenId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column kaligia.specimen.specimen_id
	 * @param specimenId  the value for kaligia.specimen.specimen_id
	 * @mbggenerated  Tue Feb 23 15:44:22 EST 2016
	 */
	public void setSpecimenId(Integer specimenId) {
		this.specimenId = specimenId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column kaligia.specimen.subject_id
	 * @return  the value of kaligia.specimen.subject_id
	 * @mbggenerated  Tue Feb 23 15:44:22 EST 2016
	 */
	public Integer getSubjectId() {
		return subjectId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column kaligia.specimen.subject_id
	 * @param subjectId  the value for kaligia.specimen.subject_id
	 * @mbggenerated  Tue Feb 23 15:44:22 EST 2016
	 */
	public void setSubjectId(Integer subjectId) {
		this.subjectId = subjectId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column kaligia.specimen.name
	 * @return  the value of kaligia.specimen.name
	 * @mbggenerated  Tue Feb 23 15:44:22 EST 2016
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column kaligia.specimen.name
	 * @param name  the value for kaligia.specimen.name
	 * @mbggenerated  Tue Feb 23 15:44:22 EST 2016
	 */
	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column kaligia.specimen.type
	 * @return  the value of kaligia.specimen.type
	 * @mbggenerated  Tue Feb 23 15:44:22 EST 2016
	 */
	public String getType() {
		return type;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column kaligia.specimen.type
	 * @param type  the value for kaligia.specimen.type
	 * @mbggenerated  Tue Feb 23 15:44:22 EST 2016
	 */
	public void setType(String type) {
		this.type = type == null ? null : type.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column kaligia.specimen.creation_date
	 * @return  the value of kaligia.specimen.creation_date
	 * @mbggenerated  Tue Feb 23 15:44:22 EST 2016
	 */
	public Date getCreationDate() {
		return creationDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column kaligia.specimen.creation_date
	 * @param creationDate  the value for kaligia.specimen.creation_date
	 * @mbggenerated  Tue Feb 23 15:44:22 EST 2016
	 */
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column kaligia.specimen.created_by
	 * @return  the value of kaligia.specimen.created_by
	 * @mbggenerated  Tue Feb 23 15:44:22 EST 2016
	 */
	public Integer getCreatedBy() {
		return createdBy;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column kaligia.specimen.created_by
	 * @param createdBy  the value for kaligia.specimen.created_by
	 * @mbggenerated  Tue Feb 23 15:44:22 EST 2016
	 */
	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}
}