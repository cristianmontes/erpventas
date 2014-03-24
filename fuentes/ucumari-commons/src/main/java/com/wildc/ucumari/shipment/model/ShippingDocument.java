/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.shipment.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.client.modelo.Document;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "shipping_document")
@NamedQueries({
    @NamedQuery(name = "ShippingDocument.findAll", query = "SELECT s FROM ShippingDocument s")})
public class ShippingDocument implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DOCUMENT_ID")
    private String documentId;
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
    @JoinColumns({
        @JoinColumn(name = "SHIPMENT_ID", referencedColumnName = "SHIPMENT_ID"),
        @JoinColumn(name = "SHIPMENT_ITEM_SEQ_ID", referencedColumnName = "SHIPMENT_ITEM_SEQ_ID")})
    @ManyToOne
    private ShipmentItem shipmentItem;
    @JoinColumns({
        @JoinColumn(name = "SHIPMENT_ID", referencedColumnName = "SHIPMENT_ID"),
        @JoinColumn(name = "SHIPMENT_PACKAGE_SEQ_ID", referencedColumnName = "SHIPMENT_PACKAGE_SEQ_ID")})
    @ManyToOne
    private ShipmentPackage shipmentPackage;
    @JoinColumn(name = "DOCUMENT_ID", referencedColumnName = "DOCUMENT_ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Document document;

    public ShippingDocument() {
    }

    public ShippingDocument(String documentId) {
        this.documentId = documentId;
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
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

    public ShipmentItem getShipmentItem() {
        return shipmentItem;
    }

    public void setShipmentItem(ShipmentItem shipmentItem) {
        this.shipmentItem = shipmentItem;
    }

    public ShipmentPackage getShipmentPackage() {
        return shipmentPackage;
    }

    public void setShipmentPackage(ShipmentPackage shipmentPackage) {
        this.shipmentPackage = shipmentPackage;
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
        hash += (documentId != null ? documentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ShippingDocument)) {
            return false;
        }
        ShippingDocument other = (ShippingDocument) object;
        if ((this.documentId == null && other.documentId != null) || (this.documentId != null && !this.documentId.equals(other.documentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ShippingDocument[ documentId=" + documentId + " ]";
    }
    
}
