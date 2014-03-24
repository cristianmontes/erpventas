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
@Table(name = "party_classification_type")
public class PartyClassificationType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PARTY_CLASSIFICATION_TYPE_ID")
    private String partyClassificationTypeId;
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
    /*@OneToMany(mappedBy = "parentTypeId")
    private List<PartyClassificationType> partyClassificationTypeList;*/
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "PARTY_CLASSIFICATION_TYPE_ID")
    @ManyToOne
    private PartyClassificationType parentTypeId;
    /*@OneToMany(mappedBy = "partyClassificationTypeId")
    private List<PartyClassificationGroup> partyClassificationGroupList;*/

    public PartyClassificationType() {
    }

    public PartyClassificationType(String partyClassificationTypeId) {
        this.partyClassificationTypeId = partyClassificationTypeId;
    }

    public String getPartyClassificationTypeId() {
        return partyClassificationTypeId;
    }

    public void setPartyClassificationTypeId(String partyClassificationTypeId) {
        this.partyClassificationTypeId = partyClassificationTypeId;
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
    public List<PartyClassificationType> getPartyClassificationTypeList() {
        return partyClassificationTypeList;
    }

    public void setPartyClassificationTypeList(List<PartyClassificationType> partyClassificationTypeList) {
        this.partyClassificationTypeList = partyClassificationTypeList;
    }*/

    public PartyClassificationType getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(PartyClassificationType parentTypeId) {
        this.parentTypeId = parentTypeId;
    }
/*
    public List<PartyClassificationGroup> getPartyClassificationGroupList() {
        return partyClassificationGroupList;
    }

    public void setPartyClassificationGroupList(List<PartyClassificationGroup> partyClassificationGroupList) {
        this.partyClassificationGroupList = partyClassificationGroupList;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (partyClassificationTypeId != null ? partyClassificationTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PartyClassificationType)) {
            return false;
        }
        PartyClassificationType other = (PartyClassificationType) object;
        if ((this.partyClassificationTypeId == null && other.partyClassificationTypeId != null) || (this.partyClassificationTypeId != null && !this.partyClassificationTypeId.equals(other.partyClassificationTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PartyClassificationType[ partyClassificationTypeId=" + partyClassificationTypeId + " ]";
    }
    
}
