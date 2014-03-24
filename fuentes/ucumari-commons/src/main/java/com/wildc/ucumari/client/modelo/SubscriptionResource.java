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

import com.wildc.ucumari.product.model.ProductSubscriptionResource;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "subscription_resource")
@NamedQueries({
    @NamedQuery(name = "SubscriptionResource.findAll", query = "SELECT s FROM SubscriptionResource s")})
public class SubscriptionResource implements Serializable {
    @OneToMany(mappedBy = "subscriptionResourceId")
    private List<Subscription> subscriptionList;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SUBSCRIPTION_RESOURCE_ID")
    private String subscriptionResourceId;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "subscriptionResource")
    private List<ProductSubscriptionResource> productSubscriptionResourceList;
    @JoinColumn(name = "WEB_SITE_ID", referencedColumnName = "WEB_SITE_ID")
    @ManyToOne
    private WebSite webSiteId;
    @OneToMany(mappedBy = "parentResourceId")
    private List<SubscriptionResource> subscriptionResourceList;
    @JoinColumn(name = "PARENT_RESOURCE_ID", referencedColumnName = "SUBSCRIPTION_RESOURCE_ID")
    @ManyToOne
    private SubscriptionResource parentResourceId;
    @JoinColumn(name = "CONTENT_ID", referencedColumnName = "CONTENT_ID")
    @ManyToOne
    private Content contentId;

    public SubscriptionResource() {
    }

    public SubscriptionResource(String subscriptionResourceId) {
        this.subscriptionResourceId = subscriptionResourceId;
    }

    public String getSubscriptionResourceId() {
        return subscriptionResourceId;
    }

    public void setSubscriptionResourceId(String subscriptionResourceId) {
        this.subscriptionResourceId = subscriptionResourceId;
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

    public List<ProductSubscriptionResource> getProductSubscriptionResourceList() {
        return productSubscriptionResourceList;
    }

    public void setProductSubscriptionResourceList(List<ProductSubscriptionResource> productSubscriptionResourceList) {
        this.productSubscriptionResourceList = productSubscriptionResourceList;
    }

    public WebSite getWebSiteId() {
        return webSiteId;
    }

    public void setWebSiteId(WebSite webSiteId) {
        this.webSiteId = webSiteId;
    }

    public List<SubscriptionResource> getSubscriptionResourceList() {
        return subscriptionResourceList;
    }

    public void setSubscriptionResourceList(List<SubscriptionResource> subscriptionResourceList) {
        this.subscriptionResourceList = subscriptionResourceList;
    }

    public SubscriptionResource getParentResourceId() {
        return parentResourceId;
    }

    public void setParentResourceId(SubscriptionResource parentResourceId) {
        this.parentResourceId = parentResourceId;
    }

    public Content getContentId() {
        return contentId;
    }

    public void setContentId(Content contentId) {
        this.contentId = contentId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (subscriptionResourceId != null ? subscriptionResourceId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubscriptionResource)) {
            return false;
        }
        SubscriptionResource other = (SubscriptionResource) object;
        if ((this.subscriptionResourceId == null && other.subscriptionResourceId != null) || (this.subscriptionResourceId != null && !this.subscriptionResourceId.equals(other.subscriptionResourceId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.SubscriptionResource[ subscriptionResourceId=" + subscriptionResourceId + " ]";
    }

    public List<Subscription> getSubscriptionList() {
        return subscriptionList;
    }

    public void setSubscriptionList(List<Subscription> subscriptionList) {
        this.subscriptionList = subscriptionList;
    }
    
}
