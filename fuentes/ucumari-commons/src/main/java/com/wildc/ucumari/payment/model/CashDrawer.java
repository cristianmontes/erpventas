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

import com.wildc.ucumari.parameters.model.Uom;
import com.wildc.ucumari.security.model.UserLogin;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "cash_drawer")
public class CashDrawer implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CASH_DRAWER_ID")
    private String cashDrawerId;
    @Column(name = "OPEN_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date openTimestamp;
    @Column(name = "CLOSE_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date closeTimestamp;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "INITIAL_AMOUNT")
    private BigDecimal initialAmount;
    @Column(name = "FINAL_AMOUNT")
    private BigDecimal finalAmount;
    @Column(name = "CLOSING_VARIANCE_AMOUNT")
    private BigDecimal closingVarianceAmount;
    @Column(name = "OPENING_COMMENTS")
    private String openingComments;
    @Column(name = "CLOSING_COMMENTS")
    private String closingComments;
    @Column(name = "FORCED_CLOSE")
    private Character forcedClose;
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
    @JoinColumn(name = "OPEN_USER_LOGIN_ID", referencedColumnName = "USER_LOGIN_ID")
    @ManyToOne
    private UserLogin openUserLoginId;
    @JoinColumn(name = "OPERATOR_USER_LOGIN_ID", referencedColumnName = "USER_LOGIN_ID")
    @ManyToOne
    private UserLogin operatorUserLoginId;
    @JoinColumn(name = "CURRENCY_UOM_ID", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom currencyUomId;
    @JoinColumn(name = "CLOSE_USER_LOGIN_ID", referencedColumnName = "USER_LOGIN_ID")
    @ManyToOne
    private UserLogin closeUserLoginId;
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "cashDrawer")
    private List<CashDrawerTransaction> cashDrawerTransactionList;*/

    public CashDrawer() {
    }

    public CashDrawer(String cashDrawerId) {
        this.cashDrawerId = cashDrawerId;
    }

    public String getCashDrawerId() {
        return cashDrawerId;
    }

    public void setCashDrawerId(String cashDrawerId) {
        this.cashDrawerId = cashDrawerId;
    }

    public Date getOpenTimestamp() {
        return openTimestamp;
    }

    public void setOpenTimestamp(Date openTimestamp) {
        this.openTimestamp = openTimestamp;
    }

    public Date getCloseTimestamp() {
        return closeTimestamp;
    }

    public void setCloseTimestamp(Date closeTimestamp) {
        this.closeTimestamp = closeTimestamp;
    }

    public BigDecimal getInitialAmount() {
        return initialAmount;
    }

    public void setInitialAmount(BigDecimal initialAmount) {
        this.initialAmount = initialAmount;
    }

    public BigDecimal getFinalAmount() {
        return finalAmount;
    }

    public void setFinalAmount(BigDecimal finalAmount) {
        this.finalAmount = finalAmount;
    }

    public BigDecimal getClosingVarianceAmount() {
        return closingVarianceAmount;
    }

    public void setClosingVarianceAmount(BigDecimal closingVarianceAmount) {
        this.closingVarianceAmount = closingVarianceAmount;
    }

    public String getOpeningComments() {
        return openingComments;
    }

    public void setOpeningComments(String openingComments) {
        this.openingComments = openingComments;
    }

    public String getClosingComments() {
        return closingComments;
    }

    public void setClosingComments(String closingComments) {
        this.closingComments = closingComments;
    }

    public Character getForcedClose() {
        return forcedClose;
    }

    public void setForcedClose(Character forcedClose) {
        this.forcedClose = forcedClose;
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

    public UserLogin getOpenUserLoginId() {
        return openUserLoginId;
    }

    public void setOpenUserLoginId(UserLogin openUserLoginId) {
        this.openUserLoginId = openUserLoginId;
    }

    public UserLogin getOperatorUserLoginId() {
        return operatorUserLoginId;
    }

    public void setOperatorUserLoginId(UserLogin operatorUserLoginId) {
        this.operatorUserLoginId = operatorUserLoginId;
    }

    public Uom getCurrencyUomId() {
        return currencyUomId;
    }

    public void setCurrencyUomId(Uom currencyUomId) {
        this.currencyUomId = currencyUomId;
    }

    public UserLogin getCloseUserLoginId() {
        return closeUserLoginId;
    }

    public void setCloseUserLoginId(UserLogin closeUserLoginId) {
        this.closeUserLoginId = closeUserLoginId;
    }
/*
    public List<CashDrawerTransaction> getCashDrawerTransactionList() {
        return cashDrawerTransactionList;
    }

    public void setCashDrawerTransactionList(List<CashDrawerTransaction> cashDrawerTransactionList) {
        this.cashDrawerTransactionList = cashDrawerTransactionList;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cashDrawerId != null ? cashDrawerId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CashDrawer)) {
            return false;
        }
        CashDrawer other = (CashDrawer) object;
        if ((this.cashDrawerId == null && other.cashDrawerId != null) || (this.cashDrawerId != null && !this.cashDrawerId.equals(other.cashDrawerId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.CashDrawer[ cashDrawerId=" + cashDrawerId + " ]";
    }
    
}
