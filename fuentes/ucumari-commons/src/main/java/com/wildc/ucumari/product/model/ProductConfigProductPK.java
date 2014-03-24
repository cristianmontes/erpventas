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
public class ProductConfigProductPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CONFIG_ITEM_ID")
    private String configItemId;
    @Basic(optional = false)
    @Column(name = "CONFIG_OPTION_ID")
    private String configOptionId;
    @Basic(optional = false)
    @Column(name = "PRODUCT_ID")
    private String productId;

    public ProductConfigProductPK() {
    }

    public ProductConfigProductPK(String configItemId, String configOptionId, String productId) {
        this.configItemId = configItemId;
        this.configOptionId = configOptionId;
        this.productId = productId;
    }

    public String getConfigItemId() {
        return configItemId;
    }

    public void setConfigItemId(String configItemId) {
        this.configItemId = configItemId;
    }

    public String getConfigOptionId() {
        return configOptionId;
    }

    public void setConfigOptionId(String configOptionId) {
        this.configOptionId = configOptionId;
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
        hash += (configItemId != null ? configItemId.hashCode() : 0);
        hash += (configOptionId != null ? configOptionId.hashCode() : 0);
        hash += (productId != null ? productId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductConfigProductPK)) {
            return false;
        }
        ProductConfigProductPK other = (ProductConfigProductPK) object;
        if ((this.configItemId == null && other.configItemId != null) || (this.configItemId != null && !this.configItemId.equals(other.configItemId))) {
            return false;
        }
        if ((this.configOptionId == null && other.configOptionId != null) || (this.configOptionId != null && !this.configOptionId.equals(other.configOptionId))) {
            return false;
        }
        if ((this.productId == null && other.productId != null) || (this.productId != null && !this.productId.equals(other.productId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductConfigProductPK[ configItemId=" + configItemId + ", configOptionId=" + configOptionId + ", productId=" + productId + " ]";
    }
    
}
