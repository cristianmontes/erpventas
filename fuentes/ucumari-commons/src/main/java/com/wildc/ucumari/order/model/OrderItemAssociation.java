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
@Table(name = "order_item_association")
@NamedQueries({
    @NamedQuery(name = "OrderItemAssociation.findAll", query = "SELECT o FROM OrderItemAssociation o")})
public class OrderItemAssociation implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OrderItemAssociationPK orderItemAssociationPK;
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
    @JoinColumn(name = "SALES_ORDER_ID", referencedColumnName = "ORDER_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private OrderHeader orderHeader;
    @JoinColumn(name = "PURCHASE_ORDER_ID", referencedColumnName = "ORDER_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private OrderHeader orderHeader1;

    public OrderItemAssociation() {
    }

    public OrderItemAssociation(OrderItemAssociationPK orderItemAssociationPK) {
        this.orderItemAssociationPK = orderItemAssociationPK;
    }

    public OrderItemAssociation(String salesOrderId, String soItemSeqId, String purchaseOrderId, String poItemSeqId) {
        this.orderItemAssociationPK = new OrderItemAssociationPK(salesOrderId, soItemSeqId, purchaseOrderId, poItemSeqId);
    }

    public OrderItemAssociationPK getOrderItemAssociationPK() {
        return orderItemAssociationPK;
    }

    public void setOrderItemAssociationPK(OrderItemAssociationPK orderItemAssociationPK) {
        this.orderItemAssociationPK = orderItemAssociationPK;
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

    public OrderHeader getOrderHeader() {
        return orderHeader;
    }

    public void setOrderHeader(OrderHeader orderHeader) {
        this.orderHeader = orderHeader;
    }

    public OrderHeader getOrderHeader1() {
        return orderHeader1;
    }

    public void setOrderHeader1(OrderHeader orderHeader1) {
        this.orderHeader1 = orderHeader1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderItemAssociationPK != null ? orderItemAssociationPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderItemAssociation)) {
            return false;
        }
        OrderItemAssociation other = (OrderItemAssociation) object;
        if ((this.orderItemAssociationPK == null && other.orderItemAssociationPK != null) || (this.orderItemAssociationPK != null && !this.orderItemAssociationPK.equals(other.orderItemAssociationPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.OrderItemAssociation[ orderItemAssociationPK=" + orderItemAssociationPK + " ]";
    }
    
}
