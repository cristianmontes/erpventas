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
public class CostComponentTypeAttrPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "COST_COMPONENT_TYPE_ID")
    private String costComponentTypeId;
    @Basic(optional = false)
    @Column(name = "ATTR_NAME")
    private String attrName;

    public CostComponentTypeAttrPK() {
    }

    public CostComponentTypeAttrPK(String costComponentTypeId, String attrName) {
        this.costComponentTypeId = costComponentTypeId;
        this.attrName = attrName;
    }

    public String getCostComponentTypeId() {
        return costComponentTypeId;
    }

    public void setCostComponentTypeId(String costComponentTypeId) {
        this.costComponentTypeId = costComponentTypeId;
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
        hash += (costComponentTypeId != null ? costComponentTypeId.hashCode() : 0);
        hash += (attrName != null ? attrName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CostComponentTypeAttrPK)) {
            return false;
        }
        CostComponentTypeAttrPK other = (CostComponentTypeAttrPK) object;
        if ((this.costComponentTypeId == null && other.costComponentTypeId != null) || (this.costComponentTypeId != null && !this.costComponentTypeId.equals(other.costComponentTypeId))) {
            return false;
        }
        if ((this.attrName == null && other.attrName != null) || (this.attrName != null && !this.attrName.equals(other.attrName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.CostComponentTypeAttrPK[ costComponentTypeId=" + costComponentTypeId + ", attrName=" + attrName + " ]";
    }
    
}
