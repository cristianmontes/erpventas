/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.security.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class UserPreferencePK implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -616775311046547213L;
	@Basic(optional = false)
    @Column(name = "USER_LOGIN_ID")
    private String userLoginId;
    @Basic(optional = false)
    @Column(name = "USER_PREF_TYPE_ID")
    private String userPrefTypeId;

    public UserPreferencePK() {
    }

    public UserPreferencePK(String userLoginId, String userPrefTypeId) {
        this.userLoginId = userLoginId;
        this.userPrefTypeId = userPrefTypeId;
    }

    public String getUserLoginId() {
        return userLoginId;
    }

    public void setUserLoginId(String userLoginId) {
        this.userLoginId = userLoginId;
    }

    public String getUserPrefTypeId() {
        return userPrefTypeId;
    }

    public void setUserPrefTypeId(String userPrefTypeId) {
        this.userPrefTypeId = userPrefTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userLoginId != null ? userLoginId.hashCode() : 0);
        hash += (userPrefTypeId != null ? userPrefTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserPreferencePK)) {
            return false;
        }
        UserPreferencePK other = (UserPreferencePK) object;
        if ((this.userLoginId == null && other.userLoginId != null) || (this.userLoginId != null && !this.userLoginId.equals(other.userLoginId))) {
            return false;
        }
        if ((this.userPrefTypeId == null && other.userPrefTypeId != null) || (this.userPrefTypeId != null && !this.userPrefTypeId.equals(other.userPrefTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.UserPreferencePK[ userLoginId=" + userLoginId + ", userPrefTypeId=" + userPrefTypeId + " ]";
    }
    
}
