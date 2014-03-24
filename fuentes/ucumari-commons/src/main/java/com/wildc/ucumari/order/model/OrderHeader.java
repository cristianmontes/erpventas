/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.order.model;

import java.io.Serializable;
import java.math.BigDecimal;
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

import com.wildc.ucumari.facility.model.Facility;
import com.wildc.ucumari.parameters.model.Enumeration;
import com.wildc.ucumari.parameters.model.StatusItem;
import com.wildc.ucumari.parameters.model.Uom;
import com.wildc.ucumari.party.model.Party;
import com.wildc.ucumari.product.model.ProductStore;
import com.wildc.ucumari.security.model.UserLogin;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "order_header")

public class OrderHeader implements Serializable {
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "orderHeader")
    private List<TrackingCodeOrderReturn> trackingCodeOrderReturnList;
    @OneToMany(mappedBy = "orderId")
    private List<OrderAdjustment> orderAdjustmentList;
    @OneToMany(mappedBy = "orderId")
    private List<ValueLinkFulfillment> valueLinkFulfillmentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "orderHeader")
    private List<TrackingCodeOrder> trackingCodeOrderList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "orderHeader")
    private List<WorkOrderItemFulfillment> workOrderItemFulfillmentList;
    @OneToMany(mappedBy = "orderId")
    private List<PosTerminalLog> posTerminalLogList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "orderHeader")
    private List<ProductPromoUse> productPromoUseList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "orderHeader")
    private List<ProductOrderItem> productOrderItemList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "orderHeader1")
    private List<ProductOrderItem> productOrderItemList1;
    @OneToMany(mappedBy = "orderId")
    private List<GiftCardFulfillment> giftCardFulfillmentList;
    @OneToMany(mappedBy = "purchaseOrderId")
    private List<FixedAssetMaint> fixedAssetMaintList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "orderHeader")
    private List<CommunicationEventOrder> communicationEventOrderList;*/
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ORDER_ID")
    private String orderId;
    @Column(name = "ORDER_NAME")
    private String orderName;
    @Column(name = "EXTERNAL_ID")
    private String externalId;
    @Column(name = "ORDER_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date orderDate;
    @Column(name = "PRIORITY")
    private Character priority;
    @Column(name = "ENTRY_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date entryDate;
    @Column(name = "VISIT_ID")
    private String visitId;
    @Column(name = "FIRST_ATTEMPT_ORDER_ID")
    private String firstAttemptOrderId;
    @Column(name = "WEB_SITE_ID")
    private String webSiteId;
    @Column(name = "TERMINAL_ID")
    private String terminalId;
    @Column(name = "TRANSACTION_ID")
    private String transactionId;
    @Column(name = "NEEDS_INVENTORY_ISSUANCE")
    private Character needsInventoryIssuance;
    @Column(name = "IS_RUSH_ORDER")
    private Character isRushOrder;
    @Column(name = "INTERNAL_CODE")
    private String internalCode;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "REMAINING_SUB_TOTAL")
    private BigDecimal remainingSubTotal;
    @Column(name = "GRAND_TOTAL")
    private BigDecimal grandTotal;
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
    /*@OneToMany(mappedBy = "primaryOrderId")
    private List<Shipment> shipmentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "orderHeader")
    private List<OrderItemGroup> orderItemGroupList;*/
    @JoinColumn(name = "ORDER_TYPE_ID", referencedColumnName = "ORDER_TYPE_ID")
    @ManyToOne
    private OrderType orderTypeId;
    @JoinColumn(name = "SYNC_STATUS_ID", referencedColumnName = "STATUS_ID")
    @ManyToOne
    private StatusItem syncStatusId;
    @JoinColumn(name = "STATUS_ID", referencedColumnName = "STATUS_ID")
    @ManyToOne
    private StatusItem statusId;
    @JoinColumn(name = "SALES_CHANNEL_ENUM_ID", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration salesChannelEnumId;
    @JoinColumn(name = "PRODUCT_STORE_ID", referencedColumnName = "PRODUCT_STORE_ID")
    @ManyToOne
    private ProductStore productStoreId;
    @JoinColumn(name = "ORIGIN_FACILITY_ID", referencedColumnName = "FACILITY_ID")
    @ManyToOne
    private Facility originFacilityId;
    @JoinColumn(name = "CURRENCY_UOM", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom currencyUom;
    @JoinColumn(name = "CREATED_BY", referencedColumnName = "USER_LOGIN_ID")
    @ManyToOne
    private UserLogin createdBy;
    /*@JoinColumn(name = "BILLING_ACCOUNT_ID", referencedColumnName = "BILLING_ACCOUNT_ID")
    @ManyToOne
    private BillingAccount billingAccountId;
    @JoinColumn(name = "AUTO_ORDER_SHOPPING_LIST_ID", referencedColumnName = "SHOPPING_LIST_ID")
    @ManyToOne
    private ShoppingList autoOrderShoppingListId;*/
    @JoinColumn(name = "BILL_TO_PARTY_ID", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party billToPartyId;
    @JoinColumn(name = "BILL_FROM_PARTY_ID", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party billFromPartyId;
    /*@OneToMany(mappedBy = "orderId")
    private List<OrderPaymentPreference> orderPaymentPreferenceList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "orderHeader")
    private List<OrderItem> orderItemList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "orderHeader")
    private List<OrderItemShipGroup> orderItemShipGroupList;
    @OneToMany(mappedBy = "replacementOrderId")
    private List<ReturnItemResponse> returnItemResponseList;
    @OneToMany(mappedBy = "orderId")
    private List<ReturnItem> returnItemList;*/

    public OrderHeader() {
    }

    public OrderHeader(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Character getPriority() {
        return priority;
    }

    public void setPriority(Character priority) {
        this.priority = priority;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public String getVisitId() {
        return visitId;
    }

    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    public String getFirstAttemptOrderId() {
        return firstAttemptOrderId;
    }

    public void setFirstAttemptOrderId(String firstAttemptOrderId) {
        this.firstAttemptOrderId = firstAttemptOrderId;
    }

    public String getWebSiteId() {
        return webSiteId;
    }

    public void setWebSiteId(String webSiteId) {
        this.webSiteId = webSiteId;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Character getNeedsInventoryIssuance() {
        return needsInventoryIssuance;
    }

    public void setNeedsInventoryIssuance(Character needsInventoryIssuance) {
        this.needsInventoryIssuance = needsInventoryIssuance;
    }

    public Character getIsRushOrder() {
        return isRushOrder;
    }

    public void setIsRushOrder(Character isRushOrder) {
        this.isRushOrder = isRushOrder;
    }

    public String getInternalCode() {
        return internalCode;
    }

    public void setInternalCode(String internalCode) {
        this.internalCode = internalCode;
    }

    public BigDecimal getRemainingSubTotal() {
        return remainingSubTotal;
    }

    public void setRemainingSubTotal(BigDecimal remainingSubTotal) {
        this.remainingSubTotal = remainingSubTotal;
    }

    public BigDecimal getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(BigDecimal grandTotal) {
        this.grandTotal = grandTotal;
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
    public List<Shipment> getShipmentList() {
        return shipmentList;
    }

    public void setShipmentList(List<Shipment> shipmentList) {
        this.shipmentList = shipmentList;
    }

    public List<OrderItemGroup> getOrderItemGroupList() {
        return orderItemGroupList;
    }

    public void setOrderItemGroupList(List<OrderItemGroup> orderItemGroupList) {
        this.orderItemGroupList = orderItemGroupList;
    }*/
    
    public OrderType getOrderTypeId() {
        return orderTypeId;
    }

    public void setOrderTypeId(OrderType orderTypeId) {
        this.orderTypeId = orderTypeId;
    }

    public StatusItem getSyncStatusId() {
        return syncStatusId;
    }

    public void setSyncStatusId(StatusItem syncStatusId) {
        this.syncStatusId = syncStatusId;
    }

    public StatusItem getStatusId() {
        return statusId;
    }

    public void setStatusId(StatusItem statusId) {
        this.statusId = statusId;
    }

    public Enumeration getSalesChannelEnumId() {
        return salesChannelEnumId;
    }

    public void setSalesChannelEnumId(Enumeration salesChannelEnumId) {
        this.salesChannelEnumId = salesChannelEnumId;
    }

    public ProductStore getProductStoreId() {
        return productStoreId;
    }

    public void setProductStoreId(ProductStore productStoreId) {
        this.productStoreId = productStoreId;
    }

    public Facility getOriginFacilityId() {
        return originFacilityId;
    }

    public void setOriginFacilityId(Facility originFacilityId) {
        this.originFacilityId = originFacilityId;
    }

    public Uom getCurrencyUom() {
        return currencyUom;
    }

    public void setCurrencyUom(Uom currencyUom) {
        this.currencyUom = currencyUom;
    }

    public UserLogin getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(UserLogin createdBy) {
        this.createdBy = createdBy;
    }
/*
    public BillingAccount getBillingAccountId() {
        return billingAccountId;
    }

    public void setBillingAccountId(BillingAccount billingAccountId) {
        this.billingAccountId = billingAccountId;
    }

    public ShoppingList getAutoOrderShoppingListId() {
        return autoOrderShoppingListId;
    }

    public void setAutoOrderShoppingListId(ShoppingList autoOrderShoppingListId) {
        this.autoOrderShoppingListId = autoOrderShoppingListId;
    }*/

    public Party getBillToPartyId() {
        return billToPartyId;
    }

    public void setBillToPartyId(Party billToPartyId) {
        this.billToPartyId = billToPartyId;
    }

    public Party getBillFromPartyId() {
        return billFromPartyId;
    }

    public void setBillFromPartyId(Party billFromPartyId) {
        this.billFromPartyId = billFromPartyId;
    }
/*
    public List<OrderPaymentPreference> getOrderPaymentPreferenceList() {
        return orderPaymentPreferenceList;
    }

    public void setOrderPaymentPreferenceList(List<OrderPaymentPreference> orderPaymentPreferenceList) {
        this.orderPaymentPreferenceList = orderPaymentPreferenceList;
    }

    public List<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(List<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public List<OrderItemShipGroup> getOrderItemShipGroupList() {
        return orderItemShipGroupList;
    }

    public void setOrderItemShipGroupList(List<OrderItemShipGroup> orderItemShipGroupList) {
        this.orderItemShipGroupList = orderItemShipGroupList;
    }

    public List<ReturnItemResponse> getReturnItemResponseList() {
        return returnItemResponseList;
    }

    public void setReturnItemResponseList(List<ReturnItemResponse> returnItemResponseList) {
        this.returnItemResponseList = returnItemResponseList;
    }

    public List<ReturnItem> getReturnItemList() {
        return returnItemList;
    }

    public void setReturnItemList(List<ReturnItem> returnItemList) {
        this.returnItemList = returnItemList;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderId != null ? orderId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderHeader)) {
            return false;
        }
        OrderHeader other = (OrderHeader) object;
        if ((this.orderId == null && other.orderId != null) || (this.orderId != null && !this.orderId.equals(other.orderId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.OrderHeader[ orderId=" + orderId + " ]";
    }
/*
    public List<CommunicationEventOrder> getCommunicationEventOrderList() {
        return communicationEventOrderList;
    }

    public void setCommunicationEventOrderList(List<CommunicationEventOrder> communicationEventOrderList) {
        this.communicationEventOrderList = communicationEventOrderList;
    }

    public List<GiftCardFulfillment> getGiftCardFulfillmentList() {
        return giftCardFulfillmentList;
    }

    public void setGiftCardFulfillmentList(List<GiftCardFulfillment> giftCardFulfillmentList) {
        this.giftCardFulfillmentList = giftCardFulfillmentList;
    }

    public List<FixedAssetMaint> getFixedAssetMaintList() {
        return fixedAssetMaintList;
    }

    public void setFixedAssetMaintList(List<FixedAssetMaint> fixedAssetMaintList) {
        this.fixedAssetMaintList = fixedAssetMaintList;
    }

    public List<PosTerminalLog> getPosTerminalLogList() {
        return posTerminalLogList;
    }

    public void setPosTerminalLogList(List<PosTerminalLog> posTerminalLogList) {
        this.posTerminalLogList = posTerminalLogList;
    }

    public List<ProductPromoUse> getProductPromoUseList() {
        return productPromoUseList;
    }

    public void setProductPromoUseList(List<ProductPromoUse> productPromoUseList) {
        this.productPromoUseList = productPromoUseList;
    }

    public List<ProductOrderItem> getProductOrderItemList() {
        return productOrderItemList;
    }

    public void setProductOrderItemList(List<ProductOrderItem> productOrderItemList) {
        this.productOrderItemList = productOrderItemList;
    }

    public List<ProductOrderItem> getProductOrderItemList1() {
        return productOrderItemList1;
    }

    public void setProductOrderItemList1(List<ProductOrderItem> productOrderItemList1) {
        this.productOrderItemList1 = productOrderItemList1;
    }

    public List<TrackingCodeOrderReturn> getTrackingCodeOrderReturnList() {
        return trackingCodeOrderReturnList;
    }

    public void setTrackingCodeOrderReturnList(List<TrackingCodeOrderReturn> trackingCodeOrderReturnList) {
        this.trackingCodeOrderReturnList = trackingCodeOrderReturnList;
    }

    public List<OrderAdjustment> getOrderAdjustmentList() {
        return orderAdjustmentList;
    }

    public void setOrderAdjustmentList(List<OrderAdjustment> orderAdjustmentList) {
        this.orderAdjustmentList = orderAdjustmentList;
    }

    public List<ValueLinkFulfillment> getValueLinkFulfillmentList() {
        return valueLinkFulfillmentList;
    }

    public void setValueLinkFulfillmentList(List<ValueLinkFulfillment> valueLinkFulfillmentList) {
        this.valueLinkFulfillmentList = valueLinkFulfillmentList;
    }

    public List<TrackingCodeOrder> getTrackingCodeOrderList() {
        return trackingCodeOrderList;
    }

    public void setTrackingCodeOrderList(List<TrackingCodeOrder> trackingCodeOrderList) {
        this.trackingCodeOrderList = trackingCodeOrderList;
    }

    public List<WorkOrderItemFulfillment> getWorkOrderItemFulfillmentList() {
        return workOrderItemFulfillmentList;
    }

    public void setWorkOrderItemFulfillmentList(List<WorkOrderItemFulfillment> workOrderItemFulfillmentList) {
        this.workOrderItemFulfillmentList = workOrderItemFulfillmentList;
    }*/
    
}
