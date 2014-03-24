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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "facility_group")
public class FacilityGroup implements Serializable {
	/*
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "facilityGroup")
    private List<FacilityGroupMember> facilityGroupMemberList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "facilityGroup")
    private List<FacilityGroupRollup> facilityGroupRollupList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "facilityGroup1")
    private List<FacilityGroupRollup> facilityGroupRollupList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "facilityGroup")
    private List<FacilityGroupRole> facilityGroupRoleList;*/
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "FACILITY_GROUP_ID")
    private String facilityGroupId;
    @Column(name = "FACILITY_GROUP_NAME")
    private String facilityGroupName;
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
    @JoinColumn(name = "FACILITY_GROUP_TYPE_ID", referencedColumnName = "FACILITY_GROUP_TYPE_ID")
    @ManyToOne
    private FacilityGroupType facilityGroupTypeId;
    /*
    @OneToMany(mappedBy = "primaryParentGroupId")
    private List<FacilityGroup> facilityGroupList;
    @JoinColumn(name = "PRIMARY_PARENT_GROUP_ID", referencedColumnName = "FACILITY_GROUP_ID")
    @ManyToOne
    private FacilityGroup primaryParentGroupId;
    @OneToMany(mappedBy = "primaryFacilityGroupId")
    private List<Facility> facilityList;*/

    public FacilityGroup() {
    }

    public FacilityGroup(String facilityGroupId) {
        this.facilityGroupId = facilityGroupId;
    }

    public String getFacilityGroupId() {
        return facilityGroupId;
    }

    public void setFacilityGroupId(String facilityGroupId) {
        this.facilityGroupId = facilityGroupId;
    }

    public String getFacilityGroupName() {
        return facilityGroupName;
    }

    public void setFacilityGroupName(String facilityGroupName) {
        this.facilityGroupName = facilityGroupName;
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

    public FacilityGroupType getFacilityGroupTypeId() {
        return facilityGroupTypeId;
    }

    public void setFacilityGroupTypeId(FacilityGroupType facilityGroupTypeId) {
        this.facilityGroupTypeId = facilityGroupTypeId;
    }
/*
    public List<FacilityGroup> getFacilityGroupList() {
        return facilityGroupList;
    }

    public void setFacilityGroupList(List<FacilityGroup> facilityGroupList) {
        this.facilityGroupList = facilityGroupList;
    }

    public FacilityGroup getPrimaryParentGroupId() {
        return primaryParentGroupId;
    }

    public void setPrimaryParentGroupId(FacilityGroup primaryParentGroupId) {
        this.primaryParentGroupId = primaryParentGroupId;
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
        hash += (facilityGroupId != null ? facilityGroupId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FacilityGroup)) {
            return false;
        }
        FacilityGroup other = (FacilityGroup) object;
        if ((this.facilityGroupId == null && other.facilityGroupId != null) || (this.facilityGroupId != null && !this.facilityGroupId.equals(other.facilityGroupId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.FacilityGroup[ facilityGroupId=" + facilityGroupId + " ]";
    }
/*
    public List<FacilityGroupMember> getFacilityGroupMemberList() {
        return facilityGroupMemberList;
    }

    public void setFacilityGroupMemberList(List<FacilityGroupMember> facilityGroupMemberList) {
        this.facilityGroupMemberList = facilityGroupMemberList;
    }

    public List<FacilityGroupRollup> getFacilityGroupRollupList() {
        return facilityGroupRollupList;
    }

    public void setFacilityGroupRollupList(List<FacilityGroupRollup> facilityGroupRollupList) {
        this.facilityGroupRollupList = facilityGroupRollupList;
    }

    public List<FacilityGroupRollup> getFacilityGroupRollupList1() {
        return facilityGroupRollupList1;
    }

    public void setFacilityGroupRollupList1(List<FacilityGroupRollup> facilityGroupRollupList1) {
        this.facilityGroupRollupList1 = facilityGroupRollupList1;
    }

    public List<FacilityGroupRole> getFacilityGroupRoleList() {
        return facilityGroupRoleList;
    }

    public void setFacilityGroupRoleList(List<FacilityGroupRole> facilityGroupRoleList) {
        this.facilityGroupRoleList = facilityGroupRoleList;
    }*/
    
}
