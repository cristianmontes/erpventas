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
@Table(name = "work_effort_search_constraint")
@NamedQueries({
    @NamedQuery(name = "WorkEffortSearchConstraint.findAll", query = "SELECT w FROM WorkEffortSearchConstraint w")})
public class WorkEffortSearchConstraint implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected WorkEffortSearchConstraintPK workEffortSearchConstraintPK;
    @Column(name = "CONSTRAINT_NAME")
    private String constraintName;
    @Column(name = "INFO_STRING")
    private String infoString;
    @Column(name = "INCLUDE_SUB_WORK_EFFORTS")
    private Character includeSubWorkEfforts;
    @Column(name = "IS_AND")
    private Character isAnd;
    @Column(name = "ANY_PREFIX")
    private Character anyPrefix;
    @Column(name = "ANY_SUFFIX")
    private Character anySuffix;
    @Column(name = "REMOVE_STEMS")
    private Character removeStems;
    @Column(name = "LOW_VALUE")
    private String lowValue;
    @Column(name = "HIGH_VALUE")
    private String highValue;
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
    @JoinColumn(name = "WORK_EFFORT_SEARCH_RESULT_ID", referencedColumnName = "WORK_EFFORT_SEARCH_RESULT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private WorkEffortSearchResult workEffortSearchResult;

    public WorkEffortSearchConstraint() {
    }

    public WorkEffortSearchConstraint(WorkEffortSearchConstraintPK workEffortSearchConstraintPK) {
        this.workEffortSearchConstraintPK = workEffortSearchConstraintPK;
    }

    public WorkEffortSearchConstraint(String workEffortSearchResultId, String constraintSeqId) {
        this.workEffortSearchConstraintPK = new WorkEffortSearchConstraintPK(workEffortSearchResultId, constraintSeqId);
    }

    public WorkEffortSearchConstraintPK getWorkEffortSearchConstraintPK() {
        return workEffortSearchConstraintPK;
    }

    public void setWorkEffortSearchConstraintPK(WorkEffortSearchConstraintPK workEffortSearchConstraintPK) {
        this.workEffortSearchConstraintPK = workEffortSearchConstraintPK;
    }

    public String getConstraintName() {
        return constraintName;
    }

    public void setConstraintName(String constraintName) {
        this.constraintName = constraintName;
    }

    public String getInfoString() {
        return infoString;
    }

    public void setInfoString(String infoString) {
        this.infoString = infoString;
    }

    public Character getIncludeSubWorkEfforts() {
        return includeSubWorkEfforts;
    }

    public void setIncludeSubWorkEfforts(Character includeSubWorkEfforts) {
        this.includeSubWorkEfforts = includeSubWorkEfforts;
    }

    public Character getIsAnd() {
        return isAnd;
    }

    public void setIsAnd(Character isAnd) {
        this.isAnd = isAnd;
    }

    public Character getAnyPrefix() {
        return anyPrefix;
    }

    public void setAnyPrefix(Character anyPrefix) {
        this.anyPrefix = anyPrefix;
    }

    public Character getAnySuffix() {
        return anySuffix;
    }

    public void setAnySuffix(Character anySuffix) {
        this.anySuffix = anySuffix;
    }

    public Character getRemoveStems() {
        return removeStems;
    }

    public void setRemoveStems(Character removeStems) {
        this.removeStems = removeStems;
    }

    public String getLowValue() {
        return lowValue;
    }

    public void setLowValue(String lowValue) {
        this.lowValue = lowValue;
    }

    public String getHighValue() {
        return highValue;
    }

    public void setHighValue(String highValue) {
        this.highValue = highValue;
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

    public WorkEffortSearchResult getWorkEffortSearchResult() {
        return workEffortSearchResult;
    }

    public void setWorkEffortSearchResult(WorkEffortSearchResult workEffortSearchResult) {
        this.workEffortSearchResult = workEffortSearchResult;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (workEffortSearchConstraintPK != null ? workEffortSearchConstraintPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WorkEffortSearchConstraint)) {
            return false;
        }
        WorkEffortSearchConstraint other = (WorkEffortSearchConstraint) object;
        if ((this.workEffortSearchConstraintPK == null && other.workEffortSearchConstraintPK != null) || (this.workEffortSearchConstraintPK != null && !this.workEffortSearchConstraintPK.equals(other.workEffortSearchConstraintPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.WorkEffortSearchConstraint[ workEffortSearchConstraintPK=" + workEffortSearchConstraintPK + " ]";
    }
    
}
