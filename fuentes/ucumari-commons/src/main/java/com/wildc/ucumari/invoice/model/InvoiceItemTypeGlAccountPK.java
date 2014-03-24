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
public class InvoiceItemTypeGlAccountPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "INVOICE_ITEM_TYPE_ID")
    private String invoiceItemTypeId;
    @Basic(optional = false)
    @Column(name = "ORGANIZATION_PARTY_ID")
    private String organizationPartyId;

    public InvoiceItemTypeGlAccountPK() {
    }

    public InvoiceItemTypeGlAccountPK(String invoiceItemTypeId, String organizationPartyId) {
        this.invoiceItemTypeId = invoiceItemTypeId;
        this.organizationPartyId = organizationPartyId;
    }

    public String getInvoiceItemTypeId() {
        return invoiceItemTypeId;
    }

    public void setInvoiceItemTypeId(String invoiceItemTypeId) {
        this.invoiceItemTypeId = invoiceItemTypeId;
    }

    public String getOrganizationPartyId() {
        return organizationPartyId;
    }

    public void setOrganizationPartyId(String organizationPartyId) {
        this.organizationPartyId = organizationPartyId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invoiceItemTypeId != null ? invoiceItemTypeId.hashCode() : 0);
        hash += (organizationPartyId != null ? organizationPartyId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvoiceItemTypeGlAccountPK)) {
            return false;
        }
        InvoiceItemTypeGlAccountPK other = (InvoiceItemTypeGlAccountPK) object;
        if ((this.invoiceItemTypeId == null && other.invoiceItemTypeId != null) || (this.invoiceItemTypeId != null && !this.invoiceItemTypeId.equals(other.invoiceItemTypeId))) {
            return false;
        }
        if ((this.organizationPartyId == null && other.organizationPartyId != null) || (this.organizationPartyId != null && !this.organizationPartyId.equals(other.organizationPartyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.InvoiceItemTypeGlAccountPK[ invoiceItemTypeId=" + invoiceItemTypeId + ", organizationPartyId=" + organizationPartyId + " ]";
    }
    
}
