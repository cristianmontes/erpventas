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
public class BudgetItemPK implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Basic(optional = false)
    @Column(name = "BUDGET_ID")
    private String budgetId;
    @Basic(optional = false)
    @Column(name = "BUDGET_ITEM_SEQ_ID")
    private String budgetItemSeqId;

    public BudgetItemPK() {
    }

    public BudgetItemPK(String budgetId, String budgetItemSeqId) {
        this.budgetId = budgetId;
        this.budgetItemSeqId = budgetItemSeqId;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (budgetId != null ? budgetId.hashCode() : 0);
        hash += (budgetItemSeqId != null ? budgetItemSeqId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BudgetItemPK)) {
            return false;
        }
        BudgetItemPK other = (BudgetItemPK) object;
        if ((this.budgetId == null && other.budgetId != null) || (this.budgetId != null && !this.budgetId.equals(other.budgetId))) {
            return false;
        }
        if ((this.budgetItemSeqId == null && other.budgetItemSeqId != null) || (this.budgetItemSeqId != null && !this.budgetItemSeqId.equals(other.budgetItemSeqId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.BudgetItemPK[ budgetId=" + budgetId + ", budgetItemSeqId=" + budgetItemSeqId + " ]";
    }
    
}
