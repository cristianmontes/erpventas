/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.invoice.model;

import com.wildc.ucumari.agreement.model.Agreement;
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
@Table(name = "invoice_item_assoc")
@NamedQueries({
    @NamedQuery(name = "InvoiceItemAssoc.findAll", query = "SELECT i FROM InvoiceItemAssoc i")})
public class InvoiceItemAssoc implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "INVOICE_ITEM_ASSOC_ID")
    private String invoiceItemAssocId;
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
    @JoinColumns({
        @JoinColumn(name = "INVOICE_ID_TO", referencedColumnName = "INVOICE_ID"),
        @JoinColumn(name = "INVOICE_ITEM_SEQ_ID_TO", referencedColumnName = "INVOICE_ITEM_SEQ_ID")})
    @ManyToOne
    private InvoiceItem invoiceItem;
    @JoinColumns({
        @JoinColumn(name = "INVOICE_ID_FROM", referencedColumnName = "INVOICE_ID"),
        @JoinColumn(name = "INVOICE_ITEM_SEQ_ID_FROM", referencedColumnName = "INVOICE_ITEM_SEQ_ID")})
    @ManyToOne
    private InvoiceItem invoiceItem1;
    @JoinColumn(name = "AGREEMENT_ID", referencedColumnName = "AGREEMENT_ID")
    @ManyToOne
    private Agreement agreementId;

    public InvoiceItemAssoc() {
    }

    public InvoiceItemAssoc(String invoiceItemAssocId) {
        this.invoiceItemAssocId = invoiceItemAssocId;
    }

    public String getInvoiceItemAssocId() {
        return invoiceItemAssocId;
    }

    public void setInvoiceItemAssocId(String invoiceItemAssocId) {
        this.invoiceItemAssocId = invoiceItemAssocId;
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

    public InvoiceItem getInvoiceItem() {
        return invoiceItem;
    }

    public void setInvoiceItem(InvoiceItem invoiceItem) {
        this.invoiceItem = invoiceItem;
    }

    public InvoiceItem getInvoiceItem1() {
        return invoiceItem1;
    }

    public void setInvoiceItem1(InvoiceItem invoiceItem1) {
        this.invoiceItem1 = invoiceItem1;
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
        hash += (invoiceItemAssocId != null ? invoiceItemAssocId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvoiceItemAssoc)) {
            return false;
        }
        InvoiceItemAssoc other = (InvoiceItemAssoc) object;
        if ((this.invoiceItemAssocId == null && other.invoiceItemAssocId != null) || (this.invoiceItemAssocId != null && !this.invoiceItemAssocId.equals(other.invoiceItemAssocId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.InvoiceItemAssoc[ invoiceItemAssocId=" + invoiceItemAssocId + " ]";
    }
    
}
