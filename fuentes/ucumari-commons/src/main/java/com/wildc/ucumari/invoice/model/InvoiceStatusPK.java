/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.invoice.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Embeddable
public class InvoiceStatusPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "STATUS_ID")
    private String statusId;
    @Basic(optional = false)
    @Column(name = "INVOICE_ID")
    private String invoiceId;
    @Basic(optional = false)
    @Column(name = "STATUS_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date statusDate;

    public InvoiceStatusPK() {
    }

    public InvoiceStatusPK(String statusId, String invoiceId, Date statusDate) {
        this.statusId = statusId;
        this.invoiceId = invoiceId;
        this.statusDate = statusDate;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Date getStatusDate() {
        return statusDate;
    }

    public void setStatusDate(Date statusDate) {
        this.statusDate = statusDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (statusId != null ? statusId.hashCode() : 0);
        hash += (invoiceId != null ? invoiceId.hashCode() : 0);
        hash += (statusDate != null ? statusDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvoiceStatusPK)) {
            return false;
        }
        InvoiceStatusPK other = (InvoiceStatusPK) object;
        if ((this.statusId == null && other.statusId != null) || (this.statusId != null && !this.statusId.equals(other.statusId))) {
            return false;
        }
        if ((this.invoiceId == null && other.invoiceId != null) || (this.invoiceId != null && !this.invoiceId.equals(other.invoiceId))) {
            return false;
        }
        if ((this.statusDate == null && other.statusDate != null) || (this.statusDate != null && !this.statusDate.equals(other.statusDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.InvoiceStatusPK[ statusId=" + statusId + ", invoiceId=" + invoiceId + ", statusDate=" + statusDate + " ]";
    }
    
}
