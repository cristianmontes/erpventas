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
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.inventory.model.InventoryItem;
import com.wildc.ucumari.order.model.OrderItem;
import com.wildc.ucumari.order.model.OrderItemShipGroup;
import com.wildc.ucumari.parameters.model.StatusItem;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "picklist_item")
@NamedQueries({
    @NamedQuery(name = "PicklistItem.findAll", query = "SELECT p FROM PicklistItem p")})
public class PicklistItem implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PicklistItemPK picklistItemPK;
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
    @JoinColumn(name = "ITEM_STATUS_ID", referencedColumnName = "STATUS_ID")
    @ManyToOne
    private StatusItem itemStatusId;
    @JoinColumns({
        @JoinColumn(name = "ORDER_ID", referencedColumnName = "ORDER_ID", insertable = false, updatable = false),
        @JoinColumn(name = "SHIP_GROUP_SEQ_ID", referencedColumnName = "SHIP_GROUP_SEQ_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private OrderItemShipGroup orderItemShipGroup;
    @JoinColumns({
        @JoinColumn(name = "ORDER_ID", referencedColumnName = "ORDER_ID", insertable = false, updatable = false),
        @JoinColumn(name = "ORDER_ITEM_SEQ_ID", referencedColumnName = "ORDER_ITEM_SEQ_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private OrderItem orderItem;
    @JoinColumn(name = "INVENTORY_ITEM_ID", referencedColumnName = "INVENTORY_ITEM_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private InventoryItem inventoryItem;
    @JoinColumn(name = "PICKLIST_BIN_ID", referencedColumnName = "PICKLIST_BIN_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private PicklistBin picklistBin;

    public PicklistItem() {
    }

    public PicklistItem(PicklistItemPK picklistItemPK) {
        this.picklistItemPK = picklistItemPK;
    }

    public PicklistItem(String picklistBinId, String orderId, String orderItemSeqId, String shipGroupSeqId, String inventoryItemId) {
        this.picklistItemPK = new PicklistItemPK(picklistBinId, orderId, orderItemSeqId, shipGroupSeqId, inventoryItemId);
    }

    public PicklistItemPK getPicklistItemPK() {
        return picklistItemPK;
    }

    public void setPicklistItemPK(PicklistItemPK picklistItemPK) {
        this.picklistItemPK = picklistItemPK;
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

    public StatusItem getItemStatusId() {
        return itemStatusId;
    }

    public void setItemStatusId(StatusItem itemStatusId) {
        this.itemStatusId = itemStatusId;
    }

    public OrderItemShipGroup getOrderItemShipGroup() {
        return orderItemShipGroup;
    }

    public void setOrderItemShipGroup(OrderItemShipGroup orderItemShipGroup) {
        this.orderItemShipGroup = orderItemShipGroup;
    }

    public OrderItem getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(OrderItem orderItem) {
        this.orderItem = orderItem;
    }

    public InventoryItem getInventoryItem() {
        return inventoryItem;
    }

    public void setInventoryItem(InventoryItem inventoryItem) {
        this.inventoryItem = inventoryItem;
    }

    public PicklistBin getPicklistBin() {
        return picklistBin;
    }

    public void setPicklistBin(PicklistBin picklistBin) {
        this.picklistBin = picklistBin;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (picklistItemPK != null ? picklistItemPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PicklistItem)) {
            return false;
        }
        PicklistItem other = (PicklistItem) object;
        if ((this.picklistItemPK == null && other.picklistItemPK != null) || (this.picklistItemPK != null && !this.picklistItemPK.equals(other.picklistItemPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PicklistItem[ picklistItemPK=" + picklistItemPK + " ]";
    }
    
}
