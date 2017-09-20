package com.itrus.ukey.db;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ActivityMsgTempExample extends DomainSur {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table activity_msg_temp
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table activity_msg_temp
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table activity_msg_temp
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_msg_temp
     *
     * @mbggenerated
     */
    public ActivityMsgTempExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_msg_temp
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_msg_temp
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_msg_temp
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_msg_temp
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_msg_temp
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_msg_temp
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_msg_temp
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_msg_temp
     *
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
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_msg_temp
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_msg_temp
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table activity_msg_temp
     *
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

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
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

        public Criteria andCertCnIsNull() {
            addCriterion("cert_cn is null");
            return (Criteria) this;
        }

        public Criteria andCertCnIsNotNull() {
            addCriterion("cert_cn is not null");
            return (Criteria) this;
        }

        public Criteria andCertCnEqualTo(String value) {
            addCriterion("cert_cn =", value, "certCn");
            return (Criteria) this;
        }

        public Criteria andCertCnNotEqualTo(String value) {
            addCriterion("cert_cn <>", value, "certCn");
            return (Criteria) this;
        }

        public Criteria andCertCnGreaterThan(String value) {
            addCriterion("cert_cn >", value, "certCn");
            return (Criteria) this;
        }

        public Criteria andCertCnGreaterThanOrEqualTo(String value) {
            addCriterion("cert_cn >=", value, "certCn");
            return (Criteria) this;
        }

        public Criteria andCertCnLessThan(String value) {
            addCriterion("cert_cn <", value, "certCn");
            return (Criteria) this;
        }

        public Criteria andCertCnLessThanOrEqualTo(String value) {
            addCriterion("cert_cn <=", value, "certCn");
            return (Criteria) this;
        }

        public Criteria andCertCnLike(String value) {
            addCriterion("cert_cn like", value, "certCn");
            return (Criteria) this;
        }

        public Criteria andCertCnNotLike(String value) {
            addCriterion("cert_cn not like", value, "certCn");
            return (Criteria) this;
        }

        public Criteria andCertCnIn(List<String> values) {
            addCriterion("cert_cn in", values, "certCn");
            return (Criteria) this;
        }

        public Criteria andCertCnNotIn(List<String> values) {
            addCriterion("cert_cn not in", values, "certCn");
            return (Criteria) this;
        }

        public Criteria andCertCnBetween(String value1, String value2) {
            addCriterion("cert_cn between", value1, value2, "certCn");
            return (Criteria) this;
        }

        public Criteria andCertCnNotBetween(String value1, String value2) {
            addCriterion("cert_cn not between", value1, value2, "certCn");
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
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andHostIdIsNull() {
            addCriterion("host_id is null");
            return (Criteria) this;
        }

        public Criteria andHostIdIsNotNull() {
            addCriterion("host_id is not null");
            return (Criteria) this;
        }

        public Criteria andHostIdEqualTo(String value) {
            addCriterion("host_id =", value, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdNotEqualTo(String value) {
            addCriterion("host_id <>", value, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdGreaterThan(String value) {
            addCriterion("host_id >", value, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdGreaterThanOrEqualTo(String value) {
            addCriterion("host_id >=", value, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdLessThan(String value) {
            addCriterion("host_id <", value, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdLessThanOrEqualTo(String value) {
            addCriterion("host_id <=", value, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdLike(String value) {
            addCriterion("host_id like", value, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdNotLike(String value) {
            addCriterion("host_id not like", value, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdIn(List<String> values) {
            addCriterion("host_id in", values, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdNotIn(List<String> values) {
            addCriterion("host_id not in", values, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdBetween(String value1, String value2) {
            addCriterion("host_id between", value1, value2, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdNotBetween(String value1, String value2) {
            addCriterion("host_id not between", value1, value2, "hostId");
            return (Criteria) this;
        }

        public Criteria andKeySnIsNull() {
            addCriterion("key_sn is null");
            return (Criteria) this;
        }

        public Criteria andKeySnIsNotNull() {
            addCriterion("key_sn is not null");
            return (Criteria) this;
        }

        public Criteria andKeySnEqualTo(String value) {
            addCriterion("key_sn =", value, "keySn");
            return (Criteria) this;
        }

        public Criteria andKeySnNotEqualTo(String value) {
            addCriterion("key_sn <>", value, "keySn");
            return (Criteria) this;
        }

        public Criteria andKeySnGreaterThan(String value) {
            addCriterion("key_sn >", value, "keySn");
            return (Criteria) this;
        }

        public Criteria andKeySnGreaterThanOrEqualTo(String value) {
            addCriterion("key_sn >=", value, "keySn");
            return (Criteria) this;
        }

        public Criteria andKeySnLessThan(String value) {
            addCriterion("key_sn <", value, "keySn");
            return (Criteria) this;
        }

        public Criteria andKeySnLessThanOrEqualTo(String value) {
            addCriterion("key_sn <=", value, "keySn");
            return (Criteria) this;
        }

        public Criteria andKeySnLike(String value) {
            addCriterion("key_sn like", value, "keySn");
            return (Criteria) this;
        }

        public Criteria andKeySnNotLike(String value) {
            addCriterion("key_sn not like", value, "keySn");
            return (Criteria) this;
        }

        public Criteria andKeySnIn(List<String> values) {
            addCriterion("key_sn in", values, "keySn");
            return (Criteria) this;
        }

        public Criteria andKeySnNotIn(List<String> values) {
            addCriterion("key_sn not in", values, "keySn");
            return (Criteria) this;
        }

        public Criteria andKeySnBetween(String value1, String value2) {
            addCriterion("key_sn between", value1, value2, "keySn");
            return (Criteria) this;
        }

        public Criteria andKeySnNotBetween(String value1, String value2) {
            addCriterion("key_sn not between", value1, value2, "keySn");
            return (Criteria) this;
        }

        public Criteria andLifeTimeIsNull() {
            addCriterion("life_time is null");
            return (Criteria) this;
        }

        public Criteria andLifeTimeIsNotNull() {
            addCriterion("life_time is not null");
            return (Criteria) this;
        }

        public Criteria andLifeTimeEqualTo(Long value) {
            addCriterion("life_time =", value, "lifeTime");
            return (Criteria) this;
        }

        public Criteria andLifeTimeNotEqualTo(Long value) {
            addCriterion("life_time <>", value, "lifeTime");
            return (Criteria) this;
        }

        public Criteria andLifeTimeGreaterThan(Long value) {
            addCriterion("life_time >", value, "lifeTime");
            return (Criteria) this;
        }

        public Criteria andLifeTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("life_time >=", value, "lifeTime");
            return (Criteria) this;
        }

        public Criteria andLifeTimeLessThan(Long value) {
            addCriterion("life_time <", value, "lifeTime");
            return (Criteria) this;
        }

        public Criteria andLifeTimeLessThanOrEqualTo(Long value) {
            addCriterion("life_time <=", value, "lifeTime");
            return (Criteria) this;
        }

        public Criteria andLifeTimeIn(List<Long> values) {
            addCriterion("life_time in", values, "lifeTime");
            return (Criteria) this;
        }

        public Criteria andLifeTimeNotIn(List<Long> values) {
            addCriterion("life_time not in", values, "lifeTime");
            return (Criteria) this;
        }

        public Criteria andLifeTimeBetween(Long value1, Long value2) {
            addCriterion("life_time between", value1, value2, "lifeTime");
            return (Criteria) this;
        }

        public Criteria andLifeTimeNotBetween(Long value1, Long value2) {
            addCriterion("life_time not between", value1, value2, "lifeTime");
            return (Criteria) this;
        }

        public Criteria andOffLineTimeIsNull() {
            addCriterion("off_line_time is null");
            return (Criteria) this;
        }

        public Criteria andOffLineTimeIsNotNull() {
            addCriterion("off_line_time is not null");
            return (Criteria) this;
        }

        public Criteria andOffLineTimeEqualTo(Date value) {
            addCriterion("off_line_time =", value, "offLineTime");
            return (Criteria) this;
        }

        public Criteria andOffLineTimeNotEqualTo(Date value) {
            addCriterion("off_line_time <>", value, "offLineTime");
            return (Criteria) this;
        }

        public Criteria andOffLineTimeGreaterThan(Date value) {
            addCriterion("off_line_time >", value, "offLineTime");
            return (Criteria) this;
        }

        public Criteria andOffLineTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("off_line_time >=", value, "offLineTime");
            return (Criteria) this;
        }

        public Criteria andOffLineTimeLessThan(Date value) {
            addCriterion("off_line_time <", value, "offLineTime");
            return (Criteria) this;
        }

        public Criteria andOffLineTimeLessThanOrEqualTo(Date value) {
            addCriterion("off_line_time <=", value, "offLineTime");
            return (Criteria) this;
        }

        public Criteria andOffLineTimeIn(List<Date> values) {
            addCriterion("off_line_time in", values, "offLineTime");
            return (Criteria) this;
        }

        public Criteria andOffLineTimeNotIn(List<Date> values) {
            addCriterion("off_line_time not in", values, "offLineTime");
            return (Criteria) this;
        }

        public Criteria andOffLineTimeBetween(Date value1, Date value2) {
            addCriterion("off_line_time between", value1, value2, "offLineTime");
            return (Criteria) this;
        }

        public Criteria andOffLineTimeNotBetween(Date value1, Date value2) {
            addCriterion("off_line_time not between", value1, value2, "offLineTime");
            return (Criteria) this;
        }

        public Criteria andOnLineTimeIsNull() {
            addCriterion("on_line_time is null");
            return (Criteria) this;
        }

        public Criteria andOnLineTimeIsNotNull() {
            addCriterion("on_line_time is not null");
            return (Criteria) this;
        }

        public Criteria andOnLineTimeEqualTo(Date value) {
            addCriterion("on_line_time =", value, "onLineTime");
            return (Criteria) this;
        }

        public Criteria andOnLineTimeNotEqualTo(Date value) {
            addCriterion("on_line_time <>", value, "onLineTime");
            return (Criteria) this;
        }

        public Criteria andOnLineTimeGreaterThan(Date value) {
            addCriterion("on_line_time >", value, "onLineTime");
            return (Criteria) this;
        }

        public Criteria andOnLineTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("on_line_time >=", value, "onLineTime");
            return (Criteria) this;
        }

        public Criteria andOnLineTimeLessThan(Date value) {
            addCriterion("on_line_time <", value, "onLineTime");
            return (Criteria) this;
        }

        public Criteria andOnLineTimeLessThanOrEqualTo(Date value) {
            addCriterion("on_line_time <=", value, "onLineTime");
            return (Criteria) this;
        }

        public Criteria andOnLineTimeIn(List<Date> values) {
            addCriterion("on_line_time in", values, "onLineTime");
            return (Criteria) this;
        }

        public Criteria andOnLineTimeNotIn(List<Date> values) {
            addCriterion("on_line_time not in", values, "onLineTime");
            return (Criteria) this;
        }

        public Criteria andOnLineTimeBetween(Date value1, Date value2) {
            addCriterion("on_line_time between", value1, value2, "onLineTime");
            return (Criteria) this;
        }

        public Criteria andOnLineTimeNotBetween(Date value1, Date value2) {
            addCriterion("on_line_time not between", value1, value2, "onLineTime");
            return (Criteria) this;
        }

        public Criteria andOsTypeIsNull() {
            addCriterion("os_type is null");
            return (Criteria) this;
        }

        public Criteria andOsTypeIsNotNull() {
            addCriterion("os_type is not null");
            return (Criteria) this;
        }

        public Criteria andOsTypeEqualTo(String value) {
            addCriterion("os_type =", value, "osType");
            return (Criteria) this;
        }

        public Criteria andOsTypeNotEqualTo(String value) {
            addCriterion("os_type <>", value, "osType");
            return (Criteria) this;
        }

        public Criteria andOsTypeGreaterThan(String value) {
            addCriterion("os_type >", value, "osType");
            return (Criteria) this;
        }

        public Criteria andOsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("os_type >=", value, "osType");
            return (Criteria) this;
        }

        public Criteria andOsTypeLessThan(String value) {
            addCriterion("os_type <", value, "osType");
            return (Criteria) this;
        }

        public Criteria andOsTypeLessThanOrEqualTo(String value) {
            addCriterion("os_type <=", value, "osType");
            return (Criteria) this;
        }

        public Criteria andOsTypeLike(String value) {
            addCriterion("os_type like", value, "osType");
            return (Criteria) this;
        }

        public Criteria andOsTypeNotLike(String value) {
            addCriterion("os_type not like", value, "osType");
            return (Criteria) this;
        }

        public Criteria andOsTypeIn(List<String> values) {
            addCriterion("os_type in", values, "osType");
            return (Criteria) this;
        }

        public Criteria andOsTypeNotIn(List<String> values) {
            addCriterion("os_type not in", values, "osType");
            return (Criteria) this;
        }

        public Criteria andOsTypeBetween(String value1, String value2) {
            addCriterion("os_type between", value1, value2, "osType");
            return (Criteria) this;
        }

        public Criteria andOsTypeNotBetween(String value1, String value2) {
            addCriterion("os_type not between", value1, value2, "osType");
            return (Criteria) this;
        }

        public Criteria andProcessIdIsNull() {
            addCriterion("process_id is null");
            return (Criteria) this;
        }

        public Criteria andProcessIdIsNotNull() {
            addCriterion("process_id is not null");
            return (Criteria) this;
        }

        public Criteria andProcessIdEqualTo(String value) {
            addCriterion("process_id =", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotEqualTo(String value) {
            addCriterion("process_id <>", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdGreaterThan(String value) {
            addCriterion("process_id >", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdGreaterThanOrEqualTo(String value) {
            addCriterion("process_id >=", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdLessThan(String value) {
            addCriterion("process_id <", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdLessThanOrEqualTo(String value) {
            addCriterion("process_id <=", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdLike(String value) {
            addCriterion("process_id like", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotLike(String value) {
            addCriterion("process_id not like", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdIn(List<String> values) {
            addCriterion("process_id in", values, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotIn(List<String> values) {
            addCriterion("process_id not in", values, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdBetween(String value1, String value2) {
            addCriterion("process_id between", value1, value2, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotBetween(String value1, String value2) {
            addCriterion("process_id not between", value1, value2, "processId");
            return (Criteria) this;
        }

        public Criteria andThreadIdIsNull() {
            addCriterion("thread_id is null");
            return (Criteria) this;
        }

        public Criteria andThreadIdIsNotNull() {
            addCriterion("thread_id is not null");
            return (Criteria) this;
        }

        public Criteria andThreadIdEqualTo(String value) {
            addCriterion("thread_id =", value, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdNotEqualTo(String value) {
            addCriterion("thread_id <>", value, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdGreaterThan(String value) {
            addCriterion("thread_id >", value, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdGreaterThanOrEqualTo(String value) {
            addCriterion("thread_id >=", value, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdLessThan(String value) {
            addCriterion("thread_id <", value, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdLessThanOrEqualTo(String value) {
            addCriterion("thread_id <=", value, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdLike(String value) {
            addCriterion("thread_id like", value, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdNotLike(String value) {
            addCriterion("thread_id not like", value, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdIn(List<String> values) {
            addCriterion("thread_id in", values, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdNotIn(List<String> values) {
            addCriterion("thread_id not in", values, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdBetween(String value1, String value2) {
            addCriterion("thread_id between", value1, value2, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdNotBetween(String value1, String value2) {
            addCriterion("thread_id not between", value1, value2, "threadId");
            return (Criteria) this;
        }

        public Criteria andUkeyVersionIsNull() {
            addCriterion("ukey_version is null");
            return (Criteria) this;
        }

        public Criteria andUkeyVersionIsNotNull() {
            addCriterion("ukey_version is not null");
            return (Criteria) this;
        }

        public Criteria andUkeyVersionEqualTo(String value) {
            addCriterion("ukey_version =", value, "ukeyVersion");
            return (Criteria) this;
        }

        public Criteria andUkeyVersionNotEqualTo(String value) {
            addCriterion("ukey_version <>", value, "ukeyVersion");
            return (Criteria) this;
        }

        public Criteria andUkeyVersionGreaterThan(String value) {
            addCriterion("ukey_version >", value, "ukeyVersion");
            return (Criteria) this;
        }

        public Criteria andUkeyVersionGreaterThanOrEqualTo(String value) {
            addCriterion("ukey_version >=", value, "ukeyVersion");
            return (Criteria) this;
        }

        public Criteria andUkeyVersionLessThan(String value) {
            addCriterion("ukey_version <", value, "ukeyVersion");
            return (Criteria) this;
        }

        public Criteria andUkeyVersionLessThanOrEqualTo(String value) {
            addCriterion("ukey_version <=", value, "ukeyVersion");
            return (Criteria) this;
        }

        public Criteria andUkeyVersionLike(String value) {
            addCriterion("ukey_version like", value, "ukeyVersion");
            return (Criteria) this;
        }

        public Criteria andUkeyVersionNotLike(String value) {
            addCriterion("ukey_version not like", value, "ukeyVersion");
            return (Criteria) this;
        }

        public Criteria andUkeyVersionIn(List<String> values) {
            addCriterion("ukey_version in", values, "ukeyVersion");
            return (Criteria) this;
        }

        public Criteria andUkeyVersionNotIn(List<String> values) {
            addCriterion("ukey_version not in", values, "ukeyVersion");
            return (Criteria) this;
        }

        public Criteria andUkeyVersionBetween(String value1, String value2) {
            addCriterion("ukey_version between", value1, value2, "ukeyVersion");
            return (Criteria) this;
        }

        public Criteria andUkeyVersionNotBetween(String value1, String value2) {
            addCriterion("ukey_version not between", value1, value2, "ukeyVersion");
            return (Criteria) this;
        }

        public Criteria andProjectIsNull() {
            addCriterion("project is null");
            return (Criteria) this;
        }

        public Criteria andProjectIsNotNull() {
            addCriterion("project is not null");
            return (Criteria) this;
        }

        public Criteria andProjectEqualTo(Long value) {
            addCriterion("project =", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectNotEqualTo(Long value) {
            addCriterion("project <>", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectGreaterThan(Long value) {
            addCriterion("project >", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectGreaterThanOrEqualTo(Long value) {
            addCriterion("project >=", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectLessThan(Long value) {
            addCriterion("project <", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectLessThanOrEqualTo(Long value) {
            addCriterion("project <=", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectIn(List<Long> values) {
            addCriterion("project in", values, "project");
            return (Criteria) this;
        }

        public Criteria andProjectNotIn(List<Long> values) {
            addCriterion("project not in", values, "project");
            return (Criteria) this;
        }

        public Criteria andProjectBetween(Long value1, Long value2) {
            addCriterion("project between", value1, value2, "project");
            return (Criteria) this;
        }

        public Criteria andProjectNotBetween(Long value1, Long value2) {
            addCriterion("project not between", value1, value2, "project");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table activity_msg_temp
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table activity_msg_temp
     *
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

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
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
}