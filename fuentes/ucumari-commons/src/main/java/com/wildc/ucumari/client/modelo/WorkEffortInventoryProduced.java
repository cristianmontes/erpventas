/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
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

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "work_effort_inventory_produced")
@NamedQueries({
    @NamedQuery(name = "WorkEffortInventoryProduced.findAll", query = "SELECT w FROM WorkEffortInventoryProduced w")})
public class WorkEffortInventoryProduced implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected WorkEffortInventoryProducedPK workEffortInventoryProducedPK;
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
    @JoinColumn(name = "INVENTORY_ITEM_ID", referencedColumnName = "INVENTORY_ITEM_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private InventoryItem inventoryItem;

    public WorkEffortInventoryProduced() {
    }

    public WorkEffortInventoryProduced(WorkEffortInventoryProducedPK workEffortInventoryProducedPK) {
        this.workEffortInventoryProducedPK = workEffortInventoryProducedPK;
    }

    public WorkEffortInventoryProduced(String workEffortId, String inventoryItemId) {
        this.workEffortInventoryProducedPK = new WorkEffortInventoryProducedPK(workEffortId, inventoryItemId);
    }

    public WorkEffortInventoryProducedPK getWorkEffortInventoryProducedPK() {
        return workEffortInventoryProducedPK;
    }

    public void setWorkEffortInventoryProducedPK(WorkEffortInventoryProducedPK workEffortInventoryProducedPK) {
        this.workEffortInventoryProducedPK = workEffortInventoryProducedPK;
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

    public InventoryItem getInventoryItem() {
        return inventoryItem;
    }

    public void setInventoryItem(InventoryItem inventoryItem) {
        this.inventoryItem = inventoryItem;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (workEffortInventoryProducedPK != null ? workEffortInventoryProducedPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WorkEffortInventoryProduced)) {
            return false;
        }
        WorkEffortInventoryProduced other = (WorkEffortInventoryProduced) object;
        if ((this.workEffortInventoryProducedPK == null && other.workEffortInventoryProducedPK != null) || (this.workEffortInventoryProducedPK != null && !this.workEffortInventoryProducedPK.equals(other.workEffortInventoryProducedPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.WorkEffortInventoryProduced[ workEffortInventoryProducedPK=" + workEffortInventoryProducedPK + " ]";
    }
    
}
