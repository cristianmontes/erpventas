/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

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
@Table(name = "work_effort_assignment_rate")
@NamedQueries({
    @NamedQuery(name = "WorkEffortAssignmentRate.findAll", query = "SELECT w FROM WorkEffortAssignmentRate w")})
public class WorkEffortAssignmentRate implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected WorkEffortAssignmentRatePK workEffortAssignmentRatePK;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "RATE")
    private BigDecimal rate;
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
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Party party;

    public WorkEffortAssignmentRate() {
    }

    public WorkEffortAssignmentRate(WorkEffortAssignmentRatePK workEffortAssignmentRatePK) {
        this.workEffortAssignmentRatePK = workEffortAssignmentRatePK;
    }

    public WorkEffortAssignmentRate(String workEffortId, String rateTypeId, String partyId, Date fromDate) {
        this.workEffortAssignmentRatePK = new WorkEffortAssignmentRatePK(workEffortId, rateTypeId, partyId, fromDate);
    }

    public WorkEffortAssignmentRatePK getWorkEffortAssignmentRatePK() {
        return workEffortAssignmentRatePK;
    }

    public void setWorkEffortAssignmentRatePK(WorkEffortAssignmentRatePK workEffortAssignmentRatePK) {
        this.workEffortAssignmentRatePK = workEffortAssignmentRatePK;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
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

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (workEffortAssignmentRatePK != null ? workEffortAssignmentRatePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WorkEffortAssignmentRate)) {
            return false;
        }
        WorkEffortAssignmentRate other = (WorkEffortAssignmentRate) object;
        if ((this.workEffortAssignmentRatePK == null && other.workEffortAssignmentRatePK != null) || (this.workEffortAssignmentRatePK != null && !this.workEffortAssignmentRatePK.equals(other.workEffortAssignmentRatePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.WorkEffortAssignmentRate[ workEffortAssignmentRatePK=" + workEffortAssignmentRatePK + " ]";
    }
    
}
