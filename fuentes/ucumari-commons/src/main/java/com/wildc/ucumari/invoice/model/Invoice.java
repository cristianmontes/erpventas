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
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.contact.model.ContactMech;
import com.wildc.ucumari.parameters.model.RoleType;
import com.wildc.ucumari.parameters.model.StatusItem;
import com.wildc.ucumari.parameters.model.Uom;
import com.wildc.ucumari.party.model.Party;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "invoice")
public class Invoice implements Serializable {
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "invoice")
    private List<InvoiceAttribute> invoiceAttributeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "invoice")
    private List<InvoiceContactMech> invoiceContactMechList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "invoice")
    private List<InvoiceStatus> invoiceStatusList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "invoice")
    private List<InvoiceRecurrence> invoiceRecurrenceList;
    @OneToMany(mappedBy = "invoiceId")
    private List<InvoiceTerm> invoiceTermList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "invoice")
    private List<InvoiceRole> invoiceRoleList;*/
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "INVOICE_ID")
    private String invoiceId;
    @Column(name = "INVOICE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date invoiceDate;
    @Column(name = "DUE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dueDate;
    @Column(name = "PAID_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date paidDate;
    @Column(name = "INVOICE_MESSAGE")
    private String invoiceMessage;
    @Column(name = "REFERENCE_NUMBER")
    private String referenceNumber;
    @Column(name = "DESCRIPTION")
    private String description;
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
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "INVOICE_ADJUSTED_TOTAL")
    private BigDecimal invoiceAdjustedTotal;
    @Column(name = "INVOICE_TOTAL")
    private BigDecimal invoiceTotal;
    @Column(name = "INTEREST_CHARGED")
    private BigDecimal interestCharged;
    @Column(name = "SALES_TAX_TOTAL")
    private BigDecimal salesTaxTotal;
    @Column(name = "ADJUSTED_AMOUNT")
    private BigDecimal adjustedAmount;
    @Column(name = "APPLIED_AMOUNT")
    private BigDecimal appliedAmount;
    @Column(name = "OPEN_AMOUNT")
    private BigDecimal openAmount;
    @Column(name = "PENDING_OPEN_AMOUNT")
    private BigDecimal pendingOpenAmount;
    @Column(name = "PENDING_APPLIED_AMOUNT")
    private BigDecimal pendingAppliedAmount;
    /*@OneToMany(mappedBy = "invoiceId")
    private List<PaymentApplication> paymentApplicationList;
    @OneToMany(mappedBy = "invoiceId")
    private List<InvoiceAdjustment> invoiceAdjustmentList;
    @OneToMany(mappedBy = "invoiceId")
    private List<AcctgTrans> acctgTransList;
    @OneToMany(mappedBy = "origInvoiceId")
    private List<AgreementTermBilling> agreementTermBillingList;
    @OneToMany(mappedBy = "invoiceId")
    private List<AgreementTermBilling> agreementTermBillingList1;*/
    @JoinColumn(name = "STATUS_ID", referencedColumnName = "STATUS_ID")
    @ManyToOne
    private StatusItem statusId;
    @JoinColumn(name = "ROLE_TYPE_ID", referencedColumnName = "ROLE_TYPE_ID")
    @ManyToOne
    private RoleType roleTypeId;
    /*@JoinColumn(name = "RECURRENCE_INFO_ID", referencedColumnName = "RECURRENCE_INFO_ID")
    @ManyToOne
    private RecurrenceInfo recurrenceInfoId;*/
    @JoinColumn(name = "PROCESSING_STATUS_ID", referencedColumnName = "STATUS_ID")
    @ManyToOne
    private StatusItem processingStatusId;
    @JoinColumn(name = "PARTY_ID_FROM", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party partyIdFrom;
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party partyId;
    @JoinColumn(name = "INVOICE_TYPE_ID", referencedColumnName = "INVOICE_TYPE_ID")
    @ManyToOne
    private InvoiceType invoiceTypeId;
    @JoinColumn(name = "CURRENCY_UOM_ID", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom currencyUomId;
    @JoinColumn(name = "CONTACT_MECH_ID", referencedColumnName = "CONTACT_MECH_ID")
    @ManyToOne
    private ContactMech contactMechId;
    /*@JoinColumn(name = "BILLING_ACCOUNT_ID", referencedColumnName = "BILLING_ACCOUNT_ID")
    @ManyToOne
    private BillingAccount billingAccountId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "invoice")
    private List<InvoiceItem> invoiceItemList;*/

    public Invoice() {
    }

    public Invoice(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getPaidDate() {
        return paidDate;
    }

    public void setPaidDate(Date paidDate) {
        this.paidDate = paidDate;
    }

    public String getInvoiceMessage() {
        return invoiceMessage;
    }

    public void setInvoiceMessage(String invoiceMessage) {
        this.invoiceMessage = invoiceMessage;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public BigDecimal getInvoiceAdjustedTotal() {
        return invoiceAdjustedTotal;
    }

    public void setInvoiceAdjustedTotal(BigDecimal invoiceAdjustedTotal) {
        this.invoiceAdjustedTotal = invoiceAdjustedTotal;
    }

    public BigDecimal getInvoiceTotal() {
        return invoiceTotal;
    }

    public void setInvoiceTotal(BigDecimal invoiceTotal) {
        this.invoiceTotal = invoiceTotal;
    }

    public BigDecimal getInterestCharged() {
        return interestCharged;
    }

    public void setInterestCharged(BigDecimal interestCharged) {
        this.interestCharged = interestCharged;
    }

    public BigDecimal getSalesTaxTotal() {
        return salesTaxTotal;
    }

    public void setSalesTaxTotal(BigDecimal salesTaxTotal) {
        this.salesTaxTotal = salesTaxTotal;
    }

    public BigDecimal getAdjustedAmount() {
        return adjustedAmount;
    }

    public void setAdjustedAmount(BigDecimal adjustedAmount) {
        this.adjustedAmount = adjustedAmount;
    }

    public BigDecimal getAppliedAmount() {
        return appliedAmount;
    }

    public void setAppliedAmount(BigDecimal appliedAmount) {
        this.appliedAmount = appliedAmount;
    }

    public BigDecimal getOpenAmount() {
        return openAmount;
    }

    public void setOpenAmount(BigDecimal openAmount) {
        this.openAmount = openAmount;
    }

    public BigDecimal getPendingOpenAmount() {
        return pendingOpenAmount;
    }

    public void setPendingOpenAmount(BigDecimal pendingOpenAmount) {
        this.pendingOpenAmount = pendingOpenAmount;
    }

    public BigDecimal getPendingAppliedAmount() {
        return pendingAppliedAmount;
    }

    public void setPendingAppliedAmount(BigDecimal pendingAppliedAmount) {
        this.pendingAppliedAmount = pendingAppliedAmount;
    }
/*
    public List<PaymentApplication> getPaymentApplicationList() {
        return paymentApplicationList;
    }

    public void setPaymentApplicationList(List<PaymentApplication> paymentApplicationList) {
        this.paymentApplicationList = paymentApplicationList;
    }

    public List<InvoiceAdjustment> getInvoiceAdjustmentList() {
        return invoiceAdjustmentList;
    }

    public void setInvoiceAdjustmentList(List<InvoiceAdjustment> invoiceAdjustmentList) {
        this.invoiceAdjustmentList = invoiceAdjustmentList;
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

    public List<AgreementTermBilling> getAgreementTermBillingList1() {
        return agreementTermBillingList1;
    }

    public void setAgreementTermBillingList1(List<AgreementTermBilling> agreementTermBillingList1) {
        this.agreementTermBillingList1 = agreementTermBillingList1;
    }*/

    public StatusItem getStatusId() {
        return statusId;
    }

    public void setStatusId(StatusItem statusId) {
        this.statusId = statusId;
    }

    public RoleType getRoleTypeId() {
        return roleTypeId;
    }

    public void setRoleTypeId(RoleType roleTypeId) {
        this.roleTypeId = roleTypeId;
    }
/*
    public RecurrenceInfo getRecurrenceInfoId() {
        return recurrenceInfoId;
    }

    public void setRecurrenceInfoId(RecurrenceInfo recurrenceInfoId) {
        this.recurrenceInfoId = recurrenceInfoId;
    }*/

    public StatusItem getProcessingStatusId() {
        return processingStatusId;
    }

    public void setProcessingStatusId(StatusItem processingStatusId) {
        this.processingStatusId = processingStatusId;
    }

    public Party getPartyIdFrom() {
        return partyIdFrom;
    }

    public void setPartyIdFrom(Party partyIdFrom) {
        this.partyIdFrom = partyIdFrom;
    }

    public Party getPartyId() {
        return partyId;
    }

    public void setPartyId(Party partyId) {
        this.partyId = partyId;
    }

    public InvoiceType getInvoiceTypeId() {
        return invoiceTypeId;
    }

    public void setInvoiceTypeId(InvoiceType invoiceTypeId) {
        this.invoiceTypeId = invoiceTypeId;
    }

    public Uom getCurrencyUomId() {
        return currencyUomId;
    }

    public void setCurrencyUomId(Uom currencyUomId) {
        this.currencyUomId = currencyUomId;
    }

    public ContactMech getContactMechId() {
        return contactMechId;
    }

    public void setContactMechId(ContactMech contactMechId) {
        this.contactMechId = contactMechId;
    }
/*
    public BillingAccount getBillingAccountId() {
        return billingAccountId;
    }

    public void setBillingAccountId(BillingAccount billingAccountId) {
        this.billingAccountId = billingAccountId;
    }

    public List<InvoiceItem> getInvoiceItemList() {
        return invoiceItemList;
    }

    public void setInvoiceItemList(List<InvoiceItem> invoiceItemList) {
        this.invoiceItemList = invoiceItemList;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invoiceId != null ? invoiceId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Invoice)) {
            return false;
        }
        Invoice other = (Invoice) object;
        if ((this.invoiceId == null && other.invoiceId != null) || (this.invoiceId != null && !this.invoiceId.equals(other.invoiceId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.Invoice[ invoiceId=" + invoiceId + " ]";
    }
/*
    public List<InvoiceAttribute> getInvoiceAttributeList() {
        return invoiceAttributeList;
    }

    public void setInvoiceAttributeList(List<InvoiceAttribute> invoiceAttributeList) {
        this.invoiceAttributeList = invoiceAttributeList;
    }

    public List<InvoiceContactMech> getInvoiceContactMechList() {
        return invoiceContactMechList;
    }

    public void setInvoiceContactMechList(List<InvoiceContactMech> invoiceContactMechList) {
        this.invoiceContactMechList = invoiceContactMechList;
    }

    public List<InvoiceStatus> getInvoiceStatusList() {
        return invoiceStatusList;
    }

    public void setInvoiceStatusList(List<InvoiceStatus> invoiceStatusList) {
        this.invoiceStatusList = invoiceStatusList;
    }

    public List<InvoiceRecurrence> getInvoiceRecurrenceList() {
        return invoiceRecurrenceList;
    }

    public void setInvoiceRecurrenceList(List<InvoiceRecurrence> invoiceRecurrenceList) {
        this.invoiceRecurrenceList = invoiceRecurrenceList;
    }

    public List<InvoiceTerm> getInvoiceTermList() {
        return invoiceTermList;
    }

    public void setInvoiceTermList(List<InvoiceTerm> invoiceTermList) {
        this.invoiceTermList = invoiceTermList;
    }

    public List<InvoiceRole> getInvoiceRoleList() {
        return invoiceRoleList;
    }

    public void setInvoiceRoleList(List<InvoiceRole> invoiceRoleList) {
        this.invoiceRoleList = invoiceRoleList;
    }*/
    
}
