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
public class ProductPriceCondPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PRODUCT_PRICE_RULE_ID")
    private String productPriceRuleId;
    @Basic(optional = false)
    @Column(name = "PRODUCT_PRICE_COND_SEQ_ID")
    private String productPriceCondSeqId;

    public ProductPriceCondPK() {
    }

    public ProductPriceCondPK(String productPriceRuleId, String productPriceCondSeqId) {
        this.productPriceRuleId = productPriceRuleId;
        this.productPriceCondSeqId = productPriceCondSeqId;
    }

    public String getProductPriceRuleId() {
        return productPriceRuleId;
    }

    public void setProductPriceRuleId(String productPriceRuleId) {
        this.productPriceRuleId = productPriceRuleId;
    }

    public String getProductPriceCondSeqId() {
        return productPriceCondSeqId;
    }

    public void setProductPriceCondSeqId(String productPriceCondSeqId) {
        this.productPriceCondSeqId = productPriceCondSeqId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productPriceRuleId != null ? productPriceRuleId.hashCode() : 0);
        hash += (productPriceCondSeqId != null ? productPriceCondSeqId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductPriceCondPK)) {
            return false;
        }
        ProductPriceCondPK other = (ProductPriceCondPK) object;
        if ((this.productPriceRuleId == null && other.productPriceRuleId != null) || (this.productPriceRuleId != null && !this.productPriceRuleId.equals(other.productPriceRuleId))) {
            return false;
        }
        if ((this.productPriceCondSeqId == null && other.productPriceCondSeqId != null) || (this.productPriceCondSeqId != null && !this.productPriceCondSeqId.equals(other.productPriceCondSeqId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductPriceCondPK[ productPriceRuleId=" + productPriceRuleId + ", productPriceCondSeqId=" + productPriceCondSeqId + " ]";
    }
    
}
