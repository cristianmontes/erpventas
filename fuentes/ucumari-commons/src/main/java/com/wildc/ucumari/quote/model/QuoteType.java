/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.quote.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "quote_type")
public class QuoteType implements Serializable {
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "quoteType")
    private List<QuoteTypeAttr> quoteTypeAttrList;*/
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "QUOTE_TYPE_ID")
    private String quoteTypeId;
    @Column(name = "HAS_TABLE")
    private Character hasTable;
    @Column(name = "DESCRIPTION")
    private String description;
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
    /*@OneToMany(mappedBy = "parentTypeId")
    private List<QuoteType> quoteTypeList;*/
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "QUOTE_TYPE_ID")
    @ManyToOne
    private QuoteType parentTypeId;
    /*@OneToMany(mappedBy = "quoteTypeId")
    private List<Quote> quoteList;*/

    public QuoteType() {
    }

    public QuoteType(String quoteTypeId) {
        this.quoteTypeId = quoteTypeId;
    }

    public String getQuoteTypeId() {
        return quoteTypeId;
    }

    public void setQuoteTypeId(String quoteTypeId) {
        this.quoteTypeId = quoteTypeId;
    }

    public Character getHasTable() {
        return hasTable;
    }

    public void setHasTable(Character hasTable) {
        this.hasTable = hasTable;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
/*
    public List<QuoteType> getQuoteTypeList() {
        return quoteTypeList;
    }

    public void setQuoteTypeList(List<QuoteType> quoteTypeList) {
        this.quoteTypeList = quoteTypeList;
    }*/

    public QuoteType getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(QuoteType parentTypeId) {
        this.parentTypeId = parentTypeId;
    }
/*
    public List<Quote> getQuoteList() {
        return quoteList;
    }

    public void setQuoteList(List<Quote> quoteList) {
        this.quoteList = quoteList;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (quoteTypeId != null ? quoteTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof QuoteType)) {
            return false;
        }
        QuoteType other = (QuoteType) object;
        if ((this.quoteTypeId == null && other.quoteTypeId != null) || (this.quoteTypeId != null && !this.quoteTypeId.equals(other.quoteTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.QuoteType[ quoteTypeId=" + quoteTypeId + " ]";
    }
/*
    public List<QuoteTypeAttr> getQuoteTypeAttrList() {
        return quoteTypeAttrList;
    }

    public void setQuoteTypeAttrList(List<QuoteTypeAttr> quoteTypeAttrList) {
        this.quoteTypeAttrList = quoteTypeAttrList;
    }*/
    
}
