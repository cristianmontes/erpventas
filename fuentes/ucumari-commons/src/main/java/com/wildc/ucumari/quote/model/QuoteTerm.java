/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.quote.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.parameters.model.TermType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "quote_term")
@NamedQueries({
    @NamedQuery(name = "QuoteTerm.findAll", query = "SELECT q FROM QuoteTerm q")})
public class QuoteTerm implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected QuoteTermPK quoteTermPK;
    @Column(name = "TERM_VALUE")
    private BigInteger termValue;
    @Column(name = "UOM_ID")
    private String uomId;
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
    @JoinColumn(name = "TERM_TYPE_ID", referencedColumnName = "TERM_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TermType termType;
    @JoinColumn(name = "QUOTE_ID", referencedColumnName = "QUOTE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Quote quote;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "quoteTerm")
    private List<QuoteTermAttribute> quoteTermAttributeList;

    public QuoteTerm() {
    }

    public QuoteTerm(QuoteTermPK quoteTermPK) {
        this.quoteTermPK = quoteTermPK;
    }

    public QuoteTerm(String termTypeId, String quoteId, String quoteItemSeqId) {
        this.quoteTermPK = new QuoteTermPK(termTypeId, quoteId, quoteItemSeqId);
    }

    public QuoteTermPK getQuoteTermPK() {
        return quoteTermPK;
    }

    public void setQuoteTermPK(QuoteTermPK quoteTermPK) {
        this.quoteTermPK = quoteTermPK;
    }

    public BigInteger getTermValue() {
        return termValue;
    }

    public void setTermValue(BigInteger termValue) {
        this.termValue = termValue;
    }

    public String getUomId() {
        return uomId;
    }

    public void setUomId(String uomId) {
        this.uomId = uomId;
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

    public TermType getTermType() {
        return termType;
    }

    public void setTermType(TermType termType) {
        this.termType = termType;
    }

    public Quote getQuote() {
        return quote;
    }

    public void setQuote(Quote quote) {
        this.quote = quote;
    }

    public List<QuoteTermAttribute> getQuoteTermAttributeList() {
        return quoteTermAttributeList;
    }

    public void setQuoteTermAttributeList(List<QuoteTermAttribute> quoteTermAttributeList) {
        this.quoteTermAttributeList = quoteTermAttributeList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (quoteTermPK != null ? quoteTermPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof QuoteTerm)) {
            return false;
        }
        QuoteTerm other = (QuoteTerm) object;
        if ((this.quoteTermPK == null && other.quoteTermPK != null) || (this.quoteTermPK != null && !this.quoteTermPK.equals(other.quoteTermPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.QuoteTerm[ quoteTermPK=" + quoteTermPK + " ]";
    }
    
}
