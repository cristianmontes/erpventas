/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import com.wildc.ucumari.party.model.Party;
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
@Table(name = "empl_leave")
@NamedQueries({
    @NamedQuery(name = "EmplLeave.findAll", query = "SELECT e FROM EmplLeave e")})
public class EmplLeave implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EmplLeavePK emplLeavePK;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
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
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Party party;
    @JoinColumn(name = "LEAVE_TYPE_ID", referencedColumnName = "LEAVE_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private EmplLeaveType emplLeaveType;

    public EmplLeave() {
    }

    public EmplLeave(EmplLeavePK emplLeavePK) {
        this.emplLeavePK = emplLeavePK;
    }

    public EmplLeave(String partyId, String leaveTypeId, Date fromDate) {
        this.emplLeavePK = new EmplLeavePK(partyId, leaveTypeId, fromDate);
    }

    public EmplLeavePK getEmplLeavePK() {
        return emplLeavePK;
    }

    public void setEmplLeavePK(EmplLeavePK emplLeavePK) {
        this.emplLeavePK = emplLeavePK;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
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

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    public EmplLeaveType getEmplLeaveType() {
        return emplLeaveType;
    }

    public void setEmplLeaveType(EmplLeaveType emplLeaveType) {
        this.emplLeaveType = emplLeaveType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (emplLeavePK != null ? emplLeavePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmplLeave)) {
            return false;
        }
        EmplLeave other = (EmplLeave) object;
        if ((this.emplLeavePK == null && other.emplLeavePK != null) || (this.emplLeavePK != null && !this.emplLeavePK.equals(other.emplLeavePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.EmplLeave[ emplLeavePK=" + emplLeavePK + " ]";
    }
    
}
