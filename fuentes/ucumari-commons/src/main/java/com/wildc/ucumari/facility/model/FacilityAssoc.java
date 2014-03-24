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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "facility_assoc")
public class FacilityAssoc implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FacilityAssocPK facilityAssocPK;
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
    @JoinColumn(name = "FACILITY_ASSOC_TYPE_ID", referencedColumnName = "FACILITY_ASSOC_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private FacilityAssocType facilityAssocType;
    @JoinColumn(name = "FACILITY_ID_TO", referencedColumnName = "FACILITY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Facility facility;
    @JoinColumn(name = "FACILITY_ID", referencedColumnName = "FACILITY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Facility facility1;

    public FacilityAssoc() {
    }

    public FacilityAssoc(FacilityAssocPK facilityAssocPK) {
        this.facilityAssocPK = facilityAssocPK;
    }

    public FacilityAssoc(String facilityId, String facilityIdTo, String facilityAssocTypeId, Date fromDate) {
        this.facilityAssocPK = new FacilityAssocPK(facilityId, facilityIdTo, facilityAssocTypeId, fromDate);
    }

    public FacilityAssocPK getFacilityAssocPK() {
        return facilityAssocPK;
    }

    public void setFacilityAssocPK(FacilityAssocPK facilityAssocPK) {
        this.facilityAssocPK = facilityAssocPK;
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

    public FacilityAssocType getFacilityAssocType() {
        return facilityAssocType;
    }

    public void setFacilityAssocType(FacilityAssocType facilityAssocType) {
        this.facilityAssocType = facilityAssocType;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    public Facility getFacility1() {
        return facility1;
    }

    public void setFacility1(Facility facility1) {
        this.facility1 = facility1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (facilityAssocPK != null ? facilityAssocPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FacilityAssoc)) {
            return false;
        }
        FacilityAssoc other = (FacilityAssoc) object;
        if ((this.facilityAssocPK == null && other.facilityAssocPK != null) || (this.facilityAssocPK != null && !this.facilityAssocPK.equals(other.facilityAssocPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.FacilityAssoc[ facilityAssocPK=" + facilityAssocPK + " ]";
    }
    
}
