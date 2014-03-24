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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "product_store_catalog")

public class ProductStoreCatalog implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductStoreCatalogPK productStoreCatalogPK;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
    @Column(name = "SEQUENCE_NUM")
    private BigInteger sequenceNum;
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
    @JoinColumn(name = "PRODUCT_STORE_ID", referencedColumnName = "PRODUCT_STORE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProductStore productStore;
    @JoinColumn(name = "PROD_CATALOG_ID", referencedColumnName = "PROD_CATALOG_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProdCatalog prodCatalog;

    public ProductStoreCatalog() {
    }

    public ProductStoreCatalog(ProductStoreCatalogPK productStoreCatalogPK) {
        this.productStoreCatalogPK = productStoreCatalogPK;
    }

    public ProductStoreCatalog(String productStoreId, String prodCatalogId, Date fromDate) {
        this.productStoreCatalogPK = new ProductStoreCatalogPK(productStoreId, prodCatalogId, fromDate);
    }

    public ProductStoreCatalogPK getProductStoreCatalogPK() {
        return productStoreCatalogPK;
    }

    public void setProductStoreCatalogPK(ProductStoreCatalogPK productStoreCatalogPK) {
        this.productStoreCatalogPK = productStoreCatalogPK;
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

    public ProductStore getProductStore() {
        return productStore;
    }

    public void setProductStore(ProductStore productStore) {
        this.productStore = productStore;
    }

    public ProdCatalog getProdCatalog() {
        return prodCatalog;
    }

    public void setProdCatalog(ProdCatalog prodCatalog) {
        this.prodCatalog = prodCatalog;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productStoreCatalogPK != null ? productStoreCatalogPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductStoreCatalog)) {
            return false;
        }
        ProductStoreCatalog other = (ProductStoreCatalog) object;
        if ((this.productStoreCatalogPK == null && other.productStoreCatalogPK != null) || (this.productStoreCatalogPK != null && !this.productStoreCatalogPK.equals(other.productStoreCatalogPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductStoreCatalog[ productStoreCatalogPK=" + productStoreCatalogPK + " ]";
    }
    
}
