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
@Table(name = "product_price_type")

public class ProductPriceType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PRODUCT_PRICE_TYPE_ID")
    private String productPriceTypeId;
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
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "productPriceType")
    private List<ProductPrice> productPriceList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productPriceType")
    private List<ProductFeaturePrice> productFeaturePriceList;*/

    public ProductPriceType() {
    }

    public ProductPriceType(String productPriceTypeId) {
        this.productPriceTypeId = productPriceTypeId;
    }

    public String getProductPriceTypeId() {
        return productPriceTypeId;
    }

    public void setProductPriceTypeId(String productPriceTypeId) {
        this.productPriceTypeId = productPriceTypeId;
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
    public List<ProductPrice> getProductPriceList() {
        return productPriceList;
    }

    public void setProductPriceList(List<ProductPrice> productPriceList) {
        this.productPriceList = productPriceList;
    }

    public List<ProductFeaturePrice> getProductFeaturePriceList() {
        return productFeaturePriceList;
    }

    public void setProductFeaturePriceList(List<ProductFeaturePrice> productFeaturePriceList) {
        this.productFeaturePriceList = productFeaturePriceList;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productPriceTypeId != null ? productPriceTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductPriceType)) {
            return false;
        }
        ProductPriceType other = (ProductPriceType) object;
        if ((this.productPriceTypeId == null && other.productPriceTypeId != null) || (this.productPriceTypeId != null && !this.productPriceTypeId.equals(other.productPriceTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductPriceType[ productPriceTypeId=" + productPriceTypeId + " ]";
    }
    
}
