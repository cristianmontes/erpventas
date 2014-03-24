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
public class BudgetReviewPK implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Basic(optional = false)
    @Column(name = "BUDGET_ID")
    private String budgetId;
    @Basic(optional = false)
    @Column(name = "BUDGET_REVIEW_ID")
    private String budgetReviewId;
    @Basic(optional = false)
    @Column(name = "PARTY_ID")
    private String partyId;
    @Basic(optional = false)
    @Column(name = "BUDGET_REVIEW_RESULT_TYPE_ID")
    private String budgetReviewResultTypeId;

    public BudgetReviewPK() {
    }

    public BudgetReviewPK(String budgetId, String budgetReviewId, String partyId, String budgetReviewResultTypeId) {
        this.budgetId = budgetId;
        this.budgetReviewId = budgetReviewId;
        this.partyId = partyId;
        this.budgetReviewResultTypeId = budgetReviewResultTypeId;
    }

    public String getBudgetId() {
        return budgetId;
    }

    public void setBudgetId(String budgetId) {
        this.budgetId = budgetId;
    }

    public String getBudgetReviewId() {
        return budgetReviewId;
    }

    public void setBudgetReviewId(String budgetReviewId) {
        this.budgetReviewId = budgetReviewId;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public String getBudgetReviewResultTypeId() {
        return budgetReviewResultTypeId;
    }

    public void setBudgetReviewResultTypeId(String budgetReviewResultTypeId) {
        this.budgetReviewResultTypeId = budgetReviewResultTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (budgetId != null ? budgetId.hashCode() : 0);
        hash += (budgetReviewId != null ? budgetReviewId.hashCode() : 0);
        hash += (partyId != null ? partyId.hashCode() : 0);
        hash += (budgetReviewResultTypeId != null ? budgetReviewResultTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BudgetReviewPK)) {
            return false;
        }
        BudgetReviewPK other = (BudgetReviewPK) object;
        if ((this.budgetId == null && other.budgetId != null) || (this.budgetId != null && !this.budgetId.equals(other.budgetId))) {
            return false;
        }
        if ((this.budgetReviewId == null && other.budgetReviewId != null) || (this.budgetReviewId != null && !this.budgetReviewId.equals(other.budgetReviewId))) {
            return false;
        }
        if ((this.partyId == null && other.partyId != null) || (this.partyId != null && !this.partyId.equals(other.partyId))) {
            return false;
        }
        if ((this.budgetReviewResultTypeId == null && other.budgetReviewResultTypeId != null) || (this.budgetReviewResultTypeId != null && !this.budgetReviewResultTypeId.equals(other.budgetReviewResultTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.BudgetReviewPK[ budgetId=" + budgetId + ", budgetReviewId=" + budgetReviewId + ", partyId=" + partyId + ", budgetReviewResultTypeId=" + budgetReviewResultTypeId + " ]";
    }
    
}
