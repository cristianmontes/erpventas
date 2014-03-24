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
public class EmplPositionReportingStructPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "EMPL_POSITION_ID_REPORTING_TO")
    private String emplPositionIdReportingTo;
    @Basic(optional = false)
    @Column(name = "EMPL_POSITION_ID_MANAGED_BY")
    private String emplPositionIdManagedBy;
    @Basic(optional = false)
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;

    public EmplPositionReportingStructPK() {
    }

    public EmplPositionReportingStructPK(String emplPositionIdReportingTo, String emplPositionIdManagedBy, Date fromDate) {
        this.emplPositionIdReportingTo = emplPositionIdReportingTo;
        this.emplPositionIdManagedBy = emplPositionIdManagedBy;
        this.fromDate = fromDate;
    }

    public String getEmplPositionIdReportingTo() {
        return emplPositionIdReportingTo;
    }

    public void setEmplPositionIdReportingTo(String emplPositionIdReportingTo) {
        this.emplPositionIdReportingTo = emplPositionIdReportingTo;
    }

    public String getEmplPositionIdManagedBy() {
        return emplPositionIdManagedBy;
    }

    public void setEmplPositionIdManagedBy(String emplPositionIdManagedBy) {
        this.emplPositionIdManagedBy = emplPositionIdManagedBy;
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
        hash += (emplPositionIdReportingTo != null ? emplPositionIdReportingTo.hashCode() : 0);
        hash += (emplPositionIdManagedBy != null ? emplPositionIdManagedBy.hashCode() : 0);
        hash += (fromDate != null ? fromDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmplPositionReportingStructPK)) {
            return false;
        }
        EmplPositionReportingStructPK other = (EmplPositionReportingStructPK) object;
        if ((this.emplPositionIdReportingTo == null && other.emplPositionIdReportingTo != null) || (this.emplPositionIdReportingTo != null && !this.emplPositionIdReportingTo.equals(other.emplPositionIdReportingTo))) {
            return false;
        }
        if ((this.emplPositionIdManagedBy == null && other.emplPositionIdManagedBy != null) || (this.emplPositionIdManagedBy != null && !this.emplPositionIdManagedBy.equals(other.emplPositionIdManagedBy))) {
            return false;
        }
        if ((this.fromDate == null && other.fromDate != null) || (this.fromDate != null && !this.fromDate.equals(other.fromDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.EmplPositionReportingStructPK[ emplPositionIdReportingTo=" + emplPositionIdReportingTo + ", emplPositionIdManagedBy=" + emplPositionIdManagedBy + ", fromDate=" + fromDate + " ]";
    }
    
}
