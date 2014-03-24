/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.math.BigInteger;
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

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "temporal_expression")
@NamedQueries({
    @NamedQuery(name = "TemporalExpression.findAll", query = "SELECT t FROM TemporalExpression t")})
public class TemporalExpression implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "temporalExpression")
    private List<TemporalExpressionAssoc> temporalExpressionAssocList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "temporalExpression1")
    private List<TemporalExpressionAssoc> temporalExpressionAssocList1;
    @OneToMany(mappedBy = "tempExprId")
    private List<JobSandbox> jobSandboxList;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TEMP_EXPR_ID")
    private String tempExprId;
    @Column(name = "TEMP_EXPR_TYPE_ID")
    private String tempExprTypeId;
    @Column(name = "DATE1")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date1;
    @Column(name = "DATE2")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date2;
    @Column(name = "INTEGER1")
    private BigInteger integer1;
    @Column(name = "INTEGER2")
    private BigInteger integer2;
    @Column(name = "STRING1")
    private String string1;
    @Column(name = "STRING2")
    private String string2;
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
    @OneToMany(mappedBy = "tempExprId")
    private List<WorkEffort> workEffortList;

    public TemporalExpression() {
    }

    public TemporalExpression(String tempExprId) {
        this.tempExprId = tempExprId;
    }

    public String getTempExprId() {
        return tempExprId;
    }

    public void setTempExprId(String tempExprId) {
        this.tempExprId = tempExprId;
    }

    public String getTempExprTypeId() {
        return tempExprTypeId;
    }

    public void setTempExprTypeId(String tempExprTypeId) {
        this.tempExprTypeId = tempExprTypeId;
    }

    public Date getDate1() {
        return date1;
    }

    public void setDate1(Date date1) {
        this.date1 = date1;
    }

    public Date getDate2() {
        return date2;
    }

    public void setDate2(Date date2) {
        this.date2 = date2;
    }

    public BigInteger getInteger1() {
        return integer1;
    }

    public void setInteger1(BigInteger integer1) {
        this.integer1 = integer1;
    }

    public BigInteger getInteger2() {
        return integer2;
    }

    public void setInteger2(BigInteger integer2) {
        this.integer2 = integer2;
    }

    public String getString1() {
        return string1;
    }

    public void setString1(String string1) {
        this.string1 = string1;
    }

    public String getString2() {
        return string2;
    }

    public void setString2(String string2) {
        this.string2 = string2;
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

    public List<WorkEffort> getWorkEffortList() {
        return workEffortList;
    }

    public void setWorkEffortList(List<WorkEffort> workEffortList) {
        this.workEffortList = workEffortList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tempExprId != null ? tempExprId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TemporalExpression)) {
            return false;
        }
        TemporalExpression other = (TemporalExpression) object;
        if ((this.tempExprId == null && other.tempExprId != null) || (this.tempExprId != null && !this.tempExprId.equals(other.tempExprId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.TemporalExpression[ tempExprId=" + tempExprId + " ]";
    }

    public List<JobSandbox> getJobSandboxList() {
        return jobSandboxList;
    }

    public void setJobSandboxList(List<JobSandbox> jobSandboxList) {
        this.jobSandboxList = jobSandboxList;
    }

    public List<TemporalExpressionAssoc> getTemporalExpressionAssocList() {
        return temporalExpressionAssocList;
    }

    public void setTemporalExpressionAssocList(List<TemporalExpressionAssoc> temporalExpressionAssocList) {
        this.temporalExpressionAssocList = temporalExpressionAssocList;
    }

    public List<TemporalExpressionAssoc> getTemporalExpressionAssocList1() {
        return temporalExpressionAssocList1;
    }

    public void setTemporalExpressionAssocList1(List<TemporalExpressionAssoc> temporalExpressionAssocList1) {
        this.temporalExpressionAssocList1 = temporalExpressionAssocList1;
    }
    
}
