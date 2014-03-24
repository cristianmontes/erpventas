/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.returns.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class ReturnItemBillingPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "RETURN_ID")
    private String returnId;
    @Basic(optional = false)
    @Column(name = "RETURN_ITEM_SEQ_ID")
    private String returnItemSeqId;
    @Basic(optional = false)
    @Column(name = "INVOICE_ID")
    private String invoiceId;
    @Basic(optional = false)
    @Column(name = "INVOICE_ITEM_SEQ_ID")
    private String invoiceItemSeqId;

    public ReturnItemBillingPK() {
    }

    public ReturnItemBillingPK(String returnId, String returnItemSeqId, String invoiceId, String invoiceItemSeqId) {
        this.returnId = returnId;
        this.returnItemSeqId = returnItemSeqId;
        this.invoiceId = invoiceId;
        this.invoiceItemSeqId = invoiceItemSeqId;
    }

    public String getReturnId() {
        return returnId;
    }

    public void setReturnId(String returnId) {
        this.returnId = returnId;
    }

    public String getReturnItemSeqId() {
        return returnItemSeqId;
    }

    public void setReturnItemSeqId(String returnItemSeqId) {
        this.returnItemSeqId = returnItemSeqId;
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
        hash += (returnId != null ? returnId.hashCode() : 0);
        hash += (returnItemSeqId != null ? returnItemSeqId.hashCode() : 0);
        hash += (invoiceId != null ? invoiceId.hashCode() : 0);
        hash += (invoiceItemSeqId != null ? invoiceItemSeqId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReturnItemBillingPK)) {
            return false;
        }
        ReturnItemBillingPK other = (ReturnItemBillingPK) object;
        if ((this.returnId == null && other.returnId != null) || (this.returnId != null && !this.returnId.equals(other.returnId))) {
            return false;
        }
        if ((this.returnItemSeqId == null && other.returnItemSeqId != null) || (this.returnItemSeqId != null && !this.returnItemSeqId.equals(other.returnItemSeqId))) {
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
        return "com.wildc.ucumari.client.modelo.ReturnItemBillingPK[ returnId=" + returnId + ", returnItemSeqId=" + returnItemSeqId + ", invoiceId=" + invoiceId + ", invoiceItemSeqId=" + invoiceItemSeqId + " ]";
    }
    
}
