/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "tech_data_calendar_exc_day")
@NamedQueries({
    @NamedQuery(name = "TechDataCalendarExcDay.findAll", query = "SELECT t FROM TechDataCalendarExcDay t")})
public class TechDataCalendarExcDay implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TechDataCalendarExcDayPK techDataCalendarExcDayPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "EXCEPTION_CAPACITY")
    private BigDecimal exceptionCapacity;
    @Column(name = "USED_CAPACITY")
    private BigDecimal usedCapacity;
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
    @JoinColumn(name = "CALENDAR_ID", referencedColumnName = "CALENDAR_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TechDataCalendar techDataCalendar;

    public TechDataCalendarExcDay() {
    }

    public TechDataCalendarExcDay(TechDataCalendarExcDayPK techDataCalendarExcDayPK) {
        this.techDataCalendarExcDayPK = techDataCalendarExcDayPK;
    }

    public TechDataCalendarExcDay(String calendarId, Date exceptionDateStartTime) {
        this.techDataCalendarExcDayPK = new TechDataCalendarExcDayPK(calendarId, exceptionDateStartTime);
    }

    public TechDataCalendarExcDayPK getTechDataCalendarExcDayPK() {
        return techDataCalendarExcDayPK;
    }

    public void setTechDataCalendarExcDayPK(TechDataCalendarExcDayPK techDataCalendarExcDayPK) {
        this.techDataCalendarExcDayPK = techDataCalendarExcDayPK;
    }

    public BigDecimal getExceptionCapacity() {
        return exceptionCapacity;
    }

    public void setExceptionCapacity(BigDecimal exceptionCapacity) {
        this.exceptionCapacity = exceptionCapacity;
    }

    public BigDecimal getUsedCapacity() {
        return usedCapacity;
    }

    public void setUsedCapacity(BigDecimal usedCapacity) {
        this.usedCapacity = usedCapacity;
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

    public TechDataCalendar getTechDataCalendar() {
        return techDataCalendar;
    }

    public void setTechDataCalendar(TechDataCalendar techDataCalendar) {
        this.techDataCalendar = techDataCalendar;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (techDataCalendarExcDayPK != null ? techDataCalendarExcDayPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TechDataCalendarExcDay)) {
            return false;
        }
        TechDataCalendarExcDay other = (TechDataCalendarExcDay) object;
        if ((this.techDataCalendarExcDayPK == null && other.techDataCalendarExcDayPK != null) || (this.techDataCalendarExcDayPK != null && !this.techDataCalendarExcDayPK.equals(other.techDataCalendarExcDayPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.TechDataCalendarExcDay[ techDataCalendarExcDayPK=" + techDataCalendarExcDayPK + " ]";
    }
    
}
