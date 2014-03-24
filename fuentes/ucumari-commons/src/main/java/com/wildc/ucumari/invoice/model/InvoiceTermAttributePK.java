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
public class InvoiceTermAttributePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "INVOICE_TERM_ID")
    private String invoiceTermId;
    @Basic(optional = false)
    @Column(name = "ATTR_NAME")
    private String attrName;

    public InvoiceTermAttributePK() {
    }

    public InvoiceTermAttributePK(String invoiceTermId, String attrName) {
        this.invoiceTermId = invoiceTermId;
        this.attrName = attrName;
    }

    public String getInvoiceTermId() {
        return invoiceTermId;
    }

    public void setInvoiceTermId(String invoiceTermId) {
        this.invoiceTermId = invoiceTermId;
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
        hash += (invoiceTermId != null ? invoiceTermId.hashCode() : 0);
        hash += (attrName != null ? attrName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvoiceTermAttributePK)) {
            return false;
        }
        InvoiceTermAttributePK other = (InvoiceTermAttributePK) object;
        if ((this.invoiceTermId == null && other.invoiceTermId != null) || (this.invoiceTermId != null && !this.invoiceTermId.equals(other.invoiceTermId))) {
            return false;
        }
        if ((this.attrName == null && other.attrName != null) || (this.attrName != null && !this.attrName.equals(other.attrName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.InvoiceTermAttributePK[ invoiceTermId=" + invoiceTermId + ", attrName=" + attrName + " ]";
    }
    
}
