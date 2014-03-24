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
@Table(name = "user_login_password_history")
public class UserLoginPasswordHistory implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UserLoginPasswordHistoryPK userLoginPasswordHistoryPK;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
    @Column(name = "CURRENT_PASSWORD")
    private String currentPassword;
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

    public UserLoginPasswordHistory() {
    }

    public UserLoginPasswordHistory(UserLoginPasswordHistoryPK userLoginPasswordHistoryPK) {
        this.userLoginPasswordHistoryPK = userLoginPasswordHistoryPK;
    }

    public UserLoginPasswordHistory(String userLoginId, Date fromDate) {
        this.userLoginPasswordHistoryPK = new UserLoginPasswordHistoryPK(userLoginId, fromDate);
    }

    public UserLoginPasswordHistoryPK getUserLoginPasswordHistoryPK() {
        return userLoginPasswordHistoryPK;
    }

    public void setUserLoginPasswordHistoryPK(UserLoginPasswordHistoryPK userLoginPasswordHistoryPK) {
        this.userLoginPasswordHistoryPK = userLoginPasswordHistoryPK;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
    }

    public String getCurrentPassword() {
        return currentPassword;
    }

    public void setCurrentPassword(String currentPassword) {
        this.currentPassword = currentPassword;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userLoginPasswordHistoryPK != null ? userLoginPasswordHistoryPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserLoginPasswordHistory)) {
            return false;
        }
        UserLoginPasswordHistory other = (UserLoginPasswordHistory) object;
        if ((this.userLoginPasswordHistoryPK == null && other.userLoginPasswordHistoryPK != null) || (this.userLoginPasswordHistoryPK != null && !this.userLoginPasswordHistoryPK.equals(other.userLoginPasswordHistoryPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.UserLoginPasswordHistory[ userLoginPasswordHistoryPK=" + userLoginPasswordHistoryPK + " ]";
    }
    
}
