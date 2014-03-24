/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.product.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.parameters.model.Enumeration;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "product_promo_category")

public class ProductPromoCategory implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductPromoCategoryPK productPromoCategoryPK;
    @Column(name = "INCLUDE_SUB_CATEGORIES")
    private Character includeSubCategories;
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
    @JoinColumn(name = "PRODUCT_PROMO_ID", referencedColumnName = "PRODUCT_PROMO_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProductPromo productPromo;
    @JoinColumn(name = "PRODUCT_CATEGORY_ID", referencedColumnName = "PRODUCT_CATEGORY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProductCategory productCategory;
    @JoinColumn(name = "PRODUCT_PROMO_APPL_ENUM_ID", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration productPromoApplEnumId;

    public ProductPromoCategory() {
    }

    public ProductPromoCategory(ProductPromoCategoryPK productPromoCategoryPK) {
        this.productPromoCategoryPK = productPromoCategoryPK;
    }

    public ProductPromoCategory(String productPromoId, String productPromoRuleId, String productPromoActionSeqId, String productPromoCondSeqId, String productCategoryId, String andGroupId) {
        this.productPromoCategoryPK = new ProductPromoCategoryPK(productPromoId, productPromoRuleId, productPromoActionSeqId, productPromoCondSeqId, productCategoryId, andGroupId);
    }

    public ProductPromoCategoryPK getProductPromoCategoryPK() {
        return productPromoCategoryPK;
    }

    public void setProductPromoCategoryPK(ProductPromoCategoryPK productPromoCategoryPK) {
        this.productPromoCategoryPK = productPromoCategoryPK;
    }

    public Character getIncludeSubCategories() {
        return includeSubCategories;
    }

    public void setIncludeSubCategories(Character includeSubCategories) {
        this.includeSubCategories = includeSubCategories;
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

    public ProductPromo getProductPromo() {
        return productPromo;
    }

    public void setProductPromo(ProductPromo productPromo) {
        this.productPromo = productPromo;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public Enumeration getProductPromoApplEnumId() {
        return productPromoApplEnumId;
    }

    public void setProductPromoApplEnumId(Enumeration productPromoApplEnumId) {
        this.productPromoApplEnumId = productPromoApplEnumId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productPromoCategoryPK != null ? productPromoCategoryPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductPromoCategory)) {
            return false;
        }
        ProductPromoCategory other = (ProductPromoCategory) object;
        if ((this.productPromoCategoryPK == null && other.productPromoCategoryPK != null) || (this.productPromoCategoryPK != null && !this.productPromoCategoryPK.equals(other.productPromoCategoryPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductPromoCategory[ productPromoCategoryPK=" + productPromoCategoryPK + " ]";
    }
    
}
