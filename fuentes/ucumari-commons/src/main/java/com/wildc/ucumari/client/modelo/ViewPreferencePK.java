/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class ViewPreferencePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "VIEW_PREF_TYPE_ID")
    private String viewPrefTypeId;
    @Basic(optional = false)
    @Column(name = "USER_LOGIN_ID")
    private String userLoginId;

    public ViewPreferencePK() {
    }

    public ViewPreferencePK(String viewPrefTypeId, String userLoginId) {
        this.viewPrefTypeId = viewPrefTypeId;
        this.userLoginId = userLoginId;
    }

    public String getViewPrefTypeId() {
        return viewPrefTypeId;
    }

    public void setViewPrefTypeId(String viewPrefTypeId) {
        this.viewPrefTypeId = viewPrefTypeId;
    }

    public String getUserLoginId() {
        return userLoginId;
    }

    public void setUserLoginId(String userLoginId) {
        this.userLoginId = userLoginId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (viewPrefTypeId != null ? viewPrefTypeId.hashCode() : 0);
        hash += (userLoginId != null ? userLoginId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ViewPreferencePK)) {
            return false;
        }
        ViewPreferencePK other = (ViewPreferencePK) object;
        if ((this.viewPrefTypeId == null && other.viewPrefTypeId != null) || (this.viewPrefTypeId != null && !this.viewPrefTypeId.equals(other.viewPrefTypeId))) {
            return false;
        }
        if ((this.userLoginId == null && other.userLoginId != null) || (this.userLoginId != null && !this.userLoginId.equals(other.userLoginId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ViewPreferencePK[ viewPrefTypeId=" + viewPrefTypeId + ", userLoginId=" + userLoginId + " ]";
    }
    
}
