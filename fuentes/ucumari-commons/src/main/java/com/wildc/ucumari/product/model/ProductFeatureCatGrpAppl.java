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
@Table(name = "product_feature_cat_grp_appl")
@NamedQueries({
    @NamedQuery(name = "ProductFeatureCatGrpAppl.findAll", query = "SELECT p FROM ProductFeatureCatGrpAppl p")})
public class ProductFeatureCatGrpAppl implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductFeatureCatGrpApplPK productFeatureCatGrpApplPK;
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
    @JoinColumn(name = "PRODUCT_FEATURE_GROUP_ID", referencedColumnName = "PRODUCT_FEATURE_GROUP_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProductFeatureGroup productFeatureGroup;
    @JoinColumn(name = "PRODUCT_CATEGORY_ID", referencedColumnName = "PRODUCT_CATEGORY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProductCategory productCategory;

    public ProductFeatureCatGrpAppl() {
    }

    public ProductFeatureCatGrpAppl(ProductFeatureCatGrpApplPK productFeatureCatGrpApplPK) {
        this.productFeatureCatGrpApplPK = productFeatureCatGrpApplPK;
    }

    public ProductFeatureCatGrpAppl(String productCategoryId, String productFeatureGroupId, Date fromDate) {
        this.productFeatureCatGrpApplPK = new ProductFeatureCatGrpApplPK(productCategoryId, productFeatureGroupId, fromDate);
    }

    public ProductFeatureCatGrpApplPK getProductFeatureCatGrpApplPK() {
        return productFeatureCatGrpApplPK;
    }

    public void setProductFeatureCatGrpApplPK(ProductFeatureCatGrpApplPK productFeatureCatGrpApplPK) {
        this.productFeatureCatGrpApplPK = productFeatureCatGrpApplPK;
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

    public ProductFeatureGroup getProductFeatureGroup() {
        return productFeatureGroup;
    }

    public void setProductFeatureGroup(ProductFeatureGroup productFeatureGroup) {
        this.productFeatureGroup = productFeatureGroup;
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
        hash += (productFeatureCatGrpApplPK != null ? productFeatureCatGrpApplPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductFeatureCatGrpAppl)) {
            return false;
        }
        ProductFeatureCatGrpAppl other = (ProductFeatureCatGrpAppl) object;
        if ((this.productFeatureCatGrpApplPK == null && other.productFeatureCatGrpApplPK != null) || (this.productFeatureCatGrpApplPK != null && !this.productFeatureCatGrpApplPK.equals(other.productFeatureCatGrpApplPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductFeatureCatGrpAppl[ productFeatureCatGrpApplPK=" + productFeatureCatGrpApplPK + " ]";
    }
    
}
