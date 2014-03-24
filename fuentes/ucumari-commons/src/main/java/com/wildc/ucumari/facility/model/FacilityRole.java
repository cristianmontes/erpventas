/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.facility.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.parameters.model.RoleType;
import com.wildc.ucumari.party.model.Party;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "facility_role")

public class FacilityRole implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FacilityRolePK facilityRolePK;
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
    @JoinColumn(name = "FACILITY_ID", referencedColumnName = "FACILITY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Facility facility;
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Party party;
    @JoinColumn(name = "ROLE_TYPE_ID", referencedColumnName = "ROLE_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private RoleType roleType;

    public FacilityRole() {
    }

    public FacilityRole(FacilityRolePK facilityRolePK) {
        this.facilityRolePK = facilityRolePK;
    }

    public FacilityRole(String facilityId, String partyId, String roleTypeId) {
        this.facilityRolePK = new FacilityRolePK(facilityId, partyId, roleTypeId);
    }

    public FacilityRolePK getFacilityRolePK() {
        return facilityRolePK;
    }

    public void setFacilityRolePK(FacilityRolePK facilityRolePK) {
        this.facilityRolePK = facilityRolePK;
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

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (facilityRolePK != null ? facilityRolePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FacilityRole)) {
            return false;
        }
        FacilityRole other = (FacilityRole) object;
        if ((this.facilityRolePK == null && other.facilityRolePK != null) || (this.facilityRolePK != null && !this.facilityRolePK.equals(other.facilityRolePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.FacilityRole[ facilityRolePK=" + facilityRolePK + " ]";
    }

	public Party getParty() {
		return party;
	}

	public void setParty(Party party) {
		this.party = party;
	}

	public RoleType getRoleType() {
		return roleType;
	}

	public void setRoleType(RoleType roleType) {
		this.roleType = roleType;
	}
    
}
