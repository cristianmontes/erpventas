/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.invoice.model;

import com.wildc.ucumari.accounting.model.GlAccountType;
import com.wildc.ucumari.party.model.Party;
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
@Table(name = "invoice_gl_account_type")
@NamedQueries({
    @NamedQuery(name = "InvoiceGlAccountType.findAll", query = "SELECT i FROM InvoiceGlAccountType i")})
public class InvoiceGlAccountType implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InvoiceGlAccountTypePK invoiceGlAccountTypePK;
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
    @JoinColumn(name = "ORGANIZATION_PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Party party;
    @JoinColumn(name = "INVOICE_TYPE_ID", referencedColumnName = "INVOICE_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private InvoiceType invoiceType;
    @JoinColumn(name = "INVOICE_GL_ACCOUNT_TYPE_ID", referencedColumnName = "GL_ACCOUNT_TYPE_ID")
    @ManyToOne
    private GlAccountType invoiceGlAccountTypeId;

    public InvoiceGlAccountType() {
    }

    public InvoiceGlAccountType(InvoiceGlAccountTypePK invoiceGlAccountTypePK) {
        this.invoiceGlAccountTypePK = invoiceGlAccountTypePK;
    }

    public InvoiceGlAccountType(String organizationPartyId, String invoiceTypeId) {
        this.invoiceGlAccountTypePK = new InvoiceGlAccountTypePK(organizationPartyId, invoiceTypeId);
    }

    public InvoiceGlAccountTypePK getInvoiceGlAccountTypePK() {
        return invoiceGlAccountTypePK;
    }

    public void setInvoiceGlAccountTypePK(InvoiceGlAccountTypePK invoiceGlAccountTypePK) {
        this.invoiceGlAccountTypePK = invoiceGlAccountTypePK;
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

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    public InvoiceType getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(InvoiceType invoiceType) {
        this.invoiceType = invoiceType;
    }

    public GlAccountType getInvoiceGlAccountTypeId() {
        return invoiceGlAccountTypeId;
    }

    public void setInvoiceGlAccountTypeId(GlAccountType invoiceGlAccountTypeId) {
        this.invoiceGlAccountTypeId = invoiceGlAccountTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invoiceGlAccountTypePK != null ? invoiceGlAccountTypePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvoiceGlAccountType)) {
            return false;
        }
        InvoiceGlAccountType other = (InvoiceGlAccountType) object;
        if ((this.invoiceGlAccountTypePK == null && other.invoiceGlAccountTypePK != null) || (this.invoiceGlAccountTypePK != null && !this.invoiceGlAccountTypePK.equals(other.invoiceGlAccountTypePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.InvoiceGlAccountType[ invoiceGlAccountTypePK=" + invoiceGlAccountTypePK + " ]";
    }
    
}
