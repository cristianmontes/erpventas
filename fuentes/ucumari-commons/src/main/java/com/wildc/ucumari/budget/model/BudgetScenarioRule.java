/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.budget.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "budget_scenario_rule")
public class BudgetScenarioRule implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected BudgetScenarioRulePK budgetScenarioRulePK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "AMOUNT_CHANGE")
    private BigDecimal amountChange;
    @Column(name = "PERCENTAGE_CHANGE")
    private BigDecimal percentageChange;
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
    @JoinColumn(name = "BUDGET_SCENARIO_ID", referencedColumnName = "BUDGET_SCENARIO_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private BudgetScenario budgetScenario;
    @JoinColumn(name = "BUDGET_ITEM_TYPE_ID", referencedColumnName = "BUDGET_ITEM_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private BudgetItemType budgetItemType;

    public BudgetScenarioRule() {
    }

    public BudgetScenarioRule(BudgetScenarioRulePK budgetScenarioRulePK) {
        this.budgetScenarioRulePK = budgetScenarioRulePK;
    }

    public BudgetScenarioRule(String budgetScenarioId, String budgetItemTypeId) {
        this.budgetScenarioRulePK = new BudgetScenarioRulePK(budgetScenarioId, budgetItemTypeId);
    }

    public BudgetScenarioRulePK getBudgetScenarioRulePK() {
        return budgetScenarioRulePK;
    }

    public void setBudgetScenarioRulePK(BudgetScenarioRulePK budgetScenarioRulePK) {
        this.budgetScenarioRulePK = budgetScenarioRulePK;
    }

    public BigDecimal getAmountChange() {
        return amountChange;
    }

    public void setAmountChange(BigDecimal amountChange) {
        this.amountChange = amountChange;
    }

    public BigDecimal getPercentageChange() {
        return percentageChange;
    }

    public void setPercentageChange(BigDecimal percentageChange) {
        this.percentageChange = percentageChange;
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

    public BudgetScenario getBudgetScenario() {
        return budgetScenario;
    }

    public void setBudgetScenario(BudgetScenario budgetScenario) {
        this.budgetScenario = budgetScenario;
    }

    public BudgetItemType getBudgetItemType() {
        return budgetItemType;
    }

    public void setBudgetItemType(BudgetItemType budgetItemType) {
        this.budgetItemType = budgetItemType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (budgetScenarioRulePK != null ? budgetScenarioRulePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BudgetScenarioRule)) {
            return false;
        }
        BudgetScenarioRule other = (BudgetScenarioRule) object;
        if ((this.budgetScenarioRulePK == null && other.budgetScenarioRulePK != null) || (this.budgetScenarioRulePK != null && !this.budgetScenarioRulePK.equals(other.budgetScenarioRulePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.BudgetScenarioRule[ budgetScenarioRulePK=" + budgetScenarioRulePK + " ]";
    }
    
}
