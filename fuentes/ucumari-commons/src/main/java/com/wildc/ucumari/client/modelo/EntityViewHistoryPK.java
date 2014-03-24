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
public class EntityViewHistoryPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ENTITY_NAME")
    private String entityName;
    @Basic(optional = false)
    @Column(name = "USER_LOGIN_ID")
    private String userLoginId;
    @Basic(optional = false)
    @Column(name = "PRIMARY_KEY_ID")
    private String primaryKeyId;

    public EntityViewHistoryPK() {
    }

    public EntityViewHistoryPK(String entityName, String userLoginId, String primaryKeyId) {
        this.entityName = entityName;
        this.userLoginId = userLoginId;
        this.primaryKeyId = primaryKeyId;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public String getUserLoginId() {
        return userLoginId;
    }

    public void setUserLoginId(String userLoginId) {
        this.userLoginId = userLoginId;
    }

    public String getPrimaryKeyId() {
        return primaryKeyId;
    }

    public void setPrimaryKeyId(String primaryKeyId) {
        this.primaryKeyId = primaryKeyId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (entityName != null ? entityName.hashCode() : 0);
        hash += (userLoginId != null ? userLoginId.hashCode() : 0);
        hash += (primaryKeyId != null ? primaryKeyId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EntityViewHistoryPK)) {
            return false;
        }
        EntityViewHistoryPK other = (EntityViewHistoryPK) object;
        if ((this.entityName == null && other.entityName != null) || (this.entityName != null && !this.entityName.equals(other.entityName))) {
            return false;
        }
        if ((this.userLoginId == null && other.userLoginId != null) || (this.userLoginId != null && !this.userLoginId.equals(other.userLoginId))) {
            return false;
        }
        if ((this.primaryKeyId == null && other.primaryKeyId != null) || (this.primaryKeyId != null && !this.primaryKeyId.equals(other.primaryKeyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.EntityViewHistoryPK[ entityName=" + entityName + ", userLoginId=" + userLoginId + ", primaryKeyId=" + primaryKeyId + " ]";
    }
    
}
