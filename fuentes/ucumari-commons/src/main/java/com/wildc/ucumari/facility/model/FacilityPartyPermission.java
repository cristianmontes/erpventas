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

import com.wildc.ucumari.party.model.Party;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "facility_party_permission")

public class FacilityPartyPermission implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FacilityPartyPermissionPK facilityPartyPermissionPK;
    @Column(name = "SECURITY_GROUP_ID")
    private String securityGroupId;
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
    @JoinColumn(name = "FACILITY_ID", referencedColumnName = "FACILITY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Facility facility;
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Party party;
    

    public FacilityPartyPermission() {
    }

    public FacilityPartyPermission(FacilityPartyPermissionPK facilityPartyPermissionPK) {
        this.facilityPartyPermissionPK = facilityPartyPermissionPK;
    }

    public FacilityPartyPermission(String facilityId, String partyId, Date fromDate) {
        this.facilityPartyPermissionPK = new FacilityPartyPermissionPK(facilityId, partyId, fromDate);
    }

    public FacilityPartyPermissionPK getFacilityPartyPermissionPK() {
        return facilityPartyPermissionPK;
    }

    public void setFacilityPartyPermissionPK(FacilityPartyPermissionPK facilityPartyPermissionPK) {
        this.facilityPartyPermissionPK = facilityPartyPermissionPK;
    }

    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
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

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (facilityPartyPermissionPK != null ? facilityPartyPermissionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FacilityPartyPermission)) {
            return false;
        }
        FacilityPartyPermission other = (FacilityPartyPermission) object;
        if ((this.facilityPartyPermissionPK == null && other.facilityPartyPermissionPK != null) || (this.facilityPartyPermissionPK != null && !this.facilityPartyPermissionPK.equals(other.facilityPartyPermissionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.FacilityPartyPermission[ facilityPartyPermissionPK=" + facilityPartyPermissionPK + " ]";
    }

	public Party getParty() {
		return party;
	}

	public void setParty(Party party) {
		this.party = party;
	}
    
}
