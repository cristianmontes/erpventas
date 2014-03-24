/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import com.wildc.ucumari.invoice.model.InvoiceItem;
import com.wildc.ucumari.party.model.Party;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
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
@Table(name = "time_entry")
@NamedQueries({
    @NamedQuery(name = "TimeEntry.findAll", query = "SELECT t FROM TimeEntry t")})
public class TimeEntry implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TIME_ENTRY_ID")
    private String timeEntryId;
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "HOURS")
    private BigDecimal hours;
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
    @JoinColumn(name = "WORK_EFFORT_ID", referencedColumnName = "WORK_EFFORT_ID")
    @ManyToOne
    private WorkEffort workEffortId;
    @JoinColumn(name = "TIMESHEET_ID", referencedColumnName = "TIMESHEET_ID")
    @ManyToOne
    private Timesheet timesheetId;
    @JoinColumn(name = "RATE_TYPE_ID", referencedColumnName = "RATE_TYPE_ID")
    @ManyToOne
    private RateType rateTypeId;
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party partyId;
    @JoinColumns({
        @JoinColumn(name = "INVOICE_ID", referencedColumnName = "INVOICE_ID"),
        @JoinColumn(name = "INVOICE_ITEM_SEQ_ID", referencedColumnName = "INVOICE_ITEM_SEQ_ID")})
    @ManyToOne
    private InvoiceItem invoiceItem;

    public TimeEntry() {
    }

    public TimeEntry(String timeEntryId) {
        this.timeEntryId = timeEntryId;
    }

    public String getTimeEntryId() {
        return timeEntryId;
    }

    public void setTimeEntryId(String timeEntryId) {
        this.timeEntryId = timeEntryId;
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

    public BigDecimal getHours() {
        return hours;
    }

    public void setHours(BigDecimal hours) {
        this.hours = hours;
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

    public WorkEffort getWorkEffortId() {
        return workEffortId;
    }

    public void setWorkEffortId(WorkEffort workEffortId) {
        this.workEffortId = workEffortId;
    }

    public Timesheet getTimesheetId() {
        return timesheetId;
    }

    public void setTimesheetId(Timesheet timesheetId) {
        this.timesheetId = timesheetId;
    }

    public RateType getRateTypeId() {
        return rateTypeId;
    }

    public void setRateTypeId(RateType rateTypeId) {
        this.rateTypeId = rateTypeId;
    }

    public Party getPartyId() {
        return partyId;
    }

    public void setPartyId(Party partyId) {
        this.partyId = partyId;
    }

    public InvoiceItem getInvoiceItem() {
        return invoiceItem;
    }

    public void setInvoiceItem(InvoiceItem invoiceItem) {
        this.invoiceItem = invoiceItem;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (timeEntryId != null ? timeEntryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TimeEntry)) {
            return false;
        }
        TimeEntry other = (TimeEntry) object;
        if ((this.timeEntryId == null && other.timeEntryId != null) || (this.timeEntryId != null && !this.timeEntryId.equals(other.timeEntryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.TimeEntry[ timeEntryId=" + timeEntryId + " ]";
    }
    
}
