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
public class RequirementBudgetAllocationPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "BUDGET_ID")
    private String budgetId;
    @Basic(optional = false)
    @Column(name = "BUDGET_ITEM_SEQ_ID")
    private String budgetItemSeqId;
    @Basic(optional = false)
    @Column(name = "REQUIREMENT_ID")
    private String requirementId;

    public RequirementBudgetAllocationPK() {
    }

    public RequirementBudgetAllocationPK(String budgetId, String budgetItemSeqId, String requirementId) {
        this.budgetId = budgetId;
        this.budgetItemSeqId = budgetItemSeqId;
        this.requirementId = requirementId;
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

    public String getRequirementId() {
        return requirementId;
    }

    public void setRequirementId(String requirementId) {
        this.requirementId = requirementId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (budgetId != null ? budgetId.hashCode() : 0);
        hash += (budgetItemSeqId != null ? budgetItemSeqId.hashCode() : 0);
        hash += (requirementId != null ? requirementId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RequirementBudgetAllocationPK)) {
            return false;
        }
        RequirementBudgetAllocationPK other = (RequirementBudgetAllocationPK) object;
        if ((this.budgetId == null && other.budgetId != null) || (this.budgetId != null && !this.budgetId.equals(other.budgetId))) {
            return false;
        }
        if ((this.budgetItemSeqId == null && other.budgetItemSeqId != null) || (this.budgetItemSeqId != null && !this.budgetItemSeqId.equals(other.budgetItemSeqId))) {
            return false;
        }
        if ((this.requirementId == null && other.requirementId != null) || (this.requirementId != null && !this.requirementId.equals(other.requirementId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.RequirementBudgetAllocationPK[ budgetId=" + budgetId + ", budgetItemSeqId=" + budgetItemSeqId + ", requirementId=" + requirementId + " ]";
    }
    
}
