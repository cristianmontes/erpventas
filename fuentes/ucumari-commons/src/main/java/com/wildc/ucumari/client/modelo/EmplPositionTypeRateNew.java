/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
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
@Table(name = "empl_position_type_rate_new")
@NamedQueries({
    @NamedQuery(name = "EmplPositionTypeRateNew.findAll", query = "SELECT e FROM EmplPositionTypeRateNew e")})
public class EmplPositionTypeRateNew implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EmplPositionTypeRateNewPK emplPositionTypeRateNewPK;
    @Column(name = "PAY_GRADE_ID")
    private String payGradeId;
    @Column(name = "SALARY_STEP_SEQ_ID")
    private String salaryStepSeqId;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
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
    @JoinColumn(name = "EMPL_POSITION_TYPE_ID", referencedColumnName = "EMPL_POSITION_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private EmplPositionType emplPositionType;

    public EmplPositionTypeRateNew() {
    }

    public EmplPositionTypeRateNew(EmplPositionTypeRateNewPK emplPositionTypeRateNewPK) {
        this.emplPositionTypeRateNewPK = emplPositionTypeRateNewPK;
    }

    public EmplPositionTypeRateNew(String emplPositionTypeId, String rateTypeId, Date fromDate) {
        this.emplPositionTypeRateNewPK = new EmplPositionTypeRateNewPK(emplPositionTypeId, rateTypeId, fromDate);
    }

    public EmplPositionTypeRateNewPK getEmplPositionTypeRateNewPK() {
        return emplPositionTypeRateNewPK;
    }

    public void setEmplPositionTypeRateNewPK(EmplPositionTypeRateNewPK emplPositionTypeRateNewPK) {
        this.emplPositionTypeRateNewPK = emplPositionTypeRateNewPK;
    }

    public String getPayGradeId() {
        return payGradeId;
    }

    public void setPayGradeId(String payGradeId) {
        this.payGradeId = payGradeId;
    }

    public String getSalaryStepSeqId() {
        return salaryStepSeqId;
    }

    public void setSalaryStepSeqId(String salaryStepSeqId) {
        this.salaryStepSeqId = salaryStepSeqId;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
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

    public EmplPositionType getEmplPositionType() {
        return emplPositionType;
    }

    public void setEmplPositionType(EmplPositionType emplPositionType) {
        this.emplPositionType = emplPositionType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (emplPositionTypeRateNewPK != null ? emplPositionTypeRateNewPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmplPositionTypeRateNew)) {
            return false;
        }
        EmplPositionTypeRateNew other = (EmplPositionTypeRateNew) object;
        if ((this.emplPositionTypeRateNewPK == null && other.emplPositionTypeRateNewPK != null) || (this.emplPositionTypeRateNewPK != null && !this.emplPositionTypeRateNewPK.equals(other.emplPositionTypeRateNewPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.EmplPositionTypeRateNew[ emplPositionTypeRateNewPK=" + emplPositionTypeRateNewPK + " ]";
    }
    
}
