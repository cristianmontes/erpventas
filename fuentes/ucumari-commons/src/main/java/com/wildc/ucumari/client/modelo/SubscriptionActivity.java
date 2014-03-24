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
@Table(name = "subscription_activity")
@NamedQueries({
    @NamedQuery(name = "SubscriptionActivity.findAll", query = "SELECT s FROM SubscriptionActivity s")})
public class SubscriptionActivity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SUBSCRIPTION_ACTIVITY_ID")
    private String subscriptionActivityId;
    @Column(name = "COMMENTS")
    private String comments;
    @Column(name = "DATE_SENT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateSent;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "subscriptionActivity")
    private List<SubscriptionFulfillmentPiece> subscriptionFulfillmentPieceList;

    public SubscriptionActivity() {
    }

    public SubscriptionActivity(String subscriptionActivityId) {
        this.subscriptionActivityId = subscriptionActivityId;
    }

    public String getSubscriptionActivityId() {
        return subscriptionActivityId;
    }

    public void setSubscriptionActivityId(String subscriptionActivityId) {
        this.subscriptionActivityId = subscriptionActivityId;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Date getDateSent() {
        return dateSent;
    }

    public void setDateSent(Date dateSent) {
        this.dateSent = dateSent;
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

    public List<SubscriptionFulfillmentPiece> getSubscriptionFulfillmentPieceList() {
        return subscriptionFulfillmentPieceList;
    }

    public void setSubscriptionFulfillmentPieceList(List<SubscriptionFulfillmentPiece> subscriptionFulfillmentPieceList) {
        this.subscriptionFulfillmentPieceList = subscriptionFulfillmentPieceList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (subscriptionActivityId != null ? subscriptionActivityId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubscriptionActivity)) {
            return false;
        }
        SubscriptionActivity other = (SubscriptionActivity) object;
        if ((this.subscriptionActivityId == null && other.subscriptionActivityId != null) || (this.subscriptionActivityId != null && !this.subscriptionActivityId.equals(other.subscriptionActivityId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.SubscriptionActivity[ subscriptionActivityId=" + subscriptionActivityId + " ]";
    }
    
}
