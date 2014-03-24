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
@Table(name = "content_type_attr")
@NamedQueries({
    @NamedQuery(name = "ContentTypeAttr.findAll", query = "SELECT c FROM ContentTypeAttr c")})
public class ContentTypeAttr implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ContentTypeAttrPK contentTypeAttrPK;
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
    @JoinColumn(name = "CONTENT_TYPE_ID", referencedColumnName = "CONTENT_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ContentType contentType;

    public ContentTypeAttr() {
    }

    public ContentTypeAttr(ContentTypeAttrPK contentTypeAttrPK) {
        this.contentTypeAttrPK = contentTypeAttrPK;
    }

    public ContentTypeAttr(String contentTypeId, String attrName) {
        this.contentTypeAttrPK = new ContentTypeAttrPK(contentTypeId, attrName);
    }

    public ContentTypeAttrPK getContentTypeAttrPK() {
        return contentTypeAttrPK;
    }

    public void setContentTypeAttrPK(ContentTypeAttrPK contentTypeAttrPK) {
        this.contentTypeAttrPK = contentTypeAttrPK;
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

    public ContentType getContentType() {
        return contentType;
    }

    public void setContentType(ContentType contentType) {
        this.contentType = contentType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (contentTypeAttrPK != null ? contentTypeAttrPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContentTypeAttr)) {
            return false;
        }
        ContentTypeAttr other = (ContentTypeAttr) object;
        if ((this.contentTypeAttrPK == null && other.contentTypeAttrPK != null) || (this.contentTypeAttrPK != null && !this.contentTypeAttrPK.equals(other.contentTypeAttrPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ContentTypeAttr[ contentTypeAttrPK=" + contentTypeAttrPK + " ]";
    }
    
}
