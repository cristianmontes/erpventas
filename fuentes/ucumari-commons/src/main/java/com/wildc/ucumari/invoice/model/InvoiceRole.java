/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.invoice.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.party.model.Party;
import com.wildc.ucumari.party.model.PartyRole;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "invoice_role")
public class InvoiceRole implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InvoiceRolePK invoiceRolePK;
    @Column(name = "DATETIME_PERFORMED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datetimePerformed;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PERCENTAGE")
    private BigDecimal percentage;
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
    @JoinColumns({
        @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false),
        @JoinColumn(name = "ROLE_TYPE_ID", referencedColumnName = "ROLE_TYPE_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private PartyRole partyRole;
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Party party;
    @JoinColumn(name = "INVOICE_ID", referencedColumnName = "INVOICE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Invoice invoice;

    public InvoiceRole() {
    }

    public InvoiceRole(InvoiceRolePK invoiceRolePK) {
        this.invoiceRolePK = invoiceRolePK;
    }

    public InvoiceRole(String invoiceId, String partyId, String roleTypeId) {
        this.invoiceRolePK = new InvoiceRolePK(invoiceId, partyId, roleTypeId);
    }

    public InvoiceRolePK getInvoiceRolePK() {
        return invoiceRolePK;
    }

    public void setInvoiceRolePK(InvoiceRolePK invoiceRolePK) {
        this.invoiceRolePK = invoiceRolePK;
    }

    public Date getDatetimePerformed() {
        return datetimePerformed;
    }

    public void setDatetimePerformed(Date datetimePerformed) {
        this.datetimePerformed = datetimePerformed;
    }

    public BigDecimal getPercentage() {
        return percentage;
    }

    public void setPercentage(BigDecimal percentage) {
        this.percentage = percentage;
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

    public PartyRole getPartyRole() {
        return partyRole;
    }

    public void setPartyRole(PartyRole partyRole) {
        this.partyRole = partyRole;
    }

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invoiceRolePK != null ? invoiceRolePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvoiceRole)) {
            return false;
        }
        InvoiceRole other = (InvoiceRole) object;
        if ((this.invoiceRolePK == null && other.invoiceRolePK != null) || (this.invoiceRolePK != null && !this.invoiceRolePK.equals(other.invoiceRolePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.InvoiceRole[ invoiceRolePK=" + invoiceRolePK + " ]";
    }
    
}
