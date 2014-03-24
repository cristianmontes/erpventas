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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "facility_location")
public class FacilityLocation implements Serializable {
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "facilityLocation")
    private List<FacilityLocationGeoPoint> facilityLocationGeoPointList;
    */
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FacilityLocationPK facilityLocationPK;
    @Column(name = "AREA_ID")
    private String areaId;
    @Column(name = "AISLE_ID")
    private String aisleId;
    @Column(name = "SECTION_ID")
    private String sectionId;
    @Column(name = "LEVEL_ID")
    private String levelId;
    @Column(name = "POSITION_ID")
    private String positionId;
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
/*
    @JoinColumn(name = "LOCATION_TYPE_ENUM_ID", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration locationTypeEnumId;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "facilityLocation")
    private List<ProductFacilityLocation> productFacilityLocationList;
*/
    public FacilityLocation() {
    }

    public FacilityLocation(FacilityLocationPK facilityLocationPK) {
        this.facilityLocationPK = facilityLocationPK;
    }

    public FacilityLocation(String facilityId, String locationSeqId) {
        this.facilityLocationPK = new FacilityLocationPK(facilityId, locationSeqId);
    }

    public FacilityLocationPK getFacilityLocationPK() {
        return facilityLocationPK;
    }

    public void setFacilityLocationPK(FacilityLocationPK facilityLocationPK) {
        this.facilityLocationPK = facilityLocationPK;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public String getAisleId() {
        return aisleId;
    }

    public void setAisleId(String aisleId) {
        this.aisleId = aisleId;
    }

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId;
    }

    public String getLevelId() {
        return levelId;
    }

    public void setLevelId(String levelId) {
        this.levelId = levelId;
    }

    public String getPositionId() {
        return positionId;
    }

    public void setPositionId(String positionId) {
        this.positionId = positionId;
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
/*
    public Enumeration getLocationTypeEnumId() {
        return locationTypeEnumId;
    }

    public void setLocationTypeEnumId(Enumeration locationTypeEnumId) {
        this.locationTypeEnumId = locationTypeEnumId;
    }*/

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }
/*
    public List<ProductFacilityLocation> getProductFacilityLocationList() {
        return productFacilityLocationList;
    }

    public void setProductFacilityLocationList(List<ProductFacilityLocation> productFacilityLocationList) {
        this.productFacilityLocationList = productFacilityLocationList;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (facilityLocationPK != null ? facilityLocationPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FacilityLocation)) {
            return false;
        }
        FacilityLocation other = (FacilityLocation) object;
        if ((this.facilityLocationPK == null && other.facilityLocationPK != null) || (this.facilityLocationPK != null && !this.facilityLocationPK.equals(other.facilityLocationPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.FacilityLocation[ facilityLocationPK=" + facilityLocationPK + " ]";
    }
/*
    public List<FacilityLocationGeoPoint> getFacilityLocationGeoPointList() {
        return facilityLocationGeoPointList;
    }

    public void setFacilityLocationGeoPointList(List<FacilityLocationGeoPoint> facilityLocationGeoPointList) {
        this.facilityLocationGeoPointList = facilityLocationGeoPointList;
    }*/
    
}
