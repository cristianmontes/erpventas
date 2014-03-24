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
public class ProductFeatureGroupApplPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PRODUCT_FEATURE_GROUP_ID")
    private String productFeatureGroupId;
    @Basic(optional = false)
    @Column(name = "PRODUCT_FEATURE_ID")
    private String productFeatureId;
    @Basic(optional = false)
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;

    public ProductFeatureGroupApplPK() {
    }

    public ProductFeatureGroupApplPK(String productFeatureGroupId, String productFeatureId, Date fromDate) {
        this.productFeatureGroupId = productFeatureGroupId;
        this.productFeatureId = productFeatureId;
        this.fromDate = fromDate;
    }

    public String getProductFeatureGroupId() {
        return productFeatureGroupId;
    }

    public void setProductFeatureGroupId(String productFeatureGroupId) {
        this.productFeatureGroupId = productFeatureGroupId;
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
        hash += (productFeatureGroupId != null ? productFeatureGroupId.hashCode() : 0);
        hash += (productFeatureId != null ? productFeatureId.hashCode() : 0);
        hash += (fromDate != null ? fromDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductFeatureGroupApplPK)) {
            return false;
        }
        ProductFeatureGroupApplPK other = (ProductFeatureGroupApplPK) object;
        if ((this.productFeatureGroupId == null && other.productFeatureGroupId != null) || (this.productFeatureGroupId != null && !this.productFeatureGroupId.equals(other.productFeatureGroupId))) {
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
        return "com.wildc.ucumari.client.modelo.ProductFeatureGroupApplPK[ productFeatureGroupId=" + productFeatureGroupId + ", productFeatureId=" + productFeatureId + ", fromDate=" + fromDate + " ]";
    }
    
}
