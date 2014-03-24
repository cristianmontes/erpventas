/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.party.model;

import com.wildc.ucumari.parameters.model.GeoPoint;

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

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "party_geo_point")
@NamedQueries({
    @NamedQuery(name = "PartyGeoPoint.findAll", query = "SELECT p FROM PartyGeoPoint p")})
public class PartyGeoPoint implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PartyGeoPointPK partyGeoPointPK;
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
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Party party;
    @JoinColumn(name = "GEO_POINT_ID", referencedColumnName = "GEO_POINT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private GeoPoint geoPoint;

    public PartyGeoPoint() {
    }

    public PartyGeoPoint(PartyGeoPointPK partyGeoPointPK) {
        this.partyGeoPointPK = partyGeoPointPK;
    }

    public PartyGeoPoint(String partyId, String geoPointId, Date fromDate) {
        this.partyGeoPointPK = new PartyGeoPointPK(partyId, geoPointId, fromDate);
    }

    public PartyGeoPointPK getPartyGeoPointPK() {
        return partyGeoPointPK;
    }

    public void setPartyGeoPointPK(PartyGeoPointPK partyGeoPointPK) {
        this.partyGeoPointPK = partyGeoPointPK;
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

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    public GeoPoint getGeoPoint() {
        return geoPoint;
    }

    public void setGeoPoint(GeoPoint geoPoint) {
        this.geoPoint = geoPoint;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (partyGeoPointPK != null ? partyGeoPointPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PartyGeoPoint)) {
            return false;
        }
        PartyGeoPoint other = (PartyGeoPoint) object;
        if ((this.partyGeoPointPK == null && other.partyGeoPointPK != null) || (this.partyGeoPointPK != null && !this.partyGeoPointPK.equals(other.partyGeoPointPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PartyGeoPoint[ partyGeoPointPK=" + partyGeoPointPK + " ]";
    }
    
}
