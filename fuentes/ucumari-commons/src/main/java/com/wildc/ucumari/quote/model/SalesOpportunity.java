/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.quote.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.parameters.model.Enumeration;
import com.wildc.ucumari.parameters.model.Uom;
import com.wildc.ucumari.security.model.UserLogin;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "sales_opportunity")
public class SalesOpportunity implements Serializable {
    /*@OneToMany(mappedBy = "salesOpportunityId")
    private List<SalesOpportunityHistory> salesOpportunityHistoryList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "salesOpportunity")
    private List<SalesOpportunityTrckCode> salesOpportunityTrckCodeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "salesOpportunity")
    private List<SalesOpportunityWorkEffort> salesOpportunityWorkEffortList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "salesOpportunity")
    private List<SalesOpportunityRole> salesOpportunityRoleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "salesOpportunity")
    private List<SalesOpportunityQuote> salesOpportunityQuoteList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "salesOpportunity")
    private List<SalesOpportunityCompetitor> salesOpportunityCompetitorList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "salesOpportunity")
    private List<SalesOpportunityContent> salesOpportunityContentList;*/
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SALES_OPPORTUNITY_ID")
    private String salesOpportunityId;
    @Column(name = "OPPORTUNITY_NAME")
    private String opportunityName;
    @Lob
    @Column(name = "DESCRIPTION")
    private String description;
    @Lob
    @Column(name = "NEXT_STEP")
    private String nextStep;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ESTIMATED_AMOUNT")
    private BigDecimal estimatedAmount;
    @Column(name = "ESTIMATED_PROBABILITY")
    private BigDecimal estimatedProbability;
    @Column(name = "DATA_SOURCE_ID")
    private String dataSourceId;
    @Column(name = "ESTIMATED_CLOSE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date estimatedCloseDate;
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
    @JoinColumn(name = "CREATED_BY_USER_LOGIN", referencedColumnName = "USER_LOGIN_ID")
    @ManyToOne
    private UserLogin createdByUserLogin;
    @JoinColumn(name = "TYPE_ENUM_ID", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration typeEnumId;
    @JoinColumn(name = "OPPORTUNITY_STAGE_ID", referencedColumnName = "OPPORTUNITY_STAGE_ID")
    @ManyToOne
    private SalesOpportunityStage opportunityStageId;
    /*@JoinColumn(name = "MARKETING_CAMPAIGN_ID", referencedColumnName = "MARKETING_CAMPAIGN_ID")
    @ManyToOne
    private MarketingCampaign marketingCampaignId;*/
    @JoinColumn(name = "CURRENCY_UOM_ID", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom currencyUomId;
    /*@OneToMany(mappedBy = "salesOpportunityId")
    private List<OrderItem> orderItemList;
    @OneToMany(mappedBy = "salesOpportunityId")
    private List<InvoiceItem> invoiceItemList;*/

    public SalesOpportunity() {
    }

    public SalesOpportunity(String salesOpportunityId) {
        this.salesOpportunityId = salesOpportunityId;
    }

    public String getSalesOpportunityId() {
        return salesOpportunityId;
    }

    public void setSalesOpportunityId(String salesOpportunityId) {
        this.salesOpportunityId = salesOpportunityId;
    }

    public String getOpportunityName() {
        return opportunityName;
    }

    public void setOpportunityName(String opportunityName) {
        this.opportunityName = opportunityName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNextStep() {
        return nextStep;
    }

    public void setNextStep(String nextStep) {
        this.nextStep = nextStep;
    }

    public BigDecimal getEstimatedAmount() {
        return estimatedAmount;
    }

    public void setEstimatedAmount(BigDecimal estimatedAmount) {
        this.estimatedAmount = estimatedAmount;
    }

    public BigDecimal getEstimatedProbability() {
        return estimatedProbability;
    }

    public void setEstimatedProbability(BigDecimal estimatedProbability) {
        this.estimatedProbability = estimatedProbability;
    }

    public String getDataSourceId() {
        return dataSourceId;
    }

    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    public Date getEstimatedCloseDate() {
        return estimatedCloseDate;
    }

    public void setEstimatedCloseDate(Date estimatedCloseDate) {
        this.estimatedCloseDate = estimatedCloseDate;
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

    public UserLogin getCreatedByUserLogin() {
        return createdByUserLogin;
    }

    public void setCreatedByUserLogin(UserLogin createdByUserLogin) {
        this.createdByUserLogin = createdByUserLogin;
    }

    public Enumeration getTypeEnumId() {
        return typeEnumId;
    }

    public void setTypeEnumId(Enumeration typeEnumId) {
        this.typeEnumId = typeEnumId;
    }

    public SalesOpportunityStage getOpportunityStageId() {
        return opportunityStageId;
    }

    public void setOpportunityStageId(SalesOpportunityStage opportunityStageId) {
        this.opportunityStageId = opportunityStageId;
    }
/*
    public MarketingCampaign getMarketingCampaignId() {
        return marketingCampaignId;
    }

    public void setMarketingCampaignId(MarketingCampaign marketingCampaignId) {
        this.marketingCampaignId = marketingCampaignId;
    }*/

    public Uom getCurrencyUomId() {
        return currencyUomId;
    }

    public void setCurrencyUomId(Uom currencyUomId) {
        this.currencyUomId = currencyUomId;
    }
/*
    public List<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(List<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public List<InvoiceItem> getInvoiceItemList() {
        return invoiceItemList;
    }

    public void setInvoiceItemList(List<InvoiceItem> invoiceItemList) {
        this.invoiceItemList = invoiceItemList;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (salesOpportunityId != null ? salesOpportunityId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SalesOpportunity)) {
            return false;
        }
        SalesOpportunity other = (SalesOpportunity) object;
        if ((this.salesOpportunityId == null && other.salesOpportunityId != null) || (this.salesOpportunityId != null && !this.salesOpportunityId.equals(other.salesOpportunityId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.SalesOpportunity[ salesOpportunityId=" + salesOpportunityId + " ]";
    }
/*
    public List<SalesOpportunityHistory> getSalesOpportunityHistoryList() {
        return salesOpportunityHistoryList;
    }

    public void setSalesOpportunityHistoryList(List<SalesOpportunityHistory> salesOpportunityHistoryList) {
        this.salesOpportunityHistoryList = salesOpportunityHistoryList;
    }

    public List<SalesOpportunityTrckCode> getSalesOpportunityTrckCodeList() {
        return salesOpportunityTrckCodeList;
    }

    public void setSalesOpportunityTrckCodeList(List<SalesOpportunityTrckCode> salesOpportunityTrckCodeList) {
        this.salesOpportunityTrckCodeList = salesOpportunityTrckCodeList;
    }

    public List<SalesOpportunityWorkEffort> getSalesOpportunityWorkEffortList() {
        return salesOpportunityWorkEffortList;
    }

    public void setSalesOpportunityWorkEffortList(List<SalesOpportunityWorkEffort> salesOpportunityWorkEffortList) {
        this.salesOpportunityWorkEffortList = salesOpportunityWorkEffortList;
    }

    public List<SalesOpportunityRole> getSalesOpportunityRoleList() {
        return salesOpportunityRoleList;
    }

    public void setSalesOpportunityRoleList(List<SalesOpportunityRole> salesOpportunityRoleList) {
        this.salesOpportunityRoleList = salesOpportunityRoleList;
    }

    public List<SalesOpportunityQuote> getSalesOpportunityQuoteList() {
        return salesOpportunityQuoteList;
    }

    public void setSalesOpportunityQuoteList(List<SalesOpportunityQuote> salesOpportunityQuoteList) {
        this.salesOpportunityQuoteList = salesOpportunityQuoteList;
    }

    public List<SalesOpportunityCompetitor> getSalesOpportunityCompetitorList() {
        return salesOpportunityCompetitorList;
    }

    public void setSalesOpportunityCompetitorList(List<SalesOpportunityCompetitor> salesOpportunityCompetitorList) {
        this.salesOpportunityCompetitorList = salesOpportunityCompetitorList;
    }

    public List<SalesOpportunityContent> getSalesOpportunityContentList() {
        return salesOpportunityContentList;
    }

    public void setSalesOpportunityContentList(List<SalesOpportunityContent> salesOpportunityContentList) {
        this.salesOpportunityContentList = salesOpportunityContentList;
    }*/
    
}
