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
public class InvoiceItemTypeMapPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "INVOICE_ITEM_MAP_KEY")
    private String invoiceItemMapKey;
    @Basic(optional = false)
    @Column(name = "INVOICE_TYPE_ID")
    private String invoiceTypeId;

    public InvoiceItemTypeMapPK() {
    }

    public InvoiceItemTypeMapPK(String invoiceItemMapKey, String invoiceTypeId) {
        this.invoiceItemMapKey = invoiceItemMapKey;
        this.invoiceTypeId = invoiceTypeId;
    }

    public String getInvoiceItemMapKey() {
        return invoiceItemMapKey;
    }

    public void setInvoiceItemMapKey(String invoiceItemMapKey) {
        this.invoiceItemMapKey = invoiceItemMapKey;
    }

    public String getInvoiceTypeId() {
        return invoiceTypeId;
    }

    public void setInvoiceTypeId(String invoiceTypeId) {
        this.invoiceTypeId = invoiceTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invoiceItemMapKey != null ? invoiceItemMapKey.hashCode() : 0);
        hash += (invoiceTypeId != null ? invoiceTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvoiceItemTypeMapPK)) {
            return false;
        }
        InvoiceItemTypeMapPK other = (InvoiceItemTypeMapPK) object;
        if ((this.invoiceItemMapKey == null && other.invoiceItemMapKey != null) || (this.invoiceItemMapKey != null && !this.invoiceItemMapKey.equals(other.invoiceItemMapKey))) {
            return false;
        }
        if ((this.invoiceTypeId == null && other.invoiceTypeId != null) || (this.invoiceTypeId != null && !this.invoiceTypeId.equals(other.invoiceTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.InvoiceItemTypeMapPK[ invoiceItemMapKey=" + invoiceItemMapKey + ", invoiceTypeId=" + invoiceTypeId + " ]";
    }
    
}
