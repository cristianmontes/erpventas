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
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "work_effort_assoc")
@NamedQueries({
    @NamedQuery(name = "WorkEffortAssoc.findAll", query = "SELECT w FROM WorkEffortAssoc w")})
public class WorkEffortAssoc implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected WorkEffortAssocPK workEffortAssocPK;
    @Column(name = "SEQUENCE_NUM")
    private BigInteger sequenceNum;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "workEffortAssoc")
    private List<WorkEffortAssocAttribute> workEffortAssocAttributeList;
    @JoinColumn(name = "WORK_EFFORT_ASSOC_TYPE_ID", referencedColumnName = "WORK_EFFORT_ASSOC_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private WorkEffortAssocType workEffortAssocType;
    @JoinColumn(name = "WORK_EFFORT_ID_TO", referencedColumnName = "WORK_EFFORT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private WorkEffort workEffort;
    @JoinColumn(name = "WORK_EFFORT_ID_FROM", referencedColumnName = "WORK_EFFORT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private WorkEffort workEffort1;

    public WorkEffortAssoc() {
    }

    public WorkEffortAssoc(WorkEffortAssocPK workEffortAssocPK) {
        this.workEffortAssocPK = workEffortAssocPK;
    }

    public WorkEffortAssoc(String workEffortIdFrom, String workEffortIdTo, String workEffortAssocTypeId, Date fromDate) {
        this.workEffortAssocPK = new WorkEffortAssocPK(workEffortIdFrom, workEffortIdTo, workEffortAssocTypeId, fromDate);
    }

    public WorkEffortAssocPK getWorkEffortAssocPK() {
        return workEffortAssocPK;
    }

    public void setWorkEffortAssocPK(WorkEffortAssocPK workEffortAssocPK) {
        this.workEffortAssocPK = workEffortAssocPK;
    }

    public BigInteger getSequenceNum() {
        return sequenceNum;
    }

    public void setSequenceNum(BigInteger sequenceNum) {
        this.sequenceNum = sequenceNum;
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

    public List<WorkEffortAssocAttribute> getWorkEffortAssocAttributeList() {
        return workEffortAssocAttributeList;
    }

    public void setWorkEffortAssocAttributeList(List<WorkEffortAssocAttribute> workEffortAssocAttributeList) {
        this.workEffortAssocAttributeList = workEffortAssocAttributeList;
    }

    public WorkEffortAssocType getWorkEffortAssocType() {
        return workEffortAssocType;
    }

    public void setWorkEffortAssocType(WorkEffortAssocType workEffortAssocType) {
        this.workEffortAssocType = workEffortAssocType;
    }

    public WorkEffort getWorkEffort() {
        return workEffort;
    }

    public void setWorkEffort(WorkEffort workEffort) {
        this.workEffort = workEffort;
    }

    public WorkEffort getWorkEffort1() {
        return workEffort1;
    }

    public void setWorkEffort1(WorkEffort workEffort1) {
        this.workEffort1 = workEffort1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (workEffortAssocPK != null ? workEffortAssocPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WorkEffortAssoc)) {
            return false;
        }
        WorkEffortAssoc other = (WorkEffortAssoc) object;
        if ((this.workEffortAssocPK == null && other.workEffortAssocPK != null) || (this.workEffortAssocPK != null && !this.workEffortAssocPK.equals(other.workEffortAssocPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.WorkEffortAssoc[ workEffortAssocPK=" + workEffortAssocPK + " ]";
    }
    
}
