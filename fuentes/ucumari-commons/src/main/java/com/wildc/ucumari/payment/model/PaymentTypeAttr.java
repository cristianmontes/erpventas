/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.payment.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "payment_type_attr")
@NamedQueries({
    @NamedQuery(name = "PaymentTypeAttr.findAll", query = "SELECT p FROM PaymentTypeAttr p")})
public class PaymentTypeAttr implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PaymentTypeAttrPK paymentTypeAttrPK;
    @Column(name = "LAST_UPDATED_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdatedStamp;
    @Column(name = "LAST_UPDATED_TX_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdatedTxStamp;
    @Column(name = "CREATED_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdStamp;
    @Column(name = "CREATED_TX_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdTxStamp;
    @JoinColumn(name = "PAYMENT_TYPE_ID", referencedColumnName = "PAYMENT_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private PaymentType paymentType;

    public PaymentTypeAttr() {
    }

    public PaymentTypeAttr(PaymentTypeAttrPK paymentTypeAttrPK) {
        this.paymentTypeAttrPK = paymentTypeAttrPK;
    }

    public PaymentTypeAttr(String paymentTypeId, String attrName) {
        this.paymentTypeAttrPK = new PaymentTypeAttrPK(paymentTypeId, attrName);
    }

    public PaymentTypeAttrPK getPaymentTypeAttrPK() {
        return paymentTypeAttrPK;
    }

    public void setPaymentTypeAttrPK(PaymentTypeAttrPK paymentTypeAttrPK) {
        this.paymentTypeAttrPK = paymentTypeAttrPK;
    }

    public Date getLastUpdatedStamp() {
        return lastUpdatedStamp;
    }

    public void setLastUpdatedStamp(Date lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }

    public Date getLastUpdatedTxStamp() {
        return lastUpdatedTxStamp;
    }

    public void setLastUpdatedTxStamp(Date lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }

    public Date getCreatedStamp() {
        return createdStamp;
    }

    public void setCreatedStamp(Date createdStamp) {
        this.createdStamp = createdStamp;
    }

    public Date getCreatedTxStamp() {
        return createdTxStamp;
    }

    public void setCreatedTxStamp(Date createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paymentTypeAttrPK != null ? paymentTypeAttrPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PaymentTypeAttr)) {
            return false;
        }
        PaymentTypeAttr other = (PaymentTypeAttr) object;
        if ((this.paymentTypeAttrPK == null && other.paymentTypeAttrPK != null) || (this.paymentTypeAttrPK != null && !this.paymentTypeAttrPK.equals(other.paymentTypeAttrPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PaymentTypeAttr[ paymentTypeAttrPK=" + paymentTypeAttrPK + " ]";
    }

}
