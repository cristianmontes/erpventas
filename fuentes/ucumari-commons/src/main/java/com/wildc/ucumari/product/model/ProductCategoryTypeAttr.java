/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.product.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "product_category_type_attr")
@NamedQueries({
    @NamedQuery(name = "ProductCategoryTypeAttr.findAll", query = "SELECT p FROM ProductCategoryTypeAttr p")})
public class ProductCategoryTypeAttr implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductCategoryTypeAttrPK productCategoryTypeAttrPK;
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
    @JoinColumn(name = "PRODUCT_CATEGORY_TYPE_ID", referencedColumnName = "PRODUCT_CATEGORY_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProductCategoryType productCategoryType;

    public ProductCategoryTypeAttr() {
    }

    public ProductCategoryTypeAttr(ProductCategoryTypeAttrPK productCategoryTypeAttrPK) {
        this.productCategoryTypeAttrPK = productCategoryTypeAttrPK;
    }

    public ProductCategoryTypeAttr(String productCategoryTypeId, String attrName) {
        this.productCategoryTypeAttrPK = new ProductCategoryTypeAttrPK(productCategoryTypeId, attrName);
    }

    public ProductCategoryTypeAttrPK getProductCategoryTypeAttrPK() {
        return productCategoryTypeAttrPK;
    }

    public void setProductCategoryTypeAttrPK(ProductCategoryTypeAttrPK productCategoryTypeAttrPK) {
        this.productCategoryTypeAttrPK = productCategoryTypeAttrPK;
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

    public ProductCategoryType getProductCategoryType() {
        return productCategoryType;
    }

    public void setProductCategoryType(ProductCategoryType productCategoryType) {
        this.productCategoryType = productCategoryType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productCategoryTypeAttrPK != null ? productCategoryTypeAttrPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductCategoryTypeAttr)) {
            return false;
        }
        ProductCategoryTypeAttr other = (ProductCategoryTypeAttr) object;
        if ((this.productCategoryTypeAttrPK == null && other.productCategoryTypeAttrPK != null) || (this.productCategoryTypeAttrPK != null && !this.productCategoryTypeAttrPK.equals(other.productCategoryTypeAttrPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductCategoryTypeAttr[ productCategoryTypeAttrPK=" + productCategoryTypeAttrPK + " ]";
    }
    
}
