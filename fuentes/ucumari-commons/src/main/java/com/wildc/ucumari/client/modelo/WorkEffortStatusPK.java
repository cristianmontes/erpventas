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
public class WorkEffortStatusPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "WORK_EFFORT_ID")
    private String workEffortId;
    @Basic(optional = false)
    @Column(name = "STATUS_ID")
    private String statusId;
    @Basic(optional = false)
    @Column(name = "STATUS_DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date statusDatetime;

    public WorkEffortStatusPK() {
    }

    public WorkEffortStatusPK(String workEffortId, String statusId, Date statusDatetime) {
        this.workEffortId = workEffortId;
        this.statusId = statusId;
        this.statusDatetime = statusDatetime;
    }

    public String getWorkEffortId() {
        return workEffortId;
    }

    public void setWorkEffortId(String workEffortId) {
        this.workEffortId = workEffortId;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public Date getStatusDatetime() {
        return statusDatetime;
    }

    public void setStatusDatetime(Date statusDatetime) {
        this.statusDatetime = statusDatetime;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (workEffortId != null ? workEffortId.hashCode() : 0);
        hash += (statusId != null ? statusId.hashCode() : 0);
        hash += (statusDatetime != null ? statusDatetime.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WorkEffortStatusPK)) {
            return false;
        }
        WorkEffortStatusPK other = (WorkEffortStatusPK) object;
        if ((this.workEffortId == null && other.workEffortId != null) || (this.workEffortId != null && !this.workEffortId.equals(other.workEffortId))) {
            return false;
        }
        if ((this.statusId == null && other.statusId != null) || (this.statusId != null && !this.statusId.equals(other.statusId))) {
            return false;
        }
        if ((this.statusDatetime == null && other.statusDatetime != null) || (this.statusDatetime != null && !this.statusDatetime.equals(other.statusDatetime))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.WorkEffortStatusPK[ workEffortId=" + workEffortId + ", statusId=" + statusId + ", statusDatetime=" + statusDatetime + " ]";
    }
    
}
