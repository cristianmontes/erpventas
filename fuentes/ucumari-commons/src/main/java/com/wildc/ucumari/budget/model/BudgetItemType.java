/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.budget.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "budget_item_type")
public class BudgetItemType implements Serializable {
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "budgetItemType")
    private List<GlBudgetXref> glBudgetXrefList;*/
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "BUDGET_ITEM_TYPE_ID")
    private String budgetItemTypeId;
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
    @OneToMany(mappedBy = "budgetItemTypeId")
    private List<BudgetItem> budgetItemList;
    @OneToMany(mappedBy = "parentTypeId")
    private List<BudgetItemType> budgetItemTypeList;
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "BUDGET_ITEM_TYPE_ID")
    @ManyToOne
    private BudgetItemType parentTypeId;
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "budgetItemType")
    private List<BudgetItemTypeAttr> budgetItemTypeAttrList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "budgetItemType")
    private List<BudgetScenarioRule> budgetScenarioRuleList;*/

    public BudgetItemType() {
    }

    public BudgetItemType(String budgetItemTypeId) {
        this.budgetItemTypeId = budgetItemTypeId;
    }

    public String getBudgetItemTypeId() {
        return budgetItemTypeId;
    }

    public void setBudgetItemTypeId(String budgetItemTypeId) {
        this.budgetItemTypeId = budgetItemTypeId;
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

    public List<BudgetItem> getBudgetItemList() {
        return budgetItemList;
    }

    public void setBudgetItemList(List<BudgetItem> budgetItemList) {
        this.budgetItemList = budgetItemList;
    }

    public List<BudgetItemType> getBudgetItemTypeList() {
        return budgetItemTypeList;
    }

    public void setBudgetItemTypeList(List<BudgetItemType> budgetItemTypeList) {
        this.budgetItemTypeList = budgetItemTypeList;
    }

    public BudgetItemType getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(BudgetItemType parentTypeId) {
        this.parentTypeId = parentTypeId;
    }
/*
    public List<BudgetItemTypeAttr> getBudgetItemTypeAttrList() {
        return budgetItemTypeAttrList;
    }

    public void setBudgetItemTypeAttrList(List<BudgetItemTypeAttr> budgetItemTypeAttrList) {
        this.budgetItemTypeAttrList = budgetItemTypeAttrList;
    }

    public List<BudgetScenarioRule> getBudgetScenarioRuleList() {
        return budgetScenarioRuleList;
    }

    public void setBudgetScenarioRuleList(List<BudgetScenarioRule> budgetScenarioRuleList) {
        this.budgetScenarioRuleList = budgetScenarioRuleList;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (budgetItemTypeId != null ? budgetItemTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BudgetItemType)) {
            return false;
        }
        BudgetItemType other = (BudgetItemType) object;
        if ((this.budgetItemTypeId == null && other.budgetItemTypeId != null) || (this.budgetItemTypeId != null && !this.budgetItemTypeId.equals(other.budgetItemTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.BudgetItemType[ budgetItemTypeId=" + budgetItemTypeId + " ]";
    }
/*
    public List<GlBudgetXref> getGlBudgetXrefList() {
        return glBudgetXrefList;
    }

    public void setGlBudgetXrefList(List<GlBudgetXref> glBudgetXrefList) {
        this.glBudgetXrefList = glBudgetXrefList;
    }*/
    
}
