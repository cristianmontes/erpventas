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

import com.wildc.ucumari.client.modelo.WorkEffort;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "quote_work_effort")
@NamedQueries({
    @NamedQuery(name = "QuoteWorkEffort.findAll", query = "SELECT q FROM QuoteWorkEffort q")})
public class QuoteWorkEffort implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected QuoteWorkEffortPK quoteWorkEffortPK;
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
    @JoinColumn(name = "WORK_EFFORT_ID", referencedColumnName = "WORK_EFFORT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private WorkEffort workEffort;
    @JoinColumn(name = "QUOTE_ID", referencedColumnName = "QUOTE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Quote quote;

    public QuoteWorkEffort() {
    }

    public QuoteWorkEffort(QuoteWorkEffortPK quoteWorkEffortPK) {
        this.quoteWorkEffortPK = quoteWorkEffortPK;
    }

    public QuoteWorkEffort(String quoteId, String workEffortId) {
        this.quoteWorkEffortPK = new QuoteWorkEffortPK(quoteId, workEffortId);
    }

    public QuoteWorkEffortPK getQuoteWorkEffortPK() {
        return quoteWorkEffortPK;
    }

    public void setQuoteWorkEffortPK(QuoteWorkEffortPK quoteWorkEffortPK) {
        this.quoteWorkEffortPK = quoteWorkEffortPK;
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

    public WorkEffort getWorkEffort() {
        return workEffort;
    }

    public void setWorkEffort(WorkEffort workEffort) {
        this.workEffort = workEffort;
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
        hash += (quoteWorkEffortPK != null ? quoteWorkEffortPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof QuoteWorkEffort)) {
            return false;
        }
        QuoteWorkEffort other = (QuoteWorkEffort) object;
        if ((this.quoteWorkEffortPK == null && other.quoteWorkEffortPK != null) || (this.quoteWorkEffortPK != null && !this.quoteWorkEffortPK.equals(other.quoteWorkEffortPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.QuoteWorkEffort[ quoteWorkEffortPK=" + quoteWorkEffortPK + " ]";
    }
    
}
