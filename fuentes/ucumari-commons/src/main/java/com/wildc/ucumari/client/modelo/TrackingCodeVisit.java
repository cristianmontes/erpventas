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

import com.wildc.ucumari.parameters.model.Enumeration;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "tracking_code_visit")
@NamedQueries({
    @NamedQuery(name = "TrackingCodeVisit.findAll", query = "SELECT t FROM TrackingCodeVisit t")})
public class TrackingCodeVisit implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TrackingCodeVisitPK trackingCodeVisitPK;
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
    @JoinColumn(name = "VISIT_ID", referencedColumnName = "VISIT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Visit visit;
    @JoinColumn(name = "TRACKING_CODE_ID", referencedColumnName = "TRACKING_CODE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TrackingCode trackingCode;
    @JoinColumn(name = "SOURCE_ENUM_ID", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration sourceEnumId;

    public TrackingCodeVisit() {
    }

    public TrackingCodeVisit(TrackingCodeVisitPK trackingCodeVisitPK) {
        this.trackingCodeVisitPK = trackingCodeVisitPK;
    }

    public TrackingCodeVisit(String trackingCodeId, String visitId, Date fromDate) {
        this.trackingCodeVisitPK = new TrackingCodeVisitPK(trackingCodeId, visitId, fromDate);
    }

    public TrackingCodeVisitPK getTrackingCodeVisitPK() {
        return trackingCodeVisitPK;
    }

    public void setTrackingCodeVisitPK(TrackingCodeVisitPK trackingCodeVisitPK) {
        this.trackingCodeVisitPK = trackingCodeVisitPK;
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

    public Visit getVisit() {
        return visit;
    }

    public void setVisit(Visit visit) {
        this.visit = visit;
    }

    public TrackingCode getTrackingCode() {
        return trackingCode;
    }

    public void setTrackingCode(TrackingCode trackingCode) {
        this.trackingCode = trackingCode;
    }

    public Enumeration getSourceEnumId() {
        return sourceEnumId;
    }

    public void setSourceEnumId(Enumeration sourceEnumId) {
        this.sourceEnumId = sourceEnumId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (trackingCodeVisitPK != null ? trackingCodeVisitPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TrackingCodeVisit)) {
            return false;
        }
        TrackingCodeVisit other = (TrackingCodeVisit) object;
        if ((this.trackingCodeVisitPK == null && other.trackingCodeVisitPK != null) || (this.trackingCodeVisitPK != null && !this.trackingCodeVisitPK.equals(other.trackingCodeVisitPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.TrackingCodeVisit[ trackingCodeVisitPK=" + trackingCodeVisitPK + " ]";
    }
    
}
