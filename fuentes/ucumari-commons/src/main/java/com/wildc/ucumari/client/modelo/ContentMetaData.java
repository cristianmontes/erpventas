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
@Table(name = "content_meta_data")
@NamedQueries({
    @NamedQuery(name = "ContentMetaData.findAll", query = "SELECT c FROM ContentMetaData c")})
public class ContentMetaData implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ContentMetaDataPK contentMetaDataPK;
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
    @JoinColumn(name = "DATA_SOURCE_ID", referencedColumnName = "DATA_SOURCE_ID")
    @ManyToOne
    private DataSource dataSourceId;
    @JoinColumn(name = "META_DATA_PREDICATE_ID", referencedColumnName = "META_DATA_PREDICATE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private MetaDataPredicate metaDataPredicate;
    @JoinColumn(name = "CONTENT_ID", referencedColumnName = "CONTENT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Content content;

    public ContentMetaData() {
    }

    public ContentMetaData(ContentMetaDataPK contentMetaDataPK) {
        this.contentMetaDataPK = contentMetaDataPK;
    }

    public ContentMetaData(String contentId, String metaDataPredicateId, String metaDataValue) {
        this.contentMetaDataPK = new ContentMetaDataPK(contentId, metaDataPredicateId, metaDataValue);
    }

    public ContentMetaDataPK getContentMetaDataPK() {
        return contentMetaDataPK;
    }

    public void setContentMetaDataPK(ContentMetaDataPK contentMetaDataPK) {
        this.contentMetaDataPK = contentMetaDataPK;
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

    public DataSource getDataSourceId() {
        return dataSourceId;
    }

    public void setDataSourceId(DataSource dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    public MetaDataPredicate getMetaDataPredicate() {
        return metaDataPredicate;
    }

    public void setMetaDataPredicate(MetaDataPredicate metaDataPredicate) {
        this.metaDataPredicate = metaDataPredicate;
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
        hash += (contentMetaDataPK != null ? contentMetaDataPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContentMetaData)) {
            return false;
        }
        ContentMetaData other = (ContentMetaData) object;
        if ((this.contentMetaDataPK == null && other.contentMetaDataPK != null) || (this.contentMetaDataPK != null && !this.contentMetaDataPK.equals(other.contentMetaDataPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ContentMetaData[ contentMetaDataPK=" + contentMetaDataPK + " ]";
    }
    
}
