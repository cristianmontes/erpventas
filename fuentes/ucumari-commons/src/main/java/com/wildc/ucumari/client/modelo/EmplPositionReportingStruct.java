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
@Table(name = "empl_position_reporting_struct")
@NamedQueries({
    @NamedQuery(name = "EmplPositionReportingStruct.findAll", query = "SELECT e FROM EmplPositionReportingStruct e")})
public class EmplPositionReportingStruct implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EmplPositionReportingStructPK emplPositionReportingStructPK;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
    @Column(name = "COMMENTS")
    private String comments;
    @Column(name = "PRIMARY_FLAG")
    private Character primaryFlag;
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
    @JoinColumn(name = "EMPL_POSITION_ID_REPORTING_TO", referencedColumnName = "EMPL_POSITION_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private EmplPosition emplPosition;
    @JoinColumn(name = "EMPL_POSITION_ID_MANAGED_BY", referencedColumnName = "EMPL_POSITION_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private EmplPosition emplPosition1;

    public EmplPositionReportingStruct() {
    }

    public EmplPositionReportingStruct(EmplPositionReportingStructPK emplPositionReportingStructPK) {
        this.emplPositionReportingStructPK = emplPositionReportingStructPK;
    }

    public EmplPositionReportingStruct(String emplPositionIdReportingTo, String emplPositionIdManagedBy, Date fromDate) {
        this.emplPositionReportingStructPK = new EmplPositionReportingStructPK(emplPositionIdReportingTo, emplPositionIdManagedBy, fromDate);
    }

    public EmplPositionReportingStructPK getEmplPositionReportingStructPK() {
        return emplPositionReportingStructPK;
    }

    public void setEmplPositionReportingStructPK(EmplPositionReportingStructPK emplPositionReportingStructPK) {
        this.emplPositionReportingStructPK = emplPositionReportingStructPK;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Character getPrimaryFlag() {
        return primaryFlag;
    }

    public void setPrimaryFlag(Character primaryFlag) {
        this.primaryFlag = primaryFlag;
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

    public EmplPosition getEmplPosition() {
        return emplPosition;
    }

    public void setEmplPosition(EmplPosition emplPosition) {
        this.emplPosition = emplPosition;
    }

    public EmplPosition getEmplPosition1() {
        return emplPosition1;
    }

    public void setEmplPosition1(EmplPosition emplPosition1) {
        this.emplPosition1 = emplPosition1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (emplPositionReportingStructPK != null ? emplPositionReportingStructPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmplPositionReportingStruct)) {
            return false;
        }
        EmplPositionReportingStruct other = (EmplPositionReportingStruct) object;
        if ((this.emplPositionReportingStructPK == null && other.emplPositionReportingStructPK != null) || (this.emplPositionReportingStructPK != null && !this.emplPositionReportingStructPK.equals(other.emplPositionReportingStructPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.EmplPositionReportingStruct[ emplPositionReportingStructPK=" + emplPositionReportingStructPK + " ]";
    }
    
}
