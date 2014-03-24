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
@Table(name = "quote_attribute")
@NamedQueries({
    @NamedQuery(name = "QuoteAttribute.findAll", query = "SELECT q FROM QuoteAttribute q")})
public class QuoteAttribute implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected QuoteAttributePK quoteAttributePK;
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
    @JoinColumn(name = "QUOTE_ID", referencedColumnName = "QUOTE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Quote quote;

    public QuoteAttribute() {
    }

    public QuoteAttribute(QuoteAttributePK quoteAttributePK) {
        this.quoteAttributePK = quoteAttributePK;
    }

    public QuoteAttribute(String quoteId, String attrName) {
        this.quoteAttributePK = new QuoteAttributePK(quoteId, attrName);
    }

    public QuoteAttributePK getQuoteAttributePK() {
        return quoteAttributePK;
    }

    public void setQuoteAttributePK(QuoteAttributePK quoteAttributePK) {
        this.quoteAttributePK = quoteAttributePK;
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

    public Quote getQuote() {
        return quote;
    }

    public void setQuote(Quote quote) {
        this.quote = quote;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (quoteAttributePK != null ? quoteAttributePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof QuoteAttribute)) {
            return false;
        }
        QuoteAttribute other = (QuoteAttribute) object;
        if ((this.quoteAttributePK == null && other.quoteAttributePK != null) || (this.quoteAttributePK != null && !this.quoteAttributePK.equals(other.quoteAttributePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.QuoteAttribute[ quoteAttributePK=" + quoteAttributePK + " ]";
    }
    
}
