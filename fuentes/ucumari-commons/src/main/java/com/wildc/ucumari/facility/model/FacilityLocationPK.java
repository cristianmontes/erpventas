/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.facility.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class FacilityLocationPK implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 3748985230372419958L;
	@Basic(optional = false)
    @Column(name = "FACILITY_ID")
    private String facilityId;
    @Basic(optional = false)
    @Column(name = "LOCATION_SEQ_ID")
    private String locationSeqId;

    public FacilityLocationPK() {
    }

    public FacilityLocationPK(String facilityId, String locationSeqId) {
        this.facilityId = facilityId;
        this.locationSeqId = locationSeqId;
    }

    public String getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }

    public String getLocationSeqId() {
        return locationSeqId;
    }

    public void setLocationSeqId(String locationSeqId) {
        this.locationSeqId = locationSeqId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (facilityId != null ? facilityId.hashCode() : 0);
        hash += (locationSeqId != null ? locationSeqId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FacilityLocationPK)) {
            return false;
        }
        FacilityLocationPK other = (FacilityLocationPK) object;
        if ((this.facilityId == null && other.facilityId != null) || (this.facilityId != null && !this.facilityId.equals(other.facilityId))) {
            return false;
        }
        if ((this.locationSeqId == null && other.locationSeqId != null) || (this.locationSeqId != null && !this.locationSeqId.equals(other.locationSeqId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.FacilityLocationPK[ facilityId=" + facilityId + ", locationSeqId=" + locationSeqId + " ]";
    }
    
}
