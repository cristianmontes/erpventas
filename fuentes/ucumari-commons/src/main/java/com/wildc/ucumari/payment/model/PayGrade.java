/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.payment.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.client.modelo.SalaryStep;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "pay_grade")
@NamedQueries({
    @NamedQuery(name = "PayGrade.findAll", query = "SELECT p FROM PayGrade p")})
public class PayGrade implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "payGrade")
    private List<SalaryStep> salaryStepList;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PAY_GRADE_ID")
    private String payGradeId;
    @Column(name = "PAY_GRADE_NAME")
    private String payGradeName;
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
    @OneToMany(mappedBy = "payGradeId")
    private List<PayHistory> payHistoryList;

    public PayGrade() {
    }

    public PayGrade(String payGradeId) {
        this.payGradeId = payGradeId;
    }

    public String getPayGradeId() {
        return payGradeId;
    }

    public void setPayGradeId(String payGradeId) {
        this.payGradeId = payGradeId;
    }

    public String getPayGradeName() {
        return payGradeName;
    }

    public void setPayGradeName(String payGradeName) {
        this.payGradeName = payGradeName;
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

    public List<PayHistory> getPayHistoryList() {
        return payHistoryList;
    }

    public void setPayHistoryList(List<PayHistory> payHistoryList) {
        this.payHistoryList = payHistoryList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (payGradeId != null ? payGradeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PayGrade)) {
            return false;
        }
        PayGrade other = (PayGrade) object;
        if ((this.payGradeId == null && other.payGradeId != null) || (this.payGradeId != null && !this.payGradeId.equals(other.payGradeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PayGrade[ payGradeId=" + payGradeId + " ]";
    }

    public List<SalaryStep> getSalaryStepList() {
        return salaryStepList;
    }

    public void setSalaryStepList(List<SalaryStep> salaryStepList) {
        this.salaryStepList = salaryStepList;
    }
    
}
