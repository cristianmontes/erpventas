/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.order.model.OrderHeader;
import com.wildc.ucumari.parameters.model.StatusItem;
import com.wildc.ucumari.returns.model.ReturnHeader;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "pos_terminal_log")
@NamedQueries({
    @NamedQuery(name = "PosTerminalLog.findAll", query = "SELECT p FROM PosTerminalLog p")})
public class PosTerminalLog implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "POS_TERMINAL_LOG_ID")
    private String posTerminalLogId;
    @Column(name = "TRANSACTION_ID")
    private String transactionId;
    @Column(name = "ITEM_COUNT")
    private BigInteger itemCount;
    @Column(name = "USER_LOGIN_ID")
    private String userLoginId;
    @Column(name = "LOG_START_DATE_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date logStartDateTime;
    @Column(name = "LOG_END_DATE_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date logEndDateTime;
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
    @JoinColumn(name = "STATUS_ID", referencedColumnName = "STATUS_ID")
    @ManyToOne
    private StatusItem statusId;
    @JoinColumn(name = "RETURN_ID", referencedColumnName = "RETURN_ID")
    @ManyToOne
    private ReturnHeader returnId;
    @JoinColumn(name = "POS_TERMINAL_ID", referencedColumnName = "POS_TERMINAL_ID")
    @ManyToOne
    private PosTerminal posTerminalId;
    @JoinColumn(name = "ORDER_ID", referencedColumnName = "ORDER_ID")
    @ManyToOne
    private OrderHeader orderId;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "posTerminalLog")
    private PosTerminalInternTx posTerminalInternTx;

    public PosTerminalLog() {
    }

    public PosTerminalLog(String posTerminalLogId) {
        this.posTerminalLogId = posTerminalLogId;
    }

    public String getPosTerminalLogId() {
        return posTerminalLogId;
    }

    public void setPosTerminalLogId(String posTerminalLogId) {
        this.posTerminalLogId = posTerminalLogId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public BigInteger getItemCount() {
        return itemCount;
    }

    public void setItemCount(BigInteger itemCount) {
        this.itemCount = itemCount;
    }

    public String getUserLoginId() {
        return userLoginId;
    }

    public void setUserLoginId(String userLoginId) {
        this.userLoginId = userLoginId;
    }

    public Date getLogStartDateTime() {
        return logStartDateTime;
    }

    public void setLogStartDateTime(Date logStartDateTime) {
        this.logStartDateTime = logStartDateTime;
    }

    public Date getLogEndDateTime() {
        return logEndDateTime;
    }

    public void setLogEndDateTime(Date logEndDateTime) {
        this.logEndDateTime = logEndDateTime;
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

    public StatusItem getStatusId() {
        return statusId;
    }

    public void setStatusId(StatusItem statusId) {
        this.statusId = statusId;
    }

    public ReturnHeader getReturnId() {
        return returnId;
    }

    public void setReturnId(ReturnHeader returnId) {
        this.returnId = returnId;
    }

    public PosTerminal getPosTerminalId() {
        return posTerminalId;
    }

    public void setPosTerminalId(PosTerminal posTerminalId) {
        this.posTerminalId = posTerminalId;
    }

    public OrderHeader getOrderId() {
        return orderId;
    }

    public void setOrderId(OrderHeader orderId) {
        this.orderId = orderId;
    }

    public PosTerminalInternTx getPosTerminalInternTx() {
        return posTerminalInternTx;
    }

    public void setPosTerminalInternTx(PosTerminalInternTx posTerminalInternTx) {
        this.posTerminalInternTx = posTerminalInternTx;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (posTerminalLogId != null ? posTerminalLogId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PosTerminalLog)) {
            return false;
        }
        PosTerminalLog other = (PosTerminalLog) object;
        if ((this.posTerminalLogId == null && other.posTerminalLogId != null) || (this.posTerminalLogId != null && !this.posTerminalLogId.equals(other.posTerminalLogId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PosTerminalLog[ posTerminalLogId=" + posTerminalLogId + " ]";
    }
    
}
