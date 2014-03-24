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

import com.wildc.ucumari.inventory.model.InventoryItem;
import com.wildc.ucumari.parameters.model.StatusItem;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "work_effort_inventory_assign")
@NamedQueries({
    @NamedQuery(name = "WorkEffortInventoryAssign.findAll", query = "SELECT w FROM WorkEffortInventoryAssign w")})
public class WorkEffortInventoryAssign implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected WorkEffortInventoryAssignPK workEffortInventoryAssignPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "QUANTITY")
    private BigDecimal quantity;
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
    @JoinColumn(name = "INVENTORY_ITEM_ID", referencedColumnName = "INVENTORY_ITEM_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private InventoryItem inventoryItem;

    public WorkEffortInventoryAssign() {
    }

    public WorkEffortInventoryAssign(WorkEffortInventoryAssignPK workEffortInventoryAssignPK) {
        this.workEffortInventoryAssignPK = workEffortInventoryAssignPK;
    }

    public WorkEffortInventoryAssign(String workEffortId, String inventoryItemId) {
        this.workEffortInventoryAssignPK = new WorkEffortInventoryAssignPK(workEffortId, inventoryItemId);
    }

    public WorkEffortInventoryAssignPK getWorkEffortInventoryAssignPK() {
        return workEffortInventoryAssignPK;
    }

    public void setWorkEffortInventoryAssignPK(WorkEffortInventoryAssignPK workEffortInventoryAssignPK) {
        this.workEffortInventoryAssignPK = workEffortInventoryAssignPK;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
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

    public InventoryItem getInventoryItem() {
        return inventoryItem;
    }

    public void setInventoryItem(InventoryItem inventoryItem) {
        this.inventoryItem = inventoryItem;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (workEffortInventoryAssignPK != null ? workEffortInventoryAssignPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WorkEffortInventoryAssign)) {
            return false;
        }
        WorkEffortInventoryAssign other = (WorkEffortInventoryAssign) object;
        if ((this.workEffortInventoryAssignPK == null && other.workEffortInventoryAssignPK != null) || (this.workEffortInventoryAssignPK != null && !this.workEffortInventoryAssignPK.equals(other.workEffortInventoryAssignPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.WorkEffortInventoryAssign[ workEffortInventoryAssignPK=" + workEffortInventoryAssignPK + " ]";
    }
    
}
