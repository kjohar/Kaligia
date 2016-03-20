package com.betterit.kaligia.dao.model.kaligia;

import java.io.Serializable;

public class FLRemovedLog implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column kaligia.flremovedlog.run_segment_id
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	private Integer runSegmentId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column kaligia.flremovedlog.r_index
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	private Integer rIndex;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column kaligia.flremovedlog.wavelength
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	private Double wavelength;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column kaligia.flremovedlog.photon_count
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	private Double photonCount;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table kaligia.flremovedlog
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column kaligia.flremovedlog.run_segment_id
	 * @return  the value of kaligia.flremovedlog.run_segment_id
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	public Integer getRunSegmentId() {
		return runSegmentId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column kaligia.flremovedlog.run_segment_id
	 * @param runSegmentId  the value for kaligia.flremovedlog.run_segment_id
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	public void setRunSegmentId(Integer runSegmentId) {
		this.runSegmentId = runSegmentId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column kaligia.flremovedlog.r_index
	 * @return  the value of kaligia.flremovedlog.r_index
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	public Integer getrIndex() {
		return rIndex;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column kaligia.flremovedlog.r_index
	 * @param rIndex  the value for kaligia.flremovedlog.r_index
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	public void setrIndex(Integer rIndex) {
		this.rIndex = rIndex;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column kaligia.flremovedlog.wavelength
	 * @return  the value of kaligia.flremovedlog.wavelength
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	public Double getWavelength() {
		return wavelength;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column kaligia.flremovedlog.wavelength
	 * @param wavelength  the value for kaligia.flremovedlog.wavelength
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	public void setWavelength(Double wavelength) {
		this.wavelength = wavelength;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column kaligia.flremovedlog.photon_count
	 * @return  the value of kaligia.flremovedlog.photon_count
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	public Double getPhotonCount() {
		return photonCount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column kaligia.flremovedlog.photon_count
	 * @param photonCount  the value for kaligia.flremovedlog.photon_count
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	public void setPhotonCount(Double photonCount) {
		this.photonCount = photonCount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.flremovedlog
	 * @mbggenerated  Sun Mar 20 15:53:29 EDT 2016
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", runSegmentId=").append(runSegmentId);
		sb.append(", rIndex=").append(rIndex);
		sb.append(", wavelength=").append(wavelength);
		sb.append(", photonCount=").append(photonCount);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}