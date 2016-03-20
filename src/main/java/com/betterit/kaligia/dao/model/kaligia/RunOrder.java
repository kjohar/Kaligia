package com.betterit.kaligia.dao.model.kaligia;

import java.io.Serializable;
import java.util.Date;

public class RunOrder implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column kaligia.runorder.run_id
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	private Integer runId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column kaligia.runorder.order_id
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	private Integer orderId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column kaligia.runorder.type
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	private String type;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column kaligia.runorder.procedure_id
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	private Integer procedureId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column kaligia.runorder.specimen_id
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	private Integer specimenId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column kaligia.runorder.site_id
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	private Integer siteId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column kaligia.runorder.end_point_id
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	private Integer endPointId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column kaligia.runorder.status
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	private String status;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column kaligia.runorder.start_time
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	private Date startTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column kaligia.runorder.end_time
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	private Date endTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column kaligia.runorder.created_date
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	private Date createdDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column kaligia.runorder.created_by
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	private Integer createdBy;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column kaligia.runorder.run_notes
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	private String runNotes;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column kaligia.runorder.result_notes
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	private String resultNotes;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table kaligia.runorder
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column kaligia.runorder.run_id
	 * @return  the value of kaligia.runorder.run_id
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	public Integer getRunId() {
		return runId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column kaligia.runorder.run_id
	 * @param runId  the value for kaligia.runorder.run_id
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	public void setRunId(Integer runId) {
		this.runId = runId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column kaligia.runorder.order_id
	 * @return  the value of kaligia.runorder.order_id
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	public Integer getOrderId() {
		return orderId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column kaligia.runorder.order_id
	 * @param orderId  the value for kaligia.runorder.order_id
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column kaligia.runorder.type
	 * @return  the value of kaligia.runorder.type
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	public String getType() {
		return type;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column kaligia.runorder.type
	 * @param type  the value for kaligia.runorder.type
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	public void setType(String type) {
		this.type = type == null ? null : type.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column kaligia.runorder.procedure_id
	 * @return  the value of kaligia.runorder.procedure_id
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	public Integer getProcedureId() {
		return procedureId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column kaligia.runorder.procedure_id
	 * @param procedureId  the value for kaligia.runorder.procedure_id
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	public void setProcedureId(Integer procedureId) {
		this.procedureId = procedureId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column kaligia.runorder.specimen_id
	 * @return  the value of kaligia.runorder.specimen_id
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	public Integer getSpecimenId() {
		return specimenId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column kaligia.runorder.specimen_id
	 * @param specimenId  the value for kaligia.runorder.specimen_id
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	public void setSpecimenId(Integer specimenId) {
		this.specimenId = specimenId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column kaligia.runorder.site_id
	 * @return  the value of kaligia.runorder.site_id
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	public Integer getSiteId() {
		return siteId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column kaligia.runorder.site_id
	 * @param siteId  the value for kaligia.runorder.site_id
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	public void setSiteId(Integer siteId) {
		this.siteId = siteId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column kaligia.runorder.end_point_id
	 * @return  the value of kaligia.runorder.end_point_id
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	public Integer getEndPointId() {
		return endPointId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column kaligia.runorder.end_point_id
	 * @param endPointId  the value for kaligia.runorder.end_point_id
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	public void setEndPointId(Integer endPointId) {
		this.endPointId = endPointId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column kaligia.runorder.status
	 * @return  the value of kaligia.runorder.status
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column kaligia.runorder.status
	 * @param status  the value for kaligia.runorder.status
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	public void setStatus(String status) {
		this.status = status == null ? null : status.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column kaligia.runorder.start_time
	 * @return  the value of kaligia.runorder.start_time
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	public Date getStartTime() {
		return startTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column kaligia.runorder.start_time
	 * @param startTime  the value for kaligia.runorder.start_time
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column kaligia.runorder.end_time
	 * @return  the value of kaligia.runorder.end_time
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	public Date getEndTime() {
		return endTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column kaligia.runorder.end_time
	 * @param endTime  the value for kaligia.runorder.end_time
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column kaligia.runorder.created_date
	 * @return  the value of kaligia.runorder.created_date
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column kaligia.runorder.created_date
	 * @param createdDate  the value for kaligia.runorder.created_date
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column kaligia.runorder.created_by
	 * @return  the value of kaligia.runorder.created_by
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	public Integer getCreatedBy() {
		return createdBy;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column kaligia.runorder.created_by
	 * @param createdBy  the value for kaligia.runorder.created_by
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column kaligia.runorder.run_notes
	 * @return  the value of kaligia.runorder.run_notes
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	public String getRunNotes() {
		return runNotes;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column kaligia.runorder.run_notes
	 * @param runNotes  the value for kaligia.runorder.run_notes
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	public void setRunNotes(String runNotes) {
		this.runNotes = runNotes == null ? null : runNotes.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column kaligia.runorder.result_notes
	 * @return  the value of kaligia.runorder.result_notes
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	public String getResultNotes() {
		return resultNotes;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column kaligia.runorder.result_notes
	 * @param resultNotes  the value for kaligia.runorder.result_notes
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	public void setResultNotes(String resultNotes) {
		this.resultNotes = resultNotes == null ? null : resultNotes.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.runorder
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", runId=").append(runId);
		sb.append(", orderId=").append(orderId);
		sb.append(", type=").append(type);
		sb.append(", procedureId=").append(procedureId);
		sb.append(", specimenId=").append(specimenId);
		sb.append(", siteId=").append(siteId);
		sb.append(", endPointId=").append(endPointId);
		sb.append(", status=").append(status);
		sb.append(", startTime=").append(startTime);
		sb.append(", endTime=").append(endTime);
		sb.append(", createdDate=").append(createdDate);
		sb.append(", createdBy=").append(createdBy);
		sb.append(", runNotes=").append(runNotes);
		sb.append(", resultNotes=").append(resultNotes);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}