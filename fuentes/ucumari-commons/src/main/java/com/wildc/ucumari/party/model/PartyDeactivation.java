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
@Table(name = "party_deactivation")
@NamedQueries({
    @NamedQuery(name = "PartyDeactivation.findAll", query = "SELECT p FROM PartyDeactivation p")})
public class PartyDeactivation implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PartyDeactivationPK partyDeactivationPK;
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

    public PartyDeactivation() {
    }

    public PartyDeactivation(PartyDeactivationPK partyDeactivationPK) {
        this.partyDeactivationPK = partyDeactivationPK;
    }

    public PartyDeactivation(String partyId, Date deactivationTimestamp) {
        this.partyDeactivationPK = new PartyDeactivationPK(partyId, deactivationTimestamp);
    }

    public PartyDeactivationPK getPartyDeactivationPK() {
        return partyDeactivationPK;
    }

    public void setPartyDeactivationPK(PartyDeactivationPK partyDeactivationPK) {
        this.partyDeactivationPK = partyDeactivationPK;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (partyDeactivationPK != null ? partyDeactivationPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PartyDeactivation)) {
            return false;
        }
        PartyDeactivation other = (PartyDeactivation) object;
        if ((this.partyDeactivationPK == null && other.partyDeactivationPK != null) || (this.partyDeactivationPK != null && !this.partyDeactivationPK.equals(other.partyDeactivationPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PartyDeactivation[ partyDeactivationPK=" + partyDeactivationPK + " ]";
    }
    
}
