/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.quote.model;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "quote_coefficient")
@NamedQueries({
    @NamedQuery(name = "QuoteCoefficient.findAll", query = "SELECT q FROM QuoteCoefficient q")})
public class QuoteCoefficient implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected QuoteCoefficientPK quoteCoefficientPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "COEFF_VALUE")
    private BigDecimal coeffValue;
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
    @JoinColumn(name = "QUOTE_ID", referencedColumnName = "QUOTE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Quote quote;

    public QuoteCoefficient() {
    }

    public QuoteCoefficient(QuoteCoefficientPK quoteCoefficientPK) {
        this.quoteCoefficientPK = quoteCoefficientPK;
    }

    public QuoteCoefficient(String quoteId, String coeffName) {
        this.quoteCoefficientPK = new QuoteCoefficientPK(quoteId, coeffName);
    }

    public QuoteCoefficientPK getQuoteCoefficientPK() {
        return quoteCoefficientPK;
    }

    public void setQuoteCoefficientPK(QuoteCoefficientPK quoteCoefficientPK) {
        this.quoteCoefficientPK = quoteCoefficientPK;
    }

    public BigDecimal getCoeffValue() {
        return coeffValue;
    }

    public void setCoeffValue(BigDecimal coeffValue) {
        this.coeffValue = coeffValue;
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

    public Quote getQuote() {
        return quote;
    }

    public void setQuote(Quote quote) {
        this.quote = quote;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (quoteCoefficientPK != null ? quoteCoefficientPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof QuoteCoefficient)) {
            return false;
        }
        QuoteCoefficient other = (QuoteCoefficient) object;
        if ((this.quoteCoefficientPK == null && other.quoteCoefficientPK != null) || (this.quoteCoefficientPK != null && !this.quoteCoefficientPK.equals(other.quoteCoefficientPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.QuoteCoefficient[ quoteCoefficientPK=" + quoteCoefficientPK + " ]";
    }
    
}
