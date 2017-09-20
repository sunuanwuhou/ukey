package com.itrus.ukey.db;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AuthCodeExample extends DomainSur {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table auth_code
	 * @mbggenerated
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table auth_code
	 * @mbggenerated
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table auth_code
	 * @mbggenerated
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table auth_code
	 * @mbggenerated
	 */
	public AuthCodeExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table auth_code
	 * @mbggenerated
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table auth_code
	 * @mbggenerated
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table auth_code
	 * @mbggenerated
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table auth_code
	 * @mbggenerated
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table auth_code
	 * @mbggenerated
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table auth_code
	 * @mbggenerated
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table auth_code
	 * @mbggenerated
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table auth_code
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
	 * This method was generated by MyBatis Generator. This method corresponds to the database table auth_code
	 * @mbggenerated
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table auth_code
	 * @mbggenerated
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table auth_code
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

		public Criteria andAuthCodeIsNull() {
			addCriterion("auth_code is null");
			return (Criteria) this;
		}

		public Criteria andAuthCodeIsNotNull() {
			addCriterion("auth_code is not null");
			return (Criteria) this;
		}

		public Criteria andAuthCodeEqualTo(String value) {
			addCriterion("auth_code =", value, "authCode");
			return (Criteria) this;
		}

		public Criteria andAuthCodeNotEqualTo(String value) {
			addCriterion("auth_code <>", value, "authCode");
			return (Criteria) this;
		}

		public Criteria andAuthCodeGreaterThan(String value) {
			addCriterion("auth_code >", value, "authCode");
			return (Criteria) this;
		}

		public Criteria andAuthCodeGreaterThanOrEqualTo(String value) {
			addCriterion("auth_code >=", value, "authCode");
			return (Criteria) this;
		}

		public Criteria andAuthCodeLessThan(String value) {
			addCriterion("auth_code <", value, "authCode");
			return (Criteria) this;
		}

		public Criteria andAuthCodeLessThanOrEqualTo(String value) {
			addCriterion("auth_code <=", value, "authCode");
			return (Criteria) this;
		}

		public Criteria andAuthCodeLike(String value) {
			addCriterion("auth_code like", value, "authCode");
			return (Criteria) this;
		}

		public Criteria andAuthCodeNotLike(String value) {
			addCriterion("auth_code not like", value, "authCode");
			return (Criteria) this;
		}

		public Criteria andAuthCodeIn(List<String> values) {
			addCriterion("auth_code in", values, "authCode");
			return (Criteria) this;
		}

		public Criteria andAuthCodeNotIn(List<String> values) {
			addCriterion("auth_code not in", values, "authCode");
			return (Criteria) this;
		}

		public Criteria andAuthCodeBetween(String value1, String value2) {
			addCriterion("auth_code between", value1, value2, "authCode");
			return (Criteria) this;
		}

		public Criteria andAuthCodeNotBetween(String value1, String value2) {
			addCriterion("auth_code not between", value1, value2, "authCode");
			return (Criteria) this;
		}

		public Criteria andConsumeTimeIsNull() {
			addCriterion("consume_time is null");
			return (Criteria) this;
		}

		public Criteria andConsumeTimeIsNotNull() {
			addCriterion("consume_time is not null");
			return (Criteria) this;
		}

		public Criteria andConsumeTimeEqualTo(Date value) {
			addCriterion("consume_time =", value, "consumeTime");
			return (Criteria) this;
		}

		public Criteria andConsumeTimeNotEqualTo(Date value) {
			addCriterion("consume_time <>", value, "consumeTime");
			return (Criteria) this;
		}

		public Criteria andConsumeTimeGreaterThan(Date value) {
			addCriterion("consume_time >", value, "consumeTime");
			return (Criteria) this;
		}

		public Criteria andConsumeTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("consume_time >=", value, "consumeTime");
			return (Criteria) this;
		}

		public Criteria andConsumeTimeLessThan(Date value) {
			addCriterion("consume_time <", value, "consumeTime");
			return (Criteria) this;
		}

		public Criteria andConsumeTimeLessThanOrEqualTo(Date value) {
			addCriterion("consume_time <=", value, "consumeTime");
			return (Criteria) this;
		}

		public Criteria andConsumeTimeIn(List<Date> values) {
			addCriterion("consume_time in", values, "consumeTime");
			return (Criteria) this;
		}

		public Criteria andConsumeTimeNotIn(List<Date> values) {
			addCriterion("consume_time not in", values, "consumeTime");
			return (Criteria) this;
		}

		public Criteria andConsumeTimeBetween(Date value1, Date value2) {
			addCriterion("consume_time between", value1, value2, "consumeTime");
			return (Criteria) this;
		}

		public Criteria andConsumeTimeNotBetween(Date value1, Date value2) {
			addCriterion("consume_time not between", value1, value2,
					"consumeTime");
			return (Criteria) this;
		}

		public Criteria andDeviceSnIsNull() {
			addCriterion("device_sn is null");
			return (Criteria) this;
		}

		public Criteria andDeviceSnIsNotNull() {
			addCriterion("device_sn is not null");
			return (Criteria) this;
		}

		public Criteria andDeviceSnEqualTo(String value) {
			addCriterion("device_sn =", value, "deviceSn");
			return (Criteria) this;
		}

		public Criteria andDeviceSnNotEqualTo(String value) {
			addCriterion("device_sn <>", value, "deviceSn");
			return (Criteria) this;
		}

		public Criteria andDeviceSnGreaterThan(String value) {
			addCriterion("device_sn >", value, "deviceSn");
			return (Criteria) this;
		}

		public Criteria andDeviceSnGreaterThanOrEqualTo(String value) {
			addCriterion("device_sn >=", value, "deviceSn");
			return (Criteria) this;
		}

		public Criteria andDeviceSnLessThan(String value) {
			addCriterion("device_sn <", value, "deviceSn");
			return (Criteria) this;
		}

		public Criteria andDeviceSnLessThanOrEqualTo(String value) {
			addCriterion("device_sn <=", value, "deviceSn");
			return (Criteria) this;
		}

		public Criteria andDeviceSnLike(String value) {
			addCriterion("device_sn like", value, "deviceSn");
			return (Criteria) this;
		}

		public Criteria andDeviceSnNotLike(String value) {
			addCriterion("device_sn not like", value, "deviceSn");
			return (Criteria) this;
		}

		public Criteria andDeviceSnIn(List<String> values) {
			addCriterion("device_sn in", values, "deviceSn");
			return (Criteria) this;
		}

		public Criteria andDeviceSnNotIn(List<String> values) {
			addCriterion("device_sn not in", values, "deviceSn");
			return (Criteria) this;
		}

		public Criteria andDeviceSnBetween(String value1, String value2) {
			addCriterion("device_sn between", value1, value2, "deviceSn");
			return (Criteria) this;
		}

		public Criteria andDeviceSnNotBetween(String value1, String value2) {
			addCriterion("device_sn not between", value1, value2, "deviceSn");
			return (Criteria) this;
		}

		public Criteria andOverdueTimeIsNull() {
			addCriterion("overdue_time is null");
			return (Criteria) this;
		}

		public Criteria andOverdueTimeIsNotNull() {
			addCriterion("overdue_time is not null");
			return (Criteria) this;
		}

		public Criteria andOverdueTimeEqualTo(Date value) {
			addCriterion("overdue_time =", value, "overdueTime");
			return (Criteria) this;
		}

		public Criteria andOverdueTimeNotEqualTo(Date value) {
			addCriterion("overdue_time <>", value, "overdueTime");
			return (Criteria) this;
		}

		public Criteria andOverdueTimeGreaterThan(Date value) {
			addCriterion("overdue_time >", value, "overdueTime");
			return (Criteria) this;
		}

		public Criteria andOverdueTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("overdue_time >=", value, "overdueTime");
			return (Criteria) this;
		}

		public Criteria andOverdueTimeLessThan(Date value) {
			addCriterion("overdue_time <", value, "overdueTime");
			return (Criteria) this;
		}

		public Criteria andOverdueTimeLessThanOrEqualTo(Date value) {
			addCriterion("overdue_time <=", value, "overdueTime");
			return (Criteria) this;
		}

		public Criteria andOverdueTimeIn(List<Date> values) {
			addCriterion("overdue_time in", values, "overdueTime");
			return (Criteria) this;
		}

		public Criteria andOverdueTimeNotIn(List<Date> values) {
			addCriterion("overdue_time not in", values, "overdueTime");
			return (Criteria) this;
		}

		public Criteria andOverdueTimeBetween(Date value1, Date value2) {
			addCriterion("overdue_time between", value1, value2, "overdueTime");
			return (Criteria) this;
		}

		public Criteria andOverdueTimeNotBetween(Date value1, Date value2) {
			addCriterion("overdue_time not between", value1, value2,
					"overdueTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeIsNull() {
			addCriterion("start_time is null");
			return (Criteria) this;
		}

		public Criteria andStartTimeIsNotNull() {
			addCriterion("start_time is not null");
			return (Criteria) this;
		}

		public Criteria andStartTimeEqualTo(Date value) {
			addCriterion("start_time =", value, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeNotEqualTo(Date value) {
			addCriterion("start_time <>", value, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeGreaterThan(Date value) {
			addCriterion("start_time >", value, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("start_time >=", value, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeLessThan(Date value) {
			addCriterion("start_time <", value, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeLessThanOrEqualTo(Date value) {
			addCriterion("start_time <=", value, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeIn(List<Date> values) {
			addCriterion("start_time in", values, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeNotIn(List<Date> values) {
			addCriterion("start_time not in", values, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeBetween(Date value1, Date value2) {
			addCriterion("start_time between", value1, value2, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeNotBetween(Date value1, Date value2) {
			addCriterion("start_time not between", value1, value2, "startTime");
			return (Criteria) this;
		}

		public Criteria andItrusUserIsNull() {
			addCriterion("itrus_user is null");
			return (Criteria) this;
		}

		public Criteria andItrusUserIsNotNull() {
			addCriterion("itrus_user is not null");
			return (Criteria) this;
		}

		public Criteria andItrusUserEqualTo(Long value) {
			addCriterion("itrus_user =", value, "itrusUser");
			return (Criteria) this;
		}

		public Criteria andItrusUserNotEqualTo(Long value) {
			addCriterion("itrus_user <>", value, "itrusUser");
			return (Criteria) this;
		}

		public Criteria andItrusUserGreaterThan(Long value) {
			addCriterion("itrus_user >", value, "itrusUser");
			return (Criteria) this;
		}

		public Criteria andItrusUserGreaterThanOrEqualTo(Long value) {
			addCriterion("itrus_user >=", value, "itrusUser");
			return (Criteria) this;
		}

		public Criteria andItrusUserLessThan(Long value) {
			addCriterion("itrus_user <", value, "itrusUser");
			return (Criteria) this;
		}

		public Criteria andItrusUserLessThanOrEqualTo(Long value) {
			addCriterion("itrus_user <=", value, "itrusUser");
			return (Criteria) this;
		}

		public Criteria andItrusUserIn(List<Long> values) {
			addCriterion("itrus_user in", values, "itrusUser");
			return (Criteria) this;
		}

		public Criteria andItrusUserNotIn(List<Long> values) {
			addCriterion("itrus_user not in", values, "itrusUser");
			return (Criteria) this;
		}

		public Criteria andItrusUserBetween(Long value1, Long value2) {
			addCriterion("itrus_user between", value1, value2, "itrusUser");
			return (Criteria) this;
		}

		public Criteria andItrusUserNotBetween(Long value1, Long value2) {
			addCriterion("itrus_user not between", value1, value2, "itrusUser");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table auth_code
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
     * This class corresponds to the database table auth_code
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}