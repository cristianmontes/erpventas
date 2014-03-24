/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.payment.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.contact.model.ContactMech;
import com.wildc.ucumari.contact.model.PostalAddress;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "eft_account")

public class EftAccount implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PAYMENT_METHOD_ID")
    private String paymentMethodId;
    @Column(name = "BANK_NAME")
    private String bankName;
    @Column(name = "ROUTING_NUMBER")
    private String routingNumber;
    @Column(name = "ACCOUNT_TYPE")
    private String accountType;
    @Column(name = "ACCOUNT_NUMBER")
    private String accountNumber;
    @Column(name = "NAME_ON_ACCOUNT")
    private String nameOnAccount;
    @Column(name = "COMPANY_NAME_ON_ACCOUNT")
    private String companyNameOnAccount;
    @Column(name = "YEARS_AT_BANK")
    private BigInteger yearsAtBank;
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
    @JoinColumn(name = "PAYMENT_METHOD_ID", referencedColumnName = "PAYMENT_METHOD_ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private PaymentMethod paymentMethod;
    @JoinColumn(name = "CONTACT_MECH_ID", referencedColumnName = "CONTACT_MECH_ID")
    @ManyToOne
    private PostalAddress contactMechId;
    @JoinColumn(name = "CONTACT_MECH_ID", referencedColumnName = "CONTACT_MECH_ID", insertable=false, updatable=false)
    @ManyToOne
    private ContactMech contactMechId1;

    public EftAccount() {
    }

    public EftAccount(String paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    public String getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(String paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(String routingNumber) {
        this.routingNumber = routingNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getNameOnAccount() {
        return nameOnAccount;
    }

    public void setNameOnAccount(String nameOnAccount) {
        this.nameOnAccount = nameOnAccount;
    }

    public String getCompanyNameOnAccount() {
        return companyNameOnAccount;
    }

    public void setCompanyNameOnAccount(String companyNameOnAccount) {
        this.companyNameOnAccount = companyNameOnAccount;
    }

    public BigInteger getYearsAtBank() {
        return yearsAtBank;
    }

    public void setYearsAtBank(BigInteger yearsAtBank) {
        this.yearsAtBank = yearsAtBank;
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

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public PostalAddress getContactMechId() {
        return contactMechId;
    }

    public void setContactMechId(PostalAddress contactMechId) {
        this.contactMechId = contactMechId;
    }

    public ContactMech getContactMechId1() {
        return contactMechId1;
    }

    public void setContactMechId1(ContactMech contactMechId1) {
        this.contactMechId1 = contactMechId1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paymentMethodId != null ? paymentMethodId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EftAccount)) {
            return false;
        }
        EftAccount other = (EftAccount) object;
        if ((this.paymentMethodId == null && other.paymentMethodId != null) || (this.paymentMethodId != null && !this.paymentMethodId.equals(other.paymentMethodId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.EftAccount[ paymentMethodId=" + paymentMethodId + " ]";
    }
    
}
