/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.order.model;

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

import com.wildc.ucumari.contact.model.ContactMech;
import com.wildc.ucumari.contact.model.ContactMechPurposeType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "order_item_contact_mech")
@NamedQueries({
    @NamedQuery(name = "OrderItemContactMech.findAll", query = "SELECT o FROM OrderItemContactMech o")})
public class OrderItemContactMech implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OrderItemContactMechPK orderItemContactMechPK;
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
        @JoinColumn(name = "ORDER_ID", referencedColumnName = "ORDER_ID", insertable = false, updatable = false),
        @JoinColumn(name = "ORDER_ITEM_SEQ_ID", referencedColumnName = "ORDER_ITEM_SEQ_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private OrderItem orderItem;
    @JoinColumn(name = "CONTACT_MECH_PURPOSE_TYPE_ID", referencedColumnName = "CONTACT_MECH_PURPOSE_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ContactMechPurposeType contactMechPurposeType;
    @JoinColumn(name = "CONTACT_MECH_ID", referencedColumnName = "CONTACT_MECH_ID")
    @ManyToOne
    private ContactMech contactMechId;

    public OrderItemContactMech() {
    }

    public OrderItemContactMech(OrderItemContactMechPK orderItemContactMechPK) {
        this.orderItemContactMechPK = orderItemContactMechPK;
    }

    public OrderItemContactMech(String orderId, String orderItemSeqId, String contactMechPurposeTypeId) {
        this.orderItemContactMechPK = new OrderItemContactMechPK(orderId, orderItemSeqId, contactMechPurposeTypeId);
    }

    public OrderItemContactMechPK getOrderItemContactMechPK() {
        return orderItemContactMechPK;
    }

    public void setOrderItemContactMechPK(OrderItemContactMechPK orderItemContactMechPK) {
        this.orderItemContactMechPK = orderItemContactMechPK;
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

    public OrderItem getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(OrderItem orderItem) {
        this.orderItem = orderItem;
    }

    public ContactMechPurposeType getContactMechPurposeType() {
        return contactMechPurposeType;
    }

    public void setContactMechPurposeType(ContactMechPurposeType contactMechPurposeType) {
        this.contactMechPurposeType = contactMechPurposeType;
    }

    public ContactMech getContactMechId() {
        return contactMechId;
    }

    public void setContactMechId(ContactMech contactMechId) {
        this.contactMechId = contactMechId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderItemContactMechPK != null ? orderItemContactMechPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderItemContactMech)) {
            return false;
        }
        OrderItemContactMech other = (OrderItemContactMech) object;
        if ((this.orderItemContactMechPK == null && other.orderItemContactMechPK != null) || (this.orderItemContactMechPK != null && !this.orderItemContactMechPK.equals(other.orderItemContactMechPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.OrderItemContactMech[ orderItemContactMechPK=" + orderItemContactMechPK + " ]";
    }
    
}
