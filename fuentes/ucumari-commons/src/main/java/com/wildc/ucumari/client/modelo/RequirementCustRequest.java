/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.custrequest.model.CustRequestItem;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "requirement_cust_request")
@NamedQueries({
    @NamedQuery(name = "RequirementCustRequest.findAll", query = "SELECT r FROM RequirementCustRequest r")})
public class RequirementCustRequest implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RequirementCustRequestPK requirementCustRequestPK;
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
    @JoinColumn(name = "REQUIREMENT_ID", referencedColumnName = "REQUIREMENT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Requirement requirement;
    @JoinColumns({
        @JoinColumn(name = "CUST_REQUEST_ID", referencedColumnName = "CUST_REQUEST_ID", insertable = false, updatable = false),
        @JoinColumn(name = "CUST_REQUEST_ITEM_SEQ_ID", referencedColumnName = "CUST_REQUEST_ITEM_SEQ_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private CustRequestItem custRequestItem;

    public RequirementCustRequest() {
    }

    public RequirementCustRequest(RequirementCustRequestPK requirementCustRequestPK) {
        this.requirementCustRequestPK = requirementCustRequestPK;
    }

    public RequirementCustRequest(String custRequestId, String custRequestItemSeqId, String requirementId) {
        this.requirementCustRequestPK = new RequirementCustRequestPK(custRequestId, custRequestItemSeqId, requirementId);
    }

    public RequirementCustRequestPK getRequirementCustRequestPK() {
        return requirementCustRequestPK;
    }

    public void setRequirementCustRequestPK(RequirementCustRequestPK requirementCustRequestPK) {
        this.requirementCustRequestPK = requirementCustRequestPK;
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

    public Requirement getRequirement() {
        return requirement;
    }

    public void setRequirement(Requirement requirement) {
        this.requirement = requirement;
    }

    public CustRequestItem getCustRequestItem() {
        return custRequestItem;
    }

    public void setCustRequestItem(CustRequestItem custRequestItem) {
        this.custRequestItem = custRequestItem;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (requirementCustRequestPK != null ? requirementCustRequestPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RequirementCustRequest)) {
            return false;
        }
        RequirementCustRequest other = (RequirementCustRequest) object;
        if ((this.requirementCustRequestPK == null && other.requirementCustRequestPK != null) || (this.requirementCustRequestPK != null && !this.requirementCustRequestPK.equals(other.requirementCustRequestPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.RequirementCustRequest[ requirementCustRequestPK=" + requirementCustRequestPK + " ]";
    }
    
}
