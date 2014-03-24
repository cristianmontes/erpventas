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
@Table(name = "facility_group_rollup")
@NamedQueries({
    @NamedQuery(name = "FacilityGroupRollup.findAll", query = "SELECT f FROM FacilityGroupRollup f")})
public class FacilityGroupRollup implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FacilityGroupRollupPK facilityGroupRollupPK;
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
    @JoinColumn(name = "PARENT_FACILITY_GROUP_ID", referencedColumnName = "FACILITY_GROUP_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private FacilityGroup facilityGroup;
    @JoinColumn(name = "FACILITY_GROUP_ID", referencedColumnName = "FACILITY_GROUP_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private FacilityGroup facilityGroup1;

    public FacilityGroupRollup() {
    }

    public FacilityGroupRollup(FacilityGroupRollupPK facilityGroupRollupPK) {
        this.facilityGroupRollupPK = facilityGroupRollupPK;
    }

    public FacilityGroupRollup(String facilityGroupId, String parentFacilityGroupId, Date fromDate) {
        this.facilityGroupRollupPK = new FacilityGroupRollupPK(facilityGroupId, parentFacilityGroupId, fromDate);
    }

    public FacilityGroupRollupPK getFacilityGroupRollupPK() {
        return facilityGroupRollupPK;
    }

    public void setFacilityGroupRollupPK(FacilityGroupRollupPK facilityGroupRollupPK) {
        this.facilityGroupRollupPK = facilityGroupRollupPK;
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

    public FacilityGroup getFacilityGroup1() {
        return facilityGroup1;
    }

    public void setFacilityGroup1(FacilityGroup facilityGroup1) {
        this.facilityGroup1 = facilityGroup1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (facilityGroupRollupPK != null ? facilityGroupRollupPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FacilityGroupRollup)) {
            return false;
        }
        FacilityGroupRollup other = (FacilityGroupRollup) object;
        if ((this.facilityGroupRollupPK == null && other.facilityGroupRollupPK != null) || (this.facilityGroupRollupPK != null && !this.facilityGroupRollupPK.equals(other.facilityGroupRollupPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.FacilityGroupRollup[ facilityGroupRollupPK=" + facilityGroupRollupPK + " ]";
    }
    
}
