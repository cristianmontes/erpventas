/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.agreement.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class AgreementInvoiceItemTypePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "AGREEMENT_TYPE_ID")
    private String agreementTypeId;
    @Basic(optional = false)
    @Column(name = "INVOICE_ITEM_TYPE_ID_FROM")
    private String invoiceItemTypeIdFrom;
    @Basic(optional = false)
    @Column(name = "INVOICE_ITEM_TYPE_ID_TO")
    private String invoiceItemTypeIdTo;

    public AgreementInvoiceItemTypePK() {
    }

    public AgreementInvoiceItemTypePK(String agreementTypeId, String invoiceItemTypeIdFrom, String invoiceItemTypeIdTo) {
        this.agreementTypeId = agreementTypeId;
        this.invoiceItemTypeIdFrom = invoiceItemTypeIdFrom;
        this.invoiceItemTypeIdTo = invoiceItemTypeIdTo;
    }

    public String getAgreementTypeId() {
        return agreementTypeId;
    }

    public void setAgreementTypeId(String agreementTypeId) {
        this.agreementTypeId = agreementTypeId;
    }

    public String getInvoiceItemTypeIdFrom() {
        return invoiceItemTypeIdFrom;
    }

    public void setInvoiceItemTypeIdFrom(String invoiceItemTypeIdFrom) {
        this.invoiceItemTypeIdFrom = invoiceItemTypeIdFrom;
    }

    public String getInvoiceItemTypeIdTo() {
        return invoiceItemTypeIdTo;
    }

    public void setInvoiceItemTypeIdTo(String invoiceItemTypeIdTo) {
        this.invoiceItemTypeIdTo = invoiceItemTypeIdTo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (agreementTypeId != null ? agreementTypeId.hashCode() : 0);
        hash += (invoiceItemTypeIdFrom != null ? invoiceItemTypeIdFrom.hashCode() : 0);
        hash += (invoiceItemTypeIdTo != null ? invoiceItemTypeIdTo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AgreementInvoiceItemTypePK)) {
            return false;
        }
        AgreementInvoiceItemTypePK other = (AgreementInvoiceItemTypePK) object;
        if ((this.agreementTypeId == null && other.agreementTypeId != null) || (this.agreementTypeId != null && !this.agreementTypeId.equals(other.agreementTypeId))) {
            return false;
        }
        if ((this.invoiceItemTypeIdFrom == null && other.invoiceItemTypeIdFrom != null) || (this.invoiceItemTypeIdFrom != null && !this.invoiceItemTypeIdFrom.equals(other.invoiceItemTypeIdFrom))) {
            return false;
        }
        if ((this.invoiceItemTypeIdTo == null && other.invoiceItemTypeIdTo != null) || (this.invoiceItemTypeIdTo != null && !this.invoiceItemTypeIdTo.equals(other.invoiceItemTypeIdTo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.AgreementInvoiceItemTypePK[ agreementTypeId=" + agreementTypeId + ", invoiceItemTypeIdFrom=" + invoiceItemTypeIdFrom + ", invoiceItemTypeIdTo=" + invoiceItemTypeIdTo + " ]";
    }
    
}
