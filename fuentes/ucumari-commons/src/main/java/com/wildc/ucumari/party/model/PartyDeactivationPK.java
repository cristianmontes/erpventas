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
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Embeddable
public class PartyDeactivationPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PARTY_ID")
    private String partyId;
    @Basic(optional = false)
    @Column(name = "DEACTIVATION_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date deactivationTimestamp;

    public PartyDeactivationPK() {
    }

    public PartyDeactivationPK(String partyId, Date deactivationTimestamp) {
        this.partyId = partyId;
        this.deactivationTimestamp = deactivationTimestamp;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public Date getDeactivationTimestamp() {
        return deactivationTimestamp;
    }

    public void setDeactivationTimestamp(Date deactivationTimestamp) {
        this.deactivationTimestamp = deactivationTimestamp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (partyId != null ? partyId.hashCode() : 0);
        hash += (deactivationTimestamp != null ? deactivationTimestamp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PartyDeactivationPK)) {
            return false;
        }
        PartyDeactivationPK other = (PartyDeactivationPK) object;
        if ((this.partyId == null && other.partyId != null) || (this.partyId != null && !this.partyId.equals(other.partyId))) {
            return false;
        }
        if ((this.deactivationTimestamp == null && other.deactivationTimestamp != null) || (this.deactivationTimestamp != null && !this.deactivationTimestamp.equals(other.deactivationTimestamp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PartyDeactivationPK[ partyId=" + partyId + ", deactivationTimestamp=" + deactivationTimestamp + " ]";
    }
    
}
