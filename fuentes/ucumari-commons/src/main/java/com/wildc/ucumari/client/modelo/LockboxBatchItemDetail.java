/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.payment.model.Payment;
import com.wildc.ucumari.payment.model.PaymentApplication;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "lockbox_batch_item_detail")
@NamedQueries({
    @NamedQuery(name = "LockboxBatchItemDetail.findAll", query = "SELECT l FROM LockboxBatchItemDetail l")})
public class LockboxBatchItemDetail implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LockboxBatchItemDetailPK lockboxBatchItemDetailPK;
    @Column(name = "INVOICE_NUMBER")
    private String invoiceNumber;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "INVOICE_AMOUNT")
    private BigDecimal invoiceAmount;
    @Column(name = "CUSTOMER_ID")
    private String customerId;
    @Column(name = "IS_USER_ENTERED")
    private Character isUserEntered;
    @Column(name = "AMOUNT_TO_APPLY")
    private BigDecimal amountToApply;
    @Column(name = "CASH_DISCOUNT")
    private BigDecimal cashDiscount;
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
    @JoinColumn(name = "PAYMENT_APPLICATION_ID", referencedColumnName = "PAYMENT_APPLICATION_ID")
    @ManyToOne
    private PaymentApplication paymentApplicationId;
    @JoinColumn(name = "PAYMENT_ID", referencedColumnName = "PAYMENT_ID")
    @ManyToOne
    private Payment paymentId;
    @JoinColumns({
        @JoinColumn(name = "LOCKBOX_BATCH_ID", referencedColumnName = "LOCKBOX_BATCH_ID", insertable = false, updatable = false),
        @JoinColumn(name = "ITEM_SEQ_ID", referencedColumnName = "ITEM_SEQ_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private LockboxBatchItem lockboxBatchItem;
    @JoinColumn(name = "LOCKBOX_BATCH_ID", referencedColumnName = "LOCKBOX_BATCH_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private LockboxBatch lockboxBatch;

    public LockboxBatchItemDetail() {
    }

    public LockboxBatchItemDetail(LockboxBatchItemDetailPK lockboxBatchItemDetailPK) {
        this.lockboxBatchItemDetailPK = lockboxBatchItemDetailPK;
    }

    public LockboxBatchItemDetail(String lockboxBatchId, String itemSeqId, String detailSeqId) {
        this.lockboxBatchItemDetailPK = new LockboxBatchItemDetailPK(lockboxBatchId, itemSeqId, detailSeqId);
    }

    public LockboxBatchItemDetailPK getLockboxBatchItemDetailPK() {
        return lockboxBatchItemDetailPK;
    }

    public void setLockboxBatchItemDetailPK(LockboxBatchItemDetailPK lockboxBatchItemDetailPK) {
        this.lockboxBatchItemDetailPK = lockboxBatchItemDetailPK;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public BigDecimal getInvoiceAmount() {
        return invoiceAmount;
    }

    public void setInvoiceAmount(BigDecimal invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Character getIsUserEntered() {
        return isUserEntered;
    }

    public void setIsUserEntered(Character isUserEntered) {
        this.isUserEntered = isUserEntered;
    }

    public BigDecimal getAmountToApply() {
        return amountToApply;
    }

    public void setAmountToApply(BigDecimal amountToApply) {
        this.amountToApply = amountToApply;
    }

    public BigDecimal getCashDiscount() {
        return cashDiscount;
    }

    public void setCashDiscount(BigDecimal cashDiscount) {
        this.cashDiscount = cashDiscount;
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

    public PaymentApplication getPaymentApplicationId() {
        return paymentApplicationId;
    }

    public void setPaymentApplicationId(PaymentApplication paymentApplicationId) {
        this.paymentApplicationId = paymentApplicationId;
    }

    public Payment getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Payment paymentId) {
        this.paymentId = paymentId;
    }

    public LockboxBatchItem getLockboxBatchItem() {
        return lockboxBatchItem;
    }

    public void setLockboxBatchItem(LockboxBatchItem lockboxBatchItem) {
        this.lockboxBatchItem = lockboxBatchItem;
    }

    public LockboxBatch getLockboxBatch() {
        return lockboxBatch;
    }

    public void setLockboxBatch(LockboxBatch lockboxBatch) {
        this.lockboxBatch = lockboxBatch;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lockboxBatchItemDetailPK != null ? lockboxBatchItemDetailPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LockboxBatchItemDetail)) {
            return false;
        }
        LockboxBatchItemDetail other = (LockboxBatchItemDetail) object;
        if ((this.lockboxBatchItemDetailPK == null && other.lockboxBatchItemDetailPK != null) || (this.lockboxBatchItemDetailPK != null && !this.lockboxBatchItemDetailPK.equals(other.lockboxBatchItemDetailPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.LockboxBatchItemDetail[ lockboxBatchItemDetailPK=" + lockboxBatchItemDetailPK + " ]";
    }
    
}
