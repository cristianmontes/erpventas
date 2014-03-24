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
public class WarehouseDefaultBoxTypePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "FACILITY_ID")
    private String facilityId;
    @Basic(optional = false)
    @Column(name = "PARTY_ID")
    private String partyId;

    public WarehouseDefaultBoxTypePK() {
    }

    public WarehouseDefaultBoxTypePK(String facilityId, String partyId) {
        this.facilityId = facilityId;
        this.partyId = partyId;
    }

    public String getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
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
        hash += (facilityId != null ? facilityId.hashCode() : 0);
        hash += (partyId != null ? partyId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WarehouseDefaultBoxTypePK)) {
            return false;
        }
        WarehouseDefaultBoxTypePK other = (WarehouseDefaultBoxTypePK) object;
        if ((this.facilityId == null && other.facilityId != null) || (this.facilityId != null && !this.facilityId.equals(other.facilityId))) {
            return false;
        }
        if ((this.partyId == null && other.partyId != null) || (this.partyId != null && !this.partyId.equals(other.partyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.WarehouseDefaultBoxTypePK[ facilityId=" + facilityId + ", partyId=" + partyId + " ]";
    }
    
}
