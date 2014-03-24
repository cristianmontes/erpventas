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
public class ProductStoreGroupRollupPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PRODUCT_STORE_GROUP_ID")
    private String productStoreGroupId;
    @Basic(optional = false)
    @Column(name = "PARENT_GROUP_ID")
    private String parentGroupId;
    @Basic(optional = false)
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;

    public ProductStoreGroupRollupPK() {
    }

    public ProductStoreGroupRollupPK(String productStoreGroupId, String parentGroupId, Date fromDate) {
        this.productStoreGroupId = productStoreGroupId;
        this.parentGroupId = parentGroupId;
        this.fromDate = fromDate;
    }

    public String getProductStoreGroupId() {
        return productStoreGroupId;
    }

    public void setProductStoreGroupId(String productStoreGroupId) {
        this.productStoreGroupId = productStoreGroupId;
    }

    public String getParentGroupId() {
        return parentGroupId;
    }

    public void setParentGroupId(String parentGroupId) {
        this.parentGroupId = parentGroupId;
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
        hash += (productStoreGroupId != null ? productStoreGroupId.hashCode() : 0);
        hash += (parentGroupId != null ? parentGroupId.hashCode() : 0);
        hash += (fromDate != null ? fromDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductStoreGroupRollupPK)) {
            return false;
        }
        ProductStoreGroupRollupPK other = (ProductStoreGroupRollupPK) object;
        if ((this.productStoreGroupId == null && other.productStoreGroupId != null) || (this.productStoreGroupId != null && !this.productStoreGroupId.equals(other.productStoreGroupId))) {
            return false;
        }
        if ((this.parentGroupId == null && other.parentGroupId != null) || (this.parentGroupId != null && !this.parentGroupId.equals(other.parentGroupId))) {
            return false;
        }
        if ((this.fromDate == null && other.fromDate != null) || (this.fromDate != null && !this.fromDate.equals(other.fromDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductStoreGroupRollupPK[ productStoreGroupId=" + productStoreGroupId + ", parentGroupId=" + parentGroupId + ", fromDate=" + fromDate + " ]";
    }
    
}
