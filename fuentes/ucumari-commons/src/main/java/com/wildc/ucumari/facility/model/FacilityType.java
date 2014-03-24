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
@Table(name = "facility_type")

public class FacilityType implements Serializable {
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "facilityType")
    private List<FacilityTypeAttr> facilityTypeAttrList;*/
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "FACILITY_TYPE_ID")
    private String facilityTypeId;
    @Column(name = "HAS_TABLE")
    private Character hasTable;
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
    /*
    @OneToMany(mappedBy = "parentTypeId")
    private List<FacilityType> facilityTypeList;
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "FACILITY_TYPE_ID")
    @ManyToOne
    private FacilityType parentTypeId;
    @OneToMany(mappedBy = "facilityTypeId")
    private List<Facility> facilityList;*/

    public FacilityType() {
    }

    public FacilityType(String facilityTypeId) {
        this.facilityTypeId = facilityTypeId;
    }

    public String getFacilityTypeId() {
        return facilityTypeId;
    }

    public void setFacilityTypeId(String facilityTypeId) {
        this.facilityTypeId = facilityTypeId;
    }

    public Character getHasTable() {
        return hasTable;
    }

    public void setHasTable(Character hasTable) {
        this.hasTable = hasTable;
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
    public List<FacilityType> getFacilityTypeList() {
        return facilityTypeList;
    }

    public void setFacilityTypeList(List<FacilityType> facilityTypeList) {
        this.facilityTypeList = facilityTypeList;
    }

    public FacilityType getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(FacilityType parentTypeId) {
        this.parentTypeId = parentTypeId;
    }

    public List<Facility> getFacilityList() {
        return facilityList;
    }

    public void setFacilityList(List<Facility> facilityList) {
        this.facilityList = facilityList;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (facilityTypeId != null ? facilityTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FacilityType)) {
            return false;
        }
        FacilityType other = (FacilityType) object;
        if ((this.facilityTypeId == null && other.facilityTypeId != null) || (this.facilityTypeId != null && !this.facilityTypeId.equals(other.facilityTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.FacilityType[ facilityTypeId=" + facilityTypeId + " ]";
    }
/*
    public List<FacilityTypeAttr> getFacilityTypeAttrList() {
        return facilityTypeAttrList;
    }

    public void setFacilityTypeAttrList(List<FacilityTypeAttr> facilityTypeAttrList) {
        this.facilityTypeAttrList = facilityTypeAttrList;
    }*/
    
}
