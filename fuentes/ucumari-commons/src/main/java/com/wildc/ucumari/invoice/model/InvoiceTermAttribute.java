/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.invoice.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "invoice_term_attribute")
@NamedQueries({
    @NamedQuery(name = "InvoiceTermAttribute.findAll", query = "SELECT i FROM InvoiceTermAttribute i")})
public class InvoiceTermAttribute implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InvoiceTermAttributePK invoiceTermAttributePK;
    @Column(name = "ATTR_VALUE")
    private String attrValue;
    @Column(name = "LAST_UPDATED_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdatedStamp;
    @Column(name = "LAST_UPDATED_TX_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdatedTxStamp;
    @Column(name = "CREATED_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdStamp;
    @Column(name = "CREATED_TX_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdTxStamp;
    @JoinColumn(name = "INVOICE_TERM_ID", referencedColumnName = "INVOICE_TERM_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private InvoiceTerm invoiceTerm;

    public InvoiceTermAttribute() {
    }

    public InvoiceTermAttribute(InvoiceTermAttributePK invoiceTermAttributePK) {
        this.invoiceTermAttributePK = invoiceTermAttributePK;
    }

    public InvoiceTermAttribute(String invoiceTermId, String attrName) {
        this.invoiceTermAttributePK = new InvoiceTermAttributePK(invoiceTermId, attrName);
    }

    public InvoiceTermAttributePK getInvoiceTermAttributePK() {
        return invoiceTermAttributePK;
    }

    public void setInvoiceTermAttributePK(InvoiceTermAttributePK invoiceTermAttributePK) {
        this.invoiceTermAttributePK = invoiceTermAttributePK;
    }

    public String getAttrValue() {
        return attrValue;
    }

    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue;
    }

    public Date getLastUpdatedStamp() {
        return lastUpdatedStamp;
    }

    public void setLastUpdatedStamp(Date lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }

    public Date getLastUpdatedTxStamp() {
        return lastUpdatedTxStamp;
    }

    public void setLastUpdatedTxStamp(Date lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }

    public Date getCreatedStamp() {
        return createdStamp;
    }

    public void setCreatedStamp(Date createdStamp) {
        this.createdStamp = createdStamp;
    }

    public Date getCreatedTxStamp() {
        return createdTxStamp;
    }

    public void setCreatedTxStamp(Date createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }

    public InvoiceTerm getInvoiceTerm() {
        return invoiceTerm;
    }

    public void setInvoiceTerm(InvoiceTerm invoiceTerm) {
        this.invoiceTerm = invoiceTerm;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invoiceTermAttributePK != null ? invoiceTermAttributePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvoiceTermAttribute)) {
            return false;
        }
        InvoiceTermAttribute other = (InvoiceTermAttribute) object;
        if ((this.invoiceTermAttributePK == null && other.invoiceTermAttributePK != null) || (this.invoiceTermAttributePK != null && !this.invoiceTermAttributePK.equals(other.invoiceTermAttributePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.InvoiceTermAttribute[ invoiceTermAttributePK=" + invoiceTermAttributePK + " ]";
    }
    
}
