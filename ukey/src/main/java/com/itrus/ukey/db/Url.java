package com.itrus.ukey.db;

import java.util.Date;

public class Url {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column url.id
	 * @mbggenerated
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column url.modify_time
	 * @mbggenerated
	 */
	private Date modifyTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column url.type
	 * @mbggenerated
	 */
	private String type;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column url.url
	 * @mbggenerated
	 */
	private String url;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column url.platform
	 * @mbggenerated
	 */
	private Long platform;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column url.url_data_file
	 * @mbggenerated
	 */
	private String urlDataFile;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column url.url_data
	 * @mbggenerated
	 */
	private byte[] urlData;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column url.id
	 * @return  the value of url.id
	 * @mbggenerated
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column url.id
	 * @param id  the value for url.id
	 * @mbggenerated
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column url.modify_time
	 * @return  the value of url.modify_time
	 * @mbggenerated
	 */
	public Date getModifyTime() {
		return modifyTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column url.modify_time
	 * @param modifyTime  the value for url.modify_time
	 * @mbggenerated
	 */
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column url.type
	 * @return  the value of url.type
	 * @mbggenerated
	 */
	public String getType() {
		return type;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column url.type
	 * @param type  the value for url.type
	 * @mbggenerated
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column url.url
	 * @return  the value of url.url
	 * @mbggenerated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column url.url
	 * @param url  the value for url.url
	 * @mbggenerated
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column url.platform
	 * @return  the value of url.platform
	 * @mbggenerated
	 */
	public Long getPlatform() {
		return platform;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column url.platform
	 * @param platform  the value for url.platform
	 * @mbggenerated
	 */
	public void setPlatform(Long platform) {
		this.platform = platform;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column url.url_data_file
	 * @return  the value of url.url_data_file
	 * @mbggenerated
	 */
	public String getUrlDataFile() {
		return urlDataFile;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column url.url_data_file
	 * @param urlDataFile  the value for url.url_data_file
	 * @mbggenerated
	 */
	public void setUrlDataFile(String urlDataFile) {
		this.urlDataFile = urlDataFile;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column url.url_data
	 * @return  the value of url.url_data
	 * @mbggenerated
	 */
	public byte[] getUrlData() {
		return urlData;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column url.url_data
	 * @param urlData  the value for url.url_data
	 * @mbggenerated
	 */
	public void setUrlData(byte[] urlData) {
		this.urlData = urlData;
	}
}