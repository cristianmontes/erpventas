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
public class PaycheckItemPK implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -3685590912650921866L;
	@Basic(optional = false)
    @Column(name = "PAYMENT_ID")
    private String paymentId;
    @Basic(optional = false)
    @Column(name = "PAYCHECK_ITEM_SEQ_ID")
    private String paycheckItemSeqId;

    public PaycheckItemPK() {
    }

    public PaycheckItemPK(String paymentId, String paycheckItemSeqId) {
        this.paymentId = paymentId;
        this.paycheckItemSeqId = paycheckItemSeqId;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getPaycheckItemSeqId() {
        return paycheckItemSeqId;
    }

    public void setPaycheckItemSeqId(String paycheckItemSeqId) {
        this.paycheckItemSeqId = paycheckItemSeqId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paymentId != null ? paymentId.hashCode() : 0);
        hash += (paycheckItemSeqId != null ? paycheckItemSeqId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PaycheckItemPK)) {
            return false;
        }
        PaycheckItemPK other = (PaycheckItemPK) object;
        if ((this.paymentId == null && other.paymentId != null) || (this.paymentId != null && !this.paymentId.equals(other.paymentId))) {
            return false;
        }
        if ((this.paycheckItemSeqId == null && other.paycheckItemSeqId != null) || (this.paycheckItemSeqId != null && !this.paycheckItemSeqId.equals(other.paycheckItemSeqId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PaycheckItemPK[ paymentId=" + paymentId + ", paycheckItemSeqId=" + paycheckItemSeqId + " ]";
    }
    
}
