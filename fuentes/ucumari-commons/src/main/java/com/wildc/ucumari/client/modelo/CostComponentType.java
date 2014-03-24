/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "cost_component_type")
@NamedQueries({
    @NamedQuery(name = "CostComponentType.findAll", query = "SELECT c FROM CostComponentType c")})
public class CostComponentType implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "costComponentType")
    private List<WorkEffortCostCalc> workEffortCostCalcList;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COST_COMPONENT_TYPE_ID")
    private String costComponentTypeId;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "costComponentType")
    private List<CostComponentTypeAttr> costComponentTypeAttrList;
    @OneToMany(mappedBy = "costComponentTypeId")
    private List<CostComponent> costComponentList;
    @OneToMany(mappedBy = "parentTypeId")
    private List<CostComponentType> costComponentTypeList;
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "COST_COMPONENT_TYPE_ID")
    @ManyToOne
    private CostComponentType parentTypeId;

    public CostComponentType() {
    }

    public CostComponentType(String costComponentTypeId) {
        this.costComponentTypeId = costComponentTypeId;
    }

    public String getCostComponentTypeId() {
        return costComponentTypeId;
    }

    public void setCostComponentTypeId(String costComponentTypeId) {
        this.costComponentTypeId = costComponentTypeId;
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

    public List<CostComponentTypeAttr> getCostComponentTypeAttrList() {
        return costComponentTypeAttrList;
    }

    public void setCostComponentTypeAttrList(List<CostComponentTypeAttr> costComponentTypeAttrList) {
        this.costComponentTypeAttrList = costComponentTypeAttrList;
    }

    public List<CostComponent> getCostComponentList() {
        return costComponentList;
    }

    public void setCostComponentList(List<CostComponent> costComponentList) {
        this.costComponentList = costComponentList;
    }

    public List<CostComponentType> getCostComponentTypeList() {
        return costComponentTypeList;
    }

    public void setCostComponentTypeList(List<CostComponentType> costComponentTypeList) {
        this.costComponentTypeList = costComponentTypeList;
    }

    public CostComponentType getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(CostComponentType parentTypeId) {
        this.parentTypeId = parentTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (costComponentTypeId != null ? costComponentTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CostComponentType)) {
            return false;
        }
        CostComponentType other = (CostComponentType) object;
        if ((this.costComponentTypeId == null && other.costComponentTypeId != null) || (this.costComponentTypeId != null && !this.costComponentTypeId.equals(other.costComponentTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.CostComponentType[ costComponentTypeId=" + costComponentTypeId + " ]";
    }

    public List<WorkEffortCostCalc> getWorkEffortCostCalcList() {
        return workEffortCostCalcList;
    }

    public void setWorkEffortCostCalcList(List<WorkEffortCostCalc> workEffortCostCalcList) {
        this.workEffortCostCalcList = workEffortCostCalcList;
    }
    
}
