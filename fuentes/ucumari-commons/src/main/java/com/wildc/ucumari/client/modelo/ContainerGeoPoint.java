/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.inventory.model.Container;
import com.wildc.ucumari.parameters.model.GeoPoint;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "container_geo_point")
@NamedQueries({
    @NamedQuery(name = "ContainerGeoPoint.findAll", query = "SELECT c FROM ContainerGeoPoint c")})
public class ContainerGeoPoint implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ContainerGeoPointPK containerGeoPointPK;
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
    @JoinColumn(name = "GEO_POINT_ID", referencedColumnName = "GEO_POINT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private GeoPoint geoPoint;
    @JoinColumn(name = "CONTAINER_ID", referencedColumnName = "CONTAINER_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Container container;

    public ContainerGeoPoint() {
    }

    public ContainerGeoPoint(ContainerGeoPointPK containerGeoPointPK) {
        this.containerGeoPointPK = containerGeoPointPK;
    }

    public ContainerGeoPoint(String containerId, String geoPointId, Date fromDate) {
        this.containerGeoPointPK = new ContainerGeoPointPK(containerId, geoPointId, fromDate);
    }

    public ContainerGeoPointPK getContainerGeoPointPK() {
        return containerGeoPointPK;
    }

    public void setContainerGeoPointPK(ContainerGeoPointPK containerGeoPointPK) {
        this.containerGeoPointPK = containerGeoPointPK;
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

    public GeoPoint getGeoPoint() {
        return geoPoint;
    }

    public void setGeoPoint(GeoPoint geoPoint) {
        this.geoPoint = geoPoint;
    }

    public Container getContainer() {
        return container;
    }

    public void setContainer(Container container) {
        this.container = container;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (containerGeoPointPK != null ? containerGeoPointPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContainerGeoPoint)) {
            return false;
        }
        ContainerGeoPoint other = (ContainerGeoPoint) object;
        if ((this.containerGeoPointPK == null && other.containerGeoPointPK != null) || (this.containerGeoPointPK != null && !this.containerGeoPointPK.equals(other.containerGeoPointPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ContainerGeoPoint[ containerGeoPointPK=" + containerGeoPointPK + " ]";
    }
    
}
