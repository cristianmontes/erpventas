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
public class OrderItemShipGroupPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ORDER_ID")
    private String orderId;
    @Basic(optional = false)
    @Column(name = "SHIP_GROUP_SEQ_ID")
    private String shipGroupSeqId;

    public OrderItemShipGroupPK() {
    }

    public OrderItemShipGroupPK(String orderId, String shipGroupSeqId) {
        this.orderId = orderId;
        this.shipGroupSeqId = shipGroupSeqId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getShipGroupSeqId() {
        return shipGroupSeqId;
    }

    public void setShipGroupSeqId(String shipGroupSeqId) {
        this.shipGroupSeqId = shipGroupSeqId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderId != null ? orderId.hashCode() : 0);
        hash += (shipGroupSeqId != null ? shipGroupSeqId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderItemShipGroupPK)) {
            return false;
        }
        OrderItemShipGroupPK other = (OrderItemShipGroupPK) object;
        if ((this.orderId == null && other.orderId != null) || (this.orderId != null && !this.orderId.equals(other.orderId))) {
            return false;
        }
        if ((this.shipGroupSeqId == null && other.shipGroupSeqId != null) || (this.shipGroupSeqId != null && !this.shipGroupSeqId.equals(other.shipGroupSeqId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.OrderItemShipGroupPK[ orderId=" + orderId + ", shipGroupSeqId=" + shipGroupSeqId + " ]";
    }
    
}
