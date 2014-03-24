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
public class SubscriptionTypeAttrPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "SUBSCRIPTION_TYPE_ID")
    private String subscriptionTypeId;
    @Basic(optional = false)
    @Column(name = "ATTR_NAME")
    private String attrName;

    public SubscriptionTypeAttrPK() {
    }

    public SubscriptionTypeAttrPK(String subscriptionTypeId, String attrName) {
        this.subscriptionTypeId = subscriptionTypeId;
        this.attrName = attrName;
    }

    public String getSubscriptionTypeId() {
        return subscriptionTypeId;
    }

    public void setSubscriptionTypeId(String subscriptionTypeId) {
        this.subscriptionTypeId = subscriptionTypeId;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (subscriptionTypeId != null ? subscriptionTypeId.hashCode() : 0);
        hash += (attrName != null ? attrName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubscriptionTypeAttrPK)) {
            return false;
        }
        SubscriptionTypeAttrPK other = (SubscriptionTypeAttrPK) object;
        if ((this.subscriptionTypeId == null && other.subscriptionTypeId != null) || (this.subscriptionTypeId != null && !this.subscriptionTypeId.equals(other.subscriptionTypeId))) {
            return false;
        }
        if ((this.attrName == null && other.attrName != null) || (this.attrName != null && !this.attrName.equals(other.attrName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.SubscriptionTypeAttrPK[ subscriptionTypeId=" + subscriptionTypeId + ", attrName=" + attrName + " ]";
    }
    
}
