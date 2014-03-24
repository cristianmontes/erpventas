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

import com.wildc.ucumari.parameters.model.Enumeration;
import com.wildc.ucumari.parameters.model.StatusItem;
import com.wildc.ucumari.parameters.model.Uom;
import com.wildc.ucumari.party.model.Party;
import com.wildc.ucumari.product.model.ProductStore;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "quote")
public class Quote implements Serializable {
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "quote")
    private List<QuoteNote> quoteNoteList;
    @OneToMany(mappedBy = "quoteId")
    private List<QuoteAdjustment> quoteAdjustmentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "quote")
    private List<QuoteRole> quoteRoleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "quote")
    private List<QuoteWorkEffort> quoteWorkEffortList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "quote")
    private List<QuoteTerm> quoteTermList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "quote")
    private List<QuoteAttribute> quoteAttributeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "quote")
    private List<SalesOpportunityQuote> salesOpportunityQuoteList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "quote")
    private List<QuoteCoefficient> quoteCoefficientList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "quote")
    private List<QuoteItemOption> quoteItemOptionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "quote")
    private List<QuoteContent> quoteContentList;*/
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "QUOTE_ID")
    private String quoteId;
    @Column(name = "ISSUE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date issueDate;
    @Column(name = "VALID_FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date validFromDate;
    @Column(name = "VALID_THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date validThruDate;
    @Column(name = "QUOTE_NAME")
    private String quoteName;
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
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "quote")
    private List<QuoteItem> quoteItemList;*/
    @JoinColumn(name = "STATUS_ID", referencedColumnName = "STATUS_ID")
    @ManyToOne
    private StatusItem statusId;
    @JoinColumn(name = "QUOTE_TYPE_ID", referencedColumnName = "QUOTE_TYPE_ID")
    @ManyToOne
    private QuoteType quoteTypeId;
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party partyId;
    @JoinColumn(name = "PRODUCT_STORE_ID", referencedColumnName = "PRODUCT_STORE_ID")
    @ManyToOne
    private ProductStore productStoreId;
    @JoinColumn(name = "CURRENCY_UOM_ID", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom currencyUomId;
    @JoinColumn(name = "CONTACT_PARTY_ID", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party contactPartyId;
    @JoinColumn(name = "SALES_CHANNEL_ENUM_ID", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration salesChannelEnumId;
    @JoinColumn(name = "CREATED_BY_PARTY_ID", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party createdByPartyId;

    public Quote() {
    }

    public Quote(String quoteId) {
        this.quoteId = quoteId;
    }

    public String getQuoteId() {
        return quoteId;
    }

    public void setQuoteId(String quoteId) {
        this.quoteId = quoteId;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Date getValidFromDate() {
        return validFromDate;
    }

    public void setValidFromDate(Date validFromDate) {
        this.validFromDate = validFromDate;
    }

    public Date getValidThruDate() {
        return validThruDate;
    }

    public void setValidThruDate(Date validThruDate) {
        this.validThruDate = validThruDate;
    }

    public String getQuoteName() {
        return quoteName;
    }

    public void setQuoteName(String quoteName) {
        this.quoteName = quoteName;
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
    public List<QuoteItem> getQuoteItemList() {
        return quoteItemList;
    }

    public void setQuoteItemList(List<QuoteItem> quoteItemList) {
        this.quoteItemList = quoteItemList;
    }*/

    public StatusItem getStatusId() {
        return statusId;
    }

    public void setStatusId(StatusItem statusId) {
        this.statusId = statusId;
    }

    public QuoteType getQuoteTypeId() {
        return quoteTypeId;
    }

    public void setQuoteTypeId(QuoteType quoteTypeId) {
        this.quoteTypeId = quoteTypeId;
    }

    public Party getPartyId() {
        return partyId;
    }

    public void setPartyId(Party partyId) {
        this.partyId = partyId;
    }

    public ProductStore getProductStoreId() {
        return productStoreId;
    }

    public void setProductStoreId(ProductStore productStoreId) {
        this.productStoreId = productStoreId;
    }

    public Uom getCurrencyUomId() {
        return currencyUomId;
    }

    public void setCurrencyUomId(Uom currencyUomId) {
        this.currencyUomId = currencyUomId;
    }

    public Party getContactPartyId() {
        return contactPartyId;
    }

    public void setContactPartyId(Party contactPartyId) {
        this.contactPartyId = contactPartyId;
    }

    public Enumeration getSalesChannelEnumId() {
        return salesChannelEnumId;
    }

    public void setSalesChannelEnumId(Enumeration salesChannelEnumId) {
        this.salesChannelEnumId = salesChannelEnumId;
    }

    public Party getCreatedByPartyId() {
        return createdByPartyId;
    }

    public void setCreatedByPartyId(Party createdByPartyId) {
        this.createdByPartyId = createdByPartyId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (quoteId != null ? quoteId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Quote)) {
            return false;
        }
        Quote other = (Quote) object;
        if ((this.quoteId == null && other.quoteId != null) || (this.quoteId != null && !this.quoteId.equals(other.quoteId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.Quote[ quoteId=" + quoteId + " ]";
    }
/*
    public List<QuoteNote> getQuoteNoteList() {
        return quoteNoteList;
    }

    public void setQuoteNoteList(List<QuoteNote> quoteNoteList) {
        this.quoteNoteList = quoteNoteList;
    }

    public List<QuoteAdjustment> getQuoteAdjustmentList() {
        return quoteAdjustmentList;
    }

    public void setQuoteAdjustmentList(List<QuoteAdjustment> quoteAdjustmentList) {
        this.quoteAdjustmentList = quoteAdjustmentList;
    }

    public List<QuoteRole> getQuoteRoleList() {
        return quoteRoleList;
    }

    public void setQuoteRoleList(List<QuoteRole> quoteRoleList) {
        this.quoteRoleList = quoteRoleList;
    }

    public List<QuoteWorkEffort> getQuoteWorkEffortList() {
        return quoteWorkEffortList;
    }

    public void setQuoteWorkEffortList(List<QuoteWorkEffort> quoteWorkEffortList) {
        this.quoteWorkEffortList = quoteWorkEffortList;
    }

    public List<QuoteTerm> getQuoteTermList() {
        return quoteTermList;
    }

    public void setQuoteTermList(List<QuoteTerm> quoteTermList) {
        this.quoteTermList = quoteTermList;
    }

    public List<QuoteAttribute> getQuoteAttributeList() {
        return quoteAttributeList;
    }

    public void setQuoteAttributeList(List<QuoteAttribute> quoteAttributeList) {
        this.quoteAttributeList = quoteAttributeList;
    }

    public List<SalesOpportunityQuote> getSalesOpportunityQuoteList() {
        return salesOpportunityQuoteList;
    }

    public void setSalesOpportunityQuoteList(List<SalesOpportunityQuote> salesOpportunityQuoteList) {
        this.salesOpportunityQuoteList = salesOpportunityQuoteList;
    }

    public List<QuoteCoefficient> getQuoteCoefficientList() {
        return quoteCoefficientList;
    }

    public void setQuoteCoefficientList(List<QuoteCoefficient> quoteCoefficientList) {
        this.quoteCoefficientList = quoteCoefficientList;
    }

    public List<QuoteItemOption> getQuoteItemOptionList() {
        return quoteItemOptionList;
    }

    public void setQuoteItemOptionList(List<QuoteItemOption> quoteItemOptionList) {
        this.quoteItemOptionList = quoteItemOptionList;
    }

    public List<QuoteContent> getQuoteContentList() {
        return quoteContentList;
    }

    public void setQuoteContentList(List<QuoteContent> quoteContentList) {
        this.quoteContentList = quoteContentList;
    }*/
    
}
