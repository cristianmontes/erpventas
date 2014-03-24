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
public class FacilityGroupMemberPK implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -872132040724286354L;
	@Basic(optional = false)
    @Column(name = "FACILITY_ID")
    private String facilityId;
    @Basic(optional = false)
    @Column(name = "FACILITY_GROUP_ID")
    private String facilityGroupId;
    @Basic(optional = false)
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;

    public FacilityGroupMemberPK() {
    }

    public FacilityGroupMemberPK(String facilityId, String facilityGroupId, Date fromDate) {
        this.facilityId = facilityId;
        this.facilityGroupId = facilityGroupId;
        this.fromDate = fromDate;
    }

    public String getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }

    public String getFacilityGroupId() {
        return facilityGroupId;
    }

    public void setFacilityGroupId(String facilityGroupId) {
        this.facilityGroupId = facilityGroupId;
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
        hash += (facilityGroupId != null ? facilityGroupId.hashCode() : 0);
        hash += (fromDate != null ? fromDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FacilityGroupMemberPK)) {
            return false;
        }
        FacilityGroupMemberPK other = (FacilityGroupMemberPK) object;
        if ((this.facilityId == null && other.facilityId != null) || (this.facilityId != null && !this.facilityId.equals(other.facilityId))) {
            return false;
        }
        if ((this.facilityGroupId == null && other.facilityGroupId != null) || (this.facilityGroupId != null && !this.facilityGroupId.equals(other.facilityGroupId))) {
            return false;
        }
        if ((this.fromDate == null && other.fromDate != null) || (this.fromDate != null && !this.fromDate.equals(other.fromDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.FacilityGroupMemberPK[ facilityId=" + facilityId + ", facilityGroupId=" + facilityGroupId + ", fromDate=" + fromDate + " ]";
    }
    
}
