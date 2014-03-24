/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.product.model;

import com.wildc.ucumari.parameters.model.StatusItem;
import com.wildc.ucumari.security.model.UserLogin;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
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
@Table(name = "product_review")
@NamedQueries({
    @NamedQuery(name = "ProductReview.findAll", query = "SELECT p FROM ProductReview p")})
public class ProductReview implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PRODUCT_REVIEW_ID")
    private String productReviewId;
    @Column(name = "POSTED_ANONYMOUS")
    private Character postedAnonymous;
    @Column(name = "POSTED_DATE_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date postedDateTime;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRODUCT_RATING")
    private BigDecimal productRating;
    @Lob
    @Column(name = "PRODUCT_REVIEW")
    private String productReview;
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
    @JoinColumn(name = "USER_LOGIN_ID", referencedColumnName = "USER_LOGIN_ID")
    @ManyToOne
    private UserLogin userLoginId;
    @JoinColumn(name = "STATUS_ID", referencedColumnName = "STATUS_ID")
    @ManyToOne
    private StatusItem statusId;
    @JoinColumn(name = "PRODUCT_ID", referencedColumnName = "PRODUCT_ID")
    @ManyToOne
    private Product productId;
    @JoinColumn(name = "PRODUCT_STORE_ID", referencedColumnName = "PRODUCT_STORE_ID")
    @ManyToOne
    private ProductStore productStoreId;

    public ProductReview() {
    }

    public ProductReview(String productReviewId) {
        this.productReviewId = productReviewId;
    }

    public String getProductReviewId() {
        return productReviewId;
    }

    public void setProductReviewId(String productReviewId) {
        this.productReviewId = productReviewId;
    }

    public Character getPostedAnonymous() {
        return postedAnonymous;
    }

    public void setPostedAnonymous(Character postedAnonymous) {
        this.postedAnonymous = postedAnonymous;
    }

    public Date getPostedDateTime() {
        return postedDateTime;
    }

    public void setPostedDateTime(Date postedDateTime) {
        this.postedDateTime = postedDateTime;
    }

    public BigDecimal getProductRating() {
        return productRating;
    }

    public void setProductRating(BigDecimal productRating) {
        this.productRating = productRating;
    }

    public String getProductReview() {
        return productReview;
    }

    public void setProductReview(String productReview) {
        this.productReview = productReview;
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

    public UserLogin getUserLoginId() {
        return userLoginId;
    }

    public void setUserLoginId(UserLogin userLoginId) {
        this.userLoginId = userLoginId;
    }

    public StatusItem getStatusId() {
        return statusId;
    }

    public void setStatusId(StatusItem statusId) {
        this.statusId = statusId;
    }

    public Product getProductId() {
        return productId;
    }

    public void setProductId(Product productId) {
        this.productId = productId;
    }

    public ProductStore getProductStoreId() {
        return productStoreId;
    }

    public void setProductStoreId(ProductStore productStoreId) {
        this.productStoreId = productStoreId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productReviewId != null ? productReviewId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductReview)) {
            return false;
        }
        ProductReview other = (ProductReview) object;
        if ((this.productReviewId == null && other.productReviewId != null) || (this.productReviewId != null && !this.productReviewId.equals(other.productReviewId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductReview[ productReviewId=" + productReviewId + " ]";
    }
    
}
