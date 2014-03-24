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
public class QuoteCoefficientPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "QUOTE_ID")
    private String quoteId;
    @Basic(optional = false)
    @Column(name = "COEFF_NAME")
    private String coeffName;

    public QuoteCoefficientPK() {
    }

    public QuoteCoefficientPK(String quoteId, String coeffName) {
        this.quoteId = quoteId;
        this.coeffName = coeffName;
    }

    public String getQuoteId() {
        return quoteId;
    }

    public void setQuoteId(String quoteId) {
        this.quoteId = quoteId;
    }

    public String getCoeffName() {
        return coeffName;
    }

    public void setCoeffName(String coeffName) {
        this.coeffName = coeffName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (quoteId != null ? quoteId.hashCode() : 0);
        hash += (coeffName != null ? coeffName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof QuoteCoefficientPK)) {
            return false;
        }
        QuoteCoefficientPK other = (QuoteCoefficientPK) object;
        if ((this.quoteId == null && other.quoteId != null) || (this.quoteId != null && !this.quoteId.equals(other.quoteId))) {
            return false;
        }
        if ((this.coeffName == null && other.coeffName != null) || (this.coeffName != null && !this.coeffName.equals(other.coeffName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.QuoteCoefficientPK[ quoteId=" + quoteId + ", coeffName=" + coeffName + " ]";
    }
    
}
