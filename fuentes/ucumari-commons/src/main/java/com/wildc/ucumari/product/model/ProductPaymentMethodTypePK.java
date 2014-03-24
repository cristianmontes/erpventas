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
public class ProductPaymentMethodTypePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PRODUCT_ID")
    private String productId;
    @Basic(optional = false)
    @Column(name = "PAYMENT_METHOD_TYPE_ID")
    private String paymentMethodTypeId;
    @Basic(optional = false)
    @Column(name = "PRODUCT_PRICE_PURPOSE_ID")
    private String productPricePurposeId;
    @Basic(optional = false)
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;

    public ProductPaymentMethodTypePK() {
    }

    public ProductPaymentMethodTypePK(String productId, String paymentMethodTypeId, String productPricePurposeId, Date fromDate) {
        this.productId = productId;
        this.paymentMethodTypeId = paymentMethodTypeId;
        this.productPricePurposeId = productPricePurposeId;
        this.fromDate = fromDate;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getPaymentMethodTypeId() {
        return paymentMethodTypeId;
    }

    public void setPaymentMethodTypeId(String paymentMethodTypeId) {
        this.paymentMethodTypeId = paymentMethodTypeId;
    }

    public String getProductPricePurposeId() {
        return productPricePurposeId;
    }

    public void setProductPricePurposeId(String productPricePurposeId) {
        this.productPricePurposeId = productPricePurposeId;
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
        hash += (productId != null ? productId.hashCode() : 0);
        hash += (paymentMethodTypeId != null ? paymentMethodTypeId.hashCode() : 0);
        hash += (productPricePurposeId != null ? productPricePurposeId.hashCode() : 0);
        hash += (fromDate != null ? fromDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductPaymentMethodTypePK)) {
            return false;
        }
        ProductPaymentMethodTypePK other = (ProductPaymentMethodTypePK) object;
        if ((this.productId == null && other.productId != null) || (this.productId != null && !this.productId.equals(other.productId))) {
            return false;
        }
        if ((this.paymentMethodTypeId == null && other.paymentMethodTypeId != null) || (this.paymentMethodTypeId != null && !this.paymentMethodTypeId.equals(other.paymentMethodTypeId))) {
            return false;
        }
        if ((this.productPricePurposeId == null && other.productPricePurposeId != null) || (this.productPricePurposeId != null && !this.productPricePurposeId.equals(other.productPricePurposeId))) {
            return false;
        }
        if ((this.fromDate == null && other.fromDate != null) || (this.fromDate != null && !this.fromDate.equals(other.fromDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductPaymentMethodTypePK[ productId=" + productId + ", paymentMethodTypeId=" + paymentMethodTypeId + ", productPricePurposeId=" + productPricePurposeId + ", fromDate=" + fromDate + " ]";
    }
    
}
