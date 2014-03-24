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
public class ProductStoreVendorShipmentPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PRODUCT_STORE_ID")
    private String productStoreId;
    @Basic(optional = false)
    @Column(name = "VENDOR_PARTY_ID")
    private String vendorPartyId;
    @Basic(optional = false)
    @Column(name = "SHIPMENT_METHOD_TYPE_ID")
    private String shipmentMethodTypeId;
    @Basic(optional = false)
    @Column(name = "CARRIER_PARTY_ID")
    private String carrierPartyId;

    public ProductStoreVendorShipmentPK() {
    }

    public ProductStoreVendorShipmentPK(String productStoreId, String vendorPartyId, String shipmentMethodTypeId, String carrierPartyId) {
        this.productStoreId = productStoreId;
        this.vendorPartyId = vendorPartyId;
        this.shipmentMethodTypeId = shipmentMethodTypeId;
        this.carrierPartyId = carrierPartyId;
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

    public String getShipmentMethodTypeId() {
        return shipmentMethodTypeId;
    }

    public void setShipmentMethodTypeId(String shipmentMethodTypeId) {
        this.shipmentMethodTypeId = shipmentMethodTypeId;
    }

    public String getCarrierPartyId() {
        return carrierPartyId;
    }

    public void setCarrierPartyId(String carrierPartyId) {
        this.carrierPartyId = carrierPartyId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productStoreId != null ? productStoreId.hashCode() : 0);
        hash += (vendorPartyId != null ? vendorPartyId.hashCode() : 0);
        hash += (shipmentMethodTypeId != null ? shipmentMethodTypeId.hashCode() : 0);
        hash += (carrierPartyId != null ? carrierPartyId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductStoreVendorShipmentPK)) {
            return false;
        }
        ProductStoreVendorShipmentPK other = (ProductStoreVendorShipmentPK) object;
        if ((this.productStoreId == null && other.productStoreId != null) || (this.productStoreId != null && !this.productStoreId.equals(other.productStoreId))) {
            return false;
        }
        if ((this.vendorPartyId == null && other.vendorPartyId != null) || (this.vendorPartyId != null && !this.vendorPartyId.equals(other.vendorPartyId))) {
            return false;
        }
        if ((this.shipmentMethodTypeId == null && other.shipmentMethodTypeId != null) || (this.shipmentMethodTypeId != null && !this.shipmentMethodTypeId.equals(other.shipmentMethodTypeId))) {
            return false;
        }
        if ((this.carrierPartyId == null && other.carrierPartyId != null) || (this.carrierPartyId != null && !this.carrierPartyId.equals(other.carrierPartyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductStoreVendorShipmentPK[ productStoreId=" + productStoreId + ", vendorPartyId=" + vendorPartyId + ", shipmentMethodTypeId=" + shipmentMethodTypeId + ", carrierPartyId=" + carrierPartyId + " ]";
    }
    
}
