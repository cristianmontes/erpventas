/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.parameters.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class GeoAssocPK implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -8950449474176976045L;
	@Basic(optional = false)
    @Column(name = "GEO_ID")
    private String geoId;
    @Basic(optional = false)
    @Column(name = "GEO_ID_TO")
    private String geoIdTo;

    public GeoAssocPK() {
    }

    public GeoAssocPK(String geoId, String geoIdTo) {
        this.geoId = geoId;
        this.geoIdTo = geoIdTo;
    }

    public String getGeoId() {
        return geoId;
    }

    public void setGeoId(String geoId) {
        this.geoId = geoId;
    }

    public String getGeoIdTo() {
        return geoIdTo;
    }

    public void setGeoIdTo(String geoIdTo) {
        this.geoIdTo = geoIdTo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (geoId != null ? geoId.hashCode() : 0);
        hash += (geoIdTo != null ? geoIdTo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GeoAssocPK)) {
            return false;
        }
        GeoAssocPK other = (GeoAssocPK) object;
        if ((this.geoId == null && other.geoId != null) || (this.geoId != null && !this.geoId.equals(other.geoId))) {
            return false;
        }
        if ((this.geoIdTo == null && other.geoIdTo != null) || (this.geoIdTo != null && !this.geoIdTo.equals(other.geoIdTo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.GeoAssocPK[ geoId=" + geoId + ", geoIdTo=" + geoIdTo + " ]";
    }

}
