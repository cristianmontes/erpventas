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
@Table(name = "quote_item_option")
@NamedQueries({
    @NamedQuery(name = "QuoteItemOption.findAll", query = "SELECT q FROM QuoteItemOption q")})
public class QuoteItemOption implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected QuoteItemOptionPK quoteItemOptionPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "QUANTITY")
    private BigDecimal quantity;
    @Column(name = "QUOTE_UNIT_PRICE")
    private BigDecimal quoteUnitPrice;
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
        @JoinColumn(name = "QUOTE_ID", referencedColumnName = "QUOTE_ID", insertable = false, updatable = false),
        @JoinColumn(name = "QUOTE_ITEM_SEQ_ID", referencedColumnName = "QUOTE_ITEM_SEQ_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private QuoteItem quoteItem;
    @JoinColumn(name = "QUOTE_ID", referencedColumnName = "QUOTE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Quote quote;

    public QuoteItemOption() {
    }

    public QuoteItemOption(QuoteItemOptionPK quoteItemOptionPK) {
        this.quoteItemOptionPK = quoteItemOptionPK;
    }

    public QuoteItemOption(String quoteId, String quoteItemSeqId, String quoteItemOptionSeqId) {
        this.quoteItemOptionPK = new QuoteItemOptionPK(quoteId, quoteItemSeqId, quoteItemOptionSeqId);
    }

    public QuoteItemOptionPK getQuoteItemOptionPK() {
        return quoteItemOptionPK;
    }

    public void setQuoteItemOptionPK(QuoteItemOptionPK quoteItemOptionPK) {
        this.quoteItemOptionPK = quoteItemOptionPK;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getQuoteUnitPrice() {
        return quoteUnitPrice;
    }

    public void setQuoteUnitPrice(BigDecimal quoteUnitPrice) {
        this.quoteUnitPrice = quoteUnitPrice;
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

    public QuoteItem getQuoteItem() {
        return quoteItem;
    }

    public void setQuoteItem(QuoteItem quoteItem) {
        this.quoteItem = quoteItem;
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
        hash += (quoteItemOptionPK != null ? quoteItemOptionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof QuoteItemOption)) {
            return false;
        }
        QuoteItemOption other = (QuoteItemOption) object;
        if ((this.quoteItemOptionPK == null && other.quoteItemOptionPK != null) || (this.quoteItemOptionPK != null && !this.quoteItemOptionPK.equals(other.quoteItemOptionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.QuoteItemOption[ quoteItemOptionPK=" + quoteItemOptionPK + " ]";
    }
    
}
