/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.tax.model;

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
public class TaxAuthorityAssocPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "TAX_AUTH_GEO_ID")
    private String taxAuthGeoId;
    @Basic(optional = false)
    @Column(name = "TAX_AUTH_PARTY_ID")
    private String taxAuthPartyId;
    @Basic(optional = false)
    @Column(name = "TO_TAX_AUTH_GEO_ID")
    private String toTaxAuthGeoId;
    @Basic(optional = false)
    @Column(name = "TO_TAX_AUTH_PARTY_ID")
    private String toTaxAuthPartyId;
    @Basic(optional = false)
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;

    public TaxAuthorityAssocPK() {
    }

    public TaxAuthorityAssocPK(String taxAuthGeoId, String taxAuthPartyId, String toTaxAuthGeoId, String toTaxAuthPartyId, Date fromDate) {
        this.taxAuthGeoId = taxAuthGeoId;
        this.taxAuthPartyId = taxAuthPartyId;
        this.toTaxAuthGeoId = toTaxAuthGeoId;
        this.toTaxAuthPartyId = toTaxAuthPartyId;
        this.fromDate = fromDate;
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

    public String getToTaxAuthGeoId() {
        return toTaxAuthGeoId;
    }

    public void setToTaxAuthGeoId(String toTaxAuthGeoId) {
        this.toTaxAuthGeoId = toTaxAuthGeoId;
    }

    public String getToTaxAuthPartyId() {
        return toTaxAuthPartyId;
    }

    public void setToTaxAuthPartyId(String toTaxAuthPartyId) {
        this.toTaxAuthPartyId = toTaxAuthPartyId;
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
        hash += (taxAuthGeoId != null ? taxAuthGeoId.hashCode() : 0);
        hash += (taxAuthPartyId != null ? taxAuthPartyId.hashCode() : 0);
        hash += (toTaxAuthGeoId != null ? toTaxAuthGeoId.hashCode() : 0);
        hash += (toTaxAuthPartyId != null ? toTaxAuthPartyId.hashCode() : 0);
        hash += (fromDate != null ? fromDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TaxAuthorityAssocPK)) {
            return false;
        }
        TaxAuthorityAssocPK other = (TaxAuthorityAssocPK) object;
        if ((this.taxAuthGeoId == null && other.taxAuthGeoId != null) || (this.taxAuthGeoId != null && !this.taxAuthGeoId.equals(other.taxAuthGeoId))) {
            return false;
        }
        if ((this.taxAuthPartyId == null && other.taxAuthPartyId != null) || (this.taxAuthPartyId != null && !this.taxAuthPartyId.equals(other.taxAuthPartyId))) {
            return false;
        }
        if ((this.toTaxAuthGeoId == null && other.toTaxAuthGeoId != null) || (this.toTaxAuthGeoId != null && !this.toTaxAuthGeoId.equals(other.toTaxAuthGeoId))) {
            return false;
        }
        if ((this.toTaxAuthPartyId == null && other.toTaxAuthPartyId != null) || (this.toTaxAuthPartyId != null && !this.toTaxAuthPartyId.equals(other.toTaxAuthPartyId))) {
            return false;
        }
        if ((this.fromDate == null && other.fromDate != null) || (this.fromDate != null && !this.fromDate.equals(other.fromDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.TaxAuthorityAssocPK[ taxAuthGeoId=" + taxAuthGeoId + ", taxAuthPartyId=" + taxAuthPartyId + ", toTaxAuthGeoId=" + toTaxAuthGeoId + ", toTaxAuthPartyId=" + toTaxAuthPartyId + ", fromDate=" + fromDate + " ]";
    }
    
}
