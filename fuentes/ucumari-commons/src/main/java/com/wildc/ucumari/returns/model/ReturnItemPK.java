/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.returns.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class ReturnItemPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "RETURN_ID")
    private String returnId;
    @Basic(optional = false)
    @Column(name = "RETURN_ITEM_SEQ_ID")
    private String returnItemSeqId;

    public ReturnItemPK() {
    }

    public ReturnItemPK(String returnId, String returnItemSeqId) {
        this.returnId = returnId;
        this.returnItemSeqId = returnItemSeqId;
    }

    public String getReturnId() {
        return returnId;
    }

    public void setReturnId(String returnId) {
        this.returnId = returnId;
    }

    public String getReturnItemSeqId() {
        return returnItemSeqId;
    }

    public void setReturnItemSeqId(String returnItemSeqId) {
        this.returnItemSeqId = returnItemSeqId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (returnId != null ? returnId.hashCode() : 0);
        hash += (returnItemSeqId != null ? returnItemSeqId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReturnItemPK)) {
            return false;
        }
        ReturnItemPK other = (ReturnItemPK) object;
        if ((this.returnId == null && other.returnId != null) || (this.returnId != null && !this.returnId.equals(other.returnId))) {
            return false;
        }
        if ((this.returnItemSeqId == null && other.returnItemSeqId != null) || (this.returnItemSeqId != null && !this.returnItemSeqId.equals(other.returnItemSeqId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ReturnItemPK[ returnId=" + returnId + ", returnItemSeqId=" + returnItemSeqId + " ]";
    }
    
}
