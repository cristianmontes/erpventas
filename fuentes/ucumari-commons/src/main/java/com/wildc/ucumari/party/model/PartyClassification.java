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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "party_classification")
@NamedQueries({
    @NamedQuery(name = "PartyClassification.findAll", query = "SELECT p FROM PartyClassification p")})
public class PartyClassification implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PartyClassificationPK partyClassificationPK;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
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
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Party party;
    @JoinColumn(name = "PARTY_CLASSIFICATION_GROUP_ID", referencedColumnName = "PARTY_CLASSIFICATION_GROUP_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private PartyClassificationGroup partyClassificationGroup;

    public PartyClassification() {
    }

    public PartyClassification(PartyClassificationPK partyClassificationPK) {
        this.partyClassificationPK = partyClassificationPK;
    }

    public PartyClassification(String partyId, String partyClassificationGroupId, Date fromDate) {
        this.partyClassificationPK = new PartyClassificationPK(partyId, partyClassificationGroupId, fromDate);
    }

    public PartyClassificationPK getPartyClassificationPK() {
        return partyClassificationPK;
    }

    public void setPartyClassificationPK(PartyClassificationPK partyClassificationPK) {
        this.partyClassificationPK = partyClassificationPK;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
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

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    public PartyClassificationGroup getPartyClassificationGroup() {
        return partyClassificationGroup;
    }

    public void setPartyClassificationGroup(PartyClassificationGroup partyClassificationGroup) {
        this.partyClassificationGroup = partyClassificationGroup;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (partyClassificationPK != null ? partyClassificationPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PartyClassification)) {
            return false;
        }
        PartyClassification other = (PartyClassification) object;
        if ((this.partyClassificationPK == null && other.partyClassificationPK != null) || (this.partyClassificationPK != null && !this.partyClassificationPK.equals(other.partyClassificationPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PartyClassification[ partyClassificationPK=" + partyClassificationPK + " ]";
    }
    
}
