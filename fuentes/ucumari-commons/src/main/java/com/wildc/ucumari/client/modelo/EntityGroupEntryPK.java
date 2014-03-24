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
public class EntityGroupEntryPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ENTITY_GROUP_ID")
    private String entityGroupId;
    @Basic(optional = false)
    @Column(name = "ENTITY_OR_PACKAGE")
    private String entityOrPackage;

    public EntityGroupEntryPK() {
    }

    public EntityGroupEntryPK(String entityGroupId, String entityOrPackage) {
        this.entityGroupId = entityGroupId;
        this.entityOrPackage = entityOrPackage;
    }

    public String getEntityGroupId() {
        return entityGroupId;
    }

    public void setEntityGroupId(String entityGroupId) {
        this.entityGroupId = entityGroupId;
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
        hash += (entityGroupId != null ? entityGroupId.hashCode() : 0);
        hash += (entityOrPackage != null ? entityOrPackage.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EntityGroupEntryPK)) {
            return false;
        }
        EntityGroupEntryPK other = (EntityGroupEntryPK) object;
        if ((this.entityGroupId == null && other.entityGroupId != null) || (this.entityGroupId != null && !this.entityGroupId.equals(other.entityGroupId))) {
            return false;
        }
        if ((this.entityOrPackage == null && other.entityOrPackage != null) || (this.entityOrPackage != null && !this.entityOrPackage.equals(other.entityOrPackage))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.EntityGroupEntryPK[ entityGroupId=" + entityGroupId + ", entityOrPackage=" + entityOrPackage + " ]";
    }
    
}
