/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class WorkEffortDeliverableProdPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "WORK_EFFORT_ID")
    private String workEffortId;
    @Basic(optional = false)
    @Column(name = "DELIVERABLE_ID")
    private String deliverableId;

    public WorkEffortDeliverableProdPK() {
    }

    public WorkEffortDeliverableProdPK(String workEffortId, String deliverableId) {
        this.workEffortId = workEffortId;
        this.deliverableId = deliverableId;
    }

    public String getWorkEffortId() {
        return workEffortId;
    }

    public void setWorkEffortId(String workEffortId) {
        this.workEffortId = workEffortId;
    }

    public String getDeliverableId() {
        return deliverableId;
    }

    public void setDeliverableId(String deliverableId) {
        this.deliverableId = deliverableId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (workEffortId != null ? workEffortId.hashCode() : 0);
        hash += (deliverableId != null ? deliverableId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WorkEffortDeliverableProdPK)) {
            return false;
        }
        WorkEffortDeliverableProdPK other = (WorkEffortDeliverableProdPK) object;
        if ((this.workEffortId == null && other.workEffortId != null) || (this.workEffortId != null && !this.workEffortId.equals(other.workEffortId))) {
            return false;
        }
        if ((this.deliverableId == null && other.deliverableId != null) || (this.deliverableId != null && !this.deliverableId.equals(other.deliverableId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.WorkEffortDeliverableProdPK[ workEffortId=" + workEffortId + ", deliverableId=" + deliverableId + " ]";
    }
    
}
