/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.product.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Embeddable
public class ProductStorePromoApplPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PRODUCT_STORE_ID")
    private String productStoreId;
    @Basic(optional = false)
    @Column(name = "PRODUCT_PROMO_ID")
    private String productPromoId;
    @Basic(optional = false)
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;

    public ProductStorePromoApplPK() {
    }

    public ProductStorePromoApplPK(String productStoreId, String productPromoId, Date fromDate) {
        this.productStoreId = productStoreId;
        this.productPromoId = productPromoId;
        this.fromDate = fromDate;
    }

    public String getProductStoreId() {
        return productStoreId;
    }

    public void setProductStoreId(String productStoreId) {
        this.productStoreId = productStoreId;
    }

    public String getProductPromoId() {
        return productPromoId;
    }

    public void setProductPromoId(String productPromoId) {
        this.productPromoId = productPromoId;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productStoreId != null ? productStoreId.hashCode() : 0);
        hash += (productPromoId != null ? productPromoId.hashCode() : 0);
        hash += (fromDate != null ? fromDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductStorePromoApplPK)) {
            return false;
        }
        ProductStorePromoApplPK other = (ProductStorePromoApplPK) object;
        if ((this.productStoreId == null && other.productStoreId != null) || (this.productStoreId != null && !this.productStoreId.equals(other.productStoreId))) {
            return false;
        }
        if ((this.productPromoId == null && other.productPromoId != null) || (this.productPromoId != null && !this.productPromoId.equals(other.productPromoId))) {
            return false;
        }
        if ((this.fromDate == null && other.fromDate != null) || (this.fromDate != null && !this.fromDate.equals(other.fromDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductStorePromoApplPK[ productStoreId=" + productStoreId + ", productPromoId=" + productPromoId + ", fromDate=" + fromDate + " ]";
    }
    
}
