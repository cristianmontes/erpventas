/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.accounting.model;

import com.wildc.ucumari.invoice.model.InvoiceAdjustmentGlAccount;
import com.wildc.ucumari.invoice.model.InvoiceItem;
import com.wildc.ucumari.invoice.model.InvoiceItemType;
import com.wildc.ucumari.invoice.model.InvoiceItemTypeGlAccount;
import com.wildc.ucumari.order.model.OrderAdjustment;
import com.wildc.ucumari.order.model.OrderItem;
import com.wildc.ucumari.party.model.PartyGlAccount;
import com.wildc.ucumari.payment.model.PaycheckItemTypeGlAccount;
import com.wildc.ucumari.payment.model.Payment;
import com.wildc.ucumari.payment.model.PaymentApplication;
import com.wildc.ucumari.payment.model.PaymentMethod;
import com.wildc.ucumari.payment.model.PaymentMethodType;
import com.wildc.ucumari.payment.model.PaymentMethodTypeGlAccount;
import com.wildc.ucumari.product.model.ProductCategoryGlAccount;
import com.wildc.ucumari.product.model.ProductGlAccount;
import com.wildc.ucumari.quote.model.QuoteAdjustment;
import com.wildc.ucumari.returns.model.ReturnAdjustment;
import com.wildc.ucumari.tax.model.TaxAuthorityGlAccount;
import com.wildc.ucumari.client.modelo.FinAccount;
import com.wildc.ucumari.client.modelo.VarianceReasonGlAccount;

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

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "gl_account")
@NamedQueries({
    @NamedQuery(name = "GlAccount.findAll", query = "SELECT g FROM GlAccount g")})
public class GlAccount implements Serializable {
    @OneToMany(mappedBy = "overrideGlAccountId")
    private List<ReturnAdjustment> returnAdjustmentList;
    @OneToMany(mappedBy = "overrideGlAccountId")
    private List<QuoteAdjustment> quoteAdjustmentList;
    @OneToMany(mappedBy = "overrideGlAccountId")
    private List<OrderAdjustment> orderAdjustmentList;
    @OneToMany(mappedBy = "glAccountId")
    private List<VarianceReasonGlAccount> varianceReasonGlAccountList;
    @OneToMany(mappedBy = "glAccountId")
    private List<TaxAuthorityGlAccount> taxAuthorityGlAccountList;
    @OneToMany(mappedBy = "glAccountId")
    private List<ProductCategoryGlAccount> productCategoryGlAccountList;
    @OneToMany(mappedBy = "glAccountId")
    private List<ProductGlAccount> productGlAccountList;
    @OneToMany(mappedBy = "glAccountId")
    private List<PartyGlAccount> partyGlAccountList;
    @OneToMany(mappedBy = "glAccountId")
    private List<PaymentMethodTypeGlAccount> paymentMethodTypeGlAccountList;
    @OneToMany(mappedBy = "debitGlAccountId")
    private List<PaycheckItemTypeGlAccount> paycheckItemTypeGlAccountList;
    @OneToMany(mappedBy = "creditGlAccountId")
    private List<PaycheckItemTypeGlAccount> paycheckItemTypeGlAccountList1;
    @OneToMany(mappedBy = "glAccountId")
    private List<InvoiceAdjustmentGlAccount> invoiceAdjustmentGlAccountList;
    @OneToMany(mappedBy = "glAccountId")
    private List<GlAccountTypeDefault> glAccountTypeDefaultList;
    @OneToMany(mappedBy = "glAccountId")
    private List<InvoiceItemTypeGlAccount> invoiceItemTypeGlAccountList;
    @OneToMany(mappedBy = "glAccountId")
    private List<GlReconciliation> glReconciliationList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "glAccount")
    private List<GlAccountRole> glAccountRoleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "glAccount")
    private List<GlBudgetXref> glBudgetXrefList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "glAccount")
    private List<GlAccountGroupMember> glAccountGroupMemberList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "glAccount")
    private List<GlAccountHistory> glAccountHistoryList;
    @OneToMany(mappedBy = "glAccountId")
    private List<GlAccountTransEntryFact> glAccountTransEntryFactList;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "GL_ACCOUNT_ID")
    private String glAccountId;
    @Column(name = "ACCOUNT_CODE")
    private String accountCode;
    @Column(name = "ACCOUNT_NAME")
    private String accountName;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "PRODUCT_ID")
    private String productId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "POSTED_BALANCE")
    private BigDecimal postedBalance;
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
    @OneToMany(mappedBy = "overrideGlAccountId")
    private List<PaymentApplication> paymentApplicationList;
    @OneToMany(mappedBy = "defaultGlAccountId")
    private List<InvoiceItemType> invoiceItemTypeList;
    @OneToMany(mappedBy = "overrideGlAccountId")
    private List<Payment> paymentList;
    @OneToMany(mappedBy = "glAccountId")
    private List<AcctgTransEntry> acctgTransEntryList;
    @OneToMany(mappedBy = "overrideGlAccountId")
    private List<OrderItem> orderItemList;
    @JoinColumn(name = "GL_XBRL_CLASS_ID", referencedColumnName = "GL_XBRL_CLASS_ID")
    @ManyToOne
    private GlXbrlClass glXbrlClassId;
    @JoinColumn(name = "GL_ACCOUNT_TYPE_ID", referencedColumnName = "GL_ACCOUNT_TYPE_ID")
    @ManyToOne
    private GlAccountType glAccountTypeId;
    @JoinColumn(name = "GL_RESOURCE_TYPE_ID", referencedColumnName = "GL_RESOURCE_TYPE_ID")
    @ManyToOne
    private GlResourceType glResourceTypeId;
    @OneToMany(mappedBy = "parentGlAccountId")
    private List<GlAccount> glAccountList;
    @JoinColumn(name = "PARENT_GL_ACCOUNT_ID", referencedColumnName = "GL_ACCOUNT_ID")
    @ManyToOne
    private GlAccount parentGlAccountId;
    @JoinColumn(name = "GL_ACCOUNT_CLASS_ID", referencedColumnName = "GL_ACCOUNT_CLASS_ID")
    @ManyToOne
    private GlAccountClass glAccountClassId;
    @OneToMany(mappedBy = "glAccountId")
    private List<PaymentMethod> paymentMethodList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "glAccount")
    private List<GlAccountOrganization> glAccountOrganizationList;
    @OneToMany(mappedBy = "defaultGlAccountId")
    private List<PaymentMethodType> paymentMethodTypeList;
    @OneToMany(mappedBy = "postToGlAccountId")
    private List<FinAccount> finAccountList;
    @OneToMany(mappedBy = "overrideGlAccountId")
    private List<InvoiceItem> invoiceItemList;

    public GlAccount() {
    }

    public GlAccount(String glAccountId) {
        this.glAccountId = glAccountId;
    }

    public String getGlAccountId() {
        return glAccountId;
    }

    public void setGlAccountId(String glAccountId) {
        this.glAccountId = glAccountId;
    }

    public String getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public BigDecimal getPostedBalance() {
        return postedBalance;
    }

    public void setPostedBalance(BigDecimal postedBalance) {
        this.postedBalance = postedBalance;
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

    public List<InvoiceItemType> getInvoiceItemTypeList() {
        return invoiceItemTypeList;
    }

    public void setInvoiceItemTypeList(List<InvoiceItemType> invoiceItemTypeList) {
        this.invoiceItemTypeList = invoiceItemTypeList;
    }

    public List<Payment> getPaymentList() {
        return paymentList;
    }

    public void setPaymentList(List<Payment> paymentList) {
        this.paymentList = paymentList;
    }

    public List<AcctgTransEntry> getAcctgTransEntryList() {
        return acctgTransEntryList;
    }

    public void setAcctgTransEntryList(List<AcctgTransEntry> acctgTransEntryList) {
        this.acctgTransEntryList = acctgTransEntryList;
    }

    public List<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(List<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public GlXbrlClass getGlXbrlClassId() {
        return glXbrlClassId;
    }

    public void setGlXbrlClassId(GlXbrlClass glXbrlClassId) {
        this.glXbrlClassId = glXbrlClassId;
    }

    public GlAccountType getGlAccountTypeId() {
        return glAccountTypeId;
    }

    public void setGlAccountTypeId(GlAccountType glAccountTypeId) {
        this.glAccountTypeId = glAccountTypeId;
    }

    public GlResourceType getGlResourceTypeId() {
        return glResourceTypeId;
    }

    public void setGlResourceTypeId(GlResourceType glResourceTypeId) {
        this.glResourceTypeId = glResourceTypeId;
    }

    public List<GlAccount> getGlAccountList() {
        return glAccountList;
    }

    public void setGlAccountList(List<GlAccount> glAccountList) {
        this.glAccountList = glAccountList;
    }

    public GlAccount getParentGlAccountId() {
        return parentGlAccountId;
    }

    public void setParentGlAccountId(GlAccount parentGlAccountId) {
        this.parentGlAccountId = parentGlAccountId;
    }

    public GlAccountClass getGlAccountClassId() {
        return glAccountClassId;
    }

    public void setGlAccountClassId(GlAccountClass glAccountClassId) {
        this.glAccountClassId = glAccountClassId;
    }

    public List<PaymentMethod> getPaymentMethodList() {
        return paymentMethodList;
    }

    public void setPaymentMethodList(List<PaymentMethod> paymentMethodList) {
        this.paymentMethodList = paymentMethodList;
    }

    public List<GlAccountOrganization> getGlAccountOrganizationList() {
        return glAccountOrganizationList;
    }

    public void setGlAccountOrganizationList(List<GlAccountOrganization> glAccountOrganizationList) {
        this.glAccountOrganizationList = glAccountOrganizationList;
    }

    public List<PaymentMethodType> getPaymentMethodTypeList() {
        return paymentMethodTypeList;
    }

    public void setPaymentMethodTypeList(List<PaymentMethodType> paymentMethodTypeList) {
        this.paymentMethodTypeList = paymentMethodTypeList;
    }

    public List<FinAccount> getFinAccountList() {
        return finAccountList;
    }

    public void setFinAccountList(List<FinAccount> finAccountList) {
        this.finAccountList = finAccountList;
    }

    public List<InvoiceItem> getInvoiceItemList() {
        return invoiceItemList;
    }

    public void setInvoiceItemList(List<InvoiceItem> invoiceItemList) {
        this.invoiceItemList = invoiceItemList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (glAccountId != null ? glAccountId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GlAccount)) {
            return false;
        }
        GlAccount other = (GlAccount) object;
        if ((this.glAccountId == null && other.glAccountId != null) || (this.glAccountId != null && !this.glAccountId.equals(other.glAccountId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.GlAccount[ glAccountId=" + glAccountId + " ]";
    }

    public List<InvoiceAdjustmentGlAccount> getInvoiceAdjustmentGlAccountList() {
        return invoiceAdjustmentGlAccountList;
    }

    public void setInvoiceAdjustmentGlAccountList(List<InvoiceAdjustmentGlAccount> invoiceAdjustmentGlAccountList) {
        this.invoiceAdjustmentGlAccountList = invoiceAdjustmentGlAccountList;
    }

    public List<GlAccountTypeDefault> getGlAccountTypeDefaultList() {
        return glAccountTypeDefaultList;
    }

    public void setGlAccountTypeDefaultList(List<GlAccountTypeDefault> glAccountTypeDefaultList) {
        this.glAccountTypeDefaultList = glAccountTypeDefaultList;
    }

    public List<InvoiceItemTypeGlAccount> getInvoiceItemTypeGlAccountList() {
        return invoiceItemTypeGlAccountList;
    }

    public void setInvoiceItemTypeGlAccountList(List<InvoiceItemTypeGlAccount> invoiceItemTypeGlAccountList) {
        this.invoiceItemTypeGlAccountList = invoiceItemTypeGlAccountList;
    }

    public List<GlReconciliation> getGlReconciliationList() {
        return glReconciliationList;
    }

    public void setGlReconciliationList(List<GlReconciliation> glReconciliationList) {
        this.glReconciliationList = glReconciliationList;
    }

    public List<GlAccountRole> getGlAccountRoleList() {
        return glAccountRoleList;
    }

    public void setGlAccountRoleList(List<GlAccountRole> glAccountRoleList) {
        this.glAccountRoleList = glAccountRoleList;
    }

    public List<GlBudgetXref> getGlBudgetXrefList() {
        return glBudgetXrefList;
    }

    public void setGlBudgetXrefList(List<GlBudgetXref> glBudgetXrefList) {
        this.glBudgetXrefList = glBudgetXrefList;
    }

    public List<GlAccountGroupMember> getGlAccountGroupMemberList() {
        return glAccountGroupMemberList;
    }

    public void setGlAccountGroupMemberList(List<GlAccountGroupMember> glAccountGroupMemberList) {
        this.glAccountGroupMemberList = glAccountGroupMemberList;
    }

    public List<GlAccountHistory> getGlAccountHistoryList() {
        return glAccountHistoryList;
    }

    public void setGlAccountHistoryList(List<GlAccountHistory> glAccountHistoryList) {
        this.glAccountHistoryList = glAccountHistoryList;
    }

    public List<GlAccountTransEntryFact> getGlAccountTransEntryFactList() {
        return glAccountTransEntryFactList;
    }

    public void setGlAccountTransEntryFactList(List<GlAccountTransEntryFact> glAccountTransEntryFactList) {
        this.glAccountTransEntryFactList = glAccountTransEntryFactList;
    }

    public List<ProductCategoryGlAccount> getProductCategoryGlAccountList() {
        return productCategoryGlAccountList;
    }

    public void setProductCategoryGlAccountList(List<ProductCategoryGlAccount> productCategoryGlAccountList) {
        this.productCategoryGlAccountList = productCategoryGlAccountList;
    }

    public List<ProductGlAccount> getProductGlAccountList() {
        return productGlAccountList;
    }

    public void setProductGlAccountList(List<ProductGlAccount> productGlAccountList) {
        this.productGlAccountList = productGlAccountList;
    }

    public List<PartyGlAccount> getPartyGlAccountList() {
        return partyGlAccountList;
    }

    public void setPartyGlAccountList(List<PartyGlAccount> partyGlAccountList) {
        this.partyGlAccountList = partyGlAccountList;
    }

    public List<PaymentMethodTypeGlAccount> getPaymentMethodTypeGlAccountList() {
        return paymentMethodTypeGlAccountList;
    }

    public void setPaymentMethodTypeGlAccountList(List<PaymentMethodTypeGlAccount> paymentMethodTypeGlAccountList) {
        this.paymentMethodTypeGlAccountList = paymentMethodTypeGlAccountList;
    }

    public List<PaycheckItemTypeGlAccount> getPaycheckItemTypeGlAccountList() {
        return paycheckItemTypeGlAccountList;
    }

    public void setPaycheckItemTypeGlAccountList(List<PaycheckItemTypeGlAccount> paycheckItemTypeGlAccountList) {
        this.paycheckItemTypeGlAccountList = paycheckItemTypeGlAccountList;
    }

    public List<PaycheckItemTypeGlAccount> getPaycheckItemTypeGlAccountList1() {
        return paycheckItemTypeGlAccountList1;
    }

    public void setPaycheckItemTypeGlAccountList1(List<PaycheckItemTypeGlAccount> paycheckItemTypeGlAccountList1) {
        this.paycheckItemTypeGlAccountList1 = paycheckItemTypeGlAccountList1;
    }

    public List<ReturnAdjustment> getReturnAdjustmentList() {
        return returnAdjustmentList;
    }

    public void setReturnAdjustmentList(List<ReturnAdjustment> returnAdjustmentList) {
        this.returnAdjustmentList = returnAdjustmentList;
    }

    public List<QuoteAdjustment> getQuoteAdjustmentList() {
        return quoteAdjustmentList;
    }

    public void setQuoteAdjustmentList(List<QuoteAdjustment> quoteAdjustmentList) {
        this.quoteAdjustmentList = quoteAdjustmentList;
    }

    public List<OrderAdjustment> getOrderAdjustmentList() {
        return orderAdjustmentList;
    }

    public void setOrderAdjustmentList(List<OrderAdjustment> orderAdjustmentList) {
        this.orderAdjustmentList = orderAdjustmentList;
    }

    public List<VarianceReasonGlAccount> getVarianceReasonGlAccountList() {
        return varianceReasonGlAccountList;
    }

    public void setVarianceReasonGlAccountList(List<VarianceReasonGlAccount> varianceReasonGlAccountList) {
        this.varianceReasonGlAccountList = varianceReasonGlAccountList;
    }

    public List<TaxAuthorityGlAccount> getTaxAuthorityGlAccountList() {
        return taxAuthorityGlAccountList;
    }

    public void setTaxAuthorityGlAccountList(List<TaxAuthorityGlAccount> taxAuthorityGlAccountList) {
        this.taxAuthorityGlAccountList = taxAuthorityGlAccountList;
    }
    
}
