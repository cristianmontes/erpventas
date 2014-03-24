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
@Table(name = "work_effort_type")
@NamedQueries({
    @NamedQuery(name = "WorkEffortType.findAll", query = "SELECT w FROM WorkEffortType w")})
public class WorkEffortType implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "workEffortType")
    private List<WorkEffortTypeAttr> workEffortTypeAttrList;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "WORK_EFFORT_TYPE_ID")
    private String workEffortTypeId;
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
    @OneToMany(mappedBy = "workEffortTypeId")
    private List<WorkEffort> workEffortList;
    @OneToMany(mappedBy = "parentTypeId")
    private List<WorkEffortType> workEffortTypeList;
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "WORK_EFFORT_TYPE_ID")
    @ManyToOne
    private WorkEffortType parentTypeId;

    public WorkEffortType() {
    }

    public WorkEffortType(String workEffortTypeId) {
        this.workEffortTypeId = workEffortTypeId;
    }

    public String getWorkEffortTypeId() {
        return workEffortTypeId;
    }

    public void setWorkEffortTypeId(String workEffortTypeId) {
        this.workEffortTypeId = workEffortTypeId;
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

    public List<WorkEffort> getWorkEffortList() {
        return workEffortList;
    }

    public void setWorkEffortList(List<WorkEffort> workEffortList) {
        this.workEffortList = workEffortList;
    }

    public List<WorkEffortType> getWorkEffortTypeList() {
        return workEffortTypeList;
    }

    public void setWorkEffortTypeList(List<WorkEffortType> workEffortTypeList) {
        this.workEffortTypeList = workEffortTypeList;
    }

    public WorkEffortType getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(WorkEffortType parentTypeId) {
        this.parentTypeId = parentTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (workEffortTypeId != null ? workEffortTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WorkEffortType)) {
            return false;
        }
        WorkEffortType other = (WorkEffortType) object;
        if ((this.workEffortTypeId == null && other.workEffortTypeId != null) || (this.workEffortTypeId != null && !this.workEffortTypeId.equals(other.workEffortTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.WorkEffortType[ workEffortTypeId=" + workEffortTypeId + " ]";
    }

    public List<WorkEffortTypeAttr> getWorkEffortTypeAttrList() {
        return workEffortTypeAttrList;
    }

    public void setWorkEffortTypeAttrList(List<WorkEffortTypeAttr> workEffortTypeAttrList) {
        this.workEffortTypeAttrList = workEffortTypeAttrList;
    }
    
}
