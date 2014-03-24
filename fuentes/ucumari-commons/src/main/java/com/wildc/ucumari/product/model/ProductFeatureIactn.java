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
@Table(name = "product_feature_iactn")
@NamedQueries({
    @NamedQuery(name = "ProductFeatureIactn.findAll", query = "SELECT p FROM ProductFeatureIactn p")})
public class ProductFeatureIactn implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductFeatureIactnPK productFeatureIactnPK;
    @Column(name = "PRODUCT_ID")
    private String productId;
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
    @JoinColumn(name = "PRODUCT_FEATURE_IACTN_TYPE_ID", referencedColumnName = "PRODUCT_FEATURE_IACTN_TYPE_ID")
    @ManyToOne
    private ProductFeatureIactnType productFeatureIactnTypeId;
    @JoinColumn(name = "PRODUCT_FEATURE_ID", referencedColumnName = "PRODUCT_FEATURE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProductFeature productFeature;
    @JoinColumn(name = "PRODUCT_FEATURE_ID_TO", referencedColumnName = "PRODUCT_FEATURE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProductFeature productFeature1;

    public ProductFeatureIactn() {
    }

    public ProductFeatureIactn(ProductFeatureIactnPK productFeatureIactnPK) {
        this.productFeatureIactnPK = productFeatureIactnPK;
    }

    public ProductFeatureIactn(String productFeatureId, String productFeatureIdTo) {
        this.productFeatureIactnPK = new ProductFeatureIactnPK(productFeatureId, productFeatureIdTo);
    }

    public ProductFeatureIactnPK getProductFeatureIactnPK() {
        return productFeatureIactnPK;
    }

    public void setProductFeatureIactnPK(ProductFeatureIactnPK productFeatureIactnPK) {
        this.productFeatureIactnPK = productFeatureIactnPK;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
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

    public ProductFeatureIactnType getProductFeatureIactnTypeId() {
        return productFeatureIactnTypeId;
    }

    public void setProductFeatureIactnTypeId(ProductFeatureIactnType productFeatureIactnTypeId) {
        this.productFeatureIactnTypeId = productFeatureIactnTypeId;
    }

    public ProductFeature getProductFeature() {
        return productFeature;
    }

    public void setProductFeature(ProductFeature productFeature) {
        this.productFeature = productFeature;
    }

    public ProductFeature getProductFeature1() {
        return productFeature1;
    }

    public void setProductFeature1(ProductFeature productFeature1) {
        this.productFeature1 = productFeature1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productFeatureIactnPK != null ? productFeatureIactnPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductFeatureIactn)) {
            return false;
        }
        ProductFeatureIactn other = (ProductFeatureIactn) object;
        if ((this.productFeatureIactnPK == null && other.productFeatureIactnPK != null) || (this.productFeatureIactnPK != null && !this.productFeatureIactnPK.equals(other.productFeatureIactnPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductFeatureIactn[ productFeatureIactnPK=" + productFeatureIactnPK + " ]";
    }
    
}
