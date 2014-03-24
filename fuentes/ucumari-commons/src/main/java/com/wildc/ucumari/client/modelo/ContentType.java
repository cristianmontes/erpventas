/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "content_type")
@NamedQueries({
    @NamedQuery(name = "ContentType.findAll", query = "SELECT c FROM ContentType c")})
public class ContentType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CONTENT_TYPE_ID")
    private String contentTypeId;
    @Column(name = "HAS_TABLE")
    private Character hasTable;
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
    @OneToMany(mappedBy = "parentTypeId")
    private List<ContentType> contentTypeList;
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "CONTENT_TYPE_ID")
    @ManyToOne
    private ContentType parentTypeId;
    @OneToMany(mappedBy = "contentTypeId")
    private List<Content> contentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "contentType")
    private List<ContentTypeAttr> contentTypeAttrList;

    public ContentType() {
    }

    public ContentType(String contentTypeId) {
        this.contentTypeId = contentTypeId;
    }

    public String getContentTypeId() {
        return contentTypeId;
    }

    public void setContentTypeId(String contentTypeId) {
        this.contentTypeId = contentTypeId;
    }

    public Character getHasTable() {
        return hasTable;
    }

    public void setHasTable(Character hasTable) {
        this.hasTable = hasTable;
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

    public List<ContentType> getContentTypeList() {
        return contentTypeList;
    }

    public void setContentTypeList(List<ContentType> contentTypeList) {
        this.contentTypeList = contentTypeList;
    }

    public ContentType getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(ContentType parentTypeId) {
        this.parentTypeId = parentTypeId;
    }

    public List<Content> getContentList() {
        return contentList;
    }

    public void setContentList(List<Content> contentList) {
        this.contentList = contentList;
    }

    public List<ContentTypeAttr> getContentTypeAttrList() {
        return contentTypeAttrList;
    }

    public void setContentTypeAttrList(List<ContentTypeAttr> contentTypeAttrList) {
        this.contentTypeAttrList = contentTypeAttrList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (contentTypeId != null ? contentTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContentType)) {
            return false;
        }
        ContentType other = (ContentType) object;
        if ((this.contentTypeId == null && other.contentTypeId != null) || (this.contentTypeId != null && !this.contentTypeId.equals(other.contentTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ContentType[ contentTypeId=" + contentTypeId + " ]";
    }
    
}
