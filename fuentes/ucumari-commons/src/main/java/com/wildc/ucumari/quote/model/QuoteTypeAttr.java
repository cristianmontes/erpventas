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
@Table(name = "quote_type_attr")
@NamedQueries({
    @NamedQuery(name = "QuoteTypeAttr.findAll", query = "SELECT q FROM QuoteTypeAttr q")})
public class QuoteTypeAttr implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected QuoteTypeAttrPK quoteTypeAttrPK;
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
    @JoinColumn(name = "QUOTE_TYPE_ID", referencedColumnName = "QUOTE_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private QuoteType quoteType;

    public QuoteTypeAttr() {
    }

    public QuoteTypeAttr(QuoteTypeAttrPK quoteTypeAttrPK) {
        this.quoteTypeAttrPK = quoteTypeAttrPK;
    }

    public QuoteTypeAttr(String quoteTypeId, String attrName) {
        this.quoteTypeAttrPK = new QuoteTypeAttrPK(quoteTypeId, attrName);
    }

    public QuoteTypeAttrPK getQuoteTypeAttrPK() {
        return quoteTypeAttrPK;
    }

    public void setQuoteTypeAttrPK(QuoteTypeAttrPK quoteTypeAttrPK) {
        this.quoteTypeAttrPK = quoteTypeAttrPK;
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

    public QuoteType getQuoteType() {
        return quoteType;
    }

    public void setQuoteType(QuoteType quoteType) {
        this.quoteType = quoteType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (quoteTypeAttrPK != null ? quoteTypeAttrPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof QuoteTypeAttr)) {
            return false;
        }
        QuoteTypeAttr other = (QuoteTypeAttr) object;
        if ((this.quoteTypeAttrPK == null && other.quoteTypeAttrPK != null) || (this.quoteTypeAttrPK != null && !this.quoteTypeAttrPK.equals(other.quoteTypeAttrPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.QuoteTypeAttr[ quoteTypeAttrPK=" + quoteTypeAttrPK + " ]";
    }
    
}
