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
@Table(name = "tech_data_calendar_exc_week")
@NamedQueries({
    @NamedQuery(name = "TechDataCalendarExcWeek.findAll", query = "SELECT t FROM TechDataCalendarExcWeek t")})
public class TechDataCalendarExcWeek implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TechDataCalendarExcWeekPK techDataCalendarExcWeekPK;
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
    @JoinColumn(name = "CALENDAR_WEEK_ID", referencedColumnName = "CALENDAR_WEEK_ID")
    @ManyToOne
    private TechDataCalendarWeek calendarWeekId;
    @JoinColumn(name = "CALENDAR_ID", referencedColumnName = "CALENDAR_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TechDataCalendar techDataCalendar;

    public TechDataCalendarExcWeek() {
    }

    public TechDataCalendarExcWeek(TechDataCalendarExcWeekPK techDataCalendarExcWeekPK) {
        this.techDataCalendarExcWeekPK = techDataCalendarExcWeekPK;
    }

    public TechDataCalendarExcWeek(String calendarId, Date exceptionDateStart) {
        this.techDataCalendarExcWeekPK = new TechDataCalendarExcWeekPK(calendarId, exceptionDateStart);
    }

    public TechDataCalendarExcWeekPK getTechDataCalendarExcWeekPK() {
        return techDataCalendarExcWeekPK;
    }

    public void setTechDataCalendarExcWeekPK(TechDataCalendarExcWeekPK techDataCalendarExcWeekPK) {
        this.techDataCalendarExcWeekPK = techDataCalendarExcWeekPK;
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

    public TechDataCalendarWeek getCalendarWeekId() {
        return calendarWeekId;
    }

    public void setCalendarWeekId(TechDataCalendarWeek calendarWeekId) {
        this.calendarWeekId = calendarWeekId;
    }

    public TechDataCalendar getTechDataCalendar() {
        return techDataCalendar;
    }

    public void setTechDataCalendar(TechDataCalendar techDataCalendar) {
        this.techDataCalendar = techDataCalendar;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (techDataCalendarExcWeekPK != null ? techDataCalendarExcWeekPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TechDataCalendarExcWeek)) {
            return false;
        }
        TechDataCalendarExcWeek other = (TechDataCalendarExcWeek) object;
        if ((this.techDataCalendarExcWeekPK == null && other.techDataCalendarExcWeekPK != null) || (this.techDataCalendarExcWeekPK != null && !this.techDataCalendarExcWeekPK.equals(other.techDataCalendarExcWeekPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.TechDataCalendarExcWeek[ techDataCalendarExcWeekPK=" + techDataCalendarExcWeekPK + " ]";
    }
    
}
