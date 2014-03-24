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
public class ProductMeterPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PRODUCT_ID")
    private String productId;
    @Basic(optional = false)
    @Column(name = "PRODUCT_METER_TYPE_ID")
    private String productMeterTypeId;

    public ProductMeterPK() {
    }

    public ProductMeterPK(String productId, String productMeterTypeId) {
        this.productId = productId;
        this.productMeterTypeId = productMeterTypeId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductMeterTypeId() {
        return productMeterTypeId;
    }

    public void setProductMeterTypeId(String productMeterTypeId) {
        this.productMeterTypeId = productMeterTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productId != null ? productId.hashCode() : 0);
        hash += (productMeterTypeId != null ? productMeterTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductMeterPK)) {
            return false;
        }
        ProductMeterPK other = (ProductMeterPK) object;
        if ((this.productId == null && other.productId != null) || (this.productId != null && !this.productId.equals(other.productId))) {
            return false;
        }
        if ((this.productMeterTypeId == null && other.productMeterTypeId != null) || (this.productMeterTypeId != null && !this.productMeterTypeId.equals(other.productMeterTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductMeterPK[ productId=" + productId + ", productMeterTypeId=" + productMeterTypeId + " ]";
    }
    
}
