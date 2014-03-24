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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.payment.model.Payment;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "deduction")
@NamedQueries({
    @NamedQuery(name = "Deduction.findAll", query = "SELECT d FROM Deduction d")})
public class Deduction implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DEDUCTION_ID")
    private String deductionId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "AMOUNT")
    private BigDecimal amount;
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
    @JoinColumn(name = "PAYMENT_ID", referencedColumnName = "PAYMENT_ID")
    @ManyToOne
    private Payment paymentId;
    @JoinColumn(name = "DEDUCTION_TYPE_ID", referencedColumnName = "DEDUCTION_TYPE_ID")
    @ManyToOne
    private DeductionType deductionTypeId;

    public Deduction() {
    }

    public Deduction(String deductionId) {
        this.deductionId = deductionId;
    }

    public String getDeductionId() {
        return deductionId;
    }

    public void setDeductionId(String deductionId) {
        this.deductionId = deductionId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
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

    public Payment getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Payment paymentId) {
        this.paymentId = paymentId;
    }

    public DeductionType getDeductionTypeId() {
        return deductionTypeId;
    }

    public void setDeductionTypeId(DeductionType deductionTypeId) {
        this.deductionTypeId = deductionTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (deductionId != null ? deductionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Deduction)) {
            return false;
        }
        Deduction other = (Deduction) object;
        if ((this.deductionId == null && other.deductionId != null) || (this.deductionId != null && !this.deductionId.equals(other.deductionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.Deduction[ deductionId=" + deductionId + " ]";
    }
    
}
