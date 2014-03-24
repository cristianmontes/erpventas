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
public class ProductCategoryRollupPK implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -422741026189033431L;
	@Basic(optional = false)
    @Column(name = "PRODUCT_CATEGORY_ID")
    private String productCategoryId;
    @Basic(optional = false)
    @Column(name = "PARENT_PRODUCT_CATEGORY_ID")
    private String parentProductCategoryId;
    @Basic(optional = false)
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;

    public ProductCategoryRollupPK() {
    }

    public ProductCategoryRollupPK(String productCategoryId, String parentProductCategoryId, Date fromDate) {
        this.productCategoryId = productCategoryId;
        this.parentProductCategoryId = parentProductCategoryId;
        this.fromDate = fromDate;
    }

    public String getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(String productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public String getParentProductCategoryId() {
        return parentProductCategoryId;
    }

    public void setParentProductCategoryId(String parentProductCategoryId) {
        this.parentProductCategoryId = parentProductCategoryId;
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
        hash += (parentProductCategoryId != null ? parentProductCategoryId.hashCode() : 0);
        hash += (fromDate != null ? fromDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductCategoryRollupPK)) {
            return false;
        }
        ProductCategoryRollupPK other = (ProductCategoryRollupPK) object;
        if ((this.productCategoryId == null && other.productCategoryId != null) || (this.productCategoryId != null && !this.productCategoryId.equals(other.productCategoryId))) {
            return false;
        }
        if ((this.parentProductCategoryId == null && other.parentProductCategoryId != null) || (this.parentProductCategoryId != null && !this.parentProductCategoryId.equals(other.parentProductCategoryId))) {
            return false;
        }
        if ((this.fromDate == null && other.fromDate != null) || (this.fromDate != null && !this.fromDate.equals(other.fromDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductCategoryRollupPK[ productCategoryId=" + productCategoryId + ", parentProductCategoryId=" + parentProductCategoryId + ", fromDate=" + fromDate + " ]";
    }
    
}
