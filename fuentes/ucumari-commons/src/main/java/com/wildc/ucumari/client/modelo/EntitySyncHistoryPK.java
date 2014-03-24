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
public class EntitySyncHistoryPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ENTITY_SYNC_ID")
    private String entitySyncId;
    @Basic(optional = false)
    @Column(name = "START_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;

    public EntitySyncHistoryPK() {
    }

    public EntitySyncHistoryPK(String entitySyncId, Date startDate) {
        this.entitySyncId = entitySyncId;
        this.startDate = startDate;
    }

    public String getEntitySyncId() {
        return entitySyncId;
    }

    public void setEntitySyncId(String entitySyncId) {
        this.entitySyncId = entitySyncId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (entitySyncId != null ? entitySyncId.hashCode() : 0);
        hash += (startDate != null ? startDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EntitySyncHistoryPK)) {
            return false;
        }
        EntitySyncHistoryPK other = (EntitySyncHistoryPK) object;
        if ((this.entitySyncId == null && other.entitySyncId != null) || (this.entitySyncId != null && !this.entitySyncId.equals(other.entitySyncId))) {
            return false;
        }
        if ((this.startDate == null && other.startDate != null) || (this.startDate != null && !this.startDate.equals(other.startDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.EntitySyncHistoryPK[ entitySyncId=" + entitySyncId + ", startDate=" + startDate + " ]";
    }

}
