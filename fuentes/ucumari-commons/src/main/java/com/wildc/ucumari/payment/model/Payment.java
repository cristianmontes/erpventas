/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.payment.model;

import java.io.Serializable;
import java.math.BigDecimal;
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

import com.wildc.ucumari.parameters.model.RoleType;
import com.wildc.ucumari.parameters.model.StatusItem;
import com.wildc.ucumari.parameters.model.Uom;
import com.wildc.ucumari.party.model.Party;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "payment")
public class Payment implements Serializable {
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "payment")
    private List<PaycheckItem> paycheckItemList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "payment")
    private List<PaymentBudgetAllocation> paymentBudgetAllocationList;
    @OneToMany(mappedBy = "paymentId")
    private List<PerfReview> perfReviewList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "payment")
    private List<PaymentAttribute> paymentAttributeList;
    @OneToMany(mappedBy = "paymentId")
    private List<LockboxBatchItemDetail> lockboxBatchItemDetailList;
    @OneToMany(mappedBy = "paymentId")
    private List<Deduction> deductionList;
    @OneToMany(mappedBy = "paymentId")
    private List<CashDrawerTransaction> cashDrawerTransactionList;*/
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PAYMENT_ID")
    private String paymentId;
    @Column(name = "EFFECTIVE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date effectiveDate;
    @Column(name = "PAYMENT_REF_NUM")
    private String paymentRefNum;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "AMOUNT")
    private BigDecimal amount;
    @Column(name = "COMMENTS")
    private String comments;
    @Column(name = "ACTUAL_CURRENCY_AMOUNT")
    private BigDecimal actualCurrencyAmount;
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
    @Column(name = "APPLIED_AMOUNT")
    private BigDecimal appliedAmount;
    @Column(name = "OPEN_AMOUNT")
    private BigDecimal openAmount;
    /*@OneToMany(mappedBy = "toPaymentId")
    private List<PaymentApplication> paymentApplicationList;
    @OneToMany(mappedBy = "paymentId")
    private List<PaymentApplication> paymentApplicationList1;
    @OneToMany(mappedBy = "paymentId")
    private List<InvoiceAdjustment> invoiceAdjustmentList;
    @JoinColumn(name = "ACCTG_TAG_ENUM_ID9", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration acctgTagEnumId9;
    @JoinColumn(name = "ACCTG_TAG_ENUM_ID8", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration acctgTagEnumId8;
    @JoinColumn(name = "ACCTG_TAG_ENUM_ID7", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration acctgTagEnumId7;
    @JoinColumn(name = "ACCTG_TAG_ENUM_ID6", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration acctgTagEnumId6;
    @JoinColumn(name = "ACCTG_TAG_ENUM_ID5", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration acctgTagEnumId5;
    @JoinColumn(name = "ACCTG_TAG_ENUM_ID4", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration acctgTagEnumId4;
    @JoinColumn(name = "ACCTG_TAG_ENUM_ID3", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration acctgTagEnumId3;
    @JoinColumn(name = "ACCTG_TAG_ENUM_ID2", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration acctgTagEnumId2;
    @JoinColumn(name = "ACCTG_TAG_ENUM_ID10", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration acctgTagEnumId10;
    @JoinColumn(name = "ACCTG_TAG_ENUM_ID1", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration acctgTagEnumId1;*/
    @JoinColumn(name = "ROLE_TYPE_ID_TO", referencedColumnName = "ROLE_TYPE_ID")
    @ManyToOne
    private RoleType roleTypeIdTo;
    @JoinColumn(name = "ACTUAL_CURRENCY_UOM_ID", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom actualCurrencyUomId;
    @JoinColumn(name = "CURRENCY_UOM_ID", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom currencyUomId;
    /*@JoinColumn(name = "FIN_ACCOUNT_TRANS_ID", referencedColumnName = "FIN_ACCOUNT_TRANS_ID")
    @ManyToOne
    private FinAccountTrans finAccountTransId;*/
    @JoinColumn(name = "PARTY_ID_FROM", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party partyIdFrom;
    /*@JoinColumn(name = "PAYMENT_PREFERENCE_ID", referencedColumnName = "ORDER_PAYMENT_PREFERENCE_ID")
    @ManyToOne
    private OrderPaymentPreference paymentPreferenceId;
    @JoinColumn(name = "OVERRIDE_GL_ACCOUNT_ID", referencedColumnName = "GL_ACCOUNT_ID")
    @ManyToOne
    private GlAccount overrideGlAccountId;
    @JoinColumn(name = "PAYMENT_GATEWAY_RESPONSE_ID", referencedColumnName = "PAYMENT_GATEWAY_RESPONSE_ID")
    @ManyToOne
    private PaymentGatewayResponse paymentGatewayResponseId;*/
    @JoinColumn(name = "PAYMENT_METHOD_ID", referencedColumnName = "PAYMENT_METHOD_ID")
    @ManyToOne
    private PaymentMethod paymentMethodId;
    @JoinColumn(name = "PAYMENT_METHOD_TYPE_ID", referencedColumnName = "PAYMENT_METHOD_TYPE_ID")
    @ManyToOne
    private PaymentMethodType paymentMethodTypeId;
    @JoinColumn(name = "PAYMENT_TYPE_ID", referencedColumnName = "PAYMENT_TYPE_ID")
    @ManyToOne
    private PaymentType paymentTypeId;
    @JoinColumn(name = "STATUS_ID", referencedColumnName = "STATUS_ID")
    @ManyToOne
    private StatusItem statusId;
    @JoinColumn(name = "PARTY_ID_TO", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party partyIdTo;
    /*@OneToMany(mappedBy = "paymentId")
    private List<AcctgTrans> acctgTransList;
    @OneToMany(mappedBy = "paymentId")
    private List<FinAccountTrans> finAccountTransList;
    @OneToMany(mappedBy = "paymentId")
    private List<ReturnItemResponse> returnItemResponseList;*/

    public Payment() {
    }

    public Payment(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public Date getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public String getPaymentRefNum() {
        return paymentRefNum;
    }

    public void setPaymentRefNum(String paymentRefNum) {
        this.paymentRefNum = paymentRefNum;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public BigDecimal getActualCurrencyAmount() {
        return actualCurrencyAmount;
    }

    public void setActualCurrencyAmount(BigDecimal actualCurrencyAmount) {
        this.actualCurrencyAmount = actualCurrencyAmount;
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

    public BigDecimal getAppliedAmount() {
        return appliedAmount;
    }

    public void setAppliedAmount(BigDecimal appliedAmount) {
        this.appliedAmount = appliedAmount;
    }

    public BigDecimal getOpenAmount() {
        return openAmount;
    }

    public void setOpenAmount(BigDecimal openAmount) {
        this.openAmount = openAmount;
    }
/*
    public List<PaymentApplication> getPaymentApplicationList() {
        return paymentApplicationList;
    }

    public void setPaymentApplicationList(List<PaymentApplication> paymentApplicationList) {
        this.paymentApplicationList = paymentApplicationList;
    }

    public List<PaymentApplication> getPaymentApplicationList1() {
        return paymentApplicationList1;
    }

    public void setPaymentApplicationList1(List<PaymentApplication> paymentApplicationList1) {
        this.paymentApplicationList1 = paymentApplicationList1;
    }

    public List<InvoiceAdjustment> getInvoiceAdjustmentList() {
        return invoiceAdjustmentList;
    }

    public void setInvoiceAdjustmentList(List<InvoiceAdjustment> invoiceAdjustmentList) {
        this.invoiceAdjustmentList = invoiceAdjustmentList;
    }

    public Enumeration getAcctgTagEnumId9() {
        return acctgTagEnumId9;
    }

    public void setAcctgTagEnumId9(Enumeration acctgTagEnumId9) {
        this.acctgTagEnumId9 = acctgTagEnumId9;
    }

    public Enumeration getAcctgTagEnumId8() {
        return acctgTagEnumId8;
    }

    public void setAcctgTagEnumId8(Enumeration acctgTagEnumId8) {
        this.acctgTagEnumId8 = acctgTagEnumId8;
    }

    public Enumeration getAcctgTagEnumId7() {
        return acctgTagEnumId7;
    }

    public void setAcctgTagEnumId7(Enumeration acctgTagEnumId7) {
        this.acctgTagEnumId7 = acctgTagEnumId7;
    }

    public Enumeration getAcctgTagEnumId6() {
        return acctgTagEnumId6;
    }

    public void setAcctgTagEnumId6(Enumeration acctgTagEnumId6) {
        this.acctgTagEnumId6 = acctgTagEnumId6;
    }

    public Enumeration getAcctgTagEnumId5() {
        return acctgTagEnumId5;
    }

    public void setAcctgTagEnumId5(Enumeration acctgTagEnumId5) {
        this.acctgTagEnumId5 = acctgTagEnumId5;
    }

    public Enumeration getAcctgTagEnumId4() {
        return acctgTagEnumId4;
    }

    public void setAcctgTagEnumId4(Enumeration acctgTagEnumId4) {
        this.acctgTagEnumId4 = acctgTagEnumId4;
    }

    public Enumeration getAcctgTagEnumId3() {
        return acctgTagEnumId3;
    }

    public void setAcctgTagEnumId3(Enumeration acctgTagEnumId3) {
        this.acctgTagEnumId3 = acctgTagEnumId3;
    }

    public Enumeration getAcctgTagEnumId2() {
        return acctgTagEnumId2;
    }

    public void setAcctgTagEnumId2(Enumeration acctgTagEnumId2) {
        this.acctgTagEnumId2 = acctgTagEnumId2;
    }

    public Enumeration getAcctgTagEnumId10() {
        return acctgTagEnumId10;
    }

    public void setAcctgTagEnumId10(Enumeration acctgTagEnumId10) {
        this.acctgTagEnumId10 = acctgTagEnumId10;
    }

    public Enumeration getAcctgTagEnumId1() {
        return acctgTagEnumId1;
    }

    public void setAcctgTagEnumId1(Enumeration acctgTagEnumId1) {
        this.acctgTagEnumId1 = acctgTagEnumId1;
    }*/

    public RoleType getRoleTypeIdTo() {
        return roleTypeIdTo;
    }

    public void setRoleTypeIdTo(RoleType roleTypeIdTo) {
        this.roleTypeIdTo = roleTypeIdTo;
    }

    public Uom getActualCurrencyUomId() {
        return actualCurrencyUomId;
    }

    public void setActualCurrencyUomId(Uom actualCurrencyUomId) {
        this.actualCurrencyUomId = actualCurrencyUomId;
    }

    public Uom getCurrencyUomId() {
        return currencyUomId;
    }

    public void setCurrencyUomId(Uom currencyUomId) {
        this.currencyUomId = currencyUomId;
    }
/*
    public FinAccountTrans getFinAccountTransId() {
        return finAccountTransId;
    }

    public void setFinAccountTransId(FinAccountTrans finAccountTransId) {
        this.finAccountTransId = finAccountTransId;
    }*/

    public Party getPartyIdFrom() {
        return partyIdFrom;
    }

    public void setPartyIdFrom(Party partyIdFrom) {
        this.partyIdFrom = partyIdFrom;
    }
/*
    public OrderPaymentPreference getPaymentPreferenceId() {
        return paymentPreferenceId;
    }

    public void setPaymentPreferenceId(OrderPaymentPreference paymentPreferenceId) {
        this.paymentPreferenceId = paymentPreferenceId;
    }

    public GlAccount getOverrideGlAccountId() {
        return overrideGlAccountId;
    }

    public void setOverrideGlAccountId(GlAccount overrideGlAccountId) {
        this.overrideGlAccountId = overrideGlAccountId;
    }

    public PaymentGatewayResponse getPaymentGatewayResponseId() {
        return paymentGatewayResponseId;
    }

    public void setPaymentGatewayResponseId(PaymentGatewayResponse paymentGatewayResponseId) {
        this.paymentGatewayResponseId = paymentGatewayResponseId;
    }*/

    public PaymentMethod getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(PaymentMethod paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    public PaymentMethodType getPaymentMethodTypeId() {
        return paymentMethodTypeId;
    }

    public void setPaymentMethodTypeId(PaymentMethodType paymentMethodTypeId) {
        this.paymentMethodTypeId = paymentMethodTypeId;
    }

    public PaymentType getPaymentTypeId() {
        return paymentTypeId;
    }

    public void setPaymentTypeId(PaymentType paymentTypeId) {
        this.paymentTypeId = paymentTypeId;
    }

    public StatusItem getStatusId() {
        return statusId;
    }

    public void setStatusId(StatusItem statusId) {
        this.statusId = statusId;
    }

    public Party getPartyIdTo() {
        return partyIdTo;
    }

    public void setPartyIdTo(Party partyIdTo) {
        this.partyIdTo = partyIdTo;
    }
/*
    public List<AcctgTrans> getAcctgTransList() {
        return acctgTransList;
    }

    public void setAcctgTransList(List<AcctgTrans> acctgTransList) {
        this.acctgTransList = acctgTransList;
    }

    public List<FinAccountTrans> getFinAccountTransList() {
        return finAccountTransList;
    }

    public void setFinAccountTransList(List<FinAccountTrans> finAccountTransList) {
        this.finAccountTransList = finAccountTransList;
    }

    public List<ReturnItemResponse> getReturnItemResponseList() {
        return returnItemResponseList;
    }

    public void setReturnItemResponseList(List<ReturnItemResponse> returnItemResponseList) {
        this.returnItemResponseList = returnItemResponseList;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paymentId != null ? paymentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Payment)) {
            return false;
        }
        Payment other = (Payment) object;
        if ((this.paymentId == null && other.paymentId != null) || (this.paymentId != null && !this.paymentId.equals(other.paymentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.Payment[ paymentId=" + paymentId + " ]";
    }
/*
    public List<CashDrawerTransaction> getCashDrawerTransactionList() {
        return cashDrawerTransactionList;
    }

    public void setCashDrawerTransactionList(List<CashDrawerTransaction> cashDrawerTransactionList) {
        this.cashDrawerTransactionList = cashDrawerTransactionList;
    }

    public List<Deduction> getDeductionList() {
        return deductionList;
    }

    public void setDeductionList(List<Deduction> deductionList) {
        this.deductionList = deductionList;
    }

    public List<LockboxBatchItemDetail> getLockboxBatchItemDetailList() {
        return lockboxBatchItemDetailList;
    }

    public void setLockboxBatchItemDetailList(List<LockboxBatchItemDetail> lockboxBatchItemDetailList) {
        this.lockboxBatchItemDetailList = lockboxBatchItemDetailList;
    }

    public List<PaycheckItem> getPaycheckItemList() {
        return paycheckItemList;
    }

    public void setPaycheckItemList(List<PaycheckItem> paycheckItemList) {
        this.paycheckItemList = paycheckItemList;
    }

    public List<PaymentBudgetAllocation> getPaymentBudgetAllocationList() {
        return paymentBudgetAllocationList;
    }

    public void setPaymentBudgetAllocationList(List<PaymentBudgetAllocation> paymentBudgetAllocationList) {
        this.paymentBudgetAllocationList = paymentBudgetAllocationList;
    }

    public List<PerfReview> getPerfReviewList() {
        return perfReviewList;
    }

    public void setPerfReviewList(List<PerfReview> perfReviewList) {
        this.perfReviewList = perfReviewList;
    }

    public List<PaymentAttribute> getPaymentAttributeList() {
        return paymentAttributeList;
    }

    public void setPaymentAttributeList(List<PaymentAttribute> paymentAttributeList) {
        this.paymentAttributeList = paymentAttributeList;
    }*/
    
}
