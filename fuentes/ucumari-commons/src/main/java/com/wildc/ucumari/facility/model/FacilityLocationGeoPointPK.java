/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.facility.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Embeddable
public class FacilityLocationGeoPointPK implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 2591022558344872401L;
	@Basic(optional = false)
    @Column(name = "FACILITY_ID")
    private String facilityId;
    @Basic(optional = false)
    @Column(name = "LOCATION_SEQ_ID")
    private String locationSeqId;
    @Basic(optional = false)
    @Column(name = "GEO_POINT_ID")
    private String geoPointId;
    @Basic(optional = false)
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;

    public FacilityLocationGeoPointPK() {
    }

    public FacilityLocationGeoPointPK(String facilityId, String locationSeqId, String geoPointId, Date fromDate) {
        this.facilityId = facilityId;
        this.locationSeqId = locationSeqId;
        this.geoPointId = geoPointId;
        this.fromDate = fromDate;
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

    public String getGeoPointId() {
        return geoPointId;
    }

    public void setGeoPointId(String geoPointId) {
        this.geoPointId = geoPointId;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (facilityId != null ? facilityId.hashCode() : 0);
        hash += (locationSeqId != null ? locationSeqId.hashCode() : 0);
        hash += (geoPointId != null ? geoPointId.hashCode() : 0);
        hash += (fromDate != null ? fromDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FacilityLocationGeoPointPK)) {
            return false;
        }
        FacilityLocationGeoPointPK other = (FacilityLocationGeoPointPK) object;
        if ((this.facilityId == null && other.facilityId != null) || (this.facilityId != null && !this.facilityId.equals(other.facilityId))) {
            return false;
        }
        if ((this.locationSeqId == null && other.locationSeqId != null) || (this.locationSeqId != null && !this.locationSeqId.equals(other.locationSeqId))) {
            return false;
        }
        if ((this.geoPointId == null && other.geoPointId != null) || (this.geoPointId != null && !this.geoPointId.equals(other.geoPointId))) {
            return false;
        }
        if ((this.fromDate == null && other.fromDate != null) || (this.fromDate != null && !this.fromDate.equals(other.fromDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.FacilityLocationGeoPointPK[ facilityId=" + facilityId + ", locationSeqId=" + locationSeqId + ", geoPointId=" + geoPointId + ", fromDate=" + fromDate + " ]";
    }
    
}
