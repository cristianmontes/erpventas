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
public class PartyNameHistoryPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PARTY_ID")
    private String partyId;
    @Basic(optional = false)
    @Column(name = "CHANGE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date changeDate;

    public PartyNameHistoryPK() {
    }

    public PartyNameHistoryPK(String partyId, Date changeDate) {
        this.partyId = partyId;
        this.changeDate = changeDate;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public Date getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(Date changeDate) {
        this.changeDate = changeDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (partyId != null ? partyId.hashCode() : 0);
        hash += (changeDate != null ? changeDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PartyNameHistoryPK)) {
            return false;
        }
        PartyNameHistoryPK other = (PartyNameHistoryPK) object;
        if ((this.partyId == null && other.partyId != null) || (this.partyId != null && !this.partyId.equals(other.partyId))) {
            return false;
        }
        if ((this.changeDate == null && other.changeDate != null) || (this.changeDate != null && !this.changeDate.equals(other.changeDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PartyNameHistoryPK[ partyId=" + partyId + ", changeDate=" + changeDate + " ]";
    }
    
}
