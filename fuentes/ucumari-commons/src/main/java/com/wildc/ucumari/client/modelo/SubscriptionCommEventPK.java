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
public class SubscriptionCommEventPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "SUBSCRIPTION_ID")
    private String subscriptionId;
    @Basic(optional = false)
    @Column(name = "COMMUNICATION_EVENT_ID")
    private String communicationEventId;

    public SubscriptionCommEventPK() {
    }

    public SubscriptionCommEventPK(String subscriptionId, String communicationEventId) {
        this.subscriptionId = subscriptionId;
        this.communicationEventId = communicationEventId;
    }

    public String getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public String getCommunicationEventId() {
        return communicationEventId;
    }

    public void setCommunicationEventId(String communicationEventId) {
        this.communicationEventId = communicationEventId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (subscriptionId != null ? subscriptionId.hashCode() : 0);
        hash += (communicationEventId != null ? communicationEventId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubscriptionCommEventPK)) {
            return false;
        }
        SubscriptionCommEventPK other = (SubscriptionCommEventPK) object;
        if ((this.subscriptionId == null && other.subscriptionId != null) || (this.subscriptionId != null && !this.subscriptionId.equals(other.subscriptionId))) {
            return false;
        }
        if ((this.communicationEventId == null && other.communicationEventId != null) || (this.communicationEventId != null && !this.communicationEventId.equals(other.communicationEventId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.SubscriptionCommEventPK[ subscriptionId=" + subscriptionId + ", communicationEventId=" + communicationEventId + " ]";
    }
    
}
