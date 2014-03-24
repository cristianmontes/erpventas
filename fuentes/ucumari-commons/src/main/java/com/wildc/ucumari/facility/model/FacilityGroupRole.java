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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "facility_group_role")
@NamedQueries({
    @NamedQuery(name = "FacilityGroupRole.findAll", query = "SELECT f FROM FacilityGroupRole f")})
public class FacilityGroupRole implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FacilityGroupRolePK facilityGroupRolePK;
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
    @JoinColumn(name = "FACILITY_GROUP_ID", referencedColumnName = "FACILITY_GROUP_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private FacilityGroup facilityGroup;

    public FacilityGroupRole() {
    }

    public FacilityGroupRole(FacilityGroupRolePK facilityGroupRolePK) {
        this.facilityGroupRolePK = facilityGroupRolePK;
    }

    public FacilityGroupRole(String facilityGroupId, String partyId, String roleTypeId) {
        this.facilityGroupRolePK = new FacilityGroupRolePK(facilityGroupId, partyId, roleTypeId);
    }

    public FacilityGroupRolePK getFacilityGroupRolePK() {
        return facilityGroupRolePK;
    }

    public void setFacilityGroupRolePK(FacilityGroupRolePK facilityGroupRolePK) {
        this.facilityGroupRolePK = facilityGroupRolePK;
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

    public FacilityGroup getFacilityGroup() {
        return facilityGroup;
    }

    public void setFacilityGroup(FacilityGroup facilityGroup) {
        this.facilityGroup = facilityGroup;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (facilityGroupRolePK != null ? facilityGroupRolePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FacilityGroupRole)) {
            return false;
        }
        FacilityGroupRole other = (FacilityGroupRole) object;
        if ((this.facilityGroupRolePK == null && other.facilityGroupRolePK != null) || (this.facilityGroupRolePK != null && !this.facilityGroupRolePK.equals(other.facilityGroupRolePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.FacilityGroupRole[ facilityGroupRolePK=" + facilityGroupRolePK + " ]";
    }
    
}
