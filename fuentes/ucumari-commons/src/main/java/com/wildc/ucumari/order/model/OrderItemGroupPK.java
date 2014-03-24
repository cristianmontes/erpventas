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
public class OrderItemGroupPK implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 7502914870897755893L;
	@Basic(optional = false)
    @Column(name = "ORDER_ID")
    private String orderId;
    @Basic(optional = false)
    @Column(name = "ORDER_ITEM_GROUP_SEQ_ID")
    private String orderItemGroupSeqId;

    public OrderItemGroupPK() {
    }

    public OrderItemGroupPK(String orderId, String orderItemGroupSeqId) {
        this.orderId = orderId;
        this.orderItemGroupSeqId = orderItemGroupSeqId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderItemGroupSeqId() {
        return orderItemGroupSeqId;
    }

    public void setOrderItemGroupSeqId(String orderItemGroupSeqId) {
        this.orderItemGroupSeqId = orderItemGroupSeqId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderId != null ? orderId.hashCode() : 0);
        hash += (orderItemGroupSeqId != null ? orderItemGroupSeqId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderItemGroupPK)) {
            return false;
        }
        OrderItemGroupPK other = (OrderItemGroupPK) object;
        if ((this.orderId == null && other.orderId != null) || (this.orderId != null && !this.orderId.equals(other.orderId))) {
            return false;
        }
        if ((this.orderItemGroupSeqId == null && other.orderItemGroupSeqId != null) || (this.orderItemGroupSeqId != null && !this.orderItemGroupSeqId.equals(other.orderItemGroupSeqId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.OrderItemGroupPK[ orderId=" + orderId + ", orderItemGroupSeqId=" + orderItemGroupSeqId + " ]";
    }
    
}
