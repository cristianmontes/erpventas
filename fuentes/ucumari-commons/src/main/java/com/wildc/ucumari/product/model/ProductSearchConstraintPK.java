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
public class ProductSearchConstraintPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PRODUCT_SEARCH_RESULT_ID")
    private String productSearchResultId;
    @Basic(optional = false)
    @Column(name = "CONSTRAINT_SEQ_ID")
    private String constraintSeqId;

    public ProductSearchConstraintPK() {
    }

    public ProductSearchConstraintPK(String productSearchResultId, String constraintSeqId) {
        this.productSearchResultId = productSearchResultId;
        this.constraintSeqId = constraintSeqId;
    }

    public String getProductSearchResultId() {
        return productSearchResultId;
    }

    public void setProductSearchResultId(String productSearchResultId) {
        this.productSearchResultId = productSearchResultId;
    }

    public String getConstraintSeqId() {
        return constraintSeqId;
    }

    public void setConstraintSeqId(String constraintSeqId) {
        this.constraintSeqId = constraintSeqId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productSearchResultId != null ? productSearchResultId.hashCode() : 0);
        hash += (constraintSeqId != null ? constraintSeqId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductSearchConstraintPK)) {
            return false;
        }
        ProductSearchConstraintPK other = (ProductSearchConstraintPK) object;
        if ((this.productSearchResultId == null && other.productSearchResultId != null) || (this.productSearchResultId != null && !this.productSearchResultId.equals(other.productSearchResultId))) {
            return false;
        }
        if ((this.constraintSeqId == null && other.constraintSeqId != null) || (this.constraintSeqId != null && !this.constraintSeqId.equals(other.constraintSeqId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductSearchConstraintPK[ productSearchResultId=" + productSearchResultId + ", constraintSeqId=" + constraintSeqId + " ]";
    }
    
}
