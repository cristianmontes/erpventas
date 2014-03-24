/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.payment.model;

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

import com.wildc.ucumari.order.model.OrderPaymentPreference;
import com.wildc.ucumari.parameters.model.Enumeration;
import com.wildc.ucumari.parameters.model.Uom;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "payment_gateway_response")
@NamedQueries({
    @NamedQuery(name = "PaymentGatewayResponse.findAll", query = "SELECT p FROM PaymentGatewayResponse p")})
public class PaymentGatewayResponse implements Serializable {
    @OneToMany(mappedBy = "paymentGatewayResponseId")
    private List<PaymentGatewayRespMsg> paymentGatewayRespMsgList;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PAYMENT_GATEWAY_RESPONSE_ID")
    private String paymentGatewayResponseId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "AMOUNT")
    private BigDecimal amount;
    @Column(name = "REFERENCE_NUM")
    private String referenceNum;
    @Column(name = "ALT_REFERENCE")
    private String altReference;
    @Column(name = "SUB_REFERENCE")
    private String subReference;
    @Column(name = "GATEWAY_CODE")
    private String gatewayCode;
    @Column(name = "GATEWAY_FLAG")
    private String gatewayFlag;
    @Column(name = "GATEWAY_AVS_RESULT")
    private String gatewayAvsResult;
    @Column(name = "GATEWAY_CV_RESULT")
    private String gatewayCvResult;
    @Column(name = "GATEWAY_SCORE_RESULT")
    private String gatewayScoreResult;
    @Column(name = "GATEWAY_MESSAGE")
    private String gatewayMessage;
    @Column(name = "TRANSACTION_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date transactionDate;
    @Column(name = "RESULT_DECLINED")
    private Character resultDeclined;
    @Column(name = "RESULT_NSF")
    private Character resultNsf;
    @Column(name = "RESULT_BAD_EXPIRE")
    private Character resultBadExpire;
    @Column(name = "RESULT_BAD_CARD_NUMBER")
    private Character resultBadCardNumber;
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
    @OneToMany(mappedBy = "paymentGatewayResponseId")
    private List<Payment> paymentList;
    @JoinColumn(name = "TRANS_CODE_ENUM_ID", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration transCodeEnumId;
    @JoinColumn(name = "PAYMENT_SERVICE_TYPE_ENUM_ID", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration paymentServiceTypeEnumId;
    @JoinColumn(name = "PAYMENT_METHOD_TYPE_ID", referencedColumnName = "PAYMENT_METHOD_TYPE_ID")
    @ManyToOne
    private PaymentMethodType paymentMethodTypeId;
    @JoinColumn(name = "PAYMENT_METHOD_ID", referencedColumnName = "PAYMENT_METHOD_ID")
    @ManyToOne
    private PaymentMethod paymentMethodId;
    @JoinColumn(name = "ORDER_PAYMENT_PREFERENCE_ID", referencedColumnName = "ORDER_PAYMENT_PREFERENCE_ID")
    @ManyToOne
    private OrderPaymentPreference orderPaymentPreferenceId;
    @JoinColumn(name = "CURRENCY_UOM_ID", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom currencyUomId;

    public PaymentGatewayResponse() {
    }

    public PaymentGatewayResponse(String paymentGatewayResponseId) {
        this.paymentGatewayResponseId = paymentGatewayResponseId;
    }

    public String getPaymentGatewayResponseId() {
        return paymentGatewayResponseId;
    }

    public void setPaymentGatewayResponseId(String paymentGatewayResponseId) {
        this.paymentGatewayResponseId = paymentGatewayResponseId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getReferenceNum() {
        return referenceNum;
    }

    public void setReferenceNum(String referenceNum) {
        this.referenceNum = referenceNum;
    }

    public String getAltReference() {
        return altReference;
    }

    public void setAltReference(String altReference) {
        this.altReference = altReference;
    }

    public String getSubReference() {
        return subReference;
    }

    public void setSubReference(String subReference) {
        this.subReference = subReference;
    }

    public String getGatewayCode() {
        return gatewayCode;
    }

    public void setGatewayCode(String gatewayCode) {
        this.gatewayCode = gatewayCode;
    }

    public String getGatewayFlag() {
        return gatewayFlag;
    }

    public void setGatewayFlag(String gatewayFlag) {
        this.gatewayFlag = gatewayFlag;
    }

    public String getGatewayAvsResult() {
        return gatewayAvsResult;
    }

    public void setGatewayAvsResult(String gatewayAvsResult) {
        this.gatewayAvsResult = gatewayAvsResult;
    }

    public String getGatewayCvResult() {
        return gatewayCvResult;
    }

    public void setGatewayCvResult(String gatewayCvResult) {
        this.gatewayCvResult = gatewayCvResult;
    }

    public String getGatewayScoreResult() {
        return gatewayScoreResult;
    }

    public void setGatewayScoreResult(String gatewayScoreResult) {
        this.gatewayScoreResult = gatewayScoreResult;
    }

    public String getGatewayMessage() {
        return gatewayMessage;
    }

    public void setGatewayMessage(String gatewayMessage) {
        this.gatewayMessage = gatewayMessage;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Character getResultDeclined() {
        return resultDeclined;
    }

    public void setResultDeclined(Character resultDeclined) {
        this.resultDeclined = resultDeclined;
    }

    public Character getResultNsf() {
        return resultNsf;
    }

    public void setResultNsf(Character resultNsf) {
        this.resultNsf = resultNsf;
    }

    public Character getResultBadExpire() {
        return resultBadExpire;
    }

    public void setResultBadExpire(Character resultBadExpire) {
        this.resultBadExpire = resultBadExpire;
    }

    public Character getResultBadCardNumber() {
        return resultBadCardNumber;
    }

    public void setResultBadCardNumber(Character resultBadCardNumber) {
        this.resultBadCardNumber = resultBadCardNumber;
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

    public Enumeration getTransCodeEnumId() {
        return transCodeEnumId;
    }

    public void setTransCodeEnumId(Enumeration transCodeEnumId) {
        this.transCodeEnumId = transCodeEnumId;
    }

    public Enumeration getPaymentServiceTypeEnumId() {
        return paymentServiceTypeEnumId;
    }

    public void setPaymentServiceTypeEnumId(Enumeration paymentServiceTypeEnumId) {
        this.paymentServiceTypeEnumId = paymentServiceTypeEnumId;
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

    public OrderPaymentPreference getOrderPaymentPreferenceId() {
        return orderPaymentPreferenceId;
    }

    public void setOrderPaymentPreferenceId(OrderPaymentPreference orderPaymentPreferenceId) {
        this.orderPaymentPreferenceId = orderPaymentPreferenceId;
    }

    public Uom getCurrencyUomId() {
        return currencyUomId;
    }

    public void setCurrencyUomId(Uom currencyUomId) {
        this.currencyUomId = currencyUomId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paymentGatewayResponseId != null ? paymentGatewayResponseId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PaymentGatewayResponse)) {
            return false;
        }
        PaymentGatewayResponse other = (PaymentGatewayResponse) object;
        if ((this.paymentGatewayResponseId == null && other.paymentGatewayResponseId != null) || (this.paymentGatewayResponseId != null && !this.paymentGatewayResponseId.equals(other.paymentGatewayResponseId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PaymentGatewayResponse[ paymentGatewayResponseId=" + paymentGatewayResponseId + " ]";
    }

    public List<PaymentGatewayRespMsg> getPaymentGatewayRespMsgList() {
        return paymentGatewayRespMsgList;
    }

    public void setPaymentGatewayRespMsgList(List<PaymentGatewayRespMsg> paymentGatewayRespMsgList) {
        this.paymentGatewayRespMsgList = paymentGatewayRespMsgList;
    }
    
}
