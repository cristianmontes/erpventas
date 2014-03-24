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
public class CostComponentAttributePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "COST_COMPONENT_ID")
    private String costComponentId;
    @Basic(optional = false)
    @Column(name = "ATTR_NAME")
    private String attrName;

    public CostComponentAttributePK() {
    }

    public CostComponentAttributePK(String costComponentId, String attrName) {
        this.costComponentId = costComponentId;
        this.attrName = attrName;
    }

    public String getCostComponentId() {
        return costComponentId;
    }

    public void setCostComponentId(String costComponentId) {
        this.costComponentId = costComponentId;
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
        hash += (costComponentId != null ? costComponentId.hashCode() : 0);
        hash += (attrName != null ? attrName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CostComponentAttributePK)) {
            return false;
        }
        CostComponentAttributePK other = (CostComponentAttributePK) object;
        if ((this.costComponentId == null && other.costComponentId != null) || (this.costComponentId != null && !this.costComponentId.equals(other.costComponentId))) {
            return false;
        }
        if ((this.attrName == null && other.attrName != null) || (this.attrName != null && !this.attrName.equals(other.attrName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.CostComponentAttributePK[ costComponentId=" + costComponentId + ", attrName=" + attrName + " ]";
    }
    
}
