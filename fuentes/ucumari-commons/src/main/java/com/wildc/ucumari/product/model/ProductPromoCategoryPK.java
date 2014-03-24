/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.product.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class ProductPromoCategoryPK implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -2203387347098595953L;
	@Basic(optional = false)
    @Column(name = "PRODUCT_PROMO_ID")
    private String productPromoId;
    @Basic(optional = false)
    @Column(name = "PRODUCT_PROMO_RULE_ID")
    private String productPromoRuleId;
    @Basic(optional = false)
    @Column(name = "PRODUCT_PROMO_ACTION_SEQ_ID")
    private String productPromoActionSeqId;
    @Basic(optional = false)
    @Column(name = "PRODUCT_PROMO_COND_SEQ_ID")
    private String productPromoCondSeqId;
    @Basic(optional = false)
    @Column(name = "PRODUCT_CATEGORY_ID")
    private String productCategoryId;
    @Basic(optional = false)
    @Column(name = "AND_GROUP_ID")
    private String andGroupId;

    public ProductPromoCategoryPK() {
    }

    public ProductPromoCategoryPK(String productPromoId, String productPromoRuleId, String productPromoActionSeqId, String productPromoCondSeqId, String productCategoryId, String andGroupId) {
        this.productPromoId = productPromoId;
        this.productPromoRuleId = productPromoRuleId;
        this.productPromoActionSeqId = productPromoActionSeqId;
        this.productPromoCondSeqId = productPromoCondSeqId;
        this.productCategoryId = productCategoryId;
        this.andGroupId = andGroupId;
    }

    public String getProductPromoId() {
        return productPromoId;
    }

    public void setProductPromoId(String productPromoId) {
        this.productPromoId = productPromoId;
    }

    public String getProductPromoRuleId() {
        return productPromoRuleId;
    }

    public void setProductPromoRuleId(String productPromoRuleId) {
        this.productPromoRuleId = productPromoRuleId;
    }

    public String getProductPromoActionSeqId() {
        return productPromoActionSeqId;
    }

    public void setProductPromoActionSeqId(String productPromoActionSeqId) {
        this.productPromoActionSeqId = productPromoActionSeqId;
    }

    public String getProductPromoCondSeqId() {
        return productPromoCondSeqId;
    }

    public void setProductPromoCondSeqId(String productPromoCondSeqId) {
        this.productPromoCondSeqId = productPromoCondSeqId;
    }

    public String getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(String productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public String getAndGroupId() {
        return andGroupId;
    }

    public void setAndGroupId(String andGroupId) {
        this.andGroupId = andGroupId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productPromoId != null ? productPromoId.hashCode() : 0);
        hash += (productPromoRuleId != null ? productPromoRuleId.hashCode() : 0);
        hash += (productPromoActionSeqId != null ? productPromoActionSeqId.hashCode() : 0);
        hash += (productPromoCondSeqId != null ? productPromoCondSeqId.hashCode() : 0);
        hash += (productCategoryId != null ? productCategoryId.hashCode() : 0);
        hash += (andGroupId != null ? andGroupId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductPromoCategoryPK)) {
            return false;
        }
        ProductPromoCategoryPK other = (ProductPromoCategoryPK) object;
        if ((this.productPromoId == null && other.productPromoId != null) || (this.productPromoId != null && !this.productPromoId.equals(other.productPromoId))) {
            return false;
        }
        if ((this.productPromoRuleId == null && other.productPromoRuleId != null) || (this.productPromoRuleId != null && !this.productPromoRuleId.equals(other.productPromoRuleId))) {
            return false;
        }
        if ((this.productPromoActionSeqId == null && other.productPromoActionSeqId != null) || (this.productPromoActionSeqId != null && !this.productPromoActionSeqId.equals(other.productPromoActionSeqId))) {
            return false;
        }
        if ((this.productPromoCondSeqId == null && other.productPromoCondSeqId != null) || (this.productPromoCondSeqId != null && !this.productPromoCondSeqId.equals(other.productPromoCondSeqId))) {
            return false;
        }
        if ((this.productCategoryId == null && other.productCategoryId != null) || (this.productCategoryId != null && !this.productCategoryId.equals(other.productCategoryId))) {
            return false;
        }
        if ((this.andGroupId == null && other.andGroupId != null) || (this.andGroupId != null && !this.andGroupId.equals(other.andGroupId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductPromoCategoryPK[ productPromoId=" + productPromoId + ", productPromoRuleId=" + productPromoRuleId + ", productPromoActionSeqId=" + productPromoActionSeqId + ", productPromoCondSeqId=" + productPromoCondSeqId + ", productCategoryId=" + productCategoryId + ", andGroupId=" + andGroupId + " ]";
    }
    
}
