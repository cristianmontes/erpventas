/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import com.wildc.ucumari.parameters.model.StatusItem;
import com.wildc.ucumari.security.model.UserLogin;
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
@Table(name = "work_effort_status")
@NamedQueries({
    @NamedQuery(name = "WorkEffortStatus.findAll", query = "SELECT w FROM WorkEffortStatus w")})
public class WorkEffortStatus implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected WorkEffortStatusPK workEffortStatusPK;
    @Column(name = "REASON")
    private String reason;
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
    @JoinColumn(name = "WORK_EFFORT_ID", referencedColumnName = "WORK_EFFORT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private WorkEffort workEffort;
    @JoinColumn(name = "STATUS_ID", referencedColumnName = "STATUS_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private StatusItem statusItem;
    @JoinColumn(name = "SET_BY_USER_LOGIN", referencedColumnName = "USER_LOGIN_ID")
    @ManyToOne
    private UserLogin setByUserLogin;

    public WorkEffortStatus() {
    }

    public WorkEffortStatus(WorkEffortStatusPK workEffortStatusPK) {
        this.workEffortStatusPK = workEffortStatusPK;
    }

    public WorkEffortStatus(String workEffortId, String statusId, Date statusDatetime) {
        this.workEffortStatusPK = new WorkEffortStatusPK(workEffortId, statusId, statusDatetime);
    }

    public WorkEffortStatusPK getWorkEffortStatusPK() {
        return workEffortStatusPK;
    }

    public void setWorkEffortStatusPK(WorkEffortStatusPK workEffortStatusPK) {
        this.workEffortStatusPK = workEffortStatusPK;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
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

    public WorkEffort getWorkEffort() {
        return workEffort;
    }

    public void setWorkEffort(WorkEffort workEffort) {
        this.workEffort = workEffort;
    }

    public StatusItem getStatusItem() {
        return statusItem;
    }

    public void setStatusItem(StatusItem statusItem) {
        this.statusItem = statusItem;
    }

    public UserLogin getSetByUserLogin() {
        return setByUserLogin;
    }

    public void setSetByUserLogin(UserLogin setByUserLogin) {
        this.setByUserLogin = setByUserLogin;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (workEffortStatusPK != null ? workEffortStatusPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WorkEffortStatus)) {
            return false;
        }
        WorkEffortStatus other = (WorkEffortStatus) object;
        if ((this.workEffortStatusPK == null && other.workEffortStatusPK != null) || (this.workEffortStatusPK != null && !this.workEffortStatusPK.equals(other.workEffortStatusPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.WorkEffortStatus[ workEffortStatusPK=" + workEffortStatusPK + " ]";
    }
    
}
