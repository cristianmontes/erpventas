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
public class PartyMergeCandidatesPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PARTY_ID_FROM")
    private String partyIdFrom;
    @Basic(optional = false)
    @Column(name = "PARTY_ID_TO")
    private String partyIdTo;

    public PartyMergeCandidatesPK() {
    }

    public PartyMergeCandidatesPK(String partyIdFrom, String partyIdTo) {
        this.partyIdFrom = partyIdFrom;
        this.partyIdTo = partyIdTo;
    }

    public String getPartyIdFrom() {
        return partyIdFrom;
    }

    public void setPartyIdFrom(String partyIdFrom) {
        this.partyIdFrom = partyIdFrom;
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
        hash += (partyIdFrom != null ? partyIdFrom.hashCode() : 0);
        hash += (partyIdTo != null ? partyIdTo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PartyMergeCandidatesPK)) {
            return false;
        }
        PartyMergeCandidatesPK other = (PartyMergeCandidatesPK) object;
        if ((this.partyIdFrom == null && other.partyIdFrom != null) || (this.partyIdFrom != null && !this.partyIdFrom.equals(other.partyIdFrom))) {
            return false;
        }
        if ((this.partyIdTo == null && other.partyIdTo != null) || (this.partyIdTo != null && !this.partyIdTo.equals(other.partyIdTo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PartyMergeCandidatesPK[ partyIdFrom=" + partyIdFrom + ", partyIdTo=" + partyIdTo + " ]";
    }
    
}
