/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.parameters.model;

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
@Table(name = "geo_assoc")

public class GeoAssoc implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GeoAssocPK geoAssocPK;
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
    @JoinColumn(name = "GEO_ASSOC_TYPE_ID", referencedColumnName = "GEO_ASSOC_TYPE_ID")
    @ManyToOne
    private GeoAssocType geoAssocTypeId;
    @JoinColumn(name = "GEO_ID", referencedColumnName = "GEO_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Geo geo;
    @JoinColumn(name = "GEO_ID_TO", referencedColumnName = "GEO_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Geo geo1;

    public GeoAssoc() {
    }

    public GeoAssoc(GeoAssocPK geoAssocPK) {
        this.geoAssocPK = geoAssocPK;
    }

    public GeoAssoc(String geoId, String geoIdTo) {
        this.geoAssocPK = new GeoAssocPK(geoId, geoIdTo);
    }

    public GeoAssocPK getGeoAssocPK() {
        return geoAssocPK;
    }

    public void setGeoAssocPK(GeoAssocPK geoAssocPK) {
        this.geoAssocPK = geoAssocPK;
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

    public GeoAssocType getGeoAssocTypeId() {
        return geoAssocTypeId;
    }

    public void setGeoAssocTypeId(GeoAssocType geoAssocTypeId) {
        this.geoAssocTypeId = geoAssocTypeId;
    }

    public Geo getGeo() {
        return geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    public Geo getGeo1() {
        return geo1;
    }

    public void setGeo1(Geo geo1) {
        this.geo1 = geo1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (geoAssocPK != null ? geoAssocPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GeoAssoc)) {
            return false;
        }
        GeoAssoc other = (GeoAssoc) object;
        if ((this.geoAssocPK == null && other.geoAssocPK != null) || (this.geoAssocPK != null && !this.geoAssocPK.equals(other.geoAssocPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.GeoAssoc[ geoAssocPK=" + geoAssocPK + " ]";
    }
    
}
