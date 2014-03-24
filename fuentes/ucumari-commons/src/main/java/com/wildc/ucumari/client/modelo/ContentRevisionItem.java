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
@Table(name = "content_revision_item")
@NamedQueries({
    @NamedQuery(name = "ContentRevisionItem.findAll", query = "SELECT c FROM ContentRevisionItem c")})
public class ContentRevisionItem implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ContentRevisionItemPK contentRevisionItemPK;
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
    @JoinColumn(name = "OLD_DATA_RESOURCE_ID", referencedColumnName = "DATA_RESOURCE_ID")
    @ManyToOne
    private DataResource oldDataResourceId;
    @JoinColumn(name = "NEW_DATA_RESOURCE_ID", referencedColumnName = "DATA_RESOURCE_ID")
    @ManyToOne
    private DataResource newDataResourceId;
    @JoinColumns({
        @JoinColumn(name = "CONTENT_ID", referencedColumnName = "CONTENT_ID", insertable = false, updatable = false),
        @JoinColumn(name = "CONTENT_REVISION_SEQ_ID", referencedColumnName = "CONTENT_REVISION_SEQ_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private ContentRevision contentRevision;

    public ContentRevisionItem() {
    }

    public ContentRevisionItem(ContentRevisionItemPK contentRevisionItemPK) {
        this.contentRevisionItemPK = contentRevisionItemPK;
    }

    public ContentRevisionItem(String contentId, String contentRevisionSeqId, String itemContentId) {
        this.contentRevisionItemPK = new ContentRevisionItemPK(contentId, contentRevisionSeqId, itemContentId);
    }

    public ContentRevisionItemPK getContentRevisionItemPK() {
        return contentRevisionItemPK;
    }

    public void setContentRevisionItemPK(ContentRevisionItemPK contentRevisionItemPK) {
        this.contentRevisionItemPK = contentRevisionItemPK;
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

    public DataResource getOldDataResourceId() {
        return oldDataResourceId;
    }

    public void setOldDataResourceId(DataResource oldDataResourceId) {
        this.oldDataResourceId = oldDataResourceId;
    }

    public DataResource getNewDataResourceId() {
        return newDataResourceId;
    }

    public void setNewDataResourceId(DataResource newDataResourceId) {
        this.newDataResourceId = newDataResourceId;
    }

    public ContentRevision getContentRevision() {
        return contentRevision;
    }

    public void setContentRevision(ContentRevision contentRevision) {
        this.contentRevision = contentRevision;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (contentRevisionItemPK != null ? contentRevisionItemPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContentRevisionItem)) {
            return false;
        }
        ContentRevisionItem other = (ContentRevisionItem) object;
        if ((this.contentRevisionItemPK == null && other.contentRevisionItemPK != null) || (this.contentRevisionItemPK != null && !this.contentRevisionItemPK.equals(other.contentRevisionItemPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ContentRevisionItem[ contentRevisionItemPK=" + contentRevisionItemPK + " ]";
    }
    
}
