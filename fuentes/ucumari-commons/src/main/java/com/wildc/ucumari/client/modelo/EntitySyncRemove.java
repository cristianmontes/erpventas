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
import javax.persistence.Lob;
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
@Table(name = "entity_sync_remove")
@NamedQueries({
    @NamedQuery(name = "EntitySyncRemove.findAll", query = "SELECT e FROM EntitySyncRemove e")})
public class EntitySyncRemove implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ENTITY_SYNC_REMOVE_ID")
    private String entitySyncRemoveId;
    @Lob
    @Column(name = "PRIMARY_KEY_REMOVED")
    private String primaryKeyRemoved;
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

    public EntitySyncRemove() {
    }

    public EntitySyncRemove(String entitySyncRemoveId) {
        this.entitySyncRemoveId = entitySyncRemoveId;
    }

    public String getEntitySyncRemoveId() {
        return entitySyncRemoveId;
    }

    public void setEntitySyncRemoveId(String entitySyncRemoveId) {
        this.entitySyncRemoveId = entitySyncRemoveId;
    }

    public String getPrimaryKeyRemoved() {
        return primaryKeyRemoved;
    }

    public void setPrimaryKeyRemoved(String primaryKeyRemoved) {
        this.primaryKeyRemoved = primaryKeyRemoved;
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
        hash += (entitySyncRemoveId != null ? entitySyncRemoveId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EntitySyncRemove)) {
            return false;
        }
        EntitySyncRemove other = (EntitySyncRemove) object;
        if ((this.entitySyncRemoveId == null && other.entitySyncRemoveId != null) || (this.entitySyncRemoveId != null && !this.entitySyncRemoveId.equals(other.entitySyncRemoveId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.EntitySyncRemove[ entitySyncRemoveId=" + entitySyncRemoveId + " ]";
    }
    
}
