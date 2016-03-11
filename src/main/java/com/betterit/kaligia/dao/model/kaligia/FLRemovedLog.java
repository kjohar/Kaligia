package com.betterit.kaligia.dao.model.kaligia;

import java.io.Serializable;

public class FLRemovedLog implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column kaligia.flremovedlog.run_segment_id
     *
     * @mbggenerated Thu Mar 10 20:02:18 EST 2016
     */
    private Integer runSegmentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column kaligia.flremovedlog.r_index
     *
     * @mbggenerated Thu Mar 10 20:02:18 EST 2016
     */
    private Integer rIndex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column kaligia.flremovedlog.wavelength
     *
     * @mbggenerated Thu Mar 10 20:02:18 EST 2016
     */
    private Double wavelength;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column kaligia.flremovedlog.photon_count
     *
     * @mbggenerated Thu Mar 10 20:02:18 EST 2016
     */
    private Double photonCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table kaligia.flremovedlog
     *
     * @mbggenerated Thu Mar 10 20:02:18 EST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column kaligia.flremovedlog.run_segment_id
     *
     * @return the value of kaligia.flremovedlog.run_segment_id
     *
     * @mbggenerated Thu Mar 10 20:02:18 EST 2016
     */
    public Integer getRunSegmentId() {
        return runSegmentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column kaligia.flremovedlog.run_segment_id
     *
     * @param runSegmentId the value for kaligia.flremovedlog.run_segment_id
     *
     * @mbggenerated Thu Mar 10 20:02:18 EST 2016
     */
    public void setRunSegmentId(Integer runSegmentId) {
        this.runSegmentId = runSegmentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column kaligia.flremovedlog.r_index
     *
     * @return the value of kaligia.flremovedlog.r_index
     *
     * @mbggenerated Thu Mar 10 20:02:18 EST 2016
     */
    public Integer getrIndex() {
        return rIndex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column kaligia.flremovedlog.r_index
     *
     * @param rIndex the value for kaligia.flremovedlog.r_index
     *
     * @mbggenerated Thu Mar 10 20:02:18 EST 2016
     */
    public void setrIndex(Integer rIndex) {
        this.rIndex = rIndex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column kaligia.flremovedlog.wavelength
     *
     * @return the value of kaligia.flremovedlog.wavelength
     *
     * @mbggenerated Thu Mar 10 20:02:18 EST 2016
     */
    public Double getWavelength() {
        return wavelength;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column kaligia.flremovedlog.wavelength
     *
     * @param wavelength the value for kaligia.flremovedlog.wavelength
     *
     * @mbggenerated Thu Mar 10 20:02:18 EST 2016
     */
    public void setWavelength(Double wavelength) {
        this.wavelength = wavelength;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column kaligia.flremovedlog.photon_count
     *
     * @return the value of kaligia.flremovedlog.photon_count
     *
     * @mbggenerated Thu Mar 10 20:02:18 EST 2016
     */
    public Double getPhotonCount() {
        return photonCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column kaligia.flremovedlog.photon_count
     *
     * @param photonCount the value for kaligia.flremovedlog.photon_count
     *
     * @mbggenerated Thu Mar 10 20:02:18 EST 2016
     */
    public void setPhotonCount(Double photonCount) {
        this.photonCount = photonCount;
    }
}