/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Embeddable
public class TechDataCalendarExcDayPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CALENDAR_ID")
    private String calendarId;
    @Basic(optional = false)
    @Column(name = "EXCEPTION_DATE_START_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date exceptionDateStartTime;

    public TechDataCalendarExcDayPK() {
    }

    public TechDataCalendarExcDayPK(String calendarId, Date exceptionDateStartTime) {
        this.calendarId = calendarId;
        this.exceptionDateStartTime = exceptionDateStartTime;
    }

    public String getCalendarId() {
        return calendarId;
    }

    public void setCalendarId(String calendarId) {
        this.calendarId = calendarId;
    }

    public Date getExceptionDateStartTime() {
        return exceptionDateStartTime;
    }

    public void setExceptionDateStartTime(Date exceptionDateStartTime) {
        this.exceptionDateStartTime = exceptionDateStartTime;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (calendarId != null ? calendarId.hashCode() : 0);
        hash += (exceptionDateStartTime != null ? exceptionDateStartTime.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TechDataCalendarExcDayPK)) {
            return false;
        }
        TechDataCalendarExcDayPK other = (TechDataCalendarExcDayPK) object;
        if ((this.calendarId == null && other.calendarId != null) || (this.calendarId != null && !this.calendarId.equals(other.calendarId))) {
            return false;
        }
        if ((this.exceptionDateStartTime == null && other.exceptionDateStartTime != null) || (this.exceptionDateStartTime != null && !this.exceptionDateStartTime.equals(other.exceptionDateStartTime))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.TechDataCalendarExcDayPK[ calendarId=" + calendarId + ", exceptionDateStartTime=" + exceptionDateStartTime + " ]";
    }
    
}
