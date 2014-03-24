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
public class ProductStoreFinActSettingPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PRODUCT_STORE_ID")
    private String productStoreId;
    @Basic(optional = false)
    @Column(name = "FIN_ACCOUNT_TYPE_ID")
    private String finAccountTypeId;

    public ProductStoreFinActSettingPK() {
    }

    public ProductStoreFinActSettingPK(String productStoreId, String finAccountTypeId) {
        this.productStoreId = productStoreId;
        this.finAccountTypeId = finAccountTypeId;
    }

    public String getProductStoreId() {
        return productStoreId;
    }

    public void setProductStoreId(String productStoreId) {
        this.productStoreId = productStoreId;
    }

    public String getFinAccountTypeId() {
        return finAccountTypeId;
    }

    public void setFinAccountTypeId(String finAccountTypeId) {
        this.finAccountTypeId = finAccountTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productStoreId != null ? productStoreId.hashCode() : 0);
        hash += (finAccountTypeId != null ? finAccountTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductStoreFinActSettingPK)) {
            return false;
        }
        ProductStoreFinActSettingPK other = (ProductStoreFinActSettingPK) object;
        if ((this.productStoreId == null && other.productStoreId != null) || (this.productStoreId != null && !this.productStoreId.equals(other.productStoreId))) {
            return false;
        }
        if ((this.finAccountTypeId == null && other.finAccountTypeId != null) || (this.finAccountTypeId != null && !this.finAccountTypeId.equals(other.finAccountTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductStoreFinActSettingPK[ productStoreId=" + productStoreId + ", finAccountTypeId=" + finAccountTypeId + " ]";
    }
    
}
