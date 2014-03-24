/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.invoice.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "invoice_item_attribute")
@NamedQueries({
    @NamedQuery(name = "InvoiceItemAttribute.findAll", query = "SELECT i FROM InvoiceItemAttribute i")})
public class InvoiceItemAttribute implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InvoiceItemAttributePK invoiceItemAttributePK;
    @Column(name = "ATTR_VALUE")
    private String attrValue;
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
        @JoinColumn(name = "INVOICE_ID", referencedColumnName = "INVOICE_ID", insertable = false, updatable = false),
        @JoinColumn(name = "INVOICE_ITEM_SEQ_ID", referencedColumnName = "INVOICE_ITEM_SEQ_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private InvoiceItem invoiceItem;

    public InvoiceItemAttribute() {
    }

    public InvoiceItemAttribute(InvoiceItemAttributePK invoiceItemAttributePK) {
        this.invoiceItemAttributePK = invoiceItemAttributePK;
    }

    public InvoiceItemAttribute(String invoiceId, String invoiceItemSeqId, String attrName) {
        this.invoiceItemAttributePK = new InvoiceItemAttributePK(invoiceId, invoiceItemSeqId, attrName);
    }

    public InvoiceItemAttributePK getInvoiceItemAttributePK() {
        return invoiceItemAttributePK;
    }

    public void setInvoiceItemAttributePK(InvoiceItemAttributePK invoiceItemAttributePK) {
        this.invoiceItemAttributePK = invoiceItemAttributePK;
    }

    public String getAttrValue() {
        return attrValue;
    }

    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invoiceItemAttributePK != null ? invoiceItemAttributePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvoiceItemAttribute)) {
            return false;
        }
        InvoiceItemAttribute other = (InvoiceItemAttribute) object;
        if ((this.invoiceItemAttributePK == null && other.invoiceItemAttributePK != null) || (this.invoiceItemAttributePK != null && !this.invoiceItemAttributePK.equals(other.invoiceItemAttributePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.InvoiceItemAttribute[ invoiceItemAttributePK=" + invoiceItemAttributePK + " ]";
    }
    
}
