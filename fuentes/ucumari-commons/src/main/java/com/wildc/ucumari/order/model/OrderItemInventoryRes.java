/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.order.model;

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

import com.wildc.ucumari.inventory.model.InventoryItem;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "order_item_inventory_res")
@NamedQueries({
    @NamedQuery(name = "OrderItemInventoryRes.findAll", query = "SELECT o FROM OrderItemInventoryRes o")})
public class OrderItemInventoryRes implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OrderItemInventoryResPK orderItemInventoryResPK;
    @Column(name = "RESERVE_ORDER_ENUM_ID")
    private String reserveOrderEnumId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "QUANTITY")
    private BigDecimal quantity;
    @Column(name = "QUANTITY_NOT_AVAILABLE")
    private BigDecimal quantityNotAvailable;
    @Column(name = "RESERVED_DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date reservedDatetime;
    @Column(name = "CREATED_DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDatetime;
    @Column(name = "PROMISED_DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date promisedDatetime;
    @Column(name = "CURRENT_PROMISED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date currentPromisedDate;
    @Column(name = "PICK_START_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pickStartDate;
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
    @JoinColumns({
        @JoinColumn(name = "ORDER_ID", referencedColumnName = "ORDER_ID", insertable = false, updatable = false),
        @JoinColumn(name = "ORDER_ITEM_SEQ_ID", referencedColumnName = "ORDER_ITEM_SEQ_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private OrderItem orderItem;
    @JoinColumn(name = "INVENTORY_ITEM_ID", referencedColumnName = "INVENTORY_ITEM_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private InventoryItem inventoryItem;

    public OrderItemInventoryRes() {
    }

    public OrderItemInventoryRes(OrderItemInventoryResPK orderItemInventoryResPK) {
        this.orderItemInventoryResPK = orderItemInventoryResPK;
    }

    public OrderItemInventoryRes(String orderId, String orderItemSeqId, String inventoryItemId) {
        this.orderItemInventoryResPK = new OrderItemInventoryResPK(orderId, orderItemSeqId, inventoryItemId);
    }

    public OrderItemInventoryResPK getOrderItemInventoryResPK() {
        return orderItemInventoryResPK;
    }

    public void setOrderItemInventoryResPK(OrderItemInventoryResPK orderItemInventoryResPK) {
        this.orderItemInventoryResPK = orderItemInventoryResPK;
    }

    public String getReserveOrderEnumId() {
        return reserveOrderEnumId;
    }

    public void setReserveOrderEnumId(String reserveOrderEnumId) {
        this.reserveOrderEnumId = reserveOrderEnumId;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getQuantityNotAvailable() {
        return quantityNotAvailable;
    }

    public void setQuantityNotAvailable(BigDecimal quantityNotAvailable) {
        this.quantityNotAvailable = quantityNotAvailable;
    }

    public Date getReservedDatetime() {
        return reservedDatetime;
    }

    public void setReservedDatetime(Date reservedDatetime) {
        this.reservedDatetime = reservedDatetime;
    }

    public Date getCreatedDatetime() {
        return createdDatetime;
    }

    public void setCreatedDatetime(Date createdDatetime) {
        this.createdDatetime = createdDatetime;
    }

    public Date getPromisedDatetime() {
        return promisedDatetime;
    }

    public void setPromisedDatetime(Date promisedDatetime) {
        this.promisedDatetime = promisedDatetime;
    }

    public Date getCurrentPromisedDate() {
        return currentPromisedDate;
    }

    public void setCurrentPromisedDate(Date currentPromisedDate) {
        this.currentPromisedDate = currentPromisedDate;
    }

    public Date getPickStartDate() {
        return pickStartDate;
    }

    public void setPickStartDate(Date pickStartDate) {
        this.pickStartDate = pickStartDate;
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

    public OrderItem getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(OrderItem orderItem) {
        this.orderItem = orderItem;
    }

    public InventoryItem getInventoryItem() {
        return inventoryItem;
    }

    public void setInventoryItem(InventoryItem inventoryItem) {
        this.inventoryItem = inventoryItem;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderItemInventoryResPK != null ? orderItemInventoryResPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderItemInventoryRes)) {
            return false;
        }
        OrderItemInventoryRes other = (OrderItemInventoryRes) object;
        if ((this.orderItemInventoryResPK == null && other.orderItemInventoryResPK != null) || (this.orderItemInventoryResPK != null && !this.orderItemInventoryResPK.equals(other.orderItemInventoryResPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.OrderItemInventoryRes[ orderItemInventoryResPK=" + orderItemInventoryResPK + " ]";
    }
    
}
