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
public class WorkOrderItemFulfillmentPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "WORK_EFFORT_ID")
    private String workEffortId;
    @Basic(optional = false)
    @Column(name = "ORDER_ID")
    private String orderId;
    @Basic(optional = false)
    @Column(name = "ORDER_ITEM_SEQ_ID")
    private String orderItemSeqId;

    public WorkOrderItemFulfillmentPK() {
    }

    public WorkOrderItemFulfillmentPK(String workEffortId, String orderId, String orderItemSeqId) {
        this.workEffortId = workEffortId;
        this.orderId = orderId;
        this.orderItemSeqId = orderItemSeqId;
    }

    public String getWorkEffortId() {
        return workEffortId;
    }

    public void setWorkEffortId(String workEffortId) {
        this.workEffortId = workEffortId;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (workEffortId != null ? workEffortId.hashCode() : 0);
        hash += (orderId != null ? orderId.hashCode() : 0);
        hash += (orderItemSeqId != null ? orderItemSeqId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WorkOrderItemFulfillmentPK)) {
            return false;
        }
        WorkOrderItemFulfillmentPK other = (WorkOrderItemFulfillmentPK) object;
        if ((this.workEffortId == null && other.workEffortId != null) || (this.workEffortId != null && !this.workEffortId.equals(other.workEffortId))) {
            return false;
        }
        if ((this.orderId == null && other.orderId != null) || (this.orderId != null && !this.orderId.equals(other.orderId))) {
            return false;
        }
        if ((this.orderItemSeqId == null && other.orderItemSeqId != null) || (this.orderItemSeqId != null && !this.orderItemSeqId.equals(other.orderItemSeqId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.WorkOrderItemFulfillmentPK[ workEffortId=" + workEffortId + ", orderId=" + orderId + ", orderItemSeqId=" + orderItemSeqId + " ]";
    }
    
}
