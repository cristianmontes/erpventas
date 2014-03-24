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
@Table(name = "entity_group")
@NamedQueries({
    @NamedQuery(name = "EntityGroup.findAll", query = "SELECT e FROM EntityGroup e")})
public class EntityGroup implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ENTITY_GROUP_ID")
    private String entityGroupId;
    @Column(name = "ENTITY_GROUP_NAME")
    private String entityGroupName;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "entityGroup")
    private List<EntityGroupEntry> entityGroupEntryList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "entityGroup")
    private List<EntitySyncIncludeGroup> entitySyncIncludeGroupList;

    public EntityGroup() {
    }

    public EntityGroup(String entityGroupId) {
        this.entityGroupId = entityGroupId;
    }

    public String getEntityGroupId() {
        return entityGroupId;
    }

    public void setEntityGroupId(String entityGroupId) {
        this.entityGroupId = entityGroupId;
    }

    public String getEntityGroupName() {
        return entityGroupName;
    }

    public void setEntityGroupName(String entityGroupName) {
        this.entityGroupName = entityGroupName;
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

    public List<EntityGroupEntry> getEntityGroupEntryList() {
        return entityGroupEntryList;
    }

    public void setEntityGroupEntryList(List<EntityGroupEntry> entityGroupEntryList) {
        this.entityGroupEntryList = entityGroupEntryList;
    }

    public List<EntitySyncIncludeGroup> getEntitySyncIncludeGroupList() {
        return entitySyncIncludeGroupList;
    }

    public void setEntitySyncIncludeGroupList(List<EntitySyncIncludeGroup> entitySyncIncludeGroupList) {
        this.entitySyncIncludeGroupList = entitySyncIncludeGroupList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (entityGroupId != null ? entityGroupId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EntityGroup)) {
            return false;
        }
        EntityGroup other = (EntityGroup) object;
        if ((this.entityGroupId == null && other.entityGroupId != null) || (this.entityGroupId != null && !this.entityGroupId.equals(other.entityGroupId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.EntityGroup[ entityGroupId=" + entityGroupId + " ]";
    }
    
}
