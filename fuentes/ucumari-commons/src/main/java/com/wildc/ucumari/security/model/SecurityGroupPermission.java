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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "security_group_permission")
public class SecurityGroupPermission implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SecurityGroupPermissionPK securityGroupPermissionPK;
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
    @JoinColumn(name = "GROUP_ID", referencedColumnName = "GROUP_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private SecurityGroup securityGroup;
    @JoinColumn(name = "PERMISSION_ID", referencedColumnName = "PERMISSION_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private SecurityPermission securityPermission;

    public SecurityGroupPermission() {
    }

    public SecurityGroupPermission(SecurityGroupPermissionPK securityGroupPermissionPK) {
        this.securityGroupPermissionPK = securityGroupPermissionPK;
    }

    public SecurityGroupPermission(String groupId, String permissionId) {
        this.securityGroupPermissionPK = new SecurityGroupPermissionPK(groupId, permissionId);
    }

    public SecurityGroupPermissionPK getSecurityGroupPermissionPK() {
        return securityGroupPermissionPK;
    }

    public void setSecurityGroupPermissionPK(SecurityGroupPermissionPK securityGroupPermissionPK) {
        this.securityGroupPermissionPK = securityGroupPermissionPK;
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

    public SecurityGroup getSecurityGroup() {
        return securityGroup;
    }

    public void setSecurityGroup(SecurityGroup securityGroup) {
        this.securityGroup = securityGroup;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (securityGroupPermissionPK != null ? securityGroupPermissionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SecurityGroupPermission)) {
            return false;
        }
        SecurityGroupPermission other = (SecurityGroupPermission) object;
        if ((this.securityGroupPermissionPK == null && other.securityGroupPermissionPK != null) || (this.securityGroupPermissionPK != null && !this.securityGroupPermissionPK.equals(other.securityGroupPermissionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.SecurityGroupPermission[ securityGroupPermissionPK=" + securityGroupPermissionPK + " ]";
    }

	public SecurityPermission getSecurityPermission() {
		return securityPermission;
	}

	public void setSecurityPermission(SecurityPermission securityPermission) {
		this.securityPermission = securityPermission;
	}
    
    
}
