/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.invoice.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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

import com.wildc.ucumari.parameters.model.TermType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "invoice_term")
@NamedQueries({
    @NamedQuery(name = "InvoiceTerm.findAll", query = "SELECT i FROM InvoiceTerm i")})
public class InvoiceTerm implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "INVOICE_TERM_ID")
    private String invoiceTermId;
    @Column(name = "INVOICE_ITEM_SEQ_ID")
    private String invoiceItemSeqId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TERM_VALUE")
    private BigDecimal termValue;
    @Column(name = "TERM_DAYS")
    private BigInteger termDays;
    @Column(name = "TEXT_VALUE")
    private String textValue;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "UOM_ID")
    private String uomId;
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
    @Column(name = "MIN_QUANTITY")
    private BigDecimal minQuantity;
    @Column(name = "MAX_QUANTITY")
    private BigDecimal maxQuantity;
    @JoinColumn(name = "TERM_TYPE_ID", referencedColumnName = "TERM_TYPE_ID")
    @ManyToOne
    private TermType termTypeId;
    @JoinColumn(name = "INVOICE_ID", referencedColumnName = "INVOICE_ID")
    @ManyToOne
    private Invoice invoiceId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "invoiceTerm")
    private List<InvoiceTermAttribute> invoiceTermAttributeList;

    public InvoiceTerm() {
    }

    public InvoiceTerm(String invoiceTermId) {
        this.invoiceTermId = invoiceTermId;
    }

    public String getInvoiceTermId() {
        return invoiceTermId;
    }

    public void setInvoiceTermId(String invoiceTermId) {
        this.invoiceTermId = invoiceTermId;
    }

    public String getInvoiceItemSeqId() {
        return invoiceItemSeqId;
    }

    public void setInvoiceItemSeqId(String invoiceItemSeqId) {
        this.invoiceItemSeqId = invoiceItemSeqId;
    }

    public BigDecimal getTermValue() {
        return termValue;
    }

    public void setTermValue(BigDecimal termValue) {
        this.termValue = termValue;
    }

    public BigInteger getTermDays() {
        return termDays;
    }

    public void setTermDays(BigInteger termDays) {
        this.termDays = termDays;
    }

    public String getTextValue() {
        return textValue;
    }

    public void setTextValue(String textValue) {
        this.textValue = textValue;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUomId() {
        return uomId;
    }

    public void setUomId(String uomId) {
        this.uomId = uomId;
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

    public BigDecimal getMinQuantity() {
        return minQuantity;
    }

    public void setMinQuantity(BigDecimal minQuantity) {
        this.minQuantity = minQuantity;
    }

    public BigDecimal getMaxQuantity() {
        return maxQuantity;
    }

    public void setMaxQuantity(BigDecimal maxQuantity) {
        this.maxQuantity = maxQuantity;
    }

    public TermType getTermTypeId() {
        return termTypeId;
    }

    public void setTermTypeId(TermType termTypeId) {
        this.termTypeId = termTypeId;
    }

    public Invoice getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Invoice invoiceId) {
        this.invoiceId = invoiceId;
    }

    public List<InvoiceTermAttribute> getInvoiceTermAttributeList() {
        return invoiceTermAttributeList;
    }

    public void setInvoiceTermAttributeList(List<InvoiceTermAttribute> invoiceTermAttributeList) {
        this.invoiceTermAttributeList = invoiceTermAttributeList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invoiceTermId != null ? invoiceTermId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvoiceTerm)) {
            return false;
        }
        InvoiceTerm other = (InvoiceTerm) object;
        if ((this.invoiceTermId == null && other.invoiceTermId != null) || (this.invoiceTermId != null && !this.invoiceTermId.equals(other.invoiceTermId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.InvoiceTerm[ invoiceTermId=" + invoiceTermId + " ]";
    }
    
}
