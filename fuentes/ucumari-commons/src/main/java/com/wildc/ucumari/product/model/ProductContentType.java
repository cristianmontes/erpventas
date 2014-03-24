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
@Table(name = "product_content_type")
@NamedQueries({
    @NamedQuery(name = "ProductContentType.findAll", query = "SELECT p FROM ProductContentType p")})
public class ProductContentType implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productContentType")
    private List<ProductContent> productContentList;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PRODUCT_CONTENT_TYPE_ID")
    private String productContentTypeId;
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
    private List<ProductContentType> productContentTypeList;
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "PRODUCT_CONTENT_TYPE_ID")
    @ManyToOne
    private ProductContentType parentTypeId;
    
    public ProductContentType() {
    }

    public ProductContentType(String productContentTypeId) {
        this.productContentTypeId = productContentTypeId;
    }

    public String getProductContentTypeId() {
        return productContentTypeId;
    }

    public void setProductContentTypeId(String productContentTypeId) {
        this.productContentTypeId = productContentTypeId;
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

    public List<ProductContentType> getProductContentTypeList() {
        return productContentTypeList;
    }

    public void setProductContentTypeList(List<ProductContentType> productContentTypeList) {
        this.productContentTypeList = productContentTypeList;
    }

    public ProductContentType getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(ProductContentType parentTypeId) {
        this.parentTypeId = parentTypeId;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productContentTypeId != null ? productContentTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductContentType)) {
            return false;
        }
        ProductContentType other = (ProductContentType) object;
        if ((this.productContentTypeId == null && other.productContentTypeId != null) || (this.productContentTypeId != null && !this.productContentTypeId.equals(other.productContentTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductContentType[ productContentTypeId=" + productContentTypeId + " ]";
    }

    public List<ProductContent> getProductContentList() {
        return productContentList;
    }

    public void setProductContentList(List<ProductContent> productContentList) {
        this.productContentList = productContentList;
    }
    
}
