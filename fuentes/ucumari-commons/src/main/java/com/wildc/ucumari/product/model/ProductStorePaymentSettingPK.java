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
public class ProductStorePaymentSettingPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PRODUCT_STORE_ID")
    private String productStoreId;
    @Basic(optional = false)
    @Column(name = "PAYMENT_METHOD_TYPE_ID")
    private String paymentMethodTypeId;
    @Basic(optional = false)
    @Column(name = "PAYMENT_SERVICE_TYPE_ENUM_ID")
    private String paymentServiceTypeEnumId;

    public ProductStorePaymentSettingPK() {
    }

    public ProductStorePaymentSettingPK(String productStoreId, String paymentMethodTypeId, String paymentServiceTypeEnumId) {
        this.productStoreId = productStoreId;
        this.paymentMethodTypeId = paymentMethodTypeId;
        this.paymentServiceTypeEnumId = paymentServiceTypeEnumId;
    }

    public String getProductStoreId() {
        return productStoreId;
    }

    public void setProductStoreId(String productStoreId) {
        this.productStoreId = productStoreId;
    }

    public String getPaymentMethodTypeId() {
        return paymentMethodTypeId;
    }

    public void setPaymentMethodTypeId(String paymentMethodTypeId) {
        this.paymentMethodTypeId = paymentMethodTypeId;
    }

    public String getPaymentServiceTypeEnumId() {
        return paymentServiceTypeEnumId;
    }

    public void setPaymentServiceTypeEnumId(String paymentServiceTypeEnumId) {
        this.paymentServiceTypeEnumId = paymentServiceTypeEnumId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productStoreId != null ? productStoreId.hashCode() : 0);
        hash += (paymentMethodTypeId != null ? paymentMethodTypeId.hashCode() : 0);
        hash += (paymentServiceTypeEnumId != null ? paymentServiceTypeEnumId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductStorePaymentSettingPK)) {
            return false;
        }
        ProductStorePaymentSettingPK other = (ProductStorePaymentSettingPK) object;
        if ((this.productStoreId == null && other.productStoreId != null) || (this.productStoreId != null && !this.productStoreId.equals(other.productStoreId))) {
            return false;
        }
        if ((this.paymentMethodTypeId == null && other.paymentMethodTypeId != null) || (this.paymentMethodTypeId != null && !this.paymentMethodTypeId.equals(other.paymentMethodTypeId))) {
            return false;
        }
        if ((this.paymentServiceTypeEnumId == null && other.paymentServiceTypeEnumId != null) || (this.paymentServiceTypeEnumId != null && !this.paymentServiceTypeEnumId.equals(other.paymentServiceTypeEnumId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductStorePaymentSettingPK[ productStoreId=" + productStoreId + ", paymentMethodTypeId=" + paymentMethodTypeId + ", paymentServiceTypeEnumId=" + paymentServiceTypeEnumId + " ]";
    }
    
}
