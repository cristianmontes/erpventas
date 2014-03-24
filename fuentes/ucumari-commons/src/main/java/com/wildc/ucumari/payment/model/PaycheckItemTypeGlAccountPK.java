/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.payment.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class PaycheckItemTypeGlAccountPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PAYCHECK_ITEM_TYPE_ID")
    private String paycheckItemTypeId;
    @Basic(optional = false)
    @Column(name = "ORGANIZATION_PARTY_ID")
    private String organizationPartyId;

    public PaycheckItemTypeGlAccountPK() {
    }

    public PaycheckItemTypeGlAccountPK(String paycheckItemTypeId, String organizationPartyId) {
        this.paycheckItemTypeId = paycheckItemTypeId;
        this.organizationPartyId = organizationPartyId;
    }

    public String getPaycheckItemTypeId() {
        return paycheckItemTypeId;
    }

    public void setPaycheckItemTypeId(String paycheckItemTypeId) {
        this.paycheckItemTypeId = paycheckItemTypeId;
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
        hash += (paycheckItemTypeId != null ? paycheckItemTypeId.hashCode() : 0);
        hash += (organizationPartyId != null ? organizationPartyId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PaycheckItemTypeGlAccountPK)) {
            return false;
        }
        PaycheckItemTypeGlAccountPK other = (PaycheckItemTypeGlAccountPK) object;
        if ((this.paycheckItemTypeId == null && other.paycheckItemTypeId != null) || (this.paycheckItemTypeId != null && !this.paycheckItemTypeId.equals(other.paycheckItemTypeId))) {
            return false;
        }
        if ((this.organizationPartyId == null && other.organizationPartyId != null) || (this.organizationPartyId != null && !this.organizationPartyId.equals(other.organizationPartyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PaycheckItemTypeGlAccountPK[ paycheckItemTypeId=" + paycheckItemTypeId + ", organizationPartyId=" + organizationPartyId + " ]";
    }
    
}
