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
public class CarrierShipmentMethodPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "SHIPMENT_METHOD_TYPE_ID")
    private String shipmentMethodTypeId;
    @Basic(optional = false)
    @Column(name = "PARTY_ID")
    private String partyId;
    @Basic(optional = false)
    @Column(name = "ROLE_TYPE_ID")
    private String roleTypeId;

    public CarrierShipmentMethodPK() {
    }

    public CarrierShipmentMethodPK(String shipmentMethodTypeId, String partyId, String roleTypeId) {
        this.shipmentMethodTypeId = shipmentMethodTypeId;
        this.partyId = partyId;
        this.roleTypeId = roleTypeId;
    }

    public String getShipmentMethodTypeId() {
        return shipmentMethodTypeId;
    }

    public void setShipmentMethodTypeId(String shipmentMethodTypeId) {
        this.shipmentMethodTypeId = shipmentMethodTypeId;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public String getRoleTypeId() {
        return roleTypeId;
    }

    public void setRoleTypeId(String roleTypeId) {
        this.roleTypeId = roleTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (shipmentMethodTypeId != null ? shipmentMethodTypeId.hashCode() : 0);
        hash += (partyId != null ? partyId.hashCode() : 0);
        hash += (roleTypeId != null ? roleTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CarrierShipmentMethodPK)) {
            return false;
        }
        CarrierShipmentMethodPK other = (CarrierShipmentMethodPK) object;
        if ((this.shipmentMethodTypeId == null && other.shipmentMethodTypeId != null) || (this.shipmentMethodTypeId != null && !this.shipmentMethodTypeId.equals(other.shipmentMethodTypeId))) {
            return false;
        }
        if ((this.partyId == null && other.partyId != null) || (this.partyId != null && !this.partyId.equals(other.partyId))) {
            return false;
        }
        if ((this.roleTypeId == null && other.roleTypeId != null) || (this.roleTypeId != null && !this.roleTypeId.equals(other.roleTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.CarrierShipmentMethodPK[ shipmentMethodTypeId=" + shipmentMethodTypeId + ", partyId=" + partyId + ", roleTypeId=" + roleTypeId + " ]";
    }
    
}
