/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.parameters.model;

import java.io.Serializable;
import java.math.BigInteger;
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

import com.wildc.ucumari.party.model.Party;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "custom_time_period")
public class CustomTimePeriod implements Serializable {
    /*@OneToMany(mappedBy = "customTimePeriodId")
    private List<SalesForecast> salesForecastList;
    @OneToMany(mappedBy = "customTimePeriodId")
    private List<SalesForecastHistory> salesForecastHistoryList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customTimePeriod")
    private List<GlAccountHistory> glAccountHistoryList;*/
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CUSTOM_TIME_PERIOD_ID")
    private String customTimePeriodId;
    @Column(name = "PERIOD_NUM")
    private BigInteger periodNum;
    @Column(name = "PERIOD_NAME")
    private String periodName;
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.DATE)
    private Date fromDate;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.DATE)
    private Date thruDate;
    @Column(name = "IS_CLOSED")
    private Character isClosed;
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
    /*@OneToMany(mappedBy = "customTimePeriodId")
    private List<Budget> budgetList;*/
    @JoinColumn(name = "PERIOD_TYPE_ID", referencedColumnName = "PERIOD_TYPE_ID")
    @ManyToOne
    private PeriodType periodTypeId;
    @JoinColumn(name = "ORGANIZATION_PARTY_ID", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party organizationPartyId;
    /*@OneToMany(mappedBy = "parentPeriodId")
    private List<CustomTimePeriod> customTimePeriodList;*/
    @JoinColumn(name = "PARENT_PERIOD_ID", referencedColumnName = "CUSTOM_TIME_PERIOD_ID")
    @ManyToOne
    private CustomTimePeriod parentPeriodId;

    public CustomTimePeriod() {
    }

    public CustomTimePeriod(String customTimePeriodId) {
        this.customTimePeriodId = customTimePeriodId;
    }

    public String getCustomTimePeriodId() {
        return customTimePeriodId;
    }

    public void setCustomTimePeriodId(String customTimePeriodId) {
        this.customTimePeriodId = customTimePeriodId;
    }

    public BigInteger getPeriodNum() {
        return periodNum;
    }

    public void setPeriodNum(BigInteger periodNum) {
        this.periodNum = periodNum;
    }

    public String getPeriodName() {
        return periodName;
    }

    public void setPeriodName(String periodName) {
        this.periodName = periodName;
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

    public Character getIsClosed() {
        return isClosed;
    }

    public void setIsClosed(Character isClosed) {
        this.isClosed = isClosed;
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
    public List<Budget> getBudgetList() {
        return budgetList;
    }

    public void setBudgetList(List<Budget> budgetList) {
        this.budgetList = budgetList;
    }*/

    public PeriodType getPeriodTypeId() {
        return periodTypeId;
    }

    public void setPeriodTypeId(PeriodType periodTypeId) {
        this.periodTypeId = periodTypeId;
    }

    public Party getOrganizationPartyId() {
        return organizationPartyId;
    }

    public void setOrganizationPartyId(Party organizationPartyId) {
        this.organizationPartyId = organizationPartyId;
    }
/*
    public List<CustomTimePeriod> getCustomTimePeriodList() {
        return customTimePeriodList;
    }

    public void setCustomTimePeriodList(List<CustomTimePeriod> customTimePeriodList) {
        this.customTimePeriodList = customTimePeriodList;
    }*/

    public CustomTimePeriod getParentPeriodId() {
        return parentPeriodId;
    }

    public void setParentPeriodId(CustomTimePeriod parentPeriodId) {
        this.parentPeriodId = parentPeriodId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (customTimePeriodId != null ? customTimePeriodId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CustomTimePeriod)) {
            return false;
        }
        CustomTimePeriod other = (CustomTimePeriod) object;
        if ((this.customTimePeriodId == null && other.customTimePeriodId != null) || (this.customTimePeriodId != null && !this.customTimePeriodId.equals(other.customTimePeriodId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.CustomTimePeriod[ customTimePeriodId=" + customTimePeriodId + " ]";
    }
/*
    public List<GlAccountHistory> getGlAccountHistoryList() {
        return glAccountHistoryList;
    }

    public void setGlAccountHistoryList(List<GlAccountHistory> glAccountHistoryList) {
        this.glAccountHistoryList = glAccountHistoryList;
    }

    public List<SalesForecast> getSalesForecastList() {
        return salesForecastList;
    }

    public void setSalesForecastList(List<SalesForecast> salesForecastList) {
        this.salesForecastList = salesForecastList;
    }

    public List<SalesForecastHistory> getSalesForecastHistoryList() {
        return salesForecastHistoryList;
    }

    public void setSalesForecastHistoryList(List<SalesForecastHistory> salesForecastHistoryList) {
        this.salesForecastHistoryList = salesForecastHistoryList;
    }*/
    
}
