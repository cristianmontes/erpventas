/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.parameters.model.Geo;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "test_geo_data")
@NamedQueries({
    @NamedQuery(name = "TestGeoData.findAll", query = "SELECT t FROM TestGeoData t")})
public class TestGeoData implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "GEO_ROW_ID")
    private String geoRowId;
    @Column(name = "CITY")
    private String city;
    @Column(name = "POSTAL_CODE")
    private String postalCode;
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
    @JoinColumn(name = "STATE_GEO_ID", referencedColumnName = "GEO_ID")
    @ManyToOne
    private Geo stateGeoId;
    @JoinColumn(name = "COUNTRY_GEO_ID", referencedColumnName = "GEO_ID")
    @ManyToOne
    private Geo countryGeoId;

    public TestGeoData() {
    }

    public TestGeoData(String geoRowId) {
        this.geoRowId = geoRowId;
    }

    public String getGeoRowId() {
        return geoRowId;
    }

    public void setGeoRowId(String geoRowId) {
        this.geoRowId = geoRowId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
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

    public Geo getStateGeoId() {
        return stateGeoId;
    }

    public void setStateGeoId(Geo stateGeoId) {
        this.stateGeoId = stateGeoId;
    }

    public Geo getCountryGeoId() {
        return countryGeoId;
    }

    public void setCountryGeoId(Geo countryGeoId) {
        this.countryGeoId = countryGeoId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (geoRowId != null ? geoRowId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TestGeoData)) {
            return false;
        }
        TestGeoData other = (TestGeoData) object;
        if ((this.geoRowId == null && other.geoRowId != null) || (this.geoRowId != null && !this.geoRowId.equals(other.geoRowId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.TestGeoData[ geoRowId=" + geoRowId + " ]";
    }
    
}
