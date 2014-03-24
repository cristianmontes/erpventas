/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import com.wildc.ucumari.parameters.model.CustomTimePeriod;
import com.wildc.ucumari.parameters.model.Uom;
import com.wildc.ucumari.party.model.Party;
import com.wildc.ucumari.security.model.UserLogin;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "sales_forecast")
@NamedQueries({
    @NamedQuery(name = "SalesForecast.findAll", query = "SELECT s FROM SalesForecast s")})
public class SalesForecast implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SALES_FORECAST_ID")
    private String salesForecastId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "QUOTA_AMOUNT")
    private BigDecimal quotaAmount;
    @Column(name = "FORECAST_AMOUNT")
    private BigDecimal forecastAmount;
    @Column(name = "BEST_CASE_AMOUNT")
    private BigDecimal bestCaseAmount;
    @Column(name = "CLOSED_AMOUNT")
    private BigDecimal closedAmount;
    @Column(name = "PERCENT_OF_QUOTA_FORECAST")
    private BigDecimal percentOfQuotaForecast;
    @Column(name = "PERCENT_OF_QUOTA_CLOSED")
    private BigDecimal percentOfQuotaClosed;
    @Column(name = "PIPELINE_AMOUNT")
    private BigDecimal pipelineAmount;
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
    @JoinColumn(name = "CUSTOM_TIME_PERIOD_ID", referencedColumnName = "CUSTOM_TIME_PERIOD_ID")
    @ManyToOne
    private CustomTimePeriod customTimePeriodId;
    @OneToMany(mappedBy = "parentSalesForecastId")
    private List<SalesForecast> salesForecastList;
    @JoinColumn(name = "PARENT_SALES_FORECAST_ID", referencedColumnName = "SALES_FORECAST_ID")
    @ManyToOne
    private SalesForecast parentSalesForecastId;
    @JoinColumn(name = "ORGANIZATION_PARTY_ID", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party organizationPartyId;
    @JoinColumn(name = "MODIFIED_BY_USER_LOGIN_ID", referencedColumnName = "USER_LOGIN_ID")
    @ManyToOne
    private UserLogin modifiedByUserLoginId;
    @JoinColumn(name = "INTERNAL_PARTY_ID", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party internalPartyId;
    @JoinColumn(name = "CURRENCY_UOM_ID", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom currencyUomId;
    @JoinColumn(name = "CREATED_BY_USER_LOGIN_ID", referencedColumnName = "USER_LOGIN_ID")
    @ManyToOne
    private UserLogin createdByUserLoginId;
    @OneToMany(mappedBy = "salesForecastId")
    private List<SalesForecastHistory> salesForecastHistoryList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "salesForecast")
    private List<SalesForecastDetail> salesForecastDetailList;
    @OneToMany(mappedBy = "salesForecastId")
    private List<SalesForecastItem> salesForecastItemList;

    public SalesForecast() {
    }

    public SalesForecast(String salesForecastId) {
        this.salesForecastId = salesForecastId;
    }

    public String getSalesForecastId() {
        return salesForecastId;
    }

    public void setSalesForecastId(String salesForecastId) {
        this.salesForecastId = salesForecastId;
    }

    public BigDecimal getQuotaAmount() {
        return quotaAmount;
    }

    public void setQuotaAmount(BigDecimal quotaAmount) {
        this.quotaAmount = quotaAmount;
    }

    public BigDecimal getForecastAmount() {
        return forecastAmount;
    }

    public void setForecastAmount(BigDecimal forecastAmount) {
        this.forecastAmount = forecastAmount;
    }

    public BigDecimal getBestCaseAmount() {
        return bestCaseAmount;
    }

    public void setBestCaseAmount(BigDecimal bestCaseAmount) {
        this.bestCaseAmount = bestCaseAmount;
    }

    public BigDecimal getClosedAmount() {
        return closedAmount;
    }

    public void setClosedAmount(BigDecimal closedAmount) {
        this.closedAmount = closedAmount;
    }

    public BigDecimal getPercentOfQuotaForecast() {
        return percentOfQuotaForecast;
    }

    public void setPercentOfQuotaForecast(BigDecimal percentOfQuotaForecast) {
        this.percentOfQuotaForecast = percentOfQuotaForecast;
    }

    public BigDecimal getPercentOfQuotaClosed() {
        return percentOfQuotaClosed;
    }

    public void setPercentOfQuotaClosed(BigDecimal percentOfQuotaClosed) {
        this.percentOfQuotaClosed = percentOfQuotaClosed;
    }

    public BigDecimal getPipelineAmount() {
        return pipelineAmount;
    }

    public void setPipelineAmount(BigDecimal pipelineAmount) {
        this.pipelineAmount = pipelineAmount;
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

    public CustomTimePeriod getCustomTimePeriodId() {
        return customTimePeriodId;
    }

    public void setCustomTimePeriodId(CustomTimePeriod customTimePeriodId) {
        this.customTimePeriodId = customTimePeriodId;
    }

    public List<SalesForecast> getSalesForecastList() {
        return salesForecastList;
    }

    public void setSalesForecastList(List<SalesForecast> salesForecastList) {
        this.salesForecastList = salesForecastList;
    }

    public SalesForecast getParentSalesForecastId() {
        return parentSalesForecastId;
    }

    public void setParentSalesForecastId(SalesForecast parentSalesForecastId) {
        this.parentSalesForecastId = parentSalesForecastId;
    }

    public Party getOrganizationPartyId() {
        return organizationPartyId;
    }

    public void setOrganizationPartyId(Party organizationPartyId) {
        this.organizationPartyId = organizationPartyId;
    }

    public UserLogin getModifiedByUserLoginId() {
        return modifiedByUserLoginId;
    }

    public void setModifiedByUserLoginId(UserLogin modifiedByUserLoginId) {
        this.modifiedByUserLoginId = modifiedByUserLoginId;
    }

    public Party getInternalPartyId() {
        return internalPartyId;
    }

    public void setInternalPartyId(Party internalPartyId) {
        this.internalPartyId = internalPartyId;
    }

    public Uom getCurrencyUomId() {
        return currencyUomId;
    }

    public void setCurrencyUomId(Uom currencyUomId) {
        this.currencyUomId = currencyUomId;
    }

    public UserLogin getCreatedByUserLoginId() {
        return createdByUserLoginId;
    }

    public void setCreatedByUserLoginId(UserLogin createdByUserLoginId) {
        this.createdByUserLoginId = createdByUserLoginId;
    }

    public List<SalesForecastHistory> getSalesForecastHistoryList() {
        return salesForecastHistoryList;
    }

    public void setSalesForecastHistoryList(List<SalesForecastHistory> salesForecastHistoryList) {
        this.salesForecastHistoryList = salesForecastHistoryList;
    }

    public List<SalesForecastDetail> getSalesForecastDetailList() {
        return salesForecastDetailList;
    }

    public void setSalesForecastDetailList(List<SalesForecastDetail> salesForecastDetailList) {
        this.salesForecastDetailList = salesForecastDetailList;
    }

    public List<SalesForecastItem> getSalesForecastItemList() {
        return salesForecastItemList;
    }

    public void setSalesForecastItemList(List<SalesForecastItem> salesForecastItemList) {
        this.salesForecastItemList = salesForecastItemList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (salesForecastId != null ? salesForecastId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SalesForecast)) {
            return false;
        }
        SalesForecast other = (SalesForecast) object;
        if ((this.salesForecastId == null && other.salesForecastId != null) || (this.salesForecastId != null && !this.salesForecastId.equals(other.salesForecastId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.SalesForecast[ salesForecastId=" + salesForecastId + " ]";
    }
    
}
