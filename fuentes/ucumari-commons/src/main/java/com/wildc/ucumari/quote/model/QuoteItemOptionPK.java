/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.quote.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class QuoteItemOptionPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "QUOTE_ID")
    private String quoteId;
    @Basic(optional = false)
    @Column(name = "QUOTE_ITEM_SEQ_ID")
    private String quoteItemSeqId;
    @Basic(optional = false)
    @Column(name = "QUOTE_ITEM_OPTION_SEQ_ID")
    private String quoteItemOptionSeqId;

    public QuoteItemOptionPK() {
    }

    public QuoteItemOptionPK(String quoteId, String quoteItemSeqId, String quoteItemOptionSeqId) {
        this.quoteId = quoteId;
        this.quoteItemSeqId = quoteItemSeqId;
        this.quoteItemOptionSeqId = quoteItemOptionSeqId;
    }

    public String getQuoteId() {
        return quoteId;
    }

    public void setQuoteId(String quoteId) {
        this.quoteId = quoteId;
    }

    public String getQuoteItemSeqId() {
        return quoteItemSeqId;
    }

    public void setQuoteItemSeqId(String quoteItemSeqId) {
        this.quoteItemSeqId = quoteItemSeqId;
    }

    public String getQuoteItemOptionSeqId() {
        return quoteItemOptionSeqId;
    }

    public void setQuoteItemOptionSeqId(String quoteItemOptionSeqId) {
        this.quoteItemOptionSeqId = quoteItemOptionSeqId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (quoteId != null ? quoteId.hashCode() : 0);
        hash += (quoteItemSeqId != null ? quoteItemSeqId.hashCode() : 0);
        hash += (quoteItemOptionSeqId != null ? quoteItemOptionSeqId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof QuoteItemOptionPK)) {
            return false;
        }
        QuoteItemOptionPK other = (QuoteItemOptionPK) object;
        if ((this.quoteId == null && other.quoteId != null) || (this.quoteId != null && !this.quoteId.equals(other.quoteId))) {
            return false;
        }
        if ((this.quoteItemSeqId == null && other.quoteItemSeqId != null) || (this.quoteItemSeqId != null && !this.quoteItemSeqId.equals(other.quoteItemSeqId))) {
            return false;
        }
        if ((this.quoteItemOptionSeqId == null && other.quoteItemOptionSeqId != null) || (this.quoteItemOptionSeqId != null && !this.quoteItemOptionSeqId.equals(other.quoteItemOptionSeqId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.QuoteItemOptionPK[ quoteId=" + quoteId + ", quoteItemSeqId=" + quoteItemSeqId + ", quoteItemOptionSeqId=" + quoteItemOptionSeqId + " ]";
    }
    
}
