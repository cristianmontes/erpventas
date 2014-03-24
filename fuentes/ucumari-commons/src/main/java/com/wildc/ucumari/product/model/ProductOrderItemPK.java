/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.product.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class ProductOrderItemPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ORDER_ID")
    private String orderId;
    @Basic(optional = false)
    @Column(name = "ORDER_ITEM_SEQ_ID")
    private String orderItemSeqId;
    @Basic(optional = false)
    @Column(name = "ENGAGEMENT_ID")
    private String engagementId;
    @Basic(optional = false)
    @Column(name = "ENGAGEMENT_ITEM_SEQ_ID")
    private String engagementItemSeqId;

    public ProductOrderItemPK() {
    }

    public ProductOrderItemPK(String orderId, String orderItemSeqId, String engagementId, String engagementItemSeqId) {
        this.orderId = orderId;
        this.orderItemSeqId = orderItemSeqId;
        this.engagementId = engagementId;
        this.engagementItemSeqId = engagementItemSeqId;
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

    public String getEngagementId() {
        return engagementId;
    }

    public void setEngagementId(String engagementId) {
        this.engagementId = engagementId;
    }

    public String getEngagementItemSeqId() {
        return engagementItemSeqId;
    }

    public void setEngagementItemSeqId(String engagementItemSeqId) {
        this.engagementItemSeqId = engagementItemSeqId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderId != null ? orderId.hashCode() : 0);
        hash += (orderItemSeqId != null ? orderItemSeqId.hashCode() : 0);
        hash += (engagementId != null ? engagementId.hashCode() : 0);
        hash += (engagementItemSeqId != null ? engagementItemSeqId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductOrderItemPK)) {
            return false;
        }
        ProductOrderItemPK other = (ProductOrderItemPK) object;
        if ((this.orderId == null && other.orderId != null) || (this.orderId != null && !this.orderId.equals(other.orderId))) {
            return false;
        }
        if ((this.orderItemSeqId == null && other.orderItemSeqId != null) || (this.orderItemSeqId != null && !this.orderItemSeqId.equals(other.orderItemSeqId))) {
            return false;
        }
        if ((this.engagementId == null && other.engagementId != null) || (this.engagementId != null && !this.engagementId.equals(other.engagementId))) {
            return false;
        }
        if ((this.engagementItemSeqId == null && other.engagementItemSeqId != null) || (this.engagementItemSeqId != null && !this.engagementItemSeqId.equals(other.engagementItemSeqId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductOrderItemPK[ orderId=" + orderId + ", orderItemSeqId=" + orderItemSeqId + ", engagementId=" + engagementId + ", engagementItemSeqId=" + engagementItemSeqId + " ]";
    }
    
}
