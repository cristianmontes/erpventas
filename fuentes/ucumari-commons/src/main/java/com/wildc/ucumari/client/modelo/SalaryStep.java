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

import com.wildc.ucumari.payment.model.PayGrade;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "salary_step")
@NamedQueries({
    @NamedQuery(name = "SalaryStep.findAll", query = "SELECT s FROM SalaryStep s")})
public class SalaryStep implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SalaryStepPK salaryStepPK;
    @Column(name = "DATE_MODIFIED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateModified;
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
    @JoinColumn(name = "PAY_GRADE_ID", referencedColumnName = "PAY_GRADE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private PayGrade payGrade;

    public SalaryStep() {
    }

    public SalaryStep(SalaryStepPK salaryStepPK) {
        this.salaryStepPK = salaryStepPK;
    }

    public SalaryStep(String salaryStepSeqId, String payGradeId) {
        this.salaryStepPK = new SalaryStepPK(salaryStepSeqId, payGradeId);
    }

    public SalaryStepPK getSalaryStepPK() {
        return salaryStepPK;
    }

    public void setSalaryStepPK(SalaryStepPK salaryStepPK) {
        this.salaryStepPK = salaryStepPK;
    }

    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
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

    public PayGrade getPayGrade() {
        return payGrade;
    }

    public void setPayGrade(PayGrade payGrade) {
        this.payGrade = payGrade;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (salaryStepPK != null ? salaryStepPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SalaryStep)) {
            return false;
        }
        SalaryStep other = (SalaryStep) object;
        if ((this.salaryStepPK == null && other.salaryStepPK != null) || (this.salaryStepPK != null && !this.salaryStepPK.equals(other.salaryStepPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.SalaryStep[ salaryStepPK=" + salaryStepPK + " ]";
    }
    
}
