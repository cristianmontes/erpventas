/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.quote.model;

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

import com.wildc.ucumari.client.modelo.WorkEffort;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "sales_opportunity_work_effort")
@NamedQueries({
    @NamedQuery(name = "SalesOpportunityWorkEffort.findAll", query = "SELECT s FROM SalesOpportunityWorkEffort s")})
public class SalesOpportunityWorkEffort implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SalesOpportunityWorkEffortPK salesOpportunityWorkEffortPK;
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
    @JoinColumn(name = "SALES_OPPORTUNITY_ID", referencedColumnName = "SALES_OPPORTUNITY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private SalesOpportunity salesOpportunity;

    public SalesOpportunityWorkEffort() {
    }

    public SalesOpportunityWorkEffort(SalesOpportunityWorkEffortPK salesOpportunityWorkEffortPK) {
        this.salesOpportunityWorkEffortPK = salesOpportunityWorkEffortPK;
    }

    public SalesOpportunityWorkEffort(String salesOpportunityId, String workEffortId) {
        this.salesOpportunityWorkEffortPK = new SalesOpportunityWorkEffortPK(salesOpportunityId, workEffortId);
    }

    public SalesOpportunityWorkEffortPK getSalesOpportunityWorkEffortPK() {
        return salesOpportunityWorkEffortPK;
    }

    public void setSalesOpportunityWorkEffortPK(SalesOpportunityWorkEffortPK salesOpportunityWorkEffortPK) {
        this.salesOpportunityWorkEffortPK = salesOpportunityWorkEffortPK;
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

    public SalesOpportunity getSalesOpportunity() {
        return salesOpportunity;
    }

    public void setSalesOpportunity(SalesOpportunity salesOpportunity) {
        this.salesOpportunity = salesOpportunity;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (salesOpportunityWorkEffortPK != null ? salesOpportunityWorkEffortPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SalesOpportunityWorkEffort)) {
            return false;
        }
        SalesOpportunityWorkEffort other = (SalesOpportunityWorkEffort) object;
        if ((this.salesOpportunityWorkEffortPK == null && other.salesOpportunityWorkEffortPK != null) || (this.salesOpportunityWorkEffortPK != null && !this.salesOpportunityWorkEffortPK.equals(other.salesOpportunityWorkEffortPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.SalesOpportunityWorkEffort[ salesOpportunityWorkEffortPK=" + salesOpportunityWorkEffortPK + " ]";
    }
    
}
