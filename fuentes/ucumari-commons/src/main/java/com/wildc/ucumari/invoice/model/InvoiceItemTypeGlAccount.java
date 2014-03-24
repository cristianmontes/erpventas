/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.invoice.model;

import com.wildc.ucumari.accounting.model.GlAccount;
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
@Table(name = "invoice_item_type_gl_account")
@NamedQueries({
    @NamedQuery(name = "InvoiceItemTypeGlAccount.findAll", query = "SELECT i FROM InvoiceItemTypeGlAccount i")})
public class InvoiceItemTypeGlAccount implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InvoiceItemTypeGlAccountPK invoiceItemTypeGlAccountPK;
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
    @JoinColumn(name = "INVOICE_ITEM_TYPE_ID", referencedColumnName = "INVOICE_ITEM_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private InvoiceItemType invoiceItemType;
    @JoinColumn(name = "GL_ACCOUNT_ID", referencedColumnName = "GL_ACCOUNT_ID")
    @ManyToOne
    private GlAccount glAccountId;

    public InvoiceItemTypeGlAccount() {
    }

    public InvoiceItemTypeGlAccount(InvoiceItemTypeGlAccountPK invoiceItemTypeGlAccountPK) {
        this.invoiceItemTypeGlAccountPK = invoiceItemTypeGlAccountPK;
    }

    public InvoiceItemTypeGlAccount(String invoiceItemTypeId, String organizationPartyId) {
        this.invoiceItemTypeGlAccountPK = new InvoiceItemTypeGlAccountPK(invoiceItemTypeId, organizationPartyId);
    }

    public InvoiceItemTypeGlAccountPK getInvoiceItemTypeGlAccountPK() {
        return invoiceItemTypeGlAccountPK;
    }

    public void setInvoiceItemTypeGlAccountPK(InvoiceItemTypeGlAccountPK invoiceItemTypeGlAccountPK) {
        this.invoiceItemTypeGlAccountPK = invoiceItemTypeGlAccountPK;
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

    public InvoiceItemType getInvoiceItemType() {
        return invoiceItemType;
    }

    public void setInvoiceItemType(InvoiceItemType invoiceItemType) {
        this.invoiceItemType = invoiceItemType;
    }

    public GlAccount getGlAccountId() {
        return glAccountId;
    }

    public void setGlAccountId(GlAccount glAccountId) {
        this.glAccountId = glAccountId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invoiceItemTypeGlAccountPK != null ? invoiceItemTypeGlAccountPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvoiceItemTypeGlAccount)) {
            return false;
        }
        InvoiceItemTypeGlAccount other = (InvoiceItemTypeGlAccount) object;
        if ((this.invoiceItemTypeGlAccountPK == null && other.invoiceItemTypeGlAccountPK != null) || (this.invoiceItemTypeGlAccountPK != null && !this.invoiceItemTypeGlAccountPK.equals(other.invoiceItemTypeGlAccountPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.InvoiceItemTypeGlAccount[ invoiceItemTypeGlAccountPK=" + invoiceItemTypeGlAccountPK + " ]";
    }
    
}
