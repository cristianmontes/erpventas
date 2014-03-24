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
public class ProductOrderItemTypePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PRODUCT_TYPE_ID")
    private String productTypeId;
    @Basic(optional = false)
    @Column(name = "ORDER_TYPE_ID")
    private String orderTypeId;

    public ProductOrderItemTypePK() {
    }

    public ProductOrderItemTypePK(String productTypeId, String orderTypeId) {
        this.productTypeId = productTypeId;
        this.orderTypeId = orderTypeId;
    }

    public String getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(String productTypeId) {
        this.productTypeId = productTypeId;
    }

    public String getOrderTypeId() {
        return orderTypeId;
    }

    public void setOrderTypeId(String orderTypeId) {
        this.orderTypeId = orderTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productTypeId != null ? productTypeId.hashCode() : 0);
        hash += (orderTypeId != null ? orderTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductOrderItemTypePK)) {
            return false;
        }
        ProductOrderItemTypePK other = (ProductOrderItemTypePK) object;
        if ((this.productTypeId == null && other.productTypeId != null) || (this.productTypeId != null && !this.productTypeId.equals(other.productTypeId))) {
            return false;
        }
        if ((this.orderTypeId == null && other.orderTypeId != null) || (this.orderTypeId != null && !this.orderTypeId.equals(other.orderTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductOrderItemTypePK[ productTypeId=" + productTypeId + ", orderTypeId=" + orderTypeId + " ]";
    }
    
}
