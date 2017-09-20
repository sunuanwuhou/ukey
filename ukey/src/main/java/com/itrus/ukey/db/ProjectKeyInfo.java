package com.itrus.ukey.db;

import java.util.Date;

public class ProjectKeyInfo {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column project_key_info.id
	 * @mbggenerated
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column project_key_info.create_time
	 * @mbggenerated
	 */
	private Date createTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column project_key_info.sn1
	 * @mbggenerated
	 */
	private String sn1;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column project_key_info.sn2
	 * @mbggenerated
	 */
	private String sn2;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column project_key_info.project
	 * @mbggenerated
	 */
	private Long project;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column project_key_info.admin_pin_type
	 * @mbggenerated
	 */
	private String adminPinType;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column project_key_info.admin_pin_value
	 * @mbggenerated
	 */
	private String adminPinValue;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column project_key_info.id
	 * @return  the value of project_key_info.id
	 * @mbggenerated
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column project_key_info.id
	 * @param id  the value for project_key_info.id
	 * @mbggenerated
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column project_key_info.create_time
	 * @return  the value of project_key_info.create_time
	 * @mbggenerated
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column project_key_info.create_time
	 * @param createTime  the value for project_key_info.create_time
	 * @mbggenerated
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column project_key_info.sn1
	 * @return  the value of project_key_info.sn1
	 * @mbggenerated
	 */
	public String getSn1() {
		return sn1;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column project_key_info.sn1
	 * @param sn1  the value for project_key_info.sn1
	 * @mbggenerated
	 */
	public void setSn1(String sn1) {
		this.sn1 = sn1;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column project_key_info.sn2
	 * @return  the value of project_key_info.sn2
	 * @mbggenerated
	 */
	public String getSn2() {
		return sn2;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column project_key_info.sn2
	 * @param sn2  the value for project_key_info.sn2
	 * @mbggenerated
	 */
	public void setSn2(String sn2) {
		this.sn2 = sn2;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column project_key_info.project
	 * @return  the value of project_key_info.project
	 * @mbggenerated
	 */
	public Long getProject() {
		return project;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column project_key_info.project
	 * @param project  the value for project_key_info.project
	 * @mbggenerated
	 */
	public void setProject(Long project) {
		this.project = project;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column project_key_info.admin_pin_type
	 * @return  the value of project_key_info.admin_pin_type
	 * @mbggenerated
	 */
	public String getAdminPinType() {
		return adminPinType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column project_key_info.admin_pin_type
	 * @param adminPinType  the value for project_key_info.admin_pin_type
	 * @mbggenerated
	 */
	public void setAdminPinType(String adminPinType) {
		this.adminPinType = adminPinType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column project_key_info.admin_pin_value
	 * @return  the value of project_key_info.admin_pin_value
	 * @mbggenerated
	 */
	public String getAdminPinValue() {
		return adminPinValue;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column project_key_info.admin_pin_value
	 * @param adminPinValue  the value for project_key_info.admin_pin_value
	 * @mbggenerated
	 */
	public void setAdminPinValue(String adminPinValue) {
		this.adminPinValue = adminPinValue;
	}
}