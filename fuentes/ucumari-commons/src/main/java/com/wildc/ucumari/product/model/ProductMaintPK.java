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
public class ProductMaintPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PRODUCT_ID")
    private String productId;
    @Basic(optional = false)
    @Column(name = "PRODUCT_MAINT_SEQ_ID")
    private String productMaintSeqId;

    public ProductMaintPK() {
    }

    public ProductMaintPK(String productId, String productMaintSeqId) {
        this.productId = productId;
        this.productMaintSeqId = productMaintSeqId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductMaintSeqId() {
        return productMaintSeqId;
    }

    public void setProductMaintSeqId(String productMaintSeqId) {
        this.productMaintSeqId = productMaintSeqId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productId != null ? productId.hashCode() : 0);
        hash += (productMaintSeqId != null ? productMaintSeqId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductMaintPK)) {
            return false;
        }
        ProductMaintPK other = (ProductMaintPK) object;
        if ((this.productId == null && other.productId != null) || (this.productId != null && !this.productId.equals(other.productId))) {
            return false;
        }
        if ((this.productMaintSeqId == null && other.productMaintSeqId != null) || (this.productMaintSeqId != null && !this.productMaintSeqId.equals(other.productMaintSeqId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductMaintPK[ productId=" + productId + ", productMaintSeqId=" + productMaintSeqId + " ]";
    }
    
}
