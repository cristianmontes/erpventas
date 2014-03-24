/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.product.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "product_category_content_type")
@NamedQueries({
    @NamedQuery(name = "ProductCategoryContentType.findAll", query = "SELECT p FROM ProductCategoryContentType p")})
public class ProductCategoryContentType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PROD_CAT_CONTENT_TYPE_ID")
    private String prodCatContentTypeId;
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
    @OneToMany(mappedBy = "parentTypeId")
    private List<ProductCategoryContentType> productCategoryContentTypeList;
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "PROD_CAT_CONTENT_TYPE_ID")
    @ManyToOne
    private ProductCategoryContentType parentTypeId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productCategoryContentType")
    private List<ProductCategoryContent> productCategoryContentList;

    public ProductCategoryContentType() {
    }

    public ProductCategoryContentType(String prodCatContentTypeId) {
        this.prodCatContentTypeId = prodCatContentTypeId;
    }

    public String getProdCatContentTypeId() {
        return prodCatContentTypeId;
    }

    public void setProdCatContentTypeId(String prodCatContentTypeId) {
        this.prodCatContentTypeId = prodCatContentTypeId;
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

    public List<ProductCategoryContentType> getProductCategoryContentTypeList() {
        return productCategoryContentTypeList;
    }

    public void setProductCategoryContentTypeList(List<ProductCategoryContentType> productCategoryContentTypeList) {
        this.productCategoryContentTypeList = productCategoryContentTypeList;
    }

    public ProductCategoryContentType getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(ProductCategoryContentType parentTypeId) {
        this.parentTypeId = parentTypeId;
    }

    public List<ProductCategoryContent> getProductCategoryContentList() {
        return productCategoryContentList;
    }

    public void setProductCategoryContentList(List<ProductCategoryContent> productCategoryContentList) {
        this.productCategoryContentList = productCategoryContentList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prodCatContentTypeId != null ? prodCatContentTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductCategoryContentType)) {
            return false;
        }
        ProductCategoryContentType other = (ProductCategoryContentType) object;
        if ((this.prodCatContentTypeId == null && other.prodCatContentTypeId != null) || (this.prodCatContentTypeId != null && !this.prodCatContentTypeId.equals(other.prodCatContentTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductCategoryContentType[ prodCatContentTypeId=" + prodCatContentTypeId + " ]";
    }
    
}
