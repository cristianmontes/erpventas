/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "pos_terminal_state")
@NamedQueries({
    @NamedQuery(name = "PosTerminalState.findAll", query = "SELECT p FROM PosTerminalState p")})
public class PosTerminalState implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PosTerminalStatePK posTerminalStatePK;
    @Column(name = "CLOSED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date closedDate;
    @Column(name = "STARTING_TX_ID")
    private String startingTxId;
    @Column(name = "ENDING_TX_ID")
    private String endingTxId;
    @Column(name = "OPENED_BY_USER_LOGIN_ID")
    private String openedByUserLoginId;
    @Column(name = "CLOSED_BY_USER_LOGIN_ID")
    private String closedByUserLoginId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "STARTING_DRAWER_AMOUNT")
    private BigDecimal startingDrawerAmount;
    @Column(name = "ACTUAL_ENDING_CASH")
    private BigDecimal actualEndingCash;
    @Column(name = "ACTUAL_ENDING_CHECK")
    private BigDecimal actualEndingCheck;
    @Column(name = "ACTUAL_ENDING_CC")
    private BigDecimal actualEndingCc;
    @Column(name = "ACTUAL_ENDING_GC")
    private BigDecimal actualEndingGc;
    @Column(name = "ACTUAL_ENDING_OTHER")
    private BigDecimal actualEndingOther;
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
    @JoinColumn(name = "POS_TERMINAL_ID", referencedColumnName = "POS_TERMINAL_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private PosTerminal posTerminal;

    public PosTerminalState() {
    }

    public PosTerminalState(PosTerminalStatePK posTerminalStatePK) {
        this.posTerminalStatePK = posTerminalStatePK;
    }

    public PosTerminalState(String posTerminalId, Date openedDate) {
        this.posTerminalStatePK = new PosTerminalStatePK(posTerminalId, openedDate);
    }

    public PosTerminalStatePK getPosTerminalStatePK() {
        return posTerminalStatePK;
    }

    public void setPosTerminalStatePK(PosTerminalStatePK posTerminalStatePK) {
        this.posTerminalStatePK = posTerminalStatePK;
    }

    public Date getClosedDate() {
        return closedDate;
    }

    public void setClosedDate(Date closedDate) {
        this.closedDate = closedDate;
    }

    public String getStartingTxId() {
        return startingTxId;
    }

    public void setStartingTxId(String startingTxId) {
        this.startingTxId = startingTxId;
    }

    public String getEndingTxId() {
        return endingTxId;
    }

    public void setEndingTxId(String endingTxId) {
        this.endingTxId = endingTxId;
    }

    public String getOpenedByUserLoginId() {
        return openedByUserLoginId;
    }

    public void setOpenedByUserLoginId(String openedByUserLoginId) {
        this.openedByUserLoginId = openedByUserLoginId;
    }

    public String getClosedByUserLoginId() {
        return closedByUserLoginId;
    }

    public void setClosedByUserLoginId(String closedByUserLoginId) {
        this.closedByUserLoginId = closedByUserLoginId;
    }

    public BigDecimal getStartingDrawerAmount() {
        return startingDrawerAmount;
    }

    public void setStartingDrawerAmount(BigDecimal startingDrawerAmount) {
        this.startingDrawerAmount = startingDrawerAmount;
    }

    public BigDecimal getActualEndingCash() {
        return actualEndingCash;
    }

    public void setActualEndingCash(BigDecimal actualEndingCash) {
        this.actualEndingCash = actualEndingCash;
    }

    public BigDecimal getActualEndingCheck() {
        return actualEndingCheck;
    }

    public void setActualEndingCheck(BigDecimal actualEndingCheck) {
        this.actualEndingCheck = actualEndingCheck;
    }

    public BigDecimal getActualEndingCc() {
        return actualEndingCc;
    }

    public void setActualEndingCc(BigDecimal actualEndingCc) {
        this.actualEndingCc = actualEndingCc;
    }

    public BigDecimal getActualEndingGc() {
        return actualEndingGc;
    }

    public void setActualEndingGc(BigDecimal actualEndingGc) {
        this.actualEndingGc = actualEndingGc;
    }

    public BigDecimal getActualEndingOther() {
        return actualEndingOther;
    }

    public void setActualEndingOther(BigDecimal actualEndingOther) {
        this.actualEndingOther = actualEndingOther;
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

    public PosTerminal getPosTerminal() {
        return posTerminal;
    }

    public void setPosTerminal(PosTerminal posTerminal) {
        this.posTerminal = posTerminal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (posTerminalStatePK != null ? posTerminalStatePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PosTerminalState)) {
            return false;
        }
        PosTerminalState other = (PosTerminalState) object;
        if ((this.posTerminalStatePK == null && other.posTerminalStatePK != null) || (this.posTerminalStatePK != null && !this.posTerminalStatePK.equals(other.posTerminalStatePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PosTerminalState[ posTerminalStatePK=" + posTerminalStatePK + " ]";
    }
    
}
