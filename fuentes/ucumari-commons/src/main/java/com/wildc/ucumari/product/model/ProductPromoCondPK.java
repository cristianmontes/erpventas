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
public class ProductPromoCondPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PRODUCT_PROMO_ID")
    private String productPromoId;
    @Basic(optional = false)
    @Column(name = "PRODUCT_PROMO_RULE_ID")
    private String productPromoRuleId;
    @Basic(optional = false)
    @Column(name = "PRODUCT_PROMO_COND_SEQ_ID")
    private String productPromoCondSeqId;

    public ProductPromoCondPK() {
    }

    public ProductPromoCondPK(String productPromoId, String productPromoRuleId, String productPromoCondSeqId) {
        this.productPromoId = productPromoId;
        this.productPromoRuleId = productPromoRuleId;
        this.productPromoCondSeqId = productPromoCondSeqId;
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

    public String getProductPromoCondSeqId() {
        return productPromoCondSeqId;
    }

    public void setProductPromoCondSeqId(String productPromoCondSeqId) {
        this.productPromoCondSeqId = productPromoCondSeqId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productPromoId != null ? productPromoId.hashCode() : 0);
        hash += (productPromoRuleId != null ? productPromoRuleId.hashCode() : 0);
        hash += (productPromoCondSeqId != null ? productPromoCondSeqId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductPromoCondPK)) {
            return false;
        }
        ProductPromoCondPK other = (ProductPromoCondPK) object;
        if ((this.productPromoId == null && other.productPromoId != null) || (this.productPromoId != null && !this.productPromoId.equals(other.productPromoId))) {
            return false;
        }
        if ((this.productPromoRuleId == null && other.productPromoRuleId != null) || (this.productPromoRuleId != null && !this.productPromoRuleId.equals(other.productPromoRuleId))) {
            return false;
        }
        if ((this.productPromoCondSeqId == null && other.productPromoCondSeqId != null) || (this.productPromoCondSeqId != null && !this.productPromoCondSeqId.equals(other.productPromoCondSeqId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductPromoCondPK[ productPromoId=" + productPromoId + ", productPromoRuleId=" + productPromoRuleId + ", productPromoCondSeqId=" + productPromoCondSeqId + " ]";
    }
    
}
