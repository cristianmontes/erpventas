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
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "product_store_group_type")

public class ProductStoreGroupType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PRODUCT_STORE_GROUP_TYPE_ID")
    private String productStoreGroupTypeId;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "LAST_UPDATED_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdatedStamp;
    @Column(name = "LAST_UPDATED_TX_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdatedTxStamp;
    @Column(name = "CREATED_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdStamp;
    @Column(name = "CREATED_TX_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdTxStamp;
    /*@OneToMany(mappedBy = "productStoreGroupTypeId")
    private List<ProductStoreGroup> productStoreGroupList;*/

    public ProductStoreGroupType() {
    }

    public ProductStoreGroupType(String productStoreGroupTypeId) {
        this.productStoreGroupTypeId = productStoreGroupTypeId;
    }

    public String getProductStoreGroupTypeId() {
        return productStoreGroupTypeId;
    }

    public void setProductStoreGroupTypeId(String productStoreGroupTypeId) {
        this.productStoreGroupTypeId = productStoreGroupTypeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getLastUpdatedStamp() {
        return lastUpdatedStamp;
    }

    public void setLastUpdatedStamp(Date lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }

    public Date getLastUpdatedTxStamp() {
        return lastUpdatedTxStamp;
    }

    public void setLastUpdatedTxStamp(Date lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }

    public Date getCreatedStamp() {
        return createdStamp;
    }

    public void setCreatedStamp(Date createdStamp) {
        this.createdStamp = createdStamp;
    }

    public Date getCreatedTxStamp() {
        return createdTxStamp;
    }

    public void setCreatedTxStamp(Date createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }
/*
    public List<ProductStoreGroup> getProductStoreGroupList() {
        return productStoreGroupList;
    }

    public void setProductStoreGroupList(List<ProductStoreGroup> productStoreGroupList) {
        this.productStoreGroupList = productStoreGroupList;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productStoreGroupTypeId != null ? productStoreGroupTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductStoreGroupType)) {
            return false;
        }
        ProductStoreGroupType other = (ProductStoreGroupType) object;
        if ((this.productStoreGroupTypeId == null && other.productStoreGroupTypeId != null) || (this.productStoreGroupTypeId != null && !this.productStoreGroupTypeId.equals(other.productStoreGroupTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductStoreGroupType[ productStoreGroupTypeId=" + productStoreGroupTypeId + " ]";
    }
    
}
