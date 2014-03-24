/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.quote.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "sales_opportunity_stage")
public class SalesOpportunityStage implements Serializable {
    /*@OneToMany(mappedBy = "opportunityStageId")
    private List<SalesOpportunityHistory> salesOpportunityHistoryList;*/
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "OPPORTUNITY_STAGE_ID")
    private String opportunityStageId;
    @Column(name = "DESCRIPTION")
    private String description;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "DEFAULT_PROBABILITY")
    private BigDecimal defaultProbability;
    @Column(name = "SEQUENCE_NUM")
    private BigInteger sequenceNum;
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
    /*@OneToMany(mappedBy = "opportunityStageId")
    private List<SalesOpportunity> salesOpportunityList;*/

    public SalesOpportunityStage() {
    }

    public SalesOpportunityStage(String opportunityStageId) {
        this.opportunityStageId = opportunityStageId;
    }

    public String getOpportunityStageId() {
        return opportunityStageId;
    }

    public void setOpportunityStageId(String opportunityStageId) {
        this.opportunityStageId = opportunityStageId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getDefaultProbability() {
        return defaultProbability;
    }

    public void setDefaultProbability(BigDecimal defaultProbability) {
        this.defaultProbability = defaultProbability;
    }

    public BigInteger getSequenceNum() {
        return sequenceNum;
    }

    public void setSequenceNum(BigInteger sequenceNum) {
        this.sequenceNum = sequenceNum;
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
/*
    public List<SalesOpportunity> getSalesOpportunityList() {
        return salesOpportunityList;
    }

    public void setSalesOpportunityList(List<SalesOpportunity> salesOpportunityList) {
        this.salesOpportunityList = salesOpportunityList;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (opportunityStageId != null ? opportunityStageId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SalesOpportunityStage)) {
            return false;
        }
        SalesOpportunityStage other = (SalesOpportunityStage) object;
        if ((this.opportunityStageId == null && other.opportunityStageId != null) || (this.opportunityStageId != null && !this.opportunityStageId.equals(other.opportunityStageId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.SalesOpportunityStage[ opportunityStageId=" + opportunityStageId + " ]";
    }
/*
    public List<SalesOpportunityHistory> getSalesOpportunityHistoryList() {
        return salesOpportunityHistoryList;
    }

    public void setSalesOpportunityHistoryList(List<SalesOpportunityHistory> salesOpportunityHistoryList) {
        this.salesOpportunityHistoryList = salesOpportunityHistoryList;
    }*/
    
}
