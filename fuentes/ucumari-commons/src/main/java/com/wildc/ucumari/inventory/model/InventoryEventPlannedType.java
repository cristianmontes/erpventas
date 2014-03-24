/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.inventory.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "inventory_event_planned_type")
public class InventoryEventPlannedType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "INVENTORY_EVENT_PLAN_TYPE_ID")
    private String inventoryEventPlanTypeId;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "IN_OUT")
    private Character inOut;
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
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "inventoryEventPlannedType")
    private List<InventoryEventPlanned> inventoryEventPlannedList;*/

    public InventoryEventPlannedType() {
    }

    public InventoryEventPlannedType(String inventoryEventPlanTypeId) {
        this.inventoryEventPlanTypeId = inventoryEventPlanTypeId;
    }

    public String getInventoryEventPlanTypeId() {
        return inventoryEventPlanTypeId;
    }

    public void setInventoryEventPlanTypeId(String inventoryEventPlanTypeId) {
        this.inventoryEventPlanTypeId = inventoryEventPlanTypeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Character getInOut() {
        return inOut;
    }

    public void setInOut(Character inOut) {
        this.inOut = inOut;
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
/*
    public List<InventoryEventPlanned> getInventoryEventPlannedList() {
        return inventoryEventPlannedList;
    }

    public void setInventoryEventPlannedList(List<InventoryEventPlanned> inventoryEventPlannedList) {
        this.inventoryEventPlannedList = inventoryEventPlannedList;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (inventoryEventPlanTypeId != null ? inventoryEventPlanTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InventoryEventPlannedType)) {
            return false;
        }
        InventoryEventPlannedType other = (InventoryEventPlannedType) object;
        if ((this.inventoryEventPlanTypeId == null && other.inventoryEventPlanTypeId != null) || (this.inventoryEventPlanTypeId != null && !this.inventoryEventPlanTypeId.equals(other.inventoryEventPlanTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.InventoryEventPlannedType[ inventoryEventPlanTypeId=" + inventoryEventPlanTypeId + " ]";
    }
    
}
