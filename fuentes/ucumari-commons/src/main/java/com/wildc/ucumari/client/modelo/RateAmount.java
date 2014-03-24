/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import com.wildc.ucumari.parameters.model.PeriodType;
import com.wildc.ucumari.parameters.model.Uom;
import com.wildc.ucumari.party.model.Party;
import java.io.Serializable;
import java.math.BigDecimal;
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

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "rate_amount")
@NamedQueries({
    @NamedQuery(name = "RateAmount.findAll", query = "SELECT r FROM RateAmount r")})
public class RateAmount implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RateAmountPK rateAmountPK;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "RATE_AMOUNT")
    private BigDecimal rateAmount;
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
    @JoinColumn(name = "WORK_EFFORT_ID", referencedColumnName = "WORK_EFFORT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private WorkEffort workEffort;
    @JoinColumn(name = "RATE_TYPE_ID", referencedColumnName = "RATE_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private RateType rateType;
    @JoinColumn(name = "RATE_CURRENCY_UOM_ID", referencedColumnName = "UOM_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Uom uom;
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Party party;
    @JoinColumn(name = "PERIOD_TYPE_ID", referencedColumnName = "PERIOD_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private PeriodType periodType;
    @JoinColumn(name = "EMPL_POSITION_TYPE_ID", referencedColumnName = "EMPL_POSITION_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private EmplPositionType emplPositionType;

    public RateAmount() {
    }

    public RateAmount(RateAmountPK rateAmountPK) {
        this.rateAmountPK = rateAmountPK;
    }

    public RateAmount(String rateTypeId, String rateCurrencyUomId, String periodTypeId, String workEffortId, String partyId, String emplPositionTypeId, Date fromDate) {
        this.rateAmountPK = new RateAmountPK(rateTypeId, rateCurrencyUomId, periodTypeId, workEffortId, partyId, emplPositionTypeId, fromDate);
    }

    public RateAmountPK getRateAmountPK() {
        return rateAmountPK;
    }

    public void setRateAmountPK(RateAmountPK rateAmountPK) {
        this.rateAmountPK = rateAmountPK;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
    }

    public BigDecimal getRateAmount() {
        return rateAmount;
    }

    public void setRateAmount(BigDecimal rateAmount) {
        this.rateAmount = rateAmount;
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

    public WorkEffort getWorkEffort() {
        return workEffort;
    }

    public void setWorkEffort(WorkEffort workEffort) {
        this.workEffort = workEffort;
    }

    public RateType getRateType() {
        return rateType;
    }

    public void setRateType(RateType rateType) {
        this.rateType = rateType;
    }

    public Uom getUom() {
        return uom;
    }

    public void setUom(Uom uom) {
        this.uom = uom;
    }

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
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
        hash += (rateAmountPK != null ? rateAmountPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RateAmount)) {
            return false;
        }
        RateAmount other = (RateAmount) object;
        if ((this.rateAmountPK == null && other.rateAmountPK != null) || (this.rateAmountPK != null && !this.rateAmountPK.equals(other.rateAmountPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.RateAmount[ rateAmountPK=" + rateAmountPK + " ]";
    }
    
}
