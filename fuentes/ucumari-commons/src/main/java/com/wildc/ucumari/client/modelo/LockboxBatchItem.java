/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "lockbox_batch_item")
@NamedQueries({
    @NamedQuery(name = "LockboxBatchItem.findAll", query = "SELECT l FROM LockboxBatchItem l")})
public class LockboxBatchItem implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LockboxBatchItemPK lockboxBatchItemPK;
    @Column(name = "ROUTING_NUMBER")
    private String routingNumber;
    @Column(name = "ACCOUNT_NUMBER")
    private String accountNumber;
    @Column(name = "PAYMENT_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date paymentDate;
    @Column(name = "CHECK_NUMBER")
    private String checkNumber;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "CHECK_AMOUNT")
    private BigDecimal checkAmount;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lockboxBatchItem")
    private List<LockboxBatchItemDetail> lockboxBatchItemDetailList;
    @JoinColumn(name = "LOCKBOX_BATCH_ID", referencedColumnName = "LOCKBOX_BATCH_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private LockboxBatch lockboxBatch;

    public LockboxBatchItem() {
    }

    public LockboxBatchItem(LockboxBatchItemPK lockboxBatchItemPK) {
        this.lockboxBatchItemPK = lockboxBatchItemPK;
    }

    public LockboxBatchItem(String lockboxBatchId, String itemSeqId) {
        this.lockboxBatchItemPK = new LockboxBatchItemPK(lockboxBatchId, itemSeqId);
    }

    public LockboxBatchItemPK getLockboxBatchItemPK() {
        return lockboxBatchItemPK;
    }

    public void setLockboxBatchItemPK(LockboxBatchItemPK lockboxBatchItemPK) {
        this.lockboxBatchItemPK = lockboxBatchItemPK;
    }

    public String getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(String routingNumber) {
        this.routingNumber = routingNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getCheckNumber() {
        return checkNumber;
    }

    public void setCheckNumber(String checkNumber) {
        this.checkNumber = checkNumber;
    }

    public BigDecimal getCheckAmount() {
        return checkAmount;
    }

    public void setCheckAmount(BigDecimal checkAmount) {
        this.checkAmount = checkAmount;
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

    public List<LockboxBatchItemDetail> getLockboxBatchItemDetailList() {
        return lockboxBatchItemDetailList;
    }

    public void setLockboxBatchItemDetailList(List<LockboxBatchItemDetail> lockboxBatchItemDetailList) {
        this.lockboxBatchItemDetailList = lockboxBatchItemDetailList;
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
        hash += (lockboxBatchItemPK != null ? lockboxBatchItemPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LockboxBatchItem)) {
            return false;
        }
        LockboxBatchItem other = (LockboxBatchItem) object;
        if ((this.lockboxBatchItemPK == null && other.lockboxBatchItemPK != null) || (this.lockboxBatchItemPK != null && !this.lockboxBatchItemPK.equals(other.lockboxBatchItemPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.LockboxBatchItem[ lockboxBatchItemPK=" + lockboxBatchItemPK + " ]";
    }
    
}
