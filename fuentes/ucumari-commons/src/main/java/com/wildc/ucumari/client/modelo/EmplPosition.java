/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import com.wildc.ucumari.parameters.model.StatusItem;
import com.wildc.ucumari.party.model.Party;
import java.io.Serializable;
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
@Table(name = "empl_position")
@NamedQueries({
    @NamedQuery(name = "EmplPosition.findAll", query = "SELECT e FROM EmplPosition e")})
public class EmplPosition implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "EMPL_POSITION_ID")
    private String emplPositionId;
    @Column(name = "BUDGET_ID")
    private String budgetId;
    @Column(name = "BUDGET_ITEM_SEQ_ID")
    private String budgetItemSeqId;
    @Column(name = "EMPL_POSITION_TYPE_ID")
    private String emplPositionTypeId;
    @Column(name = "ESTIMATED_FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date estimatedFromDate;
    @Column(name = "ESTIMATED_THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date estimatedThruDate;
    @Column(name = "SALARY_FLAG")
    private Character salaryFlag;
    @Column(name = "EXEMPT_FLAG")
    private Character exemptFlag;
    @Column(name = "FULLTIME_FLAG")
    private Character fulltimeFlag;
    @Column(name = "TEMPORARY_FLAG")
    private Character temporaryFlag;
    @Column(name = "ACTUAL_FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date actualFromDate;
    @Column(name = "ACTUAL_THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date actualThruDate;
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
    @JoinColumn(name = "STATUS_ID", referencedColumnName = "STATUS_ID")
    @ManyToOne
    private StatusItem statusId;
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party partyId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "emplPosition")
    private List<EmplPositionResponsibility> emplPositionResponsibilityList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "emplPosition")
    private List<EmplPositionFulfillment> emplPositionFulfillmentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "emplPosition")
    private List<EmplPositionReportingStruct> emplPositionReportingStructList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "emplPosition1")
    private List<EmplPositionReportingStruct> emplPositionReportingStructList1;

    public EmplPosition() {
    }

    public EmplPosition(String emplPositionId) {
        this.emplPositionId = emplPositionId;
    }

    public String getEmplPositionId() {
        return emplPositionId;
    }

    public void setEmplPositionId(String emplPositionId) {
        this.emplPositionId = emplPositionId;
    }

    public String getBudgetId() {
        return budgetId;
    }

    public void setBudgetId(String budgetId) {
        this.budgetId = budgetId;
    }

    public String getBudgetItemSeqId() {
        return budgetItemSeqId;
    }

    public void setBudgetItemSeqId(String budgetItemSeqId) {
        this.budgetItemSeqId = budgetItemSeqId;
    }

    public String getEmplPositionTypeId() {
        return emplPositionTypeId;
    }

    public void setEmplPositionTypeId(String emplPositionTypeId) {
        this.emplPositionTypeId = emplPositionTypeId;
    }

    public Date getEstimatedFromDate() {
        return estimatedFromDate;
    }

    public void setEstimatedFromDate(Date estimatedFromDate) {
        this.estimatedFromDate = estimatedFromDate;
    }

    public Date getEstimatedThruDate() {
        return estimatedThruDate;
    }

    public void setEstimatedThruDate(Date estimatedThruDate) {
        this.estimatedThruDate = estimatedThruDate;
    }

    public Character getSalaryFlag() {
        return salaryFlag;
    }

    public void setSalaryFlag(Character salaryFlag) {
        this.salaryFlag = salaryFlag;
    }

    public Character getExemptFlag() {
        return exemptFlag;
    }

    public void setExemptFlag(Character exemptFlag) {
        this.exemptFlag = exemptFlag;
    }

    public Character getFulltimeFlag() {
        return fulltimeFlag;
    }

    public void setFulltimeFlag(Character fulltimeFlag) {
        this.fulltimeFlag = fulltimeFlag;
    }

    public Character getTemporaryFlag() {
        return temporaryFlag;
    }

    public void setTemporaryFlag(Character temporaryFlag) {
        this.temporaryFlag = temporaryFlag;
    }

    public Date getActualFromDate() {
        return actualFromDate;
    }

    public void setActualFromDate(Date actualFromDate) {
        this.actualFromDate = actualFromDate;
    }

    public Date getActualThruDate() {
        return actualThruDate;
    }

    public void setActualThruDate(Date actualThruDate) {
        this.actualThruDate = actualThruDate;
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

    public StatusItem getStatusId() {
        return statusId;
    }

    public void setStatusId(StatusItem statusId) {
        this.statusId = statusId;
    }

    public Party getPartyId() {
        return partyId;
    }

    public void setPartyId(Party partyId) {
        this.partyId = partyId;
    }

    public List<EmplPositionResponsibility> getEmplPositionResponsibilityList() {
        return emplPositionResponsibilityList;
    }

    public void setEmplPositionResponsibilityList(List<EmplPositionResponsibility> emplPositionResponsibilityList) {
        this.emplPositionResponsibilityList = emplPositionResponsibilityList;
    }

    public List<EmplPositionFulfillment> getEmplPositionFulfillmentList() {
        return emplPositionFulfillmentList;
    }

    public void setEmplPositionFulfillmentList(List<EmplPositionFulfillment> emplPositionFulfillmentList) {
        this.emplPositionFulfillmentList = emplPositionFulfillmentList;
    }

    public List<EmplPositionReportingStruct> getEmplPositionReportingStructList() {
        return emplPositionReportingStructList;
    }

    public void setEmplPositionReportingStructList(List<EmplPositionReportingStruct> emplPositionReportingStructList) {
        this.emplPositionReportingStructList = emplPositionReportingStructList;
    }

    public List<EmplPositionReportingStruct> getEmplPositionReportingStructList1() {
        return emplPositionReportingStructList1;
    }

    public void setEmplPositionReportingStructList1(List<EmplPositionReportingStruct> emplPositionReportingStructList1) {
        this.emplPositionReportingStructList1 = emplPositionReportingStructList1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (emplPositionId != null ? emplPositionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmplPosition)) {
            return false;
        }
        EmplPosition other = (EmplPosition) object;
        if ((this.emplPositionId == null && other.emplPositionId != null) || (this.emplPositionId != null && !this.emplPositionId.equals(other.emplPositionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.EmplPosition[ emplPositionId=" + emplPositionId + " ]";
    }
    
}
