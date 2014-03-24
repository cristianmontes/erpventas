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
public class ProductPriceActionPK implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 6414323201278646273L;
	@Basic(optional = false)
    @Column(name = "PRODUCT_PRICE_RULE_ID")
    private String productPriceRuleId;
    @Basic(optional = false)
    @Column(name = "PRODUCT_PRICE_ACTION_SEQ_ID")
    private String productPriceActionSeqId;

    public ProductPriceActionPK() {
    }

    public ProductPriceActionPK(String productPriceRuleId, String productPriceActionSeqId) {
        this.productPriceRuleId = productPriceRuleId;
        this.productPriceActionSeqId = productPriceActionSeqId;
    }

    public String getProductPriceRuleId() {
        return productPriceRuleId;
    }

    public void setProductPriceRuleId(String productPriceRuleId) {
        this.productPriceRuleId = productPriceRuleId;
    }

    public String getProductPriceActionSeqId() {
        return productPriceActionSeqId;
    }

    public void setProductPriceActionSeqId(String productPriceActionSeqId) {
        this.productPriceActionSeqId = productPriceActionSeqId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productPriceRuleId != null ? productPriceRuleId.hashCode() : 0);
        hash += (productPriceActionSeqId != null ? productPriceActionSeqId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductPriceActionPK)) {
            return false;
        }
        ProductPriceActionPK other = (ProductPriceActionPK) object;
        if ((this.productPriceRuleId == null && other.productPriceRuleId != null) || (this.productPriceRuleId != null && !this.productPriceRuleId.equals(other.productPriceRuleId))) {
            return false;
        }
        if ((this.productPriceActionSeqId == null && other.productPriceActionSeqId != null) || (this.productPriceActionSeqId != null && !this.productPriceActionSeqId.equals(other.productPriceActionSeqId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductPriceActionPK[ productPriceRuleId=" + productPriceRuleId + ", productPriceActionSeqId=" + productPriceActionSeqId + " ]";
    }
    
}
