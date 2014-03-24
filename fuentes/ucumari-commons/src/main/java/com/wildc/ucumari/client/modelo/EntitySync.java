/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "entity_sync")
@NamedQueries({
    @NamedQuery(name = "EntitySync.findAll", query = "SELECT e FROM EntitySync e")})
public class EntitySync implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ENTITY_SYNC_ID")
    private String entitySyncId;
    @Column(name = "RUN_STATUS_ID")
    private String runStatusId;
    @Column(name = "LAST_SUCCESSFUL_SYNCH_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastSuccessfulSynchTime;
    @Column(name = "LAST_HISTORY_START_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastHistoryStartDate;
    @Column(name = "PRE_OFFLINE_SYNCH_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date preOfflineSynchTime;
    @Column(name = "OFFLINE_SYNC_SPLIT_MILLIS")
    private BigInteger offlineSyncSplitMillis;
    @Column(name = "SYNC_SPLIT_MILLIS")
    private BigInteger syncSplitMillis;
    @Column(name = "SYNC_END_BUFFER_MILLIS")
    private BigInteger syncEndBufferMillis;
    @Column(name = "MAX_RUNNING_NO_UPDATE_MILLIS")
    private BigInteger maxRunningNoUpdateMillis;
    @Column(name = "TARGET_SERVICE_NAME")
    private String targetServiceName;
    @Column(name = "TARGET_DELEGATOR_NAME")
    private String targetDelegatorName;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "KEEP_REMOVE_INFO_HOURS")
    private BigDecimal keepRemoveInfoHours;
    @Column(name = "FOR_PULL_ONLY")
    private Character forPullOnly;
    @Column(name = "FOR_PUSH_ONLY")
    private Character forPushOnly;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "entitySync")
    private List<EntitySyncHistory> entitySyncHistoryList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "entitySync")
    private List<EntitySyncInclude> entitySyncIncludeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "entitySync")
    private List<EntitySyncIncludeGroup> entitySyncIncludeGroupList;

    public EntitySync() {
    }

    public EntitySync(String entitySyncId) {
        this.entitySyncId = entitySyncId;
    }

    public String getEntitySyncId() {
        return entitySyncId;
    }

    public void setEntitySyncId(String entitySyncId) {
        this.entitySyncId = entitySyncId;
    }

    public String getRunStatusId() {
        return runStatusId;
    }

    public void setRunStatusId(String runStatusId) {
        this.runStatusId = runStatusId;
    }

    public Date getLastSuccessfulSynchTime() {
        return lastSuccessfulSynchTime;
    }

    public void setLastSuccessfulSynchTime(Date lastSuccessfulSynchTime) {
        this.lastSuccessfulSynchTime = lastSuccessfulSynchTime;
    }

    public Date getLastHistoryStartDate() {
        return lastHistoryStartDate;
    }

    public void setLastHistoryStartDate(Date lastHistoryStartDate) {
        this.lastHistoryStartDate = lastHistoryStartDate;
    }

    public Date getPreOfflineSynchTime() {
        return preOfflineSynchTime;
    }

    public void setPreOfflineSynchTime(Date preOfflineSynchTime) {
        this.preOfflineSynchTime = preOfflineSynchTime;
    }

    public BigInteger getOfflineSyncSplitMillis() {
        return offlineSyncSplitMillis;
    }

    public void setOfflineSyncSplitMillis(BigInteger offlineSyncSplitMillis) {
        this.offlineSyncSplitMillis = offlineSyncSplitMillis;
    }

    public BigInteger getSyncSplitMillis() {
        return syncSplitMillis;
    }

    public void setSyncSplitMillis(BigInteger syncSplitMillis) {
        this.syncSplitMillis = syncSplitMillis;
    }

    public BigInteger getSyncEndBufferMillis() {
        return syncEndBufferMillis;
    }

    public void setSyncEndBufferMillis(BigInteger syncEndBufferMillis) {
        this.syncEndBufferMillis = syncEndBufferMillis;
    }

    public BigInteger getMaxRunningNoUpdateMillis() {
        return maxRunningNoUpdateMillis;
    }

    public void setMaxRunningNoUpdateMillis(BigInteger maxRunningNoUpdateMillis) {
        this.maxRunningNoUpdateMillis = maxRunningNoUpdateMillis;
    }

    public String getTargetServiceName() {
        return targetServiceName;
    }

    public void setTargetServiceName(String targetServiceName) {
        this.targetServiceName = targetServiceName;
    }

    public String getTargetDelegatorName() {
        return targetDelegatorName;
    }

    public void setTargetDelegatorName(String targetDelegatorName) {
        this.targetDelegatorName = targetDelegatorName;
    }

    public BigDecimal getKeepRemoveInfoHours() {
        return keepRemoveInfoHours;
    }

    public void setKeepRemoveInfoHours(BigDecimal keepRemoveInfoHours) {
        this.keepRemoveInfoHours = keepRemoveInfoHours;
    }

    public Character getForPullOnly() {
        return forPullOnly;
    }

    public void setForPullOnly(Character forPullOnly) {
        this.forPullOnly = forPullOnly;
    }

    public Character getForPushOnly() {
        return forPushOnly;
    }

    public void setForPushOnly(Character forPushOnly) {
        this.forPushOnly = forPushOnly;
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

    public List<EntitySyncHistory> getEntitySyncHistoryList() {
        return entitySyncHistoryList;
    }

    public void setEntitySyncHistoryList(List<EntitySyncHistory> entitySyncHistoryList) {
        this.entitySyncHistoryList = entitySyncHistoryList;
    }

    public List<EntitySyncInclude> getEntitySyncIncludeList() {
        return entitySyncIncludeList;
    }

    public void setEntitySyncIncludeList(List<EntitySyncInclude> entitySyncIncludeList) {
        this.entitySyncIncludeList = entitySyncIncludeList;
    }

    public List<EntitySyncIncludeGroup> getEntitySyncIncludeGroupList() {
        return entitySyncIncludeGroupList;
    }

    public void setEntitySyncIncludeGroupList(List<EntitySyncIncludeGroup> entitySyncIncludeGroupList) {
        this.entitySyncIncludeGroupList = entitySyncIncludeGroupList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (entitySyncId != null ? entitySyncId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EntitySync)) {
            return false;
        }
        EntitySync other = (EntitySync) object;
        if ((this.entitySyncId == null && other.entitySyncId != null) || (this.entitySyncId != null && !this.entitySyncId.equals(other.entitySyncId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.EntitySync[ entitySyncId=" + entitySyncId + " ]";
    }
    
}
