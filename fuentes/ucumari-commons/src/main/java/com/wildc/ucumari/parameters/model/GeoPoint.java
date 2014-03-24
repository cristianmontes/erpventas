/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.parameters.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "geo_point")

public class GeoPoint implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "GEO_POINT_ID")
    private String geoPointId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "LATITUDE")
    private BigDecimal latitude;
    @Basic(optional = false)
    @Column(name = "LONGITUDE")
    private BigDecimal longitude;
    @Column(name = "ELEVATION")
    private BigDecimal elevation;
    @Column(name = "INFORMATION")
    private String information;
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
    
    @JoinColumn(name = "ELEVATION_UOM_ID", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom elevationUomId;
    /*
    @JoinColumn(name = "DATA_SOURCE_ID", referencedColumnName = "DATA_SOURCE_ID")
    @ManyToOne
    private DataSource dataSourceId;*/

    public GeoPoint() {
    }

    public GeoPoint(String geoPointId) {
        this.geoPointId = geoPointId;
    }

    public GeoPoint(String geoPointId, BigDecimal latitude, BigDecimal longitude) {
        this.geoPointId = geoPointId;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getGeoPointId() {
        return geoPointId;
    }

    public void setGeoPointId(String geoPointId) {
        this.geoPointId = geoPointId;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public BigDecimal getElevation() {
        return elevation;
    }

    public void setElevation(BigDecimal elevation) {
        this.elevation = elevation;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
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

    

    public Uom getElevationUomId() {
        return elevationUomId;
    }

    public void setElevationUomId(Uom elevationUomId) {
        this.elevationUomId = elevationUomId;
    }
/*
    public DataSource getDataSourceId() {
        return dataSourceId;
    }

    public void setDataSourceId(DataSource dataSourceId) {
        this.dataSourceId = dataSourceId;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (geoPointId != null ? geoPointId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GeoPoint)) {
            return false;
        }
        GeoPoint other = (GeoPoint) object;
        if ((this.geoPointId == null && other.geoPointId != null) || (this.geoPointId != null && !this.geoPointId.equals(other.geoPointId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.GeoPoint[ geoPointId=" + geoPointId + " ]";
    }

   
    
}
