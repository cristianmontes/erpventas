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

import com.wildc.ucumari.client.modelo.Content;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "sales_opportunity_content")
@NamedQueries({
    @NamedQuery(name = "SalesOpportunityContent.findAll", query = "SELECT s FROM SalesOpportunityContent s")})
public class SalesOpportunityContent implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SalesOpportunityContentPK salesOpportunityContentPK;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
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
    @JoinColumn(name = "CONTENT_ID", referencedColumnName = "CONTENT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Content content;

    public SalesOpportunityContent() {
    }

    public SalesOpportunityContent(SalesOpportunityContentPK salesOpportunityContentPK) {
        this.salesOpportunityContentPK = salesOpportunityContentPK;
    }

    public SalesOpportunityContent(String contentId, String salesOpportunityId, Date fromDate) {
        this.salesOpportunityContentPK = new SalesOpportunityContentPK(contentId, salesOpportunityId, fromDate);
    }

    public SalesOpportunityContentPK getSalesOpportunityContentPK() {
        return salesOpportunityContentPK;
    }

    public void setSalesOpportunityContentPK(SalesOpportunityContentPK salesOpportunityContentPK) {
        this.salesOpportunityContentPK = salesOpportunityContentPK;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
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

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (salesOpportunityContentPK != null ? salesOpportunityContentPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SalesOpportunityContent)) {
            return false;
        }
        SalesOpportunityContent other = (SalesOpportunityContent) object;
        if ((this.salesOpportunityContentPK == null && other.salesOpportunityContentPK != null) || (this.salesOpportunityContentPK != null && !this.salesOpportunityContentPK.equals(other.salesOpportunityContentPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.SalesOpportunityContent[ salesOpportunityContentPK=" + salesOpportunityContentPK + " ]";
    }
    
}
