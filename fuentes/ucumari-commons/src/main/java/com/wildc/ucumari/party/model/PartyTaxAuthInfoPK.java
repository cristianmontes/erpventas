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
public class PartyTaxAuthInfoPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PARTY_ID")
    private String partyId;
    @Basic(optional = false)
    @Column(name = "TAX_AUTH_GEO_ID")
    private String taxAuthGeoId;
    @Basic(optional = false)
    @Column(name = "TAX_AUTH_PARTY_ID")
    private String taxAuthPartyId;
    @Basic(optional = false)
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;

    public PartyTaxAuthInfoPK() {
    }

    public PartyTaxAuthInfoPK(String partyId, String taxAuthGeoId, String taxAuthPartyId, Date fromDate) {
        this.partyId = partyId;
        this.taxAuthGeoId = taxAuthGeoId;
        this.taxAuthPartyId = taxAuthPartyId;
        this.fromDate = fromDate;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public String getTaxAuthGeoId() {
        return taxAuthGeoId;
    }

    public void setTaxAuthGeoId(String taxAuthGeoId) {
        this.taxAuthGeoId = taxAuthGeoId;
    }

    public String getTaxAuthPartyId() {
        return taxAuthPartyId;
    }

    public void setTaxAuthPartyId(String taxAuthPartyId) {
        this.taxAuthPartyId = taxAuthPartyId;
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
        hash += (taxAuthGeoId != null ? taxAuthGeoId.hashCode() : 0);
        hash += (taxAuthPartyId != null ? taxAuthPartyId.hashCode() : 0);
        hash += (fromDate != null ? fromDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PartyTaxAuthInfoPK)) {
            return false;
        }
        PartyTaxAuthInfoPK other = (PartyTaxAuthInfoPK) object;
        if ((this.partyId == null && other.partyId != null) || (this.partyId != null && !this.partyId.equals(other.partyId))) {
            return false;
        }
        if ((this.taxAuthGeoId == null && other.taxAuthGeoId != null) || (this.taxAuthGeoId != null && !this.taxAuthGeoId.equals(other.taxAuthGeoId))) {
            return false;
        }
        if ((this.taxAuthPartyId == null && other.taxAuthPartyId != null) || (this.taxAuthPartyId != null && !this.taxAuthPartyId.equals(other.taxAuthPartyId))) {
            return false;
        }
        if ((this.fromDate == null && other.fromDate != null) || (this.fromDate != null && !this.fromDate.equals(other.fromDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PartyTaxAuthInfoPK[ partyId=" + partyId + ", taxAuthGeoId=" + taxAuthGeoId + ", taxAuthPartyId=" + taxAuthPartyId + ", fromDate=" + fromDate + " ]";
    }
    
}
