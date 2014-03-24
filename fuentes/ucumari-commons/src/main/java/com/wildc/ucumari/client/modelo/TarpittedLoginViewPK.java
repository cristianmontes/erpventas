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
public class TarpittedLoginViewPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "VIEW_NAME_ID")
    private String viewNameId;
    @Basic(optional = false)
    @Column(name = "USER_LOGIN_ID")
    private String userLoginId;

    public TarpittedLoginViewPK() {
    }

    public TarpittedLoginViewPK(String viewNameId, String userLoginId) {
        this.viewNameId = viewNameId;
        this.userLoginId = userLoginId;
    }

    public String getViewNameId() {
        return viewNameId;
    }

    public void setViewNameId(String viewNameId) {
        this.viewNameId = viewNameId;
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
        hash += (viewNameId != null ? viewNameId.hashCode() : 0);
        hash += (userLoginId != null ? userLoginId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TarpittedLoginViewPK)) {
            return false;
        }
        TarpittedLoginViewPK other = (TarpittedLoginViewPK) object;
        if ((this.viewNameId == null && other.viewNameId != null) || (this.viewNameId != null && !this.viewNameId.equals(other.viewNameId))) {
            return false;
        }
        if ((this.userLoginId == null && other.userLoginId != null) || (this.userLoginId != null && !this.userLoginId.equals(other.userLoginId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.TarpittedLoginViewPK[ viewNameId=" + viewNameId + ", userLoginId=" + userLoginId + " ]";
    }
    
}
