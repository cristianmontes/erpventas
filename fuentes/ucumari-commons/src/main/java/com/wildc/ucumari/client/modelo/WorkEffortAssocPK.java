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
public class WorkEffortAssocPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "WORK_EFFORT_ID_FROM")
    private String workEffortIdFrom;
    @Basic(optional = false)
    @Column(name = "WORK_EFFORT_ID_TO")
    private String workEffortIdTo;
    @Basic(optional = false)
    @Column(name = "WORK_EFFORT_ASSOC_TYPE_ID")
    private String workEffortAssocTypeId;
    @Basic(optional = false)
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;

    public WorkEffortAssocPK() {
    }

    public WorkEffortAssocPK(String workEffortIdFrom, String workEffortIdTo, String workEffortAssocTypeId, Date fromDate) {
        this.workEffortIdFrom = workEffortIdFrom;
        this.workEffortIdTo = workEffortIdTo;
        this.workEffortAssocTypeId = workEffortAssocTypeId;
        this.fromDate = fromDate;
    }

    public String getWorkEffortIdFrom() {
        return workEffortIdFrom;
    }

    public void setWorkEffortIdFrom(String workEffortIdFrom) {
        this.workEffortIdFrom = workEffortIdFrom;
    }

    public String getWorkEffortIdTo() {
        return workEffortIdTo;
    }

    public void setWorkEffortIdTo(String workEffortIdTo) {
        this.workEffortIdTo = workEffortIdTo;
    }

    public String getWorkEffortAssocTypeId() {
        return workEffortAssocTypeId;
    }

    public void setWorkEffortAssocTypeId(String workEffortAssocTypeId) {
        this.workEffortAssocTypeId = workEffortAssocTypeId;
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
        hash += (workEffortIdFrom != null ? workEffortIdFrom.hashCode() : 0);
        hash += (workEffortIdTo != null ? workEffortIdTo.hashCode() : 0);
        hash += (workEffortAssocTypeId != null ? workEffortAssocTypeId.hashCode() : 0);
        hash += (fromDate != null ? fromDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WorkEffortAssocPK)) {
            return false;
        }
        WorkEffortAssocPK other = (WorkEffortAssocPK) object;
        if ((this.workEffortIdFrom == null && other.workEffortIdFrom != null) || (this.workEffortIdFrom != null && !this.workEffortIdFrom.equals(other.workEffortIdFrom))) {
            return false;
        }
        if ((this.workEffortIdTo == null && other.workEffortIdTo != null) || (this.workEffortIdTo != null && !this.workEffortIdTo.equals(other.workEffortIdTo))) {
            return false;
        }
        if ((this.workEffortAssocTypeId == null && other.workEffortAssocTypeId != null) || (this.workEffortAssocTypeId != null && !this.workEffortAssocTypeId.equals(other.workEffortAssocTypeId))) {
            return false;
        }
        if ((this.fromDate == null && other.fromDate != null) || (this.fromDate != null && !this.fromDate.equals(other.fromDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.WorkEffortAssocPK[ workEffortIdFrom=" + workEffortIdFrom + ", workEffortIdTo=" + workEffortIdTo + ", workEffortAssocTypeId=" + workEffortAssocTypeId + ", fromDate=" + fromDate + " ]";
    }
    
}
