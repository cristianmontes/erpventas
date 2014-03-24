/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.shipment.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.product.model.ProductFeature;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "shipment_item_feature")
@NamedQueries({
    @NamedQuery(name = "ShipmentItemFeature.findAll", query = "SELECT s FROM ShipmentItemFeature s")})
public class ShipmentItemFeature implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ShipmentItemFeaturePK shipmentItemFeaturePK;
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
    @JoinColumns({
        @JoinColumn(name = "SHIPMENT_ID", referencedColumnName = "SHIPMENT_ID", insertable = false, updatable = false),
        @JoinColumn(name = "SHIPMENT_ITEM_SEQ_ID", referencedColumnName = "SHIPMENT_ITEM_SEQ_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private ShipmentItem shipmentItem;
    @JoinColumn(name = "PRODUCT_FEATURE_ID", referencedColumnName = "PRODUCT_FEATURE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProductFeature productFeature;

    public ShipmentItemFeature() {
    }

    public ShipmentItemFeature(ShipmentItemFeaturePK shipmentItemFeaturePK) {
        this.shipmentItemFeaturePK = shipmentItemFeaturePK;
    }

    public ShipmentItemFeature(String shipmentId, String shipmentItemSeqId, String productFeatureId) {
        this.shipmentItemFeaturePK = new ShipmentItemFeaturePK(shipmentId, shipmentItemSeqId, productFeatureId);
    }

    public ShipmentItemFeaturePK getShipmentItemFeaturePK() {
        return shipmentItemFeaturePK;
    }

    public void setShipmentItemFeaturePK(ShipmentItemFeaturePK shipmentItemFeaturePK) {
        this.shipmentItemFeaturePK = shipmentItemFeaturePK;
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

    public ShipmentItem getShipmentItem() {
        return shipmentItem;
    }

    public void setShipmentItem(ShipmentItem shipmentItem) {
        this.shipmentItem = shipmentItem;
    }

    public ProductFeature getProductFeature() {
        return productFeature;
    }

    public void setProductFeature(ProductFeature productFeature) {
        this.productFeature = productFeature;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (shipmentItemFeaturePK != null ? shipmentItemFeaturePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ShipmentItemFeature)) {
            return false;
        }
        ShipmentItemFeature other = (ShipmentItemFeature) object;
        if ((this.shipmentItemFeaturePK == null && other.shipmentItemFeaturePK != null) || (this.shipmentItemFeaturePK != null && !this.shipmentItemFeaturePK.equals(other.shipmentItemFeaturePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ShipmentItemFeature[ shipmentItemFeaturePK=" + shipmentItemFeaturePK + " ]";
    }
    
}
