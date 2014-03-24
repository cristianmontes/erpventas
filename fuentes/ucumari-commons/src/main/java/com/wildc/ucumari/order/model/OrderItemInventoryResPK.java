/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.order.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class OrderItemInventoryResPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ORDER_ID")
    private String orderId;
    @Basic(optional = false)
    @Column(name = "ORDER_ITEM_SEQ_ID")
    private String orderItemSeqId;
    @Basic(optional = false)
    @Column(name = "INVENTORY_ITEM_ID")
    private String inventoryItemId;

    public OrderItemInventoryResPK() {
    }

    public OrderItemInventoryResPK(String orderId, String orderItemSeqId, String inventoryItemId) {
        this.orderId = orderId;
        this.orderItemSeqId = orderItemSeqId;
        this.inventoryItemId = inventoryItemId;
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

    public String getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderId != null ? orderId.hashCode() : 0);
        hash += (orderItemSeqId != null ? orderItemSeqId.hashCode() : 0);
        hash += (inventoryItemId != null ? inventoryItemId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderItemInventoryResPK)) {
            return false;
        }
        OrderItemInventoryResPK other = (OrderItemInventoryResPK) object;
        if ((this.orderId == null && other.orderId != null) || (this.orderId != null && !this.orderId.equals(other.orderId))) {
            return false;
        }
        if ((this.orderItemSeqId == null && other.orderItemSeqId != null) || (this.orderItemSeqId != null && !this.orderItemSeqId.equals(other.orderItemSeqId))) {
            return false;
        }
        if ((this.inventoryItemId == null && other.inventoryItemId != null) || (this.inventoryItemId != null && !this.inventoryItemId.equals(other.inventoryItemId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.OrderItemInventoryResPK[ orderId=" + orderId + ", orderItemSeqId=" + orderItemSeqId + ", inventoryItemId=" + inventoryItemId + " ]";
    }
    
}
