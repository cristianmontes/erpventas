/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import com.wildc.ucumari.contact.model.ContactMech;
import com.wildc.ucumari.custrequest.model.CustRequest;
import com.wildc.ucumari.party.model.Party;
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
@Table(name = "responding_party")
@NamedQueries({
    @NamedQuery(name = "RespondingParty.findAll", query = "SELECT r FROM RespondingParty r")})
public class RespondingParty implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RespondingPartyPK respondingPartyPK;
    @Column(name = "DATE_SENT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateSent;
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
    @JoinColumn(name = "CUST_REQUEST_ID", referencedColumnName = "CUST_REQUEST_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private CustRequest custRequest;
    @JoinColumn(name = "CONTACT_MECH_ID", referencedColumnName = "CONTACT_MECH_ID")
    @ManyToOne
    private ContactMech contactMechId;

    public RespondingParty() {
    }

    public RespondingParty(RespondingPartyPK respondingPartyPK) {
        this.respondingPartyPK = respondingPartyPK;
    }

    public RespondingParty(String respondingPartySeqId, String custRequestId, String partyId) {
        this.respondingPartyPK = new RespondingPartyPK(respondingPartySeqId, custRequestId, partyId);
    }

    public RespondingPartyPK getRespondingPartyPK() {
        return respondingPartyPK;
    }

    public void setRespondingPartyPK(RespondingPartyPK respondingPartyPK) {
        this.respondingPartyPK = respondingPartyPK;
    }

    public Date getDateSent() {
        return dateSent;
    }

    public void setDateSent(Date dateSent) {
        this.dateSent = dateSent;
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

    public CustRequest getCustRequest() {
        return custRequest;
    }

    public void setCustRequest(CustRequest custRequest) {
        this.custRequest = custRequest;
    }

    public ContactMech getContactMechId() {
        return contactMechId;
    }

    public void setContactMechId(ContactMech contactMechId) {
        this.contactMechId = contactMechId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (respondingPartyPK != null ? respondingPartyPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RespondingParty)) {
            return false;
        }
        RespondingParty other = (RespondingParty) object;
        if ((this.respondingPartyPK == null && other.respondingPartyPK != null) || (this.respondingPartyPK != null && !this.respondingPartyPK.equals(other.respondingPartyPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.RespondingParty[ respondingPartyPK=" + respondingPartyPK + " ]";
    }
    
}
