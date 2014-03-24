/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.contact.model.ContactList;
import com.wildc.ucumari.parameters.model.StatusItem;
import com.wildc.ucumari.parameters.model.Uom;
import com.wildc.ucumari.quote.model.SalesOpportunity;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "marketing_campaign")
@NamedQueries({
    @NamedQuery(name = "MarketingCampaign.findAll", query = "SELECT m FROM MarketingCampaign m")})
public class MarketingCampaign implements Serializable {
    @OneToMany(mappedBy = "marketingCampaignId")
    private List<TrackingCode> trackingCodeList;
    @OneToMany(mappedBy = "marketingCampaignId")
    private List<MmarketingCampaignContaclist> mmarketingCampaignContaclistList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "marketingCampaign")
    private List<MarketingCampaignRole> marketingCampaignRoleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "marketingCampaign")
    private List<MarketingCampaignNote> marketingCampaignNoteList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "marketingCampaign")
    private List<MarketingCampaignPrice> marketingCampaignPriceList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "marketingCampaign")
    private List<MarketingCampaignPromo> marketingCampaignPromoList;
    @OneToMany(mappedBy = "marketingCampaignId")
    private List<ContactList> contactListList;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MARKETING_CAMPAIGN_ID")
    private String marketingCampaignId;
    @Column(name = "CAMPAIGN_NAME")
    private String campaignName;
    @Lob
    @Column(name = "CAMPAIGN_SUMMARY")
    private String campaignSummary;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "BUDGETED_COST")
    private BigDecimal budgetedCost;
    @Column(name = "ACTUAL_COST")
    private BigDecimal actualCost;
    @Column(name = "ESTIMATED_COST")
    private BigDecimal estimatedCost;
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
    @Column(name = "IS_ACTIVE")
    private Character isActive;
    @Column(name = "CONVERTED_LEADS")
    private String convertedLeads;
    @Column(name = "EXPECTED_RESPONSE_PERCENT")
    private BigDecimal expectedResponsePercent;
    @Column(name = "EXPECTED_REVENUE")
    private BigDecimal expectedRevenue;
    @Column(name = "NUM_SENT")
    private BigInteger numSent;
    @Column(name = "START_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;
    @Column(name = "CREATED_BY_USER_LOGIN")
    private String createdByUserLogin;
    @Column(name = "LAST_MODIFIED_BY_USER_LOGIN")
    private String lastModifiedByUserLogin;
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
    @JoinColumn(name = "STATUS_ID", referencedColumnName = "STATUS_ID")
    @ManyToOne
    private StatusItem statusId;
    @OneToMany(mappedBy = "parentCampaignId")
    private List<MarketingCampaign> marketingCampaignList;
    @JoinColumn(name = "PARENT_CAMPAIGN_ID", referencedColumnName = "MARKETING_CAMPAIGN_ID")
    @ManyToOne
    private MarketingCampaign parentCampaignId;
    @JoinColumn(name = "CURRENCY_UOM_ID", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom currencyUomId;
    @OneToMany(mappedBy = "marketingCampaignId")
    private List<SalesOpportunity> salesOpportunityList;

    public MarketingCampaign() {
    }

    public MarketingCampaign(String marketingCampaignId) {
        this.marketingCampaignId = marketingCampaignId;
    }

    public String getMarketingCampaignId() {
        return marketingCampaignId;
    }

    public void setMarketingCampaignId(String marketingCampaignId) {
        this.marketingCampaignId = marketingCampaignId;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public String getCampaignSummary() {
        return campaignSummary;
    }

    public void setCampaignSummary(String campaignSummary) {
        this.campaignSummary = campaignSummary;
    }

    public BigDecimal getBudgetedCost() {
        return budgetedCost;
    }

    public void setBudgetedCost(BigDecimal budgetedCost) {
        this.budgetedCost = budgetedCost;
    }

    public BigDecimal getActualCost() {
        return actualCost;
    }

    public void setActualCost(BigDecimal actualCost) {
        this.actualCost = actualCost;
    }

    public BigDecimal getEstimatedCost() {
        return estimatedCost;
    }

    public void setEstimatedCost(BigDecimal estimatedCost) {
        this.estimatedCost = estimatedCost;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
    }

    public Character getIsActive() {
        return isActive;
    }

    public void setIsActive(Character isActive) {
        this.isActive = isActive;
    }

    public String getConvertedLeads() {
        return convertedLeads;
    }

    public void setConvertedLeads(String convertedLeads) {
        this.convertedLeads = convertedLeads;
    }

    public BigDecimal getExpectedResponsePercent() {
        return expectedResponsePercent;
    }

    public void setExpectedResponsePercent(BigDecimal expectedResponsePercent) {
        this.expectedResponsePercent = expectedResponsePercent;
    }

    public BigDecimal getExpectedRevenue() {
        return expectedRevenue;
    }

    public void setExpectedRevenue(BigDecimal expectedRevenue) {
        this.expectedRevenue = expectedRevenue;
    }

    public BigInteger getNumSent() {
        return numSent;
    }

    public void setNumSent(BigInteger numSent) {
        this.numSent = numSent;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getCreatedByUserLogin() {
        return createdByUserLogin;
    }

    public void setCreatedByUserLogin(String createdByUserLogin) {
        this.createdByUserLogin = createdByUserLogin;
    }

    public String getLastModifiedByUserLogin() {
        return lastModifiedByUserLogin;
    }

    public void setLastModifiedByUserLogin(String lastModifiedByUserLogin) {
        this.lastModifiedByUserLogin = lastModifiedByUserLogin;
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

    public StatusItem getStatusId() {
        return statusId;
    }

    public void setStatusId(StatusItem statusId) {
        this.statusId = statusId;
    }

    public List<MarketingCampaign> getMarketingCampaignList() {
        return marketingCampaignList;
    }

    public void setMarketingCampaignList(List<MarketingCampaign> marketingCampaignList) {
        this.marketingCampaignList = marketingCampaignList;
    }

    public MarketingCampaign getParentCampaignId() {
        return parentCampaignId;
    }

    public void setParentCampaignId(MarketingCampaign parentCampaignId) {
        this.parentCampaignId = parentCampaignId;
    }

    public Uom getCurrencyUomId() {
        return currencyUomId;
    }

    public void setCurrencyUomId(Uom currencyUomId) {
        this.currencyUomId = currencyUomId;
    }

    public List<SalesOpportunity> getSalesOpportunityList() {
        return salesOpportunityList;
    }

    public void setSalesOpportunityList(List<SalesOpportunity> salesOpportunityList) {
        this.salesOpportunityList = salesOpportunityList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (marketingCampaignId != null ? marketingCampaignId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MarketingCampaign)) {
            return false;
        }
        MarketingCampaign other = (MarketingCampaign) object;
        if ((this.marketingCampaignId == null && other.marketingCampaignId != null) || (this.marketingCampaignId != null && !this.marketingCampaignId.equals(other.marketingCampaignId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.MarketingCampaign[ marketingCampaignId=" + marketingCampaignId + " ]";
    }

    public List<ContactList> getContactListList() {
        return contactListList;
    }

    public void setContactListList(List<ContactList> contactListList) {
        this.contactListList = contactListList;
    }

    public List<MmarketingCampaignContaclist> getMmarketingCampaignContaclistList() {
        return mmarketingCampaignContaclistList;
    }

    public void setMmarketingCampaignContaclistList(List<MmarketingCampaignContaclist> mmarketingCampaignContaclistList) {
        this.mmarketingCampaignContaclistList = mmarketingCampaignContaclistList;
    }

    public List<MarketingCampaignRole> getMarketingCampaignRoleList() {
        return marketingCampaignRoleList;
    }

    public void setMarketingCampaignRoleList(List<MarketingCampaignRole> marketingCampaignRoleList) {
        this.marketingCampaignRoleList = marketingCampaignRoleList;
    }

    public List<MarketingCampaignNote> getMarketingCampaignNoteList() {
        return marketingCampaignNoteList;
    }

    public void setMarketingCampaignNoteList(List<MarketingCampaignNote> marketingCampaignNoteList) {
        this.marketingCampaignNoteList = marketingCampaignNoteList;
    }

    public List<MarketingCampaignPrice> getMarketingCampaignPriceList() {
        return marketingCampaignPriceList;
    }

    public void setMarketingCampaignPriceList(List<MarketingCampaignPrice> marketingCampaignPriceList) {
        this.marketingCampaignPriceList = marketingCampaignPriceList;
    }

    public List<MarketingCampaignPromo> getMarketingCampaignPromoList() {
        return marketingCampaignPromoList;
    }

    public void setMarketingCampaignPromoList(List<MarketingCampaignPromo> marketingCampaignPromoList) {
        this.marketingCampaignPromoList = marketingCampaignPromoList;
    }

    public List<TrackingCode> getTrackingCodeList() {
        return trackingCodeList;
    }

    public void setTrackingCodeList(List<TrackingCode> trackingCodeList) {
        this.trackingCodeList = trackingCodeList;
    }
    
}
