/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

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
@Table(name = "tech_data_calendar")
@NamedQueries({
    @NamedQuery(name = "TechDataCalendar.findAll", query = "SELECT t FROM TechDataCalendar t")})
public class TechDataCalendar implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "techDataCalendar")
    private List<TechDataCalendarExcWeek> techDataCalendarExcWeekList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "techDataCalendar")
    private List<TechDataCalendarExcDay> techDataCalendarExcDayList;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CALENDAR_ID")
    private String calendarId;
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
    @OneToMany(mappedBy = "calendarId")
    private List<FixedAsset> fixedAssetList;
    @JoinColumn(name = "CALENDAR_WEEK_ID", referencedColumnName = "CALENDAR_WEEK_ID")
    @ManyToOne
    private TechDataCalendarWeek calendarWeekId;

    public TechDataCalendar() {
    }

    public TechDataCalendar(String calendarId) {
        this.calendarId = calendarId;
    }

    public String getCalendarId() {
        return calendarId;
    }

    public void setCalendarId(String calendarId) {
        this.calendarId = calendarId;
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

    public List<FixedAsset> getFixedAssetList() {
        return fixedAssetList;
    }

    public void setFixedAssetList(List<FixedAsset> fixedAssetList) {
        this.fixedAssetList = fixedAssetList;
    }

    public TechDataCalendarWeek getCalendarWeekId() {
        return calendarWeekId;
    }

    public void setCalendarWeekId(TechDataCalendarWeek calendarWeekId) {
        this.calendarWeekId = calendarWeekId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (calendarId != null ? calendarId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TechDataCalendar)) {
            return false;
        }
        TechDataCalendar other = (TechDataCalendar) object;
        if ((this.calendarId == null && other.calendarId != null) || (this.calendarId != null && !this.calendarId.equals(other.calendarId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.TechDataCalendar[ calendarId=" + calendarId + " ]";
    }

    public List<TechDataCalendarExcWeek> getTechDataCalendarExcWeekList() {
        return techDataCalendarExcWeekList;
    }

    public void setTechDataCalendarExcWeekList(List<TechDataCalendarExcWeek> techDataCalendarExcWeekList) {
        this.techDataCalendarExcWeekList = techDataCalendarExcWeekList;
    }

    public List<TechDataCalendarExcDay> getTechDataCalendarExcDayList() {
        return techDataCalendarExcDayList;
    }

    public void setTechDataCalendarExcDayList(List<TechDataCalendarExcDay> techDataCalendarExcDayList) {
        this.techDataCalendarExcDayList = techDataCalendarExcDayList;
    }
    
}
