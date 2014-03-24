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
public class PartyClassificationPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PARTY_ID")
    private String partyId;
    @Basic(optional = false)
    @Column(name = "PARTY_CLASSIFICATION_GROUP_ID")
    private String partyClassificationGroupId;
    @Basic(optional = false)
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;

    public PartyClassificationPK() {
    }

    public PartyClassificationPK(String partyId, String partyClassificationGroupId, Date fromDate) {
        this.partyId = partyId;
        this.partyClassificationGroupId = partyClassificationGroupId;
        this.fromDate = fromDate;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public String getPartyClassificationGroupId() {
        return partyClassificationGroupId;
    }

    public void setPartyClassificationGroupId(String partyClassificationGroupId) {
        this.partyClassificationGroupId = partyClassificationGroupId;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (partyId != null ? partyId.hashCode() : 0);
        hash += (partyClassificationGroupId != null ? partyClassificationGroupId.hashCode() : 0);
        hash += (fromDate != null ? fromDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PartyClassificationPK)) {
            return false;
        }
        PartyClassificationPK other = (PartyClassificationPK) object;
        if ((this.partyId == null && other.partyId != null) || (this.partyId != null && !this.partyId.equals(other.partyId))) {
            return false;
        }
        if ((this.partyClassificationGroupId == null && other.partyClassificationGroupId != null) || (this.partyClassificationGroupId != null && !this.partyClassificationGroupId.equals(other.partyClassificationGroupId))) {
            return false;
        }
        if ((this.fromDate == null && other.fromDate != null) || (this.fromDate != null && !this.fromDate.equals(other.fromDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PartyClassificationPK[ partyId=" + partyId + ", partyClassificationGroupId=" + partyClassificationGroupId + ", fromDate=" + fromDate + " ]";
    }
    
}
