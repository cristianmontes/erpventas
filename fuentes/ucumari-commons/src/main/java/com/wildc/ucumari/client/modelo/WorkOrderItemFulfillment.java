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

import com.wildc.ucumari.order.model.OrderHeader;
import com.wildc.ucumari.order.model.OrderItem;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "work_order_item_fulfillment")
@NamedQueries({
    @NamedQuery(name = "WorkOrderItemFulfillment.findAll", query = "SELECT w FROM WorkOrderItemFulfillment w")})
public class WorkOrderItemFulfillment implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected WorkOrderItemFulfillmentPK workOrderItemFulfillmentPK;
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
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "QUANTITY_FULFILLED")
    private BigDecimal quantityFulfilled;
    @JoinColumn(name = "WORK_EFFORT_ID", referencedColumnName = "WORK_EFFORT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private WorkEffort workEffort;
    @JoinColumns({
        @JoinColumn(name = "ORDER_ID", referencedColumnName = "ORDER_ID", insertable = false, updatable = false),
        @JoinColumn(name = "ORDER_ITEM_SEQ_ID", referencedColumnName = "ORDER_ITEM_SEQ_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private OrderItem orderItem;
    @JoinColumn(name = "ORDER_ID", referencedColumnName = "ORDER_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private OrderHeader orderHeader;

    public WorkOrderItemFulfillment() {
    }

    public WorkOrderItemFulfillment(WorkOrderItemFulfillmentPK workOrderItemFulfillmentPK) {
        this.workOrderItemFulfillmentPK = workOrderItemFulfillmentPK;
    }

    public WorkOrderItemFulfillment(String workEffortId, String orderId, String orderItemSeqId) {
        this.workOrderItemFulfillmentPK = new WorkOrderItemFulfillmentPK(workEffortId, orderId, orderItemSeqId);
    }

    public WorkOrderItemFulfillmentPK getWorkOrderItemFulfillmentPK() {
        return workOrderItemFulfillmentPK;
    }

    public void setWorkOrderItemFulfillmentPK(WorkOrderItemFulfillmentPK workOrderItemFulfillmentPK) {
        this.workOrderItemFulfillmentPK = workOrderItemFulfillmentPK;
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

    public BigDecimal getQuantityFulfilled() {
        return quantityFulfilled;
    }

    public void setQuantityFulfilled(BigDecimal quantityFulfilled) {
        this.quantityFulfilled = quantityFulfilled;
    }

    public WorkEffort getWorkEffort() {
        return workEffort;
    }

    public void setWorkEffort(WorkEffort workEffort) {
        this.workEffort = workEffort;
    }

    public OrderItem getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(OrderItem orderItem) {
        this.orderItem = orderItem;
    }

    public OrderHeader getOrderHeader() {
        return orderHeader;
    }

    public void setOrderHeader(OrderHeader orderHeader) {
        this.orderHeader = orderHeader;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (workOrderItemFulfillmentPK != null ? workOrderItemFulfillmentPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WorkOrderItemFulfillment)) {
            return false;
        }
        WorkOrderItemFulfillment other = (WorkOrderItemFulfillment) object;
        if ((this.workOrderItemFulfillmentPK == null && other.workOrderItemFulfillmentPK != null) || (this.workOrderItemFulfillmentPK != null && !this.workOrderItemFulfillmentPK.equals(other.workOrderItemFulfillmentPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.WorkOrderItemFulfillment[ workOrderItemFulfillmentPK=" + workOrderItemFulfillmentPK + " ]";
    }
    
}
