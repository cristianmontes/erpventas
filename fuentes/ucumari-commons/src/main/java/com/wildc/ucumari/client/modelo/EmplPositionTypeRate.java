/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

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

import com.wildc.ucumari.parameters.model.PeriodType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "empl_position_type_rate")
@NamedQueries({
    @NamedQuery(name = "EmplPositionTypeRate.findAll", query = "SELECT e FROM EmplPositionTypeRate e")})
public class EmplPositionTypeRate implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EmplPositionTypeRatePK emplPositionTypeRatePK;
    @Column(name = "PAY_GRADE_ID")
    private String payGradeId;
    @Column(name = "SALARY_STEP_SEQ_ID")
    private String salaryStepSeqId;
    @Column(name = "RATE_TYPE_ID")
    private String rateTypeId;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
    @Column(name = "RATE")
    private String rate;
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
    @JoinColumn(name = "PERIOD_TYPE_ID", referencedColumnName = "PERIOD_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private PeriodType periodType;
    @JoinColumn(name = "EMPL_POSITION_TYPE_ID", referencedColumnName = "EMPL_POSITION_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private EmplPositionType emplPositionType;

    public EmplPositionTypeRate() {
    }

    public EmplPositionTypeRate(EmplPositionTypeRatePK emplPositionTypeRatePK) {
        this.emplPositionTypeRatePK = emplPositionTypeRatePK;
    }

    public EmplPositionTypeRate(String emplPositionTypeId, String periodTypeId, Date fromDate) {
        this.emplPositionTypeRatePK = new EmplPositionTypeRatePK(emplPositionTypeId, periodTypeId, fromDate);
    }

    public EmplPositionTypeRatePK getEmplPositionTypeRatePK() {
        return emplPositionTypeRatePK;
    }

    public void setEmplPositionTypeRatePK(EmplPositionTypeRatePK emplPositionTypeRatePK) {
        this.emplPositionTypeRatePK = emplPositionTypeRatePK;
    }

    public String getPayGradeId() {
        return payGradeId;
    }

    public void setPayGradeId(String payGradeId) {
        this.payGradeId = payGradeId;
    }

    public String getSalaryStepSeqId() {
        return salaryStepSeqId;
    }

    public void setSalaryStepSeqId(String salaryStepSeqId) {
        this.salaryStepSeqId = salaryStepSeqId;
    }

    public String getRateTypeId() {
        return rateTypeId;
    }

    public void setRateTypeId(String rateTypeId) {
        this.rateTypeId = rateTypeId;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
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

    public PeriodType getPeriodType() {
        return periodType;
    }

    public void setPeriodType(PeriodType periodType) {
        this.periodType = periodType;
    }

    public EmplPositionType getEmplPositionType() {
        return emplPositionType;
    }

    public void setEmplPositionType(EmplPositionType emplPositionType) {
        this.emplPositionType = emplPositionType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (emplPositionTypeRatePK != null ? emplPositionTypeRatePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmplPositionTypeRate)) {
            return false;
        }
        EmplPositionTypeRate other = (EmplPositionTypeRate) object;
        if ((this.emplPositionTypeRatePK == null && other.emplPositionTypeRatePK != null) || (this.emplPositionTypeRatePK != null && !this.emplPositionTypeRatePK.equals(other.emplPositionTypeRatePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.EmplPositionTypeRate[ emplPositionTypeRatePK=" + emplPositionTypeRatePK + " ]";
    }
    
}
