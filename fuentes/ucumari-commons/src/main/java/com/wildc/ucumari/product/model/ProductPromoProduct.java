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

import com.wildc.ucumari.parameters.model.Enumeration;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "product_promo_product")
@NamedQueries({
    @NamedQuery(name = "ProductPromoProduct.findAll", query = "SELECT p FROM ProductPromoProduct p")})
public class ProductPromoProduct implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductPromoProductPK productPromoProductPK;
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
    @JoinColumn(name = "PRODUCT_PROMO_ID", referencedColumnName = "PRODUCT_PROMO_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProductPromo productPromo;
    @JoinColumn(name = "PRODUCT_ID", referencedColumnName = "PRODUCT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Product product;
    @JoinColumn(name = "PRODUCT_PROMO_APPL_ENUM_ID", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration productPromoApplEnumId;

    public ProductPromoProduct() {
    }

    public ProductPromoProduct(ProductPromoProductPK productPromoProductPK) {
        this.productPromoProductPK = productPromoProductPK;
    }

    public ProductPromoProduct(String productPromoId, String productPromoRuleId, String productPromoActionSeqId, String productPromoCondSeqId, String productId) {
        this.productPromoProductPK = new ProductPromoProductPK(productPromoId, productPromoRuleId, productPromoActionSeqId, productPromoCondSeqId, productId);
    }

    public ProductPromoProductPK getProductPromoProductPK() {
        return productPromoProductPK;
    }

    public void setProductPromoProductPK(ProductPromoProductPK productPromoProductPK) {
        this.productPromoProductPK = productPromoProductPK;
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

    public ProductPromo getProductPromo() {
        return productPromo;
    }

    public void setProductPromo(ProductPromo productPromo) {
        this.productPromo = productPromo;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Enumeration getProductPromoApplEnumId() {
        return productPromoApplEnumId;
    }

    public void setProductPromoApplEnumId(Enumeration productPromoApplEnumId) {
        this.productPromoApplEnumId = productPromoApplEnumId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productPromoProductPK != null ? productPromoProductPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductPromoProduct)) {
            return false;
        }
        ProductPromoProduct other = (ProductPromoProduct) object;
        if ((this.productPromoProductPK == null && other.productPromoProductPK != null) || (this.productPromoProductPK != null && !this.productPromoProductPK.equals(other.productPromoProductPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductPromoProduct[ productPromoProductPK=" + productPromoProductPK + " ]";
    }
    
}
