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
public class OrderAdjustmentAttributePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ORDER_ADJUSTMENT_ID")
    private String orderAdjustmentId;
    @Basic(optional = false)
    @Column(name = "ATTR_NAME")
    private String attrName;

    public OrderAdjustmentAttributePK() {
    }

    public OrderAdjustmentAttributePK(String orderAdjustmentId, String attrName) {
        this.orderAdjustmentId = orderAdjustmentId;
        this.attrName = attrName;
    }

    public String getOrderAdjustmentId() {
        return orderAdjustmentId;
    }

    public void setOrderAdjustmentId(String orderAdjustmentId) {
        this.orderAdjustmentId = orderAdjustmentId;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderAdjustmentId != null ? orderAdjustmentId.hashCode() : 0);
        hash += (attrName != null ? attrName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderAdjustmentAttributePK)) {
            return false;
        }
        OrderAdjustmentAttributePK other = (OrderAdjustmentAttributePK) object;
        if ((this.orderAdjustmentId == null && other.orderAdjustmentId != null) || (this.orderAdjustmentId != null && !this.orderAdjustmentId.equals(other.orderAdjustmentId))) {
            return false;
        }
        if ((this.attrName == null && other.attrName != null) || (this.attrName != null && !this.attrName.equals(other.attrName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.OrderAdjustmentAttributePK[ orderAdjustmentId=" + orderAdjustmentId + ", attrName=" + attrName + " ]";
    }
    
}
