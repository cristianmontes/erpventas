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
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "facility_group_type")

public class FacilityGroupType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "FACILITY_GROUP_TYPE_ID")
    private String facilityGroupTypeId;
    @Column(name = "DESCRIPTION")
    private String description;
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
    /*@OneToMany(mappedBy = "facilityGroupTypeId")
    private List<FacilityGroup> facilityGroupList;*/

    public FacilityGroupType() {
    }

    public FacilityGroupType(String facilityGroupTypeId) {
        this.facilityGroupTypeId = facilityGroupTypeId;
    }

    public String getFacilityGroupTypeId() {
        return facilityGroupTypeId;
    }

    public void setFacilityGroupTypeId(String facilityGroupTypeId) {
        this.facilityGroupTypeId = facilityGroupTypeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
/*
    public List<FacilityGroup> getFacilityGroupList() {
        return facilityGroupList;
    }

    public void setFacilityGroupList(List<FacilityGroup> facilityGroupList) {
        this.facilityGroupList = facilityGroupList;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (facilityGroupTypeId != null ? facilityGroupTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FacilityGroupType)) {
            return false;
        }
        FacilityGroupType other = (FacilityGroupType) object;
        if ((this.facilityGroupTypeId == null && other.facilityGroupTypeId != null) || (this.facilityGroupTypeId != null && !this.facilityGroupTypeId.equals(other.facilityGroupTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.FacilityGroupType[ facilityGroupTypeId=" + facilityGroupTypeId + " ]";
    }
    
}
