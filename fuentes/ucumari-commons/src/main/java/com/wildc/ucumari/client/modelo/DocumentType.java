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
@Table(name = "document_type")
@NamedQueries({
    @NamedQuery(name = "DocumentType.findAll", query = "SELECT d FROM DocumentType d")})
public class DocumentType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DOCUMENT_TYPE_ID")
    private String documentTypeId;
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
    private List<DocumentType> documentTypeList;
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "DOCUMENT_TYPE_ID")
    @ManyToOne
    private DocumentType parentTypeId;
    @OneToMany(mappedBy = "documentTypeId")
    private List<Document> documentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "documentType")
    private List<DocumentTypeAttr> documentTypeAttrList;

    public DocumentType() {
    }

    public DocumentType(String documentTypeId) {
        this.documentTypeId = documentTypeId;
    }

    public String getDocumentTypeId() {
        return documentTypeId;
    }

    public void setDocumentTypeId(String documentTypeId) {
        this.documentTypeId = documentTypeId;
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

    public List<DocumentType> getDocumentTypeList() {
        return documentTypeList;
    }

    public void setDocumentTypeList(List<DocumentType> documentTypeList) {
        this.documentTypeList = documentTypeList;
    }

    public DocumentType getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(DocumentType parentTypeId) {
        this.parentTypeId = parentTypeId;
    }

    public List<Document> getDocumentList() {
        return documentList;
    }

    public void setDocumentList(List<Document> documentList) {
        this.documentList = documentList;
    }

    public List<DocumentTypeAttr> getDocumentTypeAttrList() {
        return documentTypeAttrList;
    }

    public void setDocumentTypeAttrList(List<DocumentTypeAttr> documentTypeAttrList) {
        this.documentTypeAttrList = documentTypeAttrList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (documentTypeId != null ? documentTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DocumentType)) {
            return false;
        }
        DocumentType other = (DocumentType) object;
        if ((this.documentTypeId == null && other.documentTypeId != null) || (this.documentTypeId != null && !this.documentTypeId.equals(other.documentTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.DocumentType[ documentTypeId=" + documentTypeId + " ]";
    }
    
}
