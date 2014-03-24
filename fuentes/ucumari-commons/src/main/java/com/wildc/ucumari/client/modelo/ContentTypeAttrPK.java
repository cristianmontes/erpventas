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
public class ContentTypeAttrPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CONTENT_TYPE_ID")
    private String contentTypeId;
    @Basic(optional = false)
    @Column(name = "ATTR_NAME")
    private String attrName;

    public ContentTypeAttrPK() {
    }

    public ContentTypeAttrPK(String contentTypeId, String attrName) {
        this.contentTypeId = contentTypeId;
        this.attrName = attrName;
    }

    public String getContentTypeId() {
        return contentTypeId;
    }

    public void setContentTypeId(String contentTypeId) {
        this.contentTypeId = contentTypeId;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (contentTypeId != null ? contentTypeId.hashCode() : 0);
        hash += (attrName != null ? attrName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContentTypeAttrPK)) {
            return false;
        }
        ContentTypeAttrPK other = (ContentTypeAttrPK) object;
        if ((this.contentTypeId == null && other.contentTypeId != null) || (this.contentTypeId != null && !this.contentTypeId.equals(other.contentTypeId))) {
            return false;
        }
        if ((this.attrName == null && other.attrName != null) || (this.attrName != null && !this.attrName.equals(other.attrName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ContentTypeAttrPK[ contentTypeId=" + contentTypeId + ", attrName=" + attrName + " ]";
    }
    
}
