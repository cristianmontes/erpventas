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

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "work_effort_cost_calc")
@NamedQueries({
    @NamedQuery(name = "WorkEffortCostCalc.findAll", query = "SELECT w FROM WorkEffortCostCalc w")})
public class WorkEffortCostCalc implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected WorkEffortCostCalcPK workEffortCostCalcPK;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
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
    @JoinColumn(name = "COST_COMPONENT_TYPE_ID", referencedColumnName = "COST_COMPONENT_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private CostComponentType costComponentType;
    @JoinColumn(name = "COST_COMPONENT_CALC_ID", referencedColumnName = "COST_COMPONENT_CALC_ID")
    @ManyToOne
    private CostComponentCalc costComponentCalcId;

    public WorkEffortCostCalc() {
    }

    public WorkEffortCostCalc(WorkEffortCostCalcPK workEffortCostCalcPK) {
        this.workEffortCostCalcPK = workEffortCostCalcPK;
    }

    public WorkEffortCostCalc(String workEffortId, String costComponentTypeId, Date fromDate) {
        this.workEffortCostCalcPK = new WorkEffortCostCalcPK(workEffortId, costComponentTypeId, fromDate);
    }

    public WorkEffortCostCalcPK getWorkEffortCostCalcPK() {
        return workEffortCostCalcPK;
    }

    public void setWorkEffortCostCalcPK(WorkEffortCostCalcPK workEffortCostCalcPK) {
        this.workEffortCostCalcPK = workEffortCostCalcPK;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
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

    public CostComponentType getCostComponentType() {
        return costComponentType;
    }

    public void setCostComponentType(CostComponentType costComponentType) {
        this.costComponentType = costComponentType;
    }

    public CostComponentCalc getCostComponentCalcId() {
        return costComponentCalcId;
    }

    public void setCostComponentCalcId(CostComponentCalc costComponentCalcId) {
        this.costComponentCalcId = costComponentCalcId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (workEffortCostCalcPK != null ? workEffortCostCalcPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WorkEffortCostCalc)) {
            return false;
        }
        WorkEffortCostCalc other = (WorkEffortCostCalc) object;
        if ((this.workEffortCostCalcPK == null && other.workEffortCostCalcPK != null) || (this.workEffortCostCalcPK != null && !this.workEffortCostCalcPK.equals(other.workEffortCostCalcPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.WorkEffortCostCalc[ workEffortCostCalcPK=" + workEffortCostCalcPK + " ]";
    }
    
}
