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
public class PaymentTypeAttrPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PAYMENT_TYPE_ID")
    private String paymentTypeId;
    @Basic(optional = false)
    @Column(name = "ATTR_NAME")
    private String attrName;

    public PaymentTypeAttrPK() {
    }

    public PaymentTypeAttrPK(String paymentTypeId, String attrName) {
        this.paymentTypeId = paymentTypeId;
        this.attrName = attrName;
    }

    public String getPaymentTypeId() {
        return paymentTypeId;
    }

    public void setPaymentTypeId(String paymentTypeId) {
        this.paymentTypeId = paymentTypeId;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paymentTypeId != null ? paymentTypeId.hashCode() : 0);
        hash += (attrName != null ? attrName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PaymentTypeAttrPK)) {
            return false;
        }
        PaymentTypeAttrPK other = (PaymentTypeAttrPK) object;
        if ((this.paymentTypeId == null && other.paymentTypeId != null) || (this.paymentTypeId != null && !this.paymentTypeId.equals(other.paymentTypeId))) {
            return false;
        }
        if ((this.attrName == null && other.attrName != null) || (this.attrName != null && !this.attrName.equals(other.attrName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PaymentTypeAttrPK[ paymentTypeId=" + paymentTypeId + ", attrName=" + attrName + " ]";
    }
    
}
