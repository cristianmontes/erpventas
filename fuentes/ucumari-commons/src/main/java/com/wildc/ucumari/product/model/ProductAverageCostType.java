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
@Table(name = "product_average_cost_type")
@NamedQueries({
    @NamedQuery(name = "ProductAverageCostType.findAll", query = "SELECT p FROM ProductAverageCostType p")})
public class ProductAverageCostType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PRODUCT_AVERAGE_COST_TYPE_ID")
    private String productAverageCostTypeId;
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
    private List<ProductAverageCostType> productAverageCostTypeList;
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "PRODUCT_AVERAGE_COST_TYPE_ID")
    @ManyToOne
    private ProductAverageCostType parentTypeId;

    public ProductAverageCostType() {
    }

    public ProductAverageCostType(String productAverageCostTypeId) {
        this.productAverageCostTypeId = productAverageCostTypeId;
    }

    public String getProductAverageCostTypeId() {
        return productAverageCostTypeId;
    }

    public void setProductAverageCostTypeId(String productAverageCostTypeId) {
        this.productAverageCostTypeId = productAverageCostTypeId;
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

    public List<ProductAverageCostType> getProductAverageCostTypeList() {
        return productAverageCostTypeList;
    }

    public void setProductAverageCostTypeList(List<ProductAverageCostType> productAverageCostTypeList) {
        this.productAverageCostTypeList = productAverageCostTypeList;
    }

    public ProductAverageCostType getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(ProductAverageCostType parentTypeId) {
        this.parentTypeId = parentTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productAverageCostTypeId != null ? productAverageCostTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductAverageCostType)) {
            return false;
        }
        ProductAverageCostType other = (ProductAverageCostType) object;
        if ((this.productAverageCostTypeId == null && other.productAverageCostTypeId != null) || (this.productAverageCostTypeId != null && !this.productAverageCostTypeId.equals(other.productAverageCostTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductAverageCostType[ productAverageCostTypeId=" + productAverageCostTypeId + " ]";
    }
    
}
