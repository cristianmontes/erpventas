/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.party.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "party_qual_type")
@NamedQueries({
    @NamedQuery(name = "PartyQualType.findAll", query = "SELECT p FROM PartyQualType p")})
public class PartyQualType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PARTY_QUAL_TYPE_ID")
    private String partyQualTypeId;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "partyQualType")
    private List<PartyQual> partyQualList;
    @OneToMany(mappedBy = "parentTypeId")
    private List<PartyQualType> partyQualTypeList;
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "PARTY_QUAL_TYPE_ID")
    @ManyToOne
    private PartyQualType parentTypeId;

    public PartyQualType() {
    }

    public PartyQualType(String partyQualTypeId) {
        this.partyQualTypeId = partyQualTypeId;
    }

    public String getPartyQualTypeId() {
        return partyQualTypeId;
    }

    public void setPartyQualTypeId(String partyQualTypeId) {
        this.partyQualTypeId = partyQualTypeId;
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

    public List<PartyQual> getPartyQualList() {
        return partyQualList;
    }

    public void setPartyQualList(List<PartyQual> partyQualList) {
        this.partyQualList = partyQualList;
    }

    public List<PartyQualType> getPartyQualTypeList() {
        return partyQualTypeList;
    }

    public void setPartyQualTypeList(List<PartyQualType> partyQualTypeList) {
        this.partyQualTypeList = partyQualTypeList;
    }

    public PartyQualType getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(PartyQualType parentTypeId) {
        this.parentTypeId = parentTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (partyQualTypeId != null ? partyQualTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PartyQualType)) {
            return false;
        }
        PartyQualType other = (PartyQualType) object;
        if ((this.partyQualTypeId == null && other.partyQualTypeId != null) || (this.partyQualTypeId != null && !this.partyQualTypeId.equals(other.partyQualTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PartyQualType[ partyQualTypeId=" + partyQualTypeId + " ]";
    }
    
}
