/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class DataImportOrderItemPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ORDER_ID")
    private String orderId;
    @Basic(optional = false)
    @Column(name = "PRODUCT_ID")
    private String productId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "QUANTITY")
    private BigDecimal quantity;
    @Basic(optional = false)
    @Column(name = "PRICE")
    private BigDecimal price;

    public DataImportOrderItemPK() {
    }

    public DataImportOrderItemPK(String orderId, String productId, BigDecimal quantity, BigDecimal price) {
        this.orderId = orderId;
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderId != null ? orderId.hashCode() : 0);
        hash += (productId != null ? productId.hashCode() : 0);
        hash += (quantity != null ? quantity.hashCode() : 0);
        hash += (price != null ? price.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DataImportOrderItemPK)) {
            return false;
        }
        DataImportOrderItemPK other = (DataImportOrderItemPK) object;
        if ((this.orderId == null && other.orderId != null) || (this.orderId != null && !this.orderId.equals(other.orderId))) {
            return false;
        }
        if ((this.productId == null && other.productId != null) || (this.productId != null && !this.productId.equals(other.productId))) {
            return false;
        }
        if ((this.quantity == null && other.quantity != null) || (this.quantity != null && !this.quantity.equals(other.quantity))) {
            return false;
        }
        if ((this.price == null && other.price != null) || (this.price != null && !this.price.equals(other.price))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.DataImportOrderItemPK[ orderId=" + orderId + ", productId=" + productId + ", quantity=" + quantity + ", price=" + price + " ]";
    }
    
}
