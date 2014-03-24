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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "order_type")

public class OrderType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ORDER_TYPE_ID")
    private String orderTypeId;
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
    /*@OneToMany(mappedBy = "orderTypeId")
    private List<OrderHeader> orderHeaderList;
    @OneToMany(mappedBy = "parentTypeId")
    private List<OrderType> orderTypeList;
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "ORDER_TYPE_ID")
    @ManyToOne
    private OrderType parentTypeId;*/

    public OrderType() {
    }

    public OrderType(String orderTypeId) {
        this.orderTypeId = orderTypeId;
    }

    public String getOrderTypeId() {
        return orderTypeId;
    }

    public void setOrderTypeId(String orderTypeId) {
        this.orderTypeId = orderTypeId;
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
    public List<OrderHeader> getOrderHeaderList() {
        return orderHeaderList;
    }

    public void setOrderHeaderList(List<OrderHeader> orderHeaderList) {
        this.orderHeaderList = orderHeaderList;
    }

    public List<OrderType> getOrderTypeList() {
        return orderTypeList;
    }

    public void setOrderTypeList(List<OrderType> orderTypeList) {
        this.orderTypeList = orderTypeList;
    }

    public OrderType getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(OrderType parentTypeId) {
        this.parentTypeId = parentTypeId;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderTypeId != null ? orderTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderType)) {
            return false;
        }
        OrderType other = (OrderType) object;
        if ((this.orderTypeId == null && other.orderTypeId != null) || (this.orderTypeId != null && !this.orderTypeId.equals(other.orderTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.OrderType[ orderTypeId=" + orderTypeId + " ]";
    }
    
}
