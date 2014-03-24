/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.payment.model;

import com.wildc.ucumari.accounting.model.AcctgTrans;
import com.wildc.ucumari.accounting.model.BillingAccount;
import com.wildc.ucumari.accounting.model.GlAccount;
import com.wildc.ucumari.agreement.model.AgreementTermBilling;
import com.wildc.ucumari.client.modelo.LockboxBatchItemDetail;
import com.wildc.ucumari.invoice.model.Invoice;
import com.wildc.ucumari.parameters.model.Enumeration;
import com.wildc.ucumari.parameters.model.Geo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
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
@Table(name = "payment_application")
@NamedQueries({
    @NamedQuery(name = "PaymentApplication.findAll", query = "SELECT p FROM PaymentApplication p")})
public class PaymentApplication implements Serializable {
    @OneToMany(mappedBy = "paymentApplicationId")
    private List<LockboxBatchItemDetail> lockboxBatchItemDetailList;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PAYMENT_APPLICATION_ID")
    private String paymentApplicationId;
    @Column(name = "INVOICE_ITEM_SEQ_ID")
    private String invoiceItemSeqId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "AMOUNT_APPLIED")
    private BigDecimal amountApplied;
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
    @Column(name = "NOTE")
    private String note;
    @JoinColumn(name = "TO_PAYMENT_ID", referencedColumnName = "PAYMENT_ID")
    @ManyToOne
    private Payment toPaymentId;
    @JoinColumn(name = "ACCTG_TAG_ENUM_ID9", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration acctgTagEnumId9;
    @JoinColumn(name = "ACCTG_TAG_ENUM_ID8", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration acctgTagEnumId8;
    @JoinColumn(name = "ACCTG_TAG_ENUM_ID7", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration acctgTagEnumId7;
    @JoinColumn(name = "BILLING_ACCOUNT_ID", referencedColumnName = "BILLING_ACCOUNT_ID")
    @ManyToOne
    private BillingAccount billingAccountId;
    @JoinColumn(name = "TAX_AUTH_GEO_ID", referencedColumnName = "GEO_ID")
    @ManyToOne
    private Geo taxAuthGeoId;
    @JoinColumn(name = "INVOICE_ID", referencedColumnName = "INVOICE_ID")
    @ManyToOne
    private Invoice invoiceId;
    @JoinColumn(name = "OVERRIDE_GL_ACCOUNT_ID", referencedColumnName = "GL_ACCOUNT_ID")
    @ManyToOne
    private GlAccount overrideGlAccountId;
    @JoinColumn(name = "PAYMENT_ID", referencedColumnName = "PAYMENT_ID")
    @ManyToOne
    private Payment paymentId;
    @JoinColumn(name = "ACCTG_TAG_ENUM_ID1", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration acctgTagEnumId1;
    @JoinColumn(name = "ACCTG_TAG_ENUM_ID10", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration acctgTagEnumId10;
    @JoinColumn(name = "ACCTG_TAG_ENUM_ID2", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration acctgTagEnumId2;
    @JoinColumn(name = "ACCTG_TAG_ENUM_ID3", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration acctgTagEnumId3;
    @JoinColumn(name = "ACCTG_TAG_ENUM_ID4", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration acctgTagEnumId4;
    @JoinColumn(name = "ACCTG_TAG_ENUM_ID5", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration acctgTagEnumId5;
    @JoinColumn(name = "ACCTG_TAG_ENUM_ID6", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration acctgTagEnumId6;
    @OneToMany(mappedBy = "paymentApplicationId")
    private List<AcctgTrans> acctgTransList;
    @OneToMany(mappedBy = "origPaymentApplicationId")
    private List<AgreementTermBilling> agreementTermBillingList;

    public PaymentApplication() {
    }

    public PaymentApplication(String paymentApplicationId) {
        this.paymentApplicationId = paymentApplicationId;
    }

    public String getPaymentApplicationId() {
        return paymentApplicationId;
    }

    public void setPaymentApplicationId(String paymentApplicationId) {
        this.paymentApplicationId = paymentApplicationId;
    }

    public String getInvoiceItemSeqId() {
        return invoiceItemSeqId;
    }

    public void setInvoiceItemSeqId(String invoiceItemSeqId) {
        this.invoiceItemSeqId = invoiceItemSeqId;
    }

    public BigDecimal getAmountApplied() {
        return amountApplied;
    }

    public void setAmountApplied(BigDecimal amountApplied) {
        this.amountApplied = amountApplied;
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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Payment getToPaymentId() {
        return toPaymentId;
    }

    public void setToPaymentId(Payment toPaymentId) {
        this.toPaymentId = toPaymentId;
    }

    public Enumeration getAcctgTagEnumId9() {
        return acctgTagEnumId9;
    }

    public void setAcctgTagEnumId9(Enumeration acctgTagEnumId9) {
        this.acctgTagEnumId9 = acctgTagEnumId9;
    }

    public Enumeration getAcctgTagEnumId8() {
        return acctgTagEnumId8;
    }

    public void setAcctgTagEnumId8(Enumeration acctgTagEnumId8) {
        this.acctgTagEnumId8 = acctgTagEnumId8;
    }

    public Enumeration getAcctgTagEnumId7() {
        return acctgTagEnumId7;
    }

    public void setAcctgTagEnumId7(Enumeration acctgTagEnumId7) {
        this.acctgTagEnumId7 = acctgTagEnumId7;
    }

    public BillingAccount getBillingAccountId() {
        return billingAccountId;
    }

    public void setBillingAccountId(BillingAccount billingAccountId) {
        this.billingAccountId = billingAccountId;
    }

    public Geo getTaxAuthGeoId() {
        return taxAuthGeoId;
    }

    public void setTaxAuthGeoId(Geo taxAuthGeoId) {
        this.taxAuthGeoId = taxAuthGeoId;
    }

    public Invoice getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Invoice invoiceId) {
        this.invoiceId = invoiceId;
    }

    public GlAccount getOverrideGlAccountId() {
        return overrideGlAccountId;
    }

    public void setOverrideGlAccountId(GlAccount overrideGlAccountId) {
        this.overrideGlAccountId = overrideGlAccountId;
    }

    public Payment getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Payment paymentId) {
        this.paymentId = paymentId;
    }

    public Enumeration getAcctgTagEnumId1() {
        return acctgTagEnumId1;
    }

    public void setAcctgTagEnumId1(Enumeration acctgTagEnumId1) {
        this.acctgTagEnumId1 = acctgTagEnumId1;
    }

    public Enumeration getAcctgTagEnumId10() {
        return acctgTagEnumId10;
    }

    public void setAcctgTagEnumId10(Enumeration acctgTagEnumId10) {
        this.acctgTagEnumId10 = acctgTagEnumId10;
    }

    public Enumeration getAcctgTagEnumId2() {
        return acctgTagEnumId2;
    }

    public void setAcctgTagEnumId2(Enumeration acctgTagEnumId2) {
        this.acctgTagEnumId2 = acctgTagEnumId2;
    }

    public Enumeration getAcctgTagEnumId3() {
        return acctgTagEnumId3;
    }

    public void setAcctgTagEnumId3(Enumeration acctgTagEnumId3) {
        this.acctgTagEnumId3 = acctgTagEnumId3;
    }

    public Enumeration getAcctgTagEnumId4() {
        return acctgTagEnumId4;
    }

    public void setAcctgTagEnumId4(Enumeration acctgTagEnumId4) {
        this.acctgTagEnumId4 = acctgTagEnumId4;
    }

    public Enumeration getAcctgTagEnumId5() {
        return acctgTagEnumId5;
    }

    public void setAcctgTagEnumId5(Enumeration acctgTagEnumId5) {
        this.acctgTagEnumId5 = acctgTagEnumId5;
    }

    public Enumeration getAcctgTagEnumId6() {
        return acctgTagEnumId6;
    }

    public void setAcctgTagEnumId6(Enumeration acctgTagEnumId6) {
        this.acctgTagEnumId6 = acctgTagEnumId6;
    }

    public List<AcctgTrans> getAcctgTransList() {
        return acctgTransList;
    }

    public void setAcctgTransList(List<AcctgTrans> acctgTransList) {
        this.acctgTransList = acctgTransList;
    }

    public List<AgreementTermBilling> getAgreementTermBillingList() {
        return agreementTermBillingList;
    }

    public void setAgreementTermBillingList(List<AgreementTermBilling> agreementTermBillingList) {
        this.agreementTermBillingList = agreementTermBillingList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paymentApplicationId != null ? paymentApplicationId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PaymentApplication)) {
            return false;
        }
        PaymentApplication other = (PaymentApplication) object;
        if ((this.paymentApplicationId == null && other.paymentApplicationId != null) || (this.paymentApplicationId != null && !this.paymentApplicationId.equals(other.paymentApplicationId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PaymentApplication[ paymentApplicationId=" + paymentApplicationId + " ]";
    }

    public List<LockboxBatchItemDetail> getLockboxBatchItemDetailList() {
        return lockboxBatchItemDetailList;
    }

    public void setLockboxBatchItemDetailList(List<LockboxBatchItemDetail> lockboxBatchItemDetailList) {
        this.lockboxBatchItemDetailList = lockboxBatchItemDetailList;
    }
    
}
