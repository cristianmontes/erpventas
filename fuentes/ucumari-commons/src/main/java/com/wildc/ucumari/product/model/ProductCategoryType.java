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
@Table(name = "product_category_type")

public class ProductCategoryType implements Serializable {
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "productCategoryType")
    private List<ProductCategoryTypeAttr> productCategoryTypeAttrList;*/
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PRODUCT_CATEGORY_TYPE_ID")
    private String productCategoryTypeId;
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
    /*@OneToMany(mappedBy = "productCategoryTypeId")
    private List<ProductCategory> productCategoryList;
    @OneToMany(mappedBy = "parentTypeId")
    private List<ProductCategoryType> productCategoryTypeList;*/
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "PRODUCT_CATEGORY_TYPE_ID")
    @ManyToOne
    private ProductCategoryType parentTypeId;

    public ProductCategoryType() {
    }

    public ProductCategoryType(String productCategoryTypeId) {
        this.productCategoryTypeId = productCategoryTypeId;
    }

    public String getProductCategoryTypeId() {
        return productCategoryTypeId;
    }

    public void setProductCategoryTypeId(String productCategoryTypeId) {
        this.productCategoryTypeId = productCategoryTypeId;
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
    public List<ProductCategory> getProductCategoryList() {
        return productCategoryList;
    }

    public void setProductCategoryList(List<ProductCategory> productCategoryList) {
        this.productCategoryList = productCategoryList;
    }

    public List<ProductCategoryType> getProductCategoryTypeList() {
        return productCategoryTypeList;
    }

    public void setProductCategoryTypeList(List<ProductCategoryType> productCategoryTypeList) {
        this.productCategoryTypeList = productCategoryTypeList;
    }*/

    public ProductCategoryType getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(ProductCategoryType parentTypeId) {
        this.parentTypeId = parentTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productCategoryTypeId != null ? productCategoryTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductCategoryType)) {
            return false;
        }
        ProductCategoryType other = (ProductCategoryType) object;
        if ((this.productCategoryTypeId == null && other.productCategoryTypeId != null) || (this.productCategoryTypeId != null && !this.productCategoryTypeId.equals(other.productCategoryTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductCategoryType[ productCategoryTypeId=" + productCategoryTypeId + " ]";
    }
/*
    public List<ProductCategoryTypeAttr> getProductCategoryTypeAttrList() {
        return productCategoryTypeAttrList;
    }

    public void setProductCategoryTypeAttrList(List<ProductCategoryTypeAttr> productCategoryTypeAttrList) {
        this.productCategoryTypeAttrList = productCategoryTypeAttrList;
    }*/
    
}
