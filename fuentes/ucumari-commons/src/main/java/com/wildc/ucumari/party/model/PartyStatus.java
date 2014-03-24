/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.party.model;

import com.wildc.ucumari.parameters.model.StatusItem;

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
@Table(name = "party_status")
@NamedQueries({
    @NamedQuery(name = "PartyStatus.findAll", query = "SELECT p FROM PartyStatus p")})
public class PartyStatus implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PartyStatusPK partyStatusPK;
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
    @JoinColumn(name = "STATUS_ID", referencedColumnName = "STATUS_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private StatusItem statusItem;
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Party party;

    public PartyStatus() {
    }

    public PartyStatus(PartyStatusPK partyStatusPK) {
        this.partyStatusPK = partyStatusPK;
    }

    public PartyStatus(String statusId, String partyId, Date statusDate) {
        this.partyStatusPK = new PartyStatusPK(statusId, partyId, statusDate);
    }

    public PartyStatusPK getPartyStatusPK() {
        return partyStatusPK;
    }

    public void setPartyStatusPK(PartyStatusPK partyStatusPK) {
        this.partyStatusPK = partyStatusPK;
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

    public StatusItem getStatusItem() {
        return statusItem;
    }

    public void setStatusItem(StatusItem statusItem) {
        this.statusItem = statusItem;
    }

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (partyStatusPK != null ? partyStatusPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PartyStatus)) {
            return false;
        }
        PartyStatus other = (PartyStatus) object;
        if ((this.partyStatusPK == null && other.partyStatusPK != null) || (this.partyStatusPK != null && !this.partyStatusPK.equals(other.partyStatusPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PartyStatus[ partyStatusPK=" + partyStatusPK + " ]";
    }
    
}
