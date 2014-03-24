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
@Table(name = "work_effort_view_history")
@NamedQueries({
    @NamedQuery(name = "WorkEffortViewHistory.findAll", query = "SELECT w FROM WorkEffortViewHistory w")})
public class WorkEffortViewHistory implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected WorkEffortViewHistoryPK workEffortViewHistoryPK;
    @Column(name = "VIEWED_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date viewedTimestamp;
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

    public WorkEffortViewHistory() {
    }

    public WorkEffortViewHistory(WorkEffortViewHistoryPK workEffortViewHistoryPK) {
        this.workEffortViewHistoryPK = workEffortViewHistoryPK;
    }

    public WorkEffortViewHistory(String workEffortId, String userLoginId) {
        this.workEffortViewHistoryPK = new WorkEffortViewHistoryPK(workEffortId, userLoginId);
    }

    public WorkEffortViewHistoryPK getWorkEffortViewHistoryPK() {
        return workEffortViewHistoryPK;
    }

    public void setWorkEffortViewHistoryPK(WorkEffortViewHistoryPK workEffortViewHistoryPK) {
        this.workEffortViewHistoryPK = workEffortViewHistoryPK;
    }

    public Date getViewedTimestamp() {
        return viewedTimestamp;
    }

    public void setViewedTimestamp(Date viewedTimestamp) {
        this.viewedTimestamp = viewedTimestamp;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (workEffortViewHistoryPK != null ? workEffortViewHistoryPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WorkEffortViewHistory)) {
            return false;
        }
        WorkEffortViewHistory other = (WorkEffortViewHistory) object;
        if ((this.workEffortViewHistoryPK == null && other.workEffortViewHistoryPK != null) || (this.workEffortViewHistoryPK != null && !this.workEffortViewHistoryPK.equals(other.workEffortViewHistoryPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.WorkEffortViewHistory[ workEffortViewHistoryPK=" + workEffortViewHistoryPK + " ]";
    }
    
}
