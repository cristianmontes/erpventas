/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.facility.model;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "facility_group_member")
@NamedQueries({
    @NamedQuery(name = "FacilityGroupMember.findAll", query = "SELECT f FROM FacilityGroupMember f")})
public class FacilityGroupMember implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FacilityGroupMemberPK facilityGroupMemberPK;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
    @Column(name = "SEQUENCE_NUM")
    private BigInteger sequenceNum;
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
    @JoinColumn(name = "FACILITY_ID", referencedColumnName = "FACILITY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Facility facility;

    public FacilityGroupMember() {
    }

    public FacilityGroupMember(FacilityGroupMemberPK facilityGroupMemberPK) {
        this.facilityGroupMemberPK = facilityGroupMemberPK;
    }

    public FacilityGroupMember(String facilityId, String facilityGroupId, Date fromDate) {
        this.facilityGroupMemberPK = new FacilityGroupMemberPK(facilityId, facilityGroupId, fromDate);
    }

    public FacilityGroupMemberPK getFacilityGroupMemberPK() {
        return facilityGroupMemberPK;
    }

    public void setFacilityGroupMemberPK(FacilityGroupMemberPK facilityGroupMemberPK) {
        this.facilityGroupMemberPK = facilityGroupMemberPK;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
    }

    public BigInteger getSequenceNum() {
        return sequenceNum;
    }

    public void setSequenceNum(BigInteger sequenceNum) {
        this.sequenceNum = sequenceNum;
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

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (facilityGroupMemberPK != null ? facilityGroupMemberPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FacilityGroupMember)) {
            return false;
        }
        FacilityGroupMember other = (FacilityGroupMember) object;
        if ((this.facilityGroupMemberPK == null && other.facilityGroupMemberPK != null) || (this.facilityGroupMemberPK != null && !this.facilityGroupMemberPK.equals(other.facilityGroupMemberPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.FacilityGroupMember[ facilityGroupMemberPK=" + facilityGroupMemberPK + " ]";
    }
    
}
