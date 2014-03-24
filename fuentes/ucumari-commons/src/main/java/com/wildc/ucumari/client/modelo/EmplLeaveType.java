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
@Table(name = "empl_leave_type")
@NamedQueries({
    @NamedQuery(name = "EmplLeaveType.findAll", query = "SELECT e FROM EmplLeaveType e")})
public class EmplLeaveType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LEAVE_TYPE_ID")
    private String leaveTypeId;
    @Column(name = "HAS_TABLE")
    private Character hasTable;
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
    @OneToMany(mappedBy = "parentTypeId")
    private List<EmplLeaveType> emplLeaveTypeList;
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "LEAVE_TYPE_ID")
    @ManyToOne
    private EmplLeaveType parentTypeId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "emplLeaveType")
    private List<EmplLeave> emplLeaveList;

    public EmplLeaveType() {
    }

    public EmplLeaveType(String leaveTypeId) {
        this.leaveTypeId = leaveTypeId;
    }

    public String getLeaveTypeId() {
        return leaveTypeId;
    }

    public void setLeaveTypeId(String leaveTypeId) {
        this.leaveTypeId = leaveTypeId;
    }

    public Character getHasTable() {
        return hasTable;
    }

    public void setHasTable(Character hasTable) {
        this.hasTable = hasTable;
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

    public List<EmplLeaveType> getEmplLeaveTypeList() {
        return emplLeaveTypeList;
    }

    public void setEmplLeaveTypeList(List<EmplLeaveType> emplLeaveTypeList) {
        this.emplLeaveTypeList = emplLeaveTypeList;
    }

    public EmplLeaveType getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(EmplLeaveType parentTypeId) {
        this.parentTypeId = parentTypeId;
    }

    public List<EmplLeave> getEmplLeaveList() {
        return emplLeaveList;
    }

    public void setEmplLeaveList(List<EmplLeave> emplLeaveList) {
        this.emplLeaveList = emplLeaveList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (leaveTypeId != null ? leaveTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmplLeaveType)) {
            return false;
        }
        EmplLeaveType other = (EmplLeaveType) object;
        if ((this.leaveTypeId == null && other.leaveTypeId != null) || (this.leaveTypeId != null && !this.leaveTypeId.equals(other.leaveTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.EmplLeaveType[ leaveTypeId=" + leaveTypeId + " ]";
    }
    
}
