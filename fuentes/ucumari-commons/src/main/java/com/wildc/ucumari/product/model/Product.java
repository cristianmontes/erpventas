/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.product.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.facility.model.Facility;
import com.wildc.ucumari.parameters.model.Uom;
import com.wildc.ucumari.parameters.model.UomType;
import com.wildc.ucumari.party.model.Party;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "product")
public class Product implements Serializable {
    /*@OneToMany(mappedBy = "subProductId")
    private List<ShipmentPackageContent> shipmentPackageContentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
    private List<WorkEffortGoodStandard> workEffortGoodStandardList;
    @OneToMany(mappedBy = "productId")
    private List<ShoppingListItem> shoppingListItemList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
    private List<VendorProduct> vendorProductList;
    @OneToMany(mappedBy = "productId")
    private List<ReorderGuideline> reorderGuidelineList;
    @OneToMany(mappedBy = "productId")
    private List<SalesForecastDetail> salesForecastDetailList;
    @OneToMany(mappedBy = "productId")
    private List<Subscription> subscriptionList;
    @OneToMany(mappedBy = "productId")
    private List<SalesForecastItem> salesForecastItemList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
    private List<SupplierProduct> supplierProductList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
    private List<ProductFeatureApplAttr> productFeatureApplAttrList;
    @OneToMany(mappedBy = "productIdInSubst")
    private List<ProductManufacturingRule> productManufacturingRuleList;
    @OneToMany(mappedBy = "productId")
    private List<ProductManufacturingRule> productManufacturingRuleList1;
    @OneToMany(mappedBy = "productIdIn")
    private List<ProductManufacturingRule> productManufacturingRuleList2;
    @OneToMany(mappedBy = "productIdFor")
    private List<ProductManufacturingRule> productManufacturingRuleList3;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
    private List<ProductRole> productRoleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
    private List<ProductAttribute> productAttributeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
    private List<ProductPromoProduct> productPromoProductList;
    @OneToMany(mappedBy = "productId")
    private List<ProductAverageCost> productAverageCostList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
    private List<ProductMaint> productMaintList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
    private List<ProductSubscriptionResource> productSubscriptionResourceList;
    @OneToMany(mappedBy = "productId")
    private List<ProductOrderItem> productOrderItemList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
    private List<ProductPrice> productPriceList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
    private List<ProductContent> productContentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
    private List<ProductFacilityLocation> productFacilityLocationList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
    private List<ProductGlAccount> productGlAccountList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
    private List<ProductFacility> productFacilityList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
    private List<ProductConfigStats> productConfigStatsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
    private List<ProductConfig> productConfigList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
    private List<ProductCategoryMember> productCategoryMemberList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
    private List<ProductPaymentMethodType> productPaymentMethodTypeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
    private List<ProductFeatureAppl> productFeatureApplList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
    private List<ProductGeo> productGeoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
    private List<ProductAssoc> productAssocList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product1")
    private List<ProductAssoc> productAssocList1;
    @OneToMany(mappedBy = "productId")
    private List<PartyNeed> partyNeedList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
    private List<ProductKeyword> productKeywordList;
    @OneToMany(mappedBy = "productId")
    private List<ProductReview> productReviewList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
    private List<ProductMeter> productMeterList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "product")
    private ProductCalculatedInfo productCalculatedInfo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
    private List<InventoryItemTempRes> inventoryItemTempResList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
    private List<InventoryEventPlanned> inventoryEventPlannedList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
    private List<GoodIdentification> goodIdentificationList;
    @OneToMany(mappedBy = "productId")
    private List<ShipmentItem> shipmentItemList;
    @OneToMany(mappedBy = "productId")
    private List<Requirement> requirementList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
    private List<CommunicationEventProduct> communicationEventProductList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
    private List<ProductConfigProduct> productConfigProductList;
    @OneToMany(mappedBy = "productId")
    private List<CostComponent> costComponentList;
    @OneToMany(mappedBy = "productId")
    private List<CartAbandonedLine> cartAbandonedLineList;*/
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PRODUCT_ID")
    private String productId;
    @Column(name = "INTRODUCTION_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date introductionDate;
    @Column(name = "SUPPORT_DISCONTINUATION_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date supportDiscontinuationDate;
    @Column(name = "SALES_DISCONTINUATION_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date salesDiscontinuationDate;
    @Column(name = "SALES_DISC_WHEN_NOT_AVAIL")
    private Character salesDiscWhenNotAvail;
    @Column(name = "INTERNAL_NAME")
    private String internalName;
    @Column(name = "BRAND_NAME")
    private String brandName;
    @Column(name = "COMMENTS")
    private String comments;
    @Column(name = "PRODUCT_NAME")
    private String productName;
    @Column(name = "DESCRIPTION")
    private String description;
    @Lob
    @Column(name = "LONG_DESCRIPTION")
    private String longDescription;
    @Column(name = "PRICE_DETAIL_TEXT")
    private String priceDetailText;
    @Column(name = "SMALL_IMAGE_URL")
    private String smallImageUrl;
    @Column(name = "MEDIUM_IMAGE_URL")
    private String mediumImageUrl;
    @Column(name = "LARGE_IMAGE_URL")
    private String largeImageUrl;
    @Column(name = "DETAIL_IMAGE_URL")
    private String detailImageUrl;
    @Column(name = "ORIGINAL_IMAGE_URL")
    private String originalImageUrl;
    @Column(name = "DETAIL_SCREEN")
    private String detailScreen;
    @Column(name = "INVENTORY_MESSAGE")
    private String inventoryMessage;
    @Column(name = "REQUIRE_INVENTORY")
    private Character requireInventory;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "QUANTITY_INCLUDED")
    private BigDecimal quantityIncluded;
    @Column(name = "PIECES_INCLUDED")
    private BigInteger piecesIncluded;
    @Column(name = "REQUIRE_AMOUNT")
    private Character requireAmount;
    @Column(name = "FIXED_AMOUNT")
    private BigDecimal fixedAmount;
    @Column(name = "WEIGHT")
    private BigDecimal weight;
    @Column(name = "PRODUCT_HEIGHT")
    private BigDecimal productHeight;
    @Column(name = "SHIPPING_HEIGHT")
    private BigDecimal shippingHeight;
    @Column(name = "PRODUCT_WIDTH")
    private BigDecimal productWidth;
    @Column(name = "SHIPPING_WIDTH")
    private BigDecimal shippingWidth;
    @Column(name = "PRODUCT_DEPTH")
    private BigDecimal productDepth;
    @Column(name = "SHIPPING_DEPTH")
    private BigDecimal shippingDepth;
    @Column(name = "PRODUCT_RATING")
    private BigDecimal productRating;
    @Column(name = "RETURNABLE")
    private Character returnable;
    @Column(name = "TAXABLE")
    private Character taxable;
    @Column(name = "CHARGE_SHIPPING")
    private Character chargeShipping;
    @Column(name = "AUTO_CREATE_KEYWORDS")
    private Character autoCreateKeywords;
    @Column(name = "INCLUDE_IN_PROMOTIONS")
    private Character includeInPromotions;
    @Column(name = "IS_VIRTUAL")
    private Character isVirtual;
    @Column(name = "IS_VARIANT")
    private Character isVariant;
    @Column(name = "BILL_OF_MATERIAL_LEVEL")
    private BigInteger billOfMaterialLevel;
    @Column(name = "RESERV_MAX_PERSONS")
    private BigDecimal reservMaxPersons;
    @Column(name = "RESERV2ND_P_P_PERC")
    private BigDecimal reserv2ndPPPerc;
    @Column(name = "RESERV_NTH_P_P_PERC")
    private BigDecimal reservNthPPPerc;
    @Column(name = "CONFIG_ID")
    private String configId;
    @Column(name = "CREATED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @Column(name = "LAST_MODIFIED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;
    @Column(name = "IN_SHIPPING_BOX")
    private Character inShippingBox;
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
    @Column(name = "IS_ACTIVE")
    private Character isActive;
    
    @JoinColumn(name = "WIDTH_UOM_ID", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom widthUomId;
    @JoinColumn(name = "WEIGHT_UOM_ID", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom weightUomId;
    @JoinColumn(name = "PRODUCT_TYPE_ID", referencedColumnName = "PRODUCT_TYPE_ID")
    @ManyToOne
    private ProductType productTypeId;
    @JoinColumn(name = "AMOUNT_UOM_TYPE_ID", referencedColumnName = "UOM_TYPE_ID")
    @ManyToOne
    private UomType amountUomTypeId;
    @JoinColumn(name = "DEPTH_UOM_ID", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom depthUomId;
    @JoinColumn(name = "FACILITY_ID", referencedColumnName = "FACILITY_ID")
    @ManyToOne
    private Facility facilityId;
    @JoinColumn(name = "HEIGHT_UOM_ID", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom heightUomId;
    @JoinColumn(name = "MANUFACTURER_PARTY_ID", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party manufacturerPartyId;
    @JoinColumn(name = "PRIMARY_PRODUCT_CATEGORY_ID", referencedColumnName = "PRODUCT_CATEGORY_ID")
    @ManyToOne
    private ProductCategory primaryProductCategoryId;
    @JoinColumn(name = "QUANTITY_UOM_ID", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom quantityUomId;
    
    /*@OneToMany(mappedBy = "productId")
    private List<ShipmentReceipt> shipmentReceiptList;
    @OneToMany(mappedBy = "productId")
    private List<QuoteItem> quoteItemList;    
    @OneToMany(mappedBy = "productId")
    private List<InventoryItem> inventoryItemList;
    @OneToMany(mappedBy = "productId")
    private List<CustRequestItem> custRequestItemList;
    @OneToMany(mappedBy = "instanceOfProductId")
    private List<FixedAsset> fixedAssetList;
    @OneToMany(mappedBy = "productId")
    private List<OrderItem> orderItemList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
    private List<AgreementProductAppl> agreementProductApplList;    
    @JoinColumn(name = "VIRTUAL_VARIANT_METHOD_ENUM", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration virtualVariantMethodEnum;    
    @JoinColumn(name = "DEFAULT_SHIPMENT_BOX_TYPE_ID", referencedColumnName = "SHIPMENT_BOX_TYPE_ID")
    @ManyToOne
    private ShipmentBoxType defaultShipmentBoxTypeId;    
    @JoinColumn(name = "CREATED_BY_USER_LOGIN", referencedColumnName = "USER_LOGIN_ID")
    @ManyToOne
    private UserLogin createdByUserLogin;    
    @JoinColumn(name = "LAST_MODIFIED_BY_USER_LOGIN", referencedColumnName = "USER_LOGIN_ID")
    @ManyToOne
    private UserLogin lastModifiedByUserLogin;    
    @JoinColumn(name = "ORIGIN_GEO_ID", referencedColumnName = "GEO_ID")
    @ManyToOne
    private Geo originGeoId;
    
    @JoinColumn(name = "RATING_TYPE_ENUM", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration ratingTypeEnum;
    @JoinColumn(name = "REQUIREMENT_METHOD_ENUM_ID", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration requirementMethodEnumId;
    @OneToMany(mappedBy = "productId")
    private List<AgreementTerm> agreementTermList;
    @OneToMany(mappedBy = "productId")
    private List<ReturnItem> returnItemList;
    @OneToMany(mappedBy = "productId")
    private List<Agreement> agreementList;
    @OneToMany(mappedBy = "productId")
    private List<InvoiceItem> invoiceItemList;*/

    public Product() {
    }

    public Product(String productId) {
        this.productId = productId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Date getIntroductionDate() {
        return introductionDate;
    }

    public void setIntroductionDate(Date introductionDate) {
        this.introductionDate = introductionDate;
    }

    public Date getSupportDiscontinuationDate() {
        return supportDiscontinuationDate;
    }

    public void setSupportDiscontinuationDate(Date supportDiscontinuationDate) {
        this.supportDiscontinuationDate = supportDiscontinuationDate;
    }

    public Date getSalesDiscontinuationDate() {
        return salesDiscontinuationDate;
    }

    public void setSalesDiscontinuationDate(Date salesDiscontinuationDate) {
        this.salesDiscontinuationDate = salesDiscontinuationDate;
    }

    public Character getSalesDiscWhenNotAvail() {
        return salesDiscWhenNotAvail;
    }

    public void setSalesDiscWhenNotAvail(Character salesDiscWhenNotAvail) {
        this.salesDiscWhenNotAvail = salesDiscWhenNotAvail;
    }

    public String getInternalName() {
        return internalName;
    }

    public void setInternalName(String internalName) {
        this.internalName = internalName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public String getPriceDetailText() {
        return priceDetailText;
    }

    public void setPriceDetailText(String priceDetailText) {
        this.priceDetailText = priceDetailText;
    }

    public String getSmallImageUrl() {
        return smallImageUrl;
    }

    public void setSmallImageUrl(String smallImageUrl) {
        this.smallImageUrl = smallImageUrl;
    }

    public String getMediumImageUrl() {
        return mediumImageUrl;
    }

    public void setMediumImageUrl(String mediumImageUrl) {
        this.mediumImageUrl = mediumImageUrl;
    }

    public String getLargeImageUrl() {
        return largeImageUrl;
    }

    public void setLargeImageUrl(String largeImageUrl) {
        this.largeImageUrl = largeImageUrl;
    }

    public String getDetailImageUrl() {
        return detailImageUrl;
    }

    public void setDetailImageUrl(String detailImageUrl) {
        this.detailImageUrl = detailImageUrl;
    }

    public String getOriginalImageUrl() {
        return originalImageUrl;
    }

    public void setOriginalImageUrl(String originalImageUrl) {
        this.originalImageUrl = originalImageUrl;
    }

    public String getDetailScreen() {
        return detailScreen;
    }

    public void setDetailScreen(String detailScreen) {
        this.detailScreen = detailScreen;
    }

    public String getInventoryMessage() {
        return inventoryMessage;
    }

    public void setInventoryMessage(String inventoryMessage) {
        this.inventoryMessage = inventoryMessage;
    }

    public Character getRequireInventory() {
        return requireInventory;
    }

    public void setRequireInventory(Character requireInventory) {
        this.requireInventory = requireInventory;
    }

    public BigDecimal getQuantityIncluded() {
        return quantityIncluded;
    }

    public void setQuantityIncluded(BigDecimal quantityIncluded) {
        this.quantityIncluded = quantityIncluded;
    }

    public BigInteger getPiecesIncluded() {
        return piecesIncluded;
    }

    public void setPiecesIncluded(BigInteger piecesIncluded) {
        this.piecesIncluded = piecesIncluded;
    }

    public Character getRequireAmount() {
        return requireAmount;
    }

    public void setRequireAmount(Character requireAmount) {
        this.requireAmount = requireAmount;
    }

    public BigDecimal getFixedAmount() {
        return fixedAmount;
    }

    public void setFixedAmount(BigDecimal fixedAmount) {
        this.fixedAmount = fixedAmount;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getProductHeight() {
        return productHeight;
    }

    public void setProductHeight(BigDecimal productHeight) {
        this.productHeight = productHeight;
    }

    public BigDecimal getShippingHeight() {
        return shippingHeight;
    }

    public void setShippingHeight(BigDecimal shippingHeight) {
        this.shippingHeight = shippingHeight;
    }

    public BigDecimal getProductWidth() {
        return productWidth;
    }

    public void setProductWidth(BigDecimal productWidth) {
        this.productWidth = productWidth;
    }

    public BigDecimal getShippingWidth() {
        return shippingWidth;
    }

    public void setShippingWidth(BigDecimal shippingWidth) {
        this.shippingWidth = shippingWidth;
    }

    public BigDecimal getProductDepth() {
        return productDepth;
    }

    public void setProductDepth(BigDecimal productDepth) {
        this.productDepth = productDepth;
    }

    public BigDecimal getShippingDepth() {
        return shippingDepth;
    }

    public void setShippingDepth(BigDecimal shippingDepth) {
        this.shippingDepth = shippingDepth;
    }

    public BigDecimal getProductRating() {
        return productRating;
    }

    public void setProductRating(BigDecimal productRating) {
        this.productRating = productRating;
    }

    public Character getReturnable() {
        return returnable;
    }

    public void setReturnable(Character returnable) {
        this.returnable = returnable;
    }

    public Character getTaxable() {
        return taxable;
    }

    public void setTaxable(Character taxable) {
        this.taxable = taxable;
    }

    public Character getChargeShipping() {
        return chargeShipping;
    }

    public void setChargeShipping(Character chargeShipping) {
        this.chargeShipping = chargeShipping;
    }

    public Character getAutoCreateKeywords() {
        return autoCreateKeywords;
    }

    public void setAutoCreateKeywords(Character autoCreateKeywords) {
        this.autoCreateKeywords = autoCreateKeywords;
    }

    public Character getIncludeInPromotions() {
        return includeInPromotions;
    }

    public void setIncludeInPromotions(Character includeInPromotions) {
        this.includeInPromotions = includeInPromotions;
    }

    public Character getIsVirtual() {
        return isVirtual;
    }

    public void setIsVirtual(Character isVirtual) {
        this.isVirtual = isVirtual;
    }

    public Character getIsVariant() {
        return isVariant;
    }

    public void setIsVariant(Character isVariant) {
        this.isVariant = isVariant;
    }

    public BigInteger getBillOfMaterialLevel() {
        return billOfMaterialLevel;
    }

    public void setBillOfMaterialLevel(BigInteger billOfMaterialLevel) {
        this.billOfMaterialLevel = billOfMaterialLevel;
    }

    public BigDecimal getReservMaxPersons() {
        return reservMaxPersons;
    }

    public void setReservMaxPersons(BigDecimal reservMaxPersons) {
        this.reservMaxPersons = reservMaxPersons;
    }

    public BigDecimal getReserv2ndPPPerc() {
        return reserv2ndPPPerc;
    }

    public void setReserv2ndPPPerc(BigDecimal reserv2ndPPPerc) {
        this.reserv2ndPPPerc = reserv2ndPPPerc;
    }

    public BigDecimal getReservNthPPPerc() {
        return reservNthPPPerc;
    }

    public void setReservNthPPPerc(BigDecimal reservNthPPPerc) {
        this.reservNthPPPerc = reservNthPPPerc;
    }

    public String getConfigId() {
        return configId;
    }

    public void setConfigId(String configId) {
        this.configId = configId;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public Character getInShippingBox() {
        return inShippingBox;
    }

    public void setInShippingBox(Character inShippingBox) {
        this.inShippingBox = inShippingBox;
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

    public Character getIsActive() {
        return isActive;
    }

    public void setIsActive(Character isActive) {
        this.isActive = isActive;
    }
    
    public Uom getWidthUomId() {
        return widthUomId;
    }

    public void setWidthUomId(Uom widthUomId) {
        this.widthUomId = widthUomId;
    }

    public Uom getWeightUomId() {
        return weightUomId;
    }

    public void setWeightUomId(Uom weightUomId) {
        this.weightUomId = weightUomId;
    }

    public ProductType getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(ProductType productTypeId) {
        this.productTypeId = productTypeId;
    }

    public UomType getAmountUomTypeId() {
        return amountUomTypeId;
    }

    public void setAmountUomTypeId(UomType amountUomTypeId) {
        this.amountUomTypeId = amountUomTypeId;
    }


    public Uom getDepthUomId() {
        return depthUomId;
    }

    public void setDepthUomId(Uom depthUomId) {
        this.depthUomId = depthUomId;
    }

    public Facility getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(Facility facilityId) {
        this.facilityId = facilityId;
    }

    public Uom getHeightUomId() {
        return heightUomId;
    }

    public void setHeightUomId(Uom heightUomId) {
        this.heightUomId = heightUomId;
    }

    public Party getManufacturerPartyId() {
        return manufacturerPartyId;
    }

    public void setManufacturerPartyId(Party manufacturerPartyId) {
        this.manufacturerPartyId = manufacturerPartyId;
    }

    public ProductCategory getPrimaryProductCategoryId() {
        return primaryProductCategoryId;
    }

    public void setPrimaryProductCategoryId(ProductCategory primaryProductCategoryId) {
        this.primaryProductCategoryId = primaryProductCategoryId;
    }

    public Uom getQuantityUomId() {
        return quantityUomId;
    }

    public void setQuantityUomId(Uom quantityUomId) {
        this.quantityUomId = quantityUomId;
    }
/*
    public List<ShipmentReceipt> getShipmentReceiptList() {
        return shipmentReceiptList;
    }

    public void setShipmentReceiptList(List<ShipmentReceipt> shipmentReceiptList) {
        this.shipmentReceiptList = shipmentReceiptList;
    }

    public List<QuoteItem> getQuoteItemList() {
        return quoteItemList;
    }

    public void setQuoteItemList(List<QuoteItem> quoteItemList) {
        this.quoteItemList = quoteItemList;
    }

    public List<InventoryItem> getInventoryItemList() {
        return inventoryItemList;
    }

    public void setInventoryItemList(List<InventoryItem> inventoryItemList) {
        this.inventoryItemList = inventoryItemList;
    }

    public List<CustRequestItem> getCustRequestItemList() {
        return custRequestItemList;
    }

    public void setCustRequestItemList(List<CustRequestItem> custRequestItemList) {
        this.custRequestItemList = custRequestItemList;
    }

    public List<FixedAsset> getFixedAssetList() {
        return fixedAssetList;
    }

    public void setFixedAssetList(List<FixedAsset> fixedAssetList) {
        this.fixedAssetList = fixedAssetList;
    }

    public List<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(List<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public List<AgreementProductAppl> getAgreementProductApplList() {
        return agreementProductApplList;
    }

    public void setAgreementProductApplList(List<AgreementProductAppl> agreementProductApplList) {
        this.agreementProductApplList = agreementProductApplList;
    }

    public Enumeration getVirtualVariantMethodEnum() {
        return virtualVariantMethodEnum;
    }

    public void setVirtualVariantMethodEnum(Enumeration virtualVariantMethodEnum) {
        this.virtualVariantMethodEnum = virtualVariantMethodEnum;
    }

    public ShipmentBoxType getDefaultShipmentBoxTypeId() {
        return defaultShipmentBoxTypeId;
    }

    public void setDefaultShipmentBoxTypeId(ShipmentBoxType defaultShipmentBoxTypeId) {
        this.defaultShipmentBoxTypeId = defaultShipmentBoxTypeId;
    }

    public UserLogin getCreatedByUserLogin() {
        return createdByUserLogin;
    }

    public void setCreatedByUserLogin(UserLogin createdByUserLogin) {
        this.createdByUserLogin = createdByUserLogin;
    }

    public UserLogin getLastModifiedByUserLogin() {
        return lastModifiedByUserLogin;
    }

    public void setLastModifiedByUserLogin(UserLogin lastModifiedByUserLogin) {
        this.lastModifiedByUserLogin = lastModifiedByUserLogin;
    }

    public Geo getOriginGeoId() {
        return originGeoId;
    }

    public void setOriginGeoId(Geo originGeoId) {
        this.originGeoId = originGeoId;
    }

    public Enumeration getRatingTypeEnum() {
        return ratingTypeEnum;
    }

    public void setRatingTypeEnum(Enumeration ratingTypeEnum) {
        this.ratingTypeEnum = ratingTypeEnum;
    }

    public Enumeration getRequirementMethodEnumId() {
        return requirementMethodEnumId;
    }

    public void setRequirementMethodEnumId(Enumeration requirementMethodEnumId) {
        this.requirementMethodEnumId = requirementMethodEnumId;
    }

    public List<AgreementTerm> getAgreementTermList() {
        return agreementTermList;
    }

    public void setAgreementTermList(List<AgreementTerm> agreementTermList) {
        this.agreementTermList = agreementTermList;
    }

    public List<ReturnItem> getReturnItemList() {
        return returnItemList;
    }

    public void setReturnItemList(List<ReturnItem> returnItemList) {
        this.returnItemList = returnItemList;
    }

    public List<Agreement> getAgreementList() {
        return agreementList;
    }

    public void setAgreementList(List<Agreement> agreementList) {
        this.agreementList = agreementList;
    }

    public List<InvoiceItem> getInvoiceItemList() {
        return invoiceItemList;
    }

    public void setInvoiceItemList(List<InvoiceItem> invoiceItemList) {
        this.invoiceItemList = invoiceItemList;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productId != null ? productId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Product)) {
            return false;
        }
        Product other = (Product) object;
        if ((this.productId == null && other.productId != null) || (this.productId != null && !this.productId.equals(other.productId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.Product[ productId=" + productId + " ]";
    }
/*
    public List<CommunicationEventProduct> getCommunicationEventProductList() {
        return communicationEventProductList;
    }

    public void setCommunicationEventProductList(List<CommunicationEventProduct> communicationEventProductList) {
        this.communicationEventProductList = communicationEventProductList;
    }

    public List<ProductConfigProduct> getProductConfigProductList() {
        return productConfigProductList;
    }

    public void setProductConfigProductList(List<ProductConfigProduct> productConfigProductList) {
        this.productConfigProductList = productConfigProductList;
    }

    public List<CostComponent> getCostComponentList() {
        return costComponentList;
    }

    public void setCostComponentList(List<CostComponent> costComponentList) {
        this.costComponentList = costComponentList;
    }

    public List<CartAbandonedLine> getCartAbandonedLineList() {
        return cartAbandonedLineList;
    }

    public void setCartAbandonedLineList(List<CartAbandonedLine> cartAbandonedLineList) {
        this.cartAbandonedLineList = cartAbandonedLineList;
    }

    public List<Requirement> getRequirementList() {
        return requirementList;
    }

    public void setRequirementList(List<Requirement> requirementList) {
        this.requirementList = requirementList;
    }

    public List<InventoryItemTempRes> getInventoryItemTempResList() {
        return inventoryItemTempResList;
    }

    public void setInventoryItemTempResList(List<InventoryItemTempRes> inventoryItemTempResList) {
        this.inventoryItemTempResList = inventoryItemTempResList;
    }

    public List<InventoryEventPlanned> getInventoryEventPlannedList() {
        return inventoryEventPlannedList;
    }

    public void setInventoryEventPlannedList(List<InventoryEventPlanned> inventoryEventPlannedList) {
        this.inventoryEventPlannedList = inventoryEventPlannedList;
    }

    public List<GoodIdentification> getGoodIdentificationList() {
        return goodIdentificationList;
    }

    public void setGoodIdentificationList(List<GoodIdentification> goodIdentificationList) {
        this.goodIdentificationList = goodIdentificationList;
    }

    public List<ShipmentItem> getShipmentItemList() {
        return shipmentItemList;
    }

    public void setShipmentItemList(List<ShipmentItem> shipmentItemList) {
        this.shipmentItemList = shipmentItemList;
    }

    public List<ProductFeatureApplAttr> getProductFeatureApplAttrList() {
        return productFeatureApplAttrList;
    }

    public void setProductFeatureApplAttrList(List<ProductFeatureApplAttr> productFeatureApplAttrList) {
        this.productFeatureApplAttrList = productFeatureApplAttrList;
    }

    public List<ProductManufacturingRule> getProductManufacturingRuleList() {
        return productManufacturingRuleList;
    }

    public void setProductManufacturingRuleList(List<ProductManufacturingRule> productManufacturingRuleList) {
        this.productManufacturingRuleList = productManufacturingRuleList;
    }

    public List<ProductManufacturingRule> getProductManufacturingRuleList1() {
        return productManufacturingRuleList1;
    }

    public void setProductManufacturingRuleList1(List<ProductManufacturingRule> productManufacturingRuleList1) {
        this.productManufacturingRuleList1 = productManufacturingRuleList1;
    }

    public List<ProductManufacturingRule> getProductManufacturingRuleList2() {
        return productManufacturingRuleList2;
    }

    public void setProductManufacturingRuleList2(List<ProductManufacturingRule> productManufacturingRuleList2) {
        this.productManufacturingRuleList2 = productManufacturingRuleList2;
    }

    public List<ProductManufacturingRule> getProductManufacturingRuleList3() {
        return productManufacturingRuleList3;
    }

    public void setProductManufacturingRuleList3(List<ProductManufacturingRule> productManufacturingRuleList3) {
        this.productManufacturingRuleList3 = productManufacturingRuleList3;
    }

    public List<ProductRole> getProductRoleList() {
        return productRoleList;
    }

    public void setProductRoleList(List<ProductRole> productRoleList) {
        this.productRoleList = productRoleList;
    }

    public List<ProductAttribute> getProductAttributeList() {
        return productAttributeList;
    }

    public void setProductAttributeList(List<ProductAttribute> productAttributeList) {
        this.productAttributeList = productAttributeList;
    }

    public List<ProductPromoProduct> getProductPromoProductList() {
        return productPromoProductList;
    }

    public void setProductPromoProductList(List<ProductPromoProduct> productPromoProductList) {
        this.productPromoProductList = productPromoProductList;
    }

    public List<ProductAverageCost> getProductAverageCostList() {
        return productAverageCostList;
    }

    public void setProductAverageCostList(List<ProductAverageCost> productAverageCostList) {
        this.productAverageCostList = productAverageCostList;
    }

    public List<ProductMaint> getProductMaintList() {
        return productMaintList;
    }

    public void setProductMaintList(List<ProductMaint> productMaintList) {
        this.productMaintList = productMaintList;
    }

    public List<ProductSubscriptionResource> getProductSubscriptionResourceList() {
        return productSubscriptionResourceList;
    }

    public void setProductSubscriptionResourceList(List<ProductSubscriptionResource> productSubscriptionResourceList) {
        this.productSubscriptionResourceList = productSubscriptionResourceList;
    }

    public List<ProductOrderItem> getProductOrderItemList() {
        return productOrderItemList;
    }

    public void setProductOrderItemList(List<ProductOrderItem> productOrderItemList) {
        this.productOrderItemList = productOrderItemList;
    }

    public List<ProductPrice> getProductPriceList() {
        return productPriceList;
    }

    public void setProductPriceList(List<ProductPrice> productPriceList) {
        this.productPriceList = productPriceList;
    }

    public List<ProductContent> getProductContentList() {
        return productContentList;
    }

    public void setProductContentList(List<ProductContent> productContentList) {
        this.productContentList = productContentList;
    }

    public List<ProductFacilityLocation> getProductFacilityLocationList() {
        return productFacilityLocationList;
    }

    public void setProductFacilityLocationList(List<ProductFacilityLocation> productFacilityLocationList) {
        this.productFacilityLocationList = productFacilityLocationList;
    }

    public List<ProductGlAccount> getProductGlAccountList() {
        return productGlAccountList;
    }

    public void setProductGlAccountList(List<ProductGlAccount> productGlAccountList) {
        this.productGlAccountList = productGlAccountList;
    }

    public List<ProductFacility> getProductFacilityList() {
        return productFacilityList;
    }

    public void setProductFacilityList(List<ProductFacility> productFacilityList) {
        this.productFacilityList = productFacilityList;
    }

    public List<ProductConfigStats> getProductConfigStatsList() {
        return productConfigStatsList;
    }

    public void setProductConfigStatsList(List<ProductConfigStats> productConfigStatsList) {
        this.productConfigStatsList = productConfigStatsList;
    }

    public List<ProductConfig> getProductConfigList() {
        return productConfigList;
    }

    public void setProductConfigList(List<ProductConfig> productConfigList) {
        this.productConfigList = productConfigList;
    }

    public List<ProductCategoryMember> getProductCategoryMemberList() {
        return productCategoryMemberList;
    }

    public void setProductCategoryMemberList(List<ProductCategoryMember> productCategoryMemberList) {
        this.productCategoryMemberList = productCategoryMemberList;
    }

    public List<ProductPaymentMethodType> getProductPaymentMethodTypeList() {
        return productPaymentMethodTypeList;
    }

    public void setProductPaymentMethodTypeList(List<ProductPaymentMethodType> productPaymentMethodTypeList) {
        this.productPaymentMethodTypeList = productPaymentMethodTypeList;
    }

    public List<ProductFeatureAppl> getProductFeatureApplList() {
        return productFeatureApplList;
    }

    public void setProductFeatureApplList(List<ProductFeatureAppl> productFeatureApplList) {
        this.productFeatureApplList = productFeatureApplList;
    }

    public List<ProductGeo> getProductGeoList() {
        return productGeoList;
    }

    public void setProductGeoList(List<ProductGeo> productGeoList) {
        this.productGeoList = productGeoList;
    }

    public List<ProductAssoc> getProductAssocList() {
        return productAssocList;
    }

    public void setProductAssocList(List<ProductAssoc> productAssocList) {
        this.productAssocList = productAssocList;
    }

    public List<ProductAssoc> getProductAssocList1() {
        return productAssocList1;
    }

    public void setProductAssocList1(List<ProductAssoc> productAssocList1) {
        this.productAssocList1 = productAssocList1;
    }

    public List<PartyNeed> getPartyNeedList() {
        return partyNeedList;
    }

    public void setPartyNeedList(List<PartyNeed> partyNeedList) {
        this.partyNeedList = partyNeedList;
    }

    public List<ProductKeyword> getProductKeywordList() {
        return productKeywordList;
    }

    public void setProductKeywordList(List<ProductKeyword> productKeywordList) {
        this.productKeywordList = productKeywordList;
    }

    public List<ProductReview> getProductReviewList() {
        return productReviewList;
    }

    public void setProductReviewList(List<ProductReview> productReviewList) {
        this.productReviewList = productReviewList;
    }

    public List<ProductMeter> getProductMeterList() {
        return productMeterList;
    }

    public void setProductMeterList(List<ProductMeter> productMeterList) {
        this.productMeterList = productMeterList;
    }

    public ProductCalculatedInfo getProductCalculatedInfo() {
        return productCalculatedInfo;
    }

    public void setProductCalculatedInfo(ProductCalculatedInfo productCalculatedInfo) {
        this.productCalculatedInfo = productCalculatedInfo;
    }

    public List<ShipmentPackageContent> getShipmentPackageContentList() {
        return shipmentPackageContentList;
    }

    public void setShipmentPackageContentList(List<ShipmentPackageContent> shipmentPackageContentList) {
        this.shipmentPackageContentList = shipmentPackageContentList;
    }

    public List<WorkEffortGoodStandard> getWorkEffortGoodStandardList() {
        return workEffortGoodStandardList;
    }

    public void setWorkEffortGoodStandardList(List<WorkEffortGoodStandard> workEffortGoodStandardList) {
        this.workEffortGoodStandardList = workEffortGoodStandardList;
    }

    public List<ShoppingListItem> getShoppingListItemList() {
        return shoppingListItemList;
    }

    public void setShoppingListItemList(List<ShoppingListItem> shoppingListItemList) {
        this.shoppingListItemList = shoppingListItemList;
    }

    public List<VendorProduct> getVendorProductList() {
        return vendorProductList;
    }

    public void setVendorProductList(List<VendorProduct> vendorProductList) {
        this.vendorProductList = vendorProductList;
    }

    public List<ReorderGuideline> getReorderGuidelineList() {
        return reorderGuidelineList;
    }

    public void setReorderGuidelineList(List<ReorderGuideline> reorderGuidelineList) {
        this.reorderGuidelineList = reorderGuidelineList;
    }

    public List<SalesForecastDetail> getSalesForecastDetailList() {
        return salesForecastDetailList;
    }

    public void setSalesForecastDetailList(List<SalesForecastDetail> salesForecastDetailList) {
        this.salesForecastDetailList = salesForecastDetailList;
    }

    public List<Subscription> getSubscriptionList() {
        return subscriptionList;
    }

    public void setSubscriptionList(List<Subscription> subscriptionList) {
        this.subscriptionList = subscriptionList;
    }

    public List<SalesForecastItem> getSalesForecastItemList() {
        return salesForecastItemList;
    }

    public void setSalesForecastItemList(List<SalesForecastItem> salesForecastItemList) {
        this.salesForecastItemList = salesForecastItemList;
    }

    public List<SupplierProduct> getSupplierProductList() {
        return supplierProductList;
    }

    public void setSupplierProductList(List<SupplierProduct> supplierProductList) {
        this.supplierProductList = supplierProductList;
    }*/
    
}
