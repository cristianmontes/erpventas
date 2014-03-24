/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import com.wildc.ucumari.accounting.model.GlAccount;
import com.wildc.ucumari.order.model.OrderPaymentPreference;
import com.wildc.ucumari.parameters.model.Uom;
import com.wildc.ucumari.party.model.Party;
import com.wildc.ucumari.payment.model.PaymentMethod;
import com.wildc.ucumari.returns.model.ReturnHeader;

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

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "fin_account")
@NamedQueries({
    @NamedQuery(name = "FinAccount.findAll", query = "SELECT f FROM FinAccount f")})
public class FinAccount implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "FIN_ACCOUNT_ID")
    private String finAccountId;
    @Column(name = "STATUS_ID")
    private String statusId;
    @Column(name = "FIN_ACCOUNT_NAME")
    private String finAccountName;
    @Column(name = "FIN_ACCOUNT_CODE")
    private String finAccountCode;
    @Column(name = "FIN_ACCOUNT_PIN")
    private String finAccountPin;
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
    @Column(name = "IS_REFUNDABLE")
    private Character isRefundable;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "REPLENISH_LEVEL")
    private BigDecimal replenishLevel;
    @Column(name = "ACTUAL_BALANCE")
    private BigDecimal actualBalance;
    @Column(name = "AVAILABLE_BALANCE")
    private BigDecimal availableBalance;
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
    @OneToMany(mappedBy = "finAccountId")
    private List<ReturnHeader> returnHeaderList;
    @OneToMany(mappedBy = "finAccountId")
    private List<OrderPaymentPreference> orderPaymentPreferenceList;
    @OneToMany(mappedBy = "finAccountId")
    private List<FinAccountTrans> finAccountTransList;
    @JoinColumn(name = "FIN_ACCOUNT_TYPE_ID", referencedColumnName = "FIN_ACCOUNT_TYPE_ID")
    @ManyToOne
    private FinAccountType finAccountTypeId;
    @JoinColumn(name = "REPLENISH_PAYMENT_ID", referencedColumnName = "PAYMENT_METHOD_ID")
    @ManyToOne
    private PaymentMethod replenishPaymentId;
    @JoinColumn(name = "OWNER_PARTY_ID", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party ownerPartyId;
    @JoinColumn(name = "ORGANIZATION_PARTY_ID", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party organizationPartyId;
    @JoinColumn(name = "POST_TO_GL_ACCOUNT_ID", referencedColumnName = "GL_ACCOUNT_ID")
    @ManyToOne
    private GlAccount postToGlAccountId;
    @JoinColumn(name = "CURRENCY_UOM_ID", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom currencyUomId;

    public FinAccount() {
    }

    public FinAccount(String finAccountId) {
        this.finAccountId = finAccountId;
    }

    public String getFinAccountId() {
        return finAccountId;
    }

    public void setFinAccountId(String finAccountId) {
        this.finAccountId = finAccountId;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public String getFinAccountName() {
        return finAccountName;
    }

    public void setFinAccountName(String finAccountName) {
        this.finAccountName = finAccountName;
    }

    public String getFinAccountCode() {
        return finAccountCode;
    }

    public void setFinAccountCode(String finAccountCode) {
        this.finAccountCode = finAccountCode;
    }

    public String getFinAccountPin() {
        return finAccountPin;
    }

    public void setFinAccountPin(String finAccountPin) {
        this.finAccountPin = finAccountPin;
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

    public Character getIsRefundable() {
        return isRefundable;
    }

    public void setIsRefundable(Character isRefundable) {
        this.isRefundable = isRefundable;
    }

    public BigDecimal getReplenishLevel() {
        return replenishLevel;
    }

    public void setReplenishLevel(BigDecimal replenishLevel) {
        this.replenishLevel = replenishLevel;
    }

    public BigDecimal getActualBalance() {
        return actualBalance;
    }

    public void setActualBalance(BigDecimal actualBalance) {
        this.actualBalance = actualBalance;
    }

    public BigDecimal getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(BigDecimal availableBalance) {
        this.availableBalance = availableBalance;
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

    public List<FinAccountTrans> getFinAccountTransList() {
        return finAccountTransList;
    }

    public void setFinAccountTransList(List<FinAccountTrans> finAccountTransList) {
        this.finAccountTransList = finAccountTransList;
    }

    public FinAccountType getFinAccountTypeId() {
        return finAccountTypeId;
    }

    public void setFinAccountTypeId(FinAccountType finAccountTypeId) {
        this.finAccountTypeId = finAccountTypeId;
    }

    public PaymentMethod getReplenishPaymentId() {
        return replenishPaymentId;
    }

    public void setReplenishPaymentId(PaymentMethod replenishPaymentId) {
        this.replenishPaymentId = replenishPaymentId;
    }

    public Party getOwnerPartyId() {
        return ownerPartyId;
    }

    public void setOwnerPartyId(Party ownerPartyId) {
        this.ownerPartyId = ownerPartyId;
    }

    public Party getOrganizationPartyId() {
        return organizationPartyId;
    }

    public void setOrganizationPartyId(Party organizationPartyId) {
        this.organizationPartyId = organizationPartyId;
    }

    public GlAccount getPostToGlAccountId() {
        return postToGlAccountId;
    }

    public void setPostToGlAccountId(GlAccount postToGlAccountId) {
        this.postToGlAccountId = postToGlAccountId;
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
        hash += (finAccountId != null ? finAccountId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FinAccount)) {
            return false;
        }
        FinAccount other = (FinAccount) object;
        if ((this.finAccountId == null && other.finAccountId != null) || (this.finAccountId != null && !this.finAccountId.equals(other.finAccountId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.FinAccount[ finAccountId=" + finAccountId + " ]";
    }
    
}
