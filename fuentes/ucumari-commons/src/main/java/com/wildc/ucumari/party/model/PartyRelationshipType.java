/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.party.model;

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
@Table(name = "party_relationship_type")

public class PartyRelationshipType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PARTY_RELATIONSHIP_TYPE_ID")
    private String partyRelationshipTypeId;
    @Column(name = "HAS_TABLE")
    private Character hasTable;
    @Column(name = "PARTY_RELATIONSHIP_NAME")
    private String partyRelationshipName;
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
    @OneToMany(mappedBy = "partyRelationshipTypeId")
    private List<PartyRelationship> partyRelationshipList;
    @JoinColumn(name = "ROLE_TYPE_ID_VALID_TO", referencedColumnName = "ROLE_TYPE_ID")
    @ManyToOne
    private RoleType roleTypeIdValidTo;
    @JoinColumn(name = "ROLE_TYPE_ID_VALID_FROM", referencedColumnName = "ROLE_TYPE_ID")
    @ManyToOne
    private RoleType roleTypeIdValidFrom;
    @OneToMany(mappedBy = "parentTypeId")
    private List<PartyRelationshipType> partyRelationshipTypeList;
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "PARTY_RELATIONSHIP_TYPE_ID")
    @ManyToOne
    private PartyRelationshipType parentTypeId;*/

    public PartyRelationshipType() {
    }

    public PartyRelationshipType(String partyRelationshipTypeId) {
        this.partyRelationshipTypeId = partyRelationshipTypeId;
    }

    public String getPartyRelationshipTypeId() {
        return partyRelationshipTypeId;
    }

    public void setPartyRelationshipTypeId(String partyRelationshipTypeId) {
        this.partyRelationshipTypeId = partyRelationshipTypeId;
    }

    public Character getHasTable() {
        return hasTable;
    }

    public void setHasTable(Character hasTable) {
        this.hasTable = hasTable;
    }

    public String getPartyRelationshipName() {
        return partyRelationshipName;
    }

    public void setPartyRelationshipName(String partyRelationshipName) {
        this.partyRelationshipName = partyRelationshipName;
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

    public RoleType getRoleTypeIdValidTo() {
        return roleTypeIdValidTo;
    }

    public void setRoleTypeIdValidTo(RoleType roleTypeIdValidTo) {
        this.roleTypeIdValidTo = roleTypeIdValidTo;
    }

    public RoleType getRoleTypeIdValidFrom() {
        return roleTypeIdValidFrom;
    }

    public void setRoleTypeIdValidFrom(RoleType roleTypeIdValidFrom) {
        this.roleTypeIdValidFrom = roleTypeIdValidFrom;
    }

    public List<PartyRelationshipType> getPartyRelationshipTypeList() {
        return partyRelationshipTypeList;
    }

    public void setPartyRelationshipTypeList(List<PartyRelationshipType> partyRelationshipTypeList) {
        this.partyRelationshipTypeList = partyRelationshipTypeList;
    }

    public PartyRelationshipType getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(PartyRelationshipType parentTypeId) {
        this.parentTypeId = parentTypeId;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (partyRelationshipTypeId != null ? partyRelationshipTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PartyRelationshipType)) {
            return false;
        }
        PartyRelationshipType other = (PartyRelationshipType) object;
        if ((this.partyRelationshipTypeId == null && other.partyRelationshipTypeId != null) || (this.partyRelationshipTypeId != null && !this.partyRelationshipTypeId.equals(other.partyRelationshipTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PartyRelationshipType[ partyRelationshipTypeId=" + partyRelationshipTypeId + " ]";
    }
    
}
