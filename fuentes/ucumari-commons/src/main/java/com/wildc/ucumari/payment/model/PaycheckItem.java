/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.payment.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.party.model.Party;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "paycheck_item")
public class PaycheckItem implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PaycheckItemPK paycheckItemPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "AMOUNT")
    private BigDecimal amount;
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
    @JoinColumn(name = "PAYCHECK_ITEM_TYPE_ID", referencedColumnName = "PAYCHECK_ITEM_TYPE_ID")
    @ManyToOne
    private PaycheckItemType paycheckItemTypeId;
    @JoinColumn(name = "PAYMENT_ID", referencedColumnName = "PAYMENT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Payment payment;
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party partyId;

    public PaycheckItem() {
    }

    public PaycheckItem(PaycheckItemPK paycheckItemPK) {
        this.paycheckItemPK = paycheckItemPK;
    }

    public PaycheckItem(String paymentId, String paycheckItemSeqId) {
        this.paycheckItemPK = new PaycheckItemPK(paymentId, paycheckItemSeqId);
    }

    public PaycheckItemPK getPaycheckItemPK() {
        return paycheckItemPK;
    }

    public void setPaycheckItemPK(PaycheckItemPK paycheckItemPK) {
        this.paycheckItemPK = paycheckItemPK;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
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

    public PaycheckItemType getPaycheckItemTypeId() {
        return paycheckItemTypeId;
    }

    public void setPaycheckItemTypeId(PaycheckItemType paycheckItemTypeId) {
        this.paycheckItemTypeId = paycheckItemTypeId;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Party getPartyId() {
        return partyId;
    }

    public void setPartyId(Party partyId) {
        this.partyId = partyId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paycheckItemPK != null ? paycheckItemPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PaycheckItem)) {
            return false;
        }
        PaycheckItem other = (PaycheckItem) object;
        if ((this.paycheckItemPK == null && other.paycheckItemPK != null) || (this.paycheckItemPK != null && !this.paycheckItemPK.equals(other.paycheckItemPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PaycheckItem[ paycheckItemPK=" + paycheckItemPK + " ]";
    }
    
}
