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
@Table(name = "party_type")

public class PartyType implements Serializable {
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "partyType")
    private List<PartyTypeAttr> partyTypeAttrList;
    @OneToMany(mappedBy = "partyTypeId")
    private List<PartyNeed> partyNeedList;*/
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PARTY_TYPE_ID")
    private String partyTypeId;
    @Column(name = "HAS_TABLE")
    private Character hasTable;
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
    @OneToMany(mappedBy = "partyTypeId")
    private List<Party> partyList;
    @OneToMany(mappedBy = "parentTypeId")
    private List<PartyType> partyTypeList;
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "PARTY_TYPE_ID")
    @ManyToOne
    private PartyType parentTypeId;*/

    public PartyType() {
    }

    public PartyType(String partyTypeId) {
        this.partyTypeId = partyTypeId;
    }

    public String getPartyTypeId() {
        return partyTypeId;
    }

    public void setPartyTypeId(String partyTypeId) {
        this.partyTypeId = partyTypeId;
    }

    public Character getHasTable() {
        return hasTable;
    }

    public void setHasTable(Character hasTable) {
        this.hasTable = hasTable;
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
    public List<Party> getPartyList() {
        return partyList;
    }

    public void setPartyList(List<Party> partyList) {
        this.partyList = partyList;
    }

    public List<PartyType> getPartyTypeList() {
        return partyTypeList;
    }

    public void setPartyTypeList(List<PartyType> partyTypeList) {
        this.partyTypeList = partyTypeList;
    }

    public PartyType getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(PartyType parentTypeId) {
        this.parentTypeId = parentTypeId;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (partyTypeId != null ? partyTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PartyType)) {
            return false;
        }
        PartyType other = (PartyType) object;
        if ((this.partyTypeId == null && other.partyTypeId != null) || (this.partyTypeId != null && !this.partyTypeId.equals(other.partyTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PartyType[ partyTypeId=" + partyTypeId + " ]";
    }
/*
    public List<PartyTypeAttr> getPartyTypeAttrList() {
        return partyTypeAttrList;
    }

    public void setPartyTypeAttrList(List<PartyTypeAttr> partyTypeAttrList) {
        this.partyTypeAttrList = partyTypeAttrList;
    }

    public List<PartyNeed> getPartyNeedList() {
        return partyNeedList;
    }

    public void setPartyNeedList(List<PartyNeed> partyNeedList) {
        this.partyNeedList = partyNeedList;
    }*/
    
}
