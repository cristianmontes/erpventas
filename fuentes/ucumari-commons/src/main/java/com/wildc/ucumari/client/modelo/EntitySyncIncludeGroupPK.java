/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class EntitySyncIncludeGroupPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ENTITY_SYNC_ID")
    private String entitySyncId;
    @Basic(optional = false)
    @Column(name = "ENTITY_GROUP_ID")
    private String entityGroupId;

    public EntitySyncIncludeGroupPK() {
    }

    public EntitySyncIncludeGroupPK(String entitySyncId, String entityGroupId) {
        this.entitySyncId = entitySyncId;
        this.entityGroupId = entityGroupId;
    }

    public String getEntitySyncId() {
        return entitySyncId;
    }

    public void setEntitySyncId(String entitySyncId) {
        this.entitySyncId = entitySyncId;
    }

    public String getEntityGroupId() {
        return entityGroupId;
    }

    public void setEntityGroupId(String entityGroupId) {
        this.entityGroupId = entityGroupId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (entitySyncId != null ? entitySyncId.hashCode() : 0);
        hash += (entityGroupId != null ? entityGroupId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EntitySyncIncludeGroupPK)) {
            return false;
        }
        EntitySyncIncludeGroupPK other = (EntitySyncIncludeGroupPK) object;
        if ((this.entitySyncId == null && other.entitySyncId != null) || (this.entitySyncId != null && !this.entitySyncId.equals(other.entitySyncId))) {
            return false;
        }
        if ((this.entityGroupId == null && other.entityGroupId != null) || (this.entityGroupId != null && !this.entityGroupId.equals(other.entityGroupId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.EntitySyncIncludeGroupPK[ entitySyncId=" + entitySyncId + ", entityGroupId=" + entityGroupId + " ]";
    }
    
}
