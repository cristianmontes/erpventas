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
public class DocumentTypeAttrPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "DOCUMENT_TYPE_ID")
    private String documentTypeId;
    @Basic(optional = false)
    @Column(name = "ATTR_NAME")
    private String attrName;

    public DocumentTypeAttrPK() {
    }

    public DocumentTypeAttrPK(String documentTypeId, String attrName) {
        this.documentTypeId = documentTypeId;
        this.attrName = attrName;
    }

    public String getDocumentTypeId() {
        return documentTypeId;
    }

    public void setDocumentTypeId(String documentTypeId) {
        this.documentTypeId = documentTypeId;
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
        hash += (documentTypeId != null ? documentTypeId.hashCode() : 0);
        hash += (attrName != null ? attrName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DocumentTypeAttrPK)) {
            return false;
        }
        DocumentTypeAttrPK other = (DocumentTypeAttrPK) object;
        if ((this.documentTypeId == null && other.documentTypeId != null) || (this.documentTypeId != null && !this.documentTypeId.equals(other.documentTypeId))) {
            return false;
        }
        if ((this.attrName == null && other.attrName != null) || (this.attrName != null && !this.attrName.equals(other.attrName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.DocumentTypeAttrPK[ documentTypeId=" + documentTypeId + ", attrName=" + attrName + " ]";
    }
    
}
