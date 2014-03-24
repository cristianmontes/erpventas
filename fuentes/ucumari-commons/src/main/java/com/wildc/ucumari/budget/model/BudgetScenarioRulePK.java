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
public class BudgetScenarioRulePK implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Basic(optional = false)
    @Column(name = "BUDGET_SCENARIO_ID")
    private String budgetScenarioId;
    @Basic(optional = false)
    @Column(name = "BUDGET_ITEM_TYPE_ID")
    private String budgetItemTypeId;

    public BudgetScenarioRulePK() {
    }

    public BudgetScenarioRulePK(String budgetScenarioId, String budgetItemTypeId) {
        this.budgetScenarioId = budgetScenarioId;
        this.budgetItemTypeId = budgetItemTypeId;
    }

    public String getBudgetScenarioId() {
        return budgetScenarioId;
    }

    public void setBudgetScenarioId(String budgetScenarioId) {
        this.budgetScenarioId = budgetScenarioId;
    }

    public String getBudgetItemTypeId() {
        return budgetItemTypeId;
    }

    public void setBudgetItemTypeId(String budgetItemTypeId) {
        this.budgetItemTypeId = budgetItemTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (budgetScenarioId != null ? budgetScenarioId.hashCode() : 0);
        hash += (budgetItemTypeId != null ? budgetItemTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BudgetScenarioRulePK)) {
            return false;
        }
        BudgetScenarioRulePK other = (BudgetScenarioRulePK) object;
        if ((this.budgetScenarioId == null && other.budgetScenarioId != null) || (this.budgetScenarioId != null && !this.budgetScenarioId.equals(other.budgetScenarioId))) {
            return false;
        }
        if ((this.budgetItemTypeId == null && other.budgetItemTypeId != null) || (this.budgetItemTypeId != null && !this.budgetItemTypeId.equals(other.budgetItemTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.BudgetScenarioRulePK[ budgetScenarioId=" + budgetScenarioId + ", budgetItemTypeId=" + budgetItemTypeId + " ]";
    }
    
}
