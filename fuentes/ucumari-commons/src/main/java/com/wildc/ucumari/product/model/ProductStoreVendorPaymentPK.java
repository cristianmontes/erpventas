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
public class ProductStoreVendorPaymentPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PRODUCT_STORE_ID")
    private String productStoreId;
    @Basic(optional = false)
    @Column(name = "VENDOR_PARTY_ID")
    private String vendorPartyId;
    @Basic(optional = false)
    @Column(name = "PAYMENT_METHOD_TYPE_ID")
    private String paymentMethodTypeId;
    @Basic(optional = false)
    @Column(name = "CREDIT_CARD_ENUM_ID")
    private String creditCardEnumId;

    public ProductStoreVendorPaymentPK() {
    }

    public ProductStoreVendorPaymentPK(String productStoreId, String vendorPartyId, String paymentMethodTypeId, String creditCardEnumId) {
        this.productStoreId = productStoreId;
        this.vendorPartyId = vendorPartyId;
        this.paymentMethodTypeId = paymentMethodTypeId;
        this.creditCardEnumId = creditCardEnumId;
    }

    public String getProductStoreId() {
        return productStoreId;
    }

    public void setProductStoreId(String productStoreId) {
        this.productStoreId = productStoreId;
    }

    public String getVendorPartyId() {
        return vendorPartyId;
    }

    public void setVendorPartyId(String vendorPartyId) {
        this.vendorPartyId = vendorPartyId;
    }

    public String getPaymentMethodTypeId() {
        return paymentMethodTypeId;
    }

    public void setPaymentMethodTypeId(String paymentMethodTypeId) {
        this.paymentMethodTypeId = paymentMethodTypeId;
    }

    public String getCreditCardEnumId() {
        return creditCardEnumId;
    }

    public void setCreditCardEnumId(String creditCardEnumId) {
        this.creditCardEnumId = creditCardEnumId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productStoreId != null ? productStoreId.hashCode() : 0);
        hash += (vendorPartyId != null ? vendorPartyId.hashCode() : 0);
        hash += (paymentMethodTypeId != null ? paymentMethodTypeId.hashCode() : 0);
        hash += (creditCardEnumId != null ? creditCardEnumId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductStoreVendorPaymentPK)) {
            return false;
        }
        ProductStoreVendorPaymentPK other = (ProductStoreVendorPaymentPK) object;
        if ((this.productStoreId == null && other.productStoreId != null) || (this.productStoreId != null && !this.productStoreId.equals(other.productStoreId))) {
            return false;
        }
        if ((this.vendorPartyId == null && other.vendorPartyId != null) || (this.vendorPartyId != null && !this.vendorPartyId.equals(other.vendorPartyId))) {
            return false;
        }
        if ((this.paymentMethodTypeId == null && other.paymentMethodTypeId != null) || (this.paymentMethodTypeId != null && !this.paymentMethodTypeId.equals(other.paymentMethodTypeId))) {
            return false;
        }
        if ((this.creditCardEnumId == null && other.creditCardEnumId != null) || (this.creditCardEnumId != null && !this.creditCardEnumId.equals(other.creditCardEnumId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductStoreVendorPaymentPK[ productStoreId=" + productStoreId + ", vendorPartyId=" + vendorPartyId + ", paymentMethodTypeId=" + paymentMethodTypeId + ", creditCardEnumId=" + creditCardEnumId + " ]";
    }
    
}
