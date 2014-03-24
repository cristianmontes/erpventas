/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.product.model;

import java.io.Serializable;
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
@Table(name = "product_feature_category")

public class ProductFeatureCategory implements Serializable {
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "productFeatureCategory")
    private List<ProductFeatureCategoryAppl> productFeatureCategoryApplList;*/
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PRODUCT_FEATURE_CATEGORY_ID")
    private String productFeatureCategoryId;
    @Column(name = "DESCRIPTION")
    private String description;
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
    /*@OneToMany(mappedBy = "parentCategoryId")
    private List<ProductFeatureCategory> productFeatureCategoryList;*/
    @JoinColumn(name = "PARENT_CATEGORY_ID", referencedColumnName = "PRODUCT_FEATURE_CATEGORY_ID")
    @ManyToOne
    private ProductFeatureCategory parentCategoryId;
    /*@OneToMany(mappedBy = "productFeatureCategoryId")
    private List<ProductFeature> productFeatureList;*/

    public ProductFeatureCategory() {
    }

    public ProductFeatureCategory(String productFeatureCategoryId) {
        this.productFeatureCategoryId = productFeatureCategoryId;
    }

    public String getProductFeatureCategoryId() {
        return productFeatureCategoryId;
    }

    public void setProductFeatureCategoryId(String productFeatureCategoryId) {
        this.productFeatureCategoryId = productFeatureCategoryId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
    public List<ProductFeatureCategory> getProductFeatureCategoryList() {
        return productFeatureCategoryList;
    }

    public void setProductFeatureCategoryList(List<ProductFeatureCategory> productFeatureCategoryList) {
        this.productFeatureCategoryList = productFeatureCategoryList;
    }*/

    public ProductFeatureCategory getParentCategoryId() {
        return parentCategoryId;
    }

    public void setParentCategoryId(ProductFeatureCategory parentCategoryId) {
        this.parentCategoryId = parentCategoryId;
    }
/*
    public List<ProductFeature> getProductFeatureList() {
        return productFeatureList;
    }

    public void setProductFeatureList(List<ProductFeature> productFeatureList) {
        this.productFeatureList = productFeatureList;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productFeatureCategoryId != null ? productFeatureCategoryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductFeatureCategory)) {
            return false;
        }
        ProductFeatureCategory other = (ProductFeatureCategory) object;
        if ((this.productFeatureCategoryId == null && other.productFeatureCategoryId != null) || (this.productFeatureCategoryId != null && !this.productFeatureCategoryId.equals(other.productFeatureCategoryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductFeatureCategory[ productFeatureCategoryId=" + productFeatureCategoryId + " ]";
    }
/*
    public List<ProductFeatureCategoryAppl> getProductFeatureCategoryApplList() {
        return productFeatureCategoryApplList;
    }

    public void setProductFeatureCategoryApplList(List<ProductFeatureCategoryAppl> productFeatureCategoryApplList) {
        this.productFeatureCategoryApplList = productFeatureCategoryApplList;
    }*/
    
}
