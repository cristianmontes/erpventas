/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.custrequest.model;

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
@Table(name = "cust_request_work_effort")
@NamedQueries({
    @NamedQuery(name = "CustRequestWorkEffort.findAll", query = "SELECT c FROM CustRequestWorkEffort c")})
public class CustRequestWorkEffort implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CustRequestWorkEffortPK custRequestWorkEffortPK;
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
    @JoinColumn(name = "CUST_REQUEST_ID", referencedColumnName = "CUST_REQUEST_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private CustRequest custRequest;

    public CustRequestWorkEffort() {
    }

    public CustRequestWorkEffort(CustRequestWorkEffortPK custRequestWorkEffortPK) {
        this.custRequestWorkEffortPK = custRequestWorkEffortPK;
    }

    public CustRequestWorkEffort(String custRequestId, String workEffortId) {
        this.custRequestWorkEffortPK = new CustRequestWorkEffortPK(custRequestId, workEffortId);
    }

    public CustRequestWorkEffortPK getCustRequestWorkEffortPK() {
        return custRequestWorkEffortPK;
    }

    public void setCustRequestWorkEffortPK(CustRequestWorkEffortPK custRequestWorkEffortPK) {
        this.custRequestWorkEffortPK = custRequestWorkEffortPK;
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

    public CustRequest getCustRequest() {
        return custRequest;
    }

    public void setCustRequest(CustRequest custRequest) {
        this.custRequest = custRequest;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (custRequestWorkEffortPK != null ? custRequestWorkEffortPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CustRequestWorkEffort)) {
            return false;
        }
        CustRequestWorkEffort other = (CustRequestWorkEffort) object;
        if ((this.custRequestWorkEffortPK == null && other.custRequestWorkEffortPK != null) || (this.custRequestWorkEffortPK != null && !this.custRequestWorkEffortPK.equals(other.custRequestWorkEffortPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.CustRequestWorkEffort[ custRequestWorkEffortPK=" + custRequestWorkEffortPK + " ]";
    }
    
}
