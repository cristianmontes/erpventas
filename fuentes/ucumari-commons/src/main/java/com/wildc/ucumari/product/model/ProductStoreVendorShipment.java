/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.product.model;

import com.wildc.ucumari.party.model.Party;
import com.wildc.ucumari.shipment.model.ShipmentMethodType;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "product_store_vendor_shipment")
@NamedQueries({
    @NamedQuery(name = "ProductStoreVendorShipment.findAll", query = "SELECT p FROM ProductStoreVendorShipment p")})
public class ProductStoreVendorShipment implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductStoreVendorShipmentPK productStoreVendorShipmentPK;
    @Column(name = "LAST_UPDATED_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdatedStamp;
    @Column(name = "LAST_UPDATED_TX_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdatedTxStamp;
    @Column(name = "CREATED_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdStamp;
    @Column(name = "CREATED_TX_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdTxStamp;
    @JoinColumn(name = "VENDOR_PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Party party;
    @JoinColumn(name = "SHIPMENT_METHOD_TYPE_ID", referencedColumnName = "SHIPMENT_METHOD_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ShipmentMethodType shipmentMethodType;
    @JoinColumn(name = "PRODUCT_STORE_ID", referencedColumnName = "PRODUCT_STORE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProductStore productStore;
    @JoinColumn(name = "CARRIER_PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Party party1;

    public ProductStoreVendorShipment() {
    }

    public ProductStoreVendorShipment(ProductStoreVendorShipmentPK productStoreVendorShipmentPK) {
        this.productStoreVendorShipmentPK = productStoreVendorShipmentPK;
    }

    public ProductStoreVendorShipment(String productStoreId, String vendorPartyId, String shipmentMethodTypeId, String carrierPartyId) {
        this.productStoreVendorShipmentPK = new ProductStoreVendorShipmentPK(productStoreId, vendorPartyId, shipmentMethodTypeId, carrierPartyId);
    }

    public ProductStoreVendorShipmentPK getProductStoreVendorShipmentPK() {
        return productStoreVendorShipmentPK;
    }

    public void setProductStoreVendorShipmentPK(ProductStoreVendorShipmentPK productStoreVendorShipmentPK) {
        this.productStoreVendorShipmentPK = productStoreVendorShipmentPK;
    }

    public Date getLastUpdatedStamp() {
        return lastUpdatedStamp;
    }

    public void setLastUpdatedStamp(Date lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }

    public Date getLastUpdatedTxStamp() {
        return lastUpdatedTxStamp;
    }

    public void setLastUpdatedTxStamp(Date lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }

    public Date getCreatedStamp() {
        return createdStamp;
    }

    public void setCreatedStamp(Date createdStamp) {
        this.createdStamp = createdStamp;
    }

    public Date getCreatedTxStamp() {
        return createdTxStamp;
    }

    public void setCreatedTxStamp(Date createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    public ShipmentMethodType getShipmentMethodType() {
        return shipmentMethodType;
    }

    public void setShipmentMethodType(ShipmentMethodType shipmentMethodType) {
        this.shipmentMethodType = shipmentMethodType;
    }

    public ProductStore getProductStore() {
        return productStore;
    }

    public void setProductStore(ProductStore productStore) {
        this.productStore = productStore;
    }

    public Party getParty1() {
        return party1;
    }

    public void setParty1(Party party1) {
        this.party1 = party1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productStoreVendorShipmentPK != null ? productStoreVendorShipmentPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductStoreVendorShipment)) {
            return false;
        }
        ProductStoreVendorShipment other = (ProductStoreVendorShipment) object;
        if ((this.productStoreVendorShipmentPK == null && other.productStoreVendorShipmentPK != null) || (this.productStoreVendorShipmentPK != null && !this.productStoreVendorShipmentPK.equals(other.productStoreVendorShipmentPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductStoreVendorShipment[ productStoreVendorShipmentPK=" + productStoreVendorShipmentPK + " ]";
    }
    
}
