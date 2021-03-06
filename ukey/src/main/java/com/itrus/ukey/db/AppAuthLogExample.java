package com.itrus.ukey.db;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppAuthLogExample extends DomainSur {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table app_auth_log
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table app_auth_log
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table app_auth_log
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_auth_log
     *
     * @mbggenerated
     */
    public AppAuthLogExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_auth_log
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_auth_log
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_auth_log
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_auth_log
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_auth_log
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_auth_log
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_auth_log
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
     * This method corresponds to the database table app_auth_log
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
     * This method corresponds to the database table app_auth_log
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_auth_log
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
     * This class corresponds to the database table app_auth_log
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

        public Criteria andAuthTimeIsNull() {
            addCriterion("auth_time is null");
            return (Criteria) this;
        }

        public Criteria andAuthTimeIsNotNull() {
            addCriterion("auth_time is not null");
            return (Criteria) this;
        }

        public Criteria andAuthTimeEqualTo(Date value) {
            addCriterion("auth_time =", value, "authTime");
            return (Criteria) this;
        }

        public Criteria andAuthTimeNotEqualTo(Date value) {
            addCriterion("auth_time <>", value, "authTime");
            return (Criteria) this;
        }

        public Criteria andAuthTimeGreaterThan(Date value) {
            addCriterion("auth_time >", value, "authTime");
            return (Criteria) this;
        }

        public Criteria andAuthTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("auth_time >=", value, "authTime");
            return (Criteria) this;
        }

        public Criteria andAuthTimeLessThan(Date value) {
            addCriterion("auth_time <", value, "authTime");
            return (Criteria) this;
        }

        public Criteria andAuthTimeLessThanOrEqualTo(Date value) {
            addCriterion("auth_time <=", value, "authTime");
            return (Criteria) this;
        }

        public Criteria andAuthTimeIn(List<Date> values) {
            addCriterion("auth_time in", values, "authTime");
            return (Criteria) this;
        }

        public Criteria andAuthTimeNotIn(List<Date> values) {
            addCriterion("auth_time not in", values, "authTime");
            return (Criteria) this;
        }

        public Criteria andAuthTimeBetween(Date value1, Date value2) {
            addCriterion("auth_time between", value1, value2, "authTime");
            return (Criteria) this;
        }

        public Criteria andAuthTimeNotBetween(Date value1, Date value2) {
            addCriterion("auth_time not between", value1, value2, "authTime");
            return (Criteria) this;
        }

        public Criteria andHasBLicenseIsNull() {
            addCriterion("has_b_license is null");
            return (Criteria) this;
        }

        public Criteria andHasBLicenseIsNotNull() {
            addCriterion("has_b_license is not null");
            return (Criteria) this;
        }

        public Criteria andHasBLicenseEqualTo(Boolean value) {
            addCriterion("has_b_license =", value, "hasBLicense");
            return (Criteria) this;
        }

        public Criteria andHasBLicenseNotEqualTo(Boolean value) {
            addCriterion("has_b_license <>", value, "hasBLicense");
            return (Criteria) this;
        }

        public Criteria andHasBLicenseGreaterThan(Boolean value) {
            addCriterion("has_b_license >", value, "hasBLicense");
            return (Criteria) this;
        }

        public Criteria andHasBLicenseGreaterThanOrEqualTo(Boolean value) {
            addCriterion("has_b_license >=", value, "hasBLicense");
            return (Criteria) this;
        }

        public Criteria andHasBLicenseLessThan(Boolean value) {
            addCriterion("has_b_license <", value, "hasBLicense");
            return (Criteria) this;
        }

        public Criteria andHasBLicenseLessThanOrEqualTo(Boolean value) {
            addCriterion("has_b_license <=", value, "hasBLicense");
            return (Criteria) this;
        }

        public Criteria andHasBLicenseIn(List<Boolean> values) {
            addCriterion("has_b_license in", values, "hasBLicense");
            return (Criteria) this;
        }

        public Criteria andHasBLicenseNotIn(List<Boolean> values) {
            addCriterion("has_b_license not in", values, "hasBLicense");
            return (Criteria) this;
        }

        public Criteria andHasBLicenseBetween(Boolean value1, Boolean value2) {
            addCriterion("has_b_license between", value1, value2, "hasBLicense");
            return (Criteria) this;
        }

        public Criteria andHasBLicenseNotBetween(Boolean value1, Boolean value2) {
            addCriterion("has_b_license not between", value1, value2, "hasBLicense");
            return (Criteria) this;
        }

        public Criteria andHasLegalRIsNull() {
            addCriterion("has_legal_r is null");
            return (Criteria) this;
        }

        public Criteria andHasLegalRIsNotNull() {
            addCriterion("has_legal_r is not null");
            return (Criteria) this;
        }

        public Criteria andHasLegalREqualTo(Boolean value) {
            addCriterion("has_legal_r =", value, "hasLegalR");
            return (Criteria) this;
        }

        public Criteria andHasLegalRNotEqualTo(Boolean value) {
            addCriterion("has_legal_r <>", value, "hasLegalR");
            return (Criteria) this;
        }

        public Criteria andHasLegalRGreaterThan(Boolean value) {
            addCriterion("has_legal_r >", value, "hasLegalR");
            return (Criteria) this;
        }

        public Criteria andHasLegalRGreaterThanOrEqualTo(Boolean value) {
            addCriterion("has_legal_r >=", value, "hasLegalR");
            return (Criteria) this;
        }

        public Criteria andHasLegalRLessThan(Boolean value) {
            addCriterion("has_legal_r <", value, "hasLegalR");
            return (Criteria) this;
        }

        public Criteria andHasLegalRLessThanOrEqualTo(Boolean value) {
            addCriterion("has_legal_r <=", value, "hasLegalR");
            return (Criteria) this;
        }

        public Criteria andHasLegalRIn(List<Boolean> values) {
            addCriterion("has_legal_r in", values, "hasLegalR");
            return (Criteria) this;
        }

        public Criteria andHasLegalRNotIn(List<Boolean> values) {
            addCriterion("has_legal_r not in", values, "hasLegalR");
            return (Criteria) this;
        }

        public Criteria andHasLegalRBetween(Boolean value1, Boolean value2) {
            addCriterion("has_legal_r between", value1, value2, "hasLegalR");
            return (Criteria) this;
        }

        public Criteria andHasLegalRNotBetween(Boolean value1, Boolean value2) {
            addCriterion("has_legal_r not between", value1, value2, "hasLegalR");
            return (Criteria) this;
        }

        public Criteria andHasOrgCodeIsNull() {
            addCriterion("has_org_code is null");
            return (Criteria) this;
        }

        public Criteria andHasOrgCodeIsNotNull() {
            addCriterion("has_org_code is not null");
            return (Criteria) this;
        }

        public Criteria andHasOrgCodeEqualTo(Boolean value) {
            addCriterion("has_org_code =", value, "hasOrgCode");
            return (Criteria) this;
        }

        public Criteria andHasOrgCodeNotEqualTo(Boolean value) {
            addCriterion("has_org_code <>", value, "hasOrgCode");
            return (Criteria) this;
        }

        public Criteria andHasOrgCodeGreaterThan(Boolean value) {
            addCriterion("has_org_code >", value, "hasOrgCode");
            return (Criteria) this;
        }

        public Criteria andHasOrgCodeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("has_org_code >=", value, "hasOrgCode");
            return (Criteria) this;
        }

        public Criteria andHasOrgCodeLessThan(Boolean value) {
            addCriterion("has_org_code <", value, "hasOrgCode");
            return (Criteria) this;
        }

        public Criteria andHasOrgCodeLessThanOrEqualTo(Boolean value) {
            addCriterion("has_org_code <=", value, "hasOrgCode");
            return (Criteria) this;
        }

        public Criteria andHasOrgCodeIn(List<Boolean> values) {
            addCriterion("has_org_code in", values, "hasOrgCode");
            return (Criteria) this;
        }

        public Criteria andHasOrgCodeNotIn(List<Boolean> values) {
            addCriterion("has_org_code not in", values, "hasOrgCode");
            return (Criteria) this;
        }

        public Criteria andHasOrgCodeBetween(Boolean value1, Boolean value2) {
            addCriterion("has_org_code between", value1, value2, "hasOrgCode");
            return (Criteria) this;
        }

        public Criteria andHasOrgCodeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("has_org_code not between", value1, value2, "hasOrgCode");
            return (Criteria) this;
        }

        public Criteria andHasTaxCertIsNull() {
            addCriterion("has_tax_cert is null");
            return (Criteria) this;
        }

        public Criteria andHasTaxCertIsNotNull() {
            addCriterion("has_tax_cert is not null");
            return (Criteria) this;
        }

        public Criteria andHasTaxCertEqualTo(Boolean value) {
            addCriterion("has_tax_cert =", value, "hasTaxCert");
            return (Criteria) this;
        }

        public Criteria andHasTaxCertNotEqualTo(Boolean value) {
            addCriterion("has_tax_cert <>", value, "hasTaxCert");
            return (Criteria) this;
        }

        public Criteria andHasTaxCertGreaterThan(Boolean value) {
            addCriterion("has_tax_cert >", value, "hasTaxCert");
            return (Criteria) this;
        }

        public Criteria andHasTaxCertGreaterThanOrEqualTo(Boolean value) {
            addCriterion("has_tax_cert >=", value, "hasTaxCert");
            return (Criteria) this;
        }

        public Criteria andHasTaxCertLessThan(Boolean value) {
            addCriterion("has_tax_cert <", value, "hasTaxCert");
            return (Criteria) this;
        }

        public Criteria andHasTaxCertLessThanOrEqualTo(Boolean value) {
            addCriterion("has_tax_cert <=", value, "hasTaxCert");
            return (Criteria) this;
        }

        public Criteria andHasTaxCertIn(List<Boolean> values) {
            addCriterion("has_tax_cert in", values, "hasTaxCert");
            return (Criteria) this;
        }

        public Criteria andHasTaxCertNotIn(List<Boolean> values) {
            addCriterion("has_tax_cert not in", values, "hasTaxCert");
            return (Criteria) this;
        }

        public Criteria andHasTaxCertBetween(Boolean value1, Boolean value2) {
            addCriterion("has_tax_cert between", value1, value2, "hasTaxCert");
            return (Criteria) this;
        }

        public Criteria andHasTaxCertNotBetween(Boolean value1, Boolean value2) {
            addCriterion("has_tax_cert not between", value1, value2, "hasTaxCert");
            return (Criteria) this;
        }

        public Criteria andHasUserInfoIsNull() {
            addCriterion("has_user_info is null");
            return (Criteria) this;
        }

        public Criteria andHasUserInfoIsNotNull() {
            addCriterion("has_user_info is not null");
            return (Criteria) this;
        }

        public Criteria andHasUserInfoEqualTo(Boolean value) {
            addCriterion("has_user_info =", value, "hasUserInfo");
            return (Criteria) this;
        }

        public Criteria andHasUserInfoNotEqualTo(Boolean value) {
            addCriterion("has_user_info <>", value, "hasUserInfo");
            return (Criteria) this;
        }

        public Criteria andHasUserInfoGreaterThan(Boolean value) {
            addCriterion("has_user_info >", value, "hasUserInfo");
            return (Criteria) this;
        }

        public Criteria andHasUserInfoGreaterThanOrEqualTo(Boolean value) {
            addCriterion("has_user_info >=", value, "hasUserInfo");
            return (Criteria) this;
        }

        public Criteria andHasUserInfoLessThan(Boolean value) {
            addCriterion("has_user_info <", value, "hasUserInfo");
            return (Criteria) this;
        }

        public Criteria andHasUserInfoLessThanOrEqualTo(Boolean value) {
            addCriterion("has_user_info <=", value, "hasUserInfo");
            return (Criteria) this;
        }

        public Criteria andHasUserInfoIn(List<Boolean> values) {
            addCriterion("has_user_info in", values, "hasUserInfo");
            return (Criteria) this;
        }

        public Criteria andHasUserInfoNotIn(List<Boolean> values) {
            addCriterion("has_user_info not in", values, "hasUserInfo");
            return (Criteria) this;
        }

        public Criteria andHasUserInfoBetween(Boolean value1, Boolean value2) {
            addCriterion("has_user_info between", value1, value2, "hasUserInfo");
            return (Criteria) this;
        }

        public Criteria andHasUserInfoNotBetween(Boolean value1, Boolean value2) {
            addCriterion("has_user_info not between", value1, value2, "hasUserInfo");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNull() {
            addCriterion("app_id is null");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNotNull() {
            addCriterion("app_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppIdEqualTo(Long value) {
            addCriterion("app_id =", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotEqualTo(Long value) {
            addCriterion("app_id <>", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThan(Long value) {
            addCriterion("app_id >", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThanOrEqualTo(Long value) {
            addCriterion("app_id >=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThan(Long value) {
            addCriterion("app_id <", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThanOrEqualTo(Long value) {
            addCriterion("app_id <=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdIn(List<Long> values) {
            addCriterion("app_id in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotIn(List<Long> values) {
            addCriterion("app_id not in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdBetween(Long value1, Long value2) {
            addCriterion("app_id between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotBetween(Long value1, Long value2) {
            addCriterion("app_id not between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andSysUserIsNull() {
            addCriterion("sys_user is null");
            return (Criteria) this;
        }

        public Criteria andSysUserIsNotNull() {
            addCriterion("sys_user is not null");
            return (Criteria) this;
        }

        public Criteria andSysUserEqualTo(Long value) {
            addCriterion("sys_user =", value, "sysUser");
            return (Criteria) this;
        }

        public Criteria andSysUserNotEqualTo(Long value) {
            addCriterion("sys_user <>", value, "sysUser");
            return (Criteria) this;
        }

        public Criteria andSysUserGreaterThan(Long value) {
            addCriterion("sys_user >", value, "sysUser");
            return (Criteria) this;
        }

        public Criteria andSysUserGreaterThanOrEqualTo(Long value) {
            addCriterion("sys_user >=", value, "sysUser");
            return (Criteria) this;
        }

        public Criteria andSysUserLessThan(Long value) {
            addCriterion("sys_user <", value, "sysUser");
            return (Criteria) this;
        }

        public Criteria andSysUserLessThanOrEqualTo(Long value) {
            addCriterion("sys_user <=", value, "sysUser");
            return (Criteria) this;
        }

        public Criteria andSysUserIn(List<Long> values) {
            addCriterion("sys_user in", values, "sysUser");
            return (Criteria) this;
        }

        public Criteria andSysUserNotIn(List<Long> values) {
            addCriterion("sys_user not in", values, "sysUser");
            return (Criteria) this;
        }

        public Criteria andSysUserBetween(Long value1, Long value2) {
            addCriterion("sys_user between", value1, value2, "sysUser");
            return (Criteria) this;
        }

        public Criteria andSysUserNotBetween(Long value1, Long value2) {
            addCriterion("sys_user not between", value1, value2, "sysUser");
            return (Criteria) this;
        }

        public Criteria andESignIdIsNull() {
            addCriterion("e_sign_id is null");
            return (Criteria) this;
        }

        public Criteria andESignIdIsNotNull() {
            addCriterion("e_sign_id is not null");
            return (Criteria) this;
        }

        public Criteria andESignIdEqualTo(Long value) {
            addCriterion("e_sign_id =", value, "eSignId");
            return (Criteria) this;
        }

        public Criteria andESignIdNotEqualTo(Long value) {
            addCriterion("e_sign_id <>", value, "eSignId");
            return (Criteria) this;
        }

        public Criteria andESignIdGreaterThan(Long value) {
            addCriterion("e_sign_id >", value, "eSignId");
            return (Criteria) this;
        }

        public Criteria andESignIdGreaterThanOrEqualTo(Long value) {
            addCriterion("e_sign_id >=", value, "eSignId");
            return (Criteria) this;
        }

        public Criteria andESignIdLessThan(Long value) {
            addCriterion("e_sign_id <", value, "eSignId");
            return (Criteria) this;
        }

        public Criteria andESignIdLessThanOrEqualTo(Long value) {
            addCriterion("e_sign_id <=", value, "eSignId");
            return (Criteria) this;
        }

        public Criteria andESignIdIn(List<Long> values) {
            addCriterion("e_sign_id in", values, "eSignId");
            return (Criteria) this;
        }

        public Criteria andESignIdNotIn(List<Long> values) {
            addCriterion("e_sign_id not in", values, "eSignId");
            return (Criteria) this;
        }

        public Criteria andESignIdBetween(Long value1, Long value2) {
            addCriterion("e_sign_id between", value1, value2, "eSignId");
            return (Criteria) this;
        }

        public Criteria andESignIdNotBetween(Long value1, Long value2) {
            addCriterion("e_sign_id not between", value1, value2, "eSignId");
            return (Criteria) this;
        }

        public Criteria andEntityTypeIsNull() {
            addCriterion("entity_type is null");
            return (Criteria) this;
        }

        public Criteria andEntityTypeIsNotNull() {
            addCriterion("entity_type is not null");
            return (Criteria) this;
        }

        public Criteria andEntityTypeEqualTo(Integer value) {
            addCriterion("entity_type =", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeNotEqualTo(Integer value) {
            addCriterion("entity_type <>", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeGreaterThan(Integer value) {
            addCriterion("entity_type >", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("entity_type >=", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeLessThan(Integer value) {
            addCriterion("entity_type <", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeLessThanOrEqualTo(Integer value) {
            addCriterion("entity_type <=", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeIn(List<Integer> values) {
            addCriterion("entity_type in", values, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeNotIn(List<Integer> values) {
            addCriterion("entity_type not in", values, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeBetween(Integer value1, Integer value2) {
            addCriterion("entity_type between", value1, value2, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("entity_type not between", value1, value2, "entityType");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table app_auth_log
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
     * This class corresponds to the database table app_auth_log
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