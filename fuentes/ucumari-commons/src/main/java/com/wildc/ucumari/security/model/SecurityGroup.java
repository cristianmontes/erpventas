/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.security.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "security_group")
public class SecurityGroup implements Serializable {
	/*
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "securityGroup")
    private List<SecurityGroupPermission> securityGroupPermissionList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "securityGroup")
    private SalesTeamRoleSecurity salesTeamRoleSecurity;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "securityGroup")
    private List<UserLoginSecurityGroup> userLoginSecurityGroupList;
    */
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "GROUP_ID")
    private String groupId;
    @Column(name = "DESCRIPTION")
    private String description;
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
    /*
    @OneToMany(mappedBy = "securityGroupId")
    private List<PartyRelationship> partyRelationshipList;
    @OneToMany(mappedBy = "securityGroupId")
    private List<PortalPage> portalPageList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "securityGroup")
    private List<ProtectedView> protectedViewList;*/

    public SecurityGroup() {
    }

    public SecurityGroup(String groupId) {
        this.groupId = groupId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
/*
    public List<PartyRelationship> getPartyRelationshipList() {
        return partyRelationshipList;
    }

    public void setPartyRelationshipList(List<PartyRelationship> partyRelationshipList) {
        this.partyRelationshipList = partyRelationshipList;
    }

    public List<PortalPage> getPortalPageList() {
        return portalPageList;
    }

    public void setPortalPageList(List<PortalPage> portalPageList) {
        this.portalPageList = portalPageList;
    }

    public List<ProtectedView> getProtectedViewList() {
        return protectedViewList;
    }

    public void setProtectedViewList(List<ProtectedView> protectedViewList) {
        this.protectedViewList = protectedViewList;
    }
*/
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (groupId != null ? groupId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SecurityGroup)) {
            return false;
        }
        SecurityGroup other = (SecurityGroup) object;
        if ((this.groupId == null && other.groupId != null) || (this.groupId != null && !this.groupId.equals(other.groupId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.SecurityGroup[ groupId=" + groupId + " ]";
    }
/*
    public List<SecurityGroupPermission> getSecurityGroupPermissionList() {
        return securityGroupPermissionList;
    }

    public void setSecurityGroupPermissionList(List<SecurityGroupPermission> securityGroupPermissionList) {
        this.securityGroupPermissionList = securityGroupPermissionList;
    }

    public SalesTeamRoleSecurity getSalesTeamRoleSecurity() {
        return salesTeamRoleSecurity;
    }

    public void setSalesTeamRoleSecurity(SalesTeamRoleSecurity salesTeamRoleSecurity) {
        this.salesTeamRoleSecurity = salesTeamRoleSecurity;
    }

    public List<UserLoginSecurityGroup> getUserLoginSecurityGroupList() {
        return userLoginSecurityGroupList;
    }

    public void setUserLoginSecurityGroupList(List<UserLoginSecurityGroup> userLoginSecurityGroupList) {
        this.userLoginSecurityGroupList = userLoginSecurityGroupList;
    }*/
    
}
