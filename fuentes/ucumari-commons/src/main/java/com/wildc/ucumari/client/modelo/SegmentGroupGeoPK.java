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
public class SegmentGroupGeoPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "SEGMENT_GROUP_ID")
    private String segmentGroupId;
    @Basic(optional = false)
    @Column(name = "GEO_ID")
    private String geoId;

    public SegmentGroupGeoPK() {
    }

    public SegmentGroupGeoPK(String segmentGroupId, String geoId) {
        this.segmentGroupId = segmentGroupId;
        this.geoId = geoId;
    }

    public String getSegmentGroupId() {
        return segmentGroupId;
    }

    public void setSegmentGroupId(String segmentGroupId) {
        this.segmentGroupId = segmentGroupId;
    }

    public String getGeoId() {
        return geoId;
    }

    public void setGeoId(String geoId) {
        this.geoId = geoId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (segmentGroupId != null ? segmentGroupId.hashCode() : 0);
        hash += (geoId != null ? geoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SegmentGroupGeoPK)) {
            return false;
        }
        SegmentGroupGeoPK other = (SegmentGroupGeoPK) object;
        if ((this.segmentGroupId == null && other.segmentGroupId != null) || (this.segmentGroupId != null && !this.segmentGroupId.equals(other.segmentGroupId))) {
            return false;
        }
        if ((this.geoId == null && other.geoId != null) || (this.geoId != null && !this.geoId.equals(other.geoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.SegmentGroupGeoPK[ segmentGroupId=" + segmentGroupId + ", geoId=" + geoId + " ]";
    }
    
}
