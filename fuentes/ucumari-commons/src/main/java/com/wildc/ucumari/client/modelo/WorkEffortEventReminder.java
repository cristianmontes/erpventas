/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

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

import com.wildc.ucumari.contact.model.ContactMech;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "work_effort_event_reminder")
@NamedQueries({
    @NamedQuery(name = "WorkEffortEventReminder.findAll", query = "SELECT w FROM WorkEffortEventReminder w")})
public class WorkEffortEventReminder implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected WorkEffortEventReminderPK workEffortEventReminderPK;
    @Column(name = "IS_POPUP")
    private Character isPopup;
    @Column(name = "REMINDER_DATE_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date reminderDateTime;
    @Column(name = "REPEAT_COUNT")
    private BigInteger repeatCount;
    @Column(name = "REPEAT_INTERVAL")
    private BigInteger repeatInterval;
    @Column(name = "CURRENT_COUNT")
    private BigInteger currentCount;
    @Column(name = "RECURRENCE_OFFSET")
    private BigInteger recurrenceOffset;
    @Column(name = "LOCALE_ID")
    private String localeId;
    @Column(name = "TIME_ZONE_ID")
    private String timeZoneId;
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
    @JoinColumn(name = "WORK_EFFORT_ID", referencedColumnName = "WORK_EFFORT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private WorkEffort workEffort;
    @JoinColumn(name = "CONTACT_MECH_ID", referencedColumnName = "CONTACT_MECH_ID")
    @ManyToOne
    private ContactMech contactMechId;

    public WorkEffortEventReminder() {
    }

    public WorkEffortEventReminder(WorkEffortEventReminderPK workEffortEventReminderPK) {
        this.workEffortEventReminderPK = workEffortEventReminderPK;
    }

    public WorkEffortEventReminder(String workEffortId, String sequenceId) {
        this.workEffortEventReminderPK = new WorkEffortEventReminderPK(workEffortId, sequenceId);
    }

    public WorkEffortEventReminderPK getWorkEffortEventReminderPK() {
        return workEffortEventReminderPK;
    }

    public void setWorkEffortEventReminderPK(WorkEffortEventReminderPK workEffortEventReminderPK) {
        this.workEffortEventReminderPK = workEffortEventReminderPK;
    }

    public Character getIsPopup() {
        return isPopup;
    }

    public void setIsPopup(Character isPopup) {
        this.isPopup = isPopup;
    }

    public Date getReminderDateTime() {
        return reminderDateTime;
    }

    public void setReminderDateTime(Date reminderDateTime) {
        this.reminderDateTime = reminderDateTime;
    }

    public BigInteger getRepeatCount() {
        return repeatCount;
    }

    public void setRepeatCount(BigInteger repeatCount) {
        this.repeatCount = repeatCount;
    }

    public BigInteger getRepeatInterval() {
        return repeatInterval;
    }

    public void setRepeatInterval(BigInteger repeatInterval) {
        this.repeatInterval = repeatInterval;
    }

    public BigInteger getCurrentCount() {
        return currentCount;
    }

    public void setCurrentCount(BigInteger currentCount) {
        this.currentCount = currentCount;
    }

    public BigInteger getRecurrenceOffset() {
        return recurrenceOffset;
    }

    public void setRecurrenceOffset(BigInteger recurrenceOffset) {
        this.recurrenceOffset = recurrenceOffset;
    }

    public String getLocaleId() {
        return localeId;
    }

    public void setLocaleId(String localeId) {
        this.localeId = localeId;
    }

    public String getTimeZoneId() {
        return timeZoneId;
    }

    public void setTimeZoneId(String timeZoneId) {
        this.timeZoneId = timeZoneId;
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

    public WorkEffort getWorkEffort() {
        return workEffort;
    }

    public void setWorkEffort(WorkEffort workEffort) {
        this.workEffort = workEffort;
    }

    public ContactMech getContactMechId() {
        return contactMechId;
    }

    public void setContactMechId(ContactMech contactMechId) {
        this.contactMechId = contactMechId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (workEffortEventReminderPK != null ? workEffortEventReminderPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WorkEffortEventReminder)) {
            return false;
        }
        WorkEffortEventReminder other = (WorkEffortEventReminder) object;
        if ((this.workEffortEventReminderPK == null && other.workEffortEventReminderPK != null) || (this.workEffortEventReminderPK != null && !this.workEffortEventReminderPK.equals(other.workEffortEventReminderPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.WorkEffortEventReminder[ workEffortEventReminderPK=" + workEffortEventReminderPK + " ]";
    }
    
}
