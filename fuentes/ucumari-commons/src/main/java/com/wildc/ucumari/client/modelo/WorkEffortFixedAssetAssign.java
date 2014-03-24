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

import com.wildc.ucumari.parameters.model.StatusItem;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "work_effort_fixed_asset_assign")
@NamedQueries({
    @NamedQuery(name = "WorkEffortFixedAssetAssign.findAll", query = "SELECT w FROM WorkEffortFixedAssetAssign w")})
public class WorkEffortFixedAssetAssign implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected WorkEffortFixedAssetAssignPK workEffortFixedAssetAssignPK;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ALLOCATED_COST")
    private BigDecimal allocatedCost;
    @Column(name = "COMMENTS")
    private String comments;
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
    @JoinColumn(name = "STATUS_ID", referencedColumnName = "STATUS_ID")
    @ManyToOne
    private StatusItem statusId;
    @JoinColumn(name = "FIXED_ASSET_ID", referencedColumnName = "FIXED_ASSET_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private FixedAsset fixedAsset;
    @JoinColumn(name = "AVAILABILITY_STATUS_ID", referencedColumnName = "STATUS_ID")
    @ManyToOne
    private StatusItem availabilityStatusId;

    public WorkEffortFixedAssetAssign() {
    }

    public WorkEffortFixedAssetAssign(WorkEffortFixedAssetAssignPK workEffortFixedAssetAssignPK) {
        this.workEffortFixedAssetAssignPK = workEffortFixedAssetAssignPK;
    }

    public WorkEffortFixedAssetAssign(String workEffortId, String fixedAssetId, Date fromDate) {
        this.workEffortFixedAssetAssignPK = new WorkEffortFixedAssetAssignPK(workEffortId, fixedAssetId, fromDate);
    }

    public WorkEffortFixedAssetAssignPK getWorkEffortFixedAssetAssignPK() {
        return workEffortFixedAssetAssignPK;
    }

    public void setWorkEffortFixedAssetAssignPK(WorkEffortFixedAssetAssignPK workEffortFixedAssetAssignPK) {
        this.workEffortFixedAssetAssignPK = workEffortFixedAssetAssignPK;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
    }

    public BigDecimal getAllocatedCost() {
        return allocatedCost;
    }

    public void setAllocatedCost(BigDecimal allocatedCost) {
        this.allocatedCost = allocatedCost;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
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

    public StatusItem getStatusId() {
        return statusId;
    }

    public void setStatusId(StatusItem statusId) {
        this.statusId = statusId;
    }

    public FixedAsset getFixedAsset() {
        return fixedAsset;
    }

    public void setFixedAsset(FixedAsset fixedAsset) {
        this.fixedAsset = fixedAsset;
    }

    public StatusItem getAvailabilityStatusId() {
        return availabilityStatusId;
    }

    public void setAvailabilityStatusId(StatusItem availabilityStatusId) {
        this.availabilityStatusId = availabilityStatusId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (workEffortFixedAssetAssignPK != null ? workEffortFixedAssetAssignPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WorkEffortFixedAssetAssign)) {
            return false;
        }
        WorkEffortFixedAssetAssign other = (WorkEffortFixedAssetAssign) object;
        if ((this.workEffortFixedAssetAssignPK == null && other.workEffortFixedAssetAssignPK != null) || (this.workEffortFixedAssetAssignPK != null && !this.workEffortFixedAssetAssignPK.equals(other.workEffortFixedAssetAssignPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.WorkEffortFixedAssetAssign[ workEffortFixedAssetAssignPK=" + workEffortFixedAssetAssignPK + " ]";
    }
    
}
