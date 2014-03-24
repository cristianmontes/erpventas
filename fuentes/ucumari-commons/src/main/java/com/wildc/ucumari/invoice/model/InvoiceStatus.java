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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.parameters.model.StatusItem;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "invoice_status")
public class InvoiceStatus implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InvoiceStatusPK invoiceStatusPK;
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
    @JoinColumn(name = "STATUS_ID", referencedColumnName = "STATUS_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private StatusItem statusItem;
    @JoinColumn(name = "INVOICE_ID", referencedColumnName = "INVOICE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Invoice invoice;

    public InvoiceStatus() {
    }

    public InvoiceStatus(InvoiceStatusPK invoiceStatusPK) {
        this.invoiceStatusPK = invoiceStatusPK;
    }

    public InvoiceStatus(String statusId, String invoiceId, Date statusDate) {
        this.invoiceStatusPK = new InvoiceStatusPK(statusId, invoiceId, statusDate);
    }

    public InvoiceStatusPK getInvoiceStatusPK() {
        return invoiceStatusPK;
    }

    public void setInvoiceStatusPK(InvoiceStatusPK invoiceStatusPK) {
        this.invoiceStatusPK = invoiceStatusPK;
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

    public StatusItem getStatusItem() {
        return statusItem;
    }

    public void setStatusItem(StatusItem statusItem) {
        this.statusItem = statusItem;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invoiceStatusPK != null ? invoiceStatusPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvoiceStatus)) {
            return false;
        }
        InvoiceStatus other = (InvoiceStatus) object;
        if ((this.invoiceStatusPK == null && other.invoiceStatusPK != null) || (this.invoiceStatusPK != null && !this.invoiceStatusPK.equals(other.invoiceStatusPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.InvoiceStatus[ invoiceStatusPK=" + invoiceStatusPK + " ]";
    }
    
}
