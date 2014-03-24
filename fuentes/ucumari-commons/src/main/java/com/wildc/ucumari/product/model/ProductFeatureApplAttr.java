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
import javax.persistence.JoinColumns;
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
@Table(name = "product_feature_appl_attr")
@NamedQueries({
    @NamedQuery(name = "ProductFeatureApplAttr.findAll", query = "SELECT p FROM ProductFeatureApplAttr p")})
public class ProductFeatureApplAttr implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductFeatureApplAttrPK productFeatureApplAttrPK;
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
    @JoinColumn(name = "PRODUCT_ID", referencedColumnName = "PRODUCT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Product product;
    @JoinColumn(name = "PRODUCT_FEATURE_ID", referencedColumnName = "PRODUCT_FEATURE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProductFeature productFeature;
    @JoinColumns({
        @JoinColumn(name = "PRODUCT_ID", referencedColumnName = "PRODUCT_ID", insertable = false, updatable = false),
        @JoinColumn(name = "PRODUCT_FEATURE_ID", referencedColumnName = "PRODUCT_FEATURE_ID", insertable = false, updatable = false),
        @JoinColumn(name = "FROM_DATE", referencedColumnName = "FROM_DATE", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private ProductFeatureAppl productFeatureAppl;

    public ProductFeatureApplAttr() {
    }

    public ProductFeatureApplAttr(ProductFeatureApplAttrPK productFeatureApplAttrPK) {
        this.productFeatureApplAttrPK = productFeatureApplAttrPK;
    }

    public ProductFeatureApplAttr(String productId, String productFeatureId, Date fromDate, String attrName) {
        this.productFeatureApplAttrPK = new ProductFeatureApplAttrPK(productId, productFeatureId, fromDate, attrName);
    }

    public ProductFeatureApplAttrPK getProductFeatureApplAttrPK() {
        return productFeatureApplAttrPK;
    }

    public void setProductFeatureApplAttrPK(ProductFeatureApplAttrPK productFeatureApplAttrPK) {
        this.productFeatureApplAttrPK = productFeatureApplAttrPK;
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

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public ProductFeature getProductFeature() {
        return productFeature;
    }

    public void setProductFeature(ProductFeature productFeature) {
        this.productFeature = productFeature;
    }

    public ProductFeatureAppl getProductFeatureAppl() {
        return productFeatureAppl;
    }

    public void setProductFeatureAppl(ProductFeatureAppl productFeatureAppl) {
        this.productFeatureAppl = productFeatureAppl;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productFeatureApplAttrPK != null ? productFeatureApplAttrPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductFeatureApplAttr)) {
            return false;
        }
        ProductFeatureApplAttr other = (ProductFeatureApplAttr) object;
        if ((this.productFeatureApplAttrPK == null && other.productFeatureApplAttrPK != null) || (this.productFeatureApplAttrPK != null && !this.productFeatureApplAttrPK.equals(other.productFeatureApplAttrPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductFeatureApplAttr[ productFeatureApplAttrPK=" + productFeatureApplAttrPK + " ]";
    }
    
}
