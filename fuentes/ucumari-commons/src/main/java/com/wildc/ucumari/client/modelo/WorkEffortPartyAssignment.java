/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import com.wildc.ucumari.facility.model.Facility;
import com.wildc.ucumari.parameters.model.Enumeration;
import com.wildc.ucumari.parameters.model.StatusItem;
import com.wildc.ucumari.security.model.UserLogin;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "work_effort_party_assignment")
@NamedQueries({
    @NamedQuery(name = "WorkEffortPartyAssignment.findAll", query = "SELECT w FROM WorkEffortPartyAssignment w")})
public class WorkEffortPartyAssignment implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected WorkEffortPartyAssignmentPK workEffortPartyAssignmentPK;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
    @Column(name = "STATUS_DATE_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date statusDateTime;
    @Column(name = "COMMENTS")
    private String comments;
    @Column(name = "MUST_RSVP")
    private Character mustRsvp;
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
    @OneToMany(mappedBy = "workEffortPartyAssignment")
    private List<ApplicationSandbox> applicationSandboxList;
    @JoinColumn(name = "WORK_EFFORT_ID", referencedColumnName = "WORK_EFFORT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private WorkEffort workEffort;
    @JoinColumn(name = "STATUS_ID", referencedColumnName = "STATUS_ID")
    @ManyToOne
    private StatusItem statusId;
    @JoinColumn(name = "FACILITY_ID", referencedColumnName = "FACILITY_ID")
    @ManyToOne
    private Facility facilityId;
    @JoinColumn(name = "EXPECTATION_ENUM_ID", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration expectationEnumId;
    @JoinColumn(name = "DELEGATE_REASON_ENUM_ID", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration delegateReasonEnumId;
    @JoinColumn(name = "AVAILABILITY_STATUS_ID", referencedColumnName = "STATUS_ID")
    @ManyToOne
    private StatusItem availabilityStatusId;
    @JoinColumn(name = "ASSIGNED_BY_USER_LOGIN_ID", referencedColumnName = "USER_LOGIN_ID")
    @ManyToOne
    private UserLogin assignedByUserLoginId;

    public WorkEffortPartyAssignment() {
    }

    public WorkEffortPartyAssignment(WorkEffortPartyAssignmentPK workEffortPartyAssignmentPK) {
        this.workEffortPartyAssignmentPK = workEffortPartyAssignmentPK;
    }

    public WorkEffortPartyAssignment(String workEffortId, String partyId, String roleTypeId, Date fromDate) {
        this.workEffortPartyAssignmentPK = new WorkEffortPartyAssignmentPK(workEffortId, partyId, roleTypeId, fromDate);
    }

    public WorkEffortPartyAssignmentPK getWorkEffortPartyAssignmentPK() {
        return workEffortPartyAssignmentPK;
    }

    public void setWorkEffortPartyAssignmentPK(WorkEffortPartyAssignmentPK workEffortPartyAssignmentPK) {
        this.workEffortPartyAssignmentPK = workEffortPartyAssignmentPK;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
    }

    public Date getStatusDateTime() {
        return statusDateTime;
    }

    public void setStatusDateTime(Date statusDateTime) {
        this.statusDateTime = statusDateTime;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Character getMustRsvp() {
        return mustRsvp;
    }

    public void setMustRsvp(Character mustRsvp) {
        this.mustRsvp = mustRsvp;
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

    public List<ApplicationSandbox> getApplicationSandboxList() {
        return applicationSandboxList;
    }

    public void setApplicationSandboxList(List<ApplicationSandbox> applicationSandboxList) {
        this.applicationSandboxList = applicationSandboxList;
    }

    public WorkEffort getWorkEffort() {
        return workEffort;
    }

    public void setWorkEffort(WorkEffort workEffort) {
        this.workEffort = workEffort;
    }

    public StatusItem getStatusId() {
        return statusId;
    }

    public void setStatusId(StatusItem statusId) {
        this.statusId = statusId;
    }

    public Facility getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(Facility facilityId) {
        this.facilityId = facilityId;
    }

    public Enumeration getExpectationEnumId() {
        return expectationEnumId;
    }

    public void setExpectationEnumId(Enumeration expectationEnumId) {
        this.expectationEnumId = expectationEnumId;
    }

    public Enumeration getDelegateReasonEnumId() {
        return delegateReasonEnumId;
    }

    public void setDelegateReasonEnumId(Enumeration delegateReasonEnumId) {
        this.delegateReasonEnumId = delegateReasonEnumId;
    }

    public StatusItem getAvailabilityStatusId() {
        return availabilityStatusId;
    }

    public void setAvailabilityStatusId(StatusItem availabilityStatusId) {
        this.availabilityStatusId = availabilityStatusId;
    }

    public UserLogin getAssignedByUserLoginId() {
        return assignedByUserLoginId;
    }

    public void setAssignedByUserLoginId(UserLogin assignedByUserLoginId) {
        this.assignedByUserLoginId = assignedByUserLoginId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (workEffortPartyAssignmentPK != null ? workEffortPartyAssignmentPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WorkEffortPartyAssignment)) {
            return false;
        }
        WorkEffortPartyAssignment other = (WorkEffortPartyAssignment) object;
        if ((this.workEffortPartyAssignmentPK == null && other.workEffortPartyAssignmentPK != null) || (this.workEffortPartyAssignmentPK != null && !this.workEffortPartyAssignmentPK.equals(other.workEffortPartyAssignmentPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.WorkEffortPartyAssignment[ workEffortPartyAssignmentPK=" + workEffortPartyAssignmentPK + " ]";
    }
    
}
