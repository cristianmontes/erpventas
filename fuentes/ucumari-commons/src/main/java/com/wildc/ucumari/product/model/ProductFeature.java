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
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "product_feature")

public class ProductFeature implements Serializable {
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "productFeature")
    private List<SupplierProductFeature> supplierProductFeatureList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productFeature")
    private List<ShipmentItemFeature> shipmentItemFeatureList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productFeature")
    private List<ProductFeatureApplAttr> productFeatureApplAttrList;
    @OneToMany(mappedBy = "productFeature")
    private List<ProductManufacturingRule> productManufacturingRuleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productFeature")
    private List<ProductFeatureDataResource> productFeatureDataResourceList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productFeature")
    private List<ProductFeatureGroupAppl> productFeatureGroupApplList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productFeature")
    private List<ProductFeatureAppl> productFeatureApplList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productFeature")
    private List<ProductFeatureIactn> productFeatureIactnList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productFeature1")
    private List<ProductFeatureIactn> productFeatureIactnList1;
    @OneToMany(mappedBy = "productFeatureId")
    private List<DesiredFeature> desiredFeatureList;
    @OneToMany(mappedBy = "productFeatureId")
    private List<CostComponent> costComponentList;*/
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PRODUCT_FEATURE_ID")
    private String productFeatureId;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "UOM_ID")
    private String uomId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "NUMBER_SPECIFIED")
    private BigDecimal numberSpecified;
    @Column(name = "DEFAULT_AMOUNT")
    private BigDecimal defaultAmount;
    @Column(name = "DEFAULT_SEQUENCE_NUM")
    private BigInteger defaultSequenceNum;
    @Column(name = "ABBREV")
    private String abbrev;
    @Column(name = "ID_CODE")
    private String idCode;
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
    /*@OneToMany(mappedBy = "productFeatureId")
    private List<QuoteItem> quoteItemList;*/
    @JoinColumn(name = "PRODUCT_FEATURE_TYPE_ID", referencedColumnName = "PRODUCT_FEATURE_TYPE_ID")
    @ManyToOne
    private ProductFeatureType productFeatureTypeId;
    @JoinColumn(name = "PRODUCT_FEATURE_CATEGORY_ID", referencedColumnName = "PRODUCT_FEATURE_CATEGORY_ID")
    @ManyToOne
    private ProductFeatureCategory productFeatureCategoryId;
    /*@OneToMany(mappedBy = "productFeatureId")
    private List<InvoiceItem> invoiceItemList;*/

    public ProductFeature() {
    }

    public ProductFeature(String productFeatureId) {
        this.productFeatureId = productFeatureId;
    }

    public String getProductFeatureId() {
        return productFeatureId;
    }

    public void setProductFeatureId(String productFeatureId) {
        this.productFeatureId = productFeatureId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUomId() {
        return uomId;
    }

    public void setUomId(String uomId) {
        this.uomId = uomId;
    }

    public BigDecimal getNumberSpecified() {
        return numberSpecified;
    }

    public void setNumberSpecified(BigDecimal numberSpecified) {
        this.numberSpecified = numberSpecified;
    }

    public BigDecimal getDefaultAmount() {
        return defaultAmount;
    }

    public void setDefaultAmount(BigDecimal defaultAmount) {
        this.defaultAmount = defaultAmount;
    }

    public BigInteger getDefaultSequenceNum() {
        return defaultSequenceNum;
    }

    public void setDefaultSequenceNum(BigInteger defaultSequenceNum) {
        this.defaultSequenceNum = defaultSequenceNum;
    }

    public String getAbbrev() {
        return abbrev;
    }

    public void setAbbrev(String abbrev) {
        this.abbrev = abbrev;
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode;
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
    public List<QuoteItem> getQuoteItemList() {
        return quoteItemList;
    }

    public void setQuoteItemList(List<QuoteItem> quoteItemList) {
        this.quoteItemList = quoteItemList;
    }*/

    public ProductFeatureType getProductFeatureTypeId() {
        return productFeatureTypeId;
    }

    public void setProductFeatureTypeId(ProductFeatureType productFeatureTypeId) {
        this.productFeatureTypeId = productFeatureTypeId;
    }

    public ProductFeatureCategory getProductFeatureCategoryId() {
        return productFeatureCategoryId;
    }

    public void setProductFeatureCategoryId(ProductFeatureCategory productFeatureCategoryId) {
        this.productFeatureCategoryId = productFeatureCategoryId;
    }
/*
    public List<InvoiceItem> getInvoiceItemList() {
        return invoiceItemList;
    }

    public void setInvoiceItemList(List<InvoiceItem> invoiceItemList) {
        this.invoiceItemList = invoiceItemList;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productFeatureId != null ? productFeatureId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductFeature)) {
            return false;
        }
        ProductFeature other = (ProductFeature) object;
        if ((this.productFeatureId == null && other.productFeatureId != null) || (this.productFeatureId != null && !this.productFeatureId.equals(other.productFeatureId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductFeature[ productFeatureId=" + productFeatureId + " ]";
    }
/*
    public List<CostComponent> getCostComponentList() {
        return costComponentList;
    }

    public void setCostComponentList(List<CostComponent> costComponentList) {
        this.costComponentList = costComponentList;
    }

    public List<DesiredFeature> getDesiredFeatureList() {
        return desiredFeatureList;
    }

    public void setDesiredFeatureList(List<DesiredFeature> desiredFeatureList) {
        this.desiredFeatureList = desiredFeatureList;
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

    public List<ProductFeatureDataResource> getProductFeatureDataResourceList() {
        return productFeatureDataResourceList;
    }

    public void setProductFeatureDataResourceList(List<ProductFeatureDataResource> productFeatureDataResourceList) {
        this.productFeatureDataResourceList = productFeatureDataResourceList;
    }

    public List<ProductFeatureGroupAppl> getProductFeatureGroupApplList() {
        return productFeatureGroupApplList;
    }

    public void setProductFeatureGroupApplList(List<ProductFeatureGroupAppl> productFeatureGroupApplList) {
        this.productFeatureGroupApplList = productFeatureGroupApplList;
    }

    public List<ProductFeatureAppl> getProductFeatureApplList() {
        return productFeatureApplList;
    }

    public void setProductFeatureApplList(List<ProductFeatureAppl> productFeatureApplList) {
        this.productFeatureApplList = productFeatureApplList;
    }

    public List<ProductFeatureIactn> getProductFeatureIactnList() {
        return productFeatureIactnList;
    }

    public void setProductFeatureIactnList(List<ProductFeatureIactn> productFeatureIactnList) {
        this.productFeatureIactnList = productFeatureIactnList;
    }

    public List<ProductFeatureIactn> getProductFeatureIactnList1() {
        return productFeatureIactnList1;
    }

    public void setProductFeatureIactnList1(List<ProductFeatureIactn> productFeatureIactnList1) {
        this.productFeatureIactnList1 = productFeatureIactnList1;
    }

    public List<SupplierProductFeature> getSupplierProductFeatureList() {
        return supplierProductFeatureList;
    }

    public void setSupplierProductFeatureList(List<SupplierProductFeature> supplierProductFeatureList) {
        this.supplierProductFeatureList = supplierProductFeatureList;
    }

    public List<ShipmentItemFeature> getShipmentItemFeatureList() {
        return shipmentItemFeatureList;
    }

    public void setShipmentItemFeatureList(List<ShipmentItemFeature> shipmentItemFeatureList) {
        this.shipmentItemFeatureList = shipmentItemFeatureList;
    }
    */
}
