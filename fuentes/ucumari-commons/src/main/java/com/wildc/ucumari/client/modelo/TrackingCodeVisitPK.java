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
public class TrackingCodeVisitPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "TRACKING_CODE_ID")
    private String trackingCodeId;
    @Basic(optional = false)
    @Column(name = "VISIT_ID")
    private String visitId;
    @Basic(optional = false)
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;

    public TrackingCodeVisitPK() {
    }

    public TrackingCodeVisitPK(String trackingCodeId, String visitId, Date fromDate) {
        this.trackingCodeId = trackingCodeId;
        this.visitId = visitId;
        this.fromDate = fromDate;
    }

    public String getTrackingCodeId() {
        return trackingCodeId;
    }

    public void setTrackingCodeId(String trackingCodeId) {
        this.trackingCodeId = trackingCodeId;
    }

    public String getVisitId() {
        return visitId;
    }

    public void setVisitId(String visitId) {
        this.visitId = visitId;
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
        hash += (trackingCodeId != null ? trackingCodeId.hashCode() : 0);
        hash += (visitId != null ? visitId.hashCode() : 0);
        hash += (fromDate != null ? fromDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TrackingCodeVisitPK)) {
            return false;
        }
        TrackingCodeVisitPK other = (TrackingCodeVisitPK) object;
        if ((this.trackingCodeId == null && other.trackingCodeId != null) || (this.trackingCodeId != null && !this.trackingCodeId.equals(other.trackingCodeId))) {
            return false;
        }
        if ((this.visitId == null && other.visitId != null) || (this.visitId != null && !this.visitId.equals(other.visitId))) {
            return false;
        }
        if ((this.fromDate == null && other.fromDate != null) || (this.fromDate != null && !this.fromDate.equals(other.fromDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.TrackingCodeVisitPK[ trackingCodeId=" + trackingCodeId + ", visitId=" + visitId + ", fromDate=" + fromDate + " ]";
    }
    
}
