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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "cash_drawer_transaction")
public class CashDrawerTransaction implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CashDrawerTransactionPK cashDrawerTransactionPK;
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
    @JoinColumn(name = "PAYMENT_ID", referencedColumnName = "PAYMENT_ID")
    @ManyToOne
    private Payment paymentId;
    @JoinColumn(name = "CASH_DRAWER_ID", referencedColumnName = "CASH_DRAWER_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private CashDrawer cashDrawer;

    public CashDrawerTransaction() {
    }

    public CashDrawerTransaction(CashDrawerTransactionPK cashDrawerTransactionPK) {
        this.cashDrawerTransactionPK = cashDrawerTransactionPK;
    }

    public CashDrawerTransaction(String cashDrawerId, String cashDrawerItemSeqId) {
        this.cashDrawerTransactionPK = new CashDrawerTransactionPK(cashDrawerId, cashDrawerItemSeqId);
    }

    public CashDrawerTransactionPK getCashDrawerTransactionPK() {
        return cashDrawerTransactionPK;
    }

    public void setCashDrawerTransactionPK(CashDrawerTransactionPK cashDrawerTransactionPK) {
        this.cashDrawerTransactionPK = cashDrawerTransactionPK;
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

    public Payment getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Payment paymentId) {
        this.paymentId = paymentId;
    }

    public CashDrawer getCashDrawer() {
        return cashDrawer;
    }

    public void setCashDrawer(CashDrawer cashDrawer) {
        this.cashDrawer = cashDrawer;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cashDrawerTransactionPK != null ? cashDrawerTransactionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CashDrawerTransaction)) {
            return false;
        }
        CashDrawerTransaction other = (CashDrawerTransaction) object;
        if ((this.cashDrawerTransactionPK == null && other.cashDrawerTransactionPK != null) || (this.cashDrawerTransactionPK != null && !this.cashDrawerTransactionPK.equals(other.cashDrawerTransactionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.CashDrawerTransaction[ cashDrawerTransactionPK=" + cashDrawerTransactionPK + " ]";
    }
    
}
