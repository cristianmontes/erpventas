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
@Table(name = "subscription_type_attr")
@NamedQueries({
    @NamedQuery(name = "SubscriptionTypeAttr.findAll", query = "SELECT s FROM SubscriptionTypeAttr s")})
public class SubscriptionTypeAttr implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SubscriptionTypeAttrPK subscriptionTypeAttrPK;
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
    @JoinColumn(name = "SUBSCRIPTION_TYPE_ID", referencedColumnName = "SUBSCRIPTION_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private SubscriptionType subscriptionType;

    public SubscriptionTypeAttr() {
    }

    public SubscriptionTypeAttr(SubscriptionTypeAttrPK subscriptionTypeAttrPK) {
        this.subscriptionTypeAttrPK = subscriptionTypeAttrPK;
    }

    public SubscriptionTypeAttr(String subscriptionTypeId, String attrName) {
        this.subscriptionTypeAttrPK = new SubscriptionTypeAttrPK(subscriptionTypeId, attrName);
    }

    public SubscriptionTypeAttrPK getSubscriptionTypeAttrPK() {
        return subscriptionTypeAttrPK;
    }

    public void setSubscriptionTypeAttrPK(SubscriptionTypeAttrPK subscriptionTypeAttrPK) {
        this.subscriptionTypeAttrPK = subscriptionTypeAttrPK;
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

    public SubscriptionType getSubscriptionType() {
        return subscriptionType;
    }

    public void setSubscriptionType(SubscriptionType subscriptionType) {
        this.subscriptionType = subscriptionType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (subscriptionTypeAttrPK != null ? subscriptionTypeAttrPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubscriptionTypeAttr)) {
            return false;
        }
        SubscriptionTypeAttr other = (SubscriptionTypeAttr) object;
        if ((this.subscriptionTypeAttrPK == null && other.subscriptionTypeAttrPK != null) || (this.subscriptionTypeAttrPK != null && !this.subscriptionTypeAttrPK.equals(other.subscriptionTypeAttrPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.SubscriptionTypeAttr[ subscriptionTypeAttrPK=" + subscriptionTypeAttrPK + " ]";
    }
    
}
