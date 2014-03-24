/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.tax.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class TaxAuthorityGlAccountPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "TAX_AUTH_GEO_ID")
    private String taxAuthGeoId;
    @Basic(optional = false)
    @Column(name = "TAX_AUTH_PARTY_ID")
    private String taxAuthPartyId;
    @Basic(optional = false)
    @Column(name = "ORGANIZATION_PARTY_ID")
    private String organizationPartyId;

    public TaxAuthorityGlAccountPK() {
    }

    public TaxAuthorityGlAccountPK(String taxAuthGeoId, String taxAuthPartyId, String organizationPartyId) {
        this.taxAuthGeoId = taxAuthGeoId;
        this.taxAuthPartyId = taxAuthPartyId;
        this.organizationPartyId = organizationPartyId;
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

    public String getOrganizationPartyId() {
        return organizationPartyId;
    }

    public void setOrganizationPartyId(String organizationPartyId) {
        this.organizationPartyId = organizationPartyId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (taxAuthGeoId != null ? taxAuthGeoId.hashCode() : 0);
        hash += (taxAuthPartyId != null ? taxAuthPartyId.hashCode() : 0);
        hash += (organizationPartyId != null ? organizationPartyId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TaxAuthorityGlAccountPK)) {
            return false;
        }
        TaxAuthorityGlAccountPK other = (TaxAuthorityGlAccountPK) object;
        if ((this.taxAuthGeoId == null && other.taxAuthGeoId != null) || (this.taxAuthGeoId != null && !this.taxAuthGeoId.equals(other.taxAuthGeoId))) {
            return false;
        }
        if ((this.taxAuthPartyId == null && other.taxAuthPartyId != null) || (this.taxAuthPartyId != null && !this.taxAuthPartyId.equals(other.taxAuthPartyId))) {
            return false;
        }
        if ((this.organizationPartyId == null && other.organizationPartyId != null) || (this.organizationPartyId != null && !this.organizationPartyId.equals(other.organizationPartyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.TaxAuthorityGlAccountPK[ taxAuthGeoId=" + taxAuthGeoId + ", taxAuthPartyId=" + taxAuthPartyId + ", organizationPartyId=" + organizationPartyId + " ]";
    }
    
}
