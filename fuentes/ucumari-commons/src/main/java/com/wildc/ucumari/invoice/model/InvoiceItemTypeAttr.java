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
@Table(name = "invoice_item_type_attr")
@NamedQueries({
    @NamedQuery(name = "InvoiceItemTypeAttr.findAll", query = "SELECT i FROM InvoiceItemTypeAttr i")})
public class InvoiceItemTypeAttr implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InvoiceItemTypeAttrPK invoiceItemTypeAttrPK;
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
    @JoinColumn(name = "INVOICE_ITEM_TYPE_ID", referencedColumnName = "INVOICE_ITEM_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private InvoiceItemType invoiceItemType;

    public InvoiceItemTypeAttr() {
    }

    public InvoiceItemTypeAttr(InvoiceItemTypeAttrPK invoiceItemTypeAttrPK) {
        this.invoiceItemTypeAttrPK = invoiceItemTypeAttrPK;
    }

    public InvoiceItemTypeAttr(String invoiceItemTypeId, String attrName) {
        this.invoiceItemTypeAttrPK = new InvoiceItemTypeAttrPK(invoiceItemTypeId, attrName);
    }

    public InvoiceItemTypeAttrPK getInvoiceItemTypeAttrPK() {
        return invoiceItemTypeAttrPK;
    }

    public void setInvoiceItemTypeAttrPK(InvoiceItemTypeAttrPK invoiceItemTypeAttrPK) {
        this.invoiceItemTypeAttrPK = invoiceItemTypeAttrPK;
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

    public InvoiceItemType getInvoiceItemType() {
        return invoiceItemType;
    }

    public void setInvoiceItemType(InvoiceItemType invoiceItemType) {
        this.invoiceItemType = invoiceItemType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invoiceItemTypeAttrPK != null ? invoiceItemTypeAttrPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvoiceItemTypeAttr)) {
            return false;
        }
        InvoiceItemTypeAttr other = (InvoiceItemTypeAttr) object;
        if ((this.invoiceItemTypeAttrPK == null && other.invoiceItemTypeAttrPK != null) || (this.invoiceItemTypeAttrPK != null && !this.invoiceItemTypeAttrPK.equals(other.invoiceItemTypeAttrPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.InvoiceItemTypeAttr[ invoiceItemTypeAttrPK=" + invoiceItemTypeAttrPK + " ]";
    }
    
}
