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
@Table(name = "work_effort_content_type")
@NamedQueries({
    @NamedQuery(name = "WorkEffortContentType.findAll", query = "SELECT w FROM WorkEffortContentType w")})
public class WorkEffortContentType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "WORK_EFFORT_CONTENT_TYPE_ID")
    private String workEffortContentTypeId;
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
    @OneToMany(mappedBy = "parentTypeId")
    private List<WorkEffortContentType> workEffortContentTypeList;
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "WORK_EFFORT_CONTENT_TYPE_ID")
    @ManyToOne
    private WorkEffortContentType parentTypeId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "workEffortContentType")
    private List<WorkEffortContent> workEffortContentList;

    public WorkEffortContentType() {
    }

    public WorkEffortContentType(String workEffortContentTypeId) {
        this.workEffortContentTypeId = workEffortContentTypeId;
    }

    public String getWorkEffortContentTypeId() {
        return workEffortContentTypeId;
    }

    public void setWorkEffortContentTypeId(String workEffortContentTypeId) {
        this.workEffortContentTypeId = workEffortContentTypeId;
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

    public List<WorkEffortContentType> getWorkEffortContentTypeList() {
        return workEffortContentTypeList;
    }

    public void setWorkEffortContentTypeList(List<WorkEffortContentType> workEffortContentTypeList) {
        this.workEffortContentTypeList = workEffortContentTypeList;
    }

    public WorkEffortContentType getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(WorkEffortContentType parentTypeId) {
        this.parentTypeId = parentTypeId;
    }

    public List<WorkEffortContent> getWorkEffortContentList() {
        return workEffortContentList;
    }

    public void setWorkEffortContentList(List<WorkEffortContent> workEffortContentList) {
        this.workEffortContentList = workEffortContentList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (workEffortContentTypeId != null ? workEffortContentTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WorkEffortContentType)) {
            return false;
        }
        WorkEffortContentType other = (WorkEffortContentType) object;
        if ((this.workEffortContentTypeId == null && other.workEffortContentTypeId != null) || (this.workEffortContentTypeId != null && !this.workEffortContentTypeId.equals(other.workEffortContentTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.WorkEffortContentType[ workEffortContentTypeId=" + workEffortContentTypeId + " ]";
    }
    
}
