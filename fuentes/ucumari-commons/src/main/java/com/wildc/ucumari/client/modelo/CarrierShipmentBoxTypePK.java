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
public class CarrierShipmentBoxTypePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "SHIPMENT_BOX_TYPE_ID")
    private String shipmentBoxTypeId;
    @Basic(optional = false)
    @Column(name = "PARTY_ID")
    private String partyId;

    public CarrierShipmentBoxTypePK() {
    }

    public CarrierShipmentBoxTypePK(String shipmentBoxTypeId, String partyId) {
        this.shipmentBoxTypeId = shipmentBoxTypeId;
        this.partyId = partyId;
    }

    public String getShipmentBoxTypeId() {
        return shipmentBoxTypeId;
    }

    public void setShipmentBoxTypeId(String shipmentBoxTypeId) {
        this.shipmentBoxTypeId = shipmentBoxTypeId;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (shipmentBoxTypeId != null ? shipmentBoxTypeId.hashCode() : 0);
        hash += (partyId != null ? partyId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CarrierShipmentBoxTypePK)) {
            return false;
        }
        CarrierShipmentBoxTypePK other = (CarrierShipmentBoxTypePK) object;
        if ((this.shipmentBoxTypeId == null && other.shipmentBoxTypeId != null) || (this.shipmentBoxTypeId != null && !this.shipmentBoxTypeId.equals(other.shipmentBoxTypeId))) {
            return false;
        }
        if ((this.partyId == null && other.partyId != null) || (this.partyId != null && !this.partyId.equals(other.partyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.CarrierShipmentBoxTypePK[ shipmentBoxTypeId=" + shipmentBoxTypeId + ", partyId=" + partyId + " ]";
    }
    
}
