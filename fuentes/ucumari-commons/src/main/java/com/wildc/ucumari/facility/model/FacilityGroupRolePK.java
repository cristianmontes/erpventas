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
public class FacilityGroupRolePK implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 2307907148464831093L;
	@Basic(optional = false)
    @Column(name = "FACILITY_GROUP_ID")
    private String facilityGroupId;
    @Basic(optional = false)
    @Column(name = "PARTY_ID")
    private String partyId;
    @Basic(optional = false)
    @Column(name = "ROLE_TYPE_ID")
    private String roleTypeId;

    public FacilityGroupRolePK() {
    }

    public FacilityGroupRolePK(String facilityGroupId, String partyId, String roleTypeId) {
        this.facilityGroupId = facilityGroupId;
        this.partyId = partyId;
        this.roleTypeId = roleTypeId;
    }

    public String getFacilityGroupId() {
        return facilityGroupId;
    }

    public void setFacilityGroupId(String facilityGroupId) {
        this.facilityGroupId = facilityGroupId;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public String getRoleTypeId() {
        return roleTypeId;
    }

    public void setRoleTypeId(String roleTypeId) {
        this.roleTypeId = roleTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (facilityGroupId != null ? facilityGroupId.hashCode() : 0);
        hash += (partyId != null ? partyId.hashCode() : 0);
        hash += (roleTypeId != null ? roleTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FacilityGroupRolePK)) {
            return false;
        }
        FacilityGroupRolePK other = (FacilityGroupRolePK) object;
        if ((this.facilityGroupId == null && other.facilityGroupId != null) || (this.facilityGroupId != null && !this.facilityGroupId.equals(other.facilityGroupId))) {
            return false;
        }
        if ((this.partyId == null && other.partyId != null) || (this.partyId != null && !this.partyId.equals(other.partyId))) {
            return false;
        }
        if ((this.roleTypeId == null && other.roleTypeId != null) || (this.roleTypeId != null && !this.roleTypeId.equals(other.roleTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.FacilityGroupRolePK[ facilityGroupId=" + facilityGroupId + ", partyId=" + partyId + ", roleTypeId=" + roleTypeId + " ]";
    }
    
}
