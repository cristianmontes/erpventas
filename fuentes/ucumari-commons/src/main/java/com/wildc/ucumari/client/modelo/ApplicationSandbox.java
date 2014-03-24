/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
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
@Table(name = "application_sandbox")
@NamedQueries({
    @NamedQuery(name = "ApplicationSandbox.findAll", query = "SELECT a FROM ApplicationSandbox a")})
public class ApplicationSandbox implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "APPLICATION_ID")
    private String applicationId;
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
    @JoinColumns({
        @JoinColumn(name = "WORK_EFFORT_ID", referencedColumnName = "WORK_EFFORT_ID"),
        @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID"),
        @JoinColumn(name = "ROLE_TYPE_ID", referencedColumnName = "ROLE_TYPE_ID"),
        @JoinColumn(name = "FROM_DATE", referencedColumnName = "FROM_DATE")})
    @ManyToOne
    private WorkEffortPartyAssignment workEffortPartyAssignment;
    @JoinColumn(name = "RUNTIME_DATA_ID", referencedColumnName = "RUNTIME_DATA_ID")
    @ManyToOne
    private RuntimeData runtimeDataId;

    public ApplicationSandbox() {
    }

    public ApplicationSandbox(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
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

    public WorkEffortPartyAssignment getWorkEffortPartyAssignment() {
        return workEffortPartyAssignment;
    }

    public void setWorkEffortPartyAssignment(WorkEffortPartyAssignment workEffortPartyAssignment) {
        this.workEffortPartyAssignment = workEffortPartyAssignment;
    }

    public RuntimeData getRuntimeDataId() {
        return runtimeDataId;
    }

    public void setRuntimeDataId(RuntimeData runtimeDataId) {
        this.runtimeDataId = runtimeDataId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (applicationId != null ? applicationId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ApplicationSandbox)) {
            return false;
        }
        ApplicationSandbox other = (ApplicationSandbox) object;
        if ((this.applicationId == null && other.applicationId != null) || (this.applicationId != null && !this.applicationId.equals(other.applicationId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ApplicationSandbox[ applicationId=" + applicationId + " ]";
    }
    
}
