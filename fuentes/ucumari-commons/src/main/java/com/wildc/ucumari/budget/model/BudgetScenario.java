/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.budget.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "budget_scenario")
public class BudgetScenario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "BUDGET_SCENARIO_ID")
    private String budgetScenarioId;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "LAST_UPDATED_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdatedStamp;
    @Column(name = "LAST_UPDATED_TX_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdatedTxStamp;
    @Column(name = "CREATED_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdStamp;
    @Column(name = "CREATED_TX_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdTxStamp;
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "budgetScenario")
    private List<BudgetScenarioApplication> budgetScenarioApplicationList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "budgetScenario")
    private List<BudgetScenarioRule> budgetScenarioRuleList;*/

    public BudgetScenario() {
    }

    public BudgetScenario(String budgetScenarioId) {
        this.budgetScenarioId = budgetScenarioId;
    }

    public String getBudgetScenarioId() {
        return budgetScenarioId;
    }

    public void setBudgetScenarioId(String budgetScenarioId) {
        this.budgetScenarioId = budgetScenarioId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getLastUpdatedStamp() {
        return lastUpdatedStamp;
    }

    public void setLastUpdatedStamp(Date lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }

    public Date getLastUpdatedTxStamp() {
        return lastUpdatedTxStamp;
    }

    public void setLastUpdatedTxStamp(Date lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }

    public Date getCreatedStamp() {
        return createdStamp;
    }

    public void setCreatedStamp(Date createdStamp) {
        this.createdStamp = createdStamp;
    }

    public Date getCreatedTxStamp() {
        return createdTxStamp;
    }

    public void setCreatedTxStamp(Date createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }
/*
    public List<BudgetScenarioApplication> getBudgetScenarioApplicationList() {
        return budgetScenarioApplicationList;
    }

    public void setBudgetScenarioApplicationList(List<BudgetScenarioApplication> budgetScenarioApplicationList) {
        this.budgetScenarioApplicationList = budgetScenarioApplicationList;
    }

    public List<BudgetScenarioRule> getBudgetScenarioRuleList() {
        return budgetScenarioRuleList;
    }

    public void setBudgetScenarioRuleList(List<BudgetScenarioRule> budgetScenarioRuleList) {
        this.budgetScenarioRuleList = budgetScenarioRuleList;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (budgetScenarioId != null ? budgetScenarioId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BudgetScenario)) {
            return false;
        }
        BudgetScenario other = (BudgetScenario) object;
        if ((this.budgetScenarioId == null && other.budgetScenarioId != null) || (this.budgetScenarioId != null && !this.budgetScenarioId.equals(other.budgetScenarioId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.BudgetScenario[ budgetScenarioId=" + budgetScenarioId + " ]";
    }
    
}
