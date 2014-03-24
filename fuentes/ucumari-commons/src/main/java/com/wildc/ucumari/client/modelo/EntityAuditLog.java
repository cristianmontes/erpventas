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
@Table(name = "entity_audit_log")
@NamedQueries({
    @NamedQuery(name = "EntityAuditLog.findAll", query = "SELECT e FROM EntityAuditLog e")})
public class EntityAuditLog implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "AUDIT_HISTORY_SEQ_ID")
    private String auditHistorySeqId;
    @Column(name = "CHANGED_ENTITY_NAME")
    private String changedEntityName;
    @Column(name = "CHANGED_FIELD_NAME")
    private String changedFieldName;
    @Column(name = "PK_COMBINED_VALUE_TEXT")
    private String pkCombinedValueText;
    @Column(name = "OLD_VALUE_TEXT")
    private String oldValueText;
    @Column(name = "NEW_VALUE_TEXT")
    private String newValueText;
    @Column(name = "CHANGED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date changedDate;
    @Column(name = "CHANGED_BY_INFO")
    private String changedByInfo;
    @Column(name = "CHANGED_SESSION_INFO")
    private String changedSessionInfo;
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

    public EntityAuditLog() {
    }

    public EntityAuditLog(String auditHistorySeqId) {
        this.auditHistorySeqId = auditHistorySeqId;
    }

    public String getAuditHistorySeqId() {
        return auditHistorySeqId;
    }

    public void setAuditHistorySeqId(String auditHistorySeqId) {
        this.auditHistorySeqId = auditHistorySeqId;
    }

    public String getChangedEntityName() {
        return changedEntityName;
    }

    public void setChangedEntityName(String changedEntityName) {
        this.changedEntityName = changedEntityName;
    }

    public String getChangedFieldName() {
        return changedFieldName;
    }

    public void setChangedFieldName(String changedFieldName) {
        this.changedFieldName = changedFieldName;
    }

    public String getPkCombinedValueText() {
        return pkCombinedValueText;
    }

    public void setPkCombinedValueText(String pkCombinedValueText) {
        this.pkCombinedValueText = pkCombinedValueText;
    }

    public String getOldValueText() {
        return oldValueText;
    }

    public void setOldValueText(String oldValueText) {
        this.oldValueText = oldValueText;
    }

    public String getNewValueText() {
        return newValueText;
    }

    public void setNewValueText(String newValueText) {
        this.newValueText = newValueText;
    }

    public Date getChangedDate() {
        return changedDate;
    }

    public void setChangedDate(Date changedDate) {
        this.changedDate = changedDate;
    }

    public String getChangedByInfo() {
        return changedByInfo;
    }

    public void setChangedByInfo(String changedByInfo) {
        this.changedByInfo = changedByInfo;
    }

    public String getChangedSessionInfo() {
        return changedSessionInfo;
    }

    public void setChangedSessionInfo(String changedSessionInfo) {
        this.changedSessionInfo = changedSessionInfo;
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
        hash += (auditHistorySeqId != null ? auditHistorySeqId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EntityAuditLog)) {
            return false;
        }
        EntityAuditLog other = (EntityAuditLog) object;
        if ((this.auditHistorySeqId == null && other.auditHistorySeqId != null) || (this.auditHistorySeqId != null && !this.auditHistorySeqId.equals(other.auditHistorySeqId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.EntityAuditLog[ auditHistorySeqId=" + auditHistorySeqId + " ]";
    }
    
}
