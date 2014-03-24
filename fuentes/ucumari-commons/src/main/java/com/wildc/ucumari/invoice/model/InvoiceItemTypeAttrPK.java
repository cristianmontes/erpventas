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
public class InvoiceItemTypeAttrPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "INVOICE_ITEM_TYPE_ID")
    private String invoiceItemTypeId;
    @Basic(optional = false)
    @Column(name = "ATTR_NAME")
    private String attrName;

    public InvoiceItemTypeAttrPK() {
    }

    public InvoiceItemTypeAttrPK(String invoiceItemTypeId, String attrName) {
        this.invoiceItemTypeId = invoiceItemTypeId;
        this.attrName = attrName;
    }

    public String getInvoiceItemTypeId() {
        return invoiceItemTypeId;
    }

    public void setInvoiceItemTypeId(String invoiceItemTypeId) {
        this.invoiceItemTypeId = invoiceItemTypeId;
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
        hash += (invoiceItemTypeId != null ? invoiceItemTypeId.hashCode() : 0);
        hash += (attrName != null ? attrName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvoiceItemTypeAttrPK)) {
            return false;
        }
        InvoiceItemTypeAttrPK other = (InvoiceItemTypeAttrPK) object;
        if ((this.invoiceItemTypeId == null && other.invoiceItemTypeId != null) || (this.invoiceItemTypeId != null && !this.invoiceItemTypeId.equals(other.invoiceItemTypeId))) {
            return false;
        }
        if ((this.attrName == null && other.attrName != null) || (this.attrName != null && !this.attrName.equals(other.attrName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.InvoiceItemTypeAttrPK[ invoiceItemTypeId=" + invoiceItemTypeId + ", attrName=" + attrName + " ]";
    }
    
}
