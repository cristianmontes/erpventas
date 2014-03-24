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
@Table(name = "product_promo_code_email")
@NamedQueries({
    @NamedQuery(name = "ProductPromoCodeEmail.findAll", query = "SELECT p FROM ProductPromoCodeEmail p")})
public class ProductPromoCodeEmail implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductPromoCodeEmailPK productPromoCodeEmailPK;
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
    @JoinColumn(name = "PRODUCT_PROMO_CODE_ID", referencedColumnName = "PRODUCT_PROMO_CODE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProductPromoCode productPromoCode;

    public ProductPromoCodeEmail() {
    }

    public ProductPromoCodeEmail(ProductPromoCodeEmailPK productPromoCodeEmailPK) {
        this.productPromoCodeEmailPK = productPromoCodeEmailPK;
    }

    public ProductPromoCodeEmail(String productPromoCodeId, String emailAddress) {
        this.productPromoCodeEmailPK = new ProductPromoCodeEmailPK(productPromoCodeId, emailAddress);
    }

    public ProductPromoCodeEmailPK getProductPromoCodeEmailPK() {
        return productPromoCodeEmailPK;
    }

    public void setProductPromoCodeEmailPK(ProductPromoCodeEmailPK productPromoCodeEmailPK) {
        this.productPromoCodeEmailPK = productPromoCodeEmailPK;
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

    public ProductPromoCode getProductPromoCode() {
        return productPromoCode;
    }

    public void setProductPromoCode(ProductPromoCode productPromoCode) {
        this.productPromoCode = productPromoCode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productPromoCodeEmailPK != null ? productPromoCodeEmailPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductPromoCodeEmail)) {
            return false;
        }
        ProductPromoCodeEmail other = (ProductPromoCodeEmail) object;
        if ((this.productPromoCodeEmailPK == null && other.productPromoCodeEmailPK != null) || (this.productPromoCodeEmailPK != null && !this.productPromoCodeEmailPK.equals(other.productPromoCodeEmailPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductPromoCodeEmail[ productPromoCodeEmailPK=" + productPromoCodeEmailPK + " ]";
    }
    
}
