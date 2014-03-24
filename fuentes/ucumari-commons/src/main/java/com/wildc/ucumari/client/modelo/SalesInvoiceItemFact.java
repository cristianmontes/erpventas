/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "sales_invoice_item_fact")
@NamedQueries({
    @NamedQuery(name = "SalesInvoiceItemFact.findAll", query = "SELECT s FROM SalesInvoiceItemFact s")})
public class SalesInvoiceItemFact implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SALES_INV_ITEM_FACT_ID")
    private Long salesInvItemFactId;
    @Column(name = "DATE_DIM_ID")
    private BigInteger dateDimId;
    @Column(name = "STORE_DIM_ID")
    private BigInteger storeDimId;
    @Column(name = "CURRENCY_DIM_ID")
    private BigInteger currencyDimId;
    @Column(name = "ORGANIZATION_DIM_ID")
    private BigInteger organizationDimId;
    @Column(name = "INVOICE_ID")
    private String invoiceId;
    @Column(name = "INVOICE_ITEM_SEQ_ID")
    private String invoiceItemSeqId;
    @Column(name = "INVOICE_ADJUSTMENT_ID")
    private String invoiceAdjustmentId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "GROSS_AMOUNT")
    private BigDecimal grossAmount;
    @Column(name = "DISCOUNTS")
    private BigDecimal discounts;
    @Column(name = "REFUNDS")
    private BigDecimal refunds;
    @Column(name = "NET_AMOUNT")
    private BigDecimal netAmount;
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

    public SalesInvoiceItemFact() {
    }

    public SalesInvoiceItemFact(Long salesInvItemFactId) {
        this.salesInvItemFactId = salesInvItemFactId;
    }

    public Long getSalesInvItemFactId() {
        return salesInvItemFactId;
    }

    public void setSalesInvItemFactId(Long salesInvItemFactId) {
        this.salesInvItemFactId = salesInvItemFactId;
    }

    public BigInteger getDateDimId() {
        return dateDimId;
    }

    public void setDateDimId(BigInteger dateDimId) {
        this.dateDimId = dateDimId;
    }

    public BigInteger getStoreDimId() {
        return storeDimId;
    }

    public void setStoreDimId(BigInteger storeDimId) {
        this.storeDimId = storeDimId;
    }

    public BigInteger getCurrencyDimId() {
        return currencyDimId;
    }

    public void setCurrencyDimId(BigInteger currencyDimId) {
        this.currencyDimId = currencyDimId;
    }

    public BigInteger getOrganizationDimId() {
        return organizationDimId;
    }

    public void setOrganizationDimId(BigInteger organizationDimId) {
        this.organizationDimId = organizationDimId;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getInvoiceItemSeqId() {
        return invoiceItemSeqId;
    }

    public void setInvoiceItemSeqId(String invoiceItemSeqId) {
        this.invoiceItemSeqId = invoiceItemSeqId;
    }

    public String getInvoiceAdjustmentId() {
        return invoiceAdjustmentId;
    }

    public void setInvoiceAdjustmentId(String invoiceAdjustmentId) {
        this.invoiceAdjustmentId = invoiceAdjustmentId;
    }

    public BigDecimal getGrossAmount() {
        return grossAmount;
    }

    public void setGrossAmount(BigDecimal grossAmount) {
        this.grossAmount = grossAmount;
    }

    public BigDecimal getDiscounts() {
        return discounts;
    }

    public void setDiscounts(BigDecimal discounts) {
        this.discounts = discounts;
    }

    public BigDecimal getRefunds() {
        return refunds;
    }

    public void setRefunds(BigDecimal refunds) {
        this.refunds = refunds;
    }

    public BigDecimal getNetAmount() {
        return netAmount;
    }

    public void setNetAmount(BigDecimal netAmount) {
        this.netAmount = netAmount;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (salesInvItemFactId != null ? salesInvItemFactId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SalesInvoiceItemFact)) {
            return false;
        }
        SalesInvoiceItemFact other = (SalesInvoiceItemFact) object;
        if ((this.salesInvItemFactId == null && other.salesInvItemFactId != null) || (this.salesInvItemFactId != null && !this.salesInvItemFactId.equals(other.salesInvItemFactId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.SalesInvoiceItemFact[ salesInvItemFactId=" + salesInvItemFactId + " ]";
    }
    
}
