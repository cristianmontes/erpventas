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
@Table(name = "sales_opportunity_competitor")
@NamedQueries({
    @NamedQuery(name = "SalesOpportunityCompetitor.findAll", query = "SELECT s FROM SalesOpportunityCompetitor s")})
public class SalesOpportunityCompetitor implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SalesOpportunityCompetitorPK salesOpportunityCompetitorPK;
    @Column(name = "POSITION_ENUM_ID")
    private String positionEnumId;
    @Lob
    @Column(name = "STRENGTHS")
    private String strengths;
    @Lob
    @Column(name = "WEAKNESSES")
    private String weaknesses;
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
    @JoinColumn(name = "SALES_OPPORTUNITY_ID", referencedColumnName = "SALES_OPPORTUNITY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private SalesOpportunity salesOpportunity;

    public SalesOpportunityCompetitor() {
    }

    public SalesOpportunityCompetitor(SalesOpportunityCompetitorPK salesOpportunityCompetitorPK) {
        this.salesOpportunityCompetitorPK = salesOpportunityCompetitorPK;
    }

    public SalesOpportunityCompetitor(String salesOpportunityId, String competitorPartyId) {
        this.salesOpportunityCompetitorPK = new SalesOpportunityCompetitorPK(salesOpportunityId, competitorPartyId);
    }

    public SalesOpportunityCompetitorPK getSalesOpportunityCompetitorPK() {
        return salesOpportunityCompetitorPK;
    }

    public void setSalesOpportunityCompetitorPK(SalesOpportunityCompetitorPK salesOpportunityCompetitorPK) {
        this.salesOpportunityCompetitorPK = salesOpportunityCompetitorPK;
    }

    public String getPositionEnumId() {
        return positionEnumId;
    }

    public void setPositionEnumId(String positionEnumId) {
        this.positionEnumId = positionEnumId;
    }

    public String getStrengths() {
        return strengths;
    }

    public void setStrengths(String strengths) {
        this.strengths = strengths;
    }

    public String getWeaknesses() {
        return weaknesses;
    }

    public void setWeaknesses(String weaknesses) {
        this.weaknesses = weaknesses;
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

    public SalesOpportunity getSalesOpportunity() {
        return salesOpportunity;
    }

    public void setSalesOpportunity(SalesOpportunity salesOpportunity) {
        this.salesOpportunity = salesOpportunity;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (salesOpportunityCompetitorPK != null ? salesOpportunityCompetitorPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SalesOpportunityCompetitor)) {
            return false;
        }
        SalesOpportunityCompetitor other = (SalesOpportunityCompetitor) object;
        if ((this.salesOpportunityCompetitorPK == null && other.salesOpportunityCompetitorPK != null) || (this.salesOpportunityCompetitorPK != null && !this.salesOpportunityCompetitorPK.equals(other.salesOpportunityCompetitorPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.SalesOpportunityCompetitor[ salesOpportunityCompetitorPK=" + salesOpportunityCompetitorPK + " ]";
    }
    
}
