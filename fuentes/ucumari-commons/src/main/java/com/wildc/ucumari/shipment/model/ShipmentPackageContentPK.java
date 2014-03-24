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
public class ShipmentPackageContentPK implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Basic(optional = false)
    @Column(name = "SHIPMENT_ID")
    private String shipmentId;
    @Basic(optional = false)
    @Column(name = "SHIPMENT_PACKAGE_SEQ_ID")
    private String shipmentPackageSeqId;
    @Basic(optional = false)
    @Column(name = "SHIPMENT_ITEM_SEQ_ID")
    private String shipmentItemSeqId;

    public ShipmentPackageContentPK() {
    }

    public ShipmentPackageContentPK(String shipmentId, String shipmentPackageSeqId, String shipmentItemSeqId) {
        this.shipmentId = shipmentId;
        this.shipmentPackageSeqId = shipmentPackageSeqId;
        this.shipmentItemSeqId = shipmentItemSeqId;
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

    public String getShipmentItemSeqId() {
        return shipmentItemSeqId;
    }

    public void setShipmentItemSeqId(String shipmentItemSeqId) {
        this.shipmentItemSeqId = shipmentItemSeqId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (shipmentId != null ? shipmentId.hashCode() : 0);
        hash += (shipmentPackageSeqId != null ? shipmentPackageSeqId.hashCode() : 0);
        hash += (shipmentItemSeqId != null ? shipmentItemSeqId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ShipmentPackageContentPK)) {
            return false;
        }
        ShipmentPackageContentPK other = (ShipmentPackageContentPK) object;
        if ((this.shipmentId == null && other.shipmentId != null) || (this.shipmentId != null && !this.shipmentId.equals(other.shipmentId))) {
            return false;
        }
        if ((this.shipmentPackageSeqId == null && other.shipmentPackageSeqId != null) || (this.shipmentPackageSeqId != null && !this.shipmentPackageSeqId.equals(other.shipmentPackageSeqId))) {
            return false;
        }
        if ((this.shipmentItemSeqId == null && other.shipmentItemSeqId != null) || (this.shipmentItemSeqId != null && !this.shipmentItemSeqId.equals(other.shipmentItemSeqId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ShipmentPackageContentPK[ shipmentId=" + shipmentId + ", shipmentPackageSeqId=" + shipmentPackageSeqId + ", shipmentItemSeqId=" + shipmentItemSeqId + " ]";
    }
    
}
