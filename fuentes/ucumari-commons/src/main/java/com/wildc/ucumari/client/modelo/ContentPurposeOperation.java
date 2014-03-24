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

import com.wildc.ucumari.parameters.model.Enumeration;
import com.wildc.ucumari.parameters.model.RoleType;
import com.wildc.ucumari.parameters.model.StatusItem;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "content_purpose_operation")
@NamedQueries({
    @NamedQuery(name = "ContentPurposeOperation.findAll", query = "SELECT c FROM ContentPurposeOperation c")})
public class ContentPurposeOperation implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ContentPurposeOperationPK contentPurposeOperationPK;
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
    @JoinColumn(name = "CONTENT_PURPOSE_TYPE_ID", referencedColumnName = "CONTENT_PURPOSE_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ContentPurposeType contentPurposeType;
    @JoinColumn(name = "STATUS_ID", referencedColumnName = "STATUS_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private StatusItem statusItem;
    @JoinColumn(name = "ROLE_TYPE_ID", referencedColumnName = "ROLE_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private RoleType roleType;
    @JoinColumn(name = "PRIVILEGE_ENUM_ID", referencedColumnName = "ENUM_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Enumeration enumeration;
    @JoinColumn(name = "CONTENT_OPERATION_ID", referencedColumnName = "CONTENT_OPERATION_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ContentOperation contentOperation;

    public ContentPurposeOperation() {
    }

    public ContentPurposeOperation(ContentPurposeOperationPK contentPurposeOperationPK) {
        this.contentPurposeOperationPK = contentPurposeOperationPK;
    }

    public ContentPurposeOperation(String contentPurposeTypeId, String contentOperationId, String roleTypeId, String statusId, String privilegeEnumId) {
        this.contentPurposeOperationPK = new ContentPurposeOperationPK(contentPurposeTypeId, contentOperationId, roleTypeId, statusId, privilegeEnumId);
    }

    public ContentPurposeOperationPK getContentPurposeOperationPK() {
        return contentPurposeOperationPK;
    }

    public void setContentPurposeOperationPK(ContentPurposeOperationPK contentPurposeOperationPK) {
        this.contentPurposeOperationPK = contentPurposeOperationPK;
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

    public ContentPurposeType getContentPurposeType() {
        return contentPurposeType;
    }

    public void setContentPurposeType(ContentPurposeType contentPurposeType) {
        this.contentPurposeType = contentPurposeType;
    }

    public StatusItem getStatusItem() {
        return statusItem;
    }

    public void setStatusItem(StatusItem statusItem) {
        this.statusItem = statusItem;
    }

    public RoleType getRoleType() {
        return roleType;
    }

    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
    }

    public Enumeration getEnumeration() {
        return enumeration;
    }

    public void setEnumeration(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    public ContentOperation getContentOperation() {
        return contentOperation;
    }

    public void setContentOperation(ContentOperation contentOperation) {
        this.contentOperation = contentOperation;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (contentPurposeOperationPK != null ? contentPurposeOperationPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContentPurposeOperation)) {
            return false;
        }
        ContentPurposeOperation other = (ContentPurposeOperation) object;
        if ((this.contentPurposeOperationPK == null && other.contentPurposeOperationPK != null) || (this.contentPurposeOperationPK != null && !this.contentPurposeOperationPK.equals(other.contentPurposeOperationPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ContentPurposeOperation[ contentPurposeOperationPK=" + contentPurposeOperationPK + " ]";
    }
    
}
