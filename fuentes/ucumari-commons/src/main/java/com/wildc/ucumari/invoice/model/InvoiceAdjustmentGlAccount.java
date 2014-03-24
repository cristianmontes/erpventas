/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.invoice.model;

import com.wildc.ucumari.party.model.Party;
import com.wildc.ucumari.accounting.model.AcctgTransType;
import com.wildc.ucumari.accounting.model.GlAccount;

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
@Table(name = "invoice_adjustment_gl_account")
@NamedQueries({
    @NamedQuery(name = "InvoiceAdjustmentGlAccount.findAll", query = "SELECT i FROM InvoiceAdjustmentGlAccount i")})
public class InvoiceAdjustmentGlAccount implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InvoiceAdjustmentGlAccountPK invoiceAdjustmentGlAccountPK;
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
    @JoinColumn(name = "INVOICE_ADJUSTMENT_TYPE_ID", referencedColumnName = "INVOICE_ADJUSTMENT_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private InvoiceAdjustmentType invoiceAdjustmentType;
    @JoinColumn(name = "GL_ACCOUNT_ID", referencedColumnName = "GL_ACCOUNT_ID")
    @ManyToOne
    private GlAccount glAccountId;
    @JoinColumn(name = "ACCTG_TRANS_TYPE_ID", referencedColumnName = "ACCTG_TRANS_TYPE_ID")
    @ManyToOne
    private AcctgTransType acctgTransTypeId;

    public InvoiceAdjustmentGlAccount() {
    }

    public InvoiceAdjustmentGlAccount(InvoiceAdjustmentGlAccountPK invoiceAdjustmentGlAccountPK) {
        this.invoiceAdjustmentGlAccountPK = invoiceAdjustmentGlAccountPK;
    }

    public InvoiceAdjustmentGlAccount(String organizationPartyId, String invoiceTypeId, String invoiceAdjustmentTypeId) {
        this.invoiceAdjustmentGlAccountPK = new InvoiceAdjustmentGlAccountPK(organizationPartyId, invoiceTypeId, invoiceAdjustmentTypeId);
    }

    public InvoiceAdjustmentGlAccountPK getInvoiceAdjustmentGlAccountPK() {
        return invoiceAdjustmentGlAccountPK;
    }

    public void setInvoiceAdjustmentGlAccountPK(InvoiceAdjustmentGlAccountPK invoiceAdjustmentGlAccountPK) {
        this.invoiceAdjustmentGlAccountPK = invoiceAdjustmentGlAccountPK;
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

    public InvoiceAdjustmentType getInvoiceAdjustmentType() {
        return invoiceAdjustmentType;
    }

    public void setInvoiceAdjustmentType(InvoiceAdjustmentType invoiceAdjustmentType) {
        this.invoiceAdjustmentType = invoiceAdjustmentType;
    }

    public GlAccount getGlAccountId() {
        return glAccountId;
    }

    public void setGlAccountId(GlAccount glAccountId) {
        this.glAccountId = glAccountId;
    }

    public AcctgTransType getAcctgTransTypeId() {
        return acctgTransTypeId;
    }

    public void setAcctgTransTypeId(AcctgTransType acctgTransTypeId) {
        this.acctgTransTypeId = acctgTransTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invoiceAdjustmentGlAccountPK != null ? invoiceAdjustmentGlAccountPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvoiceAdjustmentGlAccount)) {
            return false;
        }
        InvoiceAdjustmentGlAccount other = (InvoiceAdjustmentGlAccount) object;
        if ((this.invoiceAdjustmentGlAccountPK == null && other.invoiceAdjustmentGlAccountPK != null) || (this.invoiceAdjustmentGlAccountPK != null && !this.invoiceAdjustmentGlAccountPK.equals(other.invoiceAdjustmentGlAccountPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.InvoiceAdjustmentGlAccount[ invoiceAdjustmentGlAccountPK=" + invoiceAdjustmentGlAccountPK + " ]";
    }
    
}
