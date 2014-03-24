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
@Table(name = "party_invitation_group_assoc")
@NamedQueries({
    @NamedQuery(name = "PartyInvitationGroupAssoc.findAll", query = "SELECT p FROM PartyInvitationGroupAssoc p")})
public class PartyInvitationGroupAssoc implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PartyInvitationGroupAssocPK partyInvitationGroupAssocPK;
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
    @JoinColumn(name = "PARTY_ID_TO", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private PartyGroup partyGroup;
    @JoinColumn(name = "PARTY_ID_TO", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Party party;
    @JoinColumn(name = "PARTY_INVITATION_ID", referencedColumnName = "PARTY_INVITATION_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private PartyInvitation partyInvitation;

    public PartyInvitationGroupAssoc() {
    }

    public PartyInvitationGroupAssoc(PartyInvitationGroupAssocPK partyInvitationGroupAssocPK) {
        this.partyInvitationGroupAssocPK = partyInvitationGroupAssocPK;
    }

    public PartyInvitationGroupAssoc(String partyInvitationId, String partyIdTo) {
        this.partyInvitationGroupAssocPK = new PartyInvitationGroupAssocPK(partyInvitationId, partyIdTo);
    }

    public PartyInvitationGroupAssocPK getPartyInvitationGroupAssocPK() {
        return partyInvitationGroupAssocPK;
    }

    public void setPartyInvitationGroupAssocPK(PartyInvitationGroupAssocPK partyInvitationGroupAssocPK) {
        this.partyInvitationGroupAssocPK = partyInvitationGroupAssocPK;
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

    public PartyGroup getPartyGroup() {
        return partyGroup;
    }

    public void setPartyGroup(PartyGroup partyGroup) {
        this.partyGroup = partyGroup;
    }

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    public PartyInvitation getPartyInvitation() {
        return partyInvitation;
    }

    public void setPartyInvitation(PartyInvitation partyInvitation) {
        this.partyInvitation = partyInvitation;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (partyInvitationGroupAssocPK != null ? partyInvitationGroupAssocPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PartyInvitationGroupAssoc)) {
            return false;
        }
        PartyInvitationGroupAssoc other = (PartyInvitationGroupAssoc) object;
        if ((this.partyInvitationGroupAssocPK == null && other.partyInvitationGroupAssocPK != null) || (this.partyInvitationGroupAssocPK != null && !this.partyInvitationGroupAssocPK.equals(other.partyInvitationGroupAssocPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PartyInvitationGroupAssoc[ partyInvitationGroupAssocPK=" + partyInvitationGroupAssocPK + " ]";
    }
    
}
