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
public class InvoiceContactMechPK implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 3892424395267363206L;
	@Basic(optional = false)
    @Column(name = "INVOICE_ID")
    private String invoiceId;
    @Basic(optional = false)
    @Column(name = "CONTACT_MECH_PURPOSE_TYPE_ID")
    private String contactMechPurposeTypeId;
    @Basic(optional = false)
    @Column(name = "CONTACT_MECH_ID")
    private String contactMechId;

    public InvoiceContactMechPK() {
    }

    public InvoiceContactMechPK(String invoiceId, String contactMechPurposeTypeId, String contactMechId) {
        this.invoiceId = invoiceId;
        this.contactMechPurposeTypeId = contactMechPurposeTypeId;
        this.contactMechId = contactMechId;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getContactMechPurposeTypeId() {
        return contactMechPurposeTypeId;
    }

    public void setContactMechPurposeTypeId(String contactMechPurposeTypeId) {
        this.contactMechPurposeTypeId = contactMechPurposeTypeId;
    }

    public String getContactMechId() {
        return contactMechId;
    }

    public void setContactMechId(String contactMechId) {
        this.contactMechId = contactMechId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invoiceId != null ? invoiceId.hashCode() : 0);
        hash += (contactMechPurposeTypeId != null ? contactMechPurposeTypeId.hashCode() : 0);
        hash += (contactMechId != null ? contactMechId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvoiceContactMechPK)) {
            return false;
        }
        InvoiceContactMechPK other = (InvoiceContactMechPK) object;
        if ((this.invoiceId == null && other.invoiceId != null) || (this.invoiceId != null && !this.invoiceId.equals(other.invoiceId))) {
            return false;
        }
        if ((this.contactMechPurposeTypeId == null && other.contactMechPurposeTypeId != null) || (this.contactMechPurposeTypeId != null && !this.contactMechPurposeTypeId.equals(other.contactMechPurposeTypeId))) {
            return false;
        }
        if ((this.contactMechId == null && other.contactMechId != null) || (this.contactMechId != null && !this.contactMechId.equals(other.contactMechId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.InvoiceContactMechPK[ invoiceId=" + invoiceId + ", contactMechPurposeTypeId=" + contactMechPurposeTypeId + ", contactMechId=" + contactMechId + " ]";
    }
    
}
