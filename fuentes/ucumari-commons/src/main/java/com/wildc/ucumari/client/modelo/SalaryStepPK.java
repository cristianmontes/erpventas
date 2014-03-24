/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class SalaryStepPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "SALARY_STEP_SEQ_ID")
    private String salaryStepSeqId;
    @Basic(optional = false)
    @Column(name = "PAY_GRADE_ID")
    private String payGradeId;

    public SalaryStepPK() {
    }

    public SalaryStepPK(String salaryStepSeqId, String payGradeId) {
        this.salaryStepSeqId = salaryStepSeqId;
        this.payGradeId = payGradeId;
    }

    public String getSalaryStepSeqId() {
        return salaryStepSeqId;
    }

    public void setSalaryStepSeqId(String salaryStepSeqId) {
        this.salaryStepSeqId = salaryStepSeqId;
    }

    public String getPayGradeId() {
        return payGradeId;
    }

    public void setPayGradeId(String payGradeId) {
        this.payGradeId = payGradeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (salaryStepSeqId != null ? salaryStepSeqId.hashCode() : 0);
        hash += (payGradeId != null ? payGradeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SalaryStepPK)) {
            return false;
        }
        SalaryStepPK other = (SalaryStepPK) object;
        if ((this.salaryStepSeqId == null && other.salaryStepSeqId != null) || (this.salaryStepSeqId != null && !this.salaryStepSeqId.equals(other.salaryStepSeqId))) {
            return false;
        }
        if ((this.payGradeId == null && other.payGradeId != null) || (this.payGradeId != null && !this.payGradeId.equals(other.payGradeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.SalaryStepPK[ salaryStepSeqId=" + salaryStepSeqId + ", payGradeId=" + payGradeId + " ]";
    }
    
}
