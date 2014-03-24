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
public class ProductCategoryContentPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PRODUCT_CATEGORY_ID")
    private String productCategoryId;
    @Basic(optional = false)
    @Column(name = "CONTENT_ID")
    private String contentId;
    @Basic(optional = false)
    @Column(name = "PROD_CAT_CONTENT_TYPE_ID")
    private String prodCatContentTypeId;
    @Basic(optional = false)
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;

    public ProductCategoryContentPK() {
    }

    public ProductCategoryContentPK(String productCategoryId, String contentId, String prodCatContentTypeId, Date fromDate) {
        this.productCategoryId = productCategoryId;
        this.contentId = contentId;
        this.prodCatContentTypeId = prodCatContentTypeId;
        this.fromDate = fromDate;
    }

    public String getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(String productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public String getProdCatContentTypeId() {
        return prodCatContentTypeId;
    }

    public void setProdCatContentTypeId(String prodCatContentTypeId) {
        this.prodCatContentTypeId = prodCatContentTypeId;
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
        hash += (productCategoryId != null ? productCategoryId.hashCode() : 0);
        hash += (contentId != null ? contentId.hashCode() : 0);
        hash += (prodCatContentTypeId != null ? prodCatContentTypeId.hashCode() : 0);
        hash += (fromDate != null ? fromDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductCategoryContentPK)) {
            return false;
        }
        ProductCategoryContentPK other = (ProductCategoryContentPK) object;
        if ((this.productCategoryId == null && other.productCategoryId != null) || (this.productCategoryId != null && !this.productCategoryId.equals(other.productCategoryId))) {
            return false;
        }
        if ((this.contentId == null && other.contentId != null) || (this.contentId != null && !this.contentId.equals(other.contentId))) {
            return false;
        }
        if ((this.prodCatContentTypeId == null && other.prodCatContentTypeId != null) || (this.prodCatContentTypeId != null && !this.prodCatContentTypeId.equals(other.prodCatContentTypeId))) {
            return false;
        }
        if ((this.fromDate == null && other.fromDate != null) || (this.fromDate != null && !this.fromDate.equals(other.fromDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductCategoryContentPK[ productCategoryId=" + productCategoryId + ", contentId=" + contentId + ", prodCatContentTypeId=" + prodCatContentTypeId + ", fromDate=" + fromDate + " ]";
    }
    
}
