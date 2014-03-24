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
import javax.persistence.JoinColumns;
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
@Table(name = "facility_location_geo_point")
@NamedQueries({
    @NamedQuery(name = "FacilityLocationGeoPoint.findAll", query = "SELECT f FROM FacilityLocationGeoPoint f")})
public class FacilityLocationGeoPoint implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FacilityLocationGeoPointPK facilityLocationGeoPointPK;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
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
    @JoinColumns({
        @JoinColumn(name = "FACILITY_ID", referencedColumnName = "FACILITY_ID", insertable = false, updatable = false),
        @JoinColumn(name = "LOCATION_SEQ_ID", referencedColumnName = "LOCATION_SEQ_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private FacilityLocation facilityLocation;

    public FacilityLocationGeoPoint() {
    }

    public FacilityLocationGeoPoint(FacilityLocationGeoPointPK facilityLocationGeoPointPK) {
        this.facilityLocationGeoPointPK = facilityLocationGeoPointPK;
    }

    public FacilityLocationGeoPoint(String facilityId, String locationSeqId, String geoPointId, Date fromDate) {
        this.facilityLocationGeoPointPK = new FacilityLocationGeoPointPK(facilityId, locationSeqId, geoPointId, fromDate);
    }

    public FacilityLocationGeoPointPK getFacilityLocationGeoPointPK() {
        return facilityLocationGeoPointPK;
    }

    public void setFacilityLocationGeoPointPK(FacilityLocationGeoPointPK facilityLocationGeoPointPK) {
        this.facilityLocationGeoPointPK = facilityLocationGeoPointPK;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
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

    public FacilityLocation getFacilityLocation() {
        return facilityLocation;
    }

    public void setFacilityLocation(FacilityLocation facilityLocation) {
        this.facilityLocation = facilityLocation;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (facilityLocationGeoPointPK != null ? facilityLocationGeoPointPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FacilityLocationGeoPoint)) {
            return false;
        }
        FacilityLocationGeoPoint other = (FacilityLocationGeoPoint) object;
        if ((this.facilityLocationGeoPointPK == null && other.facilityLocationGeoPointPK != null) || (this.facilityLocationGeoPointPK != null && !this.facilityLocationGeoPointPK.equals(other.facilityLocationGeoPointPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.FacilityLocationGeoPoint[ facilityLocationGeoPointPK=" + facilityLocationGeoPointPK + " ]";
    }
    
}
