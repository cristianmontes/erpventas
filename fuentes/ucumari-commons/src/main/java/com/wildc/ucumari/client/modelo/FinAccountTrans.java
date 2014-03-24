/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import com.wildc.ucumari.order.model.OrderItem;
import com.wildc.ucumari.parameters.model.Enumeration;
import com.wildc.ucumari.party.model.Party;
import com.wildc.ucumari.payment.model.Payment;
import com.wildc.ucumari.accounting.model.AcctgTrans;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
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
@Table(name = "fin_account_trans")
@NamedQueries({
    @NamedQuery(name = "FinAccountTrans.findAll", query = "SELECT f FROM FinAccountTrans f")})
public class FinAccountTrans implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "FIN_ACCOUNT_TRANS_ID")
    private String finAccountTransId;
    @Column(name = "TRANSACTION_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date transactionDate;
    @Column(name = "ENTRY_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date entryDate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "AMOUNT")
    private BigDecimal amount;
    @Column(name = "COMMENTS")
    private String comments;
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
    @OneToMany(mappedBy = "finAccountTransId")
    private List<Payment> paymentList;
    @OneToMany(mappedBy = "finAccountTransId")
    private List<AcctgTrans> acctgTransList;
    @JoinColumn(name = "PAYMENT_ID", referencedColumnName = "PAYMENT_ID")
    @ManyToOne
    private Payment paymentId;
    @JoinColumn(name = "PERFORMED_BY_PARTY_ID", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party performedByPartyId;
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party partyId;
    @JoinColumns({
        @JoinColumn(name = "ORDER_ID", referencedColumnName = "ORDER_ID"),
        @JoinColumn(name = "ORDER_ITEM_SEQ_ID", referencedColumnName = "ORDER_ITEM_SEQ_ID")})
    @ManyToOne
    private OrderItem orderItem;
    @JoinColumn(name = "FIN_ACCOUNT_ID", referencedColumnName = "FIN_ACCOUNT_ID")
    @ManyToOne
    private FinAccount finAccountId;
    @JoinColumn(name = "REASON_ENUM_ID", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration reasonEnumId;
    @JoinColumn(name = "FIN_ACCOUNT_TRANS_TYPE_ID", referencedColumnName = "FIN_ACCOUNT_TRANS_TYPE_ID")
    @ManyToOne
    private FinAccountTransType finAccountTransTypeId;

    public FinAccountTrans() {
    }

    public FinAccountTrans(String finAccountTransId) {
        this.finAccountTransId = finAccountTransId;
    }

    public String getFinAccountTransId() {
        return finAccountTransId;
    }

    public void setFinAccountTransId(String finAccountTransId) {
        this.finAccountTransId = finAccountTransId;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
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

    public List<Payment> getPaymentList() {
        return paymentList;
    }

    public void setPaymentList(List<Payment> paymentList) {
        this.paymentList = paymentList;
    }

    public List<AcctgTrans> getAcctgTransList() {
        return acctgTransList;
    }

    public void setAcctgTransList(List<AcctgTrans> acctgTransList) {
        this.acctgTransList = acctgTransList;
    }

    public Payment getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Payment paymentId) {
        this.paymentId = paymentId;
    }

    public Party getPerformedByPartyId() {
        return performedByPartyId;
    }

    public void setPerformedByPartyId(Party performedByPartyId) {
        this.performedByPartyId = performedByPartyId;
    }

    public Party getPartyId() {
        return partyId;
    }

    public void setPartyId(Party partyId) {
        this.partyId = partyId;
    }

    public OrderItem getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(OrderItem orderItem) {
        this.orderItem = orderItem;
    }

    public FinAccount getFinAccountId() {
        return finAccountId;
    }

    public void setFinAccountId(FinAccount finAccountId) {
        this.finAccountId = finAccountId;
    }

    public Enumeration getReasonEnumId() {
        return reasonEnumId;
    }

    public void setReasonEnumId(Enumeration reasonEnumId) {
        this.reasonEnumId = reasonEnumId;
    }

    public FinAccountTransType getFinAccountTransTypeId() {
        return finAccountTransTypeId;
    }

    public void setFinAccountTransTypeId(FinAccountTransType finAccountTransTypeId) {
        this.finAccountTransTypeId = finAccountTransTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (finAccountTransId != null ? finAccountTransId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FinAccountTrans)) {
            return false;
        }
        FinAccountTrans other = (FinAccountTrans) object;
        if ((this.finAccountTransId == null && other.finAccountTransId != null) || (this.finAccountTransId != null && !this.finAccountTransId.equals(other.finAccountTransId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.FinAccountTrans[ finAccountTransId=" + finAccountTransId + " ]";
    }
    
}
