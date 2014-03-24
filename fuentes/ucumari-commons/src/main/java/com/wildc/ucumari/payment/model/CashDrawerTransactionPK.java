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
public class CashDrawerTransactionPK implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -7253993667594533644L;
	@Basic(optional = false)
    @Column(name = "CASH_DRAWER_ID")
    private String cashDrawerId;
    @Basic(optional = false)
    @Column(name = "CASH_DRAWER_ITEM_SEQ_ID")
    private String cashDrawerItemSeqId;

    public CashDrawerTransactionPK() {
    }

    public CashDrawerTransactionPK(String cashDrawerId, String cashDrawerItemSeqId) {
        this.cashDrawerId = cashDrawerId;
        this.cashDrawerItemSeqId = cashDrawerItemSeqId;
    }

    public String getCashDrawerId() {
        return cashDrawerId;
    }

    public void setCashDrawerId(String cashDrawerId) {
        this.cashDrawerId = cashDrawerId;
    }

    public String getCashDrawerItemSeqId() {
        return cashDrawerItemSeqId;
    }

    public void setCashDrawerItemSeqId(String cashDrawerItemSeqId) {
        this.cashDrawerItemSeqId = cashDrawerItemSeqId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cashDrawerId != null ? cashDrawerId.hashCode() : 0);
        hash += (cashDrawerItemSeqId != null ? cashDrawerItemSeqId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CashDrawerTransactionPK)) {
            return false;
        }
        CashDrawerTransactionPK other = (CashDrawerTransactionPK) object;
        if ((this.cashDrawerId == null && other.cashDrawerId != null) || (this.cashDrawerId != null && !this.cashDrawerId.equals(other.cashDrawerId))) {
            return false;
        }
        if ((this.cashDrawerItemSeqId == null && other.cashDrawerItemSeqId != null) || (this.cashDrawerItemSeqId != null && !this.cashDrawerItemSeqId.equals(other.cashDrawerItemSeqId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.CashDrawerTransactionPK[ cashDrawerId=" + cashDrawerId + ", cashDrawerItemSeqId=" + cashDrawerItemSeqId + " ]";
    }
    
}
