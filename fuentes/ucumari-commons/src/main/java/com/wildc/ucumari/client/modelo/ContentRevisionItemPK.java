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
public class ContentRevisionItemPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CONTENT_ID")
    private String contentId;
    @Basic(optional = false)
    @Column(name = "CONTENT_REVISION_SEQ_ID")
    private String contentRevisionSeqId;
    @Basic(optional = false)
    @Column(name = "ITEM_CONTENT_ID")
    private String itemContentId;

    public ContentRevisionItemPK() {
    }

    public ContentRevisionItemPK(String contentId, String contentRevisionSeqId, String itemContentId) {
        this.contentId = contentId;
        this.contentRevisionSeqId = contentRevisionSeqId;
        this.itemContentId = itemContentId;
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

    public String getItemContentId() {
        return itemContentId;
    }

    public void setItemContentId(String itemContentId) {
        this.itemContentId = itemContentId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (contentId != null ? contentId.hashCode() : 0);
        hash += (contentRevisionSeqId != null ? contentRevisionSeqId.hashCode() : 0);
        hash += (itemContentId != null ? itemContentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContentRevisionItemPK)) {
            return false;
        }
        ContentRevisionItemPK other = (ContentRevisionItemPK) object;
        if ((this.contentId == null && other.contentId != null) || (this.contentId != null && !this.contentId.equals(other.contentId))) {
            return false;
        }
        if ((this.contentRevisionSeqId == null && other.contentRevisionSeqId != null) || (this.contentRevisionSeqId != null && !this.contentRevisionSeqId.equals(other.contentRevisionSeqId))) {
            return false;
        }
        if ((this.itemContentId == null && other.itemContentId != null) || (this.itemContentId != null && !this.itemContentId.equals(other.itemContentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ContentRevisionItemPK[ contentId=" + contentId + ", contentRevisionSeqId=" + contentRevisionSeqId + ", itemContentId=" + itemContentId + " ]";
    }
    
}
