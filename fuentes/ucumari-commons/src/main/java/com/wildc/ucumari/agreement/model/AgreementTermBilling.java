/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.agreement.model;

import com.wildc.ucumari.invoice.model.Invoice;
import com.wildc.ucumari.invoice.model.InvoiceItem;
import com.wildc.ucumari.party.model.Party;
import com.wildc.ucumari.payment.model.PaymentApplication;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "agreement_term_billing")
@NamedQueries({
    @NamedQuery(name = "AgreementTermBilling.findAll", query = "SELECT a FROM AgreementTermBilling a")})
public class AgreementTermBilling implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "AGREEMENT_TERM_BILLING_ID")
    private String agreementTermBillingId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "AMOUNT")
    private BigDecimal amount;
    @Column(name = "ORIG_PAYMENT_AMOUNT")
    private BigDecimal origPaymentAmount;
    @Column(name = "ORIG_AMOUNT")
    private BigDecimal origAmount;
    @Column(name = "ORIG_COMMISSION_RATE")
    private BigDecimal origCommissionRate;
    @Column(name = "BILLING_DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date billingDatetime;
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
    @JoinColumn(name = "ORIG_PAYMENT_APPLICATION_ID", referencedColumnName = "PAYMENT_APPLICATION_ID")
    @ManyToOne
    private PaymentApplication origPaymentApplicationId;
    @JoinColumns({
        @JoinColumn(name = "ORIG_INVOICE_ID", referencedColumnName = "INVOICE_ID"),
        @JoinColumn(name = "ORIG_INVOICE_ITEM_SEQ_ID", referencedColumnName = "INVOICE_ITEM_SEQ_ID")})
    @ManyToOne
    private InvoiceItem invoiceItem;
    @JoinColumn(name = "ORIG_INVOICE_ID", referencedColumnName = "INVOICE_ID")
    @ManyToOne
    private Invoice origInvoiceId;
    @JoinColumn(name = "AGENT_PARTY_ID", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party agentPartyId;
    @JoinColumn(name = "INVOICE_ID", referencedColumnName = "INVOICE_ID")
    @ManyToOne
    private Invoice invoiceId;
    @JoinColumns({
        @JoinColumn(name = "INVOICE_ID", referencedColumnName = "INVOICE_ID"),
        @JoinColumn(name = "INVOICE_ITEM_SEQ_ID", referencedColumnName = "INVOICE_ITEM_SEQ_ID")})
    @ManyToOne
    private InvoiceItem invoiceItem1;
    @JoinColumn(name = "AGREEMENT_TERM_ID", referencedColumnName = "AGREEMENT_TERM_ID")
    @ManyToOne
    private AgreementTerm agreementTermId;
    @JoinColumn(name = "AGREEMENT_ID", referencedColumnName = "AGREEMENT_ID")
    @ManyToOne
    private Agreement agreementId;

    public AgreementTermBilling() {
    }

    public AgreementTermBilling(String agreementTermBillingId) {
        this.agreementTermBillingId = agreementTermBillingId;
    }

    public String getAgreementTermBillingId() {
        return agreementTermBillingId;
    }

    public void setAgreementTermBillingId(String agreementTermBillingId) {
        this.agreementTermBillingId = agreementTermBillingId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getOrigPaymentAmount() {
        return origPaymentAmount;
    }

    public void setOrigPaymentAmount(BigDecimal origPaymentAmount) {
        this.origPaymentAmount = origPaymentAmount;
    }

    public BigDecimal getOrigAmount() {
        return origAmount;
    }

    public void setOrigAmount(BigDecimal origAmount) {
        this.origAmount = origAmount;
    }

    public BigDecimal getOrigCommissionRate() {
        return origCommissionRate;
    }

    public void setOrigCommissionRate(BigDecimal origCommissionRate) {
        this.origCommissionRate = origCommissionRate;
    }

    public Date getBillingDatetime() {
        return billingDatetime;
    }

    public void setBillingDatetime(Date billingDatetime) {
        this.billingDatetime = billingDatetime;
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

    public PaymentApplication getOrigPaymentApplicationId() {
        return origPaymentApplicationId;
    }

    public void setOrigPaymentApplicationId(PaymentApplication origPaymentApplicationId) {
        this.origPaymentApplicationId = origPaymentApplicationId;
    }

    public InvoiceItem getInvoiceItem() {
        return invoiceItem;
    }

    public void setInvoiceItem(InvoiceItem invoiceItem) {
        this.invoiceItem = invoiceItem;
    }

    public Invoice getOrigInvoiceId() {
        return origInvoiceId;
    }

    public void setOrigInvoiceId(Invoice origInvoiceId) {
        this.origInvoiceId = origInvoiceId;
    }

    public Party getAgentPartyId() {
        return agentPartyId;
    }

    public void setAgentPartyId(Party agentPartyId) {
        this.agentPartyId = agentPartyId;
    }

    public Invoice getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Invoice invoiceId) {
        this.invoiceId = invoiceId;
    }

    public InvoiceItem getInvoiceItem1() {
        return invoiceItem1;
    }

    public void setInvoiceItem1(InvoiceItem invoiceItem1) {
        this.invoiceItem1 = invoiceItem1;
    }

    public AgreementTerm getAgreementTermId() {
        return agreementTermId;
    }

    public void setAgreementTermId(AgreementTerm agreementTermId) {
        this.agreementTermId = agreementTermId;
    }

    public Agreement getAgreementId() {
        return agreementId;
    }

    public void setAgreementId(Agreement agreementId) {
        this.agreementId = agreementId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (agreementTermBillingId != null ? agreementTermBillingId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AgreementTermBilling)) {
            return false;
        }
        AgreementTermBilling other = (AgreementTermBilling) object;
        if ((this.agreementTermBillingId == null && other.agreementTermBillingId != null) || (this.agreementTermBillingId != null && !this.agreementTermBillingId.equals(other.agreementTermBillingId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.AgreementTermBilling[ agreementTermBillingId=" + agreementTermBillingId + " ]";
    }
    
}
