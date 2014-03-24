/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "tech_data_calendar_week")
@NamedQueries({
    @NamedQuery(name = "TechDataCalendarWeek.findAll", query = "SELECT t FROM TechDataCalendarWeek t")})
public class TechDataCalendarWeek implements Serializable {
    @OneToMany(mappedBy = "calendarWeekId")
    private List<TechDataCalendarExcWeek> techDataCalendarExcWeekList;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CALENDAR_WEEK_ID")
    private String calendarWeekId;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "MONDAY_START_TIME")
    @Temporal(TemporalType.TIME)
    private Date mondayStartTime;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MONDAY_CAPACITY")
    private BigDecimal mondayCapacity;
    @Column(name = "TUESDAY_START_TIME")
    @Temporal(TemporalType.TIME)
    private Date tuesdayStartTime;
    @Column(name = "TUESDAY_CAPACITY")
    private BigDecimal tuesdayCapacity;
    @Column(name = "WEDNESDAY_START_TIME")
    @Temporal(TemporalType.TIME)
    private Date wednesdayStartTime;
    @Column(name = "WEDNESDAY_CAPACITY")
    private BigDecimal wednesdayCapacity;
    @Column(name = "THURSDAY_START_TIME")
    @Temporal(TemporalType.TIME)
    private Date thursdayStartTime;
    @Column(name = "THURSDAY_CAPACITY")
    private BigDecimal thursdayCapacity;
    @Column(name = "FRIDAY_START_TIME")
    @Temporal(TemporalType.TIME)
    private Date fridayStartTime;
    @Column(name = "FRIDAY_CAPACITY")
    private BigDecimal fridayCapacity;
    @Column(name = "SATURDAY_START_TIME")
    @Temporal(TemporalType.TIME)
    private Date saturdayStartTime;
    @Column(name = "SATURDAY_CAPACITY")
    private BigDecimal saturdayCapacity;
    @Column(name = "SUNDAY_START_TIME")
    @Temporal(TemporalType.TIME)
    private Date sundayStartTime;
    @Column(name = "SUNDAY_CAPACITY")
    private BigDecimal sundayCapacity;
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
    @OneToMany(mappedBy = "calendarWeekId")
    private List<TechDataCalendar> techDataCalendarList;

    public TechDataCalendarWeek() {
    }

    public TechDataCalendarWeek(String calendarWeekId) {
        this.calendarWeekId = calendarWeekId;
    }

    public String getCalendarWeekId() {
        return calendarWeekId;
    }

    public void setCalendarWeekId(String calendarWeekId) {
        this.calendarWeekId = calendarWeekId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getMondayStartTime() {
        return mondayStartTime;
    }

    public void setMondayStartTime(Date mondayStartTime) {
        this.mondayStartTime = mondayStartTime;
    }

    public BigDecimal getMondayCapacity() {
        return mondayCapacity;
    }

    public void setMondayCapacity(BigDecimal mondayCapacity) {
        this.mondayCapacity = mondayCapacity;
    }

    public Date getTuesdayStartTime() {
        return tuesdayStartTime;
    }

    public void setTuesdayStartTime(Date tuesdayStartTime) {
        this.tuesdayStartTime = tuesdayStartTime;
    }

    public BigDecimal getTuesdayCapacity() {
        return tuesdayCapacity;
    }

    public void setTuesdayCapacity(BigDecimal tuesdayCapacity) {
        this.tuesdayCapacity = tuesdayCapacity;
    }

    public Date getWednesdayStartTime() {
        return wednesdayStartTime;
    }

    public void setWednesdayStartTime(Date wednesdayStartTime) {
        this.wednesdayStartTime = wednesdayStartTime;
    }

    public BigDecimal getWednesdayCapacity() {
        return wednesdayCapacity;
    }

    public void setWednesdayCapacity(BigDecimal wednesdayCapacity) {
        this.wednesdayCapacity = wednesdayCapacity;
    }

    public Date getThursdayStartTime() {
        return thursdayStartTime;
    }

    public void setThursdayStartTime(Date thursdayStartTime) {
        this.thursdayStartTime = thursdayStartTime;
    }

    public BigDecimal getThursdayCapacity() {
        return thursdayCapacity;
    }

    public void setThursdayCapacity(BigDecimal thursdayCapacity) {
        this.thursdayCapacity = thursdayCapacity;
    }

    public Date getFridayStartTime() {
        return fridayStartTime;
    }

    public void setFridayStartTime(Date fridayStartTime) {
        this.fridayStartTime = fridayStartTime;
    }

    public BigDecimal getFridayCapacity() {
        return fridayCapacity;
    }

    public void setFridayCapacity(BigDecimal fridayCapacity) {
        this.fridayCapacity = fridayCapacity;
    }

    public Date getSaturdayStartTime() {
        return saturdayStartTime;
    }

    public void setSaturdayStartTime(Date saturdayStartTime) {
        this.saturdayStartTime = saturdayStartTime;
    }

    public BigDecimal getSaturdayCapacity() {
        return saturdayCapacity;
    }

    public void setSaturdayCapacity(BigDecimal saturdayCapacity) {
        this.saturdayCapacity = saturdayCapacity;
    }

    public Date getSundayStartTime() {
        return sundayStartTime;
    }

    public void setSundayStartTime(Date sundayStartTime) {
        this.sundayStartTime = sundayStartTime;
    }

    public BigDecimal getSundayCapacity() {
        return sundayCapacity;
    }

    public void setSundayCapacity(BigDecimal sundayCapacity) {
        this.sundayCapacity = sundayCapacity;
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

    public List<TechDataCalendar> getTechDataCalendarList() {
        return techDataCalendarList;
    }

    public void setTechDataCalendarList(List<TechDataCalendar> techDataCalendarList) {
        this.techDataCalendarList = techDataCalendarList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (calendarWeekId != null ? calendarWeekId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TechDataCalendarWeek)) {
            return false;
        }
        TechDataCalendarWeek other = (TechDataCalendarWeek) object;
        if ((this.calendarWeekId == null && other.calendarWeekId != null) || (this.calendarWeekId != null && !this.calendarWeekId.equals(other.calendarWeekId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.TechDataCalendarWeek[ calendarWeekId=" + calendarWeekId + " ]";
    }

    public List<TechDataCalendarExcWeek> getTechDataCalendarExcWeekList() {
        return techDataCalendarExcWeekList;
    }

    public void setTechDataCalendarExcWeekList(List<TechDataCalendarExcWeek> techDataCalendarExcWeekList) {
        this.techDataCalendarExcWeekList = techDataCalendarExcWeekList;
    }
    
}
