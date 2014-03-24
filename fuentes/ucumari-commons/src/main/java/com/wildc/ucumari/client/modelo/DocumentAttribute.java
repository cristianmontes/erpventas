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
@Table(name = "document_attribute")
@NamedQueries({
    @NamedQuery(name = "DocumentAttribute.findAll", query = "SELECT d FROM DocumentAttribute d")})
public class DocumentAttribute implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DocumentAttributePK documentAttributePK;
    @Column(name = "ATTR_VALUE")
    private String attrValue;
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
    @JoinColumn(name = "DOCUMENT_ID", referencedColumnName = "DOCUMENT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Document document;

    public DocumentAttribute() {
    }

    public DocumentAttribute(DocumentAttributePK documentAttributePK) {
        this.documentAttributePK = documentAttributePK;
    }

    public DocumentAttribute(String documentId, String attrName) {
        this.documentAttributePK = new DocumentAttributePK(documentId, attrName);
    }

    public DocumentAttributePK getDocumentAttributePK() {
        return documentAttributePK;
    }

    public void setDocumentAttributePK(DocumentAttributePK documentAttributePK) {
        this.documentAttributePK = documentAttributePK;
    }

    public String getAttrValue() {
        return attrValue;
    }

    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue;
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

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (documentAttributePK != null ? documentAttributePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DocumentAttribute)) {
            return false;
        }
        DocumentAttribute other = (DocumentAttribute) object;
        if ((this.documentAttributePK == null && other.documentAttributePK != null) || (this.documentAttributePK != null && !this.documentAttributePK.equals(other.documentAttributePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.DocumentAttribute[ documentAttributePK=" + documentAttributePK + " ]";
    }
    
}
