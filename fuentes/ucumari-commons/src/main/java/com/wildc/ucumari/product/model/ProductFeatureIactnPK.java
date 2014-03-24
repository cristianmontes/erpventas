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
public class ProductFeatureIactnPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PRODUCT_FEATURE_ID")
    private String productFeatureId;
    @Basic(optional = false)
    @Column(name = "PRODUCT_FEATURE_ID_TO")
    private String productFeatureIdTo;

    public ProductFeatureIactnPK() {
    }

    public ProductFeatureIactnPK(String productFeatureId, String productFeatureIdTo) {
        this.productFeatureId = productFeatureId;
        this.productFeatureIdTo = productFeatureIdTo;
    }

    public String getProductFeatureId() {
        return productFeatureId;
    }

    public void setProductFeatureId(String productFeatureId) {
        this.productFeatureId = productFeatureId;
    }

    public String getProductFeatureIdTo() {
        return productFeatureIdTo;
    }

    public void setProductFeatureIdTo(String productFeatureIdTo) {
        this.productFeatureIdTo = productFeatureIdTo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productFeatureId != null ? productFeatureId.hashCode() : 0);
        hash += (productFeatureIdTo != null ? productFeatureIdTo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductFeatureIactnPK)) {
            return false;
        }
        ProductFeatureIactnPK other = (ProductFeatureIactnPK) object;
        if ((this.productFeatureId == null && other.productFeatureId != null) || (this.productFeatureId != null && !this.productFeatureId.equals(other.productFeatureId))) {
            return false;
        }
        if ((this.productFeatureIdTo == null && other.productFeatureIdTo != null) || (this.productFeatureIdTo != null && !this.productFeatureIdTo.equals(other.productFeatureIdTo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductFeatureIactnPK[ productFeatureId=" + productFeatureId + ", productFeatureIdTo=" + productFeatureIdTo + " ]";
    }
    
}
