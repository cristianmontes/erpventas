/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.accounting.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.budget.model.BudgetItemType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "gl_budget_xref")
@NamedQueries({
    @NamedQuery(name = "GlBudgetXref.findAll", query = "SELECT g FROM GlBudgetXref g")})
public class GlBudgetXref implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GlBudgetXrefPK glBudgetXrefPK;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ALLOCATION_PERCENTAGE")
    private BigDecimal allocationPercentage;
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
    @JoinColumn(name = "GL_ACCOUNT_ID", referencedColumnName = "GL_ACCOUNT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private GlAccount glAccount;
    @JoinColumn(name = "BUDGET_ITEM_TYPE_ID", referencedColumnName = "BUDGET_ITEM_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private BudgetItemType budgetItemType;

    public GlBudgetXref() {
    }

    public GlBudgetXref(GlBudgetXrefPK glBudgetXrefPK) {
        this.glBudgetXrefPK = glBudgetXrefPK;
    }

    public GlBudgetXref(String glAccountId, String budgetItemTypeId, Date fromDate) {
        this.glBudgetXrefPK = new GlBudgetXrefPK(glAccountId, budgetItemTypeId, fromDate);
    }

    public GlBudgetXrefPK getGlBudgetXrefPK() {
        return glBudgetXrefPK;
    }

    public void setGlBudgetXrefPK(GlBudgetXrefPK glBudgetXrefPK) {
        this.glBudgetXrefPK = glBudgetXrefPK;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
    }

    public BigDecimal getAllocationPercentage() {
        return allocationPercentage;
    }

    public void setAllocationPercentage(BigDecimal allocationPercentage) {
        this.allocationPercentage = allocationPercentage;
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

    public GlAccount getGlAccount() {
        return glAccount;
    }

    public void setGlAccount(GlAccount glAccount) {
        this.glAccount = glAccount;
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
        hash += (glBudgetXrefPK != null ? glBudgetXrefPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GlBudgetXref)) {
            return false;
        }
        GlBudgetXref other = (GlBudgetXref) object;
        if ((this.glBudgetXrefPK == null && other.glBudgetXrefPK != null) || (this.glBudgetXrefPK != null && !this.glBudgetXrefPK.equals(other.glBudgetXrefPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.GlBudgetXref[ glBudgetXrefPK=" + glBudgetXrefPK + " ]";
    }
    
}
