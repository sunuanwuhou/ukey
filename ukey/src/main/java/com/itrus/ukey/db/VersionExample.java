package com.itrus.ukey.db;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VersionExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table version
	 * @mbggenerated
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table version
	 * @mbggenerated
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table version
	 * @mbggenerated
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table version
	 * @mbggenerated
	 */
	public VersionExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table version
	 * @mbggenerated
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table version
	 * @mbggenerated
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table version
	 * @mbggenerated
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table version
	 * @mbggenerated
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table version
	 * @mbggenerated
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table version
	 * @mbggenerated
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table version
	 * @mbggenerated
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table version
	 * @mbggenerated
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table version
	 * @mbggenerated
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table version
	 * @mbggenerated
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table version
	 * @mbggenerated
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andIdIsNull() {
			addCriterion("id is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("id is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Long value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Long value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Long value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Long value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Long value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Long value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Long> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Long> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Long value1, Long value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Long value1, Long value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIsNull() {
			addCriterion("create_time is null");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIsNotNull() {
			addCriterion("create_time is not null");
			return (Criteria) this;
		}

		public Criteria andCreateTimeEqualTo(Date value) {
			addCriterion("create_time =", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotEqualTo(Date value) {
			addCriterion("create_time <>", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeGreaterThan(Date value) {
			addCriterion("create_time >", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("create_time >=", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeLessThan(Date value) {
			addCriterion("create_time <", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
			addCriterion("create_time <=", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIn(List<Date> values) {
			addCriterion("create_time in", values, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotIn(List<Date> values) {
			addCriterion("create_time not in", values, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeBetween(Date value1, Date value2) {
			addCriterion("create_time between", value1, value2, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
			addCriterion("create_time not between", value1, value2,
					"createTime");
			return (Criteria) this;
		}

		public Criteria andFileIsNull() {
			addCriterion("file is null");
			return (Criteria) this;
		}

		public Criteria andFileIsNotNull() {
			addCriterion("file is not null");
			return (Criteria) this;
		}

		public Criteria andFileEqualTo(String value) {
			addCriterion("file =", value, "file");
			return (Criteria) this;
		}

		public Criteria andFileNotEqualTo(String value) {
			addCriterion("file <>", value, "file");
			return (Criteria) this;
		}

		public Criteria andFileGreaterThan(String value) {
			addCriterion("file >", value, "file");
			return (Criteria) this;
		}

		public Criteria andFileGreaterThanOrEqualTo(String value) {
			addCriterion("file >=", value, "file");
			return (Criteria) this;
		}

		public Criteria andFileLessThan(String value) {
			addCriterion("file <", value, "file");
			return (Criteria) this;
		}

		public Criteria andFileLessThanOrEqualTo(String value) {
			addCriterion("file <=", value, "file");
			return (Criteria) this;
		}

		public Criteria andFileLike(String value) {
			addCriterion("file like", value, "file");
			return (Criteria) this;
		}

		public Criteria andFileNotLike(String value) {
			addCriterion("file not like", value, "file");
			return (Criteria) this;
		}

		public Criteria andFileIn(List<String> values) {
			addCriterion("file in", values, "file");
			return (Criteria) this;
		}

		public Criteria andFileNotIn(List<String> values) {
			addCriterion("file not in", values, "file");
			return (Criteria) this;
		}

		public Criteria andFileBetween(String value1, String value2) {
			addCriterion("file between", value1, value2, "file");
			return (Criteria) this;
		}

		public Criteria andFileNotBetween(String value1, String value2) {
			addCriterion("file not between", value1, value2, "file");
			return (Criteria) this;
		}

		public Criteria andHashIsNull() {
			addCriterion("hash is null");
			return (Criteria) this;
		}

		public Criteria andHashIsNotNull() {
			addCriterion("hash is not null");
			return (Criteria) this;
		}

		public Criteria andHashEqualTo(String value) {
			addCriterion("hash =", value, "hash");
			return (Criteria) this;
		}

		public Criteria andHashNotEqualTo(String value) {
			addCriterion("hash <>", value, "hash");
			return (Criteria) this;
		}

		public Criteria andHashGreaterThan(String value) {
			addCriterion("hash >", value, "hash");
			return (Criteria) this;
		}

		public Criteria andHashGreaterThanOrEqualTo(String value) {
			addCriterion("hash >=", value, "hash");
			return (Criteria) this;
		}

		public Criteria andHashLessThan(String value) {
			addCriterion("hash <", value, "hash");
			return (Criteria) this;
		}

		public Criteria andHashLessThanOrEqualTo(String value) {
			addCriterion("hash <=", value, "hash");
			return (Criteria) this;
		}

		public Criteria andHashLike(String value) {
			addCriterion("hash like", value, "hash");
			return (Criteria) this;
		}

		public Criteria andHashNotLike(String value) {
			addCriterion("hash not like", value, "hash");
			return (Criteria) this;
		}

		public Criteria andHashIn(List<String> values) {
			addCriterion("hash in", values, "hash");
			return (Criteria) this;
		}

		public Criteria andHashNotIn(List<String> values) {
			addCriterion("hash not in", values, "hash");
			return (Criteria) this;
		}

		public Criteria andHashBetween(String value1, String value2) {
			addCriterion("hash between", value1, value2, "hash");
			return (Criteria) this;
		}

		public Criteria andHashNotBetween(String value1, String value2) {
			addCriterion("hash not between", value1, value2, "hash");
			return (Criteria) this;
		}

		public Criteria andInfoIsNull() {
			addCriterion("info is null");
			return (Criteria) this;
		}

		public Criteria andInfoIsNotNull() {
			addCriterion("info is not null");
			return (Criteria) this;
		}

		public Criteria andInfoEqualTo(String value) {
			addCriterion("info =", value, "info");
			return (Criteria) this;
		}

		public Criteria andInfoNotEqualTo(String value) {
			addCriterion("info <>", value, "info");
			return (Criteria) this;
		}

		public Criteria andInfoGreaterThan(String value) {
			addCriterion("info >", value, "info");
			return (Criteria) this;
		}

		public Criteria andInfoGreaterThanOrEqualTo(String value) {
			addCriterion("info >=", value, "info");
			return (Criteria) this;
		}

		public Criteria andInfoLessThan(String value) {
			addCriterion("info <", value, "info");
			return (Criteria) this;
		}

		public Criteria andInfoLessThanOrEqualTo(String value) {
			addCriterion("info <=", value, "info");
			return (Criteria) this;
		}

		public Criteria andInfoLike(String value) {
			addCriterion("info like", value, "info");
			return (Criteria) this;
		}

		public Criteria andInfoNotLike(String value) {
			addCriterion("info not like", value, "info");
			return (Criteria) this;
		}

		public Criteria andInfoIn(List<String> values) {
			addCriterion("info in", values, "info");
			return (Criteria) this;
		}

		public Criteria andInfoNotIn(List<String> values) {
			addCriterion("info not in", values, "info");
			return (Criteria) this;
		}

		public Criteria andInfoBetween(String value1, String value2) {
			addCriterion("info between", value1, value2, "info");
			return (Criteria) this;
		}

		public Criteria andInfoNotBetween(String value1, String value2) {
			addCriterion("info not between", value1, value2, "info");
			return (Criteria) this;
		}

		public Criteria andProductVersionIsNull() {
			addCriterion("product_version is null");
			return (Criteria) this;
		}

		public Criteria andProductVersionIsNotNull() {
			addCriterion("product_version is not null");
			return (Criteria) this;
		}

		public Criteria andProductVersionEqualTo(String value) {
			addCriterion("product_version =", value, "productVersion");
			return (Criteria) this;
		}

		public Criteria andProductVersionNotEqualTo(String value) {
			addCriterion("product_version <>", value, "productVersion");
			return (Criteria) this;
		}

		public Criteria andProductVersionGreaterThan(String value) {
			addCriterion("product_version >", value, "productVersion");
			return (Criteria) this;
		}

		public Criteria andProductVersionGreaterThanOrEqualTo(String value) {
			addCriterion("product_version >=", value, "productVersion");
			return (Criteria) this;
		}

		public Criteria andProductVersionLessThan(String value) {
			addCriterion("product_version <", value, "productVersion");
			return (Criteria) this;
		}

		public Criteria andProductVersionLessThanOrEqualTo(String value) {
			addCriterion("product_version <=", value, "productVersion");
			return (Criteria) this;
		}

		public Criteria andProductVersionLike(String value) {
			addCriterion("product_version like", value, "productVersion");
			return (Criteria) this;
		}

		public Criteria andProductVersionNotLike(String value) {
			addCriterion("product_version not like", value, "productVersion");
			return (Criteria) this;
		}

		public Criteria andProductVersionIn(List<String> values) {
			addCriterion("product_version in", values, "productVersion");
			return (Criteria) this;
		}

		public Criteria andProductVersionNotIn(List<String> values) {
			addCriterion("product_version not in", values, "productVersion");
			return (Criteria) this;
		}

		public Criteria andProductVersionBetween(String value1, String value2) {
			addCriterion("product_version between", value1, value2,
					"productVersion");
			return (Criteria) this;
		}

		public Criteria andProductVersionNotBetween(String value1, String value2) {
			addCriterion("product_version not between", value1, value2,
					"productVersion");
			return (Criteria) this;
		}

		public Criteria andProductVersionFixIsNull() {
			addCriterion("product_version_fix is null");
			return (Criteria) this;
		}

		public Criteria andProductVersionFixIsNotNull() {
			addCriterion("product_version_fix is not null");
			return (Criteria) this;
		}

		public Criteria andProductVersionFixEqualTo(String value) {
			addCriterion("product_version_fix =", value, "productVersionFix");
			return (Criteria) this;
		}

		public Criteria andProductVersionFixNotEqualTo(String value) {
			addCriterion("product_version_fix <>", value, "productVersionFix");
			return (Criteria) this;
		}

		public Criteria andProductVersionFixGreaterThan(String value) {
			addCriterion("product_version_fix >", value, "productVersionFix");
			return (Criteria) this;
		}

		public Criteria andProductVersionFixGreaterThanOrEqualTo(String value) {
			addCriterion("product_version_fix >=", value, "productVersionFix");
			return (Criteria) this;
		}

		public Criteria andProductVersionFixLessThan(String value) {
			addCriterion("product_version_fix <", value, "productVersionFix");
			return (Criteria) this;
		}

		public Criteria andProductVersionFixLessThanOrEqualTo(String value) {
			addCriterion("product_version_fix <=", value, "productVersionFix");
			return (Criteria) this;
		}

		public Criteria andProductVersionFixLike(String value) {
			addCriterion("product_version_fix like", value, "productVersionFix");
			return (Criteria) this;
		}

		public Criteria andProductVersionFixNotLike(String value) {
			addCriterion("product_version_fix not like", value,
					"productVersionFix");
			return (Criteria) this;
		}

		public Criteria andProductVersionFixIn(List<String> values) {
			addCriterion("product_version_fix in", values, "productVersionFix");
			return (Criteria) this;
		}

		public Criteria andProductVersionFixNotIn(List<String> values) {
			addCriterion("product_version_fix not in", values,
					"productVersionFix");
			return (Criteria) this;
		}

		public Criteria andProductVersionFixBetween(String value1, String value2) {
			addCriterion("product_version_fix between", value1, value2,
					"productVersionFix");
			return (Criteria) this;
		}

		public Criteria andProductVersionFixNotBetween(String value1,
				String value2) {
			addCriterion("product_version_fix not between", value1, value2,
					"productVersionFix");
			return (Criteria) this;
		}

		public Criteria andStatusIsNull() {
			addCriterion("status is null");
			return (Criteria) this;
		}

		public Criteria andStatusIsNotNull() {
			addCriterion("status is not null");
			return (Criteria) this;
		}

		public Criteria andStatusEqualTo(String value) {
			addCriterion("status =", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotEqualTo(String value) {
			addCriterion("status <>", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThan(String value) {
			addCriterion("status >", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThanOrEqualTo(String value) {
			addCriterion("status >=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThan(String value) {
			addCriterion("status <", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThanOrEqualTo(String value) {
			addCriterion("status <=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLike(String value) {
			addCriterion("status like", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotLike(String value) {
			addCriterion("status not like", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusIn(List<String> values) {
			addCriterion("status in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotIn(List<String> values) {
			addCriterion("status not in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusBetween(String value1, String value2) {
			addCriterion("status between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotBetween(String value1, String value2) {
			addCriterion("status not between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andProductIsNull() {
			addCriterion("product is null");
			return (Criteria) this;
		}

		public Criteria andProductIsNotNull() {
			addCriterion("product is not null");
			return (Criteria) this;
		}

		public Criteria andProductEqualTo(Long value) {
			addCriterion("product =", value, "product");
			return (Criteria) this;
		}

		public Criteria andProductNotEqualTo(Long value) {
			addCriterion("product <>", value, "product");
			return (Criteria) this;
		}

		public Criteria andProductGreaterThan(Long value) {
			addCriterion("product >", value, "product");
			return (Criteria) this;
		}

		public Criteria andProductGreaterThanOrEqualTo(Long value) {
			addCriterion("product >=", value, "product");
			return (Criteria) this;
		}

		public Criteria andProductLessThan(Long value) {
			addCriterion("product <", value, "product");
			return (Criteria) this;
		}

		public Criteria andProductLessThanOrEqualTo(Long value) {
			addCriterion("product <=", value, "product");
			return (Criteria) this;
		}

		public Criteria andProductIn(List<Long> values) {
			addCriterion("product in", values, "product");
			return (Criteria) this;
		}

		public Criteria andProductNotIn(List<Long> values) {
			addCriterion("product not in", values, "product");
			return (Criteria) this;
		}

		public Criteria andProductBetween(Long value1, Long value2) {
			addCriterion("product between", value1, value2, "product");
			return (Criteria) this;
		}

		public Criteria andProductNotBetween(Long value1, Long value2) {
			addCriterion("product not between", value1, value2, "product");
			return (Criteria) this;
		}

		public Criteria andLengthIsNull() {
			addCriterion("length is null");
			return (Criteria) this;
		}

		public Criteria andLengthIsNotNull() {
			addCriterion("length is not null");
			return (Criteria) this;
		}

		public Criteria andLengthEqualTo(Integer value) {
			addCriterion("length =", value, "length");
			return (Criteria) this;
		}

		public Criteria andLengthNotEqualTo(Integer value) {
			addCriterion("length <>", value, "length");
			return (Criteria) this;
		}

		public Criteria andLengthGreaterThan(Integer value) {
			addCriterion("length >", value, "length");
			return (Criteria) this;
		}

		public Criteria andLengthGreaterThanOrEqualTo(Integer value) {
			addCriterion("length >=", value, "length");
			return (Criteria) this;
		}

		public Criteria andLengthLessThan(Integer value) {
			addCriterion("length <", value, "length");
			return (Criteria) this;
		}

		public Criteria andLengthLessThanOrEqualTo(Integer value) {
			addCriterion("length <=", value, "length");
			return (Criteria) this;
		}

		public Criteria andLengthIn(List<Integer> values) {
			addCriterion("length in", values, "length");
			return (Criteria) this;
		}

		public Criteria andLengthNotIn(List<Integer> values) {
			addCriterion("length not in", values, "length");
			return (Criteria) this;
		}

		public Criteria andLengthBetween(Integer value1, Integer value2) {
			addCriterion("length between", value1, value2, "length");
			return (Criteria) this;
		}

		public Criteria andLengthNotBetween(Integer value1, Integer value2) {
			addCriterion("length not between", value1, value2, "length");
			return (Criteria) this;
		}

		public Criteria andNameIsNull() {
			addCriterion("name is null");
			return (Criteria) this;
		}

		public Criteria andNameIsNotNull() {
			addCriterion("name is not null");
			return (Criteria) this;
		}

		public Criteria andNameEqualTo(String value) {
			addCriterion("name =", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotEqualTo(String value) {
			addCriterion("name <>", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThan(String value) {
			addCriterion("name >", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThanOrEqualTo(String value) {
			addCriterion("name >=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThan(String value) {
			addCriterion("name <", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThanOrEqualTo(String value) {
			addCriterion("name <=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLike(String value) {
			addCriterion("name like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotLike(String value) {
			addCriterion("name not like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameIn(List<String> values) {
			addCriterion("name in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotIn(List<String> values) {
			addCriterion("name not in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameBetween(String value1, String value2) {
			addCriterion("name between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotBetween(String value1, String value2) {
			addCriterion("name not between", value1, value2, "name");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table version
	 * @mbggenerated
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue,
				String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table version
     *
     * @mbggenerated do_not_delete_during_merge Wed Apr 10 21:15:12 CST 2013
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}