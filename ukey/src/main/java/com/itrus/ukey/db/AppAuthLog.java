package com.itrus.ukey.db;

import java.util.Date;

public class AppAuthLog {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_auth_log.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_auth_log.auth_time
     *
     * @mbggenerated
     */
    private Date authTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_auth_log.has_b_license
     *
     * @mbggenerated
     */
    private Boolean hasBLicense;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_auth_log.has_legal_r
     *
     * @mbggenerated
     */
    private Boolean hasLegalR;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_auth_log.has_org_code
     *
     * @mbggenerated
     */
    private Boolean hasOrgCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_auth_log.has_tax_cert
     *
     * @mbggenerated
     */
    private Boolean hasTaxCert;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_auth_log.has_user_info
     *
     * @mbggenerated
     */
    private Boolean hasUserInfo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_auth_log.app_id
     *
     * @mbggenerated
     */
    private Long appId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_auth_log.sys_user
     *
     * @mbggenerated
     */
    private Long sysUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_auth_log.e_sign_id
     *
     * @mbggenerated
     */
    private Long eSignId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_auth_log.entity_type
     *
     * @mbggenerated
     */
    private Integer entityType;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_auth_log.id
     *
     * @return the value of app_auth_log.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_auth_log.id
     *
     * @param id the value for app_auth_log.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_auth_log.auth_time
     *
     * @return the value of app_auth_log.auth_time
     *
     * @mbggenerated
     */
    public Date getAuthTime() {
        return authTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_auth_log.auth_time
     *
     * @param authTime the value for app_auth_log.auth_time
     *
     * @mbggenerated
     */
    public void setAuthTime(Date authTime) {
        this.authTime = authTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_auth_log.has_b_license
     *
     * @return the value of app_auth_log.has_b_license
     *
     * @mbggenerated
     */
    public Boolean getHasBLicense() {
        return hasBLicense;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_auth_log.has_b_license
     *
     * @param hasBLicense the value for app_auth_log.has_b_license
     *
     * @mbggenerated
     */
    public void setHasBLicense(Boolean hasBLicense) {
        this.hasBLicense = hasBLicense;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_auth_log.has_legal_r
     *
     * @return the value of app_auth_log.has_legal_r
     *
     * @mbggenerated
     */
    public Boolean getHasLegalR() {
        return hasLegalR;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_auth_log.has_legal_r
     *
     * @param hasLegalR the value for app_auth_log.has_legal_r
     *
     * @mbggenerated
     */
    public void setHasLegalR(Boolean hasLegalR) {
        this.hasLegalR = hasLegalR;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_auth_log.has_org_code
     *
     * @return the value of app_auth_log.has_org_code
     *
     * @mbggenerated
     */
    public Boolean getHasOrgCode() {
        return hasOrgCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_auth_log.has_org_code
     *
     * @param hasOrgCode the value for app_auth_log.has_org_code
     *
     * @mbggenerated
     */
    public void setHasOrgCode(Boolean hasOrgCode) {
        this.hasOrgCode = hasOrgCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_auth_log.has_tax_cert
     *
     * @return the value of app_auth_log.has_tax_cert
     *
     * @mbggenerated
     */
    public Boolean getHasTaxCert() {
        return hasTaxCert;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_auth_log.has_tax_cert
     *
     * @param hasTaxCert the value for app_auth_log.has_tax_cert
     *
     * @mbggenerated
     */
    public void setHasTaxCert(Boolean hasTaxCert) {
        this.hasTaxCert = hasTaxCert;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_auth_log.has_user_info
     *
     * @return the value of app_auth_log.has_user_info
     *
     * @mbggenerated
     */
    public Boolean getHasUserInfo() {
        return hasUserInfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_auth_log.has_user_info
     *
     * @param hasUserInfo the value for app_auth_log.has_user_info
     *
     * @mbggenerated
     */
    public void setHasUserInfo(Boolean hasUserInfo) {
        this.hasUserInfo = hasUserInfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_auth_log.app_id
     *
     * @return the value of app_auth_log.app_id
     *
     * @mbggenerated
     */
    public Long getAppId() {
        return appId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_auth_log.app_id
     *
     * @param appId the value for app_auth_log.app_id
     *
     * @mbggenerated
     */
    public void setAppId(Long appId) {
        this.appId = appId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_auth_log.sys_user
     *
     * @return the value of app_auth_log.sys_user
     *
     * @mbggenerated
     */
    public Long getSysUser() {
        return sysUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_auth_log.sys_user
     *
     * @param sysUser the value for app_auth_log.sys_user
     *
     * @mbggenerated
     */
    public void setSysUser(Long sysUser) {
        this.sysUser = sysUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_auth_log.e_sign_id
     *
     * @return the value of app_auth_log.e_sign_id
     *
     * @mbggenerated
     */
    public Long geteSignId() {
        return eSignId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_auth_log.e_sign_id
     *
     * @param eSignId the value for app_auth_log.e_sign_id
     *
     * @mbggenerated
     */
    public void seteSignId(Long eSignId) {
        this.eSignId = eSignId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_auth_log.entity_type
     *
     * @return the value of app_auth_log.entity_type
     *
     * @mbggenerated
     */
    public Integer getEntityType() {
        return entityType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_auth_log.entity_type
     *
     * @param entityType the value for app_auth_log.entity_type
     *
     * @mbggenerated
     */
    public void setEntityType(Integer entityType) {
        this.entityType = entityType;
    }
}