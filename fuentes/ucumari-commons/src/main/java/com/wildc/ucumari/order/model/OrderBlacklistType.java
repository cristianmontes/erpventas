/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.order.model;

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
@Table(name = "order_blacklist_type")
@NamedQueries({
    @NamedQuery(name = "OrderBlacklistType.findAll", query = "SELECT o FROM OrderBlacklistType o")})
public class OrderBlacklistType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ORDER_BLACKLIST_TYPE_ID")
    private String orderBlacklistTypeId;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "orderBlacklistType")
    private List<OrderBlacklist> orderBlacklistList;

    public OrderBlacklistType() {
    }

    public OrderBlacklistType(String orderBlacklistTypeId) {
        this.orderBlacklistTypeId = orderBlacklistTypeId;
    }

    public String getOrderBlacklistTypeId() {
        return orderBlacklistTypeId;
    }

    public void setOrderBlacklistTypeId(String orderBlacklistTypeId) {
        this.orderBlacklistTypeId = orderBlacklistTypeId;
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

    public List<OrderBlacklist> getOrderBlacklistList() {
        return orderBlacklistList;
    }

    public void setOrderBlacklistList(List<OrderBlacklist> orderBlacklistList) {
        this.orderBlacklistList = orderBlacklistList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderBlacklistTypeId != null ? orderBlacklistTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderBlacklistType)) {
            return false;
        }
        OrderBlacklistType other = (OrderBlacklistType) object;
        if ((this.orderBlacklistTypeId == null && other.orderBlacklistTypeId != null) || (this.orderBlacklistTypeId != null && !this.orderBlacklistTypeId.equals(other.orderBlacklistTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.OrderBlacklistType[ orderBlacklistTypeId=" + orderBlacklistTypeId + " ]";
    }
    
}
