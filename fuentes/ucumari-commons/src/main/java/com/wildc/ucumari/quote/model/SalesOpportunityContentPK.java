/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.quote.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Embeddable
public class SalesOpportunityContentPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CONTENT_ID")
    private String contentId;
    @Basic(optional = false)
    @Column(name = "SALES_OPPORTUNITY_ID")
    private String salesOpportunityId;
    @Basic(optional = false)
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;

    public SalesOpportunityContentPK() {
    }

    public SalesOpportunityContentPK(String contentId, String salesOpportunityId, Date fromDate) {
        this.contentId = contentId;
        this.salesOpportunityId = salesOpportunityId;
        this.fromDate = fromDate;
    }

    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public String getSalesOpportunityId() {
        return salesOpportunityId;
    }

    public void setSalesOpportunityId(String salesOpportunityId) {
        this.salesOpportunityId = salesOpportunityId;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (contentId != null ? contentId.hashCode() : 0);
        hash += (salesOpportunityId != null ? salesOpportunityId.hashCode() : 0);
        hash += (fromDate != null ? fromDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SalesOpportunityContentPK)) {
            return false;
        }
        SalesOpportunityContentPK other = (SalesOpportunityContentPK) object;
        if ((this.contentId == null && other.contentId != null) || (this.contentId != null && !this.contentId.equals(other.contentId))) {
            return false;
        }
        if ((this.salesOpportunityId == null && other.salesOpportunityId != null) || (this.salesOpportunityId != null && !this.salesOpportunityId.equals(other.salesOpportunityId))) {
            return false;
        }
        if ((this.fromDate == null && other.fromDate != null) || (this.fromDate != null && !this.fromDate.equals(other.fromDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.SalesOpportunityContentPK[ contentId=" + contentId + ", salesOpportunityId=" + salesOpportunityId + ", fromDate=" + fromDate + " ]";
    }
    
}
