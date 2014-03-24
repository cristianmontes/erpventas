/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "entity_sync_history")
@NamedQueries({
    @NamedQuery(name = "EntitySyncHistory.findAll", query = "SELECT e FROM EntitySyncHistory e")})
public class EntitySyncHistory implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EntitySyncHistoryPK entitySyncHistoryPK;
    @Column(name = "RUN_STATUS_ID")
    private String runStatusId;
    @Column(name = "BEGINNING_SYNCH_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date beginningSynchTime;
    @Column(name = "LAST_SUCCESSFUL_SYNCH_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastSuccessfulSynchTime;
    @Column(name = "LAST_CANDIDATE_END_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastCandidateEndTime;
    @Column(name = "LAST_SPLIT_START_TIME")
    private BigInteger lastSplitStartTime;
    @Column(name = "TO_CREATE_INSERTED")
    private BigInteger toCreateInserted;
    @Column(name = "TO_CREATE_UPDATED")
    private BigInteger toCreateUpdated;
    @Column(name = "TO_CREATE_NOT_UPDATED")
    private BigInteger toCreateNotUpdated;
    @Column(name = "TO_STORE_INSERTED")
    private BigInteger toStoreInserted;
    @Column(name = "TO_STORE_UPDATED")
    private BigInteger toStoreUpdated;
    @Column(name = "TO_STORE_NOT_UPDATED")
    private BigInteger toStoreNotUpdated;
    @Column(name = "TO_REMOVE_DELETED")
    private BigInteger toRemoveDeleted;
    @Column(name = "TO_REMOVE_ALREADY_DELETED")
    private BigInteger toRemoveAlreadyDeleted;
    @Column(name = "TOTAL_ROWS_EXPORTED")
    private BigInteger totalRowsExported;
    @Column(name = "TOTAL_ROWS_TO_CREATE")
    private BigInteger totalRowsToCreate;
    @Column(name = "TOTAL_ROWS_TO_STORE")
    private BigInteger totalRowsToStore;
    @Column(name = "TOTAL_ROWS_TO_REMOVE")
    private BigInteger totalRowsToRemove;
    @Column(name = "TOTAL_SPLITS")
    private BigInteger totalSplits;
    @Column(name = "TOTAL_STORE_CALLS")
    private BigInteger totalStoreCalls;
    @Column(name = "RUNNING_TIME_MILLIS")
    private BigInteger runningTimeMillis;
    @Column(name = "PER_SPLIT_MIN_MILLIS")
    private BigInteger perSplitMinMillis;
    @Column(name = "PER_SPLIT_MAX_MILLIS")
    private BigInteger perSplitMaxMillis;
    @Column(name = "PER_SPLIT_MIN_ITEMS")
    private BigInteger perSplitMinItems;
    @Column(name = "PER_SPLIT_MAX_ITEMS")
    private BigInteger perSplitMaxItems;
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
    @JoinColumn(name = "ENTITY_SYNC_ID", referencedColumnName = "ENTITY_SYNC_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private EntitySync entitySync;

    public EntitySyncHistory() {
    }

    public EntitySyncHistory(EntitySyncHistoryPK entitySyncHistoryPK) {
        this.entitySyncHistoryPK = entitySyncHistoryPK;
    }

    public EntitySyncHistory(String entitySyncId, Date startDate) {
        this.entitySyncHistoryPK = new EntitySyncHistoryPK(entitySyncId, startDate);
    }

    public EntitySyncHistoryPK getEntitySyncHistoryPK() {
        return entitySyncHistoryPK;
    }

    public void setEntitySyncHistoryPK(EntitySyncHistoryPK entitySyncHistoryPK) {
        this.entitySyncHistoryPK = entitySyncHistoryPK;
    }

    public String getRunStatusId() {
        return runStatusId;
    }

    public void setRunStatusId(String runStatusId) {
        this.runStatusId = runStatusId;
    }

    public Date getBeginningSynchTime() {
        return beginningSynchTime;
    }

    public void setBeginningSynchTime(Date beginningSynchTime) {
        this.beginningSynchTime = beginningSynchTime;
    }

    public Date getLastSuccessfulSynchTime() {
        return lastSuccessfulSynchTime;
    }

    public void setLastSuccessfulSynchTime(Date lastSuccessfulSynchTime) {
        this.lastSuccessfulSynchTime = lastSuccessfulSynchTime;
    }

    public Date getLastCandidateEndTime() {
        return lastCandidateEndTime;
    }

    public void setLastCandidateEndTime(Date lastCandidateEndTime) {
        this.lastCandidateEndTime = lastCandidateEndTime;
    }

    public BigInteger getLastSplitStartTime() {
        return lastSplitStartTime;
    }

    public void setLastSplitStartTime(BigInteger lastSplitStartTime) {
        this.lastSplitStartTime = lastSplitStartTime;
    }

    public BigInteger getToCreateInserted() {
        return toCreateInserted;
    }

    public void setToCreateInserted(BigInteger toCreateInserted) {
        this.toCreateInserted = toCreateInserted;
    }

    public BigInteger getToCreateUpdated() {
        return toCreateUpdated;
    }

    public void setToCreateUpdated(BigInteger toCreateUpdated) {
        this.toCreateUpdated = toCreateUpdated;
    }

    public BigInteger getToCreateNotUpdated() {
        return toCreateNotUpdated;
    }

    public void setToCreateNotUpdated(BigInteger toCreateNotUpdated) {
        this.toCreateNotUpdated = toCreateNotUpdated;
    }

    public BigInteger getToStoreInserted() {
        return toStoreInserted;
    }

    public void setToStoreInserted(BigInteger toStoreInserted) {
        this.toStoreInserted = toStoreInserted;
    }

    public BigInteger getToStoreUpdated() {
        return toStoreUpdated;
    }

    public void setToStoreUpdated(BigInteger toStoreUpdated) {
        this.toStoreUpdated = toStoreUpdated;
    }

    public BigInteger getToStoreNotUpdated() {
        return toStoreNotUpdated;
    }

    public void setToStoreNotUpdated(BigInteger toStoreNotUpdated) {
        this.toStoreNotUpdated = toStoreNotUpdated;
    }

    public BigInteger getToRemoveDeleted() {
        return toRemoveDeleted;
    }

    public void setToRemoveDeleted(BigInteger toRemoveDeleted) {
        this.toRemoveDeleted = toRemoveDeleted;
    }

    public BigInteger getToRemoveAlreadyDeleted() {
        return toRemoveAlreadyDeleted;
    }

    public void setToRemoveAlreadyDeleted(BigInteger toRemoveAlreadyDeleted) {
        this.toRemoveAlreadyDeleted = toRemoveAlreadyDeleted;
    }

    public BigInteger getTotalRowsExported() {
        return totalRowsExported;
    }

    public void setTotalRowsExported(BigInteger totalRowsExported) {
        this.totalRowsExported = totalRowsExported;
    }

    public BigInteger getTotalRowsToCreate() {
        return totalRowsToCreate;
    }

    public void setTotalRowsToCreate(BigInteger totalRowsToCreate) {
        this.totalRowsToCreate = totalRowsToCreate;
    }

    public BigInteger getTotalRowsToStore() {
        return totalRowsToStore;
    }

    public void setTotalRowsToStore(BigInteger totalRowsToStore) {
        this.totalRowsToStore = totalRowsToStore;
    }

    public BigInteger getTotalRowsToRemove() {
        return totalRowsToRemove;
    }

    public void setTotalRowsToRemove(BigInteger totalRowsToRemove) {
        this.totalRowsToRemove = totalRowsToRemove;
    }

    public BigInteger getTotalSplits() {
        return totalSplits;
    }

    public void setTotalSplits(BigInteger totalSplits) {
        this.totalSplits = totalSplits;
    }

    public BigInteger getTotalStoreCalls() {
        return totalStoreCalls;
    }

    public void setTotalStoreCalls(BigInteger totalStoreCalls) {
        this.totalStoreCalls = totalStoreCalls;
    }

    public BigInteger getRunningTimeMillis() {
        return runningTimeMillis;
    }

    public void setRunningTimeMillis(BigInteger runningTimeMillis) {
        this.runningTimeMillis = runningTimeMillis;
    }

    public BigInteger getPerSplitMinMillis() {
        return perSplitMinMillis;
    }

    public void setPerSplitMinMillis(BigInteger perSplitMinMillis) {
        this.perSplitMinMillis = perSplitMinMillis;
    }

    public BigInteger getPerSplitMaxMillis() {
        return perSplitMaxMillis;
    }

    public void setPerSplitMaxMillis(BigInteger perSplitMaxMillis) {
        this.perSplitMaxMillis = perSplitMaxMillis;
    }

    public BigInteger getPerSplitMinItems() {
        return perSplitMinItems;
    }

    public void setPerSplitMinItems(BigInteger perSplitMinItems) {
        this.perSplitMinItems = perSplitMinItems;
    }

    public BigInteger getPerSplitMaxItems() {
        return perSplitMaxItems;
    }

    public void setPerSplitMaxItems(BigInteger perSplitMaxItems) {
        this.perSplitMaxItems = perSplitMaxItems;
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

    public EntitySync getEntitySync() {
        return entitySync;
    }

    public void setEntitySync(EntitySync entitySync) {
        this.entitySync = entitySync;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (entitySyncHistoryPK != null ? entitySyncHistoryPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EntitySyncHistory)) {
            return false;
        }
        EntitySyncHistory other = (EntitySyncHistory) object;
        if ((this.entitySyncHistoryPK == null && other.entitySyncHistoryPK != null) || (this.entitySyncHistoryPK != null && !this.entitySyncHistoryPK.equals(other.entitySyncHistoryPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.EntitySyncHistory[ entitySyncHistoryPK=" + entitySyncHistoryPK + " ]";
    }
    
}
