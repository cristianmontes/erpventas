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
@Table(name = "payment_attribute")
@NamedQueries({
    @NamedQuery(name = "PaymentAttribute.findAll", query = "SELECT p FROM PaymentAttribute p")})
public class PaymentAttribute implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PaymentAttributePK paymentAttributePK;
    @Column(name = "ATTR_VALUE")
    private String attrValue;
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
    @JoinColumn(name = "PAYMENT_ID", referencedColumnName = "PAYMENT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Payment payment;

    public PaymentAttribute() {
    }

    public PaymentAttribute(PaymentAttributePK paymentAttributePK) {
        this.paymentAttributePK = paymentAttributePK;
    }

    public PaymentAttribute(String paymentId, String attrName) {
        this.paymentAttributePK = new PaymentAttributePK(paymentId, attrName);
    }

    public PaymentAttributePK getPaymentAttributePK() {
        return paymentAttributePK;
    }

    public void setPaymentAttributePK(PaymentAttributePK paymentAttributePK) {
        this.paymentAttributePK = paymentAttributePK;
    }

    public String getAttrValue() {
        return attrValue;
    }

    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue;
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

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paymentAttributePK != null ? paymentAttributePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PaymentAttribute)) {
            return false;
        }
        PaymentAttribute other = (PaymentAttribute) object;
        if ((this.paymentAttributePK == null && other.paymentAttributePK != null) || (this.paymentAttributePK != null && !this.paymentAttributePK.equals(other.paymentAttributePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PaymentAttribute[ paymentAttributePK=" + paymentAttributePK + " ]";
    }
    
}
