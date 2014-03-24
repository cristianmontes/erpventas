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

import com.wildc.ucumari.client.modelo.RecurrenceInfo;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "invoice_recurrence")
@NamedQueries({
    @NamedQuery(name = "InvoiceRecurrence.findAll", query = "SELECT i FROM InvoiceRecurrence i")})
public class InvoiceRecurrence implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InvoiceRecurrencePK invoiceRecurrencePK;
    @Column(name = "LAST_RECURRENCE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastRecurrenceDate;
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
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
    @JoinColumn(name = "RECURRENCE_INFO_ID", referencedColumnName = "RECURRENCE_INFO_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private RecurrenceInfo recurrenceInfo;
    @JoinColumn(name = "INVOICE_ID", referencedColumnName = "INVOICE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Invoice invoice;

    public InvoiceRecurrence() {
    }

    public InvoiceRecurrence(InvoiceRecurrencePK invoiceRecurrencePK) {
        this.invoiceRecurrencePK = invoiceRecurrencePK;
    }

    public InvoiceRecurrence(String invoiceId, String recurrenceInfoId) {
        this.invoiceRecurrencePK = new InvoiceRecurrencePK(invoiceId, recurrenceInfoId);
    }

    public InvoiceRecurrencePK getInvoiceRecurrencePK() {
        return invoiceRecurrencePK;
    }

    public void setInvoiceRecurrencePK(InvoiceRecurrencePK invoiceRecurrencePK) {
        this.invoiceRecurrencePK = invoiceRecurrencePK;
    }

    public Date getLastRecurrenceDate() {
        return lastRecurrenceDate;
    }

    public void setLastRecurrenceDate(Date lastRecurrenceDate) {
        this.lastRecurrenceDate = lastRecurrenceDate;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
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

    public RecurrenceInfo getRecurrenceInfo() {
        return recurrenceInfo;
    }

    public void setRecurrenceInfo(RecurrenceInfo recurrenceInfo) {
        this.recurrenceInfo = recurrenceInfo;
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
        hash += (invoiceRecurrencePK != null ? invoiceRecurrencePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvoiceRecurrence)) {
            return false;
        }
        InvoiceRecurrence other = (InvoiceRecurrence) object;
        if ((this.invoiceRecurrencePK == null && other.invoiceRecurrencePK != null) || (this.invoiceRecurrencePK != null && !this.invoiceRecurrencePK.equals(other.invoiceRecurrencePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.InvoiceRecurrence[ invoiceRecurrencePK=" + invoiceRecurrencePK + " ]";
    }
    
}
