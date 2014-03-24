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

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "budget_type")
public class BudgetType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "BUDGET_TYPE_ID")
    private String budgetTypeId;
    @Column(name = "HAS_TABLE")
    private Character hasTable;
    @Column(name = "DESCRIPTION")
    private String description;
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
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "budgetType")
    private List<BudgetTypeAttr> budgetTypeAttrList;
    @OneToMany(mappedBy = "parentTypeId")
    private List<BudgetType> budgetTypeList;*/
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "BUDGET_TYPE_ID")
    @ManyToOne
    private BudgetType parentTypeId;
    /*@OneToMany(mappedBy = "budgetTypeId")
    private List<Budget> budgetList;*/

    public BudgetType() {
    }

    public BudgetType(String budgetTypeId) {
        this.budgetTypeId = budgetTypeId;
    }

    public String getBudgetTypeId() {
        return budgetTypeId;
    }

    public void setBudgetTypeId(String budgetTypeId) {
        this.budgetTypeId = budgetTypeId;
    }

    public Character getHasTable() {
        return hasTable;
    }

    public void setHasTable(Character hasTable) {
        this.hasTable = hasTable;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
    public List<BudgetTypeAttr> getBudgetTypeAttrList() {
        return budgetTypeAttrList;
    }

    public void setBudgetTypeAttrList(List<BudgetTypeAttr> budgetTypeAttrList) {
        this.budgetTypeAttrList = budgetTypeAttrList;
    }

    public List<BudgetType> getBudgetTypeList() {
        return budgetTypeList;
    }

    public void setBudgetTypeList(List<BudgetType> budgetTypeList) {
        this.budgetTypeList = budgetTypeList;
    }*/

    public BudgetType getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(BudgetType parentTypeId) {
        this.parentTypeId = parentTypeId;
    }
/*
    public List<Budget> getBudgetList() {
        return budgetList;
    }

    public void setBudgetList(List<Budget> budgetList) {
        this.budgetList = budgetList;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (budgetTypeId != null ? budgetTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BudgetType)) {
            return false;
        }
        BudgetType other = (BudgetType) object;
        if ((this.budgetTypeId == null && other.budgetTypeId != null) || (this.budgetTypeId != null && !this.budgetTypeId.equals(other.budgetTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.BudgetType[ budgetTypeId=" + budgetTypeId + " ]";
    }
    
}
