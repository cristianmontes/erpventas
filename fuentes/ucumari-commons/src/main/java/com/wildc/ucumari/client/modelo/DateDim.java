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
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "date_dim")
@NamedQueries({
    @NamedQuery(name = "DateDim.findAll", query = "SELECT d FROM DateDim d")})
public class DateDim implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DATE_DIM_ID")
    private Long dateDimId;
    @Column(name = "DAY_OF_MONTH")
    private String dayOfMonth;
    @Column(name = "WEEK_OF_YEAR")
    private String weekOfYear;
    @Column(name = "MONTH_OF_YEAR")
    private String monthOfYear;
    @Column(name = "YEAR_NUMBER")
    private String yearNumber;
    @Column(name = "QUARTER")
    private String quarter;
    @Column(name = "NAME_DAY")
    private String nameDay;
    @Column(name = "NAME_MONTH")
    private String nameMonth;
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

    public DateDim() {
    }

    public DateDim(Long dateDimId) {
        this.dateDimId = dateDimId;
    }

    public Long getDateDimId() {
        return dateDimId;
    }

    public void setDateDimId(Long dateDimId) {
        this.dateDimId = dateDimId;
    }

    public String getDayOfMonth() {
        return dayOfMonth;
    }

    public void setDayOfMonth(String dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    public String getWeekOfYear() {
        return weekOfYear;
    }

    public void setWeekOfYear(String weekOfYear) {
        this.weekOfYear = weekOfYear;
    }

    public String getMonthOfYear() {
        return monthOfYear;
    }

    public void setMonthOfYear(String monthOfYear) {
        this.monthOfYear = monthOfYear;
    }

    public String getYearNumber() {
        return yearNumber;
    }

    public void setYearNumber(String yearNumber) {
        this.yearNumber = yearNumber;
    }

    public String getQuarter() {
        return quarter;
    }

    public void setQuarter(String quarter) {
        this.quarter = quarter;
    }

    public String getNameDay() {
        return nameDay;
    }

    public void setNameDay(String nameDay) {
        this.nameDay = nameDay;
    }

    public String getNameMonth() {
        return nameMonth;
    }

    public void setNameMonth(String nameMonth) {
        this.nameMonth = nameMonth;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dateDimId != null ? dateDimId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DateDim)) {
            return false;
        }
        DateDim other = (DateDim) object;
        if ((this.dateDimId == null && other.dateDimId != null) || (this.dateDimId != null && !this.dateDimId.equals(other.dateDimId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.DateDim[ dateDimId=" + dateDimId + " ]";
    }
    
}
