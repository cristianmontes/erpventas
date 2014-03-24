/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.product.model;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "product_store_promo_appl")
@NamedQueries({
    @NamedQuery(name = "ProductStorePromoAppl.findAll", query = "SELECT p FROM ProductStorePromoAppl p")})
public class ProductStorePromoAppl implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductStorePromoApplPK productStorePromoApplPK;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
    @Column(name = "SEQUENCE_NUM")
    private BigInteger sequenceNum;
    @Column(name = "MANUAL_ONLY")
    private Character manualOnly;
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
    @JoinColumn(name = "PRODUCT_STORE_ID", referencedColumnName = "PRODUCT_STORE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProductStore productStore;

    public ProductStorePromoAppl() {
    }

    public ProductStorePromoAppl(ProductStorePromoApplPK productStorePromoApplPK) {
        this.productStorePromoApplPK = productStorePromoApplPK;
    }

    public ProductStorePromoAppl(String productStoreId, String productPromoId, Date fromDate) {
        this.productStorePromoApplPK = new ProductStorePromoApplPK(productStoreId, productPromoId, fromDate);
    }

    public ProductStorePromoApplPK getProductStorePromoApplPK() {
        return productStorePromoApplPK;
    }

    public void setProductStorePromoApplPK(ProductStorePromoApplPK productStorePromoApplPK) {
        this.productStorePromoApplPK = productStorePromoApplPK;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
    }

    public BigInteger getSequenceNum() {
        return sequenceNum;
    }

    public void setSequenceNum(BigInteger sequenceNum) {
        this.sequenceNum = sequenceNum;
    }

    public Character getManualOnly() {
        return manualOnly;
    }

    public void setManualOnly(Character manualOnly) {
        this.manualOnly = manualOnly;
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

    public ProductStore getProductStore() {
        return productStore;
    }

    public void setProductStore(ProductStore productStore) {
        this.productStore = productStore;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productStorePromoApplPK != null ? productStorePromoApplPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductStorePromoAppl)) {
            return false;
        }
        ProductStorePromoAppl other = (ProductStorePromoAppl) object;
        if ((this.productStorePromoApplPK == null && other.productStorePromoApplPK != null) || (this.productStorePromoApplPK != null && !this.productStorePromoApplPK.equals(other.productStorePromoApplPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductStorePromoAppl[ productStorePromoApplPK=" + productStorePromoApplPK + " ]";
    }
    
}
