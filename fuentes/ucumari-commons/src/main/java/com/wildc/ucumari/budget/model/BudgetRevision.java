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

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "budget_revision")
public class BudgetRevision implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected BudgetRevisionPK budgetRevisionPK;
    @Column(name = "DATE_REVISED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateRevised;
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
    @JoinColumn(name = "BUDGET_ID", referencedColumnName = "BUDGET_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Budget budget;
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "budgetRevision")
    private List<BudgetRevisionImpact> budgetRevisionImpactList;*/

    public BudgetRevision() {
    }

    public BudgetRevision(BudgetRevisionPK budgetRevisionPK) {
        this.budgetRevisionPK = budgetRevisionPK;
    }

    public BudgetRevision(String budgetId, String revisionSeqId) {
        this.budgetRevisionPK = new BudgetRevisionPK(budgetId, revisionSeqId);
    }

    public BudgetRevisionPK getBudgetRevisionPK() {
        return budgetRevisionPK;
    }

    public void setBudgetRevisionPK(BudgetRevisionPK budgetRevisionPK) {
        this.budgetRevisionPK = budgetRevisionPK;
    }

    public Date getDateRevised() {
        return dateRevised;
    }

    public void setDateRevised(Date dateRevised) {
        this.dateRevised = dateRevised;
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

    public Budget getBudget() {
        return budget;
    }

    public void setBudget(Budget budget) {
        this.budget = budget;
    }
/*
    public List<BudgetRevisionImpact> getBudgetRevisionImpactList() {
        return budgetRevisionImpactList;
    }

    public void setBudgetRevisionImpactList(List<BudgetRevisionImpact> budgetRevisionImpactList) {
        this.budgetRevisionImpactList = budgetRevisionImpactList;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (budgetRevisionPK != null ? budgetRevisionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BudgetRevision)) {
            return false;
        }
        BudgetRevision other = (BudgetRevision) object;
        if ((this.budgetRevisionPK == null && other.budgetRevisionPK != null) || (this.budgetRevisionPK != null && !this.budgetRevisionPK.equals(other.budgetRevisionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.BudgetRevision[ budgetRevisionPK=" + budgetRevisionPK + " ]";
    }
    
}
