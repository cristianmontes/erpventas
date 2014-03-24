/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "data_import_product")
@NamedQueries({
    @NamedQuery(name = "DataImportProduct.findAll", query = "SELECT d FROM DataImportProduct d")})
public class DataImportProduct implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PRODUCT_ID")
    private String productId;
    @Column(name = "PRODUCT_TYPE_ID")
    private String productTypeId;
    @Column(name = "IS_INACTIVE")
    private Character isInactive;
    @Column(name = "CUSTOM_ID1")
    private String customId1;
    @Column(name = "CUSTOM_ID2")
    private String customId2;
    @Column(name = "INTERNAL_NAME")
    private String internalName;
    @Column(name = "BRAND_NAME")
    private String brandName;
    @Column(name = "COMMENTS")
    private String comments;
    @Column(name = "PRODUCT_NAME")
    private String productName;
    @Lob
    @Column(name = "DESCRIPTION")
    private String description;
    @Lob
    @Column(name = "LONG_DESCRIPTION")
    private String longDescription;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "WEIGHT")
    private BigDecimal weight;
    @Column(name = "WEIGHT_UOM_ID")
    private String weightUomId;
    @Column(name = "PRODUCT_LENGTH")
    private BigDecimal productLength;
    @Column(name = "PRODUCT_LENGTH_UOM_ID")
    private String productLengthUomId;
    @Column(name = "WIDTH")
    private BigDecimal width;
    @Column(name = "WIDTH_UOM_ID")
    private String widthUomId;
    @Column(name = "HEIGHT")
    private BigDecimal height;
    @Column(name = "HEIGHT_UOM_ID")
    private String heightUomId;
    @Column(name = "PRICE")
    private BigDecimal price;
    @Column(name = "PRICE_CURRENCY_UOM_ID")
    private String priceCurrencyUomId;
    @Column(name = "PRODUCT_FEATURE1")
    private String productFeature1;
    @Column(name = "SUPPLIER_PARTY_ID")
    private String supplierPartyId;
    @Column(name = "SMALL_IMAGE_URL")
    private String smallImageUrl;
    @Column(name = "MEDIUM_IMAGE_URL")
    private String mediumImageUrl;
    @Column(name = "LARGE_IMAGE_URL")
    private String largeImageUrl;
    @Column(name = "PURCHASE_PRICE")
    private BigDecimal purchasePrice;
    @Column(name = "TAXABLE")
    private Character taxable;
    @Column(name = "STORE_ID")
    private String storeId;
    @Column(name = "CREATED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @Column(name = "IMPORT_STATUS_ID")
    private String importStatusId;
    @Lob
    @Column(name = "IMPORT_ERROR")
    private String importError;
    @Column(name = "LAST_MODIFIED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;
    @Column(name = "PROCESSED_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date processedTimestamp;
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

    public DataImportProduct() {
    }

    public DataImportProduct(String productId) {
        this.productId = productId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(String productTypeId) {
        this.productTypeId = productTypeId;
    }

    public Character getIsInactive() {
        return isInactive;
    }

    public void setIsInactive(Character isInactive) {
        this.isInactive = isInactive;
    }

    public String getCustomId1() {
        return customId1;
    }

    public void setCustomId1(String customId1) {
        this.customId1 = customId1;
    }

    public String getCustomId2() {
        return customId2;
    }

    public void setCustomId2(String customId2) {
        this.customId2 = customId2;
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

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public String getWeightUomId() {
        return weightUomId;
    }

    public void setWeightUomId(String weightUomId) {
        this.weightUomId = weightUomId;
    }

    public BigDecimal getProductLength() {
        return productLength;
    }

    public void setProductLength(BigDecimal productLength) {
        this.productLength = productLength;
    }

    public String getProductLengthUomId() {
        return productLengthUomId;
    }

    public void setProductLengthUomId(String productLengthUomId) {
        this.productLengthUomId = productLengthUomId;
    }

    public BigDecimal getWidth() {
        return width;
    }

    public void setWidth(BigDecimal width) {
        this.width = width;
    }

    public String getWidthUomId() {
        return widthUomId;
    }

    public void setWidthUomId(String widthUomId) {
        this.widthUomId = widthUomId;
    }

    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    public String getHeightUomId() {
        return heightUomId;
    }

    public void setHeightUomId(String heightUomId) {
        this.heightUomId = heightUomId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getPriceCurrencyUomId() {
        return priceCurrencyUomId;
    }

    public void setPriceCurrencyUomId(String priceCurrencyUomId) {
        this.priceCurrencyUomId = priceCurrencyUomId;
    }

    public String getProductFeature1() {
        return productFeature1;
    }

    public void setProductFeature1(String productFeature1) {
        this.productFeature1 = productFeature1;
    }

    public String getSupplierPartyId() {
        return supplierPartyId;
    }

    public void setSupplierPartyId(String supplierPartyId) {
        this.supplierPartyId = supplierPartyId;
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

    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Character getTaxable() {
        return taxable;
    }

    public void setTaxable(Character taxable) {
        this.taxable = taxable;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getImportStatusId() {
        return importStatusId;
    }

    public void setImportStatusId(String importStatusId) {
        this.importStatusId = importStatusId;
    }

    public String getImportError() {
        return importError;
    }

    public void setImportError(String importError) {
        this.importError = importError;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public Date getProcessedTimestamp() {
        return processedTimestamp;
    }

    public void setProcessedTimestamp(Date processedTimestamp) {
        this.processedTimestamp = processedTimestamp;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productId != null ? productId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DataImportProduct)) {
            return false;
        }
        DataImportProduct other = (DataImportProduct) object;
        if ((this.productId == null && other.productId != null) || (this.productId != null && !this.productId.equals(other.productId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.DataImportProduct[ productId=" + productId + " ]";
    }
    
}
