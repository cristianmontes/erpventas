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
@Table(name = "product_assoc_type")

public class ProductAssocType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PRODUCT_ASSOC_TYPE_ID")
    private String productAssocTypeId;
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
    private List<ProductAssocType> productAssocTypeList;*/
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "PRODUCT_ASSOC_TYPE_ID")
    @ManyToOne
    private ProductAssocType parentTypeId;
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "productAssocType")
    private List<ProductAssoc> productAssocList;*/

    public ProductAssocType() {
    }

    public ProductAssocType(String productAssocTypeId) {
        this.productAssocTypeId = productAssocTypeId;
    }

    public String getProductAssocTypeId() {
        return productAssocTypeId;
    }

    public void setProductAssocTypeId(String productAssocTypeId) {
        this.productAssocTypeId = productAssocTypeId;
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
    public List<ProductAssocType> getProductAssocTypeList() {
        return productAssocTypeList;
    }

    public void setProductAssocTypeList(List<ProductAssocType> productAssocTypeList) {
        this.productAssocTypeList = productAssocTypeList;
    }*/

    public ProductAssocType getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(ProductAssocType parentTypeId) {
        this.parentTypeId = parentTypeId;
    }
/*
    public List<ProductAssoc> getProductAssocList() {
        return productAssocList;
    }

    public void setProductAssocList(List<ProductAssoc> productAssocList) {
        this.productAssocList = productAssocList;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productAssocTypeId != null ? productAssocTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductAssocType)) {
            return false;
        }
        ProductAssocType other = (ProductAssocType) object;
        if ((this.productAssocTypeId == null && other.productAssocTypeId != null) || (this.productAssocTypeId != null && !this.productAssocTypeId.equals(other.productAssocTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductAssocType[ productAssocTypeId=" + productAssocTypeId + " ]";
    }
    
}
