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
@Table(name = "document_type_attr")
@NamedQueries({
    @NamedQuery(name = "DocumentTypeAttr.findAll", query = "SELECT d FROM DocumentTypeAttr d")})
public class DocumentTypeAttr implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DocumentTypeAttrPK documentTypeAttrPK;
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
    @JoinColumn(name = "DOCUMENT_TYPE_ID", referencedColumnName = "DOCUMENT_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private DocumentType documentType;

    public DocumentTypeAttr() {
    }

    public DocumentTypeAttr(DocumentTypeAttrPK documentTypeAttrPK) {
        this.documentTypeAttrPK = documentTypeAttrPK;
    }

    public DocumentTypeAttr(String documentTypeId, String attrName) {
        this.documentTypeAttrPK = new DocumentTypeAttrPK(documentTypeId, attrName);
    }

    public DocumentTypeAttrPK getDocumentTypeAttrPK() {
        return documentTypeAttrPK;
    }

    public void setDocumentTypeAttrPK(DocumentTypeAttrPK documentTypeAttrPK) {
        this.documentTypeAttrPK = documentTypeAttrPK;
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

    public DocumentType getDocumentType() {
        return documentType;
    }

    public void setDocumentType(DocumentType documentType) {
        this.documentType = documentType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (documentTypeAttrPK != null ? documentTypeAttrPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DocumentTypeAttr)) {
            return false;
        }
        DocumentTypeAttr other = (DocumentTypeAttr) object;
        if ((this.documentTypeAttrPK == null && other.documentTypeAttrPK != null) || (this.documentTypeAttrPK != null && !this.documentTypeAttrPK.equals(other.documentTypeAttrPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.DocumentTypeAttr[ documentTypeAttrPK=" + documentTypeAttrPK + " ]";
    }
    
}
