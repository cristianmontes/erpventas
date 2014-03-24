/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.facility.model;

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
public class FacilityAssocPK implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -1646292099971574279L;
	@Basic(optional = false)
    @Column(name = "FACILITY_ID")
    private String facilityId;
    @Basic(optional = false)
    @Column(name = "FACILITY_ID_TO")
    private String facilityIdTo;
    @Basic(optional = false)
    @Column(name = "FACILITY_ASSOC_TYPE_ID")
    private String facilityAssocTypeId;
    @Basic(optional = false)
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;

    public FacilityAssocPK() {
    }

    public FacilityAssocPK(String facilityId, String facilityIdTo, String facilityAssocTypeId, Date fromDate) {
        this.facilityId = facilityId;
        this.facilityIdTo = facilityIdTo;
        this.facilityAssocTypeId = facilityAssocTypeId;
        this.fromDate = fromDate;
    }

    public String getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }

    public String getFacilityIdTo() {
        return facilityIdTo;
    }

    public void setFacilityIdTo(String facilityIdTo) {
        this.facilityIdTo = facilityIdTo;
    }

    public String getFacilityAssocTypeId() {
        return facilityAssocTypeId;
    }

    public void setFacilityAssocTypeId(String facilityAssocTypeId) {
        this.facilityAssocTypeId = facilityAssocTypeId;
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
        hash += (facilityId != null ? facilityId.hashCode() : 0);
        hash += (facilityIdTo != null ? facilityIdTo.hashCode() : 0);
        hash += (facilityAssocTypeId != null ? facilityAssocTypeId.hashCode() : 0);
        hash += (fromDate != null ? fromDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FacilityAssocPK)) {
            return false;
        }
        FacilityAssocPK other = (FacilityAssocPK) object;
        if ((this.facilityId == null && other.facilityId != null) || (this.facilityId != null && !this.facilityId.equals(other.facilityId))) {
            return false;
        }
        if ((this.facilityIdTo == null && other.facilityIdTo != null) || (this.facilityIdTo != null && !this.facilityIdTo.equals(other.facilityIdTo))) {
            return false;
        }
        if ((this.facilityAssocTypeId == null && other.facilityAssocTypeId != null) || (this.facilityAssocTypeId != null && !this.facilityAssocTypeId.equals(other.facilityAssocTypeId))) {
            return false;
        }
        if ((this.fromDate == null && other.fromDate != null) || (this.fromDate != null && !this.fromDate.equals(other.fromDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.FacilityAssocPK[ facilityId=" + facilityId + ", facilityIdTo=" + facilityIdTo + ", facilityAssocTypeId=" + facilityAssocTypeId + ", fromDate=" + fromDate + " ]";
    }
    
}
