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
public class ShipmentPackageRouteSegPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "SHIPMENT_ID")
    private String shipmentId;
    @Basic(optional = false)
    @Column(name = "SHIPMENT_PACKAGE_SEQ_ID")
    private String shipmentPackageSeqId;
    @Basic(optional = false)
    @Column(name = "SHIPMENT_ROUTE_SEGMENT_ID")
    private String shipmentRouteSegmentId;

    public ShipmentPackageRouteSegPK() {
    }

    public ShipmentPackageRouteSegPK(String shipmentId, String shipmentPackageSeqId, String shipmentRouteSegmentId) {
        this.shipmentId = shipmentId;
        this.shipmentPackageSeqId = shipmentPackageSeqId;
        this.shipmentRouteSegmentId = shipmentRouteSegmentId;
    }

    public String getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }

    public String getShipmentPackageSeqId() {
        return shipmentPackageSeqId;
    }

    public void setShipmentPackageSeqId(String shipmentPackageSeqId) {
        this.shipmentPackageSeqId = shipmentPackageSeqId;
    }

    public String getShipmentRouteSegmentId() {
        return shipmentRouteSegmentId;
    }

    public void setShipmentRouteSegmentId(String shipmentRouteSegmentId) {
        this.shipmentRouteSegmentId = shipmentRouteSegmentId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (shipmentId != null ? shipmentId.hashCode() : 0);
        hash += (shipmentPackageSeqId != null ? shipmentPackageSeqId.hashCode() : 0);
        hash += (shipmentRouteSegmentId != null ? shipmentRouteSegmentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ShipmentPackageRouteSegPK)) {
            return false;
        }
        ShipmentPackageRouteSegPK other = (ShipmentPackageRouteSegPK) object;
        if ((this.shipmentId == null && other.shipmentId != null) || (this.shipmentId != null && !this.shipmentId.equals(other.shipmentId))) {
            return false;
        }
        if ((this.shipmentPackageSeqId == null && other.shipmentPackageSeqId != null) || (this.shipmentPackageSeqId != null && !this.shipmentPackageSeqId.equals(other.shipmentPackageSeqId))) {
            return false;
        }
        if ((this.shipmentRouteSegmentId == null && other.shipmentRouteSegmentId != null) || (this.shipmentRouteSegmentId != null && !this.shipmentRouteSegmentId.equals(other.shipmentRouteSegmentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ShipmentPackageRouteSegPK[ shipmentId=" + shipmentId + ", shipmentPackageSeqId=" + shipmentPackageSeqId + ", shipmentRouteSegmentId=" + shipmentRouteSegmentId + " ]";
    }
    
}
