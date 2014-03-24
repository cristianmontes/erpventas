/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import com.wildc.ucumari.party.model.Party;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "content_revision")
@NamedQueries({
    @NamedQuery(name = "ContentRevision.findAll", query = "SELECT c FROM ContentRevision c")})
public class ContentRevision implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ContentRevisionPK contentRevisionPK;
    @Column(name = "COMMENTS")
    private String comments;
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
    @JoinColumn(name = "CONTENT_ID", referencedColumnName = "CONTENT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Content content;
    @JoinColumn(name = "COMMITTED_BY_PARTY_ID", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party committedByPartyId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "contentRevision")
    private List<ContentRevisionItem> contentRevisionItemList;

    public ContentRevision() {
    }

    public ContentRevision(ContentRevisionPK contentRevisionPK) {
        this.contentRevisionPK = contentRevisionPK;
    }

    public ContentRevision(String contentId, String contentRevisionSeqId) {
        this.contentRevisionPK = new ContentRevisionPK(contentId, contentRevisionSeqId);
    }

    public ContentRevisionPK getContentRevisionPK() {
        return contentRevisionPK;
    }

    public void setContentRevisionPK(ContentRevisionPK contentRevisionPK) {
        this.contentRevisionPK = contentRevisionPK;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
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

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public Party getCommittedByPartyId() {
        return committedByPartyId;
    }

    public void setCommittedByPartyId(Party committedByPartyId) {
        this.committedByPartyId = committedByPartyId;
    }

    public List<ContentRevisionItem> getContentRevisionItemList() {
        return contentRevisionItemList;
    }

    public void setContentRevisionItemList(List<ContentRevisionItem> contentRevisionItemList) {
        this.contentRevisionItemList = contentRevisionItemList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (contentRevisionPK != null ? contentRevisionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContentRevision)) {
            return false;
        }
        ContentRevision other = (ContentRevision) object;
        if ((this.contentRevisionPK == null && other.contentRevisionPK != null) || (this.contentRevisionPK != null && !this.contentRevisionPK.equals(other.contentRevisionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ContentRevision[ contentRevisionPK=" + contentRevisionPK + " ]";
    }
    
}
