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
@Table(name = "work_effort_assoc_type")
@NamedQueries({
    @NamedQuery(name = "WorkEffortAssocType.findAll", query = "SELECT w FROM WorkEffortAssocType w")})
public class WorkEffortAssocType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "WORK_EFFORT_ASSOC_TYPE_ID")
    private String workEffortAssocTypeId;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "workEffortAssocType")
    private List<WorkEffortAssoc> workEffortAssocList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "workEffortAssocType")
    private List<WorkEffortAssocTypeAttr> workEffortAssocTypeAttrList;
    @OneToMany(mappedBy = "parentTypeId")
    private List<WorkEffortAssocType> workEffortAssocTypeList;
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "WORK_EFFORT_ASSOC_TYPE_ID")
    @ManyToOne
    private WorkEffortAssocType parentTypeId;

    public WorkEffortAssocType() {
    }

    public WorkEffortAssocType(String workEffortAssocTypeId) {
        this.workEffortAssocTypeId = workEffortAssocTypeId;
    }

    public String getWorkEffortAssocTypeId() {
        return workEffortAssocTypeId;
    }

    public void setWorkEffortAssocTypeId(String workEffortAssocTypeId) {
        this.workEffortAssocTypeId = workEffortAssocTypeId;
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

    public List<WorkEffortAssoc> getWorkEffortAssocList() {
        return workEffortAssocList;
    }

    public void setWorkEffortAssocList(List<WorkEffortAssoc> workEffortAssocList) {
        this.workEffortAssocList = workEffortAssocList;
    }

    public List<WorkEffortAssocTypeAttr> getWorkEffortAssocTypeAttrList() {
        return workEffortAssocTypeAttrList;
    }

    public void setWorkEffortAssocTypeAttrList(List<WorkEffortAssocTypeAttr> workEffortAssocTypeAttrList) {
        this.workEffortAssocTypeAttrList = workEffortAssocTypeAttrList;
    }

    public List<WorkEffortAssocType> getWorkEffortAssocTypeList() {
        return workEffortAssocTypeList;
    }

    public void setWorkEffortAssocTypeList(List<WorkEffortAssocType> workEffortAssocTypeList) {
        this.workEffortAssocTypeList = workEffortAssocTypeList;
    }

    public WorkEffortAssocType getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(WorkEffortAssocType parentTypeId) {
        this.parentTypeId = parentTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (workEffortAssocTypeId != null ? workEffortAssocTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WorkEffortAssocType)) {
            return false;
        }
        WorkEffortAssocType other = (WorkEffortAssocType) object;
        if ((this.workEffortAssocTypeId == null && other.workEffortAssocTypeId != null) || (this.workEffortAssocTypeId != null && !this.workEffortAssocTypeId.equals(other.workEffortAssocTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.WorkEffortAssocType[ workEffortAssocTypeId=" + workEffortAssocTypeId + " ]";
    }
    
}
