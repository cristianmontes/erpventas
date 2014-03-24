/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import com.wildc.ucumari.security.model.UserLogin;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "service_test_record")
@NamedQueries({
    @NamedQuery(name = "ServiceTestRecord.findAll", query = "SELECT s FROM ServiceTestRecord s")})
public class ServiceTestRecord implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ServiceTestRecordPK serviceTestRecordPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALUE1")
    private BigDecimal value1;
    @Column(name = "VALUE2")
    private BigDecimal value2;
    @Column(name = "TEST_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date testTimestamp;
    @Column(name = "LAST_UPDATED_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdatedStamp;
    @Column(name = "LAST_UPDATED_TX_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdatedTxStamp;
    @Column(name = "CREATED_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdStamp;
    @Column(name = "CREATED_TX_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdTxStamp;
    @JoinColumn(name = "MODIFIED_BY_USER_LOGIN", referencedColumnName = "USER_LOGIN_ID")
    @ManyToOne
    private UserLogin modifiedByUserLogin;
    @JoinColumn(name = "CREATED_BY_USER_LOGIN", referencedColumnName = "USER_LOGIN_ID")
    @ManyToOne
    private UserLogin createdByUserLogin;

    public ServiceTestRecord() {
    }

    public ServiceTestRecord(ServiceTestRecordPK serviceTestRecordPK) {
        this.serviceTestRecordPK = serviceTestRecordPK;
    }

    public ServiceTestRecord(String key1, String key2) {
        this.serviceTestRecordPK = new ServiceTestRecordPK(key1, key2);
    }

    public ServiceTestRecordPK getServiceTestRecordPK() {
        return serviceTestRecordPK;
    }

    public void setServiceTestRecordPK(ServiceTestRecordPK serviceTestRecordPK) {
        this.serviceTestRecordPK = serviceTestRecordPK;
    }

    public BigDecimal getValue1() {
        return value1;
    }

    public void setValue1(BigDecimal value1) {
        this.value1 = value1;
    }

    public BigDecimal getValue2() {
        return value2;
    }

    public void setValue2(BigDecimal value2) {
        this.value2 = value2;
    }

    public Date getTestTimestamp() {
        return testTimestamp;
    }

    public void setTestTimestamp(Date testTimestamp) {
        this.testTimestamp = testTimestamp;
    }

    public Date getLastUpdatedStamp() {
        return lastUpdatedStamp;
    }

    public void setLastUpdatedStamp(Date lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }

    public Date getLastUpdatedTxStamp() {
        return lastUpdatedTxStamp;
    }

    public void setLastUpdatedTxStamp(Date lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }

    public Date getCreatedStamp() {
        return createdStamp;
    }

    public void setCreatedStamp(Date createdStamp) {
        this.createdStamp = createdStamp;
    }

    public Date getCreatedTxStamp() {
        return createdTxStamp;
    }

    public void setCreatedTxStamp(Date createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }

    public UserLogin getModifiedByUserLogin() {
        return modifiedByUserLogin;
    }

    public void setModifiedByUserLogin(UserLogin modifiedByUserLogin) {
        this.modifiedByUserLogin = modifiedByUserLogin;
    }

    public UserLogin getCreatedByUserLogin() {
        return createdByUserLogin;
    }

    public void setCreatedByUserLogin(UserLogin createdByUserLogin) {
        this.createdByUserLogin = createdByUserLogin;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (serviceTestRecordPK != null ? serviceTestRecordPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ServiceTestRecord)) {
            return false;
        }
        ServiceTestRecord other = (ServiceTestRecord) object;
        if ((this.serviceTestRecordPK == null && other.serviceTestRecordPK != null) || (this.serviceTestRecordPK != null && !this.serviceTestRecordPK.equals(other.serviceTestRecordPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ServiceTestRecord[ serviceTestRecordPK=" + serviceTestRecordPK + " ]";
    }
    
}
