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
public class ProductCategoryTypeAttrPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PRODUCT_CATEGORY_TYPE_ID")
    private String productCategoryTypeId;
    @Basic(optional = false)
    @Column(name = "ATTR_NAME")
    private String attrName;

    public ProductCategoryTypeAttrPK() {
    }

    public ProductCategoryTypeAttrPK(String productCategoryTypeId, String attrName) {
        this.productCategoryTypeId = productCategoryTypeId;
        this.attrName = attrName;
    }

    public String getProductCategoryTypeId() {
        return productCategoryTypeId;
    }

    public void setProductCategoryTypeId(String productCategoryTypeId) {
        this.productCategoryTypeId = productCategoryTypeId;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productCategoryTypeId != null ? productCategoryTypeId.hashCode() : 0);
        hash += (attrName != null ? attrName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductCategoryTypeAttrPK)) {
            return false;
        }
        ProductCategoryTypeAttrPK other = (ProductCategoryTypeAttrPK) object;
        if ((this.productCategoryTypeId == null && other.productCategoryTypeId != null) || (this.productCategoryTypeId != null && !this.productCategoryTypeId.equals(other.productCategoryTypeId))) {
            return false;
        }
        if ((this.attrName == null && other.attrName != null) || (this.attrName != null && !this.attrName.equals(other.attrName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductCategoryTypeAttrPK[ productCategoryTypeId=" + productCategoryTypeId + ", attrName=" + attrName + " ]";
    }
    
}
