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
public class ShipmentPackagePK implements Serializable {
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

    public ShipmentPackagePK() {
    }

    public ShipmentPackagePK(String shipmentId, String shipmentPackageSeqId) {
        this.shipmentId = shipmentId;
        this.shipmentPackageSeqId = shipmentPackageSeqId;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (shipmentId != null ? shipmentId.hashCode() : 0);
        hash += (shipmentPackageSeqId != null ? shipmentPackageSeqId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ShipmentPackagePK)) {
            return false;
        }
        ShipmentPackagePK other = (ShipmentPackagePK) object;
        if ((this.shipmentId == null && other.shipmentId != null) || (this.shipmentId != null && !this.shipmentId.equals(other.shipmentId))) {
            return false;
        }
        if ((this.shipmentPackageSeqId == null && other.shipmentPackageSeqId != null) || (this.shipmentPackageSeqId != null && !this.shipmentPackageSeqId.equals(other.shipmentPackageSeqId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ShipmentPackagePK[ shipmentId=" + shipmentId + ", shipmentPackageSeqId=" + shipmentPackageSeqId + " ]";
    }
    
}
