/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.facility.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class FacilityTypeAttrPK implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 5918469363087058183L;
	@Basic(optional = false)
    @Column(name = "FACILITY_TYPE_ID")
    private String facilityTypeId;
    @Basic(optional = false)
    @Column(name = "ATTR_NAME")
    private String attrName;

    public FacilityTypeAttrPK() {
    }

    public FacilityTypeAttrPK(String facilityTypeId, String attrName) {
        this.facilityTypeId = facilityTypeId;
        this.attrName = attrName;
    }

    public String getFacilityTypeId() {
        return facilityTypeId;
    }

    public void setFacilityTypeId(String facilityTypeId) {
        this.facilityTypeId = facilityTypeId;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (facilityTypeId != null ? facilityTypeId.hashCode() : 0);
        hash += (attrName != null ? attrName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FacilityTypeAttrPK)) {
            return false;
        }
        FacilityTypeAttrPK other = (FacilityTypeAttrPK) object;
        if ((this.facilityTypeId == null && other.facilityTypeId != null) || (this.facilityTypeId != null && !this.facilityTypeId.equals(other.facilityTypeId))) {
            return false;
        }
        if ((this.attrName == null && other.attrName != null) || (this.attrName != null && !this.attrName.equals(other.attrName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.FacilityTypeAttrPK[ facilityTypeId=" + facilityTypeId + ", attrName=" + attrName + " ]";
    }
    
}
