/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.invoice.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.payment.model.Payment;
import com.wildc.ucumari.security.model.UserLogin;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "invoice_adjustment")
public class InvoiceAdjustment implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "INVOICE_ADJUSTMENT_ID")
    private String invoiceAdjustmentId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "AMOUNT")
    private BigDecimal amount;
    @Lob
    @Column(name = "ADJ_COMMENT")
    private String adjComment;
    @Column(name = "EFFECTIVE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date effectiveDate;
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
    @JoinColumn(name = "INVOICE_ADJUSTMENT_TYPE_ID", referencedColumnName = "INVOICE_ADJUSTMENT_TYPE_ID")
    @ManyToOne
    private InvoiceAdjustmentType invoiceAdjustmentTypeId;
    @JoinColumn(name = "INVOICE_ID", referencedColumnName = "INVOICE_ID")
    @ManyToOne
    private Invoice invoiceId;
    @JoinColumn(name = "CREATED_BY_USER_LOGIN", referencedColumnName = "USER_LOGIN_ID")
    @ManyToOne
    private UserLogin createdByUserLogin;
    /*@OneToMany(mappedBy = "invoiceAdjustmentId")
    private List<AcctgTrans> acctgTransList;*/

    public InvoiceAdjustment() {
    }

    public InvoiceAdjustment(String invoiceAdjustmentId) {
        this.invoiceAdjustmentId = invoiceAdjustmentId;
    }

    public String getInvoiceAdjustmentId() {
        return invoiceAdjustmentId;
    }

    public void setInvoiceAdjustmentId(String invoiceAdjustmentId) {
        this.invoiceAdjustmentId = invoiceAdjustmentId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getAdjComment() {
        return adjComment;
    }

    public void setAdjComment(String adjComment) {
        this.adjComment = adjComment;
    }

    public Date getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
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

    public InvoiceAdjustmentType getInvoiceAdjustmentTypeId() {
        return invoiceAdjustmentTypeId;
    }

    public void setInvoiceAdjustmentTypeId(InvoiceAdjustmentType invoiceAdjustmentTypeId) {
        this.invoiceAdjustmentTypeId = invoiceAdjustmentTypeId;
    }

    public Invoice getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Invoice invoiceId) {
        this.invoiceId = invoiceId;
    }

    public UserLogin getCreatedByUserLogin() {
        return createdByUserLogin;
    }

    public void setCreatedByUserLogin(UserLogin createdByUserLogin) {
        this.createdByUserLogin = createdByUserLogin;
    }
/*
    public List<AcctgTrans> getAcctgTransList() {
        return acctgTransList;
    }

    public void setAcctgTransList(List<AcctgTrans> acctgTransList) {
        this.acctgTransList = acctgTransList;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invoiceAdjustmentId != null ? invoiceAdjustmentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvoiceAdjustment)) {
            return false;
        }
        InvoiceAdjustment other = (InvoiceAdjustment) object;
        if ((this.invoiceAdjustmentId == null && other.invoiceAdjustmentId != null) || (this.invoiceAdjustmentId != null && !this.invoiceAdjustmentId.equals(other.invoiceAdjustmentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.InvoiceAdjustment[ invoiceAdjustmentId=" + invoiceAdjustmentId + " ]";
    }
    
}
