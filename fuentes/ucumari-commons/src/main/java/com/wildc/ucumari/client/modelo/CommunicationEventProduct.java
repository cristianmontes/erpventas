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

import com.wildc.ucumari.product.model.Product;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "communication_event_product")
@NamedQueries({
    @NamedQuery(name = "CommunicationEventProduct.findAll", query = "SELECT c FROM CommunicationEventProduct c")})
public class CommunicationEventProduct implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CommunicationEventProductPK communicationEventProductPK;
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
    @JoinColumn(name = "PRODUCT_ID", referencedColumnName = "PRODUCT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Product product;
    @JoinColumn(name = "COMMUNICATION_EVENT_ID", referencedColumnName = "COMMUNICATION_EVENT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private CommunicationEvent communicationEvent;

    public CommunicationEventProduct() {
    }

    public CommunicationEventProduct(CommunicationEventProductPK communicationEventProductPK) {
        this.communicationEventProductPK = communicationEventProductPK;
    }

    public CommunicationEventProduct(String productId, String communicationEventId) {
        this.communicationEventProductPK = new CommunicationEventProductPK(productId, communicationEventId);
    }

    public CommunicationEventProductPK getCommunicationEventProductPK() {
        return communicationEventProductPK;
    }

    public void setCommunicationEventProductPK(CommunicationEventProductPK communicationEventProductPK) {
        this.communicationEventProductPK = communicationEventProductPK;
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

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public CommunicationEvent getCommunicationEvent() {
        return communicationEvent;
    }

    public void setCommunicationEvent(CommunicationEvent communicationEvent) {
        this.communicationEvent = communicationEvent;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (communicationEventProductPK != null ? communicationEventProductPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CommunicationEventProduct)) {
            return false;
        }
        CommunicationEventProduct other = (CommunicationEventProduct) object;
        if ((this.communicationEventProductPK == null && other.communicationEventProductPK != null) || (this.communicationEventProductPK != null && !this.communicationEventProductPK.equals(other.communicationEventProductPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.CommunicationEventProduct[ communicationEventProductPK=" + communicationEventProductPK + " ]";
    }
    
}
