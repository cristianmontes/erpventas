/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.order.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "order_item_type")
public class OrderItemType implements Serializable {
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "orderItemType")
    private List<OrderItemTypeAttr> orderItemTypeAttrList;
    @OneToMany(mappedBy = "orderItemTypeId")
    private List<Requirement> requirementList;*/
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ORDER_ITEM_TYPE_ID")
    private String orderItemTypeId;
    @Column(name = "HAS_TABLE")
    private Character hasTable;
    @Column(name = "DESCRIPTION")
    private String description;
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
    /*@OneToMany(mappedBy = "parentTypeId")
    private List<OrderItemType> orderItemTypeList;*/
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "ORDER_ITEM_TYPE_ID")
    @ManyToOne
    private OrderItemType parentTypeId;
    /*@OneToMany(mappedBy = "orderItemTypeId")
    private List<OrderItem> orderItemList;*/

    public OrderItemType() {
    }

    public OrderItemType(String orderItemTypeId) {
        this.orderItemTypeId = orderItemTypeId;
    }

    public String getOrderItemTypeId() {
        return orderItemTypeId;
    }

    public void setOrderItemTypeId(String orderItemTypeId) {
        this.orderItemTypeId = orderItemTypeId;
    }

    public Character getHasTable() {
        return hasTable;
    }

    public void setHasTable(Character hasTable) {
        this.hasTable = hasTable;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
    public List<OrderItemType> getOrderItemTypeList() {
        return orderItemTypeList;
    }

    public void setOrderItemTypeList(List<OrderItemType> orderItemTypeList) {
        this.orderItemTypeList = orderItemTypeList;
    }*/

    public OrderItemType getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(OrderItemType parentTypeId) {
        this.parentTypeId = parentTypeId;
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
        hash += (orderItemTypeId != null ? orderItemTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderItemType)) {
            return false;
        }
        OrderItemType other = (OrderItemType) object;
        if ((this.orderItemTypeId == null && other.orderItemTypeId != null) || (this.orderItemTypeId != null && !this.orderItemTypeId.equals(other.orderItemTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.OrderItemType[ orderItemTypeId=" + orderItemTypeId + " ]";
    }
/*
    public List<Requirement> getRequirementList() {
        return requirementList;
    }

    public void setRequirementList(List<Requirement> requirementList) {
        this.requirementList = requirementList;
    }

    public List<OrderItemTypeAttr> getOrderItemTypeAttrList() {
        return orderItemTypeAttrList;
    }

    public void setOrderItemTypeAttrList(List<OrderItemTypeAttr> orderItemTypeAttrList) {
        this.orderItemTypeAttrList = orderItemTypeAttrList;
    }*/
    
}
