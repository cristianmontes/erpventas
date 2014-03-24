/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Embeddable
public class RateAmountPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "RATE_TYPE_ID")
    private String rateTypeId;
    @Basic(optional = false)
    @Column(name = "RATE_CURRENCY_UOM_ID")
    private String rateCurrencyUomId;
    @Basic(optional = false)
    @Column(name = "PERIOD_TYPE_ID")
    private String periodTypeId;
    @Basic(optional = false)
    @Column(name = "WORK_EFFORT_ID")
    private String workEffortId;
    @Basic(optional = false)
    @Column(name = "PARTY_ID")
    private String partyId;
    @Basic(optional = false)
    @Column(name = "EMPL_POSITION_TYPE_ID")
    private String emplPositionTypeId;
    @Basic(optional = false)
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;

    public RateAmountPK() {
    }

    public RateAmountPK(String rateTypeId, String rateCurrencyUomId, String periodTypeId, String workEffortId, String partyId, String emplPositionTypeId, Date fromDate) {
        this.rateTypeId = rateTypeId;
        this.rateCurrencyUomId = rateCurrencyUomId;
        this.periodTypeId = periodTypeId;
        this.workEffortId = workEffortId;
        this.partyId = partyId;
        this.emplPositionTypeId = emplPositionTypeId;
        this.fromDate = fromDate;
    }

    public String getRateTypeId() {
        return rateTypeId;
    }

    public void setRateTypeId(String rateTypeId) {
        this.rateTypeId = rateTypeId;
    }

    public String getRateCurrencyUomId() {
        return rateCurrencyUomId;
    }

    public void setRateCurrencyUomId(String rateCurrencyUomId) {
        this.rateCurrencyUomId = rateCurrencyUomId;
    }

    public String getPeriodTypeId() {
        return periodTypeId;
    }

    public void setPeriodTypeId(String periodTypeId) {
        this.periodTypeId = periodTypeId;
    }

    public String getWorkEffortId() {
        return workEffortId;
    }

    public void setWorkEffortId(String workEffortId) {
        this.workEffortId = workEffortId;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public String getEmplPositionTypeId() {
        return emplPositionTypeId;
    }

    public void setEmplPositionTypeId(String emplPositionTypeId) {
        this.emplPositionTypeId = emplPositionTypeId;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rateTypeId != null ? rateTypeId.hashCode() : 0);
        hash += (rateCurrencyUomId != null ? rateCurrencyUomId.hashCode() : 0);
        hash += (periodTypeId != null ? periodTypeId.hashCode() : 0);
        hash += (workEffortId != null ? workEffortId.hashCode() : 0);
        hash += (partyId != null ? partyId.hashCode() : 0);
        hash += (emplPositionTypeId != null ? emplPositionTypeId.hashCode() : 0);
        hash += (fromDate != null ? fromDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RateAmountPK)) {
            return false;
        }
        RateAmountPK other = (RateAmountPK) object;
        if ((this.rateTypeId == null && other.rateTypeId != null) || (this.rateTypeId != null && !this.rateTypeId.equals(other.rateTypeId))) {
            return false;
        }
        if ((this.rateCurrencyUomId == null && other.rateCurrencyUomId != null) || (this.rateCurrencyUomId != null && !this.rateCurrencyUomId.equals(other.rateCurrencyUomId))) {
            return false;
        }
        if ((this.periodTypeId == null && other.periodTypeId != null) || (this.periodTypeId != null && !this.periodTypeId.equals(other.periodTypeId))) {
            return false;
        }
        if ((this.workEffortId == null && other.workEffortId != null) || (this.workEffortId != null && !this.workEffortId.equals(other.workEffortId))) {
            return false;
        }
        if ((this.partyId == null && other.partyId != null) || (this.partyId != null && !this.partyId.equals(other.partyId))) {
            return false;
        }
        if ((this.emplPositionTypeId == null && other.emplPositionTypeId != null) || (this.emplPositionTypeId != null && !this.emplPositionTypeId.equals(other.emplPositionTypeId))) {
            return false;
        }
        if ((this.fromDate == null && other.fromDate != null) || (this.fromDate != null && !this.fromDate.equals(other.fromDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.RateAmountPK[ rateTypeId=" + rateTypeId + ", rateCurrencyUomId=" + rateCurrencyUomId + ", periodTypeId=" + periodTypeId + ", workEffortId=" + workEffortId + ", partyId=" + partyId + ", emplPositionTypeId=" + emplPositionTypeId + ", fromDate=" + fromDate + " ]";
    }
    
}
