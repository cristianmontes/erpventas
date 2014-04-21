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
public class UserLoginViewPreferencePK implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 2237495476150720219L;
	@Basic(optional = false)
    @Column(name = "USER_LOGIN_ID")
    private String userLoginId;
    @Basic(optional = false)
    @Column(name = "APPLICATION_NAME")
    private String applicationName;
    @Basic(optional = false)
    @Column(name = "SCREEN_NAME")
    private String screenName;
    @Basic(optional = false)
    @Column(name = "PREFERENCE_NAME")
    private String preferenceName;
    
    public UserLoginViewPreferencePK() {
    }

    public UserLoginViewPreferencePK(String userLoginId, String applicationName, String screenName, String preferenceName) {
        this.userLoginId = userLoginId;
        this.applicationName = applicationName;
        this.screenName = screenName;
        this.preferenceName = preferenceName;
    }

    public String getUserLoginId() {
        return userLoginId;
    }

    public void setUserLoginId(String userLoginId) {
        this.userLoginId = userLoginId;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public String getPreferenceName() {
        return preferenceName;
    }

    public void setPreferenceName(String preferenceName) {
        this.preferenceName = preferenceName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userLoginId != null ? userLoginId.hashCode() : 0);
        hash += (applicationName != null ? applicationName.hashCode() : 0);
        hash += (screenName != null ? screenName.hashCode() : 0);
        hash += (preferenceName != null ? preferenceName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserLoginViewPreferencePK)) {
            return false;
        }
        UserLoginViewPreferencePK other = (UserLoginViewPreferencePK) object;
        if ((this.userLoginId == null && other.userLoginId != null) || (this.userLoginId != null && !this.userLoginId.equals(other.userLoginId))) {
            return false;
        }
        if ((this.applicationName == null && other.applicationName != null) || (this.applicationName != null && !this.applicationName.equals(other.applicationName))) {
            return false;
        }
        if ((this.screenName == null && other.screenName != null) || (this.screenName != null && !this.screenName.equals(other.screenName))) {
            return false;
        }
        if ((this.preferenceName == null && other.preferenceName != null) || (this.preferenceName != null && !this.preferenceName.equals(other.preferenceName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.UserLoginViewPreferencePK[ userLoginId=" + userLoginId + ", applicationName=" + applicationName + ", screenName=" + screenName + ", preferenceName=" + preferenceName + " ]";
    }
    
}
