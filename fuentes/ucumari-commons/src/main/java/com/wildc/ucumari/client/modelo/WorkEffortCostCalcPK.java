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
public class WorkEffortCostCalcPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "WORK_EFFORT_ID")
    private String workEffortId;
    @Basic(optional = false)
    @Column(name = "COST_COMPONENT_TYPE_ID")
    private String costComponentTypeId;
    @Basic(optional = false)
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;

    public WorkEffortCostCalcPK() {
    }

    public WorkEffortCostCalcPK(String workEffortId, String costComponentTypeId, Date fromDate) {
        this.workEffortId = workEffortId;
        this.costComponentTypeId = costComponentTypeId;
        this.fromDate = fromDate;
    }

    public String getWorkEffortId() {
        return workEffortId;
    }

    public void setWorkEffortId(String workEffortId) {
        this.workEffortId = workEffortId;
    }

    public String getCostComponentTypeId() {
        return costComponentTypeId;
    }

    public void setCostComponentTypeId(String costComponentTypeId) {
        this.costComponentTypeId = costComponentTypeId;
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
        hash += (workEffortId != null ? workEffortId.hashCode() : 0);
        hash += (costComponentTypeId != null ? costComponentTypeId.hashCode() : 0);
        hash += (fromDate != null ? fromDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WorkEffortCostCalcPK)) {
            return false;
        }
        WorkEffortCostCalcPK other = (WorkEffortCostCalcPK) object;
        if ((this.workEffortId == null && other.workEffortId != null) || (this.workEffortId != null && !this.workEffortId.equals(other.workEffortId))) {
            return false;
        }
        if ((this.costComponentTypeId == null && other.costComponentTypeId != null) || (this.costComponentTypeId != null && !this.costComponentTypeId.equals(other.costComponentTypeId))) {
            return false;
        }
        if ((this.fromDate == null && other.fromDate != null) || (this.fromDate != null && !this.fromDate.equals(other.fromDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.WorkEffortCostCalcPK[ workEffortId=" + workEffortId + ", costComponentTypeId=" + costComponentTypeId + ", fromDate=" + fromDate + " ]";
    }
    
}
