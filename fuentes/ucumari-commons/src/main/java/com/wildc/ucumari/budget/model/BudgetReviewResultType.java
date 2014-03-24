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
@Table(name = "budget_review_result_type")
public class BudgetReviewResultType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "BUDGET_REVIEW_RESULT_TYPE_ID")
    private String budgetReviewResultTypeId;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "COMMENTS")
    private String comments;
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
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "budgetReviewResultType")
    private List<BudgetReview> budgetReviewList;*/

    public BudgetReviewResultType() {
    }

    public BudgetReviewResultType(String budgetReviewResultTypeId) {
        this.budgetReviewResultTypeId = budgetReviewResultTypeId;
    }

    public String getBudgetReviewResultTypeId() {
        return budgetReviewResultTypeId;
    }

    public void setBudgetReviewResultTypeId(String budgetReviewResultTypeId) {
        this.budgetReviewResultTypeId = budgetReviewResultTypeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
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
    public List<BudgetReview> getBudgetReviewList() {
        return budgetReviewList;
    }

    public void setBudgetReviewList(List<BudgetReview> budgetReviewList) {
        this.budgetReviewList = budgetReviewList;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (budgetReviewResultTypeId != null ? budgetReviewResultTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BudgetReviewResultType)) {
            return false;
        }
        BudgetReviewResultType other = (BudgetReviewResultType) object;
        if ((this.budgetReviewResultTypeId == null && other.budgetReviewResultTypeId != null) || (this.budgetReviewResultTypeId != null && !this.budgetReviewResultTypeId.equals(other.budgetReviewResultTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.BudgetReviewResultType[ budgetReviewResultTypeId=" + budgetReviewResultTypeId + " ]";
    }
    
}