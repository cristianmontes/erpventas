/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.accounting.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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

import com.wildc.ucumari.contact.model.ContactMech;
import com.wildc.ucumari.contact.model.PostalAddress;
import com.wildc.ucumari.invoice.model.Invoice;
import com.wildc.ucumari.order.model.OrderHeader;
import com.wildc.ucumari.parameters.model.Uom;
import com.wildc.ucumari.payment.model.PaymentApplication;
import com.wildc.ucumari.returns.model.ReturnHeader;
import com.wildc.ucumari.returns.model.ReturnItemResponse;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "billing_account")
@NamedQueries({
    @NamedQuery(name = "BillingAccount.findAll", query = "SELECT b FROM BillingAccount b")})
public class BillingAccount implements Serializable {
    @OneToMany(mappedBy = "billingAccountId")
    private List<BillingAccountTerm> billingAccountTermList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "billingAccount")
    private List<BillingAccountRole> billingAccountRoleList;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "BILLING_ACCOUNT_ID")
    private String billingAccountId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ACCOUNT_LIMIT")
    private BigDecimal accountLimit;
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "EXTERNAL_ACCOUNT_ID")
    private String externalAccountId;
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
    @OneToMany(mappedBy = "billingAccountId")
    private List<PaymentApplication> paymentApplicationList;
    @OneToMany(mappedBy = "billingAccountId")
    private List<ReturnHeader> returnHeaderList;
    @OneToMany(mappedBy = "billingAccountId")
    private List<OrderHeader> orderHeaderList;
    @JoinColumn(name = "CONTACT_MECH_ID", referencedColumnName = "CONTACT_MECH_ID")
    @ManyToOne
    private PostalAddress contactMechId;
    @JoinColumn(name = "ACCOUNT_CURRENCY_UOM_ID", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom accountCurrencyUomId;
    @JoinColumn(name = "CONTACT_MECH_ID", referencedColumnName = "CONTACT_MECH_ID")
    @ManyToOne
    private ContactMech contactMechId1;
    @OneToMany(mappedBy = "billingAccountId")
    private List<Invoice> invoiceList;
    @OneToMany(mappedBy = "billingAccountId")
    private List<ReturnItemResponse> returnItemResponseList;

    public BillingAccount() {
    }

    public BillingAccount(String billingAccountId) {
        this.billingAccountId = billingAccountId;
    }

    public String getBillingAccountId() {
        return billingAccountId;
    }

    public void setBillingAccountId(String billingAccountId) {
        this.billingAccountId = billingAccountId;
    }

    public BigDecimal getAccountLimit() {
        return accountLimit;
    }

    public void setAccountLimit(BigDecimal accountLimit) {
        this.accountLimit = accountLimit;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExternalAccountId() {
        return externalAccountId;
    }

    public void setExternalAccountId(String externalAccountId) {
        this.externalAccountId = externalAccountId;
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

    public List<PaymentApplication> getPaymentApplicationList() {
        return paymentApplicationList;
    }

    public void setPaymentApplicationList(List<PaymentApplication> paymentApplicationList) {
        this.paymentApplicationList = paymentApplicationList;
    }

    public List<ReturnHeader> getReturnHeaderList() {
        return returnHeaderList;
    }

    public void setReturnHeaderList(List<ReturnHeader> returnHeaderList) {
        this.returnHeaderList = returnHeaderList;
    }

    public List<OrderHeader> getOrderHeaderList() {
        return orderHeaderList;
    }

    public void setOrderHeaderList(List<OrderHeader> orderHeaderList) {
        this.orderHeaderList = orderHeaderList;
    }

    public PostalAddress getContactMechId() {
        return contactMechId;
    }

    public void setContactMechId(PostalAddress contactMechId) {
        this.contactMechId = contactMechId;
    }

    public Uom getAccountCurrencyUomId() {
        return accountCurrencyUomId;
    }

    public void setAccountCurrencyUomId(Uom accountCurrencyUomId) {
        this.accountCurrencyUomId = accountCurrencyUomId;
    }

    public ContactMech getContactMechId1() {
        return contactMechId1;
    }

    public void setContactMechId1(ContactMech contactMechId1) {
        this.contactMechId1 = contactMechId1;
    }

    public List<Invoice> getInvoiceList() {
        return invoiceList;
    }

    public void setInvoiceList(List<Invoice> invoiceList) {
        this.invoiceList = invoiceList;
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
        hash += (billingAccountId != null ? billingAccountId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BillingAccount)) {
            return false;
        }
        BillingAccount other = (BillingAccount) object;
        if ((this.billingAccountId == null && other.billingAccountId != null) || (this.billingAccountId != null && !this.billingAccountId.equals(other.billingAccountId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.BillingAccount[ billingAccountId=" + billingAccountId + " ]";
    }

    public List<BillingAccountTerm> getBillingAccountTermList() {
        return billingAccountTermList;
    }

    public void setBillingAccountTermList(List<BillingAccountTerm> billingAccountTermList) {
        this.billingAccountTermList = billingAccountTermList;
    }

    public List<BillingAccountRole> getBillingAccountRoleList() {
        return billingAccountRoleList;
    }

    public void setBillingAccountRoleList(List<BillingAccountRole> billingAccountRoleList) {
        this.billingAccountRoleList = billingAccountRoleList;
    }
    
}
