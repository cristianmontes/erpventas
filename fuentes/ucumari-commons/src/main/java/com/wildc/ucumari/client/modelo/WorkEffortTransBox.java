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
@Table(name = "work_effort_trans_box")
@NamedQueries({
    @NamedQuery(name = "WorkEffortTransBox.findAll", query = "SELECT w FROM WorkEffortTransBox w")})
public class WorkEffortTransBox implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected WorkEffortTransBoxPK workEffortTransBoxPK;
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
    @JoinColumn(name = "PROCESS_WORK_EFFORT_ID", referencedColumnName = "WORK_EFFORT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private WorkEffort workEffort;

    public WorkEffortTransBox() {
    }

    public WorkEffortTransBox(WorkEffortTransBoxPK workEffortTransBoxPK) {
        this.workEffortTransBoxPK = workEffortTransBoxPK;
    }

    public WorkEffortTransBox(String processWorkEffortId, String toActivityId, String transitionId) {
        this.workEffortTransBoxPK = new WorkEffortTransBoxPK(processWorkEffortId, toActivityId, transitionId);
    }

    public WorkEffortTransBoxPK getWorkEffortTransBoxPK() {
        return workEffortTransBoxPK;
    }

    public void setWorkEffortTransBoxPK(WorkEffortTransBoxPK workEffortTransBoxPK) {
        this.workEffortTransBoxPK = workEffortTransBoxPK;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (workEffortTransBoxPK != null ? workEffortTransBoxPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WorkEffortTransBox)) {
            return false;
        }
        WorkEffortTransBox other = (WorkEffortTransBox) object;
        if ((this.workEffortTransBoxPK == null && other.workEffortTransBoxPK != null) || (this.workEffortTransBoxPK != null && !this.workEffortTransBoxPK.equals(other.workEffortTransBoxPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.WorkEffortTransBox[ workEffortTransBoxPK=" + workEffortTransBoxPK + " ]";
    }
    
}
