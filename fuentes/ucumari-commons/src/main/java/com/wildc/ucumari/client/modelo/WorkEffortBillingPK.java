/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class WorkEffortBillingPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "WORK_EFFORT_ID")
    private String workEffortId;
    @Basic(optional = false)
    @Column(name = "INVOICE_ID")
    private String invoiceId;
    @Basic(optional = false)
    @Column(name = "INVOICE_ITEM_SEQ_ID")
    private String invoiceItemSeqId;

    public WorkEffortBillingPK() {
    }

    public WorkEffortBillingPK(String workEffortId, String invoiceId, String invoiceItemSeqId) {
        this.workEffortId = workEffortId;
        this.invoiceId = invoiceId;
        this.invoiceItemSeqId = invoiceItemSeqId;
    }

    public String getWorkEffortId() {
        return workEffortId;
    }

    public void setWorkEffortId(String workEffortId) {
        this.workEffortId = workEffortId;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (workEffortId != null ? workEffortId.hashCode() : 0);
        hash += (invoiceId != null ? invoiceId.hashCode() : 0);
        hash += (invoiceItemSeqId != null ? invoiceItemSeqId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WorkEffortBillingPK)) {
            return false;
        }
        WorkEffortBillingPK other = (WorkEffortBillingPK) object;
        if ((this.workEffortId == null && other.workEffortId != null) || (this.workEffortId != null && !this.workEffortId.equals(other.workEffortId))) {
            return false;
        }
        if ((this.invoiceId == null && other.invoiceId != null) || (this.invoiceId != null && !this.invoiceId.equals(other.invoiceId))) {
            return false;
        }
        if ((this.invoiceItemSeqId == null && other.invoiceItemSeqId != null) || (this.invoiceItemSeqId != null && !this.invoiceItemSeqId.equals(other.invoiceItemSeqId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.WorkEffortBillingPK[ workEffortId=" + workEffortId + ", invoiceId=" + invoiceId + ", invoiceItemSeqId=" + invoiceItemSeqId + " ]";
    }
    
}
