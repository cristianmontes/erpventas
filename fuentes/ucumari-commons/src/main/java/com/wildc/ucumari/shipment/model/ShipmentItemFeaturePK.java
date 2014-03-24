/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.shipment.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class ShipmentItemFeaturePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "SHIPMENT_ID")
    private String shipmentId;
    @Basic(optional = false)
    @Column(name = "SHIPMENT_ITEM_SEQ_ID")
    private String shipmentItemSeqId;
    @Basic(optional = false)
    @Column(name = "PRODUCT_FEATURE_ID")
    private String productFeatureId;

    public ShipmentItemFeaturePK() {
    }

    public ShipmentItemFeaturePK(String shipmentId, String shipmentItemSeqId, String productFeatureId) {
        this.shipmentId = shipmentId;
        this.shipmentItemSeqId = shipmentItemSeqId;
        this.productFeatureId = productFeatureId;
    }

    public String getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }

    public String getShipmentItemSeqId() {
        return shipmentItemSeqId;
    }

    public void setShipmentItemSeqId(String shipmentItemSeqId) {
        this.shipmentItemSeqId = shipmentItemSeqId;
    }

    public String getProductFeatureId() {
        return productFeatureId;
    }

    public void setProductFeatureId(String productFeatureId) {
        this.productFeatureId = productFeatureId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (shipmentId != null ? shipmentId.hashCode() : 0);
        hash += (shipmentItemSeqId != null ? shipmentItemSeqId.hashCode() : 0);
        hash += (productFeatureId != null ? productFeatureId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ShipmentItemFeaturePK)) {
            return false;
        }
        ShipmentItemFeaturePK other = (ShipmentItemFeaturePK) object;
        if ((this.shipmentId == null && other.shipmentId != null) || (this.shipmentId != null && !this.shipmentId.equals(other.shipmentId))) {
            return false;
        }
        if ((this.shipmentItemSeqId == null && other.shipmentItemSeqId != null) || (this.shipmentItemSeqId != null && !this.shipmentItemSeqId.equals(other.shipmentItemSeqId))) {
            return false;
        }
        if ((this.productFeatureId == null && other.productFeatureId != null) || (this.productFeatureId != null && !this.productFeatureId.equals(other.productFeatureId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ShipmentItemFeaturePK[ shipmentId=" + shipmentId + ", shipmentItemSeqId=" + shipmentItemSeqId + ", productFeatureId=" + productFeatureId + " ]";
    }
    
}
