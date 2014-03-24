/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import com.wildc.ucumari.order.model.OrderHeader;
import com.wildc.ucumari.order.model.OrderItem;
import com.wildc.ucumari.parameters.model.Enumeration;
import com.wildc.ucumari.party.model.Party;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "gift_card_fulfillment")
@NamedQueries({
    @NamedQuery(name = "GiftCardFulfillment.findAll", query = "SELECT g FROM GiftCardFulfillment g")})
public class GiftCardFulfillment implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "FULFILLMENT_ID")
    private String fulfillmentId;
    @Column(name = "MERCHANT_ID")
    private String merchantId;
    @Column(name = "CARD_NUMBER")
    private String cardNumber;
    @Column(name = "PIN_NUMBER")
    private String pinNumber;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "AMOUNT")
    private BigDecimal amount;
    @Column(name = "RESPONSE_CODE")
    private String responseCode;
    @Column(name = "REFERENCE_NUM")
    private String referenceNum;
    @Column(name = "AUTH_CODE")
    private String authCode;
    @Column(name = "FULFILLMENT_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fulfillmentDate;
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
    @JoinColumn(name = "SURVEY_RESPONSE_ID", referencedColumnName = "SURVEY_RESPONSE_ID")
    @ManyToOne
    private SurveyResponse surveyResponseId;
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party partyId;
    @JoinColumns({
        @JoinColumn(name = "ORDER_ID", referencedColumnName = "ORDER_ID"),
        @JoinColumn(name = "ORDER_ITEM_SEQ_ID", referencedColumnName = "ORDER_ITEM_SEQ_ID")})
    @ManyToOne
    private OrderItem orderItem;
    @JoinColumn(name = "ORDER_ID", referencedColumnName = "ORDER_ID")
    @ManyToOne
    private OrderHeader orderId;
    @JoinColumn(name = "TYPE_ENUM_ID", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration typeEnumId;

    public GiftCardFulfillment() {
    }

    public GiftCardFulfillment(String fulfillmentId) {
        this.fulfillmentId = fulfillmentId;
    }

    public String getFulfillmentId() {
        return fulfillmentId;
    }

    public void setFulfillmentId(String fulfillmentId) {
        this.fulfillmentId = fulfillmentId;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(String pinNumber) {
        this.pinNumber = pinNumber;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getReferenceNum() {
        return referenceNum;
    }

    public void setReferenceNum(String referenceNum) {
        this.referenceNum = referenceNum;
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    public Date getFulfillmentDate() {
        return fulfillmentDate;
    }

    public void setFulfillmentDate(Date fulfillmentDate) {
        this.fulfillmentDate = fulfillmentDate;
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

    public SurveyResponse getSurveyResponseId() {
        return surveyResponseId;
    }

    public void setSurveyResponseId(SurveyResponse surveyResponseId) {
        this.surveyResponseId = surveyResponseId;
    }

    public Party getPartyId() {
        return partyId;
    }

    public void setPartyId(Party partyId) {
        this.partyId = partyId;
    }

    public OrderItem getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(OrderItem orderItem) {
        this.orderItem = orderItem;
    }

    public OrderHeader getOrderId() {
        return orderId;
    }

    public void setOrderId(OrderHeader orderId) {
        this.orderId = orderId;
    }

    public Enumeration getTypeEnumId() {
        return typeEnumId;
    }

    public void setTypeEnumId(Enumeration typeEnumId) {
        this.typeEnumId = typeEnumId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fulfillmentId != null ? fulfillmentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GiftCardFulfillment)) {
            return false;
        }
        GiftCardFulfillment other = (GiftCardFulfillment) object;
        if ((this.fulfillmentId == null && other.fulfillmentId != null) || (this.fulfillmentId != null && !this.fulfillmentId.equals(other.fulfillmentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.GiftCardFulfillment[ fulfillmentId=" + fulfillmentId + " ]";
    }
    
}
