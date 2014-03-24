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
public class QuoteTypeAttrPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "QUOTE_TYPE_ID")
    private String quoteTypeId;
    @Basic(optional = false)
    @Column(name = "ATTR_NAME")
    private String attrName;

    public QuoteTypeAttrPK() {
    }

    public QuoteTypeAttrPK(String quoteTypeId, String attrName) {
        this.quoteTypeId = quoteTypeId;
        this.attrName = attrName;
    }

    public String getQuoteTypeId() {
        return quoteTypeId;
    }

    public void setQuoteTypeId(String quoteTypeId) {
        this.quoteTypeId = quoteTypeId;
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
        hash += (quoteTypeId != null ? quoteTypeId.hashCode() : 0);
        hash += (attrName != null ? attrName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof QuoteTypeAttrPK)) {
            return false;
        }
        QuoteTypeAttrPK other = (QuoteTypeAttrPK) object;
        if ((this.quoteTypeId == null && other.quoteTypeId != null) || (this.quoteTypeId != null && !this.quoteTypeId.equals(other.quoteTypeId))) {
            return false;
        }
        if ((this.attrName == null && other.attrName != null) || (this.attrName != null && !this.attrName.equals(other.attrName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.QuoteTypeAttrPK[ quoteTypeId=" + quoteTypeId + ", attrName=" + attrName + " ]";
    }
    
}
