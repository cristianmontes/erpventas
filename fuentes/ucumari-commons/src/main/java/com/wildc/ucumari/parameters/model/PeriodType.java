/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.parameters.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "period_type")
public class PeriodType implements Serializable {
    /*@OneToMany(mappedBy = "periodTypeId")
    private List<StandardTimePeriod> standardTimePeriodList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "periodType")
    private List<RateAmount> rateAmountList;
    @OneToMany(mappedBy = "periodTypeId")
    private List<PayHistory> payHistoryList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "periodType")
    private List<EmplPositionTypeRate> emplPositionTypeRateList;*/
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PERIOD_TYPE_ID")
    private String periodTypeId;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "PERIOD_LENGTH")
    private BigInteger periodLength;
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
    @JoinColumn(name = "UOM_ID", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom uomId;
    @OneToMany(mappedBy = "periodTypeId")
    private List<CustomTimePeriod> customTimePeriodList;

    public PeriodType() {
    }

    public PeriodType(String periodTypeId) {
        this.periodTypeId = periodTypeId;
    }

    public String getPeriodTypeId() {
        return periodTypeId;
    }

    public void setPeriodTypeId(String periodTypeId) {
        this.periodTypeId = periodTypeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigInteger getPeriodLength() {
        return periodLength;
    }

    public void setPeriodLength(BigInteger periodLength) {
        this.periodLength = periodLength;
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

    public Uom getUomId() {
        return uomId;
    }

    public void setUomId(Uom uomId) {
        this.uomId = uomId;
    }

    public List<CustomTimePeriod> getCustomTimePeriodList() {
        return customTimePeriodList;
    }

    public void setCustomTimePeriodList(List<CustomTimePeriod> customTimePeriodList) {
        this.customTimePeriodList = customTimePeriodList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (periodTypeId != null ? periodTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PeriodType)) {
            return false;
        }
        PeriodType other = (PeriodType) object;
        if ((this.periodTypeId == null && other.periodTypeId != null) || (this.periodTypeId != null && !this.periodTypeId.equals(other.periodTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PeriodType[ periodTypeId=" + periodTypeId + " ]";
    }
/*
    public List<EmplPositionTypeRate> getEmplPositionTypeRateList() {
        return emplPositionTypeRateList;
    }

    public void setEmplPositionTypeRateList(List<EmplPositionTypeRate> emplPositionTypeRateList) {
        this.emplPositionTypeRateList = emplPositionTypeRateList;
    }

    public List<PayHistory> getPayHistoryList() {
        return payHistoryList;
    }

    public void setPayHistoryList(List<PayHistory> payHistoryList) {
        this.payHistoryList = payHistoryList;
    }

    public List<StandardTimePeriod> getStandardTimePeriodList() {
        return standardTimePeriodList;
    }

    public void setStandardTimePeriodList(List<StandardTimePeriod> standardTimePeriodList) {
        this.standardTimePeriodList = standardTimePeriodList;
    }

    public List<RateAmount> getRateAmountList() {
        return rateAmountList;
    }

    public void setRateAmountList(List<RateAmount> rateAmountList) {
        this.rateAmountList = rateAmountList;
    }*/
    
}
