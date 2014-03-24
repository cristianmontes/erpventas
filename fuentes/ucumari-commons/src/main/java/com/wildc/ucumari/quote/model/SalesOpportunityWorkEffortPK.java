/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.quote.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class SalesOpportunityWorkEffortPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "SALES_OPPORTUNITY_ID")
    private String salesOpportunityId;
    @Basic(optional = false)
    @Column(name = "WORK_EFFORT_ID")
    private String workEffortId;

    public SalesOpportunityWorkEffortPK() {
    }

    public SalesOpportunityWorkEffortPK(String salesOpportunityId, String workEffortId) {
        this.salesOpportunityId = salesOpportunityId;
        this.workEffortId = workEffortId;
    }

    public String getSalesOpportunityId() {
        return salesOpportunityId;
    }

    public void setSalesOpportunityId(String salesOpportunityId) {
        this.salesOpportunityId = salesOpportunityId;
    }

    public String getWorkEffortId() {
        return workEffortId;
    }

    public void setWorkEffortId(String workEffortId) {
        this.workEffortId = workEffortId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (salesOpportunityId != null ? salesOpportunityId.hashCode() : 0);
        hash += (workEffortId != null ? workEffortId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SalesOpportunityWorkEffortPK)) {
            return false;
        }
        SalesOpportunityWorkEffortPK other = (SalesOpportunityWorkEffortPK) object;
        if ((this.salesOpportunityId == null && other.salesOpportunityId != null) || (this.salesOpportunityId != null && !this.salesOpportunityId.equals(other.salesOpportunityId))) {
            return false;
        }
        if ((this.workEffortId == null && other.workEffortId != null) || (this.workEffortId != null && !this.workEffortId.equals(other.workEffortId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.SalesOpportunityWorkEffortPK[ salesOpportunityId=" + salesOpportunityId + ", workEffortId=" + workEffortId + " ]";
    }
    
}
