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
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "product_calculated_info")
@NamedQueries({
    @NamedQuery(name = "ProductCalculatedInfo.findAll", query = "SELECT p FROM ProductCalculatedInfo p")})
public class ProductCalculatedInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PRODUCT_ID")
    private String productId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TOTAL_QUANTITY_ORDERED")
    private BigDecimal totalQuantityOrdered;
    @Column(name = "TOTAL_TIMES_VIEWED")
    private BigInteger totalTimesViewed;
    @Column(name = "AVERAGE_CUSTOMER_RATING")
    private BigDecimal averageCustomerRating;
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
    @OneToOne(optional = false)
    private Product product;

    public ProductCalculatedInfo() {
    }

    public ProductCalculatedInfo(String productId) {
        this.productId = productId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public BigDecimal getTotalQuantityOrdered() {
        return totalQuantityOrdered;
    }

    public void setTotalQuantityOrdered(BigDecimal totalQuantityOrdered) {
        this.totalQuantityOrdered = totalQuantityOrdered;
    }

    public BigInteger getTotalTimesViewed() {
        return totalTimesViewed;
    }

    public void setTotalTimesViewed(BigInteger totalTimesViewed) {
        this.totalTimesViewed = totalTimesViewed;
    }

    public BigDecimal getAverageCustomerRating() {
        return averageCustomerRating;
    }

    public void setAverageCustomerRating(BigDecimal averageCustomerRating) {
        this.averageCustomerRating = averageCustomerRating;
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
        hash += (productId != null ? productId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductCalculatedInfo)) {
            return false;
        }
        ProductCalculatedInfo other = (ProductCalculatedInfo) object;
        if ((this.productId == null && other.productId != null) || (this.productId != null && !this.productId.equals(other.productId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductCalculatedInfo[ productId=" + productId + " ]";
    }
    
}
