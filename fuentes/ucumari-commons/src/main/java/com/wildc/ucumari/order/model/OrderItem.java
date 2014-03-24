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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.inventory.model.InventoryItem;
import com.wildc.ucumari.parameters.model.StatusItem;
import com.wildc.ucumari.parameters.model.Uom;
import com.wildc.ucumari.product.model.Product;
import com.wildc.ucumari.quote.model.QuoteItem;
import com.wildc.ucumari.quote.model.SalesOpportunity;
import com.wildc.ucumari.security.model.UserLogin;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "order_item")
public class OrderItem implements Serializable {
    @OneToMany(mappedBy = "orderItem")
    /*private List<Subscription> subscriptionList;
    @OneToMany(mappedBy = "orderItem")
    private List<ValueLinkFulfillment> valueLinkFulfillmentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "orderItem")
    private List<WorkOrderItemFulfillment> workOrderItemFulfillmentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "orderItem")
    private List<ProductOrderItem> productOrderItemList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "orderItem1")
    private List<ProductOrderItem> productOrderItemList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "orderItem")
    private List<PicklistItem> picklistItemList;
    @OneToMany(mappedBy = "orderItem")
    private List<GiftCardFulfillment> giftCardFulfillmentList;
    @OneToMany(mappedBy = "orderItem")
    private List<ItemIssuance> itemIssuanceList;*/
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OrderItemPK orderItemPK;
    @Column(name = "EXTERNAL_ID")
    private String externalId;
    @Column(name = "IS_ITEM_GROUP_PRIMARY")
    private Character isItemGroupPrimary;
    @Column(name = "BUDGET_ID")
    private String budgetId;
    @Column(name = "BUDGET_ITEM_SEQ_ID")
    private String budgetItemSeqId;
    @Column(name = "PRODUCT_FEATURE_ID")
    private String productFeatureId;
    @Column(name = "PROD_CATALOG_ID")
    private String prodCatalogId;
    @Column(name = "PRODUCT_CATEGORY_ID")
    private String productCategoryId;
    @Column(name = "IS_PROMO")
    private Character isPromo;
    @Column(name = "SHOPPING_LIST_ID")
    private String shoppingListId;
    @Column(name = "SHOPPING_LIST_ITEM_SEQ_ID")
    private String shoppingListItemSeqId;
    @Column(name = "SUBSCRIPTION_ID")
    private String subscriptionId;
    @Column(name = "DEPLOYMENT_ID")
    private String deploymentId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "QUANTITY")
    private BigDecimal quantity;
    @Column(name = "CANCEL_QUANTITY")
    private BigDecimal cancelQuantity;
    @Column(name = "SELECTED_AMOUNT")
    private BigDecimal selectedAmount;
    @Column(name = "UNIT_PRICE")
    private BigDecimal unitPrice;
    @Column(name = "UNIT_LIST_PRICE")
    private BigDecimal unitListPrice;
    @Column(name = "UNIT_AVERAGE_COST")
    private BigDecimal unitAverageCost;
    @Column(name = "UNIT_RECURRING_PRICE")
    private BigDecimal unitRecurringPrice;
    @Column(name = "IS_MODIFIED_PRICE")
    private Character isModifiedPrice;
    @Column(name = "ITEM_DESCRIPTION")
    private String itemDescription;
    @Column(name = "COMMENTS")
    private String comments;
    @Column(name = "CORRESPONDING_PO_ID")
    private String correspondingPoId;
    @Column(name = "ESTIMATED_SHIP_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date estimatedShipDate;
    @Column(name = "ESTIMATED_DELIVERY_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date estimatedDeliveryDate;
    @Column(name = "AUTO_CANCEL_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date autoCancelDate;
    @Column(name = "DONT_CANCEL_SET_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dontCancelSetDate;
    @Column(name = "SHIP_BEFORE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date shipBeforeDate;
    @Column(name = "SHIP_AFTER_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date shipAfterDate;
    @Column(name = "CANCEL_BACK_ORDER_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cancelBackOrderDate;
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
    /*@OneToMany(mappedBy = "orderItem")
    private List<ShipmentReceipt> shipmentReceiptList;    
    @OneToMany(mappedBy = "orderItem")
    private List<FixedAsset> fixedAssetList;
    @JoinColumn(name = "ACCTG_TAG_ENUM_ID9", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration acctgTagEnumId9;
    @JoinColumn(name = "ACCTG_TAG_ENUM_ID8", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration acctgTagEnumId8;
    @JoinColumn(name = "ACCTG_TAG_ENUM_ID7", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration acctgTagEnumId7;
    @JoinColumn(name = "ACCTG_TAG_ENUM_ID6", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration acctgTagEnumId6;
    @JoinColumn(name = "ACCTG_TAG_ENUM_ID5", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration acctgTagEnumId5;
    @JoinColumn(name = "ACCTG_TAG_ENUM_ID4", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration acctgTagEnumId4;
    @JoinColumn(name = "ACCTG_TAG_ENUM_ID3", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration acctgTagEnumId3;
    @JoinColumn(name = "ACCTG_TAG_ENUM_ID2", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration acctgTagEnumId2;
    @JoinColumn(name = "ACCTG_TAG_ENUM_ID10", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration acctgTagEnumId10;
    @JoinColumn(name = "ACCTG_TAG_ENUM_ID1", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration acctgTagEnumId1;*/
    @JoinColumn(name = "DONT_CANCEL_SET_USER_LOGIN", referencedColumnName = "USER_LOGIN_ID")
    @ManyToOne
    private UserLogin dontCancelSetUserLogin;
    @JoinColumn(name = "FROM_INVENTORY_ITEM_ID", referencedColumnName = "INVENTORY_ITEM_ID")
    @ManyToOne
    private InventoryItem fromInventoryItemId;
    @JoinColumn(name = "ORDER_ID", referencedColumnName = "ORDER_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private OrderHeader orderHeader;
    /*@JoinColumns({
        @JoinColumn(name = "ORDER_ID", referencedColumnName = "ORDER_ID", insertable = false, updatable = false),
        @JoinColumn(name = "ORDER_ITEM_GROUP_SEQ_ID", referencedColumnName = "ORDER_ITEM_GROUP_SEQ_ID")})
    @ManyToOne(optional = false)
    private OrderItemGroup orderItemGroup;*/
    /*@JoinColumn(name = "OVERRIDE_GL_ACCOUNT_ID", referencedColumnName = "GL_ACCOUNT_ID")
    @ManyToOne
    private GlAccount overrideGlAccountId;*/
    @JoinColumn(name = "ORDER_ITEM_TYPE_ID", referencedColumnName = "ORDER_ITEM_TYPE_ID")
    @ManyToOne
    private OrderItemType orderItemTypeId;
    @JoinColumn(name = "PRODUCT_ID", referencedColumnName = "PRODUCT_ID")
    @ManyToOne
    private Product productId;
    @JoinColumns({
        @JoinColumn(name = "QUOTE_ID", referencedColumnName = "QUOTE_ID"),
        @JoinColumn(name = "QUOTE_ITEM_SEQ_ID", referencedColumnName = "QUOTE_ITEM_SEQ_ID")})
    @ManyToOne
    private QuoteItem quoteItem;
    @JoinColumn(name = "RECURRING_FREQ_UOM_ID", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom recurringFreqUomId;
    @JoinColumn(name = "SALES_OPPORTUNITY_ID", referencedColumnName = "SALES_OPPORTUNITY_ID")
    @ManyToOne
    private SalesOpportunity salesOpportunityId;
    @JoinColumn(name = "STATUS_ID", referencedColumnName = "STATUS_ID")
    @ManyToOne
    private StatusItem statusId;
    @JoinColumn(name = "SYNC_STATUS_ID", referencedColumnName = "STATUS_ID")
    @ManyToOne
    private StatusItem syncStatusId;
    /*@OneToMany(mappedBy = "orderItem")
    private List<FinAccountTrans> finAccountTransList;
    @OneToMany(mappedBy = "orderItem")
    private List<ReturnItem> returnItemList;*/

    public OrderItem() {
    }

    public OrderItem(OrderItemPK orderItemPK) {
        this.orderItemPK = orderItemPK;
    }

    public OrderItem(String orderId, String orderItemSeqId) {
        this.orderItemPK = new OrderItemPK(orderId, orderItemSeqId);
    }

    public OrderItemPK getOrderItemPK() {
        return orderItemPK;
    }

    public void setOrderItemPK(OrderItemPK orderItemPK) {
        this.orderItemPK = orderItemPK;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public Character getIsItemGroupPrimary() {
        return isItemGroupPrimary;
    }

    public void setIsItemGroupPrimary(Character isItemGroupPrimary) {
        this.isItemGroupPrimary = isItemGroupPrimary;
    }

    public String getBudgetId() {
        return budgetId;
    }

    public void setBudgetId(String budgetId) {
        this.budgetId = budgetId;
    }

    public String getBudgetItemSeqId() {
        return budgetItemSeqId;
    }

    public void setBudgetItemSeqId(String budgetItemSeqId) {
        this.budgetItemSeqId = budgetItemSeqId;
    }

    public String getProductFeatureId() {
        return productFeatureId;
    }

    public void setProductFeatureId(String productFeatureId) {
        this.productFeatureId = productFeatureId;
    }

    public String getProdCatalogId() {
        return prodCatalogId;
    }

    public void setProdCatalogId(String prodCatalogId) {
        this.prodCatalogId = prodCatalogId;
    }

    public String getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(String productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public Character getIsPromo() {
        return isPromo;
    }

    public void setIsPromo(Character isPromo) {
        this.isPromo = isPromo;
    }

    public String getShoppingListId() {
        return shoppingListId;
    }

    public void setShoppingListId(String shoppingListId) {
        this.shoppingListId = shoppingListId;
    }

    public String getShoppingListItemSeqId() {
        return shoppingListItemSeqId;
    }

    public void setShoppingListItemSeqId(String shoppingListItemSeqId) {
        this.shoppingListItemSeqId = shoppingListItemSeqId;
    }

    public String getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public String getDeploymentId() {
        return deploymentId;
    }

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getCancelQuantity() {
        return cancelQuantity;
    }

    public void setCancelQuantity(BigDecimal cancelQuantity) {
        this.cancelQuantity = cancelQuantity;
    }

    public BigDecimal getSelectedAmount() {
        return selectedAmount;
    }

    public void setSelectedAmount(BigDecimal selectedAmount) {
        this.selectedAmount = selectedAmount;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getUnitListPrice() {
        return unitListPrice;
    }

    public void setUnitListPrice(BigDecimal unitListPrice) {
        this.unitListPrice = unitListPrice;
    }

    public BigDecimal getUnitAverageCost() {
        return unitAverageCost;
    }

    public void setUnitAverageCost(BigDecimal unitAverageCost) {
        this.unitAverageCost = unitAverageCost;
    }

    public BigDecimal getUnitRecurringPrice() {
        return unitRecurringPrice;
    }

    public void setUnitRecurringPrice(BigDecimal unitRecurringPrice) {
        this.unitRecurringPrice = unitRecurringPrice;
    }

    public Character getIsModifiedPrice() {
        return isModifiedPrice;
    }

    public void setIsModifiedPrice(Character isModifiedPrice) {
        this.isModifiedPrice = isModifiedPrice;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getCorrespondingPoId() {
        return correspondingPoId;
    }

    public void setCorrespondingPoId(String correspondingPoId) {
        this.correspondingPoId = correspondingPoId;
    }

    public Date getEstimatedShipDate() {
        return estimatedShipDate;
    }

    public void setEstimatedShipDate(Date estimatedShipDate) {
        this.estimatedShipDate = estimatedShipDate;
    }

    public Date getEstimatedDeliveryDate() {
        return estimatedDeliveryDate;
    }

    public void setEstimatedDeliveryDate(Date estimatedDeliveryDate) {
        this.estimatedDeliveryDate = estimatedDeliveryDate;
    }

    public Date getAutoCancelDate() {
        return autoCancelDate;
    }

    public void setAutoCancelDate(Date autoCancelDate) {
        this.autoCancelDate = autoCancelDate;
    }

    public Date getDontCancelSetDate() {
        return dontCancelSetDate;
    }

    public void setDontCancelSetDate(Date dontCancelSetDate) {
        this.dontCancelSetDate = dontCancelSetDate;
    }

    public Date getShipBeforeDate() {
        return shipBeforeDate;
    }

    public void setShipBeforeDate(Date shipBeforeDate) {
        this.shipBeforeDate = shipBeforeDate;
    }

    public Date getShipAfterDate() {
        return shipAfterDate;
    }

    public void setShipAfterDate(Date shipAfterDate) {
        this.shipAfterDate = shipAfterDate;
    }

    public Date getCancelBackOrderDate() {
        return cancelBackOrderDate;
    }

    public void setCancelBackOrderDate(Date cancelBackOrderDate) {
        this.cancelBackOrderDate = cancelBackOrderDate;
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
    public List<ShipmentReceipt> getShipmentReceiptList() {
        return shipmentReceiptList;
    }

    public void setShipmentReceiptList(List<ShipmentReceipt> shipmentReceiptList) {
        this.shipmentReceiptList = shipmentReceiptList;
    }

    public List<FixedAsset> getFixedAssetList() {
        return fixedAssetList;
    }

    public void setFixedAssetList(List<FixedAsset> fixedAssetList) {
        this.fixedAssetList = fixedAssetList;
    }

    public Enumeration getAcctgTagEnumId9() {
        return acctgTagEnumId9;
    }

    public void setAcctgTagEnumId9(Enumeration acctgTagEnumId9) {
        this.acctgTagEnumId9 = acctgTagEnumId9;
    }

    public Enumeration getAcctgTagEnumId8() {
        return acctgTagEnumId8;
    }

    public void setAcctgTagEnumId8(Enumeration acctgTagEnumId8) {
        this.acctgTagEnumId8 = acctgTagEnumId8;
    }

    public Enumeration getAcctgTagEnumId7() {
        return acctgTagEnumId7;
    }

    public void setAcctgTagEnumId7(Enumeration acctgTagEnumId7) {
        this.acctgTagEnumId7 = acctgTagEnumId7;
    }

    public Enumeration getAcctgTagEnumId6() {
        return acctgTagEnumId6;
    }

    public void setAcctgTagEnumId6(Enumeration acctgTagEnumId6) {
        this.acctgTagEnumId6 = acctgTagEnumId6;
    }

    public Enumeration getAcctgTagEnumId5() {
        return acctgTagEnumId5;
    }

    public void setAcctgTagEnumId5(Enumeration acctgTagEnumId5) {
        this.acctgTagEnumId5 = acctgTagEnumId5;
    }

    public Enumeration getAcctgTagEnumId4() {
        return acctgTagEnumId4;
    }

    public void setAcctgTagEnumId4(Enumeration acctgTagEnumId4) {
        this.acctgTagEnumId4 = acctgTagEnumId4;
    }

    public Enumeration getAcctgTagEnumId3() {
        return acctgTagEnumId3;
    }

    public void setAcctgTagEnumId3(Enumeration acctgTagEnumId3) {
        this.acctgTagEnumId3 = acctgTagEnumId3;
    }

    public Enumeration getAcctgTagEnumId2() {
        return acctgTagEnumId2;
    }

    public void setAcctgTagEnumId2(Enumeration acctgTagEnumId2) {
        this.acctgTagEnumId2 = acctgTagEnumId2;
    }

    public Enumeration getAcctgTagEnumId10() {
        return acctgTagEnumId10;
    }

    public void setAcctgTagEnumId10(Enumeration acctgTagEnumId10) {
        this.acctgTagEnumId10 = acctgTagEnumId10;
    }

    public Enumeration getAcctgTagEnumId1() {
        return acctgTagEnumId1;
    }

    public void setAcctgTagEnumId1(Enumeration acctgTagEnumId1) {
        this.acctgTagEnumId1 = acctgTagEnumId1;
    }*/

    public UserLogin getDontCancelSetUserLogin() {
        return dontCancelSetUserLogin;
    }

    public void setDontCancelSetUserLogin(UserLogin dontCancelSetUserLogin) {
        this.dontCancelSetUserLogin = dontCancelSetUserLogin;
    }

    public InventoryItem getFromInventoryItemId() {
        return fromInventoryItemId;
    }

    public void setFromInventoryItemId(InventoryItem fromInventoryItemId) {
        this.fromInventoryItemId = fromInventoryItemId;
    }

    public OrderHeader getOrderHeader() {
        return orderHeader;
    }

    public void setOrderHeader(OrderHeader orderHeader) {
        this.orderHeader = orderHeader;
    }
/*
    public OrderItemGroup getOrderItemGroup() {
        return orderItemGroup;
    }

    public void setOrderItemGroup(OrderItemGroup orderItemGroup) {
        this.orderItemGroup = orderItemGroup;
    }*/
/*
    public GlAccount getOverrideGlAccountId() {
        return overrideGlAccountId;
    }

    public void setOverrideGlAccountId(GlAccount overrideGlAccountId) {
        this.overrideGlAccountId = overrideGlAccountId;
    }*/

    public OrderItemType getOrderItemTypeId() {
        return orderItemTypeId;
    }

    public void setOrderItemTypeId(OrderItemType orderItemTypeId) {
        this.orderItemTypeId = orderItemTypeId;
    }

    public Product getProductId() {
        return productId;
    }

    public void setProductId(Product productId) {
        this.productId = productId;
    }

    public QuoteItem getQuoteItem() {
        return quoteItem;
    }

    public void setQuoteItem(QuoteItem quoteItem) {
        this.quoteItem = quoteItem;
    }

    public Uom getRecurringFreqUomId() {
        return recurringFreqUomId;
    }

    public void setRecurringFreqUomId(Uom recurringFreqUomId) {
        this.recurringFreqUomId = recurringFreqUomId;
    }

    public SalesOpportunity getSalesOpportunityId() {
        return salesOpportunityId;
    }

    public void setSalesOpportunityId(SalesOpportunity salesOpportunityId) {
        this.salesOpportunityId = salesOpportunityId;
    }

    public StatusItem getStatusId() {
        return statusId;
    }

    public void setStatusId(StatusItem statusId) {
        this.statusId = statusId;
    }

    public StatusItem getSyncStatusId() {
        return syncStatusId;
    }

    public void setSyncStatusId(StatusItem syncStatusId) {
        this.syncStatusId = syncStatusId;
    }
/*
    public List<FinAccountTrans> getFinAccountTransList() {
        return finAccountTransList;
    }

    public void setFinAccountTransList(List<FinAccountTrans> finAccountTransList) {
        this.finAccountTransList = finAccountTransList;
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
        hash += (orderItemPK != null ? orderItemPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderItem)) {
            return false;
        }
        OrderItem other = (OrderItem) object;
        if ((this.orderItemPK == null && other.orderItemPK != null) || (this.orderItemPK != null && !this.orderItemPK.equals(other.orderItemPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.OrderItem[ orderItemPK=" + orderItemPK + " ]";
    }
/*
    public List<GiftCardFulfillment> getGiftCardFulfillmentList() {
        return giftCardFulfillmentList;
    }

    public void setGiftCardFulfillmentList(List<GiftCardFulfillment> giftCardFulfillmentList) {
        this.giftCardFulfillmentList = giftCardFulfillmentList;
    }

    public List<ItemIssuance> getItemIssuanceList() {
        return itemIssuanceList;
    }

    public void setItemIssuanceList(List<ItemIssuance> itemIssuanceList) {
        this.itemIssuanceList = itemIssuanceList;
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

    public List<PicklistItem> getPicklistItemList() {
        return picklistItemList;
    }

    public void setPicklistItemList(List<PicklistItem> picklistItemList) {
        this.picklistItemList = picklistItemList;
    }

    public List<Subscription> getSubscriptionList() {
        return subscriptionList;
    }

    public void setSubscriptionList(List<Subscription> subscriptionList) {
        this.subscriptionList = subscriptionList;
    }

    public List<ValueLinkFulfillment> getValueLinkFulfillmentList() {
        return valueLinkFulfillmentList;
    }

    public void setValueLinkFulfillmentList(List<ValueLinkFulfillment> valueLinkFulfillmentList) {
        this.valueLinkFulfillmentList = valueLinkFulfillmentList;
    }

    public List<WorkOrderItemFulfillment> getWorkOrderItemFulfillmentList() {
        return workOrderItemFulfillmentList;
    }

    public void setWorkOrderItemFulfillmentList(List<WorkOrderItemFulfillment> workOrderItemFulfillmentList) {
        this.workOrderItemFulfillmentList = workOrderItemFulfillmentList;
    }*/
    
}
