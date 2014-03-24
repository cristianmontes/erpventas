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
public class BudgetItemTypeAttrPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "BUDGET_ITEM_TYPE_ID")
    private String budgetItemTypeId;
    @Basic(optional = false)
    @Column(name = "ATTR_NAME")
    private String attrName;

    public BudgetItemTypeAttrPK() {
    }

    public BudgetItemTypeAttrPK(String budgetItemTypeId, String attrName) {
        this.budgetItemTypeId = budgetItemTypeId;
        this.attrName = attrName;
    }

    public String getBudgetItemTypeId() {
        return budgetItemTypeId;
    }

    public void setBudgetItemTypeId(String budgetItemTypeId) {
        this.budgetItemTypeId = budgetItemTypeId;
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
        hash += (budgetItemTypeId != null ? budgetItemTypeId.hashCode() : 0);
        hash += (attrName != null ? attrName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BudgetItemTypeAttrPK)) {
            return false;
        }
        BudgetItemTypeAttrPK other = (BudgetItemTypeAttrPK) object;
        if ((this.budgetItemTypeId == null && other.budgetItemTypeId != null) || (this.budgetItemTypeId != null && !this.budgetItemTypeId.equals(other.budgetItemTypeId))) {
            return false;
        }
        if ((this.attrName == null && other.attrName != null) || (this.attrName != null && !this.attrName.equals(other.attrName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.BudgetItemTypeAttrPK[ budgetItemTypeId=" + budgetItemTypeId + ", attrName=" + attrName + " ]";
    }
    
}
