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
@Table(name = "content_purpose")
@NamedQueries({
    @NamedQuery(name = "ContentPurpose.findAll", query = "SELECT c FROM ContentPurpose c")})
public class ContentPurpose implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ContentPurposePK contentPurposePK;
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
    @JoinColumn(name = "CONTENT_ID", referencedColumnName = "CONTENT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Content content;

    public ContentPurpose() {
    }

    public ContentPurpose(ContentPurposePK contentPurposePK) {
        this.contentPurposePK = contentPurposePK;
    }

    public ContentPurpose(String contentId, String contentPurposeTypeId) {
        this.contentPurposePK = new ContentPurposePK(contentId, contentPurposeTypeId);
    }

    public ContentPurposePK getContentPurposePK() {
        return contentPurposePK;
    }

    public void setContentPurposePK(ContentPurposePK contentPurposePK) {
        this.contentPurposePK = contentPurposePK;
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

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (contentPurposePK != null ? contentPurposePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContentPurpose)) {
            return false;
        }
        ContentPurpose other = (ContentPurpose) object;
        if ((this.contentPurposePK == null && other.contentPurposePK != null) || (this.contentPurposePK != null && !this.contentPurposePK.equals(other.contentPurposePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ContentPurpose[ contentPurposePK=" + contentPurposePK + " ]";
    }
    
}
