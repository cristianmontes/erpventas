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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "subscription_type")
@NamedQueries({
    @NamedQuery(name = "SubscriptionType.findAll", query = "SELECT s FROM SubscriptionType s")})
public class SubscriptionType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SUBSCRIPTION_TYPE_ID")
    private String subscriptionTypeId;
    @Column(name = "HAS_TABLE")
    private Character hasTable;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "subscriptionType")
    private List<SubscriptionTypeAttr> subscriptionTypeAttrList;
    @OneToMany(mappedBy = "subscriptionTypeId")
    private List<Subscription> subscriptionList;
    @OneToMany(mappedBy = "parentTypeId")
    private List<SubscriptionType> subscriptionTypeList;
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "SUBSCRIPTION_TYPE_ID")
    @ManyToOne
    private SubscriptionType parentTypeId;

    public SubscriptionType() {
    }

    public SubscriptionType(String subscriptionTypeId) {
        this.subscriptionTypeId = subscriptionTypeId;
    }

    public String getSubscriptionTypeId() {
        return subscriptionTypeId;
    }

    public void setSubscriptionTypeId(String subscriptionTypeId) {
        this.subscriptionTypeId = subscriptionTypeId;
    }

    public Character getHasTable() {
        return hasTable;
    }

    public void setHasTable(Character hasTable) {
        this.hasTable = hasTable;
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

    public List<SubscriptionTypeAttr> getSubscriptionTypeAttrList() {
        return subscriptionTypeAttrList;
    }

    public void setSubscriptionTypeAttrList(List<SubscriptionTypeAttr> subscriptionTypeAttrList) {
        this.subscriptionTypeAttrList = subscriptionTypeAttrList;
    }

    public List<Subscription> getSubscriptionList() {
        return subscriptionList;
    }

    public void setSubscriptionList(List<Subscription> subscriptionList) {
        this.subscriptionList = subscriptionList;
    }

    public List<SubscriptionType> getSubscriptionTypeList() {
        return subscriptionTypeList;
    }

    public void setSubscriptionTypeList(List<SubscriptionType> subscriptionTypeList) {
        this.subscriptionTypeList = subscriptionTypeList;
    }

    public SubscriptionType getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(SubscriptionType parentTypeId) {
        this.parentTypeId = parentTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (subscriptionTypeId != null ? subscriptionTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubscriptionType)) {
            return false;
        }
        SubscriptionType other = (SubscriptionType) object;
        if ((this.subscriptionTypeId == null && other.subscriptionTypeId != null) || (this.subscriptionTypeId != null && !this.subscriptionTypeId.equals(other.subscriptionTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.SubscriptionType[ subscriptionTypeId=" + subscriptionTypeId + " ]";
    }
    
}
