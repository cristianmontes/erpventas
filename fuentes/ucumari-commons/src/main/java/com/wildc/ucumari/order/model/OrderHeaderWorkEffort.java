/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.order.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.client.modelo.WorkEffort;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "order_header_work_effort")
@NamedQueries({
    @NamedQuery(name = "OrderHeaderWorkEffort.findAll", query = "SELECT o FROM OrderHeaderWorkEffort o")})
public class OrderHeaderWorkEffort implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OrderHeaderWorkEffortPK orderHeaderWorkEffortPK;
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
    @JoinColumn(name = "WORK_EFFORT_ID", referencedColumnName = "WORK_EFFORT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private WorkEffort workEffort;
    @JoinColumn(name = "ORDER_ID", referencedColumnName = "ORDER_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private OrderHeader orderHeader;

    public OrderHeaderWorkEffort() {
    }

    public OrderHeaderWorkEffort(OrderHeaderWorkEffortPK orderHeaderWorkEffortPK) {
        this.orderHeaderWorkEffortPK = orderHeaderWorkEffortPK;
    }

    public OrderHeaderWorkEffort(String orderId, String workEffortId) {
        this.orderHeaderWorkEffortPK = new OrderHeaderWorkEffortPK(orderId, workEffortId);
    }

    public OrderHeaderWorkEffortPK getOrderHeaderWorkEffortPK() {
        return orderHeaderWorkEffortPK;
    }

    public void setOrderHeaderWorkEffortPK(OrderHeaderWorkEffortPK orderHeaderWorkEffortPK) {
        this.orderHeaderWorkEffortPK = orderHeaderWorkEffortPK;
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

    public WorkEffort getWorkEffort() {
        return workEffort;
    }

    public void setWorkEffort(WorkEffort workEffort) {
        this.workEffort = workEffort;
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
        hash += (orderHeaderWorkEffortPK != null ? orderHeaderWorkEffortPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderHeaderWorkEffort)) {
            return false;
        }
        OrderHeaderWorkEffort other = (OrderHeaderWorkEffort) object;
        if ((this.orderHeaderWorkEffortPK == null && other.orderHeaderWorkEffortPK != null) || (this.orderHeaderWorkEffortPK != null && !this.orderHeaderWorkEffortPK.equals(other.orderHeaderWorkEffortPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.OrderHeaderWorkEffort[ orderHeaderWorkEffortPK=" + orderHeaderWorkEffortPK + " ]";
    }
    
}
