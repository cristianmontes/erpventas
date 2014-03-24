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
@Table(name = "product_type_attr")
@NamedQueries({
    @NamedQuery(name = "ProductTypeAttr.findAll", query = "SELECT p FROM ProductTypeAttr p")})
public class ProductTypeAttr implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductTypeAttrPK productTypeAttrPK;
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
    @JoinColumn(name = "PRODUCT_TYPE_ID", referencedColumnName = "PRODUCT_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProductType productType;

    public ProductTypeAttr() {
    }

    public ProductTypeAttr(ProductTypeAttrPK productTypeAttrPK) {
        this.productTypeAttrPK = productTypeAttrPK;
    }

    public ProductTypeAttr(String productTypeId, String attrName) {
        this.productTypeAttrPK = new ProductTypeAttrPK(productTypeId, attrName);
    }

    public ProductTypeAttrPK getProductTypeAttrPK() {
        return productTypeAttrPK;
    }

    public void setProductTypeAttrPK(ProductTypeAttrPK productTypeAttrPK) {
        this.productTypeAttrPK = productTypeAttrPK;
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

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productTypeAttrPK != null ? productTypeAttrPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductTypeAttr)) {
            return false;
        }
        ProductTypeAttr other = (ProductTypeAttr) object;
        if ((this.productTypeAttrPK == null && other.productTypeAttrPK != null) || (this.productTypeAttrPK != null && !this.productTypeAttrPK.equals(other.productTypeAttrPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductTypeAttr[ productTypeAttrPK=" + productTypeAttrPK + " ]";
    }
    
}
