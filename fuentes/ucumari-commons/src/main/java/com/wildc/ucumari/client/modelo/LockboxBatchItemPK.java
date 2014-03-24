/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class LockboxBatchItemPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "LOCKBOX_BATCH_ID")
    private String lockboxBatchId;
    @Basic(optional = false)
    @Column(name = "ITEM_SEQ_ID")
    private String itemSeqId;

    public LockboxBatchItemPK() {
    }

    public LockboxBatchItemPK(String lockboxBatchId, String itemSeqId) {
        this.lockboxBatchId = lockboxBatchId;
        this.itemSeqId = itemSeqId;
    }

    public String getLockboxBatchId() {
        return lockboxBatchId;
    }

    public void setLockboxBatchId(String lockboxBatchId) {
        this.lockboxBatchId = lockboxBatchId;
    }

    public String getItemSeqId() {
        return itemSeqId;
    }

    public void setItemSeqId(String itemSeqId) {
        this.itemSeqId = itemSeqId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lockboxBatchId != null ? lockboxBatchId.hashCode() : 0);
        hash += (itemSeqId != null ? itemSeqId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LockboxBatchItemPK)) {
            return false;
        }
        LockboxBatchItemPK other = (LockboxBatchItemPK) object;
        if ((this.lockboxBatchId == null && other.lockboxBatchId != null) || (this.lockboxBatchId != null && !this.lockboxBatchId.equals(other.lockboxBatchId))) {
            return false;
        }
        if ((this.itemSeqId == null && other.itemSeqId != null) || (this.itemSeqId != null && !this.itemSeqId.equals(other.itemSeqId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.LockboxBatchItemPK[ lockboxBatchId=" + lockboxBatchId + ", itemSeqId=" + itemSeqId + " ]";
    }
    
}
