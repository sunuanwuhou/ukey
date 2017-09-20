package com.itrus.ukey.db;

import java.util.Date;

public class Product {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product.id
	 * @mbggenerated
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product.create_time
	 * @mbggenerated
	 */
	private Date createTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product.idx
	 * @mbggenerated
	 */
	private Integer idx;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product.info
	 * @mbggenerated
	 */
	private String info;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product.name
	 * @mbggenerated
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product.type
	 * @mbggenerated
	 */
	private String type;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product.id
	 * @return  the value of product.id
	 * @mbggenerated
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product.id
	 * @param id  the value for product.id
	 * @mbggenerated
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product.create_time
	 * @return  the value of product.create_time
	 * @mbggenerated
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product.create_time
	 * @param createTime  the value for product.create_time
	 * @mbggenerated
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product.idx
	 * @return  the value of product.idx
	 * @mbggenerated
	 */
	public Integer getIdx() {
		return idx;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product.idx
	 * @param idx  the value for product.idx
	 * @mbggenerated
	 */
	public void setIdx(Integer idx) {
		this.idx = idx;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product.info
	 * @return  the value of product.info
	 * @mbggenerated
	 */
	public String getInfo() {
		return info;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product.info
	 * @param info  the value for product.info
	 * @mbggenerated
	 */
	public void setInfo(String info) {
		this.info = info;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product.name
	 * @return  the value of product.name
	 * @mbggenerated
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product.name
	 * @param name  the value for product.name
	 * @mbggenerated
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product.type
	 * @return  the value of product.type
	 * @mbggenerated
	 */
	public String getType() {
		return type;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product.type
	 * @param type  the value for product.type
	 * @mbggenerated
	 */
	public void setType(String type) {
		this.type = type;
	}
}