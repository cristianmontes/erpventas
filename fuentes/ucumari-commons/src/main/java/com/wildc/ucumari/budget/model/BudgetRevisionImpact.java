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
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "budget_revision_impact")
public class BudgetRevisionImpact implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected BudgetRevisionImpactPK budgetRevisionImpactPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "REVISED_AMOUNT")
    private BigDecimal revisedAmount;
    @Column(name = "ADD_DELETE_FLAG")
    private Character addDeleteFlag;
    @Column(name = "REVISION_REASON")
    private String revisionReason;
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
    @JoinColumns({
        @JoinColumn(name = "BUDGET_ID", referencedColumnName = "BUDGET_ID", insertable = false, updatable = false),
        @JoinColumn(name = "REVISION_SEQ_ID", referencedColumnName = "REVISION_SEQ_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private BudgetRevision budgetRevision;
    @JoinColumns({
        @JoinColumn(name = "BUDGET_ID", referencedColumnName = "BUDGET_ID", insertable = false, updatable = false),
        @JoinColumn(name = "BUDGET_ITEM_SEQ_ID", referencedColumnName = "BUDGET_ITEM_SEQ_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private BudgetItem budgetItem;
    @JoinColumn(name = "BUDGET_ID", referencedColumnName = "BUDGET_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Budget budget;

    public BudgetRevisionImpact() {
    }

    public BudgetRevisionImpact(BudgetRevisionImpactPK budgetRevisionImpactPK) {
        this.budgetRevisionImpactPK = budgetRevisionImpactPK;
    }

    public BudgetRevisionImpact(String budgetId, String budgetItemSeqId, String revisionSeqId) {
        this.budgetRevisionImpactPK = new BudgetRevisionImpactPK(budgetId, budgetItemSeqId, revisionSeqId);
    }

    public BudgetRevisionImpactPK getBudgetRevisionImpactPK() {
        return budgetRevisionImpactPK;
    }

    public void setBudgetRevisionImpactPK(BudgetRevisionImpactPK budgetRevisionImpactPK) {
        this.budgetRevisionImpactPK = budgetRevisionImpactPK;
    }

    public BigDecimal getRevisedAmount() {
        return revisedAmount;
    }

    public void setRevisedAmount(BigDecimal revisedAmount) {
        this.revisedAmount = revisedAmount;
    }

    public Character getAddDeleteFlag() {
        return addDeleteFlag;
    }

    public void setAddDeleteFlag(Character addDeleteFlag) {
        this.addDeleteFlag = addDeleteFlag;
    }

    public String getRevisionReason() {
        return revisionReason;
    }

    public void setRevisionReason(String revisionReason) {
        this.revisionReason = revisionReason;
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

    public BudgetRevision getBudgetRevision() {
        return budgetRevision;
    }

    public void setBudgetRevision(BudgetRevision budgetRevision) {
        this.budgetRevision = budgetRevision;
    }

    public BudgetItem getBudgetItem() {
        return budgetItem;
    }

    public void setBudgetItem(BudgetItem budgetItem) {
        this.budgetItem = budgetItem;
    }

    public Budget getBudget() {
        return budget;
    }

    public void setBudget(Budget budget) {
        this.budget = budget;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (budgetRevisionImpactPK != null ? budgetRevisionImpactPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BudgetRevisionImpact)) {
            return false;
        }
        BudgetRevisionImpact other = (BudgetRevisionImpact) object;
        if ((this.budgetRevisionImpactPK == null && other.budgetRevisionImpactPK != null) || (this.budgetRevisionImpactPK != null && !this.budgetRevisionImpactPK.equals(other.budgetRevisionImpactPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.BudgetRevisionImpact[ budgetRevisionImpactPK=" + budgetRevisionImpactPK + " ]";
    }
    
}
