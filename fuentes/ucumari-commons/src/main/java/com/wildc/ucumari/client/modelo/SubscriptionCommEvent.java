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
@Table(name = "subscription_comm_event")
@NamedQueries({
    @NamedQuery(name = "SubscriptionCommEvent.findAll", query = "SELECT s FROM SubscriptionCommEvent s")})
public class SubscriptionCommEvent implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SubscriptionCommEventPK subscriptionCommEventPK;
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
    @JoinColumn(name = "SUBSCRIPTION_ID", referencedColumnName = "SUBSCRIPTION_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Subscription subscription;
    @JoinColumn(name = "COMMUNICATION_EVENT_ID", referencedColumnName = "COMMUNICATION_EVENT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private CommunicationEvent communicationEvent;

    public SubscriptionCommEvent() {
    }

    public SubscriptionCommEvent(SubscriptionCommEventPK subscriptionCommEventPK) {
        this.subscriptionCommEventPK = subscriptionCommEventPK;
    }

    public SubscriptionCommEvent(String subscriptionId, String communicationEventId) {
        this.subscriptionCommEventPK = new SubscriptionCommEventPK(subscriptionId, communicationEventId);
    }

    public SubscriptionCommEventPK getSubscriptionCommEventPK() {
        return subscriptionCommEventPK;
    }

    public void setSubscriptionCommEventPK(SubscriptionCommEventPK subscriptionCommEventPK) {
        this.subscriptionCommEventPK = subscriptionCommEventPK;
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

    public Subscription getSubscription() {
        return subscription;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
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
        hash += (subscriptionCommEventPK != null ? subscriptionCommEventPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubscriptionCommEvent)) {
            return false;
        }
        SubscriptionCommEvent other = (SubscriptionCommEvent) object;
        if ((this.subscriptionCommEventPK == null && other.subscriptionCommEventPK != null) || (this.subscriptionCommEventPK != null && !this.subscriptionCommEventPK.equals(other.subscriptionCommEventPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.SubscriptionCommEvent[ subscriptionCommEventPK=" + subscriptionCommEventPK + " ]";
    }
    
}
