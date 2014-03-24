/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.product.model;

import java.io.Serializable;
import java.math.BigInteger;
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

import com.wildc.ucumari.facility.model.Facility;
import com.wildc.ucumari.parameters.model.Enumeration;
import com.wildc.ucumari.parameters.model.StatusItem;
import com.wildc.ucumari.parameters.model.Uom;
import com.wildc.ucumari.party.model.Party;
import com.wildc.ucumari.shipment.model.ShipmentMethodType;
import com.wildc.ucumari.tax.model.TaxAuthority;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "product_store")

public class ProductStore implements Serializable {
    /*@OneToMany(mappedBy = "productStoreId")
    private List<SegmentGroup> segmentGroupList;
    @OneToMany(mappedBy = "productStoreId")
    private List<SalesForecastItem> salesForecastItemList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productStore")
    private List<ProductStoreCatalog> productStoreCatalogList;
    @OneToMany(mappedBy = "productStoreId")
    private List<WebSite> webSiteList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productStore")
    private List<ProductStoreKeywordOvrd> productStoreKeywordOvrdList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productStore")
    private List<ProductStoreFinActSetting> productStoreFinActSettingList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productStore")
    private List<ProductStorePromoAppl> productStorePromoApplList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productStore")
    private List<ProductStoreFacility> productStoreFacilityList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productStore")
    private List<ProductStoreGroupMember> productStoreGroupMemberList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productStore")
    private List<PartyProfileDefault> partyProfileDefaultList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productStore")
    private List<ProductStoreVendorPayment> productStoreVendorPaymentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productStore")
    private List<ProductStoreVendorShipment> productStoreVendorShipmentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productStore")
    private List<ProdStoreFacilityByAddr> prodStoreFacilityByAddrList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productStore")
    private List<ProductStorePaymentSetting> productStorePaymentSettingList;
    @OneToMany(mappedBy = "productStoreId")
    private List<ProductStoreSurveyAppl> productStoreSurveyApplList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productStore")
    private List<ProductStoreEmailSetting> productStoreEmailSettingList;
    @OneToMany(mappedBy = "productStoreId")
    private List<ProductReview> productReviewList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productStore")
    private List<ProductStoreRole> productStoreRoleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productStore")
    private List<InventoryItemTempRes> inventoryItemTempResList;*/
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PRODUCT_STORE_ID")
    private String productStoreId;
    @Column(name = "STORE_NAME")
    private String storeName;
    @Column(name = "COMPANY_NAME")
    private String companyName;
    @Column(name = "TITLE")
    private String title;
    @Column(name = "SUBTITLE")
    private String subtitle;
    @Column(name = "DAYS_TO_CANCEL_NON_PAY")
    private BigInteger daysToCancelNonPay;
    @Column(name = "MANUAL_AUTH_IS_CAPTURE")
    private Character manualAuthIsCapture;
    @Column(name = "PRORATE_SHIPPING")
    private Character prorateShipping;
    @Column(name = "PRORATE_TAXES")
    private Character prorateTaxes;
    @Column(name = "VIEW_CART_ON_ADD")
    private Character viewCartOnAdd;
    @Column(name = "AUTO_SAVE_CART")
    private Character autoSaveCart;
    @Column(name = "AUTO_APPROVE_REVIEWS")
    private Character autoApproveReviews;
    @Column(name = "IS_DEMO_STORE")
    private Character isDemoStore;
    @Column(name = "IS_IMMEDIATELY_FULFILLED")
    private Character isImmediatelyFulfilled;
    @Column(name = "ONE_INVENTORY_FACILITY")
    private Character oneInventoryFacility;
    @Column(name = "CHECK_INVENTORY")
    private Character checkInventory;
    @Column(name = "RESERVE_INVENTORY")
    private Character reserveInventory;
    @Column(name = "REQUIRE_INVENTORY")
    private Character requireInventory;
    @Column(name = "BALANCE_RES_ON_ORDER_CREATION")
    private Character balanceResOnOrderCreation;
    @Column(name = "ORDER_NUMBER_PREFIX")
    private String orderNumberPrefix;
    @Column(name = "DEFAULT_LOCALE_STRING")
    private String defaultLocaleString;
    @Column(name = "ALLOW_PASSWORD")
    private Character allowPassword;
    @Column(name = "DEFAULT_PASSWORD")
    private String defaultPassword;
    @Column(name = "EXPLODE_ORDER_ITEMS")
    private Character explodeOrderItems;
    @Column(name = "CHECK_GC_BALANCE")
    private Character checkGcBalance;
    @Column(name = "RETRY_FAILED_AUTHS")
    private Character retryFailedAuths;
    @Column(name = "AUTH_DECLINED_MESSAGE")
    private String authDeclinedMessage;
    @Column(name = "AUTH_FRAUD_MESSAGE")
    private String authFraudMessage;
    @Column(name = "AUTH_ERROR_MESSAGE")
    private String authErrorMessage;
    @Column(name = "VISUAL_THEME_ID")
    private String visualThemeId;
    @Column(name = "STYLE_SHEET")
    private String styleSheet;
    @Column(name = "HEADER_LOGO")
    private String headerLogo;
    @Column(name = "HEADER_MIDDLE_BACKGROUND")
    private String headerMiddleBackground;
    @Column(name = "HEADER_RIGHT_BACKGROUND")
    private String headerRightBackground;
    @Column(name = "USE_PRIMARY_EMAIL_USERNAME")
    private Character usePrimaryEmailUsername;
    @Column(name = "REQUIRE_CUSTOMER_ROLE")
    private Character requireCustomerRole;
    @Column(name = "AUTO_INVOICE_DIGITAL_ITEMS")
    private Character autoInvoiceDigitalItems;
    @Column(name = "REQ_SHIP_ADDR_FOR_DIG_ITEMS")
    private Character reqShipAddrForDigItems;
    @Column(name = "SHOW_CHECKOUT_GIFT_OPTIONS")
    private Character showCheckoutGiftOptions;
    @Column(name = "SELECT_PAYMENT_TYPE_PER_ITEM")
    private Character selectPaymentTypePerItem;
    @Column(name = "SHOW_PRICES_WITH_VAT_TAX")
    private Character showPricesWithVatTax;
    @Column(name = "SHOW_TAX_IS_EXEMPT")
    private Character showTaxIsExempt;
    @Column(name = "ENABLE_AUTO_SUGGESTION_LIST")
    private Character enableAutoSuggestionList;
    @Column(name = "ENABLE_DIG_PROD_UPLOAD")
    private Character enableDigProdUpload;
    @Column(name = "PROD_SEARCH_EXCLUDE_VARIANTS")
    private Character prodSearchExcludeVariants;
    @Column(name = "DIG_PROD_UPLOAD_CATEGORY_ID")
    private String digProdUploadCategoryId;
    @Column(name = "AUTO_ORDER_CC_TRY_EXP")
    private Character autoOrderCcTryExp;
    @Column(name = "AUTO_ORDER_CC_TRY_OTHER_CARDS")
    private Character autoOrderCcTryOtherCards;
    @Column(name = "AUTO_ORDER_CC_TRY_LATER_NSF")
    private Character autoOrderCcTryLaterNsf;
    @Column(name = "AUTO_ORDER_CC_TRY_LATER_MAX")
    private BigInteger autoOrderCcTryLaterMax;
    @Column(name = "STORE_CREDIT_VALID_DAYS")
    private BigInteger storeCreditValidDays;
    @Column(name = "AUTO_APPROVE_INVOICE")
    private Character autoApproveInvoice;
    @Column(name = "AUTO_APPROVE_ORDER")
    private Character autoApproveOrder;
    @Column(name = "SHIP_IF_CAPTURE_FAILS")
    private Character shipIfCaptureFails;
    @Column(name = "SET_OWNER_UPON_ISSUANCE")
    private Character setOwnerUponIssuance;
    @Column(name = "REQ_RETURN_INVENTORY_RECEIVE")
    private Character reqReturnInventoryReceive;
    @Column(name = "ADD_TO_CART_REMOVE_INCOMPAT")
    private Character addToCartRemoveIncompat;
    @Column(name = "ADD_TO_CART_REPLACE_UPSELL")
    private Character addToCartReplaceUpsell;
    @Column(name = "SPLIT_PAY_PREF_PER_SHP_GRP")
    private Character splitPayPrefPerShpGrp;
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
    @Column(name = "NO_SHIP_ON_DROP_SHIP_GROUPS")
    private Character noShipOnDropShipGroups;
    @Column(name = "ALLOW_DO_NOT_SHIP_ORDERS")
    private Character allowDoNotShipOrders;
    /*@OneToMany(mappedBy = "productStoreId")
    private List<ShoppingList> shoppingListList;
    @OneToMany(mappedBy = "productStoreId")
    private List<CustRequest> custRequestList;*/
    @JoinColumn(name = "DEFAULT_SHIP_METHOD_ID", referencedColumnName = "SHIPMENT_METHOD_TYPE_ID")
    @ManyToOne
    private ShipmentMethodType defaultShipMethodId;
    @JoinColumns({
        @JoinColumn(name = "VAT_TAX_AUTH_GEO_ID", referencedColumnName = "TAX_AUTH_GEO_ID"),
        @JoinColumn(name = "VAT_TAX_AUTH_PARTY_ID", referencedColumnName = "TAX_AUTH_PARTY_ID")})
    @ManyToOne
    private TaxAuthority taxAuthority;
    @JoinColumn(name = "DEFAULT_SALES_CHANNEL_ENUM_ID", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration defaultSalesChannelEnumId;
    @JoinColumn(name = "REQUIREMENT_METHOD_ENUM_ID", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration requirementMethodEnumId;
    @JoinColumn(name = "RESERVE_ORDER_ENUM_ID", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration reserveOrderEnumId;
    @JoinColumn(name = "PRIMARY_STORE_GROUP_ID", referencedColumnName = "PRODUCT_STORE_GROUP_ID")
    @ManyToOne
    private ProductStoreGroup primaryStoreGroupId;
    @JoinColumn(name = "DEFAULT_SHIP_CARRIER_PARTY_ID", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party defaultShipCarrierPartyId;
    @JoinColumn(name = "BILL_TO_THIRD_PARTY_ID", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party billToThirdPartyId;
    @JoinColumn(name = "DEFAULT_CURRENCY_UOM_ID", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom defaultCurrencyUomId;
    @JoinColumn(name = "DIGITAL_ITEM_APPROVED_STATUS", referencedColumnName = "STATUS_ID")
    @ManyToOne
    private StatusItem digitalItemApprovedStatus;
    @JoinColumn(name = "INVENTORY_FACILITY_ID", referencedColumnName = "FACILITY_ID")
    @ManyToOne
    private Facility inventoryFacilityId;
    @JoinColumn(name = "HEADER_APPROVED_STATUS", referencedColumnName = "STATUS_ID")
    @ManyToOne
    private StatusItem headerApprovedStatus;
    @JoinColumn(name = "HEADER_CANCEL_STATUS", referencedColumnName = "STATUS_ID")
    @ManyToOne
    private StatusItem headerCancelStatus;
    @JoinColumn(name = "HEADER_DECLINED_STATUS", referencedColumnName = "STATUS_ID")
    @ManyToOne
    private StatusItem headerDeclinedStatus;
    @JoinColumn(name = "ITEM_APPROVED_STATUS", referencedColumnName = "STATUS_ID")
    @ManyToOne
    private StatusItem itemApprovedStatus;
    @JoinColumn(name = "ITEM_CANCEL_STATUS", referencedColumnName = "STATUS_ID")
    @ManyToOne
    private StatusItem itemCancelStatus;
    @JoinColumn(name = "ITEM_DECLINED_STATUS", referencedColumnName = "STATUS_ID")
    @ManyToOne
    private StatusItem itemDeclinedStatus;
    @JoinColumn(name = "PAY_TO_PARTY_ID", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party payToPartyId;
    /*@OneToMany(mappedBy = "productStoreId")
    private List<OrderHeader> orderHeaderList;
    @OneToMany(mappedBy = "productStoreId")
    private List<TaxAuthorityRateProduct> taxAuthorityRateProductList;
    @OneToMany(mappedBy = "productStoreId")
    private List<Quote> quoteList;*/

    public ProductStore() {
    }

    public ProductStore(String productStoreId) {
        this.productStoreId = productStoreId;
    }

    public String getProductStoreId() {
        return productStoreId;
    }

    public void setProductStoreId(String productStoreId) {
        this.productStoreId = productStoreId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public BigInteger getDaysToCancelNonPay() {
        return daysToCancelNonPay;
    }

    public void setDaysToCancelNonPay(BigInteger daysToCancelNonPay) {
        this.daysToCancelNonPay = daysToCancelNonPay;
    }

    public Character getManualAuthIsCapture() {
        return manualAuthIsCapture;
    }

    public void setManualAuthIsCapture(Character manualAuthIsCapture) {
        this.manualAuthIsCapture = manualAuthIsCapture;
    }

    public Character getProrateShipping() {
        return prorateShipping;
    }

    public void setProrateShipping(Character prorateShipping) {
        this.prorateShipping = prorateShipping;
    }

    public Character getProrateTaxes() {
        return prorateTaxes;
    }

    public void setProrateTaxes(Character prorateTaxes) {
        this.prorateTaxes = prorateTaxes;
    }

    public Character getViewCartOnAdd() {
        return viewCartOnAdd;
    }

    public void setViewCartOnAdd(Character viewCartOnAdd) {
        this.viewCartOnAdd = viewCartOnAdd;
    }

    public Character getAutoSaveCart() {
        return autoSaveCart;
    }

    public void setAutoSaveCart(Character autoSaveCart) {
        this.autoSaveCart = autoSaveCart;
    }

    public Character getAutoApproveReviews() {
        return autoApproveReviews;
    }

    public void setAutoApproveReviews(Character autoApproveReviews) {
        this.autoApproveReviews = autoApproveReviews;
    }

    public Character getIsDemoStore() {
        return isDemoStore;
    }

    public void setIsDemoStore(Character isDemoStore) {
        this.isDemoStore = isDemoStore;
    }

    public Character getIsImmediatelyFulfilled() {
        return isImmediatelyFulfilled;
    }

    public void setIsImmediatelyFulfilled(Character isImmediatelyFulfilled) {
        this.isImmediatelyFulfilled = isImmediatelyFulfilled;
    }

    public Character getOneInventoryFacility() {
        return oneInventoryFacility;
    }

    public void setOneInventoryFacility(Character oneInventoryFacility) {
        this.oneInventoryFacility = oneInventoryFacility;
    }

    public Character getCheckInventory() {
        return checkInventory;
    }

    public void setCheckInventory(Character checkInventory) {
        this.checkInventory = checkInventory;
    }

    public Character getReserveInventory() {
        return reserveInventory;
    }

    public void setReserveInventory(Character reserveInventory) {
        this.reserveInventory = reserveInventory;
    }

    public Character getRequireInventory() {
        return requireInventory;
    }

    public void setRequireInventory(Character requireInventory) {
        this.requireInventory = requireInventory;
    }

    public Character getBalanceResOnOrderCreation() {
        return balanceResOnOrderCreation;
    }

    public void setBalanceResOnOrderCreation(Character balanceResOnOrderCreation) {
        this.balanceResOnOrderCreation = balanceResOnOrderCreation;
    }

    public String getOrderNumberPrefix() {
        return orderNumberPrefix;
    }

    public void setOrderNumberPrefix(String orderNumberPrefix) {
        this.orderNumberPrefix = orderNumberPrefix;
    }

    public String getDefaultLocaleString() {
        return defaultLocaleString;
    }

    public void setDefaultLocaleString(String defaultLocaleString) {
        this.defaultLocaleString = defaultLocaleString;
    }

    public Character getAllowPassword() {
        return allowPassword;
    }

    public void setAllowPassword(Character allowPassword) {
        this.allowPassword = allowPassword;
    }

    public String getDefaultPassword() {
        return defaultPassword;
    }

    public void setDefaultPassword(String defaultPassword) {
        this.defaultPassword = defaultPassword;
    }

    public Character getExplodeOrderItems() {
        return explodeOrderItems;
    }

    public void setExplodeOrderItems(Character explodeOrderItems) {
        this.explodeOrderItems = explodeOrderItems;
    }

    public Character getCheckGcBalance() {
        return checkGcBalance;
    }

    public void setCheckGcBalance(Character checkGcBalance) {
        this.checkGcBalance = checkGcBalance;
    }

    public Character getRetryFailedAuths() {
        return retryFailedAuths;
    }

    public void setRetryFailedAuths(Character retryFailedAuths) {
        this.retryFailedAuths = retryFailedAuths;
    }

    public String getAuthDeclinedMessage() {
        return authDeclinedMessage;
    }

    public void setAuthDeclinedMessage(String authDeclinedMessage) {
        this.authDeclinedMessage = authDeclinedMessage;
    }

    public String getAuthFraudMessage() {
        return authFraudMessage;
    }

    public void setAuthFraudMessage(String authFraudMessage) {
        this.authFraudMessage = authFraudMessage;
    }

    public String getAuthErrorMessage() {
        return authErrorMessage;
    }

    public void setAuthErrorMessage(String authErrorMessage) {
        this.authErrorMessage = authErrorMessage;
    }

    public String getVisualThemeId() {
        return visualThemeId;
    }

    public void setVisualThemeId(String visualThemeId) {
        this.visualThemeId = visualThemeId;
    }

    public String getStyleSheet() {
        return styleSheet;
    }

    public void setStyleSheet(String styleSheet) {
        this.styleSheet = styleSheet;
    }

    public String getHeaderLogo() {
        return headerLogo;
    }

    public void setHeaderLogo(String headerLogo) {
        this.headerLogo = headerLogo;
    }

    public String getHeaderMiddleBackground() {
        return headerMiddleBackground;
    }

    public void setHeaderMiddleBackground(String headerMiddleBackground) {
        this.headerMiddleBackground = headerMiddleBackground;
    }

    public String getHeaderRightBackground() {
        return headerRightBackground;
    }

    public void setHeaderRightBackground(String headerRightBackground) {
        this.headerRightBackground = headerRightBackground;
    }

    public Character getUsePrimaryEmailUsername() {
        return usePrimaryEmailUsername;
    }

    public void setUsePrimaryEmailUsername(Character usePrimaryEmailUsername) {
        this.usePrimaryEmailUsername = usePrimaryEmailUsername;
    }

    public Character getRequireCustomerRole() {
        return requireCustomerRole;
    }

    public void setRequireCustomerRole(Character requireCustomerRole) {
        this.requireCustomerRole = requireCustomerRole;
    }

    public Character getAutoInvoiceDigitalItems() {
        return autoInvoiceDigitalItems;
    }

    public void setAutoInvoiceDigitalItems(Character autoInvoiceDigitalItems) {
        this.autoInvoiceDigitalItems = autoInvoiceDigitalItems;
    }

    public Character getReqShipAddrForDigItems() {
        return reqShipAddrForDigItems;
    }

    public void setReqShipAddrForDigItems(Character reqShipAddrForDigItems) {
        this.reqShipAddrForDigItems = reqShipAddrForDigItems;
    }

    public Character getShowCheckoutGiftOptions() {
        return showCheckoutGiftOptions;
    }

    public void setShowCheckoutGiftOptions(Character showCheckoutGiftOptions) {
        this.showCheckoutGiftOptions = showCheckoutGiftOptions;
    }

    public Character getSelectPaymentTypePerItem() {
        return selectPaymentTypePerItem;
    }

    public void setSelectPaymentTypePerItem(Character selectPaymentTypePerItem) {
        this.selectPaymentTypePerItem = selectPaymentTypePerItem;
    }

    public Character getShowPricesWithVatTax() {
        return showPricesWithVatTax;
    }

    public void setShowPricesWithVatTax(Character showPricesWithVatTax) {
        this.showPricesWithVatTax = showPricesWithVatTax;
    }

    public Character getShowTaxIsExempt() {
        return showTaxIsExempt;
    }

    public void setShowTaxIsExempt(Character showTaxIsExempt) {
        this.showTaxIsExempt = showTaxIsExempt;
    }

    public Character getEnableAutoSuggestionList() {
        return enableAutoSuggestionList;
    }

    public void setEnableAutoSuggestionList(Character enableAutoSuggestionList) {
        this.enableAutoSuggestionList = enableAutoSuggestionList;
    }

    public Character getEnableDigProdUpload() {
        return enableDigProdUpload;
    }

    public void setEnableDigProdUpload(Character enableDigProdUpload) {
        this.enableDigProdUpload = enableDigProdUpload;
    }

    public Character getProdSearchExcludeVariants() {
        return prodSearchExcludeVariants;
    }

    public void setProdSearchExcludeVariants(Character prodSearchExcludeVariants) {
        this.prodSearchExcludeVariants = prodSearchExcludeVariants;
    }

    public String getDigProdUploadCategoryId() {
        return digProdUploadCategoryId;
    }

    public void setDigProdUploadCategoryId(String digProdUploadCategoryId) {
        this.digProdUploadCategoryId = digProdUploadCategoryId;
    }

    public Character getAutoOrderCcTryExp() {
        return autoOrderCcTryExp;
    }

    public void setAutoOrderCcTryExp(Character autoOrderCcTryExp) {
        this.autoOrderCcTryExp = autoOrderCcTryExp;
    }

    public Character getAutoOrderCcTryOtherCards() {
        return autoOrderCcTryOtherCards;
    }

    public void setAutoOrderCcTryOtherCards(Character autoOrderCcTryOtherCards) {
        this.autoOrderCcTryOtherCards = autoOrderCcTryOtherCards;
    }

    public Character getAutoOrderCcTryLaterNsf() {
        return autoOrderCcTryLaterNsf;
    }

    public void setAutoOrderCcTryLaterNsf(Character autoOrderCcTryLaterNsf) {
        this.autoOrderCcTryLaterNsf = autoOrderCcTryLaterNsf;
    }

    public BigInteger getAutoOrderCcTryLaterMax() {
        return autoOrderCcTryLaterMax;
    }

    public void setAutoOrderCcTryLaterMax(BigInteger autoOrderCcTryLaterMax) {
        this.autoOrderCcTryLaterMax = autoOrderCcTryLaterMax;
    }

    public BigInteger getStoreCreditValidDays() {
        return storeCreditValidDays;
    }

    public void setStoreCreditValidDays(BigInteger storeCreditValidDays) {
        this.storeCreditValidDays = storeCreditValidDays;
    }

    public Character getAutoApproveInvoice() {
        return autoApproveInvoice;
    }

    public void setAutoApproveInvoice(Character autoApproveInvoice) {
        this.autoApproveInvoice = autoApproveInvoice;
    }

    public Character getAutoApproveOrder() {
        return autoApproveOrder;
    }

    public void setAutoApproveOrder(Character autoApproveOrder) {
        this.autoApproveOrder = autoApproveOrder;
    }

    public Character getShipIfCaptureFails() {
        return shipIfCaptureFails;
    }

    public void setShipIfCaptureFails(Character shipIfCaptureFails) {
        this.shipIfCaptureFails = shipIfCaptureFails;
    }

    public Character getSetOwnerUponIssuance() {
        return setOwnerUponIssuance;
    }

    public void setSetOwnerUponIssuance(Character setOwnerUponIssuance) {
        this.setOwnerUponIssuance = setOwnerUponIssuance;
    }

    public Character getReqReturnInventoryReceive() {
        return reqReturnInventoryReceive;
    }

    public void setReqReturnInventoryReceive(Character reqReturnInventoryReceive) {
        this.reqReturnInventoryReceive = reqReturnInventoryReceive;
    }

    public Character getAddToCartRemoveIncompat() {
        return addToCartRemoveIncompat;
    }

    public void setAddToCartRemoveIncompat(Character addToCartRemoveIncompat) {
        this.addToCartRemoveIncompat = addToCartRemoveIncompat;
    }

    public Character getAddToCartReplaceUpsell() {
        return addToCartReplaceUpsell;
    }

    public void setAddToCartReplaceUpsell(Character addToCartReplaceUpsell) {
        this.addToCartReplaceUpsell = addToCartReplaceUpsell;
    }

    public Character getSplitPayPrefPerShpGrp() {
        return splitPayPrefPerShpGrp;
    }

    public void setSplitPayPrefPerShpGrp(Character splitPayPrefPerShpGrp) {
        this.splitPayPrefPerShpGrp = splitPayPrefPerShpGrp;
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

    public Character getNoShipOnDropShipGroups() {
        return noShipOnDropShipGroups;
    }

    public void setNoShipOnDropShipGroups(Character noShipOnDropShipGroups) {
        this.noShipOnDropShipGroups = noShipOnDropShipGroups;
    }

    public Character getAllowDoNotShipOrders() {
        return allowDoNotShipOrders;
    }

    public void setAllowDoNotShipOrders(Character allowDoNotShipOrders) {
        this.allowDoNotShipOrders = allowDoNotShipOrders;
    }
/*
    public List<ShoppingList> getShoppingListList() {
        return shoppingListList;
    }

    public void setShoppingListList(List<ShoppingList> shoppingListList) {
        this.shoppingListList = shoppingListList;
    }

    public List<CustRequest> getCustRequestList() {
        return custRequestList;
    }

    public void setCustRequestList(List<CustRequest> custRequestList) {
        this.custRequestList = custRequestList;
    }*/

    public ShipmentMethodType getDefaultShipMethodId() {
        return defaultShipMethodId;
    }

    public void setDefaultShipMethodId(ShipmentMethodType defaultShipMethodId) {
        this.defaultShipMethodId = defaultShipMethodId;
    }

    public TaxAuthority getTaxAuthority() {
        return taxAuthority;
    }

    public void setTaxAuthority(TaxAuthority taxAuthority) {
        this.taxAuthority = taxAuthority;
    }

    public Enumeration getDefaultSalesChannelEnumId() {
        return defaultSalesChannelEnumId;
    }

    public void setDefaultSalesChannelEnumId(Enumeration defaultSalesChannelEnumId) {
        this.defaultSalesChannelEnumId = defaultSalesChannelEnumId;
    }

    public Enumeration getRequirementMethodEnumId() {
        return requirementMethodEnumId;
    }

    public void setRequirementMethodEnumId(Enumeration requirementMethodEnumId) {
        this.requirementMethodEnumId = requirementMethodEnumId;
    }

    public Enumeration getReserveOrderEnumId() {
        return reserveOrderEnumId;
    }

    public void setReserveOrderEnumId(Enumeration reserveOrderEnumId) {
        this.reserveOrderEnumId = reserveOrderEnumId;
    }

    public ProductStoreGroup getPrimaryStoreGroupId() {
        return primaryStoreGroupId;
    }

    public void setPrimaryStoreGroupId(ProductStoreGroup primaryStoreGroupId) {
        this.primaryStoreGroupId = primaryStoreGroupId;
    }

    public Party getDefaultShipCarrierPartyId() {
        return defaultShipCarrierPartyId;
    }

    public void setDefaultShipCarrierPartyId(Party defaultShipCarrierPartyId) {
        this.defaultShipCarrierPartyId = defaultShipCarrierPartyId;
    }

    public Party getBillToThirdPartyId() {
        return billToThirdPartyId;
    }

    public void setBillToThirdPartyId(Party billToThirdPartyId) {
        this.billToThirdPartyId = billToThirdPartyId;
    }

    public Uom getDefaultCurrencyUomId() {
        return defaultCurrencyUomId;
    }

    public void setDefaultCurrencyUomId(Uom defaultCurrencyUomId) {
        this.defaultCurrencyUomId = defaultCurrencyUomId;
    }

    public StatusItem getDigitalItemApprovedStatus() {
        return digitalItemApprovedStatus;
    }

    public void setDigitalItemApprovedStatus(StatusItem digitalItemApprovedStatus) {
        this.digitalItemApprovedStatus = digitalItemApprovedStatus;
    }

    public Facility getInventoryFacilityId() {
        return inventoryFacilityId;
    }

    public void setInventoryFacilityId(Facility inventoryFacilityId) {
        this.inventoryFacilityId = inventoryFacilityId;
    }

    public StatusItem getHeaderApprovedStatus() {
        return headerApprovedStatus;
    }

    public void setHeaderApprovedStatus(StatusItem headerApprovedStatus) {
        this.headerApprovedStatus = headerApprovedStatus;
    }

    public StatusItem getHeaderCancelStatus() {
        return headerCancelStatus;
    }

    public void setHeaderCancelStatus(StatusItem headerCancelStatus) {
        this.headerCancelStatus = headerCancelStatus;
    }

    public StatusItem getHeaderDeclinedStatus() {
        return headerDeclinedStatus;
    }

    public void setHeaderDeclinedStatus(StatusItem headerDeclinedStatus) {
        this.headerDeclinedStatus = headerDeclinedStatus;
    }

    public StatusItem getItemApprovedStatus() {
        return itemApprovedStatus;
    }

    public void setItemApprovedStatus(StatusItem itemApprovedStatus) {
        this.itemApprovedStatus = itemApprovedStatus;
    }

    public StatusItem getItemCancelStatus() {
        return itemCancelStatus;
    }

    public void setItemCancelStatus(StatusItem itemCancelStatus) {
        this.itemCancelStatus = itemCancelStatus;
    }

    public StatusItem getItemDeclinedStatus() {
        return itemDeclinedStatus;
    }

    public void setItemDeclinedStatus(StatusItem itemDeclinedStatus) {
        this.itemDeclinedStatus = itemDeclinedStatus;
    }

    public Party getPayToPartyId() {
        return payToPartyId;
    }

    public void setPayToPartyId(Party payToPartyId) {
        this.payToPartyId = payToPartyId;
    }
/*
    public List<OrderHeader> getOrderHeaderList() {
        return orderHeaderList;
    }

    public void setOrderHeaderList(List<OrderHeader> orderHeaderList) {
        this.orderHeaderList = orderHeaderList;
    }

    public List<TaxAuthorityRateProduct> getTaxAuthorityRateProductList() {
        return taxAuthorityRateProductList;
    }

    public void setTaxAuthorityRateProductList(List<TaxAuthorityRateProduct> taxAuthorityRateProductList) {
        this.taxAuthorityRateProductList = taxAuthorityRateProductList;
    }

    public List<Quote> getQuoteList() {
        return quoteList;
    }

    public void setQuoteList(List<Quote> quoteList) {
        this.quoteList = quoteList;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productStoreId != null ? productStoreId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductStore)) {
            return false;
        }
        ProductStore other = (ProductStore) object;
        if ((this.productStoreId == null && other.productStoreId != null) || (this.productStoreId != null && !this.productStoreId.equals(other.productStoreId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductStore[ productStoreId=" + productStoreId + " ]";
    }
/*
    public List<InventoryItemTempRes> getInventoryItemTempResList() {
        return inventoryItemTempResList;
    }

    public void setInventoryItemTempResList(List<InventoryItemTempRes> inventoryItemTempResList) {
        this.inventoryItemTempResList = inventoryItemTempResList;
    }

    public List<ProductStoreCatalog> getProductStoreCatalogList() {
        return productStoreCatalogList;
    }

    public void setProductStoreCatalogList(List<ProductStoreCatalog> productStoreCatalogList) {
        this.productStoreCatalogList = productStoreCatalogList;
    }

    public List<WebSite> getWebSiteList() {
        return webSiteList;
    }

    public void setWebSiteList(List<WebSite> webSiteList) {
        this.webSiteList = webSiteList;
    }

    public List<ProductStoreKeywordOvrd> getProductStoreKeywordOvrdList() {
        return productStoreKeywordOvrdList;
    }

    public void setProductStoreKeywordOvrdList(List<ProductStoreKeywordOvrd> productStoreKeywordOvrdList) {
        this.productStoreKeywordOvrdList = productStoreKeywordOvrdList;
    }

    public List<ProductStoreFinActSetting> getProductStoreFinActSettingList() {
        return productStoreFinActSettingList;
    }

    public void setProductStoreFinActSettingList(List<ProductStoreFinActSetting> productStoreFinActSettingList) {
        this.productStoreFinActSettingList = productStoreFinActSettingList;
    }

    public List<ProductStorePromoAppl> getProductStorePromoApplList() {
        return productStorePromoApplList;
    }

    public void setProductStorePromoApplList(List<ProductStorePromoAppl> productStorePromoApplList) {
        this.productStorePromoApplList = productStorePromoApplList;
    }

    public List<ProductStoreFacility> getProductStoreFacilityList() {
        return productStoreFacilityList;
    }

    public void setProductStoreFacilityList(List<ProductStoreFacility> productStoreFacilityList) {
        this.productStoreFacilityList = productStoreFacilityList;
    }

    public List<ProductStoreGroupMember> getProductStoreGroupMemberList() {
        return productStoreGroupMemberList;
    }

    public void setProductStoreGroupMemberList(List<ProductStoreGroupMember> productStoreGroupMemberList) {
        this.productStoreGroupMemberList = productStoreGroupMemberList;
    }

    public List<PartyProfileDefault> getPartyProfileDefaultList() {
        return partyProfileDefaultList;
    }

    public void setPartyProfileDefaultList(List<PartyProfileDefault> partyProfileDefaultList) {
        this.partyProfileDefaultList = partyProfileDefaultList;
    }

    public List<ProductStoreVendorPayment> getProductStoreVendorPaymentList() {
        return productStoreVendorPaymentList;
    }

    public void setProductStoreVendorPaymentList(List<ProductStoreVendorPayment> productStoreVendorPaymentList) {
        this.productStoreVendorPaymentList = productStoreVendorPaymentList;
    }

    public List<ProductStoreVendorShipment> getProductStoreVendorShipmentList() {
        return productStoreVendorShipmentList;
    }

    public void setProductStoreVendorShipmentList(List<ProductStoreVendorShipment> productStoreVendorShipmentList) {
        this.productStoreVendorShipmentList = productStoreVendorShipmentList;
    }

    public List<ProdStoreFacilityByAddr> getProdStoreFacilityByAddrList() {
        return prodStoreFacilityByAddrList;
    }

    public void setProdStoreFacilityByAddrList(List<ProdStoreFacilityByAddr> prodStoreFacilityByAddrList) {
        this.prodStoreFacilityByAddrList = prodStoreFacilityByAddrList;
    }

    public List<ProductStorePaymentSetting> getProductStorePaymentSettingList() {
        return productStorePaymentSettingList;
    }

    public void setProductStorePaymentSettingList(List<ProductStorePaymentSetting> productStorePaymentSettingList) {
        this.productStorePaymentSettingList = productStorePaymentSettingList;
    }

    public List<ProductStoreSurveyAppl> getProductStoreSurveyApplList() {
        return productStoreSurveyApplList;
    }

    public void setProductStoreSurveyApplList(List<ProductStoreSurveyAppl> productStoreSurveyApplList) {
        this.productStoreSurveyApplList = productStoreSurveyApplList;
    }

    public List<ProductStoreEmailSetting> getProductStoreEmailSettingList() {
        return productStoreEmailSettingList;
    }

    public void setProductStoreEmailSettingList(List<ProductStoreEmailSetting> productStoreEmailSettingList) {
        this.productStoreEmailSettingList = productStoreEmailSettingList;
    }

    public List<ProductReview> getProductReviewList() {
        return productReviewList;
    }

    public void setProductReviewList(List<ProductReview> productReviewList) {
        this.productReviewList = productReviewList;
    }

    public List<ProductStoreRole> getProductStoreRoleList() {
        return productStoreRoleList;
    }

    public void setProductStoreRoleList(List<ProductStoreRole> productStoreRoleList) {
        this.productStoreRoleList = productStoreRoleList;
    }

    public List<SegmentGroup> getSegmentGroupList() {
        return segmentGroupList;
    }

    public void setSegmentGroupList(List<SegmentGroup> segmentGroupList) {
        this.segmentGroupList = segmentGroupList;
    }

    public List<SalesForecastItem> getSalesForecastItemList() {
        return salesForecastItemList;
    }

    public void setSalesForecastItemList(List<SalesForecastItem> salesForecastItemList) {
        this.salesForecastItemList = salesForecastItemList;
    }*/
    
}
