/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.accounting.model;

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
@Table(name = "account_balance_history")
@NamedQueries({
    @NamedQuery(name = "AccountBalanceHistory.findAll", query = "SELECT a FROM AccountBalanceHistory a")})
public class AccountBalanceHistory implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ACCOUNT_BALANCE_HISTORY_ID")
    private String accountBalanceHistoryId;
    @Column(name = "AS_OF_DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date asOfDatetime;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TOTAL_BALANCE")
    private BigDecimal totalBalance;
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
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party partyId;
    @JoinColumn(name = "ORGANIZATION_PARTY_ID", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party organizationPartyId;
    @JoinColumn(name = "BALANCE_TYPE_ENUM_ID", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration balanceTypeEnumId;

    public AccountBalanceHistory() {
    }

    public AccountBalanceHistory(String accountBalanceHistoryId) {
        this.accountBalanceHistoryId = accountBalanceHistoryId;
    }

    public String getAccountBalanceHistoryId() {
        return accountBalanceHistoryId;
    }

    public void setAccountBalanceHistoryId(String accountBalanceHistoryId) {
        this.accountBalanceHistoryId = accountBalanceHistoryId;
    }

    public Date getAsOfDatetime() {
        return asOfDatetime;
    }

    public void setAsOfDatetime(Date asOfDatetime) {
        this.asOfDatetime = asOfDatetime;
    }

    public BigDecimal getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(BigDecimal totalBalance) {
        this.totalBalance = totalBalance;
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

    public Party getPartyId() {
        return partyId;
    }

    public void setPartyId(Party partyId) {
        this.partyId = partyId;
    }

    public Party getOrganizationPartyId() {
        return organizationPartyId;
    }

    public void setOrganizationPartyId(Party organizationPartyId) {
        this.organizationPartyId = organizationPartyId;
    }

    public Enumeration getBalanceTypeEnumId() {
        return balanceTypeEnumId;
    }

    public void setBalanceTypeEnumId(Enumeration balanceTypeEnumId) {
        this.balanceTypeEnumId = balanceTypeEnumId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (accountBalanceHistoryId != null ? accountBalanceHistoryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AccountBalanceHistory)) {
            return false;
        }
        AccountBalanceHistory other = (AccountBalanceHistory) object;
        if ((this.accountBalanceHistoryId == null && other.accountBalanceHistoryId != null) || (this.accountBalanceHistoryId != null && !this.accountBalanceHistoryId.equals(other.accountBalanceHistoryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.AccountBalanceHistory[ accountBalanceHistoryId=" + accountBalanceHistoryId + " ]";
    }
    
}
