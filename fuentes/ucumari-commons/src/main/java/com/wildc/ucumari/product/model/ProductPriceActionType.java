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
@Table(name = "product_price_action_type")
public class ProductPriceActionType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PRODUCT_PRICE_ACTION_TYPE_ID")
    private String productPriceActionTypeId;
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
    /*@OneToMany(mappedBy = "productPriceActionTypeId")
    private List<ProductPriceAction> productPriceActionList;*/

    public ProductPriceActionType() {
    }

    public ProductPriceActionType(String productPriceActionTypeId) {
        this.productPriceActionTypeId = productPriceActionTypeId;
    }

    public String getProductPriceActionTypeId() {
        return productPriceActionTypeId;
    }

    public void setProductPriceActionTypeId(String productPriceActionTypeId) {
        this.productPriceActionTypeId = productPriceActionTypeId;
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
    public List<ProductPriceAction> getProductPriceActionList() {
        return productPriceActionList;
    }

    public void setProductPriceActionList(List<ProductPriceAction> productPriceActionList) {
        this.productPriceActionList = productPriceActionList;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productPriceActionTypeId != null ? productPriceActionTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductPriceActionType)) {
            return false;
        }
        ProductPriceActionType other = (ProductPriceActionType) object;
        if ((this.productPriceActionTypeId == null && other.productPriceActionTypeId != null) || (this.productPriceActionTypeId != null && !this.productPriceActionTypeId.equals(other.productPriceActionTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductPriceActionType[ productPriceActionTypeId=" + productPriceActionTypeId + " ]";
    }
    
}
