/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.accounting.model;

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
@Table(name = "gl_account_trans_entry_fact")
@NamedQueries({
    @NamedQuery(name = "GlAccountTransEntryFact.findAll", query = "SELECT g FROM GlAccountTransEntryFact g")})
public class GlAccountTransEntryFact implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "GL_ACCOUNT_TRANS_ENTRY_FACT_ID")
    private String glAccountTransEntryFactId;
    @Column(name = "TRANSACTION_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date transactionDate;
    @Column(name = "ORGANIZATION_PARTY_ID")
    private String organizationPartyId;
    @Column(name = "ORDER_ID")
    private String orderId;
    @Column(name = "ORDER_ITEM_SEQ_ID")
    private String orderItemSeqId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "BUDGET_DEBIT_AMOUNT")
    private BigDecimal budgetDebitAmount;
    @Column(name = "BUDGET_CREDIT_AMOUNT")
    private BigDecimal budgetCreditAmount;
    @Column(name = "ACTUAL_DEBIT_AMOUNT")
    private BigDecimal actualDebitAmount;
    @Column(name = "ACTUAL_CREDIT_AMOUNT")
    private BigDecimal actualCreditAmount;
    @Column(name = "ENCUMBERED_DEBIT_AMOUNT")
    private BigDecimal encumberedDebitAmount;
    @Column(name = "ENCUMBERED_CREDIT_AMOUNT")
    private BigDecimal encumberedCreditAmount;
    @Column(name = "BUDGET_NET_AMOUNT")
    private BigDecimal budgetNetAmount;
    @Column(name = "ACTUAL_NET_AMOUNT")
    private BigDecimal actualNetAmount;
    @Column(name = "ENCUMBERED_NET_AMOUNT")
    private BigDecimal encumberedNetAmount;
    @Column(name = "ACCTG_TAG_ENUM_ID1")
    private String acctgTagEnumId1;
    @Column(name = "ACCTG_TAG_ENUM_ID2")
    private String acctgTagEnumId2;
    @Column(name = "ACCTG_TAG_ENUM_ID3")
    private String acctgTagEnumId3;
    @Column(name = "ACCTG_TAG_ENUM_ID4")
    private String acctgTagEnumId4;
    @Column(name = "ACCTG_TAG_ENUM_ID5")
    private String acctgTagEnumId5;
    @Column(name = "ACCTG_TAG_ENUM_ID6")
    private String acctgTagEnumId6;
    @Column(name = "ACCTG_TAG_ENUM_ID7")
    private String acctgTagEnumId7;
    @Column(name = "ACCTG_TAG_ENUM_ID8")
    private String acctgTagEnumId8;
    @Column(name = "ACCTG_TAG_ENUM_ID9")
    private String acctgTagEnumId9;
    @Column(name = "ACCTG_TAG_ENUM_ID10")
    private String acctgTagEnumId10;
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
    @JoinColumn(name = "GL_ACCOUNT_ID", referencedColumnName = "GL_ACCOUNT_ID")
    @ManyToOne
    private GlAccount glAccountId;
    @JoinColumns({
        @JoinColumn(name = "ACCTG_TRANS_ID", referencedColumnName = "ACCTG_TRANS_ID"),
        @JoinColumn(name = "ACCTG_TRANS_ENTRY_SEQ_ID", referencedColumnName = "ACCTG_TRANS_ENTRY_SEQ_ID")})
    @ManyToOne
    private AcctgTransEntry acctgTransEntry;

    public GlAccountTransEntryFact() {
    }

    public GlAccountTransEntryFact(String glAccountTransEntryFactId) {
        this.glAccountTransEntryFactId = glAccountTransEntryFactId;
    }

    public String getGlAccountTransEntryFactId() {
        return glAccountTransEntryFactId;
    }

    public void setGlAccountTransEntryFactId(String glAccountTransEntryFactId) {
        this.glAccountTransEntryFactId = glAccountTransEntryFactId;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getOrganizationPartyId() {
        return organizationPartyId;
    }

    public void setOrganizationPartyId(String organizationPartyId) {
        this.organizationPartyId = organizationPartyId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderItemSeqId() {
        return orderItemSeqId;
    }

    public void setOrderItemSeqId(String orderItemSeqId) {
        this.orderItemSeqId = orderItemSeqId;
    }

    public BigDecimal getBudgetDebitAmount() {
        return budgetDebitAmount;
    }

    public void setBudgetDebitAmount(BigDecimal budgetDebitAmount) {
        this.budgetDebitAmount = budgetDebitAmount;
    }

    public BigDecimal getBudgetCreditAmount() {
        return budgetCreditAmount;
    }

    public void setBudgetCreditAmount(BigDecimal budgetCreditAmount) {
        this.budgetCreditAmount = budgetCreditAmount;
    }

    public BigDecimal getActualDebitAmount() {
        return actualDebitAmount;
    }

    public void setActualDebitAmount(BigDecimal actualDebitAmount) {
        this.actualDebitAmount = actualDebitAmount;
    }

    public BigDecimal getActualCreditAmount() {
        return actualCreditAmount;
    }

    public void setActualCreditAmount(BigDecimal actualCreditAmount) {
        this.actualCreditAmount = actualCreditAmount;
    }

    public BigDecimal getEncumberedDebitAmount() {
        return encumberedDebitAmount;
    }

    public void setEncumberedDebitAmount(BigDecimal encumberedDebitAmount) {
        this.encumberedDebitAmount = encumberedDebitAmount;
    }

    public BigDecimal getEncumberedCreditAmount() {
        return encumberedCreditAmount;
    }

    public void setEncumberedCreditAmount(BigDecimal encumberedCreditAmount) {
        this.encumberedCreditAmount = encumberedCreditAmount;
    }

    public BigDecimal getBudgetNetAmount() {
        return budgetNetAmount;
    }

    public void setBudgetNetAmount(BigDecimal budgetNetAmount) {
        this.budgetNetAmount = budgetNetAmount;
    }

    public BigDecimal getActualNetAmount() {
        return actualNetAmount;
    }

    public void setActualNetAmount(BigDecimal actualNetAmount) {
        this.actualNetAmount = actualNetAmount;
    }

    public BigDecimal getEncumberedNetAmount() {
        return encumberedNetAmount;
    }

    public void setEncumberedNetAmount(BigDecimal encumberedNetAmount) {
        this.encumberedNetAmount = encumberedNetAmount;
    }

    public String getAcctgTagEnumId1() {
        return acctgTagEnumId1;
    }

    public void setAcctgTagEnumId1(String acctgTagEnumId1) {
        this.acctgTagEnumId1 = acctgTagEnumId1;
    }

    public String getAcctgTagEnumId2() {
        return acctgTagEnumId2;
    }

    public void setAcctgTagEnumId2(String acctgTagEnumId2) {
        this.acctgTagEnumId2 = acctgTagEnumId2;
    }

    public String getAcctgTagEnumId3() {
        return acctgTagEnumId3;
    }

    public void setAcctgTagEnumId3(String acctgTagEnumId3) {
        this.acctgTagEnumId3 = acctgTagEnumId3;
    }

    public String getAcctgTagEnumId4() {
        return acctgTagEnumId4;
    }

    public void setAcctgTagEnumId4(String acctgTagEnumId4) {
        this.acctgTagEnumId4 = acctgTagEnumId4;
    }

    public String getAcctgTagEnumId5() {
        return acctgTagEnumId5;
    }

    public void setAcctgTagEnumId5(String acctgTagEnumId5) {
        this.acctgTagEnumId5 = acctgTagEnumId5;
    }

    public String getAcctgTagEnumId6() {
        return acctgTagEnumId6;
    }

    public void setAcctgTagEnumId6(String acctgTagEnumId6) {
        this.acctgTagEnumId6 = acctgTagEnumId6;
    }

    public String getAcctgTagEnumId7() {
        return acctgTagEnumId7;
    }

    public void setAcctgTagEnumId7(String acctgTagEnumId7) {
        this.acctgTagEnumId7 = acctgTagEnumId7;
    }

    public String getAcctgTagEnumId8() {
        return acctgTagEnumId8;
    }

    public void setAcctgTagEnumId8(String acctgTagEnumId8) {
        this.acctgTagEnumId8 = acctgTagEnumId8;
    }

    public String getAcctgTagEnumId9() {
        return acctgTagEnumId9;
    }

    public void setAcctgTagEnumId9(String acctgTagEnumId9) {
        this.acctgTagEnumId9 = acctgTagEnumId9;
    }

    public String getAcctgTagEnumId10() {
        return acctgTagEnumId10;
    }

    public void setAcctgTagEnumId10(String acctgTagEnumId10) {
        this.acctgTagEnumId10 = acctgTagEnumId10;
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

    public GlAccount getGlAccountId() {
        return glAccountId;
    }

    public void setGlAccountId(GlAccount glAccountId) {
        this.glAccountId = glAccountId;
    }

    public AcctgTransEntry getAcctgTransEntry() {
        return acctgTransEntry;
    }

    public void setAcctgTransEntry(AcctgTransEntry acctgTransEntry) {
        this.acctgTransEntry = acctgTransEntry;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (glAccountTransEntryFactId != null ? glAccountTransEntryFactId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GlAccountTransEntryFact)) {
            return false;
        }
        GlAccountTransEntryFact other = (GlAccountTransEntryFact) object;
        if ((this.glAccountTransEntryFactId == null && other.glAccountTransEntryFactId != null) || (this.glAccountTransEntryFactId != null && !this.glAccountTransEntryFactId.equals(other.glAccountTransEntryFactId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.GlAccountTransEntryFact[ glAccountTransEntryFactId=" + glAccountTransEntryFactId + " ]";
    }
    
}
