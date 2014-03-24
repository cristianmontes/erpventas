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
@Table(name = "product_feature_group")
@NamedQueries({
    @NamedQuery(name = "ProductFeatureGroup.findAll", query = "SELECT p FROM ProductFeatureGroup p")})
public class ProductFeatureGroup implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PRODUCT_FEATURE_GROUP_ID")
    private String productFeatureGroupId;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productFeatureGroup")
    private List<ProductFeatureCatGrpAppl> productFeatureCatGrpApplList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productFeatureGroup")
    private List<ProductFeatureGroupAppl> productFeatureGroupApplList;

    public ProductFeatureGroup() {
    }

    public ProductFeatureGroup(String productFeatureGroupId) {
        this.productFeatureGroupId = productFeatureGroupId;
    }

    public String getProductFeatureGroupId() {
        return productFeatureGroupId;
    }

    public void setProductFeatureGroupId(String productFeatureGroupId) {
        this.productFeatureGroupId = productFeatureGroupId;
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

    public List<ProductFeatureCatGrpAppl> getProductFeatureCatGrpApplList() {
        return productFeatureCatGrpApplList;
    }

    public void setProductFeatureCatGrpApplList(List<ProductFeatureCatGrpAppl> productFeatureCatGrpApplList) {
        this.productFeatureCatGrpApplList = productFeatureCatGrpApplList;
    }

    public List<ProductFeatureGroupAppl> getProductFeatureGroupApplList() {
        return productFeatureGroupApplList;
    }

    public void setProductFeatureGroupApplList(List<ProductFeatureGroupAppl> productFeatureGroupApplList) {
        this.productFeatureGroupApplList = productFeatureGroupApplList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productFeatureGroupId != null ? productFeatureGroupId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductFeatureGroup)) {
            return false;
        }
        ProductFeatureGroup other = (ProductFeatureGroup) object;
        if ((this.productFeatureGroupId == null && other.productFeatureGroupId != null) || (this.productFeatureGroupId != null && !this.productFeatureGroupId.equals(other.productFeatureGroupId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductFeatureGroup[ productFeatureGroupId=" + productFeatureGroupId + " ]";
    }
    
}
