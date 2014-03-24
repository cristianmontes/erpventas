/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "work_effort_fixed_asset_std")
@NamedQueries({
    @NamedQuery(name = "WorkEffortFixedAssetStd.findAll", query = "SELECT w FROM WorkEffortFixedAssetStd w")})
public class WorkEffortFixedAssetStd implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected WorkEffortFixedAssetStdPK workEffortFixedAssetStdPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ESTIMATED_QUANTITY")
    private BigDecimal estimatedQuantity;
    @Column(name = "ESTIMATED_DURATION")
    private BigDecimal estimatedDuration;
    @Column(name = "ESTIMATED_COST")
    private BigDecimal estimatedCost;
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
    @JoinColumn(name = "WORK_EFFORT_ID", referencedColumnName = "WORK_EFFORT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private WorkEffort workEffort;
    @JoinColumn(name = "FIXED_ASSET_TYPE_ID", referencedColumnName = "FIXED_ASSET_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private FixedAssetType fixedAssetType;

    public WorkEffortFixedAssetStd() {
    }

    public WorkEffortFixedAssetStd(WorkEffortFixedAssetStdPK workEffortFixedAssetStdPK) {
        this.workEffortFixedAssetStdPK = workEffortFixedAssetStdPK;
    }

    public WorkEffortFixedAssetStd(String workEffortId, String fixedAssetTypeId) {
        this.workEffortFixedAssetStdPK = new WorkEffortFixedAssetStdPK(workEffortId, fixedAssetTypeId);
    }

    public WorkEffortFixedAssetStdPK getWorkEffortFixedAssetStdPK() {
        return workEffortFixedAssetStdPK;
    }

    public void setWorkEffortFixedAssetStdPK(WorkEffortFixedAssetStdPK workEffortFixedAssetStdPK) {
        this.workEffortFixedAssetStdPK = workEffortFixedAssetStdPK;
    }

    public BigDecimal getEstimatedQuantity() {
        return estimatedQuantity;
    }

    public void setEstimatedQuantity(BigDecimal estimatedQuantity) {
        this.estimatedQuantity = estimatedQuantity;
    }

    public BigDecimal getEstimatedDuration() {
        return estimatedDuration;
    }

    public void setEstimatedDuration(BigDecimal estimatedDuration) {
        this.estimatedDuration = estimatedDuration;
    }

    public BigDecimal getEstimatedCost() {
        return estimatedCost;
    }

    public void setEstimatedCost(BigDecimal estimatedCost) {
        this.estimatedCost = estimatedCost;
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

    public WorkEffort getWorkEffort() {
        return workEffort;
    }

    public void setWorkEffort(WorkEffort workEffort) {
        this.workEffort = workEffort;
    }

    public FixedAssetType getFixedAssetType() {
        return fixedAssetType;
    }

    public void setFixedAssetType(FixedAssetType fixedAssetType) {
        this.fixedAssetType = fixedAssetType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (workEffortFixedAssetStdPK != null ? workEffortFixedAssetStdPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WorkEffortFixedAssetStd)) {
            return false;
        }
        WorkEffortFixedAssetStd other = (WorkEffortFixedAssetStd) object;
        if ((this.workEffortFixedAssetStdPK == null && other.workEffortFixedAssetStdPK != null) || (this.workEffortFixedAssetStdPK != null && !this.workEffortFixedAssetStdPK.equals(other.workEffortFixedAssetStdPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.WorkEffortFixedAssetStd[ workEffortFixedAssetStdPK=" + workEffortFixedAssetStdPK + " ]";
    }
    
}
