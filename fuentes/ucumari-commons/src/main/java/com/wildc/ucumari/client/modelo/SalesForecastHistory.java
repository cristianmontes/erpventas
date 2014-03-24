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
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
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
@Table(name = "sales_forecast_history")
@NamedQueries({
    @NamedQuery(name = "SalesForecastHistory.findAll", query = "SELECT s FROM SalesForecastHistory s")})
public class SalesForecastHistory implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SALES_FORECAST_HISTORY_ID")
    private String salesForecastHistoryId;
    @Column(name = "PARENT_SALES_FORECAST_ID")
    private String parentSalesForecastId;
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
    @Lob
    @Column(name = "CHANGE_NOTE")
    private String changeNote;
    @Column(name = "MODIFIED_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedTimestamp;
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
    @JoinColumn(name = "SALES_FORECAST_ID", referencedColumnName = "SALES_FORECAST_ID")
    @ManyToOne
    private SalesForecast salesForecastId;
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

    public SalesForecastHistory() {
    }

    public SalesForecastHistory(String salesForecastHistoryId) {
        this.salesForecastHistoryId = salesForecastHistoryId;
    }

    public String getSalesForecastHistoryId() {
        return salesForecastHistoryId;
    }

    public void setSalesForecastHistoryId(String salesForecastHistoryId) {
        this.salesForecastHistoryId = salesForecastHistoryId;
    }

    public String getParentSalesForecastId() {
        return parentSalesForecastId;
    }

    public void setParentSalesForecastId(String parentSalesForecastId) {
        this.parentSalesForecastId = parentSalesForecastId;
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

    public String getChangeNote() {
        return changeNote;
    }

    public void setChangeNote(String changeNote) {
        this.changeNote = changeNote;
    }

    public Date getModifiedTimestamp() {
        return modifiedTimestamp;
    }

    public void setModifiedTimestamp(Date modifiedTimestamp) {
        this.modifiedTimestamp = modifiedTimestamp;
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

    public SalesForecast getSalesForecastId() {
        return salesForecastId;
    }

    public void setSalesForecastId(SalesForecast salesForecastId) {
        this.salesForecastId = salesForecastId;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (salesForecastHistoryId != null ? salesForecastHistoryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SalesForecastHistory)) {
            return false;
        }
        SalesForecastHistory other = (SalesForecastHistory) object;
        if ((this.salesForecastHistoryId == null && other.salesForecastHistoryId != null) || (this.salesForecastHistoryId != null && !this.salesForecastHistoryId.equals(other.salesForecastHistoryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.SalesForecastHistory[ salesForecastHistoryId=" + salesForecastHistoryId + " ]";
    }
    
}
