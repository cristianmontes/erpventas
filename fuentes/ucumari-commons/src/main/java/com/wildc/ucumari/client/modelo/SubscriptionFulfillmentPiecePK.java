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
public class SubscriptionFulfillmentPiecePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "SUBSCRIPTION_ACTIVITY_ID")
    private String subscriptionActivityId;
    @Basic(optional = false)
    @Column(name = "SUBSCRIPTION_ID")
    private String subscriptionId;

    public SubscriptionFulfillmentPiecePK() {
    }

    public SubscriptionFulfillmentPiecePK(String subscriptionActivityId, String subscriptionId) {
        this.subscriptionActivityId = subscriptionActivityId;
        this.subscriptionId = subscriptionId;
    }

    public String getSubscriptionActivityId() {
        return subscriptionActivityId;
    }

    public void setSubscriptionActivityId(String subscriptionActivityId) {
        this.subscriptionActivityId = subscriptionActivityId;
    }

    public String getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (subscriptionActivityId != null ? subscriptionActivityId.hashCode() : 0);
        hash += (subscriptionId != null ? subscriptionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubscriptionFulfillmentPiecePK)) {
            return false;
        }
        SubscriptionFulfillmentPiecePK other = (SubscriptionFulfillmentPiecePK) object;
        if ((this.subscriptionActivityId == null && other.subscriptionActivityId != null) || (this.subscriptionActivityId != null && !this.subscriptionActivityId.equals(other.subscriptionActivityId))) {
            return false;
        }
        if ((this.subscriptionId == null && other.subscriptionId != null) || (this.subscriptionId != null && !this.subscriptionId.equals(other.subscriptionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.SubscriptionFulfillmentPiecePK[ subscriptionActivityId=" + subscriptionActivityId + ", subscriptionId=" + subscriptionId + " ]";
    }
    
}
