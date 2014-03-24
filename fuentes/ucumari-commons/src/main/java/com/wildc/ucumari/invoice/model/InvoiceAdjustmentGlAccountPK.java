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
public class InvoiceAdjustmentGlAccountPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ORGANIZATION_PARTY_ID")
    private String organizationPartyId;
    @Basic(optional = false)
    @Column(name = "INVOICE_TYPE_ID")
    private String invoiceTypeId;
    @Basic(optional = false)
    @Column(name = "INVOICE_ADJUSTMENT_TYPE_ID")
    private String invoiceAdjustmentTypeId;

    public InvoiceAdjustmentGlAccountPK() {
    }

    public InvoiceAdjustmentGlAccountPK(String organizationPartyId, String invoiceTypeId, String invoiceAdjustmentTypeId) {
        this.organizationPartyId = organizationPartyId;
        this.invoiceTypeId = invoiceTypeId;
        this.invoiceAdjustmentTypeId = invoiceAdjustmentTypeId;
    }

    public String getOrganizationPartyId() {
        return organizationPartyId;
    }

    public void setOrganizationPartyId(String organizationPartyId) {
        this.organizationPartyId = organizationPartyId;
    }

    public String getInvoiceTypeId() {
        return invoiceTypeId;
    }

    public void setInvoiceTypeId(String invoiceTypeId) {
        this.invoiceTypeId = invoiceTypeId;
    }

    public String getInvoiceAdjustmentTypeId() {
        return invoiceAdjustmentTypeId;
    }

    public void setInvoiceAdjustmentTypeId(String invoiceAdjustmentTypeId) {
        this.invoiceAdjustmentTypeId = invoiceAdjustmentTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (organizationPartyId != null ? organizationPartyId.hashCode() : 0);
        hash += (invoiceTypeId != null ? invoiceTypeId.hashCode() : 0);
        hash += (invoiceAdjustmentTypeId != null ? invoiceAdjustmentTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvoiceAdjustmentGlAccountPK)) {
            return false;
        }
        InvoiceAdjustmentGlAccountPK other = (InvoiceAdjustmentGlAccountPK) object;
        if ((this.organizationPartyId == null && other.organizationPartyId != null) || (this.organizationPartyId != null && !this.organizationPartyId.equals(other.organizationPartyId))) {
            return false;
        }
        if ((this.invoiceTypeId == null && other.invoiceTypeId != null) || (this.invoiceTypeId != null && !this.invoiceTypeId.equals(other.invoiceTypeId))) {
            return false;
        }
        if ((this.invoiceAdjustmentTypeId == null && other.invoiceAdjustmentTypeId != null) || (this.invoiceAdjustmentTypeId != null && !this.invoiceAdjustmentTypeId.equals(other.invoiceAdjustmentTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.InvoiceAdjustmentGlAccountPK[ organizationPartyId=" + organizationPartyId + ", invoiceTypeId=" + invoiceTypeId + ", invoiceAdjustmentTypeId=" + invoiceAdjustmentTypeId + " ]";
    }
    
}
