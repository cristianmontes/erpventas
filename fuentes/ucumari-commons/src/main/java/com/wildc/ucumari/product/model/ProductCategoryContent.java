/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.product.model;

import java.io.Serializable;
import java.math.BigDecimal;
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

import com.wildc.ucumari.client.modelo.Content;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "product_category_content")
@NamedQueries({
    @NamedQuery(name = "ProductCategoryContent.findAll", query = "SELECT p FROM ProductCategoryContent p")})
public class ProductCategoryContent implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductCategoryContentPK productCategoryContentPK;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
    @Column(name = "PURCHASE_FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date purchaseFromDate;
    @Column(name = "PURCHASE_THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date purchaseThruDate;
    @Column(name = "USE_COUNT_LIMIT")
    private BigInteger useCountLimit;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "USE_DAYS_LIMIT")
    private BigDecimal useDaysLimit;
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
    @JoinColumn(name = "PROD_CAT_CONTENT_TYPE_ID", referencedColumnName = "PROD_CAT_CONTENT_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProductCategoryContentType productCategoryContentType;
    @JoinColumn(name = "PRODUCT_CATEGORY_ID", referencedColumnName = "PRODUCT_CATEGORY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProductCategory productCategory;
    @JoinColumn(name = "CONTENT_ID", referencedColumnName = "CONTENT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Content content;

    public ProductCategoryContent() {
    }

    public ProductCategoryContent(ProductCategoryContentPK productCategoryContentPK) {
        this.productCategoryContentPK = productCategoryContentPK;
    }

    public ProductCategoryContent(String productCategoryId, String contentId, String prodCatContentTypeId, Date fromDate) {
        this.productCategoryContentPK = new ProductCategoryContentPK(productCategoryId, contentId, prodCatContentTypeId, fromDate);
    }

    public ProductCategoryContentPK getProductCategoryContentPK() {
        return productCategoryContentPK;
    }

    public void setProductCategoryContentPK(ProductCategoryContentPK productCategoryContentPK) {
        this.productCategoryContentPK = productCategoryContentPK;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
    }

    public Date getPurchaseFromDate() {
        return purchaseFromDate;
    }

    public void setPurchaseFromDate(Date purchaseFromDate) {
        this.purchaseFromDate = purchaseFromDate;
    }

    public Date getPurchaseThruDate() {
        return purchaseThruDate;
    }

    public void setPurchaseThruDate(Date purchaseThruDate) {
        this.purchaseThruDate = purchaseThruDate;
    }

    public BigInteger getUseCountLimit() {
        return useCountLimit;
    }

    public void setUseCountLimit(BigInteger useCountLimit) {
        this.useCountLimit = useCountLimit;
    }

    public BigDecimal getUseDaysLimit() {
        return useDaysLimit;
    }

    public void setUseDaysLimit(BigDecimal useDaysLimit) {
        this.useDaysLimit = useDaysLimit;
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

    public ProductCategoryContentType getProductCategoryContentType() {
        return productCategoryContentType;
    }

    public void setProductCategoryContentType(ProductCategoryContentType productCategoryContentType) {
        this.productCategoryContentType = productCategoryContentType;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productCategoryContentPK != null ? productCategoryContentPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductCategoryContent)) {
            return false;
        }
        ProductCategoryContent other = (ProductCategoryContent) object;
        if ((this.productCategoryContentPK == null && other.productCategoryContentPK != null) || (this.productCategoryContentPK != null && !this.productCategoryContentPK.equals(other.productCategoryContentPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductCategoryContent[ productCategoryContentPK=" + productCategoryContentPK + " ]";
    }
    
}
