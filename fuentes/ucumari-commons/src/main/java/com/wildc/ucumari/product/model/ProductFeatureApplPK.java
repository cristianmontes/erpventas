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
public class ProductFeatureApplPK implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -2333718613028117611L;
	@Basic(optional = false)
    @Column(name = "PRODUCT_ID")
    private String productId;
    @Basic(optional = false)
    @Column(name = "PRODUCT_FEATURE_ID")
    private String productFeatureId;
    @Basic(optional = false)
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;

    public ProductFeatureApplPK() {
    }

    public ProductFeatureApplPK(String productId, String productFeatureId, Date fromDate) {
        this.productId = productId;
        this.productFeatureId = productFeatureId;
        this.fromDate = fromDate;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductFeatureId() {
        return productFeatureId;
    }

    public void setProductFeatureId(String productFeatureId) {
        this.productFeatureId = productFeatureId;
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
        hash += (productId != null ? productId.hashCode() : 0);
        hash += (productFeatureId != null ? productFeatureId.hashCode() : 0);
        hash += (fromDate != null ? fromDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductFeatureApplPK)) {
            return false;
        }
        ProductFeatureApplPK other = (ProductFeatureApplPK) object;
        if ((this.productId == null && other.productId != null) || (this.productId != null && !this.productId.equals(other.productId))) {
            return false;
        }
        if ((this.productFeatureId == null && other.productFeatureId != null) || (this.productFeatureId != null && !this.productFeatureId.equals(other.productFeatureId))) {
            return false;
        }
        if ((this.fromDate == null && other.fromDate != null) || (this.fromDate != null && !this.fromDate.equals(other.fromDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductFeatureApplPK[ productId=" + productId + ", productFeatureId=" + productFeatureId + ", fromDate=" + fromDate + " ]";
    }
    
}
