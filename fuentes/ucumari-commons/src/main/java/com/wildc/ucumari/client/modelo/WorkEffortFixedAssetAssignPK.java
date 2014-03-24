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
public class WorkEffortFixedAssetAssignPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "WORK_EFFORT_ID")
    private String workEffortId;
    @Basic(optional = false)
    @Column(name = "FIXED_ASSET_ID")
    private String fixedAssetId;
    @Basic(optional = false)
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;

    public WorkEffortFixedAssetAssignPK() {
    }

    public WorkEffortFixedAssetAssignPK(String workEffortId, String fixedAssetId, Date fromDate) {
        this.workEffortId = workEffortId;
        this.fixedAssetId = fixedAssetId;
        this.fromDate = fromDate;
    }

    public String getWorkEffortId() {
        return workEffortId;
    }

    public void setWorkEffortId(String workEffortId) {
        this.workEffortId = workEffortId;
    }

    public String getFixedAssetId() {
        return fixedAssetId;
    }

    public void setFixedAssetId(String fixedAssetId) {
        this.fixedAssetId = fixedAssetId;
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
        hash += (fixedAssetId != null ? fixedAssetId.hashCode() : 0);
        hash += (fromDate != null ? fromDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WorkEffortFixedAssetAssignPK)) {
            return false;
        }
        WorkEffortFixedAssetAssignPK other = (WorkEffortFixedAssetAssignPK) object;
        if ((this.workEffortId == null && other.workEffortId != null) || (this.workEffortId != null && !this.workEffortId.equals(other.workEffortId))) {
            return false;
        }
        if ((this.fixedAssetId == null && other.fixedAssetId != null) || (this.fixedAssetId != null && !this.fixedAssetId.equals(other.fixedAssetId))) {
            return false;
        }
        if ((this.fromDate == null && other.fromDate != null) || (this.fromDate != null && !this.fromDate.equals(other.fromDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.WorkEffortFixedAssetAssignPK[ workEffortId=" + workEffortId + ", fixedAssetId=" + fixedAssetId + ", fromDate=" + fromDate + " ]";
    }
    
}
