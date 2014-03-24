/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.security.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "user_login_security_group")
public class UserLoginSecurityGroup implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UserLoginSecurityGroupPK userLoginSecurityGroupPK;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
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
    @JoinColumn(name = "USER_LOGIN_ID", referencedColumnName = "USER_LOGIN_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private UserLogin userLogin;
    @JoinColumn(name = "GROUP_ID", referencedColumnName = "GROUP_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private SecurityGroup securityGroup;

    public UserLoginSecurityGroup() {
    }

    public UserLoginSecurityGroup(UserLoginSecurityGroupPK userLoginSecurityGroupPK) {
        this.userLoginSecurityGroupPK = userLoginSecurityGroupPK;
    }

    public UserLoginSecurityGroup(String userLoginId, String groupId, Date fromDate) {
        this.userLoginSecurityGroupPK = new UserLoginSecurityGroupPK(userLoginId, groupId, fromDate);
    }

    public UserLoginSecurityGroupPK getUserLoginSecurityGroupPK() {
        return userLoginSecurityGroupPK;
    }

    public void setUserLoginSecurityGroupPK(UserLoginSecurityGroupPK userLoginSecurityGroupPK) {
        this.userLoginSecurityGroupPK = userLoginSecurityGroupPK;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
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

    public UserLogin getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(UserLogin userLogin) {
        this.userLogin = userLogin;
    }

    public SecurityGroup getSecurityGroup() {
        return securityGroup;
    }

    public void setSecurityGroup(SecurityGroup securityGroup) {
        this.securityGroup = securityGroup;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userLoginSecurityGroupPK != null ? userLoginSecurityGroupPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserLoginSecurityGroup)) {
            return false;
        }
        UserLoginSecurityGroup other = (UserLoginSecurityGroup) object;
        if ((this.userLoginSecurityGroupPK == null && other.userLoginSecurityGroupPK != null) || (this.userLoginSecurityGroupPK != null && !this.userLoginSecurityGroupPK.equals(other.userLoginSecurityGroupPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.UserLoginSecurityGroup[ userLoginSecurityGroupPK=" + userLoginSecurityGroupPK + " ]";
    }
    
}
