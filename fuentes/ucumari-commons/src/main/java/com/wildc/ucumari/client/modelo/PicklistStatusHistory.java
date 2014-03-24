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
import javax.persistence.JoinColumns;
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
@Table(name = "picklist_status_history")
@NamedQueries({
    @NamedQuery(name = "PicklistStatusHistory.findAll", query = "SELECT p FROM PicklistStatusHistory p")})
public class PicklistStatusHistory implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PicklistStatusHistoryPK picklistStatusHistoryPK;
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
    @JoinColumn(name = "STATUS_ID_TO", referencedColumnName = "STATUS_ID")
    @ManyToOne
    private StatusItem statusIdTo;
    @JoinColumns({
        @JoinColumn(name = "STATUS_ID", referencedColumnName = "STATUS_ID"),
        @JoinColumn(name = "STATUS_ID_TO", referencedColumnName = "STATUS_ID_TO")})
    @ManyToOne
    private StatusValidChange statusValidChange;
    @JoinColumn(name = "PICKLIST_ID", referencedColumnName = "PICKLIST_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Picklist picklist;
    @JoinColumn(name = "STATUS_ID", referencedColumnName = "STATUS_ID")
    @ManyToOne
    private StatusItem statusId;
    @JoinColumn(name = "CHANGE_USER_LOGIN_ID", referencedColumnName = "USER_LOGIN_ID")
    @ManyToOne
    private UserLogin changeUserLoginId;

    public PicklistStatusHistory() {
    }

    public PicklistStatusHistory(PicklistStatusHistoryPK picklistStatusHistoryPK) {
        this.picklistStatusHistoryPK = picklistStatusHistoryPK;
    }

    public PicklistStatusHistory(String picklistId, Date changeDate) {
        this.picklistStatusHistoryPK = new PicklistStatusHistoryPK(picklistId, changeDate);
    }

    public PicklistStatusHistoryPK getPicklistStatusHistoryPK() {
        return picklistStatusHistoryPK;
    }

    public void setPicklistStatusHistoryPK(PicklistStatusHistoryPK picklistStatusHistoryPK) {
        this.picklistStatusHistoryPK = picklistStatusHistoryPK;
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

    public StatusItem getStatusIdTo() {
        return statusIdTo;
    }

    public void setStatusIdTo(StatusItem statusIdTo) {
        this.statusIdTo = statusIdTo;
    }

    public StatusValidChange getStatusValidChange() {
        return statusValidChange;
    }

    public void setStatusValidChange(StatusValidChange statusValidChange) {
        this.statusValidChange = statusValidChange;
    }

    public Picklist getPicklist() {
        return picklist;
    }

    public void setPicklist(Picklist picklist) {
        this.picklist = picklist;
    }

    public StatusItem getStatusId() {
        return statusId;
    }

    public void setStatusId(StatusItem statusId) {
        this.statusId = statusId;
    }

    public UserLogin getChangeUserLoginId() {
        return changeUserLoginId;
    }

    public void setChangeUserLoginId(UserLogin changeUserLoginId) {
        this.changeUserLoginId = changeUserLoginId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (picklistStatusHistoryPK != null ? picklistStatusHistoryPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PicklistStatusHistory)) {
            return false;
        }
        PicklistStatusHistory other = (PicklistStatusHistory) object;
        if ((this.picklistStatusHistoryPK == null && other.picklistStatusHistoryPK != null) || (this.picklistStatusHistoryPK != null && !this.picklistStatusHistoryPK.equals(other.picklistStatusHistoryPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PicklistStatusHistory[ picklistStatusHistoryPK=" + picklistStatusHistoryPK + " ]";
    }
    
}
