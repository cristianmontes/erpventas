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
public class ProductCategoryMemberPK implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -1015621452446376858L;
	@Basic(optional = false)
    @Column(name = "PRODUCT_CATEGORY_ID")
    private String productCategoryId;
    @Basic(optional = false)
    @Column(name = "PRODUCT_ID")
    private String productId;
    @Basic(optional = false)
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;

    public ProductCategoryMemberPK() {
    }

    public ProductCategoryMemberPK(String productCategoryId, String productId, Date fromDate) {
        this.productCategoryId = productCategoryId;
        this.productId = productId;
        this.fromDate = fromDate;
    }

    public String getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(String productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
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
        hash += (productId != null ? productId.hashCode() : 0);
        hash += (fromDate != null ? fromDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductCategoryMemberPK)) {
            return false;
        }
        ProductCategoryMemberPK other = (ProductCategoryMemberPK) object;
        if ((this.productCategoryId == null && other.productCategoryId != null) || (this.productCategoryId != null && !this.productCategoryId.equals(other.productCategoryId))) {
            return false;
        }
        if ((this.productId == null && other.productId != null) || (this.productId != null && !this.productId.equals(other.productId))) {
            return false;
        }
        if ((this.fromDate == null && other.fromDate != null) || (this.fromDate != null && !this.fromDate.equals(other.fromDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductCategoryMemberPK[ productCategoryId=" + productCategoryId + ", productId=" + productId + ", fromDate=" + fromDate + " ]";
    }
    
}
