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
public class ProductConfigStatsPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CONFIG_ID")
    private String configId;
    @Basic(optional = false)
    @Column(name = "PRODUCT_ID")
    private String productId;

    public ProductConfigStatsPK() {
    }

    public ProductConfigStatsPK(String configId, String productId) {
        this.configId = configId;
        this.productId = productId;
    }

    public String getConfigId() {
        return configId;
    }

    public void setConfigId(String configId) {
        this.configId = configId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (configId != null ? configId.hashCode() : 0);
        hash += (productId != null ? productId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductConfigStatsPK)) {
            return false;
        }
        ProductConfigStatsPK other = (ProductConfigStatsPK) object;
        if ((this.configId == null && other.configId != null) || (this.configId != null && !this.configId.equals(other.configId))) {
            return false;
        }
        if ((this.productId == null && other.productId != null) || (this.productId != null && !this.productId.equals(other.productId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductConfigStatsPK[ configId=" + configId + ", productId=" + productId + " ]";
    }
    
}
