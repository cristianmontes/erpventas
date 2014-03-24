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
@Table(name = "order_adjustment_attribute")
@NamedQueries({
    @NamedQuery(name = "OrderAdjustmentAttribute.findAll", query = "SELECT o FROM OrderAdjustmentAttribute o")})
public class OrderAdjustmentAttribute implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OrderAdjustmentAttributePK orderAdjustmentAttributePK;
    @Column(name = "ATTR_VALUE")
    private String attrValue;
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
    @JoinColumn(name = "ORDER_ADJUSTMENT_ID", referencedColumnName = "ORDER_ADJUSTMENT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private OrderAdjustment orderAdjustment;

    public OrderAdjustmentAttribute() {
    }

    public OrderAdjustmentAttribute(OrderAdjustmentAttributePK orderAdjustmentAttributePK) {
        this.orderAdjustmentAttributePK = orderAdjustmentAttributePK;
    }

    public OrderAdjustmentAttribute(String orderAdjustmentId, String attrName) {
        this.orderAdjustmentAttributePK = new OrderAdjustmentAttributePK(orderAdjustmentId, attrName);
    }

    public OrderAdjustmentAttributePK getOrderAdjustmentAttributePK() {
        return orderAdjustmentAttributePK;
    }

    public void setOrderAdjustmentAttributePK(OrderAdjustmentAttributePK orderAdjustmentAttributePK) {
        this.orderAdjustmentAttributePK = orderAdjustmentAttributePK;
    }

    public String getAttrValue() {
        return attrValue;
    }

    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue;
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

    public OrderAdjustment getOrderAdjustment() {
        return orderAdjustment;
    }

    public void setOrderAdjustment(OrderAdjustment orderAdjustment) {
        this.orderAdjustment = orderAdjustment;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderAdjustmentAttributePK != null ? orderAdjustmentAttributePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderAdjustmentAttribute)) {
            return false;
        }
        OrderAdjustmentAttribute other = (OrderAdjustmentAttribute) object;
        if ((this.orderAdjustmentAttributePK == null && other.orderAdjustmentAttributePK != null) || (this.orderAdjustmentAttributePK != null && !this.orderAdjustmentAttributePK.equals(other.orderAdjustmentAttributePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.OrderAdjustmentAttribute[ orderAdjustmentAttributePK=" + orderAdjustmentAttributePK + " ]";
    }
    
}
