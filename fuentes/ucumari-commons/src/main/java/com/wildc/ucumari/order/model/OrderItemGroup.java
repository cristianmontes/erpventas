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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "order_item_group")
public class OrderItemGroup implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OrderItemGroupPK orderItemGroupPK;
    @Column(name = "GROUP_NAME")
    private String groupName;
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
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "orderItemGroup")
    private List<OrderItemGroup> orderItemGroupList;*/
    /*@JoinColumns({
        @JoinColumn(name = "ORDER_ID", referencedColumnName = "ORDER_ID"),
        @JoinColumn(name = "PARENT_GROUP_SEQ_ID", referencedColumnName = "ORDER_ITEM_GROUP_SEQ_ID")})
    @ManyToOne(optional = false)
    private OrderItemGroup orderItemGroup;*/
    @JoinColumn(name = "ORDER_ID", referencedColumnName = "ORDER_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private OrderHeader orderHeader;
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "orderItemGroup")
    private List<OrderItem> orderItemList;*/

    public OrderItemGroup() {
    }

    public OrderItemGroup(OrderItemGroupPK orderItemGroupPK) {
        this.orderItemGroupPK = orderItemGroupPK;
    }

    public OrderItemGroup(String orderId, String orderItemGroupSeqId) {
        this.orderItemGroupPK = new OrderItemGroupPK(orderId, orderItemGroupSeqId);
    }

    public OrderItemGroupPK getOrderItemGroupPK() {
        return orderItemGroupPK;
    }

    public void setOrderItemGroupPK(OrderItemGroupPK orderItemGroupPK) {
        this.orderItemGroupPK = orderItemGroupPK;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
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
/*
    public List<OrderItemGroup> getOrderItemGroupList() {
        return orderItemGroupList;
    }

    public void setOrderItemGroupList(List<OrderItemGroup> orderItemGroupList) {
        this.orderItemGroupList = orderItemGroupList;
    }*/
/*
    public OrderItemGroup getOrderItemGroup() {
        return orderItemGroup;
    }

    public void setOrderItemGroup(OrderItemGroup orderItemGroup) {
        this.orderItemGroup = orderItemGroup;
    }*/

    public OrderHeader getOrderHeader() {
        return orderHeader;
    }

    public void setOrderHeader(OrderHeader orderHeader) {
        this.orderHeader = orderHeader;
    }
/*
    public List<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(List<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderItemGroupPK != null ? orderItemGroupPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderItemGroup)) {
            return false;
        }
        OrderItemGroup other = (OrderItemGroup) object;
        if ((this.orderItemGroupPK == null && other.orderItemGroupPK != null) || (this.orderItemGroupPK != null && !this.orderItemGroupPK.equals(other.orderItemGroupPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.OrderItemGroup[ orderItemGroupPK=" + orderItemGroupPK + " ]";
    }
    
}
