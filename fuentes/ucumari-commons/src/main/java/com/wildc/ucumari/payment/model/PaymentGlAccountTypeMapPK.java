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
public class PaymentGlAccountTypeMapPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PAYMENT_TYPE_ID")
    private String paymentTypeId;
    @Basic(optional = false)
    @Column(name = "ORGANIZATION_PARTY_ID")
    private String organizationPartyId;

    public PaymentGlAccountTypeMapPK() {
    }

    public PaymentGlAccountTypeMapPK(String paymentTypeId, String organizationPartyId) {
        this.paymentTypeId = paymentTypeId;
        this.organizationPartyId = organizationPartyId;
    }

    public String getPaymentTypeId() {
        return paymentTypeId;
    }

    public void setPaymentTypeId(String paymentTypeId) {
        this.paymentTypeId = paymentTypeId;
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
        hash += (paymentTypeId != null ? paymentTypeId.hashCode() : 0);
        hash += (organizationPartyId != null ? organizationPartyId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PaymentGlAccountTypeMapPK)) {
            return false;
        }
        PaymentGlAccountTypeMapPK other = (PaymentGlAccountTypeMapPK) object;
        if ((this.paymentTypeId == null && other.paymentTypeId != null) || (this.paymentTypeId != null && !this.paymentTypeId.equals(other.paymentTypeId))) {
            return false;
        }
        if ((this.organizationPartyId == null && other.organizationPartyId != null) || (this.organizationPartyId != null && !this.organizationPartyId.equals(other.organizationPartyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PaymentGlAccountTypeMapPK[ paymentTypeId=" + paymentTypeId + ", organizationPartyId=" + organizationPartyId + " ]";
    }
    
}
