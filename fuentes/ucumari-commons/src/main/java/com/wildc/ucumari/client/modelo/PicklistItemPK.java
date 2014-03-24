/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class PicklistItemPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PICKLIST_BIN_ID")
    private String picklistBinId;
    @Basic(optional = false)
    @Column(name = "ORDER_ID")
    private String orderId;
    @Basic(optional = false)
    @Column(name = "ORDER_ITEM_SEQ_ID")
    private String orderItemSeqId;
    @Basic(optional = false)
    @Column(name = "SHIP_GROUP_SEQ_ID")
    private String shipGroupSeqId;
    @Basic(optional = false)
    @Column(name = "INVENTORY_ITEM_ID")
    private String inventoryItemId;

    public PicklistItemPK() {
    }

    public PicklistItemPK(String picklistBinId, String orderId, String orderItemSeqId, String shipGroupSeqId, String inventoryItemId) {
        this.picklistBinId = picklistBinId;
        this.orderId = orderId;
        this.orderItemSeqId = orderItemSeqId;
        this.shipGroupSeqId = shipGroupSeqId;
        this.inventoryItemId = inventoryItemId;
    }

    public String getPicklistBinId() {
        return picklistBinId;
    }

    public void setPicklistBinId(String picklistBinId) {
        this.picklistBinId = picklistBinId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderItemSeqId() {
        return orderItemSeqId;
    }

    public void setOrderItemSeqId(String orderItemSeqId) {
        this.orderItemSeqId = orderItemSeqId;
    }

    public String getShipGroupSeqId() {
        return shipGroupSeqId;
    }

    public void setShipGroupSeqId(String shipGroupSeqId) {
        this.shipGroupSeqId = shipGroupSeqId;
    }

    public String getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (picklistBinId != null ? picklistBinId.hashCode() : 0);
        hash += (orderId != null ? orderId.hashCode() : 0);
        hash += (orderItemSeqId != null ? orderItemSeqId.hashCode() : 0);
        hash += (shipGroupSeqId != null ? shipGroupSeqId.hashCode() : 0);
        hash += (inventoryItemId != null ? inventoryItemId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PicklistItemPK)) {
            return false;
        }
        PicklistItemPK other = (PicklistItemPK) object;
        if ((this.picklistBinId == null && other.picklistBinId != null) || (this.picklistBinId != null && !this.picklistBinId.equals(other.picklistBinId))) {
            return false;
        }
        if ((this.orderId == null && other.orderId != null) || (this.orderId != null && !this.orderId.equals(other.orderId))) {
            return false;
        }
        if ((this.orderItemSeqId == null && other.orderItemSeqId != null) || (this.orderItemSeqId != null && !this.orderItemSeqId.equals(other.orderItemSeqId))) {
            return false;
        }
        if ((this.shipGroupSeqId == null && other.shipGroupSeqId != null) || (this.shipGroupSeqId != null && !this.shipGroupSeqId.equals(other.shipGroupSeqId))) {
            return false;
        }
        if ((this.inventoryItemId == null && other.inventoryItemId != null) || (this.inventoryItemId != null && !this.inventoryItemId.equals(other.inventoryItemId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PicklistItemPK[ picklistBinId=" + picklistBinId + ", orderId=" + orderId + ", orderItemSeqId=" + orderItemSeqId + ", shipGroupSeqId=" + shipGroupSeqId + ", inventoryItemId=" + inventoryItemId + " ]";
    }
    
}
