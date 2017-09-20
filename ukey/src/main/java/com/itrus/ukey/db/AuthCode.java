package com.itrus.ukey.db;

import java.util.Date;

public class AuthCode {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column auth_code.id
	 * @mbggenerated
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column auth_code.status
	 * @mbggenerated
	 */
	private String status;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column auth_code.auth_code
	 * @mbggenerated
	 */
	private String authCode;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column auth_code.consume_time
	 * @mbggenerated
	 */
	private Date consumeTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column auth_code.device_sn
	 * @mbggenerated
	 */
	private String deviceSn;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column auth_code.overdue_time
	 * @mbggenerated
	 */
	private Date overdueTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column auth_code.start_time
	 * @mbggenerated
	 */
	private Date startTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column auth_code.itrus_user
	 * @mbggenerated
	 */
	private Long itrusUser;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column auth_code.id
	 * @return  the value of auth_code.id
	 * @mbggenerated
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column auth_code.id
	 * @param id  the value for auth_code.id
	 * @mbggenerated
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column auth_code.status
	 * @return  the value of auth_code.status
	 * @mbggenerated
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column auth_code.status
	 * @param status  the value for auth_code.status
	 * @mbggenerated
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column auth_code.auth_code
	 * @return  the value of auth_code.auth_code
	 * @mbggenerated
	 */
	public String getAuthCode() {
		return authCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column auth_code.auth_code
	 * @param authCode  the value for auth_code.auth_code
	 * @mbggenerated
	 */
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column auth_code.consume_time
	 * @return  the value of auth_code.consume_time
	 * @mbggenerated
	 */
	public Date getConsumeTime() {
		return consumeTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column auth_code.consume_time
	 * @param consumeTime  the value for auth_code.consume_time
	 * @mbggenerated
	 */
	public void setConsumeTime(Date consumeTime) {
		this.consumeTime = consumeTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column auth_code.device_sn
	 * @return  the value of auth_code.device_sn
	 * @mbggenerated
	 */
	public String getDeviceSn() {
		return deviceSn;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column auth_code.device_sn
	 * @param deviceSn  the value for auth_code.device_sn
	 * @mbggenerated
	 */
	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column auth_code.overdue_time
	 * @return  the value of auth_code.overdue_time
	 * @mbggenerated
	 */
	public Date getOverdueTime() {
		return overdueTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column auth_code.overdue_time
	 * @param overdueTime  the value for auth_code.overdue_time
	 * @mbggenerated
	 */
	public void setOverdueTime(Date overdueTime) {
		this.overdueTime = overdueTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column auth_code.start_time
	 * @return  the value of auth_code.start_time
	 * @mbggenerated
	 */
	public Date getStartTime() {
		return startTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column auth_code.start_time
	 * @param startTime  the value for auth_code.start_time
	 * @mbggenerated
	 */
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column auth_code.itrus_user
	 * @return  the value of auth_code.itrus_user
	 * @mbggenerated
	 */
	public Long getItrusUser() {
		return itrusUser;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column auth_code.itrus_user
	 * @param itrusUser  the value for auth_code.itrus_user
	 * @mbggenerated
	 */
	public void setItrusUser(Long itrusUser) {
		this.itrusUser = itrusUser;
	}
}