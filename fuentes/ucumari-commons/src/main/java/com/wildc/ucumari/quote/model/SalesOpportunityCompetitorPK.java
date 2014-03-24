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
public class SalesOpportunityCompetitorPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "SALES_OPPORTUNITY_ID")
    private String salesOpportunityId;
    @Basic(optional = false)
    @Column(name = "COMPETITOR_PARTY_ID")
    private String competitorPartyId;

    public SalesOpportunityCompetitorPK() {
    }

    public SalesOpportunityCompetitorPK(String salesOpportunityId, String competitorPartyId) {
        this.salesOpportunityId = salesOpportunityId;
        this.competitorPartyId = competitorPartyId;
    }

    public String getSalesOpportunityId() {
        return salesOpportunityId;
    }

    public void setSalesOpportunityId(String salesOpportunityId) {
        this.salesOpportunityId = salesOpportunityId;
    }

    public String getCompetitorPartyId() {
        return competitorPartyId;
    }

    public void setCompetitorPartyId(String competitorPartyId) {
        this.competitorPartyId = competitorPartyId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (salesOpportunityId != null ? salesOpportunityId.hashCode() : 0);
        hash += (competitorPartyId != null ? competitorPartyId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SalesOpportunityCompetitorPK)) {
            return false;
        }
        SalesOpportunityCompetitorPK other = (SalesOpportunityCompetitorPK) object;
        if ((this.salesOpportunityId == null && other.salesOpportunityId != null) || (this.salesOpportunityId != null && !this.salesOpportunityId.equals(other.salesOpportunityId))) {
            return false;
        }
        if ((this.competitorPartyId == null && other.competitorPartyId != null) || (this.competitorPartyId != null && !this.competitorPartyId.equals(other.competitorPartyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.SalesOpportunityCompetitorPK[ salesOpportunityId=" + salesOpportunityId + ", competitorPartyId=" + competitorPartyId + " ]";
    }
    
}
