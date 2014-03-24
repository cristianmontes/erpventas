/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.order.model;

import com.wildc.ucumari.client.modelo.FinAccount;
import com.wildc.ucumari.parameters.model.StatusItem;
import com.wildc.ucumari.payment.model.Payment;
import com.wildc.ucumari.payment.model.PaymentGatewayResponse;
import com.wildc.ucumari.payment.model.PaymentMethod;
import com.wildc.ucumari.payment.model.PaymentMethodType;
import com.wildc.ucumari.product.model.ProductPricePurpose;
import com.wildc.ucumari.returns.model.ReturnItemResponse;
import com.wildc.ucumari.security.model.UserLogin;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "order_payment_preference")
@NamedQueries({
    @NamedQuery(name = "OrderPaymentPreference.findAll", query = "SELECT o FROM OrderPaymentPreference o")})
public class OrderPaymentPreference implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ORDER_PAYMENT_PREFERENCE_ID")
    private String orderPaymentPreferenceId;
    @Column(name = "ORDER_ITEM_SEQ_ID")
    private String orderItemSeqId;
    @Column(name = "SHIP_GROUP_SEQ_ID")
    private String shipGroupSeqId;
    @Column(name = "SECURITY_CODE")
    private String securityCode;
    @Column(name = "TRACK2")
    private String track2;
    @Column(name = "PRESENT_FLAG")
    private Character presentFlag;
    @Column(name = "SWIPED_FLAG")
    private Character swipedFlag;
    @Column(name = "OVERFLOW_FLAG")
    private Character overflowFlag;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MAX_AMOUNT")
    private BigDecimal maxAmount;
    @Column(name = "PROCESS_ATTEMPT")
    private BigInteger processAttempt;
    @Column(name = "BILLING_POSTAL_CODE")
    private String billingPostalCode;
    @Column(name = "MANUAL_AUTH_CODE")
    private String manualAuthCode;
    @Column(name = "MANUAL_REF_NUM")
    private String manualRefNum;
    @Column(name = "NEEDS_NSF_RETRY")
    private Character needsNsfRetry;
    @Column(name = "CREATED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
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
    @OneToMany(mappedBy = "paymentPreferenceId")
    private List<Payment> paymentList;
    @JoinColumn(name = "CREATED_BY_USER_LOGIN", referencedColumnName = "USER_LOGIN_ID")
    @ManyToOne
    private UserLogin createdByUserLogin;
    @JoinColumn(name = "STATUS_ID", referencedColumnName = "STATUS_ID")
    @ManyToOne
    private StatusItem statusId;
    @JoinColumn(name = "PRODUCT_PRICE_PURPOSE_ID", referencedColumnName = "PRODUCT_PRICE_PURPOSE_ID")
    @ManyToOne
    private ProductPricePurpose productPricePurposeId;
    @JoinColumn(name = "PAYMENT_METHOD_TYPE_ID", referencedColumnName = "PAYMENT_METHOD_TYPE_ID")
    @ManyToOne
    private PaymentMethodType paymentMethodTypeId;
    @JoinColumn(name = "PAYMENT_METHOD_ID", referencedColumnName = "PAYMENT_METHOD_ID")
    @ManyToOne
    private PaymentMethod paymentMethodId;
    @JoinColumn(name = "ORDER_ID", referencedColumnName = "ORDER_ID")
    @ManyToOne
    private OrderHeader orderId;
    @JoinColumn(name = "FIN_ACCOUNT_ID", referencedColumnName = "FIN_ACCOUNT_ID")
    @ManyToOne
    private FinAccount finAccountId;
    @OneToMany(mappedBy = "orderPaymentPreferenceId")
    private List<PaymentGatewayResponse> paymentGatewayResponseList;
    @OneToMany(mappedBy = "orderPaymentPreferenceId")
    private List<ReturnItemResponse> returnItemResponseList;

    public OrderPaymentPreference() {
    }

    public OrderPaymentPreference(String orderPaymentPreferenceId) {
        this.orderPaymentPreferenceId = orderPaymentPreferenceId;
    }

    public String getOrderPaymentPreferenceId() {
        return orderPaymentPreferenceId;
    }

    public void setOrderPaymentPreferenceId(String orderPaymentPreferenceId) {
        this.orderPaymentPreferenceId = orderPaymentPreferenceId;
    }

    public String getOrderItemSeqId() {
        return orderItemSeqId;
    }

    public void setOrderItemSeqId(String orderItemSeqId) {
        this.orderItemSeqId = orderItemSeqId;
    }

    public String getShipGroupSeqId() {
        return shipGroupSeqId;
    }

    public void setShipGroupSeqId(String shipGroupSeqId) {
        this.shipGroupSeqId = shipGroupSeqId;
    }

    public String getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    public String getTrack2() {
        return track2;
    }

    public void setTrack2(String track2) {
        this.track2 = track2;
    }

    public Character getPresentFlag() {
        return presentFlag;
    }

    public void setPresentFlag(Character presentFlag) {
        this.presentFlag = presentFlag;
    }

    public Character getSwipedFlag() {
        return swipedFlag;
    }

    public void setSwipedFlag(Character swipedFlag) {
        this.swipedFlag = swipedFlag;
    }

    public Character getOverflowFlag() {
        return overflowFlag;
    }

    public void setOverflowFlag(Character overflowFlag) {
        this.overflowFlag = overflowFlag;
    }

    public BigDecimal getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(BigDecimal maxAmount) {
        this.maxAmount = maxAmount;
    }

    public BigInteger getProcessAttempt() {
        return processAttempt;
    }

    public void setProcessAttempt(BigInteger processAttempt) {
        this.processAttempt = processAttempt;
    }

    public String getBillingPostalCode() {
        return billingPostalCode;
    }

    public void setBillingPostalCode(String billingPostalCode) {
        this.billingPostalCode = billingPostalCode;
    }

    public String getManualAuthCode() {
        return manualAuthCode;
    }

    public void setManualAuthCode(String manualAuthCode) {
        this.manualAuthCode = manualAuthCode;
    }

    public String getManualRefNum() {
        return manualRefNum;
    }

    public void setManualRefNum(String manualRefNum) {
        this.manualRefNum = manualRefNum;
    }

    public Character getNeedsNsfRetry() {
        return needsNsfRetry;
    }

    public void setNeedsNsfRetry(Character needsNsfRetry) {
        this.needsNsfRetry = needsNsfRetry;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
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

    public List<Payment> getPaymentList() {
        return paymentList;
    }

    public void setPaymentList(List<Payment> paymentList) {
        this.paymentList = paymentList;
    }

    public UserLogin getCreatedByUserLogin() {
        return createdByUserLogin;
    }

    public void setCreatedByUserLogin(UserLogin createdByUserLogin) {
        this.createdByUserLogin = createdByUserLogin;
    }

    public StatusItem getStatusId() {
        return statusId;
    }

    public void setStatusId(StatusItem statusId) {
        this.statusId = statusId;
    }

    public ProductPricePurpose getProductPricePurposeId() {
        return productPricePurposeId;
    }

    public void setProductPricePurposeId(ProductPricePurpose productPricePurposeId) {
        this.productPricePurposeId = productPricePurposeId;
    }

    public PaymentMethodType getPaymentMethodTypeId() {
        return paymentMethodTypeId;
    }

    public void setPaymentMethodTypeId(PaymentMethodType paymentMethodTypeId) {
        this.paymentMethodTypeId = paymentMethodTypeId;
    }

    public PaymentMethod getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(PaymentMethod paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    public OrderHeader getOrderId() {
        return orderId;
    }

    public void setOrderId(OrderHeader orderId) {
        this.orderId = orderId;
    }

    public FinAccount getFinAccountId() {
        return finAccountId;
    }

    public void setFinAccountId(FinAccount finAccountId) {
        this.finAccountId = finAccountId;
    }

    public List<PaymentGatewayResponse> getPaymentGatewayResponseList() {
        return paymentGatewayResponseList;
    }

    public void setPaymentGatewayResponseList(List<PaymentGatewayResponse> paymentGatewayResponseList) {
        this.paymentGatewayResponseList = paymentGatewayResponseList;
    }

    public List<ReturnItemResponse> getReturnItemResponseList() {
        return returnItemResponseList;
    }

    public void setReturnItemResponseList(List<ReturnItemResponse> returnItemResponseList) {
        this.returnItemResponseList = returnItemResponseList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderPaymentPreferenceId != null ? orderPaymentPreferenceId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderPaymentPreference)) {
            return false;
        }
        OrderPaymentPreference other = (OrderPaymentPreference) object;
        if ((this.orderPaymentPreferenceId == null && other.orderPaymentPreferenceId != null) || (this.orderPaymentPreferenceId != null && !this.orderPaymentPreferenceId.equals(other.orderPaymentPreferenceId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.OrderPaymentPreference[ orderPaymentPreferenceId=" + orderPaymentPreferenceId + " ]";
    }
    
}
