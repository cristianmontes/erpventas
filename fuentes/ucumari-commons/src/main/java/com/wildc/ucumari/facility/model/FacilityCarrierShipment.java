/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.facility.model;

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
@Table(name = "facility_carrier_shipment")
@NamedQueries({
    @NamedQuery(name = "FacilityCarrierShipment.findAll", query = "SELECT f FROM FacilityCarrierShipment f")})
public class FacilityCarrierShipment implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FacilityCarrierShipmentPK facilityCarrierShipmentPK;
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
    @JoinColumn(name = "FACILITY_ID", referencedColumnName = "FACILITY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Facility facility;

    public FacilityCarrierShipment() {
    }

    public FacilityCarrierShipment(FacilityCarrierShipmentPK facilityCarrierShipmentPK) {
        this.facilityCarrierShipmentPK = facilityCarrierShipmentPK;
    }

    public FacilityCarrierShipment(String facilityId, String partyId, String roleTypeId, String shipmentMethodTypeId) {
        this.facilityCarrierShipmentPK = new FacilityCarrierShipmentPK(facilityId, partyId, roleTypeId, shipmentMethodTypeId);
    }

    public FacilityCarrierShipmentPK getFacilityCarrierShipmentPK() {
        return facilityCarrierShipmentPK;
    }

    public void setFacilityCarrierShipmentPK(FacilityCarrierShipmentPK facilityCarrierShipmentPK) {
        this.facilityCarrierShipmentPK = facilityCarrierShipmentPK;
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

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (facilityCarrierShipmentPK != null ? facilityCarrierShipmentPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FacilityCarrierShipment)) {
            return false;
        }
        FacilityCarrierShipment other = (FacilityCarrierShipment) object;
        if ((this.facilityCarrierShipmentPK == null && other.facilityCarrierShipmentPK != null) || (this.facilityCarrierShipmentPK != null && !this.facilityCarrierShipmentPK.equals(other.facilityCarrierShipmentPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.FacilityCarrierShipment[ facilityCarrierShipmentPK=" + facilityCarrierShipmentPK + " ]";
    }
    
}
