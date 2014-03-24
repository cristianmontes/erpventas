/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.budget.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.party.model.Party;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "budget_review")
public class BudgetReview implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected BudgetReviewPK budgetReviewPK;
    @Column(name = "REVIEW_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date reviewDate;
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
    @JoinColumn(name = "BUDGET_REVIEW_RESULT_TYPE_ID", referencedColumnName = "BUDGET_REVIEW_RESULT_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private BudgetReviewResultType budgetReviewResultType;
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Party party;
    @JoinColumn(name = "BUDGET_ID", referencedColumnName = "BUDGET_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Budget budget;

    public BudgetReview() {
    }

    public BudgetReview(BudgetReviewPK budgetReviewPK) {
        this.budgetReviewPK = budgetReviewPK;
    }

    public BudgetReview(String budgetId, String budgetReviewId, String partyId, String budgetReviewResultTypeId) {
        this.budgetReviewPK = new BudgetReviewPK(budgetId, budgetReviewId, partyId, budgetReviewResultTypeId);
    }

    public BudgetReviewPK getBudgetReviewPK() {
        return budgetReviewPK;
    }

    public void setBudgetReviewPK(BudgetReviewPK budgetReviewPK) {
        this.budgetReviewPK = budgetReviewPK;
    }

    public Date getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(Date reviewDate) {
        this.reviewDate = reviewDate;
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

    public BudgetReviewResultType getBudgetReviewResultType() {
        return budgetReviewResultType;
    }

    public void setBudgetReviewResultType(BudgetReviewResultType budgetReviewResultType) {
        this.budgetReviewResultType = budgetReviewResultType;
    }

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
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
        hash += (budgetReviewPK != null ? budgetReviewPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BudgetReview)) {
            return false;
        }
        BudgetReview other = (BudgetReview) object;
        if ((this.budgetReviewPK == null && other.budgetReviewPK != null) || (this.budgetReviewPK != null && !this.budgetReviewPK.equals(other.budgetReviewPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.BudgetReview[ budgetReviewPK=" + budgetReviewPK + " ]";
    }
    
}
