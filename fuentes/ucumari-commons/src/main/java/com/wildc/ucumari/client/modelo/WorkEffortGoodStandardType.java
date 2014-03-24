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
@Table(name = "work_effort_good_standard_type")
@NamedQueries({
    @NamedQuery(name = "WorkEffortGoodStandardType.findAll", query = "SELECT w FROM WorkEffortGoodStandardType w")})
public class WorkEffortGoodStandardType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "WORK_EFFORT_GOOD_STD_TYPE_ID")
    private String workEffortGoodStdTypeId;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "workEffortGoodStandardType")
    private List<WorkEffortGoodStandard> workEffortGoodStandardList;
    @OneToMany(mappedBy = "parentTypeId")
    private List<WorkEffortGoodStandardType> workEffortGoodStandardTypeList;
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "WORK_EFFORT_GOOD_STD_TYPE_ID")
    @ManyToOne
    private WorkEffortGoodStandardType parentTypeId;

    public WorkEffortGoodStandardType() {
    }

    public WorkEffortGoodStandardType(String workEffortGoodStdTypeId) {
        this.workEffortGoodStdTypeId = workEffortGoodStdTypeId;
    }

    public String getWorkEffortGoodStdTypeId() {
        return workEffortGoodStdTypeId;
    }

    public void setWorkEffortGoodStdTypeId(String workEffortGoodStdTypeId) {
        this.workEffortGoodStdTypeId = workEffortGoodStdTypeId;
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

    public List<WorkEffortGoodStandard> getWorkEffortGoodStandardList() {
        return workEffortGoodStandardList;
    }

    public void setWorkEffortGoodStandardList(List<WorkEffortGoodStandard> workEffortGoodStandardList) {
        this.workEffortGoodStandardList = workEffortGoodStandardList;
    }

    public List<WorkEffortGoodStandardType> getWorkEffortGoodStandardTypeList() {
        return workEffortGoodStandardTypeList;
    }

    public void setWorkEffortGoodStandardTypeList(List<WorkEffortGoodStandardType> workEffortGoodStandardTypeList) {
        this.workEffortGoodStandardTypeList = workEffortGoodStandardTypeList;
    }

    public WorkEffortGoodStandardType getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(WorkEffortGoodStandardType parentTypeId) {
        this.parentTypeId = parentTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (workEffortGoodStdTypeId != null ? workEffortGoodStdTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WorkEffortGoodStandardType)) {
            return false;
        }
        WorkEffortGoodStandardType other = (WorkEffortGoodStandardType) object;
        if ((this.workEffortGoodStdTypeId == null && other.workEffortGoodStdTypeId != null) || (this.workEffortGoodStdTypeId != null && !this.workEffortGoodStdTypeId.equals(other.workEffortGoodStdTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.WorkEffortGoodStandardType[ workEffortGoodStdTypeId=" + workEffortGoodStdTypeId + " ]";
    }
    
}
