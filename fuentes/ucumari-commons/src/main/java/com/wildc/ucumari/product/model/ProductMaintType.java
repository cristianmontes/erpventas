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

import com.wildc.ucumari.client.modelo.FixedAssetMaint;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "product_maint_type")
@NamedQueries({
    @NamedQuery(name = "ProductMaintType.findAll", query = "SELECT p FROM ProductMaintType p")})
public class ProductMaintType implements Serializable {
    @OneToMany(mappedBy = "productMaintTypeId")
    private List<ProductMaint> productMaintList;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PRODUCT_MAINT_TYPE_ID")
    private String productMaintTypeId;
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
    private List<ProductMaintType> productMaintTypeList;
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "PRODUCT_MAINT_TYPE_ID")
    @ManyToOne
    private ProductMaintType parentTypeId;
    @OneToMany(mappedBy = "productMaintTypeId")
    private List<FixedAssetMaint> fixedAssetMaintList;

    public ProductMaintType() {
    }

    public ProductMaintType(String productMaintTypeId) {
        this.productMaintTypeId = productMaintTypeId;
    }

    public String getProductMaintTypeId() {
        return productMaintTypeId;
    }

    public void setProductMaintTypeId(String productMaintTypeId) {
        this.productMaintTypeId = productMaintTypeId;
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

    public List<ProductMaintType> getProductMaintTypeList() {
        return productMaintTypeList;
    }

    public void setProductMaintTypeList(List<ProductMaintType> productMaintTypeList) {
        this.productMaintTypeList = productMaintTypeList;
    }

    public ProductMaintType getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(ProductMaintType parentTypeId) {
        this.parentTypeId = parentTypeId;
    }

    public List<FixedAssetMaint> getFixedAssetMaintList() {
        return fixedAssetMaintList;
    }

    public void setFixedAssetMaintList(List<FixedAssetMaint> fixedAssetMaintList) {
        this.fixedAssetMaintList = fixedAssetMaintList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productMaintTypeId != null ? productMaintTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductMaintType)) {
            return false;
        }
        ProductMaintType other = (ProductMaintType) object;
        if ((this.productMaintTypeId == null && other.productMaintTypeId != null) || (this.productMaintTypeId != null && !this.productMaintTypeId.equals(other.productMaintTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductMaintType[ productMaintTypeId=" + productMaintTypeId + " ]";
    }

    public List<ProductMaint> getProductMaintList() {
        return productMaintList;
    }

    public void setProductMaintList(List<ProductMaint> productMaintList) {
        this.productMaintList = productMaintList;
    }
    
}
