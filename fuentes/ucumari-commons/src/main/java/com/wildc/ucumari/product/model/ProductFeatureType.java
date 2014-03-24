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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "product_feature_type")

public class ProductFeatureType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PRODUCT_FEATURE_TYPE_ID")
    private String productFeatureTypeId;
    @Column(name = "HAS_TABLE")
    private Character hasTable;
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
    /*@OneToMany(mappedBy = "parentTypeId")
    private List<ProductFeatureType> productFeatureTypeList;*/
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "PRODUCT_FEATURE_TYPE_ID")
    @ManyToOne
    private ProductFeatureType parentTypeId;
    /*@OneToMany(mappedBy = "productFeatureTypeId")
    private List<ProductFeature> productFeatureList;*/

    public ProductFeatureType() {
    }

    public ProductFeatureType(String productFeatureTypeId) {
        this.productFeatureTypeId = productFeatureTypeId;
    }

    public String getProductFeatureTypeId() {
        return productFeatureTypeId;
    }

    public void setProductFeatureTypeId(String productFeatureTypeId) {
        this.productFeatureTypeId = productFeatureTypeId;
    }

    public Character getHasTable() {
        return hasTable;
    }

    public void setHasTable(Character hasTable) {
        this.hasTable = hasTable;
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
    public List<ProductFeatureType> getProductFeatureTypeList() {
        return productFeatureTypeList;
    }

    public void setProductFeatureTypeList(List<ProductFeatureType> productFeatureTypeList) {
        this.productFeatureTypeList = productFeatureTypeList;
    }*/

    public ProductFeatureType getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(ProductFeatureType parentTypeId) {
        this.parentTypeId = parentTypeId;
    }
/*
    public List<ProductFeature> getProductFeatureList() {
        return productFeatureList;
    }

    public void setProductFeatureList(List<ProductFeature> productFeatureList) {
        this.productFeatureList = productFeatureList;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productFeatureTypeId != null ? productFeatureTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductFeatureType)) {
            return false;
        }
        ProductFeatureType other = (ProductFeatureType) object;
        if ((this.productFeatureTypeId == null && other.productFeatureTypeId != null) || (this.productFeatureTypeId != null && !this.productFeatureTypeId.equals(other.productFeatureTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductFeatureType[ productFeatureTypeId=" + productFeatureTypeId + " ]";
    }
    
}
