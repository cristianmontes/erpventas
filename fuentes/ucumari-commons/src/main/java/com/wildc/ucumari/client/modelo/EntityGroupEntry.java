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
@Table(name = "entity_group_entry")
@NamedQueries({
    @NamedQuery(name = "EntityGroupEntry.findAll", query = "SELECT e FROM EntityGroupEntry e")})
public class EntityGroupEntry implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EntityGroupEntryPK entityGroupEntryPK;
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
    @JoinColumn(name = "ENTITY_GROUP_ID", referencedColumnName = "ENTITY_GROUP_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private EntityGroup entityGroup;

    public EntityGroupEntry() {
    }

    public EntityGroupEntry(EntityGroupEntryPK entityGroupEntryPK) {
        this.entityGroupEntryPK = entityGroupEntryPK;
    }

    public EntityGroupEntry(String entityGroupId, String entityOrPackage) {
        this.entityGroupEntryPK = new EntityGroupEntryPK(entityGroupId, entityOrPackage);
    }

    public EntityGroupEntryPK getEntityGroupEntryPK() {
        return entityGroupEntryPK;
    }

    public void setEntityGroupEntryPK(EntityGroupEntryPK entityGroupEntryPK) {
        this.entityGroupEntryPK = entityGroupEntryPK;
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

    public EntityGroup getEntityGroup() {
        return entityGroup;
    }

    public void setEntityGroup(EntityGroup entityGroup) {
        this.entityGroup = entityGroup;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (entityGroupEntryPK != null ? entityGroupEntryPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EntityGroupEntry)) {
            return false;
        }
        EntityGroupEntry other = (EntityGroupEntry) object;
        if ((this.entityGroupEntryPK == null && other.entityGroupEntryPK != null) || (this.entityGroupEntryPK != null && !this.entityGroupEntryPK.equals(other.entityGroupEntryPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.EntityGroupEntry[ entityGroupEntryPK=" + entityGroupEntryPK + " ]";
    }
    
}
