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
public class PaymentMethodTypeGlAccountPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PAYMENT_METHOD_TYPE_ID")
    private String paymentMethodTypeId;
    @Basic(optional = false)
    @Column(name = "ORGANIZATION_PARTY_ID")
    private String organizationPartyId;

    public PaymentMethodTypeGlAccountPK() {
    }

    public PaymentMethodTypeGlAccountPK(String paymentMethodTypeId, String organizationPartyId) {
        this.paymentMethodTypeId = paymentMethodTypeId;
        this.organizationPartyId = organizationPartyId;
    }

    public String getPaymentMethodTypeId() {
        return paymentMethodTypeId;
    }

    public void setPaymentMethodTypeId(String paymentMethodTypeId) {
        this.paymentMethodTypeId = paymentMethodTypeId;
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
        hash += (paymentMethodTypeId != null ? paymentMethodTypeId.hashCode() : 0);
        hash += (organizationPartyId != null ? organizationPartyId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PaymentMethodTypeGlAccountPK)) {
            return false;
        }
        PaymentMethodTypeGlAccountPK other = (PaymentMethodTypeGlAccountPK) object;
        if ((this.paymentMethodTypeId == null && other.paymentMethodTypeId != null) || (this.paymentMethodTypeId != null && !this.paymentMethodTypeId.equals(other.paymentMethodTypeId))) {
            return false;
        }
        if ((this.organizationPartyId == null && other.organizationPartyId != null) || (this.organizationPartyId != null && !this.organizationPartyId.equals(other.organizationPartyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PaymentMethodTypeGlAccountPK[ paymentMethodTypeId=" + paymentMethodTypeId + ", organizationPartyId=" + organizationPartyId + " ]";
    }
    
}
