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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.parameters.model.CustomTimePeriod;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "budget")
public class Budget implements Serializable {
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "budget")
    private List<PaymentBudgetAllocation> paymentBudgetAllocationList;*/
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "BUDGET_ID")
    private String budgetId;
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
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "budget")
    private List<BudgetItem> budgetItemList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "budget")
    private List<BudgetRevision> budgetRevisionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "budget")
    private List<BudgetRole> budgetRoleList;
    @OneToMany(mappedBy = "budgetId")
    private List<BudgetScenarioApplication> budgetScenarioApplicationList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "budget")
    private List<BudgetReview> budgetReviewList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "budget")
    private List<BudgetAttribute> budgetAttributeList;*/
    @JoinColumn(name = "CUSTOM_TIME_PERIOD_ID", referencedColumnName = "CUSTOM_TIME_PERIOD_ID")
    @ManyToOne
    private CustomTimePeriod customTimePeriodId;
    @JoinColumn(name = "BUDGET_TYPE_ID", referencedColumnName = "BUDGET_TYPE_ID")
    @ManyToOne
    private BudgetType budgetTypeId;
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "budget")
    private List<BudgetStatus> budgetStatusList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "budget")
    private List<BudgetRevisionImpact> budgetRevisionImpactList;*/

    public Budget() {
    }

    public Budget(String budgetId) {
        this.budgetId = budgetId;
    }

    public String getBudgetId() {
        return budgetId;
    }

    public void setBudgetId(String budgetId) {
        this.budgetId = budgetId;
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
    public List<BudgetItem> getBudgetItemList() {
        return budgetItemList;
    }

    public void setBudgetItemList(List<BudgetItem> budgetItemList) {
        this.budgetItemList = budgetItemList;
    }

    public List<BudgetRevision> getBudgetRevisionList() {
        return budgetRevisionList;
    }

    public void setBudgetRevisionList(List<BudgetRevision> budgetRevisionList) {
        this.budgetRevisionList = budgetRevisionList;
    }

    public List<BudgetRole> getBudgetRoleList() {
        return budgetRoleList;
    }

    public void setBudgetRoleList(List<BudgetRole> budgetRoleList) {
        this.budgetRoleList = budgetRoleList;
    }

    public List<BudgetScenarioApplication> getBudgetScenarioApplicationList() {
        return budgetScenarioApplicationList;
    }

    public void setBudgetScenarioApplicationList(List<BudgetScenarioApplication> budgetScenarioApplicationList) {
        this.budgetScenarioApplicationList = budgetScenarioApplicationList;
    }

    public List<BudgetReview> getBudgetReviewList() {
        return budgetReviewList;
    }

    public void setBudgetReviewList(List<BudgetReview> budgetReviewList) {
        this.budgetReviewList = budgetReviewList;
    }

    public List<BudgetAttribute> getBudgetAttributeList() {
        return budgetAttributeList;
    }

    public void setBudgetAttributeList(List<BudgetAttribute> budgetAttributeList) {
        this.budgetAttributeList = budgetAttributeList;
    }*/

    public CustomTimePeriod getCustomTimePeriodId() {
        return customTimePeriodId;
    }

    public void setCustomTimePeriodId(CustomTimePeriod customTimePeriodId) {
        this.customTimePeriodId = customTimePeriodId;
    }

    public BudgetType getBudgetTypeId() {
        return budgetTypeId;
    }

    public void setBudgetTypeId(BudgetType budgetTypeId) {
        this.budgetTypeId = budgetTypeId;
    }
/*
    public List<BudgetStatus> getBudgetStatusList() {
        return budgetStatusList;
    }

    public void setBudgetStatusList(List<BudgetStatus> budgetStatusList) {
        this.budgetStatusList = budgetStatusList;
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
        hash += (budgetId != null ? budgetId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Budget)) {
            return false;
        }
        Budget other = (Budget) object;
        if ((this.budgetId == null && other.budgetId != null) || (this.budgetId != null && !this.budgetId.equals(other.budgetId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.Budget[ budgetId=" + budgetId + " ]";
    }
/*
    public List<PaymentBudgetAllocation> getPaymentBudgetAllocationList() {
        return paymentBudgetAllocationList;
    }

    public void setPaymentBudgetAllocationList(List<PaymentBudgetAllocation> paymentBudgetAllocationList) {
        this.paymentBudgetAllocationList = paymentBudgetAllocationList;
    }*/
    
}
