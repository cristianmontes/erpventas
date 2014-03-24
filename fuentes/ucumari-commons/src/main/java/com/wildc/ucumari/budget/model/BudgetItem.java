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
@Table(name = "budget_item")

public class BudgetItem implements Serializable {
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "budgetItem")
    private List<RequirementBudgetAllocation> requirementBudgetAllocationList;*/
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected BudgetItemPK budgetItemPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "AMOUNT")
    private BigDecimal amount;
    @Column(name = "PURPOSE")
    private String purpose;
    @Column(name = "JUSTIFICATION")
    private String justification;
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
    @JoinColumn(name = "BUDGET_ITEM_TYPE_ID", referencedColumnName = "BUDGET_ITEM_TYPE_ID")
    @ManyToOne
    private BudgetItemType budgetItemTypeId;
    @JoinColumn(name = "BUDGET_ID", referencedColumnName = "BUDGET_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Budget budget;
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "budgetItem")
    private List<BudgetItemAttribute> budgetItemAttributeList;
    @OneToMany(mappedBy = "budgetItem")
    private List<BudgetScenarioApplication> budgetScenarioApplicationList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "budgetItem")
    private List<BudgetRevisionImpact> budgetRevisionImpactList;*/

    public BudgetItem() {
    }

    public BudgetItem(BudgetItemPK budgetItemPK) {
        this.budgetItemPK = budgetItemPK;
    }

    public BudgetItem(String budgetId, String budgetItemSeqId) {
        this.budgetItemPK = new BudgetItemPK(budgetId, budgetItemSeqId);
    }

    public BudgetItemPK getBudgetItemPK() {
        return budgetItemPK;
    }

    public void setBudgetItemPK(BudgetItemPK budgetItemPK) {
        this.budgetItemPK = budgetItemPK;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getJustification() {
        return justification;
    }

    public void setJustification(String justification) {
        this.justification = justification;
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

    public BudgetItemType getBudgetItemTypeId() {
        return budgetItemTypeId;
    }

    public void setBudgetItemTypeId(BudgetItemType budgetItemTypeId) {
        this.budgetItemTypeId = budgetItemTypeId;
    }

    public Budget getBudget() {
        return budget;
    }

    public void setBudget(Budget budget) {
        this.budget = budget;
    }
/*
    public List<BudgetItemAttribute> getBudgetItemAttributeList() {
        return budgetItemAttributeList;
    }

    public void setBudgetItemAttributeList(List<BudgetItemAttribute> budgetItemAttributeList) {
        this.budgetItemAttributeList = budgetItemAttributeList;
    }

    public List<BudgetScenarioApplication> getBudgetScenarioApplicationList() {
        return budgetScenarioApplicationList;
    }

    public void setBudgetScenarioApplicationList(List<BudgetScenarioApplication> budgetScenarioApplicationList) {
        this.budgetScenarioApplicationList = budgetScenarioApplicationList;
    }

    public List<BudgetRevisionImpact> getBudgetRevisionImpactList() {
        return budgetRevisionImpactList;
    }

    public void setBudgetRevisionImpactList(List<BudgetRevisionImpact> budgetRevisionImpactList) {
        this.budgetRevisionImpactList = budgetRevisionImpactList;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (budgetItemPK != null ? budgetItemPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BudgetItem)) {
            return false;
        }
        BudgetItem other = (BudgetItem) object;
        if ((this.budgetItemPK == null && other.budgetItemPK != null) || (this.budgetItemPK != null && !this.budgetItemPK.equals(other.budgetItemPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.BudgetItem[ budgetItemPK=" + budgetItemPK + " ]";
    }
/*
    public List<RequirementBudgetAllocation> getRequirementBudgetAllocationList() {
        return requirementBudgetAllocationList;
    }

    public void setRequirementBudgetAllocationList(List<RequirementBudgetAllocation> requirementBudgetAllocationList) {
        this.requirementBudgetAllocationList = requirementBudgetAllocationList;
    }*/
    
}
