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
import javax.persistence.JoinColumns;
import javax.persistence.Lob;
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
@Table(name = "oagis_message_error_info")
@NamedQueries({
    @NamedQuery(name = "OagisMessageErrorInfo.findAll", query = "SELECT o FROM OagisMessageErrorInfo o")})
public class OagisMessageErrorInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OagisMessageErrorInfoPK oagisMessageErrorInfoPK;
    @Column(name = "REASON_CODE")
    private String reasonCode;
    @Lob
    @Column(name = "DESCRIPTION")
    private String description;
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
    @JoinColumns({
        @JoinColumn(name = "LOGICAL_ID", referencedColumnName = "LOGICAL_ID", insertable = false, updatable = false),
        @JoinColumn(name = "COMPONENT", referencedColumnName = "COMPONENT", insertable = false, updatable = false),
        @JoinColumn(name = "TASK", referencedColumnName = "TASK", insertable = false, updatable = false),
        @JoinColumn(name = "REFERENCE_ID", referencedColumnName = "REFERENCE_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private OagisMessageInfo oagisMessageInfo;

    public OagisMessageErrorInfo() {
    }

    public OagisMessageErrorInfo(OagisMessageErrorInfoPK oagisMessageErrorInfoPK) {
        this.oagisMessageErrorInfoPK = oagisMessageErrorInfoPK;
    }

    public OagisMessageErrorInfo(String logicalId, String component, String task, String referenceId, String errorSeqId) {
        this.oagisMessageErrorInfoPK = new OagisMessageErrorInfoPK(logicalId, component, task, referenceId, errorSeqId);
    }

    public OagisMessageErrorInfoPK getOagisMessageErrorInfoPK() {
        return oagisMessageErrorInfoPK;
    }

    public void setOagisMessageErrorInfoPK(OagisMessageErrorInfoPK oagisMessageErrorInfoPK) {
        this.oagisMessageErrorInfoPK = oagisMessageErrorInfoPK;
    }

    public String getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public OagisMessageInfo getOagisMessageInfo() {
        return oagisMessageInfo;
    }

    public void setOagisMessageInfo(OagisMessageInfo oagisMessageInfo) {
        this.oagisMessageInfo = oagisMessageInfo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (oagisMessageErrorInfoPK != null ? oagisMessageErrorInfoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OagisMessageErrorInfo)) {
            return false;
        }
        OagisMessageErrorInfo other = (OagisMessageErrorInfo) object;
        if ((this.oagisMessageErrorInfoPK == null && other.oagisMessageErrorInfoPK != null) || (this.oagisMessageErrorInfoPK != null && !this.oagisMessageErrorInfoPK.equals(other.oagisMessageErrorInfoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.OagisMessageErrorInfo[ oagisMessageErrorInfoPK=" + oagisMessageErrorInfoPK + " ]";
    }
    
}
