/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "work_effort_search_result")
@NamedQueries({
    @NamedQuery(name = "WorkEffortSearchResult.findAll", query = "SELECT w FROM WorkEffortSearchResult w")})
public class WorkEffortSearchResult implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "WORK_EFFORT_SEARCH_RESULT_ID")
    private String workEffortSearchResultId;
    @Column(name = "ORDER_BY_NAME")
    private String orderByName;
    @Column(name = "IS_ASCENDING")
    private Character isAscending;
    @Column(name = "NUM_RESULTS")
    private BigInteger numResults;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SECONDS_TOTAL")
    private BigDecimal secondsTotal;
    @Column(name = "SEARCH_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date searchDate;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "workEffortSearchResult")
    private List<WorkEffortSearchConstraint> workEffortSearchConstraintList;
    @JoinColumn(name = "VISIT_ID", referencedColumnName = "VISIT_ID")
    @ManyToOne
    private Visit visitId;

    public WorkEffortSearchResult() {
    }

    public WorkEffortSearchResult(String workEffortSearchResultId) {
        this.workEffortSearchResultId = workEffortSearchResultId;
    }

    public String getWorkEffortSearchResultId() {
        return workEffortSearchResultId;
    }

    public void setWorkEffortSearchResultId(String workEffortSearchResultId) {
        this.workEffortSearchResultId = workEffortSearchResultId;
    }

    public String getOrderByName() {
        return orderByName;
    }

    public void setOrderByName(String orderByName) {
        this.orderByName = orderByName;
    }

    public Character getIsAscending() {
        return isAscending;
    }

    public void setIsAscending(Character isAscending) {
        this.isAscending = isAscending;
    }

    public BigInteger getNumResults() {
        return numResults;
    }

    public void setNumResults(BigInteger numResults) {
        this.numResults = numResults;
    }

    public BigDecimal getSecondsTotal() {
        return secondsTotal;
    }

    public void setSecondsTotal(BigDecimal secondsTotal) {
        this.secondsTotal = secondsTotal;
    }

    public Date getSearchDate() {
        return searchDate;
    }

    public void setSearchDate(Date searchDate) {
        this.searchDate = searchDate;
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

    public List<WorkEffortSearchConstraint> getWorkEffortSearchConstraintList() {
        return workEffortSearchConstraintList;
    }

    public void setWorkEffortSearchConstraintList(List<WorkEffortSearchConstraint> workEffortSearchConstraintList) {
        this.workEffortSearchConstraintList = workEffortSearchConstraintList;
    }

    public Visit getVisitId() {
        return visitId;
    }

    public void setVisitId(Visit visitId) {
        this.visitId = visitId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (workEffortSearchResultId != null ? workEffortSearchResultId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WorkEffortSearchResult)) {
            return false;
        }
        WorkEffortSearchResult other = (WorkEffortSearchResult) object;
        if ((this.workEffortSearchResultId == null && other.workEffortSearchResultId != null) || (this.workEffortSearchResultId != null && !this.workEffortSearchResultId.equals(other.workEffortSearchResultId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.WorkEffortSearchResult[ workEffortSearchResultId=" + workEffortSearchResultId + " ]";
    }
    
}
