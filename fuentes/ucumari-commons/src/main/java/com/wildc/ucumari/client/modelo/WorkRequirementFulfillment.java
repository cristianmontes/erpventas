/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

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
@Table(name = "work_requirement_fulfillment")
@NamedQueries({
    @NamedQuery(name = "WorkRequirementFulfillment.findAll", query = "SELECT w FROM WorkRequirementFulfillment w")})
public class WorkRequirementFulfillment implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected WorkRequirementFulfillmentPK workRequirementFulfillmentPK;
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
    @JoinColumn(name = "WORK_REQ_FULF_TYPE_ID", referencedColumnName = "WORK_REQ_FULF_TYPE_ID")
    @ManyToOne
    private WorkReqFulfType workReqFulfTypeId;
    @JoinColumn(name = "WORK_EFFORT_ID", referencedColumnName = "WORK_EFFORT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private WorkEffort workEffort;
    @JoinColumn(name = "REQUIREMENT_ID", referencedColumnName = "REQUIREMENT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Requirement requirement;

    public WorkRequirementFulfillment() {
    }

    public WorkRequirementFulfillment(WorkRequirementFulfillmentPK workRequirementFulfillmentPK) {
        this.workRequirementFulfillmentPK = workRequirementFulfillmentPK;
    }

    public WorkRequirementFulfillment(String requirementId, String workEffortId) {
        this.workRequirementFulfillmentPK = new WorkRequirementFulfillmentPK(requirementId, workEffortId);
    }

    public WorkRequirementFulfillmentPK getWorkRequirementFulfillmentPK() {
        return workRequirementFulfillmentPK;
    }

    public void setWorkRequirementFulfillmentPK(WorkRequirementFulfillmentPK workRequirementFulfillmentPK) {
        this.workRequirementFulfillmentPK = workRequirementFulfillmentPK;
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

    public WorkReqFulfType getWorkReqFulfTypeId() {
        return workReqFulfTypeId;
    }

    public void setWorkReqFulfTypeId(WorkReqFulfType workReqFulfTypeId) {
        this.workReqFulfTypeId = workReqFulfTypeId;
    }

    public WorkEffort getWorkEffort() {
        return workEffort;
    }

    public void setWorkEffort(WorkEffort workEffort) {
        this.workEffort = workEffort;
    }

    public Requirement getRequirement() {
        return requirement;
    }

    public void setRequirement(Requirement requirement) {
        this.requirement = requirement;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (workRequirementFulfillmentPK != null ? workRequirementFulfillmentPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WorkRequirementFulfillment)) {
            return false;
        }
        WorkRequirementFulfillment other = (WorkRequirementFulfillment) object;
        if ((this.workRequirementFulfillmentPK == null && other.workRequirementFulfillmentPK != null) || (this.workRequirementFulfillmentPK != null && !this.workRequirementFulfillmentPK.equals(other.workRequirementFulfillmentPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.WorkRequirementFulfillment[ workRequirementFulfillmentPK=" + workRequirementFulfillmentPK + " ]";
    }
    
}
