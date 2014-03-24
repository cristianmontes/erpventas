/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import com.wildc.ucumari.security.model.UserLogin;
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
@Table(name = "entity_view_history")
@NamedQueries({
    @NamedQuery(name = "EntityViewHistory.findAll", query = "SELECT e FROM EntityViewHistory e")})
public class EntityViewHistory implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EntityViewHistoryPK entityViewHistoryPK;
    @Column(name = "VIEWED_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date viewedTimestamp;
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
    @JoinColumn(name = "USER_LOGIN_ID", referencedColumnName = "USER_LOGIN_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private UserLogin userLogin;

    public EntityViewHistory() {
    }

    public EntityViewHistory(EntityViewHistoryPK entityViewHistoryPK) {
        this.entityViewHistoryPK = entityViewHistoryPK;
    }

    public EntityViewHistory(String entityName, String userLoginId, String primaryKeyId) {
        this.entityViewHistoryPK = new EntityViewHistoryPK(entityName, userLoginId, primaryKeyId);
    }

    public EntityViewHistoryPK getEntityViewHistoryPK() {
        return entityViewHistoryPK;
    }

    public void setEntityViewHistoryPK(EntityViewHistoryPK entityViewHistoryPK) {
        this.entityViewHistoryPK = entityViewHistoryPK;
    }

    public Date getViewedTimestamp() {
        return viewedTimestamp;
    }

    public void setViewedTimestamp(Date viewedTimestamp) {
        this.viewedTimestamp = viewedTimestamp;
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

    public UserLogin getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(UserLogin userLogin) {
        this.userLogin = userLogin;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (entityViewHistoryPK != null ? entityViewHistoryPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EntityViewHistory)) {
            return false;
        }
        EntityViewHistory other = (EntityViewHistory) object;
        if ((this.entityViewHistoryPK == null && other.entityViewHistoryPK != null) || (this.entityViewHistoryPK != null && !this.entityViewHistoryPK.equals(other.entityViewHistoryPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.EntityViewHistory[ entityViewHistoryPK=" + entityViewHistoryPK + " ]";
    }
    
}
