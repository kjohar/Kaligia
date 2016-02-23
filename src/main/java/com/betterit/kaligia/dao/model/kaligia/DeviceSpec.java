package com.betterit.kaligia.dao.model.kaligia;

import java.io.Serializable;

public class DeviceSpec implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column kaligia.devicespec.device_id
	 * @mbggenerated  Tue Feb 23 15:44:22 EST 2016
	 */
	private Integer deviceId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column kaligia.devicespec.name
	 * @mbggenerated  Tue Feb 23 15:44:22 EST 2016
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column kaligia.devicespec.value
	 * @mbggenerated  Tue Feb 23 15:44:22 EST 2016
	 */
	private String value;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column kaligia.devicespec.min_value
	 * @mbggenerated  Tue Feb 23 15:44:22 EST 2016
	 */
	private String minValue;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column kaligia.devicespec.max_value
	 * @mbggenerated  Tue Feb 23 15:44:22 EST 2016
	 */
	private String maxValue;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column kaligia.devicespec.unit
	 * @mbggenerated  Tue Feb 23 15:44:22 EST 2016
	 */
	private String unit;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column kaligia.devicespec.tunable
	 * @mbggenerated  Tue Feb 23 15:44:22 EST 2016
	 */
	private String tunable;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table kaligia.devicespec
	 * @mbggenerated  Tue Feb 23 15:44:22 EST 2016
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column kaligia.devicespec.device_id
	 * @return  the value of kaligia.devicespec.device_id
	 * @mbggenerated  Tue Feb 23 15:44:22 EST 2016
	 */
	public Integer getDeviceId() {
		return deviceId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column kaligia.devicespec.device_id
	 * @param deviceId  the value for kaligia.devicespec.device_id
	 * @mbggenerated  Tue Feb 23 15:44:22 EST 2016
	 */
	public void setDeviceId(Integer deviceId) {
		this.deviceId = deviceId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column kaligia.devicespec.name
	 * @return  the value of kaligia.devicespec.name
	 * @mbggenerated  Tue Feb 23 15:44:22 EST 2016
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column kaligia.devicespec.name
	 * @param name  the value for kaligia.devicespec.name
	 * @mbggenerated  Tue Feb 23 15:44:22 EST 2016
	 */
	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column kaligia.devicespec.value
	 * @return  the value of kaligia.devicespec.value
	 * @mbggenerated  Tue Feb 23 15:44:22 EST 2016
	 */
	public String getValue() {
		return value;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column kaligia.devicespec.value
	 * @param value  the value for kaligia.devicespec.value
	 * @mbggenerated  Tue Feb 23 15:44:22 EST 2016
	 */
	public void setValue(String value) {
		this.value = value == null ? null : value.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column kaligia.devicespec.min_value
	 * @return  the value of kaligia.devicespec.min_value
	 * @mbggenerated  Tue Feb 23 15:44:22 EST 2016
	 */
	public String getMinValue() {
		return minValue;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column kaligia.devicespec.min_value
	 * @param minValue  the value for kaligia.devicespec.min_value
	 * @mbggenerated  Tue Feb 23 15:44:22 EST 2016
	 */
	public void setMinValue(String minValue) {
		this.minValue = minValue == null ? null : minValue.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column kaligia.devicespec.max_value
	 * @return  the value of kaligia.devicespec.max_value
	 * @mbggenerated  Tue Feb 23 15:44:22 EST 2016
	 */
	public String getMaxValue() {
		return maxValue;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column kaligia.devicespec.max_value
	 * @param maxValue  the value for kaligia.devicespec.max_value
	 * @mbggenerated  Tue Feb 23 15:44:22 EST 2016
	 */
	public void setMaxValue(String maxValue) {
		this.maxValue = maxValue == null ? null : maxValue.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column kaligia.devicespec.unit
	 * @return  the value of kaligia.devicespec.unit
	 * @mbggenerated  Tue Feb 23 15:44:22 EST 2016
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column kaligia.devicespec.unit
	 * @param unit  the value for kaligia.devicespec.unit
	 * @mbggenerated  Tue Feb 23 15:44:22 EST 2016
	 */
	public void setUnit(String unit) {
		this.unit = unit == null ? null : unit.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column kaligia.devicespec.tunable
	 * @return  the value of kaligia.devicespec.tunable
	 * @mbggenerated  Tue Feb 23 15:44:22 EST 2016
	 */
	public String getTunable() {
		return tunable;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column kaligia.devicespec.tunable
	 * @param tunable  the value for kaligia.devicespec.tunable
	 * @mbggenerated  Tue Feb 23 15:44:22 EST 2016
	 */
	public void setTunable(String tunable) {
		this.tunable = tunable == null ? null : tunable.trim();
	}
}