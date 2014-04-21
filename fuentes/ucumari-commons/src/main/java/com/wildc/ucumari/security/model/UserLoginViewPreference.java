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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "user_login_view_preference")
public class UserLoginViewPreference implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UserLoginViewPreferencePK userLoginViewPreferencePK;
    @Column(name = "PREFERENCE_VALUE")
    private String preferenceValue;
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

    public UserLoginViewPreference() {
    }

    public UserLoginViewPreference(UserLoginViewPreferencePK userLoginViewPreferencePK) {
        this.userLoginViewPreferencePK = userLoginViewPreferencePK;
    }

    public UserLoginViewPreference(String userLoginId, String applicationName, String screenName, String preferenceName) {
        this.userLoginViewPreferencePK = new UserLoginViewPreferencePK(userLoginId, applicationName, screenName, preferenceName);
    }

    public UserLoginViewPreferencePK getUserLoginViewPreferencePK() {
        return userLoginViewPreferencePK;
    }

    public void setUserLoginViewPreferencePK(UserLoginViewPreferencePK userLoginViewPreferencePK) {
        this.userLoginViewPreferencePK = userLoginViewPreferencePK;
    }

    public String getPreferenceValue() {
        return preferenceValue;
    }

    public void setPreferenceValue(String preferenceValue) {
        this.preferenceValue = preferenceValue;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userLoginViewPreferencePK != null ? userLoginViewPreferencePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserLoginViewPreference)) {
            return false;
        }
        UserLoginViewPreference other = (UserLoginViewPreference) object;
        if ((this.userLoginViewPreferencePK == null && other.userLoginViewPreferencePK != null) || (this.userLoginViewPreferencePK != null && !this.userLoginViewPreferencePK.equals(other.userLoginViewPreferencePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.UserLoginViewPreference[ userLoginViewPreferencePK=" + userLoginViewPreferencePK + " ]";
    }
    
}
