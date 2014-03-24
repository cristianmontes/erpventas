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
@Table(name = "product_feature_appl_type")
public class ProductFeatureApplType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PRODUCT_FEATURE_APPL_TYPE_ID")
    private String productFeatureApplTypeId;
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
    /*@OneToMany(mappedBy = "productFeatureApplTypeId")
    private List<ProductFeatureAppl> productFeatureApplList;
    @OneToMany(mappedBy = "parentTypeId")
    private List<ProductFeatureApplType> productFeatureApplTypeList;*/
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "PRODUCT_FEATURE_APPL_TYPE_ID")
    @ManyToOne
    private ProductFeatureApplType parentTypeId;

    public ProductFeatureApplType() {
    }

    public ProductFeatureApplType(String productFeatureApplTypeId) {
        this.productFeatureApplTypeId = productFeatureApplTypeId;
    }

    public String getProductFeatureApplTypeId() {
        return productFeatureApplTypeId;
    }

    public void setProductFeatureApplTypeId(String productFeatureApplTypeId) {
        this.productFeatureApplTypeId = productFeatureApplTypeId;
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
    public List<ProductFeatureAppl> getProductFeatureApplList() {
        return productFeatureApplList;
    }

    public void setProductFeatureApplList(List<ProductFeatureAppl> productFeatureApplList) {
        this.productFeatureApplList = productFeatureApplList;
    }

    public List<ProductFeatureApplType> getProductFeatureApplTypeList() {
        return productFeatureApplTypeList;
    }

    public void setProductFeatureApplTypeList(List<ProductFeatureApplType> productFeatureApplTypeList) {
        this.productFeatureApplTypeList = productFeatureApplTypeList;
    }*/

    public ProductFeatureApplType getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(ProductFeatureApplType parentTypeId) {
        this.parentTypeId = parentTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productFeatureApplTypeId != null ? productFeatureApplTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductFeatureApplType)) {
            return false;
        }
        ProductFeatureApplType other = (ProductFeatureApplType) object;
        if ((this.productFeatureApplTypeId == null && other.productFeatureApplTypeId != null) || (this.productFeatureApplTypeId != null && !this.productFeatureApplTypeId.equals(other.productFeatureApplTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductFeatureApplType[ productFeatureApplTypeId=" + productFeatureApplTypeId + " ]";
    }
    
}
