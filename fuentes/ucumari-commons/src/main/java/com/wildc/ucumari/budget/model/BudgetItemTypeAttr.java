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
@Table(name = "budget_item_type_attr")
@NamedQueries({
    @NamedQuery(name = "BudgetItemTypeAttr.findAll", query = "SELECT b FROM BudgetItemTypeAttr b")})
public class BudgetItemTypeAttr implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected BudgetItemTypeAttrPK budgetItemTypeAttrPK;
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
    @JoinColumn(name = "BUDGET_ITEM_TYPE_ID", referencedColumnName = "BUDGET_ITEM_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private BudgetItemType budgetItemType;

    public BudgetItemTypeAttr() {
    }

    public BudgetItemTypeAttr(BudgetItemTypeAttrPK budgetItemTypeAttrPK) {
        this.budgetItemTypeAttrPK = budgetItemTypeAttrPK;
    }

    public BudgetItemTypeAttr(String budgetItemTypeId, String attrName) {
        this.budgetItemTypeAttrPK = new BudgetItemTypeAttrPK(budgetItemTypeId, attrName);
    }

    public BudgetItemTypeAttrPK getBudgetItemTypeAttrPK() {
        return budgetItemTypeAttrPK;
    }

    public void setBudgetItemTypeAttrPK(BudgetItemTypeAttrPK budgetItemTypeAttrPK) {
        this.budgetItemTypeAttrPK = budgetItemTypeAttrPK;
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

    public BudgetItemType getBudgetItemType() {
        return budgetItemType;
    }

    public void setBudgetItemType(BudgetItemType budgetItemType) {
        this.budgetItemType = budgetItemType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (budgetItemTypeAttrPK != null ? budgetItemTypeAttrPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BudgetItemTypeAttr)) {
            return false;
        }
        BudgetItemTypeAttr other = (BudgetItemTypeAttr) object;
        if ((this.budgetItemTypeAttrPK == null && other.budgetItemTypeAttrPK != null) || (this.budgetItemTypeAttrPK != null && !this.budgetItemTypeAttrPK.equals(other.budgetItemTypeAttrPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.BudgetItemTypeAttr[ budgetItemTypeAttrPK=" + budgetItemTypeAttrPK + " ]";
    }
    
}
