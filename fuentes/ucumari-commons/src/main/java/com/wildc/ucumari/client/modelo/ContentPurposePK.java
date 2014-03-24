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
public class ContentPurposePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CONTENT_ID")
    private String contentId;
    @Basic(optional = false)
    @Column(name = "CONTENT_PURPOSE_TYPE_ID")
    private String contentPurposeTypeId;

    public ContentPurposePK() {
    }

    public ContentPurposePK(String contentId, String contentPurposeTypeId) {
        this.contentId = contentId;
        this.contentPurposeTypeId = contentPurposeTypeId;
    }

    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public String getContentPurposeTypeId() {
        return contentPurposeTypeId;
    }

    public void setContentPurposeTypeId(String contentPurposeTypeId) {
        this.contentPurposeTypeId = contentPurposeTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (contentId != null ? contentId.hashCode() : 0);
        hash += (contentPurposeTypeId != null ? contentPurposeTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContentPurposePK)) {
            return false;
        }
        ContentPurposePK other = (ContentPurposePK) object;
        if ((this.contentId == null && other.contentId != null) || (this.contentId != null && !this.contentId.equals(other.contentId))) {
            return false;
        }
        if ((this.contentPurposeTypeId == null && other.contentPurposeTypeId != null) || (this.contentPurposeTypeId != null && !this.contentPurposeTypeId.equals(other.contentPurposeTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ContentPurposePK[ contentId=" + contentId + ", contentPurposeTypeId=" + contentPurposeTypeId + " ]";
    }
    
}
