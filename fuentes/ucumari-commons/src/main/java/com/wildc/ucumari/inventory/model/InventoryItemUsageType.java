/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.inventory.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
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
@Table(name = "inventory_item_usage_type")
@NamedQueries({
    @NamedQuery(name = "InventoryItemUsageType.findAll", query = "SELECT i FROM InventoryItemUsageType i")})
public class InventoryItemUsageType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "INVENTORY_ITEM_USAGE_TYPE_ID")
    private String inventoryItemUsageTypeId;
    @Column(name = "DESCRIPTION")
    private String description;
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
    @OneToMany(mappedBy = "inventoryItemUsageTypeId")
    private List<InventoryItemTraceDetail> inventoryItemTraceDetailList;

    public InventoryItemUsageType() {
    }

    public InventoryItemUsageType(String inventoryItemUsageTypeId) {
        this.inventoryItemUsageTypeId = inventoryItemUsageTypeId;
    }

    public String getInventoryItemUsageTypeId() {
        return inventoryItemUsageTypeId;
    }

    public void setInventoryItemUsageTypeId(String inventoryItemUsageTypeId) {
        this.inventoryItemUsageTypeId = inventoryItemUsageTypeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public List<InventoryItemTraceDetail> getInventoryItemTraceDetailList() {
        return inventoryItemTraceDetailList;
    }

    public void setInventoryItemTraceDetailList(List<InventoryItemTraceDetail> inventoryItemTraceDetailList) {
        this.inventoryItemTraceDetailList = inventoryItemTraceDetailList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (inventoryItemUsageTypeId != null ? inventoryItemUsageTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InventoryItemUsageType)) {
            return false;
        }
        InventoryItemUsageType other = (InventoryItemUsageType) object;
        if ((this.inventoryItemUsageTypeId == null && other.inventoryItemUsageTypeId != null) || (this.inventoryItemUsageTypeId != null && !this.inventoryItemUsageTypeId.equals(other.inventoryItemUsageTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.InventoryItemUsageType[ inventoryItemUsageTypeId=" + inventoryItemUsageTypeId + " ]";
    }
    
}
