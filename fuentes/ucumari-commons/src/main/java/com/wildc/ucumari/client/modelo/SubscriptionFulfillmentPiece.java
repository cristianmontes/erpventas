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
@Table(name = "subscription_fulfillment_piece")
@NamedQueries({
    @NamedQuery(name = "SubscriptionFulfillmentPiece.findAll", query = "SELECT s FROM SubscriptionFulfillmentPiece s")})
public class SubscriptionFulfillmentPiece implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SubscriptionFulfillmentPiecePK subscriptionFulfillmentPiecePK;
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
    @JoinColumn(name = "SUBSCRIPTION_ACTIVITY_ID", referencedColumnName = "SUBSCRIPTION_ACTIVITY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private SubscriptionActivity subscriptionActivity;
    @JoinColumn(name = "SUBSCRIPTION_ID", referencedColumnName = "SUBSCRIPTION_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Subscription subscription;

    public SubscriptionFulfillmentPiece() {
    }

    public SubscriptionFulfillmentPiece(SubscriptionFulfillmentPiecePK subscriptionFulfillmentPiecePK) {
        this.subscriptionFulfillmentPiecePK = subscriptionFulfillmentPiecePK;
    }

    public SubscriptionFulfillmentPiece(String subscriptionActivityId, String subscriptionId) {
        this.subscriptionFulfillmentPiecePK = new SubscriptionFulfillmentPiecePK(subscriptionActivityId, subscriptionId);
    }

    public SubscriptionFulfillmentPiecePK getSubscriptionFulfillmentPiecePK() {
        return subscriptionFulfillmentPiecePK;
    }

    public void setSubscriptionFulfillmentPiecePK(SubscriptionFulfillmentPiecePK subscriptionFulfillmentPiecePK) {
        this.subscriptionFulfillmentPiecePK = subscriptionFulfillmentPiecePK;
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

    public SubscriptionActivity getSubscriptionActivity() {
        return subscriptionActivity;
    }

    public void setSubscriptionActivity(SubscriptionActivity subscriptionActivity) {
        this.subscriptionActivity = subscriptionActivity;
    }

    public Subscription getSubscription() {
        return subscription;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (subscriptionFulfillmentPiecePK != null ? subscriptionFulfillmentPiecePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubscriptionFulfillmentPiece)) {
            return false;
        }
        SubscriptionFulfillmentPiece other = (SubscriptionFulfillmentPiece) object;
        if ((this.subscriptionFulfillmentPiecePK == null && other.subscriptionFulfillmentPiecePK != null) || (this.subscriptionFulfillmentPiecePK != null && !this.subscriptionFulfillmentPiecePK.equals(other.subscriptionFulfillmentPiecePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.SubscriptionFulfillmentPiece[ subscriptionFulfillmentPiecePK=" + subscriptionFulfillmentPiecePK + " ]";
    }
    
}
