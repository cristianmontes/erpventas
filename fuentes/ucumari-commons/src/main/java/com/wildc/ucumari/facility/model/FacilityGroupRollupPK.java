/*
S * To change this license header, choose License Headers in Project Properties.
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
public class FacilityGroupRollupPK implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 663887613044242887L;
	@Basic(optional = false)
    @Column(name = "FACILITY_GROUP_ID")
    private String facilityGroupId;
    @Basic(optional = false)
    @Column(name = "PARENT_FACILITY_GROUP_ID")
    private String parentFacilityGroupId;
    @Basic(optional = false)
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;

    public FacilityGroupRollupPK() {
    }

    public FacilityGroupRollupPK(String facilityGroupId, String parentFacilityGroupId, Date fromDate) {
        this.facilityGroupId = facilityGroupId;
        this.parentFacilityGroupId = parentFacilityGroupId;
        this.fromDate = fromDate;
    }

    public String getFacilityGroupId() {
        return facilityGroupId;
    }

    public void setFacilityGroupId(String facilityGroupId) {
        this.facilityGroupId = facilityGroupId;
    }

    public String getParentFacilityGroupId() {
        return parentFacilityGroupId;
    }

    public void setParentFacilityGroupId(String parentFacilityGroupId) {
        this.parentFacilityGroupId = parentFacilityGroupId;
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
        hash += (facilityGroupId != null ? facilityGroupId.hashCode() : 0);
        hash += (parentFacilityGroupId != null ? parentFacilityGroupId.hashCode() : 0);
        hash += (fromDate != null ? fromDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FacilityGroupRollupPK)) {
            return false;
        }
        FacilityGroupRollupPK other = (FacilityGroupRollupPK) object;
        if ((this.facilityGroupId == null && other.facilityGroupId != null) || (this.facilityGroupId != null && !this.facilityGroupId.equals(other.facilityGroupId))) {
            return false;
        }
        if ((this.parentFacilityGroupId == null && other.parentFacilityGroupId != null) || (this.parentFacilityGroupId != null && !this.parentFacilityGroupId.equals(other.parentFacilityGroupId))) {
            return false;
        }
        if ((this.fromDate == null && other.fromDate != null) || (this.fromDate != null && !this.fromDate.equals(other.fromDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.FacilityGroupRollupPK[ facilityGroupId=" + facilityGroupId + ", parentFacilityGroupId=" + parentFacilityGroupId + ", fromDate=" + fromDate + " ]";
    }
    
}
