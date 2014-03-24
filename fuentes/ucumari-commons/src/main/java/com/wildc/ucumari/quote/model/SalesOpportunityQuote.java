/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.quote.model;

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
@Table(name = "sales_opportunity_quote")
@NamedQueries({
    @NamedQuery(name = "SalesOpportunityQuote.findAll", query = "SELECT s FROM SalesOpportunityQuote s")})
public class SalesOpportunityQuote implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SalesOpportunityQuotePK salesOpportunityQuotePK;
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
    @JoinColumn(name = "SALES_OPPORTUNITY_ID", referencedColumnName = "SALES_OPPORTUNITY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private SalesOpportunity salesOpportunity;
    @JoinColumn(name = "QUOTE_ID", referencedColumnName = "QUOTE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Quote quote;

    public SalesOpportunityQuote() {
    }

    public SalesOpportunityQuote(SalesOpportunityQuotePK salesOpportunityQuotePK) {
        this.salesOpportunityQuotePK = salesOpportunityQuotePK;
    }

    public SalesOpportunityQuote(String salesOpportunityId, String quoteId) {
        this.salesOpportunityQuotePK = new SalesOpportunityQuotePK(salesOpportunityId, quoteId);
    }

    public SalesOpportunityQuotePK getSalesOpportunityQuotePK() {
        return salesOpportunityQuotePK;
    }

    public void setSalesOpportunityQuotePK(SalesOpportunityQuotePK salesOpportunityQuotePK) {
        this.salesOpportunityQuotePK = salesOpportunityQuotePK;
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

    public SalesOpportunity getSalesOpportunity() {
        return salesOpportunity;
    }

    public void setSalesOpportunity(SalesOpportunity salesOpportunity) {
        this.salesOpportunity = salesOpportunity;
    }

    public Quote getQuote() {
        return quote;
    }

    public void setQuote(Quote quote) {
        this.quote = quote;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (salesOpportunityQuotePK != null ? salesOpportunityQuotePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SalesOpportunityQuote)) {
            return false;
        }
        SalesOpportunityQuote other = (SalesOpportunityQuote) object;
        if ((this.salesOpportunityQuotePK == null && other.salesOpportunityQuotePK != null) || (this.salesOpportunityQuotePK != null && !this.salesOpportunityQuotePK.equals(other.salesOpportunityQuotePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.SalesOpportunityQuote[ salesOpportunityQuotePK=" + salesOpportunityQuotePK + " ]";
    }
    
}
