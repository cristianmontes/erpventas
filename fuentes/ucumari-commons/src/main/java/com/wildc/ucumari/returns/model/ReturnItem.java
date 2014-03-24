/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.returns.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.order.model.OrderHeader;
import com.wildc.ucumari.order.model.OrderItem;
import com.wildc.ucumari.parameters.model.StatusItem;
import com.wildc.ucumari.product.model.Product;
import com.wildc.ucumari.shipment.model.ShipmentReceipt;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "return_item")
@NamedQueries({
    @NamedQuery(name = "ReturnItem.findAll", query = "SELECT r FROM ReturnItem r")})
public class ReturnItem implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "returnItem")
    private List<ReturnItemBilling> returnItemBillingList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "returnItem")
    private List<ReturnItemShipment> returnItemShipmentList;
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ReturnItemPK returnItemPK;
    @Column(name = "DESCRIPTION")
    private String description;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "RETURN_QUANTITY")
    private BigDecimal returnQuantity;
    @Column(name = "RECEIVED_QUANTITY")
    private BigDecimal receivedQuantity;
    @Column(name = "RETURN_PRICE")
    private BigDecimal returnPrice;
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
    @OneToMany(mappedBy = "returnItem")
    private List<ShipmentReceipt> shipmentReceiptList;
    @JoinColumn(name = "RETURN_TYPE_ID", referencedColumnName = "RETURN_TYPE_ID")
    @ManyToOne
    private ReturnType returnTypeId;
    @JoinColumn(name = "RETURN_ITEM_TYPE_ID", referencedColumnName = "RETURN_ITEM_TYPE_ID")
    @ManyToOne
    private ReturnItemType returnItemTypeId;
    @JoinColumn(name = "STATUS_ID", referencedColumnName = "STATUS_ID")
    @ManyToOne
    private StatusItem statusId;
    @JoinColumn(name = "RETURN_ID", referencedColumnName = "RETURN_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ReturnHeader returnHeader;
    @JoinColumn(name = "RETURN_ITEM_RESPONSE_ID", referencedColumnName = "RETURN_ITEM_RESPONSE_ID")
    @ManyToOne
    private ReturnItemResponse returnItemResponseId;
    @JoinColumn(name = "RETURN_REASON_ID", referencedColumnName = "RETURN_REASON_ID")
    @ManyToOne
    private ReturnReason returnReasonId;
    @JoinColumn(name = "PRODUCT_ID", referencedColumnName = "PRODUCT_ID")
    @ManyToOne
    private Product productId;
    @JoinColumns({
        @JoinColumn(name = "ORDER_ID", referencedColumnName = "ORDER_ID"),
        @JoinColumn(name = "ORDER_ITEM_SEQ_ID", referencedColumnName = "ORDER_ITEM_SEQ_ID")})
    @ManyToOne
    private OrderItem orderItem;
    @JoinColumn(name = "ORDER_ID", referencedColumnName = "ORDER_ID")
    @ManyToOne
    private OrderHeader orderId;
    @JoinColumn(name = "EXPECTED_ITEM_STATUS", referencedColumnName = "STATUS_ID")
    @ManyToOne
    private StatusItem expectedItemStatus;

    public ReturnItem() {
    }

    public ReturnItem(ReturnItemPK returnItemPK) {
        this.returnItemPK = returnItemPK;
    }

    public ReturnItem(String returnId, String returnItemSeqId) {
        this.returnItemPK = new ReturnItemPK(returnId, returnItemSeqId);
    }

    public ReturnItemPK getReturnItemPK() {
        return returnItemPK;
    }

    public void setReturnItemPK(ReturnItemPK returnItemPK) {
        this.returnItemPK = returnItemPK;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getReturnQuantity() {
        return returnQuantity;
    }

    public void setReturnQuantity(BigDecimal returnQuantity) {
        this.returnQuantity = returnQuantity;
    }

    public BigDecimal getReceivedQuantity() {
        return receivedQuantity;
    }

    public void setReceivedQuantity(BigDecimal receivedQuantity) {
        this.receivedQuantity = receivedQuantity;
    }

    public BigDecimal getReturnPrice() {
        return returnPrice;
    }

    public void setReturnPrice(BigDecimal returnPrice) {
        this.returnPrice = returnPrice;
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

    public List<ShipmentReceipt> getShipmentReceiptList() {
        return shipmentReceiptList;
    }

    public void setShipmentReceiptList(List<ShipmentReceipt> shipmentReceiptList) {
        this.shipmentReceiptList = shipmentReceiptList;
    }

    public ReturnType getReturnTypeId() {
        return returnTypeId;
    }

    public void setReturnTypeId(ReturnType returnTypeId) {
        this.returnTypeId = returnTypeId;
    }

    public ReturnItemType getReturnItemTypeId() {
        return returnItemTypeId;
    }

    public void setReturnItemTypeId(ReturnItemType returnItemTypeId) {
        this.returnItemTypeId = returnItemTypeId;
    }

    public StatusItem getStatusId() {
        return statusId;
    }

    public void setStatusId(StatusItem statusId) {
        this.statusId = statusId;
    }

    public ReturnHeader getReturnHeader() {
        return returnHeader;
    }

    public void setReturnHeader(ReturnHeader returnHeader) {
        this.returnHeader = returnHeader;
    }

    public ReturnItemResponse getReturnItemResponseId() {
        return returnItemResponseId;
    }

    public void setReturnItemResponseId(ReturnItemResponse returnItemResponseId) {
        this.returnItemResponseId = returnItemResponseId;
    }

    public ReturnReason getReturnReasonId() {
        return returnReasonId;
    }

    public void setReturnReasonId(ReturnReason returnReasonId) {
        this.returnReasonId = returnReasonId;
    }

    public Product getProductId() {
        return productId;
    }

    public void setProductId(Product productId) {
        this.productId = productId;
    }

    public OrderItem getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(OrderItem orderItem) {
        this.orderItem = orderItem;
    }

    public OrderHeader getOrderId() {
        return orderId;
    }

    public void setOrderId(OrderHeader orderId) {
        this.orderId = orderId;
    }

    public StatusItem getExpectedItemStatus() {
        return expectedItemStatus;
    }

    public void setExpectedItemStatus(StatusItem expectedItemStatus) {
        this.expectedItemStatus = expectedItemStatus;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (returnItemPK != null ? returnItemPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReturnItem)) {
            return false;
        }
        ReturnItem other = (ReturnItem) object;
        if ((this.returnItemPK == null && other.returnItemPK != null) || (this.returnItemPK != null && !this.returnItemPK.equals(other.returnItemPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ReturnItem[ returnItemPK=" + returnItemPK + " ]";
    }

    public List<ReturnItemBilling> getReturnItemBillingList() {
        return returnItemBillingList;
    }

    public void setReturnItemBillingList(List<ReturnItemBilling> returnItemBillingList) {
        this.returnItemBillingList = returnItemBillingList;
    }

    public List<ReturnItemShipment> getReturnItemShipmentList() {
        return returnItemShipmentList;
    }

    public void setReturnItemShipmentList(List<ReturnItemShipment> returnItemShipmentList) {
        this.returnItemShipmentList = returnItemShipmentList;
    }
    
}
