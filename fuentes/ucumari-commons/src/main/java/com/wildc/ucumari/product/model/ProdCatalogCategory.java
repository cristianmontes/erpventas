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
@Table(name = "prod_catalog_category")

public class ProdCatalogCategory implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProdCatalogCategoryPK prodCatalogCategoryPK;
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
    @JoinColumn(name = "PROD_CATALOG_CATEGORY_TYPE_ID", referencedColumnName = "PROD_CATALOG_CATEGORY_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProdCatalogCategoryType prodCatalogCategoryType;
    @JoinColumn(name = "PRODUCT_CATEGORY_ID", referencedColumnName = "PRODUCT_CATEGORY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProductCategory productCategory;
    @JoinColumn(name = "PROD_CATALOG_ID", referencedColumnName = "PROD_CATALOG_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProdCatalog prodCatalog;

    public ProdCatalogCategory() {
    }

    public ProdCatalogCategory(ProdCatalogCategoryPK prodCatalogCategoryPK) {
        this.prodCatalogCategoryPK = prodCatalogCategoryPK;
    }

    public ProdCatalogCategory(String prodCatalogId, String productCategoryId, String prodCatalogCategoryTypeId, Date fromDate) {
        this.prodCatalogCategoryPK = new ProdCatalogCategoryPK(prodCatalogId, productCategoryId, prodCatalogCategoryTypeId, fromDate);
    }

    public ProdCatalogCategoryPK getProdCatalogCategoryPK() {
        return prodCatalogCategoryPK;
    }

    public void setProdCatalogCategoryPK(ProdCatalogCategoryPK prodCatalogCategoryPK) {
        this.prodCatalogCategoryPK = prodCatalogCategoryPK;
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

    public ProdCatalogCategoryType getProdCatalogCategoryType() {
        return prodCatalogCategoryType;
    }

    public void setProdCatalogCategoryType(ProdCatalogCategoryType prodCatalogCategoryType) {
        this.prodCatalogCategoryType = prodCatalogCategoryType;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
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
        hash += (prodCatalogCategoryPK != null ? prodCatalogCategoryPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProdCatalogCategory)) {
            return false;
        }
        ProdCatalogCategory other = (ProdCatalogCategory) object;
        if ((this.prodCatalogCategoryPK == null && other.prodCatalogCategoryPK != null) || (this.prodCatalogCategoryPK != null && !this.prodCatalogCategoryPK.equals(other.prodCatalogCategoryPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProdCatalogCategory[ prodCatalogCategoryPK=" + prodCatalogCategoryPK + " ]";
    }
    
}
