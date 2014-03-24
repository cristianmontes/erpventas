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
@Table(name = "facility_transfer_plan")
@NamedQueries({
    @NamedQuery(name = "FacilityTransferPlan.findAll", query = "SELECT f FROM FacilityTransferPlan f")})
public class FacilityTransferPlan implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "FACILITY_TRANSFER_PLAN_ID")
    private String facilityTransferPlanId;
    @Column(name = "SCHEDULED_TRANSFER_DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date scheduledTransferDatetime;
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
    @JoinColumn(name = "FACILITY_ID_FROM", referencedColumnName = "FACILITY_ID")
    @ManyToOne
    private Facility facilityIdFrom;
    @JoinColumn(name = "FACILITY_ID_TO", referencedColumnName = "FACILITY_ID")
    @ManyToOne
    private Facility facilityIdTo;

    public FacilityTransferPlan() {
    }

    public FacilityTransferPlan(String facilityTransferPlanId) {
        this.facilityTransferPlanId = facilityTransferPlanId;
    }

    public String getFacilityTransferPlanId() {
        return facilityTransferPlanId;
    }

    public void setFacilityTransferPlanId(String facilityTransferPlanId) {
        this.facilityTransferPlanId = facilityTransferPlanId;
    }

    public Date getScheduledTransferDatetime() {
        return scheduledTransferDatetime;
    }

    public void setScheduledTransferDatetime(Date scheduledTransferDatetime) {
        this.scheduledTransferDatetime = scheduledTransferDatetime;
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

    public Facility getFacilityIdFrom() {
        return facilityIdFrom;
    }

    public void setFacilityIdFrom(Facility facilityIdFrom) {
        this.facilityIdFrom = facilityIdFrom;
    }

    public Facility getFacilityIdTo() {
        return facilityIdTo;
    }

    public void setFacilityIdTo(Facility facilityIdTo) {
        this.facilityIdTo = facilityIdTo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (facilityTransferPlanId != null ? facilityTransferPlanId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FacilityTransferPlan)) {
            return false;
        }
        FacilityTransferPlan other = (FacilityTransferPlan) object;
        if ((this.facilityTransferPlanId == null && other.facilityTransferPlanId != null) || (this.facilityTransferPlanId != null && !this.facilityTransferPlanId.equals(other.facilityTransferPlanId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.FacilityTransferPlan[ facilityTransferPlanId=" + facilityTransferPlanId + " ]";
    }
    
}
