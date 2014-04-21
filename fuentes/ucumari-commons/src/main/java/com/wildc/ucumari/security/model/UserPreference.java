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
@Table(name = "user_preference")

public class UserPreference implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UserPreferencePK userPreferencePK;
    @Column(name = "USER_PREF_GROUP_TYPE_ID")
    private String userPrefGroupTypeId;
    @Column(name = "USER_PREF_VALUE")
    private String userPrefValue;
    @Column(name = "USER_PREF_DATA_TYPE")
    private String userPrefDataType;
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

    public UserPreference() {
    }

    public UserPreference(UserPreferencePK userPreferencePK) {
        this.userPreferencePK = userPreferencePK;
    }

    public UserPreference(String userLoginId, String userPrefTypeId) {
        this.userPreferencePK = new UserPreferencePK(userLoginId, userPrefTypeId);
    }

    public UserPreferencePK getUserPreferencePK() {
        return userPreferencePK;
    }

    public void setUserPreferencePK(UserPreferencePK userPreferencePK) {
        this.userPreferencePK = userPreferencePK;
    }

    public String getUserPrefGroupTypeId() {
        return userPrefGroupTypeId;
    }

    public void setUserPrefGroupTypeId(String userPrefGroupTypeId) {
        this.userPrefGroupTypeId = userPrefGroupTypeId;
    }

    public String getUserPrefValue() {
        return userPrefValue;
    }

    public void setUserPrefValue(String userPrefValue) {
        this.userPrefValue = userPrefValue;
    }

    public String getUserPrefDataType() {
        return userPrefDataType;
    }

    public void setUserPrefDataType(String userPrefDataType) {
        this.userPrefDataType = userPrefDataType;
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
        hash += (userPreferencePK != null ? userPreferencePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserPreference)) {
            return false;
        }
        UserPreference other = (UserPreference) object;
        if ((this.userPreferencePK == null && other.userPreferencePK != null) || (this.userPreferencePK != null && !this.userPreferencePK.equals(other.userPreferencePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.UserPreference[ userPreferencePK=" + userPreferencePK + " ]";
    }
    
}
