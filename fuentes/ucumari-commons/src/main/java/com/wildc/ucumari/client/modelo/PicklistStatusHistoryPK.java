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
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Embeddable
public class PicklistStatusHistoryPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PICKLIST_ID")
    private String picklistId;
    @Basic(optional = false)
    @Column(name = "CHANGE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date changeDate;

    public PicklistStatusHistoryPK() {
    }

    public PicklistStatusHistoryPK(String picklistId, Date changeDate) {
        this.picklistId = picklistId;
        this.changeDate = changeDate;
    }

    public String getPicklistId() {
        return picklistId;
    }

    public void setPicklistId(String picklistId) {
        this.picklistId = picklistId;
    }

    public Date getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(Date changeDate) {
        this.changeDate = changeDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (picklistId != null ? picklistId.hashCode() : 0);
        hash += (changeDate != null ? changeDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PicklistStatusHistoryPK)) {
            return false;
        }
        PicklistStatusHistoryPK other = (PicklistStatusHistoryPK) object;
        if ((this.picklistId == null && other.picklistId != null) || (this.picklistId != null && !this.picklistId.equals(other.picklistId))) {
            return false;
        }
        if ((this.changeDate == null && other.changeDate != null) || (this.changeDate != null && !this.changeDate.equals(other.changeDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PicklistStatusHistoryPK[ picklistId=" + picklistId + ", changeDate=" + changeDate + " ]";
    }
    
}
