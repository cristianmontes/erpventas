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
public class SalesOpportunityTrckCodePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "SALES_OPPORTUNITY_ID")
    private String salesOpportunityId;
    @Basic(optional = false)
    @Column(name = "TRACKING_CODE_ID")
    private String trackingCodeId;

    public SalesOpportunityTrckCodePK() {
    }

    public SalesOpportunityTrckCodePK(String salesOpportunityId, String trackingCodeId) {
        this.salesOpportunityId = salesOpportunityId;
        this.trackingCodeId = trackingCodeId;
    }

    public String getSalesOpportunityId() {
        return salesOpportunityId;
    }

    public void setSalesOpportunityId(String salesOpportunityId) {
        this.salesOpportunityId = salesOpportunityId;
    }

    public String getTrackingCodeId() {
        return trackingCodeId;
    }

    public void setTrackingCodeId(String trackingCodeId) {
        this.trackingCodeId = trackingCodeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (salesOpportunityId != null ? salesOpportunityId.hashCode() : 0);
        hash += (trackingCodeId != null ? trackingCodeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SalesOpportunityTrckCodePK)) {
            return false;
        }
        SalesOpportunityTrckCodePK other = (SalesOpportunityTrckCodePK) object;
        if ((this.salesOpportunityId == null && other.salesOpportunityId != null) || (this.salesOpportunityId != null && !this.salesOpportunityId.equals(other.salesOpportunityId))) {
            return false;
        }
        if ((this.trackingCodeId == null && other.trackingCodeId != null) || (this.trackingCodeId != null && !this.trackingCodeId.equals(other.trackingCodeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.SalesOpportunityTrckCodePK[ salesOpportunityId=" + salesOpportunityId + ", trackingCodeId=" + trackingCodeId + " ]";
    }
    
}
