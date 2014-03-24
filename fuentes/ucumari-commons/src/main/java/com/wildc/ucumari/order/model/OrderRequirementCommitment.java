/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.order.model;

import java.io.Serializable;
import java.math.BigDecimal;
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

import com.wildc.ucumari.client.modelo.Requirement;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "order_requirement_commitment")
@NamedQueries({
    @NamedQuery(name = "OrderRequirementCommitment.findAll", query = "SELECT o FROM OrderRequirementCommitment o")})
public class OrderRequirementCommitment implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OrderRequirementCommitmentPK orderRequirementCommitmentPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "QUANTITY")
    private BigDecimal quantity;
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
    @JoinColumn(name = "REQUIREMENT_ID", referencedColumnName = "REQUIREMENT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Requirement requirement;
    @JoinColumn(name = "ORDER_ID", referencedColumnName = "ORDER_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private OrderHeader orderHeader;
    @JoinColumns({
        @JoinColumn(name = "ORDER_ID", referencedColumnName = "ORDER_ID", insertable = false, updatable = false),
        @JoinColumn(name = "ORDER_ITEM_SEQ_ID", referencedColumnName = "ORDER_ITEM_SEQ_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private OrderItem orderItem;

    public OrderRequirementCommitment() {
    }

    public OrderRequirementCommitment(OrderRequirementCommitmentPK orderRequirementCommitmentPK) {
        this.orderRequirementCommitmentPK = orderRequirementCommitmentPK;
    }

    public OrderRequirementCommitment(String orderId, String orderItemSeqId, String requirementId) {
        this.orderRequirementCommitmentPK = new OrderRequirementCommitmentPK(orderId, orderItemSeqId, requirementId);
    }

    public OrderRequirementCommitmentPK getOrderRequirementCommitmentPK() {
        return orderRequirementCommitmentPK;
    }

    public void setOrderRequirementCommitmentPK(OrderRequirementCommitmentPK orderRequirementCommitmentPK) {
        this.orderRequirementCommitmentPK = orderRequirementCommitmentPK;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
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

    public Requirement getRequirement() {
        return requirement;
    }

    public void setRequirement(Requirement requirement) {
        this.requirement = requirement;
    }

    public OrderHeader getOrderHeader() {
        return orderHeader;
    }

    public void setOrderHeader(OrderHeader orderHeader) {
        this.orderHeader = orderHeader;
    }

    public OrderItem getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(OrderItem orderItem) {
        this.orderItem = orderItem;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderRequirementCommitmentPK != null ? orderRequirementCommitmentPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderRequirementCommitment)) {
            return false;
        }
        OrderRequirementCommitment other = (OrderRequirementCommitment) object;
        if ((this.orderRequirementCommitmentPK == null && other.orderRequirementCommitmentPK != null) || (this.orderRequirementCommitmentPK != null && !this.orderRequirementCommitmentPK.equals(other.orderRequirementCommitmentPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.OrderRequirementCommitment[ orderRequirementCommitmentPK=" + orderRequirementCommitmentPK + " ]";
    }
    
}
