/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.shipment.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.inventory.model.InventoryItem;
import com.wildc.ucumari.order.model.OrderItem;
import com.wildc.ucumari.product.model.Product;
import com.wildc.ucumari.security.model.UserLogin;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "shipment_receipt")

public class ShipmentReceipt implements Serializable {
    /*@OneToMany(mappedBy = "shipmentReceiptId")
    private List<ReturnItemBilling> returnItemBillingList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "shipmentReceipt")
    private List<ShipmentReceiptRole> shipmentReceiptRoleList;
    @OneToMany(mappedBy = "shipmentReceiptId")
    private List<OrderItemBilling> orderItemBillingList;
    @OneToMany(mappedBy = "receiptId")
    private List<InventoryItemDetail> inventoryItemDetailList;*/
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "RECEIPT_ID")
    private String receiptId;
    @Column(name = "DATETIME_RECEIVED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datetimeReceived;
    @Column(name = "ITEM_DESCRIPTION")
    private String itemDescription;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "QUANTITY_ACCEPTED")
    private BigDecimal quantityAccepted;
    @Column(name = "QUANTITY_REJECTED")
    private BigDecimal quantityRejected;
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
    @JoinColumn(name = "RECEIVED_BY_USER_LOGIN_ID", referencedColumnName = "USER_LOGIN_ID")
    @ManyToOne
    private UserLogin receivedByUserLoginId;
    @JoinColumns({
        @JoinColumn(name = "SHIPMENT_ID", referencedColumnName = "SHIPMENT_ID"),
        @JoinColumn(name = "SHIPMENT_PACKAGE_SEQ_ID", referencedColumnName = "SHIPMENT_PACKAGE_SEQ_ID")})
    @ManyToOne
    private ShipmentPackage shipmentPackage;
    /*@JoinColumns({
        @JoinColumn(name = "RETURN_ID", referencedColumnName = "RETURN_ID"),
        @JoinColumn(name = "RETURN_ITEM_SEQ_ID", referencedColumnName = "RETURN_ITEM_SEQ_ID")})
    @ManyToOne
    private ReturnItem returnItem;*/
    @JoinColumn(name = "REJECTION_ID", referencedColumnName = "REJECTION_ID")
    @ManyToOne
    private RejectionReason rejectionId;
    @JoinColumn(name = "PRODUCT_ID", referencedColumnName = "PRODUCT_ID")
    @ManyToOne
    private Product productId;
    @JoinColumns({
        @JoinColumn(name = "ORDER_ID", referencedColumnName = "ORDER_ID"),
        @JoinColumn(name = "ORDER_ITEM_SEQ_ID", referencedColumnName = "ORDER_ITEM_SEQ_ID")})
    @ManyToOne
    private OrderItem orderItem;
    @JoinColumn(name = "INVENTORY_ITEM_ID", referencedColumnName = "INVENTORY_ITEM_ID")
    @ManyToOne
    private InventoryItem inventoryItemId;
    /*@OneToMany(mappedBy = "receiptId")
    private List<AcctgTrans> acctgTransList;*/

    public ShipmentReceipt() {
    }

    public ShipmentReceipt(String receiptId) {
        this.receiptId = receiptId;
    }

    public String getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(String receiptId) {
        this.receiptId = receiptId;
    }

    public Date getDatetimeReceived() {
        return datetimeReceived;
    }

    public void setDatetimeReceived(Date datetimeReceived) {
        this.datetimeReceived = datetimeReceived;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public BigDecimal getQuantityAccepted() {
        return quantityAccepted;
    }

    public void setQuantityAccepted(BigDecimal quantityAccepted) {
        this.quantityAccepted = quantityAccepted;
    }

    public BigDecimal getQuantityRejected() {
        return quantityRejected;
    }

    public void setQuantityRejected(BigDecimal quantityRejected) {
        this.quantityRejected = quantityRejected;
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

    public UserLogin getReceivedByUserLoginId() {
        return receivedByUserLoginId;
    }

    public void setReceivedByUserLoginId(UserLogin receivedByUserLoginId) {
        this.receivedByUserLoginId = receivedByUserLoginId;
    }

    public ShipmentPackage getShipmentPackage() {
        return shipmentPackage;
    }

    public void setShipmentPackage(ShipmentPackage shipmentPackage) {
        this.shipmentPackage = shipmentPackage;
    }
/*
    public ReturnItem getReturnItem() {
        return returnItem;
    }

    public void setReturnItem(ReturnItem returnItem) {
        this.returnItem = returnItem;
    }*/

    public RejectionReason getRejectionId() {
        return rejectionId;
    }

    public void setRejectionId(RejectionReason rejectionId) {
        this.rejectionId = rejectionId;
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

    public InventoryItem getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(InventoryItem inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }
/*
    public List<AcctgTrans> getAcctgTransList() {
        return acctgTransList;
    }

    public void setAcctgTransList(List<AcctgTrans> acctgTransList) {
        this.acctgTransList = acctgTransList;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (receiptId != null ? receiptId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ShipmentReceipt)) {
            return false;
        }
        ShipmentReceipt other = (ShipmentReceipt) object;
        if ((this.receiptId == null && other.receiptId != null) || (this.receiptId != null && !this.receiptId.equals(other.receiptId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ShipmentReceipt[ receiptId=" + receiptId + " ]";
    }
/*
    public List<InventoryItemDetail> getInventoryItemDetailList() {
        return inventoryItemDetailList;
    }

    public void setInventoryItemDetailList(List<InventoryItemDetail> inventoryItemDetailList) {
        this.inventoryItemDetailList = inventoryItemDetailList;
    }

    public List<OrderItemBilling> getOrderItemBillingList() {
        return orderItemBillingList;
    }

    public void setOrderItemBillingList(List<OrderItemBilling> orderItemBillingList) {
        this.orderItemBillingList = orderItemBillingList;
    }

    public List<ReturnItemBilling> getReturnItemBillingList() {
        return returnItemBillingList;
    }

    public void setReturnItemBillingList(List<ReturnItemBilling> returnItemBillingList) {
        this.returnItemBillingList = returnItemBillingList;
    }

    public List<ShipmentReceiptRole> getShipmentReceiptRoleList() {
        return shipmentReceiptRoleList;
    }

    public void setShipmentReceiptRoleList(List<ShipmentReceiptRole> shipmentReceiptRoleList) {
        this.shipmentReceiptRoleList = shipmentReceiptRoleList;
    }*/
    
}
