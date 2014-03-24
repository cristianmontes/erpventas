/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class ContentRevisionPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CONTENT_ID")
    private String contentId;
    @Basic(optional = false)
    @Column(name = "CONTENT_REVISION_SEQ_ID")
    private String contentRevisionSeqId;

    public ContentRevisionPK() {
    }

    public ContentRevisionPK(String contentId, String contentRevisionSeqId) {
        this.contentId = contentId;
        this.contentRevisionSeqId = contentRevisionSeqId;
    }

    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public String getContentRevisionSeqId() {
        return contentRevisionSeqId;
    }

    public void setContentRevisionSeqId(String contentRevisionSeqId) {
        this.contentRevisionSeqId = contentRevisionSeqId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (contentId != null ? contentId.hashCode() : 0);
        hash += (contentRevisionSeqId != null ? contentRevisionSeqId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContentRevisionPK)) {
            return false;
        }
        ContentRevisionPK other = (ContentRevisionPK) object;
        if ((this.contentId == null && other.contentId != null) || (this.contentId != null && !this.contentId.equals(other.contentId))) {
            return false;
        }
        if ((this.contentRevisionSeqId == null && other.contentRevisionSeqId != null) || (this.contentRevisionSeqId != null && !this.contentRevisionSeqId.equals(other.contentRevisionSeqId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ContentRevisionPK[ contentId=" + contentId + ", contentRevisionSeqId=" + contentRevisionSeqId + " ]";
    }
    
}
