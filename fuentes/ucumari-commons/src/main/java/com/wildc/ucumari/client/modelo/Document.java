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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.shipment.model.ShippingDocument;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "document")
@NamedQueries({
    @NamedQuery(name = "Document.findAll", query = "SELECT d FROM Document d")})
public class Document implements Serializable {
    @Lob
    @Column(name = "IMAGE_DATA")
    private byte[] imageData;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "document")
    private ShippingDocument shippingDocument;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DOCUMENT_ID")
    private String documentId;
    @Column(name = "DATE_CREATED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;
    @Column(name = "COMMENTS")
    private String comments;
    @Column(name = "DOCUMENT_LOCATION")
    private String documentLocation;
    @Column(name = "DOCUMENT_TEXT")
    private String documentText;
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
    @JoinColumn(name = "DOCUMENT_TYPE_ID", referencedColumnName = "DOCUMENT_TYPE_ID")
    @ManyToOne
    private DocumentType documentTypeId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "document")
    private List<DocumentAttribute> documentAttributeList;

    public Document() {
    }

    public Document(String documentId) {
        this.documentId = documentId;
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getDocumentLocation() {
        return documentLocation;
    }

    public void setDocumentLocation(String documentLocation) {
        this.documentLocation = documentLocation;
    }

    public String getDocumentText() {
        return documentText;
    }

    public void setDocumentText(String documentText) {
        this.documentText = documentText;
    }

    public byte[] getImageData() {
        return imageData;
    }

    public void setImageData(byte[] imageData) {
        this.imageData = imageData;
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

    public DocumentType getDocumentTypeId() {
        return documentTypeId;
    }

    public void setDocumentTypeId(DocumentType documentTypeId) {
        this.documentTypeId = documentTypeId;
    }

    public List<DocumentAttribute> getDocumentAttributeList() {
        return documentAttributeList;
    }

    public void setDocumentAttributeList(List<DocumentAttribute> documentAttributeList) {
        this.documentAttributeList = documentAttributeList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (documentId != null ? documentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Document)) {
            return false;
        }
        Document other = (Document) object;
        if ((this.documentId == null && other.documentId != null) || (this.documentId != null && !this.documentId.equals(other.documentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.Document[ documentId=" + documentId + " ]";
    }

    public ShippingDocument getShippingDocument() {
        return shippingDocument;
    }

    public void setShippingDocument(ShippingDocument shippingDocument) {
        this.shippingDocument = shippingDocument;
    }
    
}
