/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import com.wildc.ucumari.parameters.model.StatusItem;
import com.wildc.ucumari.party.model.Party;
import com.wildc.ucumari.security.model.UserLogin;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "timesheet")
@NamedQueries({
    @NamedQuery(name = "Timesheet.findAll", query = "SELECT t FROM Timesheet t")})
public class Timesheet implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TIMESHEET_ID")
    private String timesheetId;
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
    @Column(name = "COMMENTS")
    private String comments;
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
    @OneToMany(mappedBy = "timesheetId")
    private List<TimeEntry> timeEntryList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "timesheet")
    private List<TimesheetRole> timesheetRoleList;
    @JoinColumn(name = "STATUS_ID", referencedColumnName = "STATUS_ID")
    @ManyToOne
    private StatusItem statusId;
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party partyId;
    @JoinColumn(name = "CLIENT_PARTY_ID", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party clientPartyId;
    @JoinColumn(name = "APPROVED_BY_USER_LOGIN_ID", referencedColumnName = "USER_LOGIN_ID")
    @ManyToOne
    private UserLogin approvedByUserLoginId;

    public Timesheet() {
    }

    public Timesheet(String timesheetId) {
        this.timesheetId = timesheetId;
    }

    public String getTimesheetId() {
        return timesheetId;
    }

    public void setTimesheetId(String timesheetId) {
        this.timesheetId = timesheetId;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
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

    public List<TimeEntry> getTimeEntryList() {
        return timeEntryList;
    }

    public void setTimeEntryList(List<TimeEntry> timeEntryList) {
        this.timeEntryList = timeEntryList;
    }

    public List<TimesheetRole> getTimesheetRoleList() {
        return timesheetRoleList;
    }

    public void setTimesheetRoleList(List<TimesheetRole> timesheetRoleList) {
        this.timesheetRoleList = timesheetRoleList;
    }

    public StatusItem getStatusId() {
        return statusId;
    }

    public void setStatusId(StatusItem statusId) {
        this.statusId = statusId;
    }

    public Party getPartyId() {
        return partyId;
    }

    public void setPartyId(Party partyId) {
        this.partyId = partyId;
    }

    public Party getClientPartyId() {
        return clientPartyId;
    }

    public void setClientPartyId(Party clientPartyId) {
        this.clientPartyId = clientPartyId;
    }

    public UserLogin getApprovedByUserLoginId() {
        return approvedByUserLoginId;
    }

    public void setApprovedByUserLoginId(UserLogin approvedByUserLoginId) {
        this.approvedByUserLoginId = approvedByUserLoginId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (timesheetId != null ? timesheetId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Timesheet)) {
            return false;
        }
        Timesheet other = (Timesheet) object;
        if ((this.timesheetId == null && other.timesheetId != null) || (this.timesheetId != null && !this.timesheetId.equals(other.timesheetId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.Timesheet[ timesheetId=" + timesheetId + " ]";
    }
    
}
