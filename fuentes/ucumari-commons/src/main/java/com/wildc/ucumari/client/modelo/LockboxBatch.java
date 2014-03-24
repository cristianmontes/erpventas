/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import com.wildc.ucumari.security.model.UserLogin;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "lockbox_batch")
@NamedQueries({
    @NamedQuery(name = "LockboxBatch.findAll", query = "SELECT l FROM LockboxBatch l")})
public class LockboxBatch implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LOCKBOX_BATCH_ID")
    private String lockboxBatchId;
    @Column(name = "BATCH_ID")
    private String batchId;
    @Column(name = "FILE_HASH_MARK")
    private String fileHashMark;
    @Column(name = "DATETIME_ENTERED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datetimeEntered;
    @Column(name = "BATCH_COUNT")
    private BigInteger batchCount;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "BATCH_AMOUNT")
    private BigDecimal batchAmount;
    @Column(name = "OUTSTANDING_AMOUNT")
    private BigDecimal outstandingAmount;
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
    @JoinColumn(name = "CREATED_BY_USER_LOGIN_ID", referencedColumnName = "USER_LOGIN_ID")
    @ManyToOne
    private UserLogin createdByUserLoginId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lockboxBatch")
    private List<LockboxBatchItemDetail> lockboxBatchItemDetailList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lockboxBatch")
    private List<LockboxBatchItem> lockboxBatchItemList;

    public LockboxBatch() {
    }

    public LockboxBatch(String lockboxBatchId) {
        this.lockboxBatchId = lockboxBatchId;
    }

    public String getLockboxBatchId() {
        return lockboxBatchId;
    }

    public void setLockboxBatchId(String lockboxBatchId) {
        this.lockboxBatchId = lockboxBatchId;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public String getFileHashMark() {
        return fileHashMark;
    }

    public void setFileHashMark(String fileHashMark) {
        this.fileHashMark = fileHashMark;
    }

    public Date getDatetimeEntered() {
        return datetimeEntered;
    }

    public void setDatetimeEntered(Date datetimeEntered) {
        this.datetimeEntered = datetimeEntered;
    }

    public BigInteger getBatchCount() {
        return batchCount;
    }

    public void setBatchCount(BigInteger batchCount) {
        this.batchCount = batchCount;
    }

    public BigDecimal getBatchAmount() {
        return batchAmount;
    }

    public void setBatchAmount(BigDecimal batchAmount) {
        this.batchAmount = batchAmount;
    }

    public BigDecimal getOutstandingAmount() {
        return outstandingAmount;
    }

    public void setOutstandingAmount(BigDecimal outstandingAmount) {
        this.outstandingAmount = outstandingAmount;
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

    public UserLogin getCreatedByUserLoginId() {
        return createdByUserLoginId;
    }

    public void setCreatedByUserLoginId(UserLogin createdByUserLoginId) {
        this.createdByUserLoginId = createdByUserLoginId;
    }

    public List<LockboxBatchItemDetail> getLockboxBatchItemDetailList() {
        return lockboxBatchItemDetailList;
    }

    public void setLockboxBatchItemDetailList(List<LockboxBatchItemDetail> lockboxBatchItemDetailList) {
        this.lockboxBatchItemDetailList = lockboxBatchItemDetailList;
    }

    public List<LockboxBatchItem> getLockboxBatchItemList() {
        return lockboxBatchItemList;
    }

    public void setLockboxBatchItemList(List<LockboxBatchItem> lockboxBatchItemList) {
        this.lockboxBatchItemList = lockboxBatchItemList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lockboxBatchId != null ? lockboxBatchId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LockboxBatch)) {
            return false;
        }
        LockboxBatch other = (LockboxBatch) object;
        if ((this.lockboxBatchId == null && other.lockboxBatchId != null) || (this.lockboxBatchId != null && !this.lockboxBatchId.equals(other.lockboxBatchId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.LockboxBatch[ lockboxBatchId=" + lockboxBatchId + " ]";
    }
    
}
