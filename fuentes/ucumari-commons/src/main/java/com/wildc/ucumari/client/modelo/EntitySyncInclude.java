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
@Table(name = "entity_sync_include")
@NamedQueries({
    @NamedQuery(name = "EntitySyncInclude.findAll", query = "SELECT e FROM EntitySyncInclude e")})
public class EntitySyncInclude implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EntitySyncIncludePK entitySyncIncludePK;
    @Column(name = "APPL_ENUM_ID")
    private String applEnumId;
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
    @JoinColumn(name = "ENTITY_SYNC_ID", referencedColumnName = "ENTITY_SYNC_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private EntitySync entitySync;

    public EntitySyncInclude() {
    }

    public EntitySyncInclude(EntitySyncIncludePK entitySyncIncludePK) {
        this.entitySyncIncludePK = entitySyncIncludePK;
    }

    public EntitySyncInclude(String entitySyncId, String entityOrPackage) {
        this.entitySyncIncludePK = new EntitySyncIncludePK(entitySyncId, entityOrPackage);
    }

    public EntitySyncIncludePK getEntitySyncIncludePK() {
        return entitySyncIncludePK;
    }

    public void setEntitySyncIncludePK(EntitySyncIncludePK entitySyncIncludePK) {
        this.entitySyncIncludePK = entitySyncIncludePK;
    }

    public String getApplEnumId() {
        return applEnumId;
    }

    public void setApplEnumId(String applEnumId) {
        this.applEnumId = applEnumId;
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

    public EntitySync getEntitySync() {
        return entitySync;
    }

    public void setEntitySync(EntitySync entitySync) {
        this.entitySync = entitySync;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (entitySyncIncludePK != null ? entitySyncIncludePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EntitySyncInclude)) {
            return false;
        }
        EntitySyncInclude other = (EntitySyncInclude) object;
        if ((this.entitySyncIncludePK == null && other.entitySyncIncludePK != null) || (this.entitySyncIncludePK != null && !this.entitySyncIncludePK.equals(other.entitySyncIncludePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.EntitySyncInclude[ entitySyncIncludePK=" + entitySyncIncludePK + " ]";
    }
    
}
