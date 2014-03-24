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
public class PaycheckTypeItemTypeAssocPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PAYMENT_TYPE_ID")
    private String paymentTypeId;
    @Basic(optional = false)
    @Column(name = "PAYCHECK_ITEM_TYPE_ID")
    private String paycheckItemTypeId;

    public PaycheckTypeItemTypeAssocPK() {
    }

    public PaycheckTypeItemTypeAssocPK(String paymentTypeId, String paycheckItemTypeId) {
        this.paymentTypeId = paymentTypeId;
        this.paycheckItemTypeId = paycheckItemTypeId;
    }

    public String getPaymentTypeId() {
        return paymentTypeId;
    }

    public void setPaymentTypeId(String paymentTypeId) {
        this.paymentTypeId = paymentTypeId;
    }

    public String getPaycheckItemTypeId() {
        return paycheckItemTypeId;
    }

    public void setPaycheckItemTypeId(String paycheckItemTypeId) {
        this.paycheckItemTypeId = paycheckItemTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paymentTypeId != null ? paymentTypeId.hashCode() : 0);
        hash += (paycheckItemTypeId != null ? paycheckItemTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PaycheckTypeItemTypeAssocPK)) {
            return false;
        }
        PaycheckTypeItemTypeAssocPK other = (PaycheckTypeItemTypeAssocPK) object;
        if ((this.paymentTypeId == null && other.paymentTypeId != null) || (this.paymentTypeId != null && !this.paymentTypeId.equals(other.paymentTypeId))) {
            return false;
        }
        if ((this.paycheckItemTypeId == null && other.paycheckItemTypeId != null) || (this.paycheckItemTypeId != null && !this.paycheckItemTypeId.equals(other.paycheckItemTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PaycheckTypeItemTypeAssocPK[ paymentTypeId=" + paymentTypeId + ", paycheckItemTypeId=" + paycheckItemTypeId + " ]";
    }
    
}
