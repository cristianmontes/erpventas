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
public class WorkEffortTransBoxPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PROCESS_WORK_EFFORT_ID")
    private String processWorkEffortId;
    @Basic(optional = false)
    @Column(name = "TO_ACTIVITY_ID")
    private String toActivityId;
    @Basic(optional = false)
    @Column(name = "TRANSITION_ID")
    private String transitionId;

    public WorkEffortTransBoxPK() {
    }

    public WorkEffortTransBoxPK(String processWorkEffortId, String toActivityId, String transitionId) {
        this.processWorkEffortId = processWorkEffortId;
        this.toActivityId = toActivityId;
        this.transitionId = transitionId;
    }

    public String getProcessWorkEffortId() {
        return processWorkEffortId;
    }

    public void setProcessWorkEffortId(String processWorkEffortId) {
        this.processWorkEffortId = processWorkEffortId;
    }

    public String getToActivityId() {
        return toActivityId;
    }

    public void setToActivityId(String toActivityId) {
        this.toActivityId = toActivityId;
    }

    public String getTransitionId() {
        return transitionId;
    }

    public void setTransitionId(String transitionId) {
        this.transitionId = transitionId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (processWorkEffortId != null ? processWorkEffortId.hashCode() : 0);
        hash += (toActivityId != null ? toActivityId.hashCode() : 0);
        hash += (transitionId != null ? transitionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WorkEffortTransBoxPK)) {
            return false;
        }
        WorkEffortTransBoxPK other = (WorkEffortTransBoxPK) object;
        if ((this.processWorkEffortId == null && other.processWorkEffortId != null) || (this.processWorkEffortId != null && !this.processWorkEffortId.equals(other.processWorkEffortId))) {
            return false;
        }
        if ((this.toActivityId == null && other.toActivityId != null) || (this.toActivityId != null && !this.toActivityId.equals(other.toActivityId))) {
            return false;
        }
        if ((this.transitionId == null && other.transitionId != null) || (this.transitionId != null && !this.transitionId.equals(other.transitionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.WorkEffortTransBoxPK[ processWorkEffortId=" + processWorkEffortId + ", toActivityId=" + toActivityId + ", transitionId=" + transitionId + " ]";
    }
    
}
