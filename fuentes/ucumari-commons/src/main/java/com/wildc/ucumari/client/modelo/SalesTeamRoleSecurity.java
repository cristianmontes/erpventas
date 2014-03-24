/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.security.model.SecurityGroup;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "sales_team_role_security")
@NamedQueries({
    @NamedQuery(name = "SalesTeamRoleSecurity.findAll", query = "SELECT s FROM SalesTeamRoleSecurity s")})
public class SalesTeamRoleSecurity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SECURITY_GROUP_ID")
    private String securityGroupId;
    @Column(name = "ROLE_DESCRIPTION")
    private String roleDescription;
    @Column(name = "SEQUENCE_NUM")
    private BigInteger sequenceNum;
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
    @JoinColumn(name = "SECURITY_GROUP_ID", referencedColumnName = "GROUP_ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private SecurityGroup securityGroup;

    public SalesTeamRoleSecurity() {
    }

    public SalesTeamRoleSecurity(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public String getRoleDescription() {
        return roleDescription;
    }

    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
    }

    public BigInteger getSequenceNum() {
        return sequenceNum;
    }

    public void setSequenceNum(BigInteger sequenceNum) {
        this.sequenceNum = sequenceNum;
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
        hash += (securityGroupId != null ? securityGroupId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SalesTeamRoleSecurity)) {
            return false;
        }
        SalesTeamRoleSecurity other = (SalesTeamRoleSecurity) object;
        if ((this.securityGroupId == null && other.securityGroupId != null) || (this.securityGroupId != null && !this.securityGroupId.equals(other.securityGroupId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.SalesTeamRoleSecurity[ securityGroupId=" + securityGroupId + " ]";
    }
    
}
