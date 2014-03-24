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
@Table(name = "invoice_item_type_map")
@NamedQueries({
    @NamedQuery(name = "InvoiceItemTypeMap.findAll", query = "SELECT i FROM InvoiceItemTypeMap i")})
public class InvoiceItemTypeMap implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InvoiceItemTypeMapPK invoiceItemTypeMapPK;
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
    @JoinColumn(name = "INVOICE_ITEM_TYPE_ID", referencedColumnName = "INVOICE_ITEM_TYPE_ID")
    @ManyToOne
    private InvoiceItemType invoiceItemTypeId;
    @JoinColumn(name = "INVOICE_TYPE_ID", referencedColumnName = "INVOICE_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private InvoiceType invoiceType;

    public InvoiceItemTypeMap() {
    }

    public InvoiceItemTypeMap(InvoiceItemTypeMapPK invoiceItemTypeMapPK) {
        this.invoiceItemTypeMapPK = invoiceItemTypeMapPK;
    }

    public InvoiceItemTypeMap(String invoiceItemMapKey, String invoiceTypeId) {
        this.invoiceItemTypeMapPK = new InvoiceItemTypeMapPK(invoiceItemMapKey, invoiceTypeId);
    }

    public InvoiceItemTypeMapPK getInvoiceItemTypeMapPK() {
        return invoiceItemTypeMapPK;
    }

    public void setInvoiceItemTypeMapPK(InvoiceItemTypeMapPK invoiceItemTypeMapPK) {
        this.invoiceItemTypeMapPK = invoiceItemTypeMapPK;
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

    public InvoiceItemType getInvoiceItemTypeId() {
        return invoiceItemTypeId;
    }

    public void setInvoiceItemTypeId(InvoiceItemType invoiceItemTypeId) {
        this.invoiceItemTypeId = invoiceItemTypeId;
    }

    public InvoiceType getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(InvoiceType invoiceType) {
        this.invoiceType = invoiceType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invoiceItemTypeMapPK != null ? invoiceItemTypeMapPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvoiceItemTypeMap)) {
            return false;
        }
        InvoiceItemTypeMap other = (InvoiceItemTypeMap) object;
        if ((this.invoiceItemTypeMapPK == null && other.invoiceItemTypeMapPK != null) || (this.invoiceItemTypeMapPK != null && !this.invoiceItemTypeMapPK.equals(other.invoiceItemTypeMapPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.InvoiceItemTypeMap[ invoiceItemTypeMapPK=" + invoiceItemTypeMapPK + " ]";
    }
    
}
