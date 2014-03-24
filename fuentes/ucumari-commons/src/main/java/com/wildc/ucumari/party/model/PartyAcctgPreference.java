/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.party.model;

import com.wildc.ucumari.accounting.model.GlJournal;
import com.wildc.ucumari.parameters.model.Enumeration;
import com.wildc.ucumari.parameters.model.Uom;
import com.wildc.ucumari.payment.model.PaymentMethod;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "party_acctg_preference")
@NamedQueries({
    @NamedQuery(name = "PartyAcctgPreference.findAll", query = "SELECT p FROM PartyAcctgPreference p")})
public class PartyAcctgPreference implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PARTY_ID")
    private String partyId;
    @Column(name = "FISCAL_YEAR_START_MONTH")
    private BigInteger fiscalYearStartMonth;
    @Column(name = "FISCAL_YEAR_START_DAY")
    private BigInteger fiscalYearStartDay;
    @Column(name = "INVOICE_ID_PREFIX")
    private String invoiceIdPrefix;
    @Column(name = "LAST_INVOICE_NUMBER")
    private BigInteger lastInvoiceNumber;
    @Column(name = "LAST_INVOICE_RESTART_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastInvoiceRestartDate;
    @Column(name = "USE_INVOICE_ID_FOR_RETURNS")
    private Character useInvoiceIdForReturns;
    @Column(name = "QUOTE_ID_PREFIX")
    private String quoteIdPrefix;
    @Column(name = "LAST_QUOTE_NUMBER")
    private BigInteger lastQuoteNumber;
    @Column(name = "ORDER_ID_PREFIX")
    private String orderIdPrefix;
    @Column(name = "LAST_ORDER_NUMBER")
    private BigInteger lastOrderNumber;
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
    @Column(name = "SALES_INVOICE_FOOTER_TEXT")
    private String salesInvoiceFooterText;
    @Column(name = "GROUP_SALES_TAX_ON_INVOICE_PDF")
    private Character groupSalesTaxOnInvoicePdf;
    @Column(name = "ALLOC_PAYMENT_TAGS_TO_APPL")
    private Character allocPaymentTagsToAppl;
    @JoinColumn(name = "REFUND_PAYMENT_METHOD_ID", referencedColumnName = "PAYMENT_METHOD_ID")
    @ManyToOne
    private PaymentMethod refundPaymentMethodId;
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Party party;
    @JoinColumn(name = "TAX_FORM_ID", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration taxFormId;
    @JoinColumn(name = "QUOTE_SEQUENCE_ENUM_ID", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration quoteSequenceEnumId;
    @JoinColumn(name = "ORDER_SEQUENCE_ENUM_ID", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration orderSequenceEnumId;
    @JoinColumn(name = "INVOICE_SEQUENCE_ENUM_ID", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration invoiceSequenceEnumId;
    @JoinColumn(name = "ERROR_GL_JOURNAL_ID", referencedColumnName = "GL_JOURNAL_ID")
    @ManyToOne
    private GlJournal errorGlJournalId;
    @JoinColumn(name = "COSTING_METHOD_ID", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration costingMethodId;
    @JoinColumn(name = "COGS_METHOD_ID", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration cogsMethodId;
    @JoinColumn(name = "BASE_CURRENCY_UOM_ID", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom baseCurrencyUomId;

    public PartyAcctgPreference() {
    }

    public PartyAcctgPreference(String partyId) {
        this.partyId = partyId;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public BigInteger getFiscalYearStartMonth() {
        return fiscalYearStartMonth;
    }

    public void setFiscalYearStartMonth(BigInteger fiscalYearStartMonth) {
        this.fiscalYearStartMonth = fiscalYearStartMonth;
    }

    public BigInteger getFiscalYearStartDay() {
        return fiscalYearStartDay;
    }

    public void setFiscalYearStartDay(BigInteger fiscalYearStartDay) {
        this.fiscalYearStartDay = fiscalYearStartDay;
    }

    public String getInvoiceIdPrefix() {
        return invoiceIdPrefix;
    }

    public void setInvoiceIdPrefix(String invoiceIdPrefix) {
        this.invoiceIdPrefix = invoiceIdPrefix;
    }

    public BigInteger getLastInvoiceNumber() {
        return lastInvoiceNumber;
    }

    public void setLastInvoiceNumber(BigInteger lastInvoiceNumber) {
        this.lastInvoiceNumber = lastInvoiceNumber;
    }

    public Date getLastInvoiceRestartDate() {
        return lastInvoiceRestartDate;
    }

    public void setLastInvoiceRestartDate(Date lastInvoiceRestartDate) {
        this.lastInvoiceRestartDate = lastInvoiceRestartDate;
    }

    public Character getUseInvoiceIdForReturns() {
        return useInvoiceIdForReturns;
    }

    public void setUseInvoiceIdForReturns(Character useInvoiceIdForReturns) {
        this.useInvoiceIdForReturns = useInvoiceIdForReturns;
    }

    public String getQuoteIdPrefix() {
        return quoteIdPrefix;
    }

    public void setQuoteIdPrefix(String quoteIdPrefix) {
        this.quoteIdPrefix = quoteIdPrefix;
    }

    public BigInteger getLastQuoteNumber() {
        return lastQuoteNumber;
    }

    public void setLastQuoteNumber(BigInteger lastQuoteNumber) {
        this.lastQuoteNumber = lastQuoteNumber;
    }

    public String getOrderIdPrefix() {
        return orderIdPrefix;
    }

    public void setOrderIdPrefix(String orderIdPrefix) {
        this.orderIdPrefix = orderIdPrefix;
    }

    public BigInteger getLastOrderNumber() {
        return lastOrderNumber;
    }

    public void setLastOrderNumber(BigInteger lastOrderNumber) {
        this.lastOrderNumber = lastOrderNumber;
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

    public String getSalesInvoiceFooterText() {
        return salesInvoiceFooterText;
    }

    public void setSalesInvoiceFooterText(String salesInvoiceFooterText) {
        this.salesInvoiceFooterText = salesInvoiceFooterText;
    }

    public Character getGroupSalesTaxOnInvoicePdf() {
        return groupSalesTaxOnInvoicePdf;
    }

    public void setGroupSalesTaxOnInvoicePdf(Character groupSalesTaxOnInvoicePdf) {
        this.groupSalesTaxOnInvoicePdf = groupSalesTaxOnInvoicePdf;
    }

    public Character getAllocPaymentTagsToAppl() {
        return allocPaymentTagsToAppl;
    }

    public void setAllocPaymentTagsToAppl(Character allocPaymentTagsToAppl) {
        this.allocPaymentTagsToAppl = allocPaymentTagsToAppl;
    }

    public PaymentMethod getRefundPaymentMethodId() {
        return refundPaymentMethodId;
    }

    public void setRefundPaymentMethodId(PaymentMethod refundPaymentMethodId) {
        this.refundPaymentMethodId = refundPaymentMethodId;
    }

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    public Enumeration getTaxFormId() {
        return taxFormId;
    }

    public void setTaxFormId(Enumeration taxFormId) {
        this.taxFormId = taxFormId;
    }

    public Enumeration getQuoteSequenceEnumId() {
        return quoteSequenceEnumId;
    }

    public void setQuoteSequenceEnumId(Enumeration quoteSequenceEnumId) {
        this.quoteSequenceEnumId = quoteSequenceEnumId;
    }

    public Enumeration getOrderSequenceEnumId() {
        return orderSequenceEnumId;
    }

    public void setOrderSequenceEnumId(Enumeration orderSequenceEnumId) {
        this.orderSequenceEnumId = orderSequenceEnumId;
    }

    public Enumeration getInvoiceSequenceEnumId() {
        return invoiceSequenceEnumId;
    }

    public void setInvoiceSequenceEnumId(Enumeration invoiceSequenceEnumId) {
        this.invoiceSequenceEnumId = invoiceSequenceEnumId;
    }

    public GlJournal getErrorGlJournalId() {
        return errorGlJournalId;
    }

    public void setErrorGlJournalId(GlJournal errorGlJournalId) {
        this.errorGlJournalId = errorGlJournalId;
    }

    public Enumeration getCostingMethodId() {
        return costingMethodId;
    }

    public void setCostingMethodId(Enumeration costingMethodId) {
        this.costingMethodId = costingMethodId;
    }

    public Enumeration getCogsMethodId() {
        return cogsMethodId;
    }

    public void setCogsMethodId(Enumeration cogsMethodId) {
        this.cogsMethodId = cogsMethodId;
    }

    public Uom getBaseCurrencyUomId() {
        return baseCurrencyUomId;
    }

    public void setBaseCurrencyUomId(Uom baseCurrencyUomId) {
        this.baseCurrencyUomId = baseCurrencyUomId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (partyId != null ? partyId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PartyAcctgPreference)) {
            return false;
        }
        PartyAcctgPreference other = (PartyAcctgPreference) object;
        if ((this.partyId == null && other.partyId != null) || (this.partyId != null && !this.partyId.equals(other.partyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PartyAcctgPreference[ partyId=" + partyId + " ]";
    }
    
}
