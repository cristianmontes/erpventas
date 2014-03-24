/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import com.wildc.ucumari.party.model.Party;
import com.wildc.ucumari.party.model.PartyRole;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "payroll_preference")
@NamedQueries({
    @NamedQuery(name = "PayrollPreference.findAll", query = "SELECT p FROM PayrollPreference p")})
public class PayrollPreference implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PayrollPreferencePK payrollPreferencePK;
    @Column(name = "DEDUCTION_TYPE_ID")
    private String deductionTypeId;
    @Column(name = "PAYMENT_METHOD_TYPE_ID")
    private String paymentMethodTypeId;
    @Column(name = "PERIOD_TYPE_ID")
    private String periodTypeId;
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PERCENTAGE")
    private BigDecimal percentage;
    @Column(name = "FLAT_AMOUNT")
    private BigDecimal flatAmount;
    @Column(name = "ROUTING_NUMBER")
    private String routingNumber;
    @Column(name = "ACCOUNT_NUMBER")
    private String accountNumber;
    @Column(name = "BANK_NAME")
    private String bankName;
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
    @JoinColumns({
        @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false),
        @JoinColumn(name = "ROLE_TYPE_ID", referencedColumnName = "ROLE_TYPE_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private PartyRole partyRole;
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Party party;

    public PayrollPreference() {
    }

    public PayrollPreference(PayrollPreferencePK payrollPreferencePK) {
        this.payrollPreferencePK = payrollPreferencePK;
    }

    public PayrollPreference(String partyId, String roleTypeId, String payrollPreferenceSeqId) {
        this.payrollPreferencePK = new PayrollPreferencePK(partyId, roleTypeId, payrollPreferenceSeqId);
    }

    public PayrollPreferencePK getPayrollPreferencePK() {
        return payrollPreferencePK;
    }

    public void setPayrollPreferencePK(PayrollPreferencePK payrollPreferencePK) {
        this.payrollPreferencePK = payrollPreferencePK;
    }

    public String getDeductionTypeId() {
        return deductionTypeId;
    }

    public void setDeductionTypeId(String deductionTypeId) {
        this.deductionTypeId = deductionTypeId;
    }

    public String getPaymentMethodTypeId() {
        return paymentMethodTypeId;
    }

    public void setPaymentMethodTypeId(String paymentMethodTypeId) {
        this.paymentMethodTypeId = paymentMethodTypeId;
    }

    public String getPeriodTypeId() {
        return periodTypeId;
    }

    public void setPeriodTypeId(String periodTypeId) {
        this.periodTypeId = periodTypeId;
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

    public BigDecimal getPercentage() {
        return percentage;
    }

    public void setPercentage(BigDecimal percentage) {
        this.percentage = percentage;
    }

    public BigDecimal getFlatAmount() {
        return flatAmount;
    }

    public void setFlatAmount(BigDecimal flatAmount) {
        this.flatAmount = flatAmount;
    }

    public String getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(String routingNumber) {
        this.routingNumber = routingNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
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

    public PartyRole getPartyRole() {
        return partyRole;
    }

    public void setPartyRole(PartyRole partyRole) {
        this.partyRole = partyRole;
    }

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (payrollPreferencePK != null ? payrollPreferencePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PayrollPreference)) {
            return false;
        }
        PayrollPreference other = (PayrollPreference) object;
        if ((this.payrollPreferencePK == null && other.payrollPreferencePK != null) || (this.payrollPreferencePK != null && !this.payrollPreferencePK.equals(other.payrollPreferencePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PayrollPreference[ payrollPreferencePK=" + payrollPreferencePK + " ]";
    }
    
}
