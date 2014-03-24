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
public class BudgetScenarioApplicationPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "BUDGET_SCENARIO_APPLIC_ID")
    private String budgetScenarioApplicId;
    @Basic(optional = false)
    @Column(name = "BUDGET_SCENARIO_ID")
    private String budgetScenarioId;

    public BudgetScenarioApplicationPK() {
    }

    public BudgetScenarioApplicationPK(String budgetScenarioApplicId, String budgetScenarioId) {
        this.budgetScenarioApplicId = budgetScenarioApplicId;
        this.budgetScenarioId = budgetScenarioId;
    }

    public String getBudgetScenarioApplicId() {
        return budgetScenarioApplicId;
    }

    public void setBudgetScenarioApplicId(String budgetScenarioApplicId) {
        this.budgetScenarioApplicId = budgetScenarioApplicId;
    }

    public String getBudgetScenarioId() {
        return budgetScenarioId;
    }

    public void setBudgetScenarioId(String budgetScenarioId) {
        this.budgetScenarioId = budgetScenarioId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (budgetScenarioApplicId != null ? budgetScenarioApplicId.hashCode() : 0);
        hash += (budgetScenarioId != null ? budgetScenarioId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BudgetScenarioApplicationPK)) {
            return false;
        }
        BudgetScenarioApplicationPK other = (BudgetScenarioApplicationPK) object;
        if ((this.budgetScenarioApplicId == null && other.budgetScenarioApplicId != null) || (this.budgetScenarioApplicId != null && !this.budgetScenarioApplicId.equals(other.budgetScenarioApplicId))) {
            return false;
        }
        if ((this.budgetScenarioId == null && other.budgetScenarioId != null) || (this.budgetScenarioId != null && !this.budgetScenarioId.equals(other.budgetScenarioId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.BudgetScenarioApplicationPK[ budgetScenarioApplicId=" + budgetScenarioApplicId + ", budgetScenarioId=" + budgetScenarioId + " ]";
    }
    
}
