/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.inventory.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.parameters.model.StatusItem;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "inventory_item_status")
public class InventoryItemStatus implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InventoryItemStatusPK inventoryItemStatusPK;
    @Column(name = "STATUS_END_DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date statusEndDatetime;
    @Column(name = "OWNER_PARTY_ID")
    private String ownerPartyId;
    @Column(name = "PRODUCT_ID")
    private String productId;
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
    @JoinColumn(name = "STATUS_ID", referencedColumnName = "STATUS_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private StatusItem statusItem;
    @JoinColumn(name = "INVENTORY_ITEM_ID", referencedColumnName = "INVENTORY_ITEM_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private InventoryItem inventoryItem;

    public InventoryItemStatus() {
    }

    public InventoryItemStatus(InventoryItemStatusPK inventoryItemStatusPK) {
        this.inventoryItemStatusPK = inventoryItemStatusPK;
    }

    public InventoryItemStatus(String inventoryItemId, String statusId, Date statusDatetime) {
        this.inventoryItemStatusPK = new InventoryItemStatusPK(inventoryItemId, statusId, statusDatetime);
    }

    public InventoryItemStatusPK getInventoryItemStatusPK() {
        return inventoryItemStatusPK;
    }

    public void setInventoryItemStatusPK(InventoryItemStatusPK inventoryItemStatusPK) {
        this.inventoryItemStatusPK = inventoryItemStatusPK;
    }

    public Date getStatusEndDatetime() {
        return statusEndDatetime;
    }

    public void setStatusEndDatetime(Date statusEndDatetime) {
        this.statusEndDatetime = statusEndDatetime;
    }

    public String getOwnerPartyId() {
        return ownerPartyId;
    }

    public void setOwnerPartyId(String ownerPartyId) {
        this.ownerPartyId = ownerPartyId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
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

    public StatusItem getStatusItem() {
        return statusItem;
    }

    public void setStatusItem(StatusItem statusItem) {
        this.statusItem = statusItem;
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
        hash += (inventoryItemStatusPK != null ? inventoryItemStatusPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InventoryItemStatus)) {
            return false;
        }
        InventoryItemStatus other = (InventoryItemStatus) object;
        if ((this.inventoryItemStatusPK == null && other.inventoryItemStatusPK != null) || (this.inventoryItemStatusPK != null && !this.inventoryItemStatusPK.equals(other.inventoryItemStatusPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.InventoryItemStatus[ inventoryItemStatusPK=" + inventoryItemStatusPK + " ]";
    }
    
}
