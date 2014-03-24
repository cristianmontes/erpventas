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
public class ProductKeywordPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PRODUCT_ID")
    private String productId;
    @Basic(optional = false)
    @Column(name = "KEYWORD")
    private String keyword;

    public ProductKeywordPK() {
    }

    public ProductKeywordPK(String productId, String keyword) {
        this.productId = productId;
        this.keyword = keyword;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productId != null ? productId.hashCode() : 0);
        hash += (keyword != null ? keyword.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductKeywordPK)) {
            return false;
        }
        ProductKeywordPK other = (ProductKeywordPK) object;
        if ((this.productId == null && other.productId != null) || (this.productId != null && !this.productId.equals(other.productId))) {
            return false;
        }
        if ((this.keyword == null && other.keyword != null) || (this.keyword != null && !this.keyword.equals(other.keyword))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductKeywordPK[ productId=" + productId + ", keyword=" + keyword + " ]";
    }
    
}
