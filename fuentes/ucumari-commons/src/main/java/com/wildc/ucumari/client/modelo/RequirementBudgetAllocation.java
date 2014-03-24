/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.budget.model.BudgetItem;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "requirement_budget_allocation")
@NamedQueries({
    @NamedQuery(name = "RequirementBudgetAllocation.findAll", query = "SELECT r FROM RequirementBudgetAllocation r")})
public class RequirementBudgetAllocation implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RequirementBudgetAllocationPK requirementBudgetAllocationPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "AMOUNT")
    private BigDecimal amount;
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
    @JoinColumn(name = "REQUIREMENT_ID", referencedColumnName = "REQUIREMENT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Requirement requirement;
    @JoinColumns({
        @JoinColumn(name = "BUDGET_ID", referencedColumnName = "BUDGET_ID", insertable = false, updatable = false),
        @JoinColumn(name = "BUDGET_ITEM_SEQ_ID", referencedColumnName = "BUDGET_ITEM_SEQ_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private BudgetItem budgetItem;

    public RequirementBudgetAllocation() {
    }

    public RequirementBudgetAllocation(RequirementBudgetAllocationPK requirementBudgetAllocationPK) {
        this.requirementBudgetAllocationPK = requirementBudgetAllocationPK;
    }

    public RequirementBudgetAllocation(String budgetId, String budgetItemSeqId, String requirementId) {
        this.requirementBudgetAllocationPK = new RequirementBudgetAllocationPK(budgetId, budgetItemSeqId, requirementId);
    }

    public RequirementBudgetAllocationPK getRequirementBudgetAllocationPK() {
        return requirementBudgetAllocationPK;
    }

    public void setRequirementBudgetAllocationPK(RequirementBudgetAllocationPK requirementBudgetAllocationPK) {
        this.requirementBudgetAllocationPK = requirementBudgetAllocationPK;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
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

    public Requirement getRequirement() {
        return requirement;
    }

    public void setRequirement(Requirement requirement) {
        this.requirement = requirement;
    }

    public BudgetItem getBudgetItem() {
        return budgetItem;
    }

    public void setBudgetItem(BudgetItem budgetItem) {
        this.budgetItem = budgetItem;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (requirementBudgetAllocationPK != null ? requirementBudgetAllocationPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RequirementBudgetAllocation)) {
            return false;
        }
        RequirementBudgetAllocation other = (RequirementBudgetAllocation) object;
        if ((this.requirementBudgetAllocationPK == null && other.requirementBudgetAllocationPK != null) || (this.requirementBudgetAllocationPK != null && !this.requirementBudgetAllocationPK.equals(other.requirementBudgetAllocationPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.RequirementBudgetAllocation[ requirementBudgetAllocationPK=" + requirementBudgetAllocationPK + " ]";
    }
    
}
