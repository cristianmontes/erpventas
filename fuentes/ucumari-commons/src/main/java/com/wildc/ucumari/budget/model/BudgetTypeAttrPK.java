/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.budget.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class BudgetTypeAttrPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "BUDGET_TYPE_ID")
    private String budgetTypeId;
    @Basic(optional = false)
    @Column(name = "ATTR_NAME")
    private String attrName;

    public BudgetTypeAttrPK() {
    }

    public BudgetTypeAttrPK(String budgetTypeId, String attrName) {
        this.budgetTypeId = budgetTypeId;
        this.attrName = attrName;
    }

    public String getBudgetTypeId() {
        return budgetTypeId;
    }

    public void setBudgetTypeId(String budgetTypeId) {
        this.budgetTypeId = budgetTypeId;
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
        hash += (budgetTypeId != null ? budgetTypeId.hashCode() : 0);
        hash += (attrName != null ? attrName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BudgetTypeAttrPK)) {
            return false;
        }
        BudgetTypeAttrPK other = (BudgetTypeAttrPK) object;
        if ((this.budgetTypeId == null && other.budgetTypeId != null) || (this.budgetTypeId != null && !this.budgetTypeId.equals(other.budgetTypeId))) {
            return false;
        }
        if ((this.attrName == null && other.attrName != null) || (this.attrName != null && !this.attrName.equals(other.attrName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.BudgetTypeAttrPK[ budgetTypeId=" + budgetTypeId + ", attrName=" + attrName + " ]";
    }
    
}
