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
@Table(name = "security_permission_option")
public class SecurityPermissionOption implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SecurityPermissionOptionPK securityPermissionOptionPK;
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
    @JoinColumn(name = "OPTION_ID", referencedColumnName = "OPTION_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private SystemOption systemOption;
    @JoinColumn(name = "PERMISSION_ID", referencedColumnName = "PERMISSION_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private SecurityPermission securityPermission;

    public SecurityPermissionOption() {
    }

    public SecurityPermissionOption(SecurityPermissionOptionPK securityPermissionOptionPK) {
        this.securityPermissionOptionPK = securityPermissionOptionPK;
    }

    public SecurityPermissionOption(String optionId, String permissionId) {
        this.securityPermissionOptionPK = new SecurityPermissionOptionPK(optionId, permissionId);
    }

    public SecurityPermissionOptionPK getSecurityPermissionOptionPK() {
        return securityPermissionOptionPK;
    }

    public void setSecurityPermissionOptionPK(SecurityPermissionOptionPK securityPermissionOptionPK) {
        this.securityPermissionOptionPK = securityPermissionOptionPK;
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

    public SystemOption getSystemOptionp() {
        return systemOption;
    }

    public void setSecurityGroup(SystemOption systemOption) {
        this.systemOption = systemOption;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (securityPermissionOptionPK != null ? securityPermissionOptionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SecurityPermissionOption)) {
            return false;
        }
        SecurityPermissionOption other = (SecurityPermissionOption) object;
        if ((this.securityPermissionOptionPK == null && other.securityPermissionOptionPK != null) || (this.securityPermissionOptionPK != null && !this.securityPermissionOptionPK.equals(other.securityPermissionOptionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.SecurityPermissionOption[ securityPermissionOptionPK=" + securityPermissionOptionPK + " ]";
    }

	public SecurityPermission getSecurityPermission() {
		return securityPermission;
	}

	public void setSecurityPermission(SecurityPermission securityPermission) {
		this.securityPermission = securityPermission;
	}
    
    
}
