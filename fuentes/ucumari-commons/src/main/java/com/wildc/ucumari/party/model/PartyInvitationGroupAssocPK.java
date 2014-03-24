/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.party.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class PartyInvitationGroupAssocPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PARTY_INVITATION_ID")
    private String partyInvitationId;
    @Basic(optional = false)
    @Column(name = "PARTY_ID_TO")
    private String partyIdTo;

    public PartyInvitationGroupAssocPK() {
    }

    public PartyInvitationGroupAssocPK(String partyInvitationId, String partyIdTo) {
        this.partyInvitationId = partyInvitationId;
        this.partyIdTo = partyIdTo;
    }

    public String getPartyInvitationId() {
        return partyInvitationId;
    }

    public void setPartyInvitationId(String partyInvitationId) {
        this.partyInvitationId = partyInvitationId;
    }

    public String getPartyIdTo() {
        return partyIdTo;
    }

    public void setPartyIdTo(String partyIdTo) {
        this.partyIdTo = partyIdTo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (partyInvitationId != null ? partyInvitationId.hashCode() : 0);
        hash += (partyIdTo != null ? partyIdTo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PartyInvitationGroupAssocPK)) {
            return false;
        }
        PartyInvitationGroupAssocPK other = (PartyInvitationGroupAssocPK) object;
        if ((this.partyInvitationId == null && other.partyInvitationId != null) || (this.partyInvitationId != null && !this.partyInvitationId.equals(other.partyInvitationId))) {
            return false;
        }
        if ((this.partyIdTo == null && other.partyIdTo != null) || (this.partyIdTo != null && !this.partyIdTo.equals(other.partyIdTo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PartyInvitationGroupAssocPK[ partyInvitationId=" + partyInvitationId + ", partyIdTo=" + partyIdTo + " ]";
    }
    
}
