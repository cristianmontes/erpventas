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
@Table(name = "paycheck_type_item_type_assoc")
@NamedQueries({
    @NamedQuery(name = "PaycheckTypeItemTypeAssoc.findAll", query = "SELECT p FROM PaycheckTypeItemTypeAssoc p")})
public class PaycheckTypeItemTypeAssoc implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PaycheckTypeItemTypeAssocPK paycheckTypeItemTypeAssocPK;
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
    @JoinColumn(name = "PAYCHECK_ITEM_TYPE_ID", referencedColumnName = "PAYCHECK_ITEM_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private PaycheckItemType paycheckItemType;

    public PaycheckTypeItemTypeAssoc() {
    }

    public PaycheckTypeItemTypeAssoc(PaycheckTypeItemTypeAssocPK paycheckTypeItemTypeAssocPK) {
        this.paycheckTypeItemTypeAssocPK = paycheckTypeItemTypeAssocPK;
    }

    public PaycheckTypeItemTypeAssoc(String paymentTypeId, String paycheckItemTypeId) {
        this.paycheckTypeItemTypeAssocPK = new PaycheckTypeItemTypeAssocPK(paymentTypeId, paycheckItemTypeId);
    }

    public PaycheckTypeItemTypeAssocPK getPaycheckTypeItemTypeAssocPK() {
        return paycheckTypeItemTypeAssocPK;
    }

    public void setPaycheckTypeItemTypeAssocPK(PaycheckTypeItemTypeAssocPK paycheckTypeItemTypeAssocPK) {
        this.paycheckTypeItemTypeAssocPK = paycheckTypeItemTypeAssocPK;
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

    public PaycheckItemType getPaycheckItemType() {
        return paycheckItemType;
    }

    public void setPaycheckItemType(PaycheckItemType paycheckItemType) {
        this.paycheckItemType = paycheckItemType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paycheckTypeItemTypeAssocPK != null ? paycheckTypeItemTypeAssocPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PaycheckTypeItemTypeAssoc)) {
            return false;
        }
        PaycheckTypeItemTypeAssoc other = (PaycheckTypeItemTypeAssoc) object;
        if ((this.paycheckTypeItemTypeAssocPK == null && other.paycheckTypeItemTypeAssocPK != null) || (this.paycheckTypeItemTypeAssocPK != null && !this.paycheckTypeItemTypeAssocPK.equals(other.paycheckTypeItemTypeAssocPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PaycheckTypeItemTypeAssoc[ paycheckTypeItemTypeAssocPK=" + paycheckTypeItemTypeAssocPK + " ]";
    }
    
}
