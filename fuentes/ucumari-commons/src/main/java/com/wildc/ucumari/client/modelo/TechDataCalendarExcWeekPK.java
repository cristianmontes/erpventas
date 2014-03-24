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
public class TechDataCalendarExcWeekPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CALENDAR_ID")
    private String calendarId;
    @Basic(optional = false)
    @Column(name = "EXCEPTION_DATE_START")
    @Temporal(TemporalType.DATE)
    private Date exceptionDateStart;

    public TechDataCalendarExcWeekPK() {
    }

    public TechDataCalendarExcWeekPK(String calendarId, Date exceptionDateStart) {
        this.calendarId = calendarId;
        this.exceptionDateStart = exceptionDateStart;
    }

    public String getCalendarId() {
        return calendarId;
    }

    public void setCalendarId(String calendarId) {
        this.calendarId = calendarId;
    }

    public Date getExceptionDateStart() {
        return exceptionDateStart;
    }

    public void setExceptionDateStart(Date exceptionDateStart) {
        this.exceptionDateStart = exceptionDateStart;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (calendarId != null ? calendarId.hashCode() : 0);
        hash += (exceptionDateStart != null ? exceptionDateStart.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TechDataCalendarExcWeekPK)) {
            return false;
        }
        TechDataCalendarExcWeekPK other = (TechDataCalendarExcWeekPK) object;
        if ((this.calendarId == null && other.calendarId != null) || (this.calendarId != null && !this.calendarId.equals(other.calendarId))) {
            return false;
        }
        if ((this.exceptionDateStart == null && other.exceptionDateStart != null) || (this.exceptionDateStart != null && !this.exceptionDateStart.equals(other.exceptionDateStart))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.TechDataCalendarExcWeekPK[ calendarId=" + calendarId + ", exceptionDateStart=" + exceptionDateStart + " ]";
    }
    
}
