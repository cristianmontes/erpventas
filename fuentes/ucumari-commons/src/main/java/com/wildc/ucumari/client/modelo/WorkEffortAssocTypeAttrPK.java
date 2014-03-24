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
public class WorkEffortAssocTypeAttrPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "WORK_EFFORT_ASSOC_TYPE_ID")
    private String workEffortAssocTypeId;
    @Basic(optional = false)
    @Column(name = "ATTR_NAME")
    private String attrName;

    public WorkEffortAssocTypeAttrPK() {
    }

    public WorkEffortAssocTypeAttrPK(String workEffortAssocTypeId, String attrName) {
        this.workEffortAssocTypeId = workEffortAssocTypeId;
        this.attrName = attrName;
    }

    public String getWorkEffortAssocTypeId() {
        return workEffortAssocTypeId;
    }

    public void setWorkEffortAssocTypeId(String workEffortAssocTypeId) {
        this.workEffortAssocTypeId = workEffortAssocTypeId;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (workEffortAssocTypeId != null ? workEffortAssocTypeId.hashCode() : 0);
        hash += (attrName != null ? attrName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WorkEffortAssocTypeAttrPK)) {
            return false;
        }
        WorkEffortAssocTypeAttrPK other = (WorkEffortAssocTypeAttrPK) object;
        if ((this.workEffortAssocTypeId == null && other.workEffortAssocTypeId != null) || (this.workEffortAssocTypeId != null && !this.workEffortAssocTypeId.equals(other.workEffortAssocTypeId))) {
            return false;
        }
        if ((this.attrName == null && other.attrName != null) || (this.attrName != null && !this.attrName.equals(other.attrName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.WorkEffortAssocTypeAttrPK[ workEffortAssocTypeId=" + workEffortAssocTypeId + ", attrName=" + attrName + " ]";
    }
    
}
