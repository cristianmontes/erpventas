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
public class SecurityPermissionOptionPK implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -3749949213718034660L;
	@Basic(optional = false)
    @Column(name = "OPTION_ID")
    private String optionId;
    @Basic(optional = false)
    @Column(name = "PERMISSION_ID")
    private String permissionId;

    public SecurityPermissionOptionPK() {
    }

    public SecurityPermissionOptionPK(String optionId, String permissionId) {
        this.optionId = optionId;
        this.permissionId = permissionId;
    }

    public String getOptionId() {
        return optionId;
    }

    public void setOptionId(String groupId) {
        this.optionId = groupId;
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
        hash += (optionId != null ? optionId.hashCode() : 0);
        hash += (permissionId != null ? permissionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SecurityPermissionOptionPK)) {
            return false;
        }
        SecurityPermissionOptionPK other = (SecurityPermissionOptionPK) object;
        if ((this.optionId == null && other.optionId != null) || (this.optionId != null && !this.optionId.equals(other.optionId))) {
            return false;
        }
        if ((this.permissionId == null && other.permissionId != null) || (this.permissionId != null && !this.permissionId.equals(other.permissionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.SecurityGroupPermissionPK[ optionId=" + optionId + ", permissionId=" + permissionId + " ]";
    }
    
}
