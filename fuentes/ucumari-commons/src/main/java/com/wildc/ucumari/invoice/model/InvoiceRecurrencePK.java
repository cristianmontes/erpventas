/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.invoice.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class InvoiceRecurrencePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "INVOICE_ID")
    private String invoiceId;
    @Basic(optional = false)
    @Column(name = "RECURRENCE_INFO_ID")
    private String recurrenceInfoId;

    public InvoiceRecurrencePK() {
    }

    public InvoiceRecurrencePK(String invoiceId, String recurrenceInfoId) {
        this.invoiceId = invoiceId;
        this.recurrenceInfoId = recurrenceInfoId;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getRecurrenceInfoId() {
        return recurrenceInfoId;
    }

    public void setRecurrenceInfoId(String recurrenceInfoId) {
        this.recurrenceInfoId = recurrenceInfoId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invoiceId != null ? invoiceId.hashCode() : 0);
        hash += (recurrenceInfoId != null ? recurrenceInfoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvoiceRecurrencePK)) {
            return false;
        }
        InvoiceRecurrencePK other = (InvoiceRecurrencePK) object;
        if ((this.invoiceId == null && other.invoiceId != null) || (this.invoiceId != null && !this.invoiceId.equals(other.invoiceId))) {
            return false;
        }
        if ((this.recurrenceInfoId == null && other.recurrenceInfoId != null) || (this.recurrenceInfoId != null && !this.recurrenceInfoId.equals(other.recurrenceInfoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.InvoiceRecurrencePK[ invoiceId=" + invoiceId + ", recurrenceInfoId=" + recurrenceInfoId + " ]";
    }
    
}
