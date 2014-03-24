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
public class InvoiceTypeAttrPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "INVOICE_TYPE_ID")
    private String invoiceTypeId;
    @Basic(optional = false)
    @Column(name = "ATTR_NAME")
    private String attrName;

    public InvoiceTypeAttrPK() {
    }

    public InvoiceTypeAttrPK(String invoiceTypeId, String attrName) {
        this.invoiceTypeId = invoiceTypeId;
        this.attrName = attrName;
    }

    public String getInvoiceTypeId() {
        return invoiceTypeId;
    }

    public void setInvoiceTypeId(String invoiceTypeId) {
        this.invoiceTypeId = invoiceTypeId;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invoiceTypeId != null ? invoiceTypeId.hashCode() : 0);
        hash += (attrName != null ? attrName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvoiceTypeAttrPK)) {
            return false;
        }
        InvoiceTypeAttrPK other = (InvoiceTypeAttrPK) object;
        if ((this.invoiceTypeId == null && other.invoiceTypeId != null) || (this.invoiceTypeId != null && !this.invoiceTypeId.equals(other.invoiceTypeId))) {
            return false;
        }
        if ((this.attrName == null && other.attrName != null) || (this.attrName != null && !this.attrName.equals(other.attrName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.InvoiceTypeAttrPK[ invoiceTypeId=" + invoiceTypeId + ", attrName=" + attrName + " ]";
    }
    
}
