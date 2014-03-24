/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.order.model;

import com.wildc.ucumari.party.model.Party;
import com.wildc.ucumari.party.model.PartyRole;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
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
@Table(name = "order_item_role")
@NamedQueries({
    @NamedQuery(name = "OrderItemRole.findAll", query = "SELECT o FROM OrderItemRole o")})
public class OrderItemRole implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OrderItemRolePK orderItemRolePK;
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
    @JoinColumns({
        @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false),
        @JoinColumn(name = "ROLE_TYPE_ID", referencedColumnName = "ROLE_TYPE_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private PartyRole partyRole;
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Party party;
    @JoinColumns({
        @JoinColumn(name = "ORDER_ID", referencedColumnName = "ORDER_ID", insertable = false, updatable = false),
        @JoinColumn(name = "ORDER_ITEM_SEQ_ID", referencedColumnName = "ORDER_ITEM_SEQ_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private OrderItem orderItem;
    @JoinColumn(name = "ORDER_ID", referencedColumnName = "ORDER_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private OrderHeader orderHeader;

    public OrderItemRole() {
    }

    public OrderItemRole(OrderItemRolePK orderItemRolePK) {
        this.orderItemRolePK = orderItemRolePK;
    }

    public OrderItemRole(String orderId, String orderItemSeqId, String partyId, String roleTypeId) {
        this.orderItemRolePK = new OrderItemRolePK(orderId, orderItemSeqId, partyId, roleTypeId);
    }

    public OrderItemRolePK getOrderItemRolePK() {
        return orderItemRolePK;
    }

    public void setOrderItemRolePK(OrderItemRolePK orderItemRolePK) {
        this.orderItemRolePK = orderItemRolePK;
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

    public PartyRole getPartyRole() {
        return partyRole;
    }

    public void setPartyRole(PartyRole partyRole) {
        this.partyRole = partyRole;
    }

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    public OrderItem getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(OrderItem orderItem) {
        this.orderItem = orderItem;
    }

    public OrderHeader getOrderHeader() {
        return orderHeader;
    }

    public void setOrderHeader(OrderHeader orderHeader) {
        this.orderHeader = orderHeader;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderItemRolePK != null ? orderItemRolePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderItemRole)) {
            return false;
        }
        OrderItemRole other = (OrderItemRole) object;
        if ((this.orderItemRolePK == null && other.orderItemRolePK != null) || (this.orderItemRolePK != null && !this.orderItemRolePK.equals(other.orderItemRolePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.OrderItemRole[ orderItemRolePK=" + orderItemRolePK + " ]";
    }
    
}
