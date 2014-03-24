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
public class PartyStatusPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "STATUS_ID")
    private String statusId;
    @Basic(optional = false)
    @Column(name = "PARTY_ID")
    private String partyId;
    @Basic(optional = false)
    @Column(name = "STATUS_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date statusDate;

    public PartyStatusPK() {
    }

    public PartyStatusPK(String statusId, String partyId, Date statusDate) {
        this.statusId = statusId;
        this.partyId = partyId;
        this.statusDate = statusDate;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public Date getStatusDate() {
        return statusDate;
    }

    public void setStatusDate(Date statusDate) {
        this.statusDate = statusDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (statusId != null ? statusId.hashCode() : 0);
        hash += (partyId != null ? partyId.hashCode() : 0);
        hash += (statusDate != null ? statusDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PartyStatusPK)) {
            return false;
        }
        PartyStatusPK other = (PartyStatusPK) object;
        if ((this.statusId == null && other.statusId != null) || (this.statusId != null && !this.statusId.equals(other.statusId))) {
            return false;
        }
        if ((this.partyId == null && other.partyId != null) || (this.partyId != null && !this.partyId.equals(other.partyId))) {
            return false;
        }
        if ((this.statusDate == null && other.statusDate != null) || (this.statusDate != null && !this.statusDate.equals(other.statusDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PartyStatusPK[ statusId=" + statusId + ", partyId=" + partyId + ", statusDate=" + statusDate + " ]";
    }
    
}
