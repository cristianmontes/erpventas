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
@Table(name = "product_keyword")
@NamedQueries({
    @NamedQuery(name = "ProductKeyword.findAll", query = "SELECT p FROM ProductKeyword p")})
public class ProductKeyword implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductKeywordPK productKeywordPK;
    @Column(name = "RELEVANCY_WEIGHT")
    private BigInteger relevancyWeight;
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

    public ProductKeyword() {
    }

    public ProductKeyword(ProductKeywordPK productKeywordPK) {
        this.productKeywordPK = productKeywordPK;
    }

    public ProductKeyword(String productId, String keyword) {
        this.productKeywordPK = new ProductKeywordPK(productId, keyword);
    }

    public ProductKeywordPK getProductKeywordPK() {
        return productKeywordPK;
    }

    public void setProductKeywordPK(ProductKeywordPK productKeywordPK) {
        this.productKeywordPK = productKeywordPK;
    }

    public BigInteger getRelevancyWeight() {
        return relevancyWeight;
    }

    public void setRelevancyWeight(BigInteger relevancyWeight) {
        this.relevancyWeight = relevancyWeight;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productKeywordPK != null ? productKeywordPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductKeyword)) {
            return false;
        }
        ProductKeyword other = (ProductKeyword) object;
        if ((this.productKeywordPK == null && other.productKeywordPK != null) || (this.productKeywordPK != null && !this.productKeywordPK.equals(other.productKeywordPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductKeyword[ productKeywordPK=" + productKeywordPK + " ]";
    }
    
}
