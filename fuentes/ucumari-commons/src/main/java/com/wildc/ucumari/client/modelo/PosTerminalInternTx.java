/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.parameters.model.Enumeration;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "pos_terminal_intern_tx")
@NamedQueries({
    @NamedQuery(name = "PosTerminalInternTx.findAll", query = "SELECT p FROM PosTerminalInternTx p")})
public class PosTerminalInternTx implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "POS_TERMINAL_LOG_ID")
    private String posTerminalLogId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PAID_AMOUNT")
    private BigDecimal paidAmount;
    @Column(name = "REASON_COMMENT")
    private String reasonComment;
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
    @JoinColumn(name = "POS_TERMINAL_LOG_ID", referencedColumnName = "POS_TERMINAL_LOG_ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private PosTerminalLog posTerminalLog;
    @JoinColumn(name = "REASON_ENUM_ID", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration reasonEnumId;

    public PosTerminalInternTx() {
    }

    public PosTerminalInternTx(String posTerminalLogId) {
        this.posTerminalLogId = posTerminalLogId;
    }

    public String getPosTerminalLogId() {
        return posTerminalLogId;
    }

    public void setPosTerminalLogId(String posTerminalLogId) {
        this.posTerminalLogId = posTerminalLogId;
    }

    public BigDecimal getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(BigDecimal paidAmount) {
        this.paidAmount = paidAmount;
    }

    public String getReasonComment() {
        return reasonComment;
    }

    public void setReasonComment(String reasonComment) {
        this.reasonComment = reasonComment;
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

    public PosTerminalLog getPosTerminalLog() {
        return posTerminalLog;
    }

    public void setPosTerminalLog(PosTerminalLog posTerminalLog) {
        this.posTerminalLog = posTerminalLog;
    }

    public Enumeration getReasonEnumId() {
        return reasonEnumId;
    }

    public void setReasonEnumId(Enumeration reasonEnumId) {
        this.reasonEnumId = reasonEnumId;
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
        if (!(object instanceof PosTerminalInternTx)) {
            return false;
        }
        PosTerminalInternTx other = (PosTerminalInternTx) object;
        if ((this.posTerminalLogId == null && other.posTerminalLogId != null) || (this.posTerminalLogId != null && !this.posTerminalLogId.equals(other.posTerminalLogId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PosTerminalInternTx[ posTerminalLogId=" + posTerminalLogId + " ]";
    }
    
}
