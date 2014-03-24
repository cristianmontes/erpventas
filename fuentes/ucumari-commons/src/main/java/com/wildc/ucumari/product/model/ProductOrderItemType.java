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
@Table(name = "product_order_item_type")
@NamedQueries({
    @NamedQuery(name = "ProductOrderItemType.findAll", query = "SELECT p FROM ProductOrderItemType p")})
public class ProductOrderItemType implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductOrderItemTypePK productOrderItemTypePK;
    @Column(name = "ORDER_ITEM_TYPE_ID")
    private String orderItemTypeId;
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

    public ProductOrderItemType() {
    }

    public ProductOrderItemType(ProductOrderItemTypePK productOrderItemTypePK) {
        this.productOrderItemTypePK = productOrderItemTypePK;
    }

    public ProductOrderItemType(String productTypeId, String orderTypeId) {
        this.productOrderItemTypePK = new ProductOrderItemTypePK(productTypeId, orderTypeId);
    }

    public ProductOrderItemTypePK getProductOrderItemTypePK() {
        return productOrderItemTypePK;
    }

    public void setProductOrderItemTypePK(ProductOrderItemTypePK productOrderItemTypePK) {
        this.productOrderItemTypePK = productOrderItemTypePK;
    }

    public String getOrderItemTypeId() {
        return orderItemTypeId;
    }

    public void setOrderItemTypeId(String orderItemTypeId) {
        this.orderItemTypeId = orderItemTypeId;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productOrderItemTypePK != null ? productOrderItemTypePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductOrderItemType)) {
            return false;
        }
        ProductOrderItemType other = (ProductOrderItemType) object;
        if ((this.productOrderItemTypePK == null && other.productOrderItemTypePK != null) || (this.productOrderItemTypePK != null && !this.productOrderItemTypePK.equals(other.productOrderItemTypePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductOrderItemType[ productOrderItemTypePK=" + productOrderItemTypePK + " ]";
    }
    
}
