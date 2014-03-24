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
public class EntitySyncIncludePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ENTITY_SYNC_ID")
    private String entitySyncId;
    @Basic(optional = false)
    @Column(name = "ENTITY_OR_PACKAGE")
    private String entityOrPackage;

    public EntitySyncIncludePK() {
    }

    public EntitySyncIncludePK(String entitySyncId, String entityOrPackage) {
        this.entitySyncId = entitySyncId;
        this.entityOrPackage = entityOrPackage;
    }

    public String getEntitySyncId() {
        return entitySyncId;
    }

    public void setEntitySyncId(String entitySyncId) {
        this.entitySyncId = entitySyncId;
    }

    public String getEntityOrPackage() {
        return entityOrPackage;
    }

    public void setEntityOrPackage(String entityOrPackage) {
        this.entityOrPackage = entityOrPackage;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (entitySyncId != null ? entitySyncId.hashCode() : 0);
        hash += (entityOrPackage != null ? entityOrPackage.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EntitySyncIncludePK)) {
            return false;
        }
        EntitySyncIncludePK other = (EntitySyncIncludePK) object;
        if ((this.entitySyncId == null && other.entitySyncId != null) || (this.entitySyncId != null && !this.entitySyncId.equals(other.entitySyncId))) {
            return false;
        }
        if ((this.entityOrPackage == null && other.entityOrPackage != null) || (this.entityOrPackage != null && !this.entityOrPackage.equals(other.entityOrPackage))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.EntitySyncIncludePK[ entitySyncId=" + entitySyncId + ", entityOrPackage=" + entityOrPackage + " ]";
    }
    
}
