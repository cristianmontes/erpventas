/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.party.model;

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
@Table(name = "party_relationship")

public class PartyRelationship implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PartyRelationshipPK partyRelationshipPK;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
    @Column(name = "RELATIONSHIP_NAME")
    private String relationshipName;
    @Column(name = "PERMISSIONS_ENUM_ID")
    private String permissionsEnumId;
    @Column(name = "POSITION_TITLE")
    private String positionTitle;
    @Column(name = "COMMENTS")
    private String comments;
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
    @JoinColumn(name = "PARTY_RELATIONSHIP_TYPE_ID", referencedColumnName = "PARTY_RELATIONSHIP_TYPE_ID")
    @ManyToOne
    private PartyRelationshipType partyRelationshipTypeId;
    /*
    @JoinColumns({
        @JoinColumn(name = "PARTY_ID_TO", referencedColumnName = "PARTY_ID", insertable = false, updatable = false),
        @JoinColumn(name = "ROLE_TYPE_ID_TO", referencedColumnName = "ROLE_TYPE_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private PartyRole partyRole;
    @JoinColumn(name = "STATUS_ID", referencedColumnName = "STATUS_ID")
    @ManyToOne
    private StatusItem statusId;
    @JoinColumn(name = "SECURITY_GROUP_ID", referencedColumnName = "GROUP_ID")
    @ManyToOne
    private SecurityGroup securityGroupId;
    @JoinColumn(name = "PRIORITY_TYPE_ID", referencedColumnName = "PRIORITY_TYPE_ID")
    @ManyToOne
    private PriorityType priorityTypeId;
    @JoinColumns({
        @JoinColumn(name = "PARTY_ID_FROM", referencedColumnName = "PARTY_ID", insertable = false, updatable = false),
        @JoinColumn(name = "ROLE_TYPE_ID_FROM", referencedColumnName = "ROLE_TYPE_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private PartyRole partyRole1;*/

    public PartyRelationship() {
    }

    public PartyRelationship(PartyRelationshipPK partyRelationshipPK) {
        this.partyRelationshipPK = partyRelationshipPK;
    }

    public PartyRelationship(String partyIdFrom, String partyIdTo, String roleTypeIdFrom, String roleTypeIdTo, Date fromDate) {
        this.partyRelationshipPK = new PartyRelationshipPK(partyIdFrom, partyIdTo, roleTypeIdFrom, roleTypeIdTo, fromDate);
    }

    public PartyRelationshipPK getPartyRelationshipPK() {
        return partyRelationshipPK;
    }

    public void setPartyRelationshipPK(PartyRelationshipPK partyRelationshipPK) {
        this.partyRelationshipPK = partyRelationshipPK;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
    }

    public String getRelationshipName() {
        return relationshipName;
    }

    public void setRelationshipName(String relationshipName) {
        this.relationshipName = relationshipName;
    }

    public String getPermissionsEnumId() {
        return permissionsEnumId;
    }

    public void setPermissionsEnumId(String permissionsEnumId) {
        this.permissionsEnumId = permissionsEnumId;
    }

    public String getPositionTitle() {
        return positionTitle;
    }

    public void setPositionTitle(String positionTitle) {
        this.positionTitle = positionTitle;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
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

    public PartyRelationshipType getPartyRelationshipTypeId() {
        return partyRelationshipTypeId;
    }

    public void setPartyRelationshipTypeId(PartyRelationshipType partyRelationshipTypeId) {
        this.partyRelationshipTypeId = partyRelationshipTypeId;
    }
/*
    public PartyRole getPartyRole() {
        return partyRole;
    }

    public void setPartyRole(PartyRole partyRole) {
        this.partyRole = partyRole;
    }

    public StatusItem getStatusId() {
        return statusId;
    }

    public void setStatusId(StatusItem statusId) {
        this.statusId = statusId;
    }

    public SecurityGroup getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(SecurityGroup securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public PriorityType getPriorityTypeId() {
        return priorityTypeId;
    }

    public void setPriorityTypeId(PriorityType priorityTypeId) {
        this.priorityTypeId = priorityTypeId;
    }

    public PartyRole getPartyRole1() {
        return partyRole1;
    }

    public void setPartyRole1(PartyRole partyRole1) {
        this.partyRole1 = partyRole1;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (partyRelationshipPK != null ? partyRelationshipPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PartyRelationship)) {
            return false;
        }
        PartyRelationship other = (PartyRelationship) object;
        if ((this.partyRelationshipPK == null && other.partyRelationshipPK != null) || (this.partyRelationshipPK != null && !this.partyRelationshipPK.equals(other.partyRelationshipPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PartyRelationship[ partyRelationshipPK=" + partyRelationshipPK + " ]";
    }
    
}
