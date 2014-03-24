/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.returns.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
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

import com.wildc.ucumari.accounting.model.BillingAccount;
import com.wildc.ucumari.order.model.OrderHeader;
import com.wildc.ucumari.order.model.OrderPaymentPreference;
import com.wildc.ucumari.payment.model.Payment;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "return_item_response")
@NamedQueries({
    @NamedQuery(name = "ReturnItemResponse.findAll", query = "SELECT r FROM ReturnItemResponse r")})
public class ReturnItemResponse implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "RETURN_ITEM_RESPONSE_ID")
    private String returnItemResponseId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "RESPONSE_AMOUNT")
    private BigDecimal responseAmount;
    @Column(name = "RESPONSE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date responseDate;
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
    @JoinColumn(name = "REPLACEMENT_ORDER_ID", referencedColumnName = "ORDER_ID")
    @ManyToOne
    private OrderHeader replacementOrderId;
    @JoinColumn(name = "PAYMENT_ID", referencedColumnName = "PAYMENT_ID")
    @ManyToOne
    private Payment paymentId;
    @JoinColumn(name = "ORDER_PAYMENT_PREFERENCE_ID", referencedColumnName = "ORDER_PAYMENT_PREFERENCE_ID")
    @ManyToOne
    private OrderPaymentPreference orderPaymentPreferenceId;
    @JoinColumn(name = "BILLING_ACCOUNT_ID", referencedColumnName = "BILLING_ACCOUNT_ID")
    @ManyToOne
    private BillingAccount billingAccountId;
    @OneToMany(mappedBy = "returnItemResponseId")
    private List<ReturnItem> returnItemList;

    public ReturnItemResponse() {
    }

    public ReturnItemResponse(String returnItemResponseId) {
        this.returnItemResponseId = returnItemResponseId;
    }

    public String getReturnItemResponseId() {
        return returnItemResponseId;
    }

    public void setReturnItemResponseId(String returnItemResponseId) {
        this.returnItemResponseId = returnItemResponseId;
    }

    public BigDecimal getResponseAmount() {
        return responseAmount;
    }

    public void setResponseAmount(BigDecimal responseAmount) {
        this.responseAmount = responseAmount;
    }

    public Date getResponseDate() {
        return responseDate;
    }

    public void setResponseDate(Date responseDate) {
        this.responseDate = responseDate;
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

    public OrderHeader getReplacementOrderId() {
        return replacementOrderId;
    }

    public void setReplacementOrderId(OrderHeader replacementOrderId) {
        this.replacementOrderId = replacementOrderId;
    }

    public Payment getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Payment paymentId) {
        this.paymentId = paymentId;
    }

    public OrderPaymentPreference getOrderPaymentPreferenceId() {
        return orderPaymentPreferenceId;
    }

    public void setOrderPaymentPreferenceId(OrderPaymentPreference orderPaymentPreferenceId) {
        this.orderPaymentPreferenceId = orderPaymentPreferenceId;
    }

    public BillingAccount getBillingAccountId() {
        return billingAccountId;
    }

    public void setBillingAccountId(BillingAccount billingAccountId) {
        this.billingAccountId = billingAccountId;
    }

    public List<ReturnItem> getReturnItemList() {
        return returnItemList;
    }

    public void setReturnItemList(List<ReturnItem> returnItemList) {
        this.returnItemList = returnItemList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (returnItemResponseId != null ? returnItemResponseId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReturnItemResponse)) {
            return false;
        }
        ReturnItemResponse other = (ReturnItemResponse) object;
        if ((this.returnItemResponseId == null && other.returnItemResponseId != null) || (this.returnItemResponseId != null && !this.returnItemResponseId.equals(other.returnItemResponseId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ReturnItemResponse[ returnItemResponseId=" + returnItemResponseId + " ]";
    }
    
}
