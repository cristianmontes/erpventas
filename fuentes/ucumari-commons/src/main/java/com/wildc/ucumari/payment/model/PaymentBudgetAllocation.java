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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.budget.model.Budget;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "payment_budget_allocation")
@NamedQueries({
    @NamedQuery(name = "PaymentBudgetAllocation.findAll", query = "SELECT p FROM PaymentBudgetAllocation p")})
public class PaymentBudgetAllocation implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PaymentBudgetAllocationPK paymentBudgetAllocationPK;
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
    @JoinColumn(name = "PAYMENT_ID", referencedColumnName = "PAYMENT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Payment payment;
    @JoinColumn(name = "BUDGET_ID", referencedColumnName = "BUDGET_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Budget budget;

    public PaymentBudgetAllocation() {
    }

    public PaymentBudgetAllocation(PaymentBudgetAllocationPK paymentBudgetAllocationPK) {
        this.paymentBudgetAllocationPK = paymentBudgetAllocationPK;
    }

    public PaymentBudgetAllocation(String budgetId, String budgetItemSeqId, String paymentId) {
        this.paymentBudgetAllocationPK = new PaymentBudgetAllocationPK(budgetId, budgetItemSeqId, paymentId);
    }

    public PaymentBudgetAllocationPK getPaymentBudgetAllocationPK() {
        return paymentBudgetAllocationPK;
    }

    public void setPaymentBudgetAllocationPK(PaymentBudgetAllocationPK paymentBudgetAllocationPK) {
        this.paymentBudgetAllocationPK = paymentBudgetAllocationPK;
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

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Budget getBudget() {
        return budget;
    }

    public void setBudget(Budget budget) {
        this.budget = budget;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paymentBudgetAllocationPK != null ? paymentBudgetAllocationPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PaymentBudgetAllocation)) {
            return false;
        }
        PaymentBudgetAllocation other = (PaymentBudgetAllocation) object;
        if ((this.paymentBudgetAllocationPK == null && other.paymentBudgetAllocationPK != null) || (this.paymentBudgetAllocationPK != null && !this.paymentBudgetAllocationPK.equals(other.paymentBudgetAllocationPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PaymentBudgetAllocation[ paymentBudgetAllocationPK=" + paymentBudgetAllocationPK + " ]";
    }
    
}
