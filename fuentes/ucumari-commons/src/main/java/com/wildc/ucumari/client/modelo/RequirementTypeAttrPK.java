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
public class RequirementTypeAttrPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "REQUIREMENT_TYPE_ID")
    private String requirementTypeId;
    @Basic(optional = false)
    @Column(name = "ATTR_NAME")
    private String attrName;

    public RequirementTypeAttrPK() {
    }

    public RequirementTypeAttrPK(String requirementTypeId, String attrName) {
        this.requirementTypeId = requirementTypeId;
        this.attrName = attrName;
    }

    public String getRequirementTypeId() {
        return requirementTypeId;
    }

    public void setRequirementTypeId(String requirementTypeId) {
        this.requirementTypeId = requirementTypeId;
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
        hash += (requirementTypeId != null ? requirementTypeId.hashCode() : 0);
        hash += (attrName != null ? attrName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RequirementTypeAttrPK)) {
            return false;
        }
        RequirementTypeAttrPK other = (RequirementTypeAttrPK) object;
        if ((this.requirementTypeId == null && other.requirementTypeId != null) || (this.requirementTypeId != null && !this.requirementTypeId.equals(other.requirementTypeId))) {
            return false;
        }
        if ((this.attrName == null && other.attrName != null) || (this.attrName != null && !this.attrName.equals(other.attrName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.RequirementTypeAttrPK[ requirementTypeId=" + requirementTypeId + ", attrName=" + attrName + " ]";
    }
    
}
