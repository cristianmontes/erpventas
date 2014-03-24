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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
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
@Table(name = "runtime_data")
@NamedQueries({
    @NamedQuery(name = "RuntimeData.findAll", query = "SELECT r FROM RuntimeData r")})
public class RuntimeData implements Serializable {
    @OneToMany(mappedBy = "runtimeDataId")
    private List<JobSandbox> jobSandboxList;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "RUNTIME_DATA_ID")
    private String runtimeDataId;
    @Lob
    @Column(name = "RUNTIME_INFO")
    private String runtimeInfo;
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
    @OneToMany(mappedBy = "runtimeDataId")
    private List<WorkEffort> workEffortList;
    @OneToMany(mappedBy = "runtimeDataId")
    private List<ApplicationSandbox> applicationSandboxList;

    public RuntimeData() {
    }

    public RuntimeData(String runtimeDataId) {
        this.runtimeDataId = runtimeDataId;
    }

    public String getRuntimeDataId() {
        return runtimeDataId;
    }

    public void setRuntimeDataId(String runtimeDataId) {
        this.runtimeDataId = runtimeDataId;
    }

    public String getRuntimeInfo() {
        return runtimeInfo;
    }

    public void setRuntimeInfo(String runtimeInfo) {
        this.runtimeInfo = runtimeInfo;
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

    public List<ApplicationSandbox> getApplicationSandboxList() {
        return applicationSandboxList;
    }

    public void setApplicationSandboxList(List<ApplicationSandbox> applicationSandboxList) {
        this.applicationSandboxList = applicationSandboxList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (runtimeDataId != null ? runtimeDataId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RuntimeData)) {
            return false;
        }
        RuntimeData other = (RuntimeData) object;
        if ((this.runtimeDataId == null && other.runtimeDataId != null) || (this.runtimeDataId != null && !this.runtimeDataId.equals(other.runtimeDataId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.RuntimeData[ runtimeDataId=" + runtimeDataId + " ]";
    }

    public List<JobSandbox> getJobSandboxList() {
        return jobSandboxList;
    }

    public void setJobSandboxList(List<JobSandbox> jobSandboxList) {
        this.jobSandboxList = jobSandboxList;
    }
    
}
