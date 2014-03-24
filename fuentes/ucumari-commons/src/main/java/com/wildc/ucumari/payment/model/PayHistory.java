/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.payment.model;

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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.client.modelo.Employment;
import com.wildc.ucumari.parameters.model.PeriodType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "pay_history")
@NamedQueries({
    @NamedQuery(name = "PayHistory.findAll", query = "SELECT p FROM PayHistory p")})
public class PayHistory implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PayHistoryPK payHistoryPK;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
    @Column(name = "SALARY_STEP_SEQ_ID")
    private String salaryStepSeqId;
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
    @JoinColumn(name = "PAY_GRADE_ID", referencedColumnName = "PAY_GRADE_ID")
    @ManyToOne
    private PayGrade payGradeId;
    @JoinColumn(name = "PERIOD_TYPE_ID", referencedColumnName = "PERIOD_TYPE_ID")
    @ManyToOne
    private PeriodType periodTypeId;
    @JoinColumns({
        @JoinColumn(name = "ROLE_TYPE_ID_FROM", referencedColumnName = "ROLE_TYPE_ID_FROM", insertable = false, updatable = false),
        @JoinColumn(name = "ROLE_TYPE_ID_TO", referencedColumnName = "ROLE_TYPE_ID_TO", insertable = false, updatable = false),
        @JoinColumn(name = "PARTY_ID_FROM", referencedColumnName = "PARTY_ID_FROM", insertable = false, updatable = false),
        @JoinColumn(name = "PARTY_ID_TO", referencedColumnName = "PARTY_ID_TO", insertable = false, updatable = false),
        @JoinColumn(name = "FROM_DATE", referencedColumnName = "FROM_DATE", insertable = false, updatable = false)})
    @OneToOne(optional = false)
    private Employment employment;

    public PayHistory() {
    }

    public PayHistory(PayHistoryPK payHistoryPK) {
        this.payHistoryPK = payHistoryPK;
    }

    public PayHistory(String roleTypeIdFrom, String roleTypeIdTo, String partyIdFrom, String partyIdTo, Date fromDate) {
        this.payHistoryPK = new PayHistoryPK(roleTypeIdFrom, roleTypeIdTo, partyIdFrom, partyIdTo, fromDate);
    }

    public PayHistoryPK getPayHistoryPK() {
        return payHistoryPK;
    }

    public void setPayHistoryPK(PayHistoryPK payHistoryPK) {
        this.payHistoryPK = payHistoryPK;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
    }

    public String getSalaryStepSeqId() {
        return salaryStepSeqId;
    }

    public void setSalaryStepSeqId(String salaryStepSeqId) {
        this.salaryStepSeqId = salaryStepSeqId;
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

    public PayGrade getPayGradeId() {
        return payGradeId;
    }

    public void setPayGradeId(PayGrade payGradeId) {
        this.payGradeId = payGradeId;
    }

    public PeriodType getPeriodTypeId() {
        return periodTypeId;
    }

    public void setPeriodTypeId(PeriodType periodTypeId) {
        this.periodTypeId = periodTypeId;
    }

    public Employment getEmployment() {
        return employment;
    }

    public void setEmployment(Employment employment) {
        this.employment = employment;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (payHistoryPK != null ? payHistoryPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PayHistory)) {
            return false;
        }
        PayHistory other = (PayHistory) object;
        if ((this.payHistoryPK == null && other.payHistoryPK != null) || (this.payHistoryPK != null && !this.payHistoryPK.equals(other.payHistoryPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PayHistory[ payHistoryPK=" + payHistoryPK + " ]";
    }
    
}
