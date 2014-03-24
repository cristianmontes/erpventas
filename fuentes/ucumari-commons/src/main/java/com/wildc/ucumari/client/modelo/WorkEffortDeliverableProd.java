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
@Table(name = "work_effort_deliverable_prod")
@NamedQueries({
    @NamedQuery(name = "WorkEffortDeliverableProd.findAll", query = "SELECT w FROM WorkEffortDeliverableProd w")})
public class WorkEffortDeliverableProd implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected WorkEffortDeliverableProdPK workEffortDeliverableProdPK;
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
    @JoinColumn(name = "DELIVERABLE_ID", referencedColumnName = "DELIVERABLE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Deliverable deliverable;

    public WorkEffortDeliverableProd() {
    }

    public WorkEffortDeliverableProd(WorkEffortDeliverableProdPK workEffortDeliverableProdPK) {
        this.workEffortDeliverableProdPK = workEffortDeliverableProdPK;
    }

    public WorkEffortDeliverableProd(String workEffortId, String deliverableId) {
        this.workEffortDeliverableProdPK = new WorkEffortDeliverableProdPK(workEffortId, deliverableId);
    }

    public WorkEffortDeliverableProdPK getWorkEffortDeliverableProdPK() {
        return workEffortDeliverableProdPK;
    }

    public void setWorkEffortDeliverableProdPK(WorkEffortDeliverableProdPK workEffortDeliverableProdPK) {
        this.workEffortDeliverableProdPK = workEffortDeliverableProdPK;
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

    public Deliverable getDeliverable() {
        return deliverable;
    }

    public void setDeliverable(Deliverable deliverable) {
        this.deliverable = deliverable;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (workEffortDeliverableProdPK != null ? workEffortDeliverableProdPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WorkEffortDeliverableProd)) {
            return false;
        }
        WorkEffortDeliverableProd other = (WorkEffortDeliverableProd) object;
        if ((this.workEffortDeliverableProdPK == null && other.workEffortDeliverableProdPK != null) || (this.workEffortDeliverableProdPK != null && !this.workEffortDeliverableProdPK.equals(other.workEffortDeliverableProdPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.WorkEffortDeliverableProd[ workEffortDeliverableProdPK=" + workEffortDeliverableProdPK + " ]";
    }
    
}
