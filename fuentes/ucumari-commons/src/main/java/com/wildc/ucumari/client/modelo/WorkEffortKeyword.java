/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "work_effort_keyword")
@NamedQueries({
    @NamedQuery(name = "WorkEffortKeyword.findAll", query = "SELECT w FROM WorkEffortKeyword w")})
public class WorkEffortKeyword implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected WorkEffortKeywordPK workEffortKeywordPK;
    @Column(name = "RELEVANCY_WEIGHT")
    private BigInteger relevancyWeight;
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
    @JoinColumn(name = "WORK_EFFORT_ID", referencedColumnName = "WORK_EFFORT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private WorkEffort workEffort;

    public WorkEffortKeyword() {
    }

    public WorkEffortKeyword(WorkEffortKeywordPK workEffortKeywordPK) {
        this.workEffortKeywordPK = workEffortKeywordPK;
    }

    public WorkEffortKeyword(String workEffortId, String keyword) {
        this.workEffortKeywordPK = new WorkEffortKeywordPK(workEffortId, keyword);
    }

    public WorkEffortKeywordPK getWorkEffortKeywordPK() {
        return workEffortKeywordPK;
    }

    public void setWorkEffortKeywordPK(WorkEffortKeywordPK workEffortKeywordPK) {
        this.workEffortKeywordPK = workEffortKeywordPK;
    }

    public BigInteger getRelevancyWeight() {
        return relevancyWeight;
    }

    public void setRelevancyWeight(BigInteger relevancyWeight) {
        this.relevancyWeight = relevancyWeight;
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

    public WorkEffort getWorkEffort() {
        return workEffort;
    }

    public void setWorkEffort(WorkEffort workEffort) {
        this.workEffort = workEffort;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (workEffortKeywordPK != null ? workEffortKeywordPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WorkEffortKeyword)) {
            return false;
        }
        WorkEffortKeyword other = (WorkEffortKeyword) object;
        if ((this.workEffortKeywordPK == null && other.workEffortKeywordPK != null) || (this.workEffortKeywordPK != null && !this.workEffortKeywordPK.equals(other.workEffortKeywordPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.WorkEffortKeyword[ workEffortKeywordPK=" + workEffortKeywordPK + " ]";
    }
    
}
