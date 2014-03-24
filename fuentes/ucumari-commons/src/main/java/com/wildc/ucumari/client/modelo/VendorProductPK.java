/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class VendorProductPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PRODUCT_ID")
    private String productId;
    @Basic(optional = false)
    @Column(name = "VENDOR_PARTY_ID")
    private String vendorPartyId;
    @Basic(optional = false)
    @Column(name = "PRODUCT_STORE_GROUP_ID")
    private String productStoreGroupId;

    public VendorProductPK() {
    }

    public VendorProductPK(String productId, String vendorPartyId, String productStoreGroupId) {
        this.productId = productId;
        this.vendorPartyId = vendorPartyId;
        this.productStoreGroupId = productStoreGroupId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getVendorPartyId() {
        return vendorPartyId;
    }

    public void setVendorPartyId(String vendorPartyId) {
        this.vendorPartyId = vendorPartyId;
    }

    public String getProductStoreGroupId() {
        return productStoreGroupId;
    }

    public void setProductStoreGroupId(String productStoreGroupId) {
        this.productStoreGroupId = productStoreGroupId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productId != null ? productId.hashCode() : 0);
        hash += (vendorPartyId != null ? vendorPartyId.hashCode() : 0);
        hash += (productStoreGroupId != null ? productStoreGroupId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VendorProductPK)) {
            return false;
        }
        VendorProductPK other = (VendorProductPK) object;
        if ((this.productId == null && other.productId != null) || (this.productId != null && !this.productId.equals(other.productId))) {
            return false;
        }
        if ((this.vendorPartyId == null && other.vendorPartyId != null) || (this.vendorPartyId != null && !this.vendorPartyId.equals(other.vendorPartyId))) {
            return false;
        }
        if ((this.productStoreGroupId == null && other.productStoreGroupId != null) || (this.productStoreGroupId != null && !this.productStoreGroupId.equals(other.productStoreGroupId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.VendorProductPK[ productId=" + productId + ", vendorPartyId=" + vendorPartyId + ", productStoreGroupId=" + productStoreGroupId + " ]";
    }
    
}
