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
@Table(name = "product_feature_iactn_type")
@NamedQueries({
    @NamedQuery(name = "ProductFeatureIactnType.findAll", query = "SELECT p FROM ProductFeatureIactnType p")})
public class ProductFeatureIactnType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PRODUCT_FEATURE_IACTN_TYPE_ID")
    private String productFeatureIactnTypeId;
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
    private List<ProductFeatureIactnType> productFeatureIactnTypeList;
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "PRODUCT_FEATURE_IACTN_TYPE_ID")
    @ManyToOne
    private ProductFeatureIactnType parentTypeId;
    @OneToMany(mappedBy = "productFeatureIactnTypeId")
    private List<ProductFeatureIactn> productFeatureIactnList;

    public ProductFeatureIactnType() {
    }

    public ProductFeatureIactnType(String productFeatureIactnTypeId) {
        this.productFeatureIactnTypeId = productFeatureIactnTypeId;
    }

    public String getProductFeatureIactnTypeId() {
        return productFeatureIactnTypeId;
    }

    public void setProductFeatureIactnTypeId(String productFeatureIactnTypeId) {
        this.productFeatureIactnTypeId = productFeatureIactnTypeId;
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

    public List<ProductFeatureIactnType> getProductFeatureIactnTypeList() {
        return productFeatureIactnTypeList;
    }

    public void setProductFeatureIactnTypeList(List<ProductFeatureIactnType> productFeatureIactnTypeList) {
        this.productFeatureIactnTypeList = productFeatureIactnTypeList;
    }

    public ProductFeatureIactnType getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(ProductFeatureIactnType parentTypeId) {
        this.parentTypeId = parentTypeId;
    }

    public List<ProductFeatureIactn> getProductFeatureIactnList() {
        return productFeatureIactnList;
    }

    public void setProductFeatureIactnList(List<ProductFeatureIactn> productFeatureIactnList) {
        this.productFeatureIactnList = productFeatureIactnList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productFeatureIactnTypeId != null ? productFeatureIactnTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductFeatureIactnType)) {
            return false;
        }
        ProductFeatureIactnType other = (ProductFeatureIactnType) object;
        if ((this.productFeatureIactnTypeId == null && other.productFeatureIactnTypeId != null) || (this.productFeatureIactnTypeId != null && !this.productFeatureIactnTypeId.equals(other.productFeatureIactnTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductFeatureIactnType[ productFeatureIactnTypeId=" + productFeatureIactnTypeId + " ]";
    }
    
}
