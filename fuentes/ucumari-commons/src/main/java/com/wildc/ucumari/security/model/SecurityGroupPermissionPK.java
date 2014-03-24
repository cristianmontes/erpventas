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
public class SecurityGroupPermissionPK implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -3749949213718034660L;
	@Basic(optional = false)
    @Column(name = "GROUP_ID")
    private String groupId;
    @Basic(optional = false)
    @Column(name = "PERMISSION_ID")
    private String permissionId;

    public SecurityGroupPermissionPK() {
    }

    public SecurityGroupPermissionPK(String groupId, String permissionId) {
        this.groupId = groupId;
        this.permissionId = permissionId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (groupId != null ? groupId.hashCode() : 0);
        hash += (permissionId != null ? permissionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SecurityGroupPermissionPK)) {
            return false;
        }
        SecurityGroupPermissionPK other = (SecurityGroupPermissionPK) object;
        if ((this.groupId == null && other.groupId != null) || (this.groupId != null && !this.groupId.equals(other.groupId))) {
            return false;
        }
        if ((this.permissionId == null && other.permissionId != null) || (this.permissionId != null && !this.permissionId.equals(other.permissionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.SecurityGroupPermissionPK[ groupId=" + groupId + ", permissionId=" + permissionId + " ]";
    }
    
}
