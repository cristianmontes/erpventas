/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.order.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.parameters.model.StatusItem;
import com.wildc.ucumari.security.model.UserLogin;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "order_status")
public class OrderStatus implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ORDER_STATUS_ID")
    private String orderStatusId;
    @Column(name = "ORDER_ITEM_SEQ_ID")
    private String orderItemSeqId;
    @Column(name = "ORDER_PAYMENT_PREFERENCE_ID")
    private String orderPaymentPreferenceId;
    @Column(name = "STATUS_DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date statusDatetime;
    @Column(name = "CHANGE_REASON")
    private String changeReason;
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
    @JoinColumn(name = "STATUS_USER_LOGIN", referencedColumnName = "USER_LOGIN_ID")
    @ManyToOne
    private UserLogin statusUserLogin;
    @JoinColumn(name = "STATUS_ID", referencedColumnName = "STATUS_ID")
    @ManyToOne
    private StatusItem statusId;
    @JoinColumn(name = "ORDER_ID", referencedColumnName = "ORDER_ID")
    @ManyToOne
    private OrderHeader orderId;

    public OrderStatus() {
    }

    public OrderStatus(String orderStatusId) {
        this.orderStatusId = orderStatusId;
    }

    public String getOrderStatusId() {
        return orderStatusId;
    }

    public void setOrderStatusId(String orderStatusId) {
        this.orderStatusId = orderStatusId;
    }

    public String getOrderItemSeqId() {
        return orderItemSeqId;
    }

    public void setOrderItemSeqId(String orderItemSeqId) {
        this.orderItemSeqId = orderItemSeqId;
    }

    public String getOrderPaymentPreferenceId() {
        return orderPaymentPreferenceId;
    }

    public void setOrderPaymentPreferenceId(String orderPaymentPreferenceId) {
        this.orderPaymentPreferenceId = orderPaymentPreferenceId;
    }

    public Date getStatusDatetime() {
        return statusDatetime;
    }

    public void setStatusDatetime(Date statusDatetime) {
        this.statusDatetime = statusDatetime;
    }

    public String getChangeReason() {
        return changeReason;
    }

    public void setChangeReason(String changeReason) {
        this.changeReason = changeReason;
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

    public UserLogin getStatusUserLogin() {
        return statusUserLogin;
    }

    public void setStatusUserLogin(UserLogin statusUserLogin) {
        this.statusUserLogin = statusUserLogin;
    }

    public StatusItem getStatusId() {
        return statusId;
    }

    public void setStatusId(StatusItem statusId) {
        this.statusId = statusId;
    }

    public OrderHeader getOrderId() {
        return orderId;
    }

    public void setOrderId(OrderHeader orderId) {
        this.orderId = orderId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderStatusId != null ? orderStatusId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderStatus)) {
            return false;
        }
        OrderStatus other = (OrderStatus) object;
        if ((this.orderStatusId == null && other.orderStatusId != null) || (this.orderStatusId != null && !this.orderStatusId.equals(other.orderStatusId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.OrderStatus[ orderStatusId=" + orderStatusId + " ]";
    }
    
}
