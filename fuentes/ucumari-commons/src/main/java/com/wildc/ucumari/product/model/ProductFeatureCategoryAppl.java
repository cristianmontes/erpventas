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
@Table(name = "product_feature_category_appl")
@NamedQueries({
    @NamedQuery(name = "ProductFeatureCategoryAppl.findAll", query = "SELECT p FROM ProductFeatureCategoryAppl p")})
public class ProductFeatureCategoryAppl implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductFeatureCategoryApplPK productFeatureCategoryApplPK;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
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
    @JoinColumn(name = "PRODUCT_FEATURE_CATEGORY_ID", referencedColumnName = "PRODUCT_FEATURE_CATEGORY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProductFeatureCategory productFeatureCategory;
    @JoinColumn(name = "PRODUCT_CATEGORY_ID", referencedColumnName = "PRODUCT_CATEGORY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProductCategory productCategory;

    public ProductFeatureCategoryAppl() {
    }

    public ProductFeatureCategoryAppl(ProductFeatureCategoryApplPK productFeatureCategoryApplPK) {
        this.productFeatureCategoryApplPK = productFeatureCategoryApplPK;
    }

    public ProductFeatureCategoryAppl(String productCategoryId, String productFeatureCategoryId, Date fromDate) {
        this.productFeatureCategoryApplPK = new ProductFeatureCategoryApplPK(productCategoryId, productFeatureCategoryId, fromDate);
    }

    public ProductFeatureCategoryApplPK getProductFeatureCategoryApplPK() {
        return productFeatureCategoryApplPK;
    }

    public void setProductFeatureCategoryApplPK(ProductFeatureCategoryApplPK productFeatureCategoryApplPK) {
        this.productFeatureCategoryApplPK = productFeatureCategoryApplPK;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
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

    public ProductFeatureCategory getProductFeatureCategory() {
        return productFeatureCategory;
    }

    public void setProductFeatureCategory(ProductFeatureCategory productFeatureCategory) {
        this.productFeatureCategory = productFeatureCategory;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productFeatureCategoryApplPK != null ? productFeatureCategoryApplPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductFeatureCategoryAppl)) {
            return false;
        }
        ProductFeatureCategoryAppl other = (ProductFeatureCategoryAppl) object;
        if ((this.productFeatureCategoryApplPK == null && other.productFeatureCategoryApplPK != null) || (this.productFeatureCategoryApplPK != null && !this.productFeatureCategoryApplPK.equals(other.productFeatureCategoryApplPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductFeatureCategoryAppl[ productFeatureCategoryApplPK=" + productFeatureCategoryApplPK + " ]";
    }
    
}
