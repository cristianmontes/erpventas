/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class VarianceReasonGlAccountPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "VARIANCE_REASON_ID")
    private String varianceReasonId;
    @Basic(optional = false)
    @Column(name = "ORGANIZATION_PARTY_ID")
    private String organizationPartyId;

    public VarianceReasonGlAccountPK() {
    }

    public VarianceReasonGlAccountPK(String varianceReasonId, String organizationPartyId) {
        this.varianceReasonId = varianceReasonId;
        this.organizationPartyId = organizationPartyId;
    }

    public String getVarianceReasonId() {
        return varianceReasonId;
    }

    public void setVarianceReasonId(String varianceReasonId) {
        this.varianceReasonId = varianceReasonId;
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
        hash += (varianceReasonId != null ? varianceReasonId.hashCode() : 0);
        hash += (organizationPartyId != null ? organizationPartyId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VarianceReasonGlAccountPK)) {
            return false;
        }
        VarianceReasonGlAccountPK other = (VarianceReasonGlAccountPK) object;
        if ((this.varianceReasonId == null && other.varianceReasonId != null) || (this.varianceReasonId != null && !this.varianceReasonId.equals(other.varianceReasonId))) {
            return false;
        }
        if ((this.organizationPartyId == null && other.organizationPartyId != null) || (this.organizationPartyId != null && !this.organizationPartyId.equals(other.organizationPartyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.VarianceReasonGlAccountPK[ varianceReasonId=" + varianceReasonId + ", organizationPartyId=" + organizationPartyId + " ]";
    }
    
}
