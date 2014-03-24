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

import com.wildc.ucumari.client.modelo.DataResource;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "product_feature_data_resource")
@NamedQueries({
    @NamedQuery(name = "ProductFeatureDataResource.findAll", query = "SELECT p FROM ProductFeatureDataResource p")})
public class ProductFeatureDataResource implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductFeatureDataResourcePK productFeatureDataResourcePK;
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
    @JoinColumn(name = "PRODUCT_FEATURE_ID", referencedColumnName = "PRODUCT_FEATURE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProductFeature productFeature;
    @JoinColumn(name = "DATA_RESOURCE_ID", referencedColumnName = "DATA_RESOURCE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private DataResource dataResource;

    public ProductFeatureDataResource() {
    }

    public ProductFeatureDataResource(ProductFeatureDataResourcePK productFeatureDataResourcePK) {
        this.productFeatureDataResourcePK = productFeatureDataResourcePK;
    }

    public ProductFeatureDataResource(String dataResourceId, String productFeatureId) {
        this.productFeatureDataResourcePK = new ProductFeatureDataResourcePK(dataResourceId, productFeatureId);
    }

    public ProductFeatureDataResourcePK getProductFeatureDataResourcePK() {
        return productFeatureDataResourcePK;
    }

    public void setProductFeatureDataResourcePK(ProductFeatureDataResourcePK productFeatureDataResourcePK) {
        this.productFeatureDataResourcePK = productFeatureDataResourcePK;
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

    public ProductFeature getProductFeature() {
        return productFeature;
    }

    public void setProductFeature(ProductFeature productFeature) {
        this.productFeature = productFeature;
    }

    public DataResource getDataResource() {
        return dataResource;
    }

    public void setDataResource(DataResource dataResource) {
        this.dataResource = dataResource;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productFeatureDataResourcePK != null ? productFeatureDataResourcePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductFeatureDataResource)) {
            return false;
        }
        ProductFeatureDataResource other = (ProductFeatureDataResource) object;
        if ((this.productFeatureDataResourcePK == null && other.productFeatureDataResourcePK != null) || (this.productFeatureDataResourcePK != null && !this.productFeatureDataResourcePK.equals(other.productFeatureDataResourcePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductFeatureDataResource[ productFeatureDataResourcePK=" + productFeatureDataResourcePK + " ]";
    }
    
}
