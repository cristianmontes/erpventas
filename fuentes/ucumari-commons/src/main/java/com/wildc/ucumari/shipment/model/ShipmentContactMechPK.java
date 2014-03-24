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
public class ShipmentContactMechPK implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Basic(optional = false)
    @Column(name = "SHIPMENT_ID")
    private String shipmentId;
    @Basic(optional = false)
    @Column(name = "SHIPMENT_CONTACT_MECH_TYPE_ID")
    private String shipmentContactMechTypeId;

    public ShipmentContactMechPK() {
    }

    public ShipmentContactMechPK(String shipmentId, String shipmentContactMechTypeId) {
        this.shipmentId = shipmentId;
        this.shipmentContactMechTypeId = shipmentContactMechTypeId;
    }

    public String getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }

    public String getShipmentContactMechTypeId() {
        return shipmentContactMechTypeId;
    }

    public void setShipmentContactMechTypeId(String shipmentContactMechTypeId) {
        this.shipmentContactMechTypeId = shipmentContactMechTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (shipmentId != null ? shipmentId.hashCode() : 0);
        hash += (shipmentContactMechTypeId != null ? shipmentContactMechTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ShipmentContactMechPK)) {
            return false;
        }
        ShipmentContactMechPK other = (ShipmentContactMechPK) object;
        if ((this.shipmentId == null && other.shipmentId != null) || (this.shipmentId != null && !this.shipmentId.equals(other.shipmentId))) {
            return false;
        }
        if ((this.shipmentContactMechTypeId == null && other.shipmentContactMechTypeId != null) || (this.shipmentContactMechTypeId != null && !this.shipmentContactMechTypeId.equals(other.shipmentContactMechTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ShipmentContactMechPK[ shipmentId=" + shipmentId + ", shipmentContactMechTypeId=" + shipmentContactMechTypeId + " ]";
    }
    
}
