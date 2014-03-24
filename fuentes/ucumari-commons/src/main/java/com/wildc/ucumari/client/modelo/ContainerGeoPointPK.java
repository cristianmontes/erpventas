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
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Embeddable
public class ContainerGeoPointPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CONTAINER_ID")
    private String containerId;
    @Basic(optional = false)
    @Column(name = "GEO_POINT_ID")
    private String geoPointId;
    @Basic(optional = false)
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;

    public ContainerGeoPointPK() {
    }

    public ContainerGeoPointPK(String containerId, String geoPointId, Date fromDate) {
        this.containerId = containerId;
        this.geoPointId = geoPointId;
        this.fromDate = fromDate;
    }

    public String getContainerId() {
        return containerId;
    }

    public void setContainerId(String containerId) {
        this.containerId = containerId;
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
        hash += (containerId != null ? containerId.hashCode() : 0);
        hash += (geoPointId != null ? geoPointId.hashCode() : 0);
        hash += (fromDate != null ? fromDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContainerGeoPointPK)) {
            return false;
        }
        ContainerGeoPointPK other = (ContainerGeoPointPK) object;
        if ((this.containerId == null && other.containerId != null) || (this.containerId != null && !this.containerId.equals(other.containerId))) {
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
        return "com.wildc.ucumari.client.modelo.ContainerGeoPointPK[ containerId=" + containerId + ", geoPointId=" + geoPointId + ", fromDate=" + fromDate + " ]";
    }
    
}
