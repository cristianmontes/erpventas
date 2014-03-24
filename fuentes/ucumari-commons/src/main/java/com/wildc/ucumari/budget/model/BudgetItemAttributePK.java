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
public class BudgetItemAttributePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "BUDGET_ID")
    private String budgetId;
    @Basic(optional = false)
    @Column(name = "BUDGET_ITEM_SEQ_ID")
    private String budgetItemSeqId;
    @Basic(optional = false)
    @Column(name = "ATTR_NAME")
    private String attrName;

    public BudgetItemAttributePK() {
    }

    public BudgetItemAttributePK(String budgetId, String budgetItemSeqId, String attrName) {
        this.budgetId = budgetId;
        this.budgetItemSeqId = budgetItemSeqId;
        this.attrName = attrName;
    }

    public String getBudgetId() {
        return budgetId;
    }

    public void setBudgetId(String budgetId) {
        this.budgetId = budgetId;
    }

    public String getBudgetItemSeqId() {
        return budgetItemSeqId;
    }

    public void setBudgetItemSeqId(String budgetItemSeqId) {
        this.budgetItemSeqId = budgetItemSeqId;
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
        hash += (budgetId != null ? budgetId.hashCode() : 0);
        hash += (budgetItemSeqId != null ? budgetItemSeqId.hashCode() : 0);
        hash += (attrName != null ? attrName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BudgetItemAttributePK)) {
            return false;
        }
        BudgetItemAttributePK other = (BudgetItemAttributePK) object;
        if ((this.budgetId == null && other.budgetId != null) || (this.budgetId != null && !this.budgetId.equals(other.budgetId))) {
            return false;
        }
        if ((this.budgetItemSeqId == null && other.budgetItemSeqId != null) || (this.budgetItemSeqId != null && !this.budgetItemSeqId.equals(other.budgetItemSeqId))) {
            return false;
        }
        if ((this.attrName == null && other.attrName != null) || (this.attrName != null && !this.attrName.equals(other.attrName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.BudgetItemAttributePK[ budgetId=" + budgetId + ", budgetItemSeqId=" + budgetItemSeqId + ", attrName=" + attrName + " ]";
    }
    
}
