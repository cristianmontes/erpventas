/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import com.wildc.ucumari.parameters.model.StatusItem;
import com.wildc.ucumari.security.model.UserLogin;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "job_sandbox")
@NamedQueries({
    @NamedQuery(name = "JobSandbox.findAll", query = "SELECT j FROM JobSandbox j")})
public class JobSandbox implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "JOB_ID")
    private String jobId;
    @Column(name = "JOB_NAME")
    private String jobName;
    @Column(name = "RUN_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date runTime;
    @Column(name = "POOL_ID")
    private String poolId;
    @Column(name = "PARENT_JOB_ID")
    private String parentJobId;
    @Column(name = "PREVIOUS_JOB_ID")
    private String previousJobId;
    @Column(name = "SERVICE_NAME")
    private String serviceName;
    @Column(name = "LOADER_NAME")
    private String loaderName;
    @Column(name = "MAX_RETRY")
    private BigInteger maxRetry;
    @Column(name = "CURRENT_RECURRENCE_COUNT")
    private BigInteger currentRecurrenceCount;
    @Column(name = "MAX_RECURRENCE_COUNT")
    private BigInteger maxRecurrenceCount;
    @Column(name = "RUN_BY_INSTANCE_ID")
    private String runByInstanceId;
    @Column(name = "START_DATE_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDateTime;
    @Column(name = "FINISH_DATE_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date finishDateTime;
    @Column(name = "CANCEL_DATE_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cancelDateTime;
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
    @JoinColumn(name = "RUN_AS_USER", referencedColumnName = "USER_LOGIN_ID")
    @ManyToOne
    private UserLogin runAsUser;
    @JoinColumn(name = "TEMP_EXPR_ID", referencedColumnName = "TEMP_EXPR_ID")
    @ManyToOne
    private TemporalExpression tempExprId;
    @JoinColumn(name = "STATUS_ID", referencedColumnName = "STATUS_ID")
    @ManyToOne
    private StatusItem statusId;
    @JoinColumn(name = "RUNTIME_DATA_ID", referencedColumnName = "RUNTIME_DATA_ID")
    @ManyToOne
    private RuntimeData runtimeDataId;
    @JoinColumn(name = "RECURRENCE_INFO_ID", referencedColumnName = "RECURRENCE_INFO_ID")
    @ManyToOne
    private RecurrenceInfo recurrenceInfoId;
    @JoinColumn(name = "AUTH_USER_LOGIN_ID", referencedColumnName = "USER_LOGIN_ID")
    @ManyToOne
    private UserLogin authUserLoginId;

    public JobSandbox() {
    }

    public JobSandbox(String jobId) {
        this.jobId = jobId;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public Date getRunTime() {
        return runTime;
    }

    public void setRunTime(Date runTime) {
        this.runTime = runTime;
    }

    public String getPoolId() {
        return poolId;
    }

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    public String getParentJobId() {
        return parentJobId;
    }

    public void setParentJobId(String parentJobId) {
        this.parentJobId = parentJobId;
    }

    public String getPreviousJobId() {
        return previousJobId;
    }

    public void setPreviousJobId(String previousJobId) {
        this.previousJobId = previousJobId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getLoaderName() {
        return loaderName;
    }

    public void setLoaderName(String loaderName) {
        this.loaderName = loaderName;
    }

    public BigInteger getMaxRetry() {
        return maxRetry;
    }

    public void setMaxRetry(BigInteger maxRetry) {
        this.maxRetry = maxRetry;
    }

    public BigInteger getCurrentRecurrenceCount() {
        return currentRecurrenceCount;
    }

    public void setCurrentRecurrenceCount(BigInteger currentRecurrenceCount) {
        this.currentRecurrenceCount = currentRecurrenceCount;
    }

    public BigInteger getMaxRecurrenceCount() {
        return maxRecurrenceCount;
    }

    public void setMaxRecurrenceCount(BigInteger maxRecurrenceCount) {
        this.maxRecurrenceCount = maxRecurrenceCount;
    }

    public String getRunByInstanceId() {
        return runByInstanceId;
    }

    public void setRunByInstanceId(String runByInstanceId) {
        this.runByInstanceId = runByInstanceId;
    }

    public Date getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(Date startDateTime) {
        this.startDateTime = startDateTime;
    }

    public Date getFinishDateTime() {
        return finishDateTime;
    }

    public void setFinishDateTime(Date finishDateTime) {
        this.finishDateTime = finishDateTime;
    }

    public Date getCancelDateTime() {
        return cancelDateTime;
    }

    public void setCancelDateTime(Date cancelDateTime) {
        this.cancelDateTime = cancelDateTime;
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

    public UserLogin getRunAsUser() {
        return runAsUser;
    }

    public void setRunAsUser(UserLogin runAsUser) {
        this.runAsUser = runAsUser;
    }

    public TemporalExpression getTempExprId() {
        return tempExprId;
    }

    public void setTempExprId(TemporalExpression tempExprId) {
        this.tempExprId = tempExprId;
    }

    public StatusItem getStatusId() {
        return statusId;
    }

    public void setStatusId(StatusItem statusId) {
        this.statusId = statusId;
    }

    public RuntimeData getRuntimeDataId() {
        return runtimeDataId;
    }

    public void setRuntimeDataId(RuntimeData runtimeDataId) {
        this.runtimeDataId = runtimeDataId;
    }

    public RecurrenceInfo getRecurrenceInfoId() {
        return recurrenceInfoId;
    }

    public void setRecurrenceInfoId(RecurrenceInfo recurrenceInfoId) {
        this.recurrenceInfoId = recurrenceInfoId;
    }

    public UserLogin getAuthUserLoginId() {
        return authUserLoginId;
    }

    public void setAuthUserLoginId(UserLogin authUserLoginId) {
        this.authUserLoginId = authUserLoginId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (jobId != null ? jobId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof JobSandbox)) {
            return false;
        }
        JobSandbox other = (JobSandbox) object;
        if ((this.jobId == null && other.jobId != null) || (this.jobId != null && !this.jobId.equals(other.jobId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.JobSandbox[ jobId=" + jobId + " ]";
    }
    
}
