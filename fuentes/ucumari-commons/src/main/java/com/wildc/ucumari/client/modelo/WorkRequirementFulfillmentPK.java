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
public class WorkRequirementFulfillmentPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "REQUIREMENT_ID")
    private String requirementId;
    @Basic(optional = false)
    @Column(name = "WORK_EFFORT_ID")
    private String workEffortId;

    public WorkRequirementFulfillmentPK() {
    }

    public WorkRequirementFulfillmentPK(String requirementId, String workEffortId) {
        this.requirementId = requirementId;
        this.workEffortId = workEffortId;
    }

    public String getRequirementId() {
        return requirementId;
    }

    public void setRequirementId(String requirementId) {
        this.requirementId = requirementId;
    }

    public String getWorkEffortId() {
        return workEffortId;
    }

    public void setWorkEffortId(String workEffortId) {
        this.workEffortId = workEffortId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (requirementId != null ? requirementId.hashCode() : 0);
        hash += (workEffortId != null ? workEffortId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WorkRequirementFulfillmentPK)) {
            return false;
        }
        WorkRequirementFulfillmentPK other = (WorkRequirementFulfillmentPK) object;
        if ((this.requirementId == null && other.requirementId != null) || (this.requirementId != null && !this.requirementId.equals(other.requirementId))) {
            return false;
        }
        if ((this.workEffortId == null && other.workEffortId != null) || (this.workEffortId != null && !this.workEffortId.equals(other.workEffortId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.WorkRequirementFulfillmentPK[ requirementId=" + requirementId + ", workEffortId=" + workEffortId + " ]";
    }
    
}
