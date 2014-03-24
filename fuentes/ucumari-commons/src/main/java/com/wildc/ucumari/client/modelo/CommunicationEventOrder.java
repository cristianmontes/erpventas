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

import com.wildc.ucumari.order.model.OrderHeader;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "communication_event_order")
@NamedQueries({
    @NamedQuery(name = "CommunicationEventOrder.findAll", query = "SELECT c FROM CommunicationEventOrder c")})
public class CommunicationEventOrder implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CommunicationEventOrderPK communicationEventOrderPK;
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
    @JoinColumn(name = "ORDER_ID", referencedColumnName = "ORDER_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private OrderHeader orderHeader;
    @JoinColumn(name = "COMMUNICATION_EVENT_ID", referencedColumnName = "COMMUNICATION_EVENT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private CommunicationEvent communicationEvent;

    public CommunicationEventOrder() {
    }

    public CommunicationEventOrder(CommunicationEventOrderPK communicationEventOrderPK) {
        this.communicationEventOrderPK = communicationEventOrderPK;
    }

    public CommunicationEventOrder(String orderId, String communicationEventId) {
        this.communicationEventOrderPK = new CommunicationEventOrderPK(orderId, communicationEventId);
    }

    public CommunicationEventOrderPK getCommunicationEventOrderPK() {
        return communicationEventOrderPK;
    }

    public void setCommunicationEventOrderPK(CommunicationEventOrderPK communicationEventOrderPK) {
        this.communicationEventOrderPK = communicationEventOrderPK;
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

    public OrderHeader getOrderHeader() {
        return orderHeader;
    }

    public void setOrderHeader(OrderHeader orderHeader) {
        this.orderHeader = orderHeader;
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
        hash += (communicationEventOrderPK != null ? communicationEventOrderPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CommunicationEventOrder)) {
            return false;
        }
        CommunicationEventOrder other = (CommunicationEventOrder) object;
        if ((this.communicationEventOrderPK == null && other.communicationEventOrderPK != null) || (this.communicationEventOrderPK != null && !this.communicationEventOrderPK.equals(other.communicationEventOrderPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.CommunicationEventOrder[ communicationEventOrderPK=" + communicationEventOrderPK + " ]";
    }
    
}
