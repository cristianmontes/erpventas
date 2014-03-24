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
@Table(name = "product_type")

public class ProductType implements Serializable {
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "productType")
    private List<ProductTypeAttr> productTypeAttrList;*/
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PRODUCT_TYPE_ID")
    private String productTypeId;
    @Column(name = "IS_PHYSICAL")
    private Character isPhysical;
    @Column(name = "IS_DIGITAL")
    private Character isDigital;
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
    /*
    @OneToMany(mappedBy = "parentTypeId")
    private List<ProductType> productTypeList;
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "PRODUCT_TYPE_ID")
    @ManyToOne
    private ProductType parentTypeId;
    @OneToMany(mappedBy = "productTypeId")
    private List<Product> productList;*/

    public ProductType() {
    }

    public ProductType(String productTypeId) {
        this.productTypeId = productTypeId;
    }

    public String getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(String productTypeId) {
        this.productTypeId = productTypeId;
    }

    public Character getIsPhysical() {
        return isPhysical;
    }

    public void setIsPhysical(Character isPhysical) {
        this.isPhysical = isPhysical;
    }

    public Character getIsDigital() {
        return isDigital;
    }

    public void setIsDigital(Character isDigital) {
        this.isDigital = isDigital;
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
    public List<ProductType> getProductTypeList() {
        return productTypeList;
    }

    public void setProductTypeList(List<ProductType> productTypeList) {
        this.productTypeList = productTypeList;
    }

    public ProductType getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(ProductType parentTypeId) {
        this.parentTypeId = parentTypeId;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productTypeId != null ? productTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductType)) {
            return false;
        }
        ProductType other = (ProductType) object;
        if ((this.productTypeId == null && other.productTypeId != null) || (this.productTypeId != null && !this.productTypeId.equals(other.productTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductType[ productTypeId=" + productTypeId + " ]";
    }
/*
    public List<ProductTypeAttr> getProductTypeAttrList() {
        return productTypeAttrList;
    }

    public void setProductTypeAttrList(List<ProductTypeAttr> productTypeAttrList) {
        this.productTypeAttrList = productTypeAttrList;
    }*/
    
}
