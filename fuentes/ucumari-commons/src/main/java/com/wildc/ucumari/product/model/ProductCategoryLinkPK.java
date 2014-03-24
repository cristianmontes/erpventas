/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.product.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Embeddable
public class ProductCategoryLinkPK implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -4559750446658422556L;
	@Basic(optional = false)
    @Column(name = "PRODUCT_CATEGORY_ID")
    private String productCategoryId;
    @Basic(optional = false)
    @Column(name = "LINK_SEQ_ID")
    private String linkSeqId;
    @Basic(optional = false)
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;

    public ProductCategoryLinkPK() {
    }

    public ProductCategoryLinkPK(String productCategoryId, String linkSeqId, Date fromDate) {
        this.productCategoryId = productCategoryId;
        this.linkSeqId = linkSeqId;
        this.fromDate = fromDate;
    }

    public String getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(String productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public String getLinkSeqId() {
        return linkSeqId;
    }

    public void setLinkSeqId(String linkSeqId) {
        this.linkSeqId = linkSeqId;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productCategoryId != null ? productCategoryId.hashCode() : 0);
        hash += (linkSeqId != null ? linkSeqId.hashCode() : 0);
        hash += (fromDate != null ? fromDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductCategoryLinkPK)) {
            return false;
        }
        ProductCategoryLinkPK other = (ProductCategoryLinkPK) object;
        if ((this.productCategoryId == null && other.productCategoryId != null) || (this.productCategoryId != null && !this.productCategoryId.equals(other.productCategoryId))) {
            return false;
        }
        if ((this.linkSeqId == null && other.linkSeqId != null) || (this.linkSeqId != null && !this.linkSeqId.equals(other.linkSeqId))) {
            return false;
        }
        if ((this.fromDate == null && other.fromDate != null) || (this.fromDate != null && !this.fromDate.equals(other.fromDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductCategoryLinkPK[ productCategoryId=" + productCategoryId + ", linkSeqId=" + linkSeqId + ", fromDate=" + fromDate + " ]";
    }
    
}
