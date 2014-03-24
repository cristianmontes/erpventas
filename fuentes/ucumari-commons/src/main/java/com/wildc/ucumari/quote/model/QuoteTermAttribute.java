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
import javax.persistence.JoinColumns;
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
@Table(name = "quote_term_attribute")
@NamedQueries({
    @NamedQuery(name = "QuoteTermAttribute.findAll", query = "SELECT q FROM QuoteTermAttribute q")})
public class QuoteTermAttribute implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected QuoteTermAttributePK quoteTermAttributePK;
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
    @JoinColumns({
        @JoinColumn(name = "TERM_TYPE_ID", referencedColumnName = "TERM_TYPE_ID", insertable = false, updatable = false),
        @JoinColumn(name = "QUOTE_ID", referencedColumnName = "QUOTE_ID", insertable = false, updatable = false),
        @JoinColumn(name = "QUOTE_ITEM_SEQ_ID", referencedColumnName = "QUOTE_ITEM_SEQ_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private QuoteTerm quoteTerm;

    public QuoteTermAttribute() {
    }

    public QuoteTermAttribute(QuoteTermAttributePK quoteTermAttributePK) {
        this.quoteTermAttributePK = quoteTermAttributePK;
    }

    public QuoteTermAttribute(String termTypeId, String quoteId, String quoteItemSeqId, String attrName) {
        this.quoteTermAttributePK = new QuoteTermAttributePK(termTypeId, quoteId, quoteItemSeqId, attrName);
    }

    public QuoteTermAttributePK getQuoteTermAttributePK() {
        return quoteTermAttributePK;
    }

    public void setQuoteTermAttributePK(QuoteTermAttributePK quoteTermAttributePK) {
        this.quoteTermAttributePK = quoteTermAttributePK;
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

    public QuoteTerm getQuoteTerm() {
        return quoteTerm;
    }

    public void setQuoteTerm(QuoteTerm quoteTerm) {
        this.quoteTerm = quoteTerm;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (quoteTermAttributePK != null ? quoteTermAttributePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof QuoteTermAttribute)) {
            return false;
        }
        QuoteTermAttribute other = (QuoteTermAttribute) object;
        if ((this.quoteTermAttributePK == null && other.quoteTermAttributePK != null) || (this.quoteTermAttributePK != null && !this.quoteTermAttributePK.equals(other.quoteTermAttributePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.QuoteTermAttribute[ quoteTermAttributePK=" + quoteTermAttributePK + " ]";
    }
    
}
