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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.parameters.model.PeriodType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "standard_time_period")
@NamedQueries({
    @NamedQuery(name = "StandardTimePeriod.findAll", query = "SELECT s FROM StandardTimePeriod s")})
public class StandardTimePeriod implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "STANDARD_TIME_PERIOD_ID")
    private String standardTimePeriodId;
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
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
    @JoinColumn(name = "PERIOD_TYPE_ID", referencedColumnName = "PERIOD_TYPE_ID")
    @ManyToOne
    private PeriodType periodTypeId;

    public StandardTimePeriod() {
    }

    public StandardTimePeriod(String standardTimePeriodId) {
        this.standardTimePeriodId = standardTimePeriodId;
    }

    public String getStandardTimePeriodId() {
        return standardTimePeriodId;
    }

    public void setStandardTimePeriodId(String standardTimePeriodId) {
        this.standardTimePeriodId = standardTimePeriodId;
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

    public PeriodType getPeriodTypeId() {
        return periodTypeId;
    }

    public void setPeriodTypeId(PeriodType periodTypeId) {
        this.periodTypeId = periodTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (standardTimePeriodId != null ? standardTimePeriodId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StandardTimePeriod)) {
            return false;
        }
        StandardTimePeriod other = (StandardTimePeriod) object;
        if ((this.standardTimePeriodId == null && other.standardTimePeriodId != null) || (this.standardTimePeriodId != null && !this.standardTimePeriodId.equals(other.standardTimePeriodId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.StandardTimePeriod[ standardTimePeriodId=" + standardTimePeriodId + " ]";
    }
    
}
