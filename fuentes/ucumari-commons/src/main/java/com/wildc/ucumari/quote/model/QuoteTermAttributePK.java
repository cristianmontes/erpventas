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
public class QuoteTermAttributePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "TERM_TYPE_ID")
    private String termTypeId;
    @Basic(optional = false)
    @Column(name = "QUOTE_ID")
    private String quoteId;
    @Basic(optional = false)
    @Column(name = "QUOTE_ITEM_SEQ_ID")
    private String quoteItemSeqId;
    @Basic(optional = false)
    @Column(name = "ATTR_NAME")
    private String attrName;

    public QuoteTermAttributePK() {
    }

    public QuoteTermAttributePK(String termTypeId, String quoteId, String quoteItemSeqId, String attrName) {
        this.termTypeId = termTypeId;
        this.quoteId = quoteId;
        this.quoteItemSeqId = quoteItemSeqId;
        this.attrName = attrName;
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

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (termTypeId != null ? termTypeId.hashCode() : 0);
        hash += (quoteId != null ? quoteId.hashCode() : 0);
        hash += (quoteItemSeqId != null ? quoteItemSeqId.hashCode() : 0);
        hash += (attrName != null ? attrName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof QuoteTermAttributePK)) {
            return false;
        }
        QuoteTermAttributePK other = (QuoteTermAttributePK) object;
        if ((this.termTypeId == null && other.termTypeId != null) || (this.termTypeId != null && !this.termTypeId.equals(other.termTypeId))) {
            return false;
        }
        if ((this.quoteId == null && other.quoteId != null) || (this.quoteId != null && !this.quoteId.equals(other.quoteId))) {
            return false;
        }
        if ((this.quoteItemSeqId == null && other.quoteItemSeqId != null) || (this.quoteItemSeqId != null && !this.quoteItemSeqId.equals(other.quoteItemSeqId))) {
            return false;
        }
        if ((this.attrName == null && other.attrName != null) || (this.attrName != null && !this.attrName.equals(other.attrName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.QuoteTermAttributePK[ termTypeId=" + termTypeId + ", quoteId=" + quoteId + ", quoteItemSeqId=" + quoteItemSeqId + ", attrName=" + attrName + " ]";
    }
    
}
