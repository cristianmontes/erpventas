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

import com.wildc.ucumari.contact.model.ContactMech;
import com.wildc.ucumari.contact.model.ContactMechPurposeType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "party_contact_mech_purpose")
public class PartyContactMechPurpose implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PartyContactMechPurposePK partyContactMechPurposePK;
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
    @JoinColumn(name = "CONTACT_MECH_PURPOSE_TYPE_ID", referencedColumnName = "CONTACT_MECH_PURPOSE_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ContactMechPurposeType contactMechPurposeType;
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Party party;
    @JoinColumn(name = "CONTACT_MECH_ID", referencedColumnName = "CONTACT_MECH_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ContactMech contactMech;

    public PartyContactMechPurpose() {
    }

    public PartyContactMechPurpose(PartyContactMechPurposePK partyContactMechPurposePK) {
        this.partyContactMechPurposePK = partyContactMechPurposePK;
    }

    public PartyContactMechPurpose(String partyId, String contactMechId, String contactMechPurposeTypeId, Date fromDate) {
        this.partyContactMechPurposePK = new PartyContactMechPurposePK(partyId, contactMechId, contactMechPurposeTypeId, fromDate);
    }

    public PartyContactMechPurposePK getPartyContactMechPurposePK() {
        return partyContactMechPurposePK;
    }

    public void setPartyContactMechPurposePK(PartyContactMechPurposePK partyContactMechPurposePK) {
        this.partyContactMechPurposePK = partyContactMechPurposePK;
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

    public ContactMechPurposeType getContactMechPurposeType() {
        return contactMechPurposeType;
    }

    public void setContactMechPurposeType(ContactMechPurposeType contactMechPurposeType) {
        this.contactMechPurposeType = contactMechPurposeType;
    }

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    public ContactMech getContactMech() {
        return contactMech;
    }

    public void setContactMech(ContactMech contactMech) {
        this.contactMech = contactMech;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (partyContactMechPurposePK != null ? partyContactMechPurposePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PartyContactMechPurpose)) {
            return false;
        }
        PartyContactMechPurpose other = (PartyContactMechPurpose) object;
        if ((this.partyContactMechPurposePK == null && other.partyContactMechPurposePK != null) || (this.partyContactMechPurposePK != null && !this.partyContactMechPurposePK.equals(other.partyContactMechPurposePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PartyContactMechPurpose[ partyContactMechPurposePK=" + partyContactMechPurposePK + " ]";
    }
    
}
