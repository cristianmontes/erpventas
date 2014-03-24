/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.payment.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.party.model.Party;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "payment_method")

public class PaymentMethod implements Serializable {
    /*@OneToMany(mappedBy = "refundPaymentMethodId")
    private List<PartyAcctgPreference> partyAcctgPreferenceList;*/
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "paymentMethod")
    private GiftCard giftCard;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "paymentMethod")
    private EftAccount eftAccount;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "paymentMethod")
    private CreditCard creditCard;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PAYMENT_METHOD_ID")
    private String paymentMethodId;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
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
    @Column(name = "EMAIL_ADDRESS")
    private String emailAddress;
    /*@OneToMany(mappedBy = "paymentMethodId")
    private List<ShoppingList> shoppingListList;
    @OneToMany(mappedBy = "paymentMethodId")
    private List<Payment> paymentList;
    @OneToMany(mappedBy = "paymentMethodId")
    private List<ReturnHeader> returnHeaderList;
    @OneToMany(mappedBy = "paymentMethodId")
    private List<OrderPaymentPreference> orderPaymentPreferenceList;
    @OneToMany(mappedBy = "paymentMethodId")
    private List<PaymentGatewayResponse> paymentGatewayResponseList;*/
    @JoinColumn(name = "PAYMENT_METHOD_TYPE_ID", referencedColumnName = "PAYMENT_METHOD_TYPE_ID")
    @ManyToOne
    private PaymentMethodType paymentMethodTypeId;
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party partyId;
    /*@JoinColumn(name = "GL_ACCOUNT_ID", referencedColumnName = "GL_ACCOUNT_ID")
    @ManyToOne
    private GlAccount glAccountId;
    @OneToMany(mappedBy = "replenishPaymentId")
    private List<FinAccount> finAccountList;*/

    public PaymentMethod() {
    }

    public PaymentMethod(String paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    public String getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(String paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
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

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
/*
    public List<ShoppingList> getShoppingListList() {
        return shoppingListList;
    }

    public void setShoppingListList(List<ShoppingList> shoppingListList) {
        this.shoppingListList = shoppingListList;
    }

    public List<Payment> getPaymentList() {
        return paymentList;
    }

    public void setPaymentList(List<Payment> paymentList) {
        this.paymentList = paymentList;
    }

    public List<ReturnHeader> getReturnHeaderList() {
        return returnHeaderList;
    }

    public void setReturnHeaderList(List<ReturnHeader> returnHeaderList) {
        this.returnHeaderList = returnHeaderList;
    }

    public List<OrderPaymentPreference> getOrderPaymentPreferenceList() {
        return orderPaymentPreferenceList;
    }

    public void setOrderPaymentPreferenceList(List<OrderPaymentPreference> orderPaymentPreferenceList) {
        this.orderPaymentPreferenceList = orderPaymentPreferenceList;
    }

    public List<PaymentGatewayResponse> getPaymentGatewayResponseList() {
        return paymentGatewayResponseList;
    }

    public void setPaymentGatewayResponseList(List<PaymentGatewayResponse> paymentGatewayResponseList) {
        this.paymentGatewayResponseList = paymentGatewayResponseList;
    }*/

    public PaymentMethodType getPaymentMethodTypeId() {
        return paymentMethodTypeId;
    }

    public void setPaymentMethodTypeId(PaymentMethodType paymentMethodTypeId) {
        this.paymentMethodTypeId = paymentMethodTypeId;
    }

    public Party getPartyId() {
        return partyId;
    }

    public void setPartyId(Party partyId) {
        this.partyId = partyId;
    }
/*
    public GlAccount getGlAccountId() {
        return glAccountId;
    }

    public void setGlAccountId(GlAccount glAccountId) {
        this.glAccountId = glAccountId;
    }

    public List<FinAccount> getFinAccountList() {
        return finAccountList;
    }

    public void setFinAccountList(List<FinAccount> finAccountList) {
        this.finAccountList = finAccountList;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paymentMethodId != null ? paymentMethodId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PaymentMethod)) {
            return false;
        }
        PaymentMethod other = (PaymentMethod) object;
        if ((this.paymentMethodId == null && other.paymentMethodId != null) || (this.paymentMethodId != null && !this.paymentMethodId.equals(other.paymentMethodId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PaymentMethod[ paymentMethodId=" + paymentMethodId + " ]";
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public EftAccount getEftAccount() {
        return eftAccount;
    }

    public void setEftAccount(EftAccount eftAccount) {
        this.eftAccount = eftAccount;
    }

    public GiftCard getGiftCard() {
        return giftCard;
    }

    public void setGiftCard(GiftCard giftCard) {
        this.giftCard = giftCard;
    }
/*
    public List<PartyAcctgPreference> getPartyAcctgPreferenceList() {
        return partyAcctgPreferenceList;
    }

    public void setPartyAcctgPreferenceList(List<PartyAcctgPreference> partyAcctgPreferenceList) {
        this.partyAcctgPreferenceList = partyAcctgPreferenceList;
    }*/
    
}
