/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.product.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.parameters.model.CustomMethod;
import com.wildc.ucumari.parameters.model.Uom;
import com.wildc.ucumari.security.model.UserLogin;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "product_price")

public class ProductPrice implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductPricePK productPricePK;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRICE")
    private BigDecimal price;
    @Column(name = "CREATED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @Column(name = "LAST_MODIFIED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;
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
    @JoinColumn(name = "PRODUCT_PRICE_TYPE_ID", referencedColumnName = "PRODUCT_PRICE_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProductPriceType productPriceType;
    @JoinColumn(name = "TERM_UOM_ID", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom termUomId;
    @JoinColumn(name = "PRODUCT_PRICE_PURPOSE_ID", referencedColumnName = "PRODUCT_PRICE_PURPOSE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProductPricePurpose productPricePurpose;
    @JoinColumn(name = "PRODUCT_STORE_GROUP_ID", referencedColumnName = "PRODUCT_STORE_GROUP_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProductStoreGroup productStoreGroup;
    @JoinColumn(name = "PRODUCT_ID", referencedColumnName = "PRODUCT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Product product;
    @JoinColumn(name = "LAST_MODIFIED_BY_USER_LOGIN", referencedColumnName = "USER_LOGIN_ID")
    @ManyToOne
    private UserLogin lastModifiedByUserLogin;
    @JoinColumn(name = "CURRENCY_UOM_ID", referencedColumnName = "UOM_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Uom uom;
    @JoinColumn(name = "CUSTOM_PRICE_CALC_SERVICE", referencedColumnName = "CUSTOM_METHOD_ID")
    @ManyToOne
    private CustomMethod customPriceCalcService;
    @JoinColumn(name = "CREATED_BY_USER_LOGIN", referencedColumnName = "USER_LOGIN_ID")
    @ManyToOne
    private UserLogin createdByUserLogin;

    public ProductPrice() {
    }

    public ProductPrice(ProductPricePK productPricePK) {
        this.productPricePK = productPricePK;
    }

    public ProductPrice(String productId, String productPriceTypeId, String productPricePurposeId, String currencyUomId, String productStoreGroupId, Date fromDate) {
        this.productPricePK = new ProductPricePK(productId, productPriceTypeId, productPricePurposeId, currencyUomId, productStoreGroupId, fromDate);
    }

    public ProductPricePK getProductPricePK() {
        return productPricePK;
    }

    public void setProductPricePK(ProductPricePK productPricePK) {
        this.productPricePK = productPricePK;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
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

    public ProductPriceType getProductPriceType() {
        return productPriceType;
    }

    public void setProductPriceType(ProductPriceType productPriceType) {
        this.productPriceType = productPriceType;
    }

    public Uom getTermUomId() {
        return termUomId;
    }

    public void setTermUomId(Uom termUomId) {
        this.termUomId = termUomId;
    }

    public ProductPricePurpose getProductPricePurpose() {
        return productPricePurpose;
    }

    public void setProductPricePurpose(ProductPricePurpose productPricePurpose) {
        this.productPricePurpose = productPricePurpose;
    }

    public ProductStoreGroup getProductStoreGroup() {
        return productStoreGroup;
    }

    public void setProductStoreGroup(ProductStoreGroup productStoreGroup) {
        this.productStoreGroup = productStoreGroup;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public UserLogin getLastModifiedByUserLogin() {
        return lastModifiedByUserLogin;
    }

    public void setLastModifiedByUserLogin(UserLogin lastModifiedByUserLogin) {
        this.lastModifiedByUserLogin = lastModifiedByUserLogin;
    }

    public Uom getUom() {
        return uom;
    }

    public void setUom(Uom uom) {
        this.uom = uom;
    }

    public CustomMethod getCustomPriceCalcService() {
        return customPriceCalcService;
    }

    public void setCustomPriceCalcService(CustomMethod customPriceCalcService) {
        this.customPriceCalcService = customPriceCalcService;
    }

    public UserLogin getCreatedByUserLogin() {
        return createdByUserLogin;
    }

    public void setCreatedByUserLogin(UserLogin createdByUserLogin) {
        this.createdByUserLogin = createdByUserLogin;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productPricePK != null ? productPricePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductPrice)) {
            return false;
        }
        ProductPrice other = (ProductPrice) object;
        if ((this.productPricePK == null && other.productPricePK != null) || (this.productPricePK != null && !this.productPricePK.equals(other.productPricePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductPrice[ productPricePK=" + productPricePK + " ]";
    }
    
}
