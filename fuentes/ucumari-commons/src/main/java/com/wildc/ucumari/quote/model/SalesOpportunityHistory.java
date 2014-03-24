/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.quote.model;

import com.wildc.ucumari.parameters.model.Uom;
import com.wildc.ucumari.security.model.UserLogin;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
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
@Table(name = "sales_opportunity_history")
@NamedQueries({
    @NamedQuery(name = "SalesOpportunityHistory.findAll", query = "SELECT s FROM SalesOpportunityHistory s")})
public class SalesOpportunityHistory implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SALES_OPPORTUNITY_HISTORY_ID")
    private String salesOpportunityHistoryId;
    @Lob
    @Column(name = "DESCRIPTION")
    private String description;
    @Lob
    @Column(name = "NEXT_STEP")
    private String nextStep;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ESTIMATED_AMOUNT")
    private BigDecimal estimatedAmount;
    @Column(name = "ESTIMATED_PROBABILITY")
    private BigDecimal estimatedProbability;
    @Column(name = "ESTIMATED_CLOSE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date estimatedCloseDate;
    @Lob
    @Column(name = "CHANGE_NOTE")
    private String changeNote;
    @Column(name = "MODIFIED_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedTimestamp;
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
    @JoinColumn(name = "MODIFIED_BY_USER_LOGIN", referencedColumnName = "USER_LOGIN_ID")
    @ManyToOne
    private UserLogin modifiedByUserLogin;
    @JoinColumn(name = "OPPORTUNITY_STAGE_ID", referencedColumnName = "OPPORTUNITY_STAGE_ID")
    @ManyToOne
    private SalesOpportunityStage opportunityStageId;
    @JoinColumn(name = "SALES_OPPORTUNITY_ID", referencedColumnName = "SALES_OPPORTUNITY_ID")
    @ManyToOne
    private SalesOpportunity salesOpportunityId;
    @JoinColumn(name = "CURRENCY_UOM_ID", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom currencyUomId;

    public SalesOpportunityHistory() {
    }

    public SalesOpportunityHistory(String salesOpportunityHistoryId) {
        this.salesOpportunityHistoryId = salesOpportunityHistoryId;
    }

    public String getSalesOpportunityHistoryId() {
        return salesOpportunityHistoryId;
    }

    public void setSalesOpportunityHistoryId(String salesOpportunityHistoryId) {
        this.salesOpportunityHistoryId = salesOpportunityHistoryId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNextStep() {
        return nextStep;
    }

    public void setNextStep(String nextStep) {
        this.nextStep = nextStep;
    }

    public BigDecimal getEstimatedAmount() {
        return estimatedAmount;
    }

    public void setEstimatedAmount(BigDecimal estimatedAmount) {
        this.estimatedAmount = estimatedAmount;
    }

    public BigDecimal getEstimatedProbability() {
        return estimatedProbability;
    }

    public void setEstimatedProbability(BigDecimal estimatedProbability) {
        this.estimatedProbability = estimatedProbability;
    }

    public Date getEstimatedCloseDate() {
        return estimatedCloseDate;
    }

    public void setEstimatedCloseDate(Date estimatedCloseDate) {
        this.estimatedCloseDate = estimatedCloseDate;
    }

    public String getChangeNote() {
        return changeNote;
    }

    public void setChangeNote(String changeNote) {
        this.changeNote = changeNote;
    }

    public Date getModifiedTimestamp() {
        return modifiedTimestamp;
    }

    public void setModifiedTimestamp(Date modifiedTimestamp) {
        this.modifiedTimestamp = modifiedTimestamp;
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

    public UserLogin getModifiedByUserLogin() {
        return modifiedByUserLogin;
    }

    public void setModifiedByUserLogin(UserLogin modifiedByUserLogin) {
        this.modifiedByUserLogin = modifiedByUserLogin;
    }

    public SalesOpportunityStage getOpportunityStageId() {
        return opportunityStageId;
    }

    public void setOpportunityStageId(SalesOpportunityStage opportunityStageId) {
        this.opportunityStageId = opportunityStageId;
    }

    public SalesOpportunity getSalesOpportunityId() {
        return salesOpportunityId;
    }

    public void setSalesOpportunityId(SalesOpportunity salesOpportunityId) {
        this.salesOpportunityId = salesOpportunityId;
    }

    public Uom getCurrencyUomId() {
        return currencyUomId;
    }

    public void setCurrencyUomId(Uom currencyUomId) {
        this.currencyUomId = currencyUomId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (salesOpportunityHistoryId != null ? salesOpportunityHistoryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SalesOpportunityHistory)) {
            return false;
        }
        SalesOpportunityHistory other = (SalesOpportunityHistory) object;
        if ((this.salesOpportunityHistoryId == null && other.salesOpportunityHistoryId != null) || (this.salesOpportunityHistoryId != null && !this.salesOpportunityHistoryId.equals(other.salesOpportunityHistoryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.SalesOpportunityHistory[ salesOpportunityHistoryId=" + salesOpportunityHistoryId + " ]";
    }
    
}
