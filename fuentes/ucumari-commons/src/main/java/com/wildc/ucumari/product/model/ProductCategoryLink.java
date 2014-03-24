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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.parameters.model.Enumeration;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "product_category_link")
public class ProductCategoryLink implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductCategoryLinkPK productCategoryLinkPK;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
    @Column(name = "COMMENTS")
    private String comments;
    @Column(name = "SEQUENCE_NUM")
    private BigInteger sequenceNum;
    @Column(name = "TITLE_TEXT")
    private String titleText;
    @Lob
    @Column(name = "DETAIL_TEXT")
    private String detailText;
    @Column(name = "IMAGE_URL")
    private String imageUrl;
    @Column(name = "IMAGE_TWO_URL")
    private String imageTwoUrl;
    @Column(name = "LINK_INFO")
    private String linkInfo;
    @Column(name = "DETAIL_SUB_SCREEN")
    private String detailSubScreen;
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
    @JoinColumn(name = "LINK_TYPE_ENUM_ID", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration linkTypeEnumId;
    @JoinColumn(name = "PRODUCT_CATEGORY_ID", referencedColumnName = "PRODUCT_CATEGORY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProductCategory productCategory;

    public ProductCategoryLink() {
    }

    public ProductCategoryLink(ProductCategoryLinkPK productCategoryLinkPK) {
        this.productCategoryLinkPK = productCategoryLinkPK;
    }

    public ProductCategoryLink(String productCategoryId, String linkSeqId, Date fromDate) {
        this.productCategoryLinkPK = new ProductCategoryLinkPK(productCategoryId, linkSeqId, fromDate);
    }

    public ProductCategoryLinkPK getProductCategoryLinkPK() {
        return productCategoryLinkPK;
    }

    public void setProductCategoryLinkPK(ProductCategoryLinkPK productCategoryLinkPK) {
        this.productCategoryLinkPK = productCategoryLinkPK;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public BigInteger getSequenceNum() {
        return sequenceNum;
    }

    public void setSequenceNum(BigInteger sequenceNum) {
        this.sequenceNum = sequenceNum;
    }

    public String getTitleText() {
        return titleText;
    }

    public void setTitleText(String titleText) {
        this.titleText = titleText;
    }

    public String getDetailText() {
        return detailText;
    }

    public void setDetailText(String detailText) {
        this.detailText = detailText;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageTwoUrl() {
        return imageTwoUrl;
    }

    public void setImageTwoUrl(String imageTwoUrl) {
        this.imageTwoUrl = imageTwoUrl;
    }

    public String getLinkInfo() {
        return linkInfo;
    }

    public void setLinkInfo(String linkInfo) {
        this.linkInfo = linkInfo;
    }

    public String getDetailSubScreen() {
        return detailSubScreen;
    }

    public void setDetailSubScreen(String detailSubScreen) {
        this.detailSubScreen = detailSubScreen;
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

    public Enumeration getLinkTypeEnumId() {
        return linkTypeEnumId;
    }

    public void setLinkTypeEnumId(Enumeration linkTypeEnumId) {
        this.linkTypeEnumId = linkTypeEnumId;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productCategoryLinkPK != null ? productCategoryLinkPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductCategoryLink)) {
            return false;
        }
        ProductCategoryLink other = (ProductCategoryLink) object;
        if ((this.productCategoryLinkPK == null && other.productCategoryLinkPK != null) || (this.productCategoryLinkPK != null && !this.productCategoryLinkPK.equals(other.productCategoryLinkPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductCategoryLink[ productCategoryLinkPK=" + productCategoryLinkPK + " ]";
    }
    
}
