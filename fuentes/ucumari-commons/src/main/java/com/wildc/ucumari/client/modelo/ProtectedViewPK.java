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
public class ProtectedViewPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "GROUP_ID")
    private String groupId;
    @Basic(optional = false)
    @Column(name = "VIEW_NAME_ID")
    private String viewNameId;

    public ProtectedViewPK() {
    }

    public ProtectedViewPK(String groupId, String viewNameId) {
        this.groupId = groupId;
        this.viewNameId = viewNameId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getViewNameId() {
        return viewNameId;
    }

    public void setViewNameId(String viewNameId) {
        this.viewNameId = viewNameId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (groupId != null ? groupId.hashCode() : 0);
        hash += (viewNameId != null ? viewNameId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProtectedViewPK)) {
            return false;
        }
        ProtectedViewPK other = (ProtectedViewPK) object;
        if ((this.groupId == null && other.groupId != null) || (this.groupId != null && !this.groupId.equals(other.groupId))) {
            return false;
        }
        if ((this.viewNameId == null && other.viewNameId != null) || (this.viewNameId != null && !this.viewNameId.equals(other.viewNameId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProtectedViewPK[ groupId=" + groupId + ", viewNameId=" + viewNameId + " ]";
    }
    
}
