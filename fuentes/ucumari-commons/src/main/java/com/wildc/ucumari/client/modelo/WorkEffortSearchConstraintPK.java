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
public class WorkEffortSearchConstraintPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "WORK_EFFORT_SEARCH_RESULT_ID")
    private String workEffortSearchResultId;
    @Basic(optional = false)
    @Column(name = "CONSTRAINT_SEQ_ID")
    private String constraintSeqId;

    public WorkEffortSearchConstraintPK() {
    }

    public WorkEffortSearchConstraintPK(String workEffortSearchResultId, String constraintSeqId) {
        this.workEffortSearchResultId = workEffortSearchResultId;
        this.constraintSeqId = constraintSeqId;
    }

    public String getWorkEffortSearchResultId() {
        return workEffortSearchResultId;
    }

    public void setWorkEffortSearchResultId(String workEffortSearchResultId) {
        this.workEffortSearchResultId = workEffortSearchResultId;
    }

    public String getConstraintSeqId() {
        return constraintSeqId;
    }

    public void setConstraintSeqId(String constraintSeqId) {
        this.constraintSeqId = constraintSeqId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (workEffortSearchResultId != null ? workEffortSearchResultId.hashCode() : 0);
        hash += (constraintSeqId != null ? constraintSeqId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WorkEffortSearchConstraintPK)) {
            return false;
        }
        WorkEffortSearchConstraintPK other = (WorkEffortSearchConstraintPK) object;
        if ((this.workEffortSearchResultId == null && other.workEffortSearchResultId != null) || (this.workEffortSearchResultId != null && !this.workEffortSearchResultId.equals(other.workEffortSearchResultId))) {
            return false;
        }
        if ((this.constraintSeqId == null && other.constraintSeqId != null) || (this.constraintSeqId != null && !this.constraintSeqId.equals(other.constraintSeqId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.WorkEffortSearchConstraintPK[ workEffortSearchResultId=" + workEffortSearchResultId + ", constraintSeqId=" + constraintSeqId + " ]";
    }
    
}
