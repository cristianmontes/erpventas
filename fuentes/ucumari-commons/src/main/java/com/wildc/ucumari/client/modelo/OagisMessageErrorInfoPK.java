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
public class OagisMessageErrorInfoPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "LOGICAL_ID")
    private String logicalId;
    @Basic(optional = false)
    @Column(name = "COMPONENT")
    private String component;
    @Basic(optional = false)
    @Column(name = "TASK")
    private String task;
    @Basic(optional = false)
    @Column(name = "REFERENCE_ID")
    private String referenceId;
    @Basic(optional = false)
    @Column(name = "ERROR_SEQ_ID")
    private String errorSeqId;

    public OagisMessageErrorInfoPK() {
    }

    public OagisMessageErrorInfoPK(String logicalId, String component, String task, String referenceId, String errorSeqId) {
        this.logicalId = logicalId;
        this.component = component;
        this.task = task;
        this.referenceId = referenceId;
        this.errorSeqId = errorSeqId;
    }

    public String getLogicalId() {
        return logicalId;
    }

    public void setLogicalId(String logicalId) {
        this.logicalId = logicalId;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public String getErrorSeqId() {
        return errorSeqId;
    }

    public void setErrorSeqId(String errorSeqId) {
        this.errorSeqId = errorSeqId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (logicalId != null ? logicalId.hashCode() : 0);
        hash += (component != null ? component.hashCode() : 0);
        hash += (task != null ? task.hashCode() : 0);
        hash += (referenceId != null ? referenceId.hashCode() : 0);
        hash += (errorSeqId != null ? errorSeqId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OagisMessageErrorInfoPK)) {
            return false;
        }
        OagisMessageErrorInfoPK other = (OagisMessageErrorInfoPK) object;
        if ((this.logicalId == null && other.logicalId != null) || (this.logicalId != null && !this.logicalId.equals(other.logicalId))) {
            return false;
        }
        if ((this.component == null && other.component != null) || (this.component != null && !this.component.equals(other.component))) {
            return false;
        }
        if ((this.task == null && other.task != null) || (this.task != null && !this.task.equals(other.task))) {
            return false;
        }
        if ((this.referenceId == null && other.referenceId != null) || (this.referenceId != null && !this.referenceId.equals(other.referenceId))) {
            return false;
        }
        if ((this.errorSeqId == null && other.errorSeqId != null) || (this.errorSeqId != null && !this.errorSeqId.equals(other.errorSeqId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.OagisMessageErrorInfoPK[ logicalId=" + logicalId + ", component=" + component + ", task=" + task + ", referenceId=" + referenceId + ", errorSeqId=" + errorSeqId + " ]";
    }
    
}
