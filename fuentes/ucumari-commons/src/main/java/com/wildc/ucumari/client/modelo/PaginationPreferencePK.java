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
public class PaginationPreferencePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "USER_LOGIN_ID")
    private String userLoginId;
    @Basic(optional = false)
    @Column(name = "PAGINATOR_NAME")
    private String paginatorName;

    public PaginationPreferencePK() {
    }

    public PaginationPreferencePK(String userLoginId, String paginatorName) {
        this.userLoginId = userLoginId;
        this.paginatorName = paginatorName;
    }

    public String getUserLoginId() {
        return userLoginId;
    }

    public void setUserLoginId(String userLoginId) {
        this.userLoginId = userLoginId;
    }

    public String getPaginatorName() {
        return paginatorName;
    }

    public void setPaginatorName(String paginatorName) {
        this.paginatorName = paginatorName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userLoginId != null ? userLoginId.hashCode() : 0);
        hash += (paginatorName != null ? paginatorName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PaginationPreferencePK)) {
            return false;
        }
        PaginationPreferencePK other = (PaginationPreferencePK) object;
        if ((this.userLoginId == null && other.userLoginId != null) || (this.userLoginId != null && !this.userLoginId.equals(other.userLoginId))) {
            return false;
        }
        if ((this.paginatorName == null && other.paginatorName != null) || (this.paginatorName != null && !this.paginatorName.equals(other.paginatorName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PaginationPreferencePK[ userLoginId=" + userLoginId + ", paginatorName=" + paginatorName + " ]";
    }
    
}
