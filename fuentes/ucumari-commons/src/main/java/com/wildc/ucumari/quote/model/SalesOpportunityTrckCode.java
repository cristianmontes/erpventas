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

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "sales_opportunity_trck_code")
@NamedQueries({
    @NamedQuery(name = "SalesOpportunityTrckCode.findAll", query = "SELECT s FROM SalesOpportunityTrckCode s")})
public class SalesOpportunityTrckCode implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SalesOpportunityTrckCodePK salesOpportunityTrckCodePK;
    @Column(name = "RECEIVED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date receivedDate;
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

    public SalesOpportunityTrckCode() {
    }

    public SalesOpportunityTrckCode(SalesOpportunityTrckCodePK salesOpportunityTrckCodePK) {
        this.salesOpportunityTrckCodePK = salesOpportunityTrckCodePK;
    }

    public SalesOpportunityTrckCode(String salesOpportunityId, String trackingCodeId) {
        this.salesOpportunityTrckCodePK = new SalesOpportunityTrckCodePK(salesOpportunityId, trackingCodeId);
    }

    public SalesOpportunityTrckCodePK getSalesOpportunityTrckCodePK() {
        return salesOpportunityTrckCodePK;
    }

    public void setSalesOpportunityTrckCodePK(SalesOpportunityTrckCodePK salesOpportunityTrckCodePK) {
        this.salesOpportunityTrckCodePK = salesOpportunityTrckCodePK;
    }

    public Date getReceivedDate() {
        return receivedDate;
    }

    public void setReceivedDate(Date receivedDate) {
        this.receivedDate = receivedDate;
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
        hash += (salesOpportunityTrckCodePK != null ? salesOpportunityTrckCodePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SalesOpportunityTrckCode)) {
            return false;
        }
        SalesOpportunityTrckCode other = (SalesOpportunityTrckCode) object;
        if ((this.salesOpportunityTrckCodePK == null && other.salesOpportunityTrckCodePK != null) || (this.salesOpportunityTrckCodePK != null && !this.salesOpportunityTrckCodePK.equals(other.salesOpportunityTrckCodePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.SalesOpportunityTrckCode[ salesOpportunityTrckCodePK=" + salesOpportunityTrckCodePK + " ]";
    }
    
}
