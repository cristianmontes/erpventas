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
public class QuoteTermPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "TERM_TYPE_ID")
    private String termTypeId;
    @Basic(optional = false)
    @Column(name = "QUOTE_ID")
    private String quoteId;
    @Basic(optional = false)
    @Column(name = "QUOTE_ITEM_SEQ_ID")
    private String quoteItemSeqId;

    public QuoteTermPK() {
    }

    public QuoteTermPK(String termTypeId, String quoteId, String quoteItemSeqId) {
        this.termTypeId = termTypeId;
        this.quoteId = quoteId;
        this.quoteItemSeqId = quoteItemSeqId;
    }

    public String getTermTypeId() {
        return termTypeId;
    }

    public void setTermTypeId(String termTypeId) {
        this.termTypeId = termTypeId;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (termTypeId != null ? termTypeId.hashCode() : 0);
        hash += (quoteId != null ? quoteId.hashCode() : 0);
        hash += (quoteItemSeqId != null ? quoteItemSeqId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof QuoteTermPK)) {
            return false;
        }
        QuoteTermPK other = (QuoteTermPK) object;
        if ((this.termTypeId == null && other.termTypeId != null) || (this.termTypeId != null && !this.termTypeId.equals(other.termTypeId))) {
            return false;
        }
        if ((this.quoteId == null && other.quoteId != null) || (this.quoteId != null && !this.quoteId.equals(other.quoteId))) {
            return false;
        }
        if ((this.quoteItemSeqId == null && other.quoteItemSeqId != null) || (this.quoteItemSeqId != null && !this.quoteItemSeqId.equals(other.quoteItemSeqId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.QuoteTermPK[ termTypeId=" + termTypeId + ", quoteId=" + quoteId + ", quoteItemSeqId=" + quoteItemSeqId + " ]";
    }
    
}
