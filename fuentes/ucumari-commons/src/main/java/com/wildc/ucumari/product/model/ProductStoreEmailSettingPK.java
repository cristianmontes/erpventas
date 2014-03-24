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
public class ProductStoreEmailSettingPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PRODUCT_STORE_ID")
    private String productStoreId;
    @Basic(optional = false)
    @Column(name = "EMAIL_TYPE")
    private String emailType;

    public ProductStoreEmailSettingPK() {
    }

    public ProductStoreEmailSettingPK(String productStoreId, String emailType) {
        this.productStoreId = productStoreId;
        this.emailType = emailType;
    }

    public String getProductStoreId() {
        return productStoreId;
    }

    public void setProductStoreId(String productStoreId) {
        this.productStoreId = productStoreId;
    }

    public String getEmailType() {
        return emailType;
    }

    public void setEmailType(String emailType) {
        this.emailType = emailType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productStoreId != null ? productStoreId.hashCode() : 0);
        hash += (emailType != null ? emailType.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductStoreEmailSettingPK)) {
            return false;
        }
        ProductStoreEmailSettingPK other = (ProductStoreEmailSettingPK) object;
        if ((this.productStoreId == null && other.productStoreId != null) || (this.productStoreId != null && !this.productStoreId.equals(other.productStoreId))) {
            return false;
        }
        if ((this.emailType == null && other.emailType != null) || (this.emailType != null && !this.emailType.equals(other.emailType))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductStoreEmailSettingPK[ productStoreId=" + productStoreId + ", emailType=" + emailType + " ]";
    }
    
}
