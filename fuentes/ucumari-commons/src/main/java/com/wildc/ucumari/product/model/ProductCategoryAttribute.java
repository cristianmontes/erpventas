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
@Table(name = "product_category_attribute")
@NamedQueries({
    @NamedQuery(name = "ProductCategoryAttribute.findAll", query = "SELECT p FROM ProductCategoryAttribute p")})
public class ProductCategoryAttribute implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductCategoryAttributePK productCategoryAttributePK;
    @Column(name = "ATTR_VALUE")
    private String attrValue;
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
    @JoinColumn(name = "PRODUCT_CATEGORY_ID", referencedColumnName = "PRODUCT_CATEGORY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProductCategory productCategory;

    public ProductCategoryAttribute() {
    }

    public ProductCategoryAttribute(ProductCategoryAttributePK productCategoryAttributePK) {
        this.productCategoryAttributePK = productCategoryAttributePK;
    }

    public ProductCategoryAttribute(String productCategoryId, String attrName) {
        this.productCategoryAttributePK = new ProductCategoryAttributePK(productCategoryId, attrName);
    }

    public ProductCategoryAttributePK getProductCategoryAttributePK() {
        return productCategoryAttributePK;
    }

    public void setProductCategoryAttributePK(ProductCategoryAttributePK productCategoryAttributePK) {
        this.productCategoryAttributePK = productCategoryAttributePK;
    }

    public String getAttrValue() {
        return attrValue;
    }

    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue;
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

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productCategoryAttributePK != null ? productCategoryAttributePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductCategoryAttribute)) {
            return false;
        }
        ProductCategoryAttribute other = (ProductCategoryAttribute) object;
        if ((this.productCategoryAttributePK == null && other.productCategoryAttributePK != null) || (this.productCategoryAttributePK != null && !this.productCategoryAttributePK.equals(other.productCategoryAttributePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductCategoryAttribute[ productCategoryAttributePK=" + productCategoryAttributePK + " ]";
    }
    
}
