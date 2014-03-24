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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "budget_attribute")
@NamedQueries({
    @NamedQuery(name = "BudgetAttribute.findAll", query = "SELECT b FROM BudgetAttribute b")})
public class BudgetAttribute implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected BudgetAttributePK budgetAttributePK;
    @Column(name = "ATTR_VALUE")
    private String attrValue;
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

    public BudgetAttribute() {
    }

    public BudgetAttribute(BudgetAttributePK budgetAttributePK) {
        this.budgetAttributePK = budgetAttributePK;
    }

    public BudgetAttribute(String budgetId, String attrName) {
        this.budgetAttributePK = new BudgetAttributePK(budgetId, attrName);
    }

    public BudgetAttributePK getBudgetAttributePK() {
        return budgetAttributePK;
    }

    public void setBudgetAttributePK(BudgetAttributePK budgetAttributePK) {
        this.budgetAttributePK = budgetAttributePK;
    }

    public String getAttrValue() {
        return attrValue;
    }

    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (budgetAttributePK != null ? budgetAttributePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BudgetAttribute)) {
            return false;
        }
        BudgetAttribute other = (BudgetAttribute) object;
        if ((this.budgetAttributePK == null && other.budgetAttributePK != null) || (this.budgetAttributePK != null && !this.budgetAttributePK.equals(other.budgetAttributePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.BudgetAttribute[ budgetAttributePK=" + budgetAttributePK + " ]";
    }
    
}
