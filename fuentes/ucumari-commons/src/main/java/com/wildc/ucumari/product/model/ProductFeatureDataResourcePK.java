/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.product.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class ProductFeatureDataResourcePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "DATA_RESOURCE_ID")
    private String dataResourceId;
    @Basic(optional = false)
    @Column(name = "PRODUCT_FEATURE_ID")
    private String productFeatureId;

    public ProductFeatureDataResourcePK() {
    }

    public ProductFeatureDataResourcePK(String dataResourceId, String productFeatureId) {
        this.dataResourceId = dataResourceId;
        this.productFeatureId = productFeatureId;
    }

    public String getDataResourceId() {
        return dataResourceId;
    }

    public void setDataResourceId(String dataResourceId) {
        this.dataResourceId = dataResourceId;
    }

    public String getProductFeatureId() {
        return productFeatureId;
    }

    public void setProductFeatureId(String productFeatureId) {
        this.productFeatureId = productFeatureId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dataResourceId != null ? dataResourceId.hashCode() : 0);
        hash += (productFeatureId != null ? productFeatureId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductFeatureDataResourcePK)) {
            return false;
        }
        ProductFeatureDataResourcePK other = (ProductFeatureDataResourcePK) object;
        if ((this.dataResourceId == null && other.dataResourceId != null) || (this.dataResourceId != null && !this.dataResourceId.equals(other.dataResourceId))) {
            return false;
        }
        if ((this.productFeatureId == null && other.productFeatureId != null) || (this.productFeatureId != null && !this.productFeatureId.equals(other.productFeatureId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductFeatureDataResourcePK[ dataResourceId=" + dataResourceId + ", productFeatureId=" + productFeatureId + " ]";
    }
    
}
