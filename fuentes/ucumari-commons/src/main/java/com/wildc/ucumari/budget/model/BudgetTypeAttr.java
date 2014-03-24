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
@Table(name = "budget_type_attr")
@NamedQueries({
    @NamedQuery(name = "BudgetTypeAttr.findAll", query = "SELECT b FROM BudgetTypeAttr b")})
public class BudgetTypeAttr implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected BudgetTypeAttrPK budgetTypeAttrPK;
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
    @JoinColumn(name = "BUDGET_TYPE_ID", referencedColumnName = "BUDGET_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private BudgetType budgetType;

    public BudgetTypeAttr() {
    }

    public BudgetTypeAttr(BudgetTypeAttrPK budgetTypeAttrPK) {
        this.budgetTypeAttrPK = budgetTypeAttrPK;
    }

    public BudgetTypeAttr(String budgetTypeId, String attrName) {
        this.budgetTypeAttrPK = new BudgetTypeAttrPK(budgetTypeId, attrName);
    }

    public BudgetTypeAttrPK getBudgetTypeAttrPK() {
        return budgetTypeAttrPK;
    }

    public void setBudgetTypeAttrPK(BudgetTypeAttrPK budgetTypeAttrPK) {
        this.budgetTypeAttrPK = budgetTypeAttrPK;
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

    public BudgetType getBudgetType() {
        return budgetType;
    }

    public void setBudgetType(BudgetType budgetType) {
        this.budgetType = budgetType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (budgetTypeAttrPK != null ? budgetTypeAttrPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BudgetTypeAttr)) {
            return false;
        }
        BudgetTypeAttr other = (BudgetTypeAttr) object;
        if ((this.budgetTypeAttrPK == null && other.budgetTypeAttrPK != null) || (this.budgetTypeAttrPK != null && !this.budgetTypeAttrPK.equals(other.budgetTypeAttrPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.BudgetTypeAttr[ budgetTypeAttrPK=" + budgetTypeAttrPK + " ]";
    }
    
}
