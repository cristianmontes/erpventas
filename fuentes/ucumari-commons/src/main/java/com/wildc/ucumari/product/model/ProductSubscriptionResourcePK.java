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
public class ProductSubscriptionResourcePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PRODUCT_ID")
    private String productId;
    @Basic(optional = false)
    @Column(name = "SUBSCRIPTION_RESOURCE_ID")
    private String subscriptionResourceId;
    @Basic(optional = false)
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;

    public ProductSubscriptionResourcePK() {
    }

    public ProductSubscriptionResourcePK(String productId, String subscriptionResourceId, Date fromDate) {
        this.productId = productId;
        this.subscriptionResourceId = subscriptionResourceId;
        this.fromDate = fromDate;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getSubscriptionResourceId() {
        return subscriptionResourceId;
    }

    public void setSubscriptionResourceId(String subscriptionResourceId) {
        this.subscriptionResourceId = subscriptionResourceId;
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
        hash += (subscriptionResourceId != null ? subscriptionResourceId.hashCode() : 0);
        hash += (fromDate != null ? fromDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductSubscriptionResourcePK)) {
            return false;
        }
        ProductSubscriptionResourcePK other = (ProductSubscriptionResourcePK) object;
        if ((this.productId == null && other.productId != null) || (this.productId != null && !this.productId.equals(other.productId))) {
            return false;
        }
        if ((this.subscriptionResourceId == null && other.subscriptionResourceId != null) || (this.subscriptionResourceId != null && !this.subscriptionResourceId.equals(other.subscriptionResourceId))) {
            return false;
        }
        if ((this.fromDate == null && other.fromDate != null) || (this.fromDate != null && !this.fromDate.equals(other.fromDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductSubscriptionResourcePK[ productId=" + productId + ", subscriptionResourceId=" + subscriptionResourceId + ", fromDate=" + fromDate + " ]";
    }
    
}
