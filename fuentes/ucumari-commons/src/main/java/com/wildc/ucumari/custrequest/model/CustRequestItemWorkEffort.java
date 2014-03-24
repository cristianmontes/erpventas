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
import javax.persistence.JoinColumns;
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
@Table(name = "cust_request_item_work_effort")
@NamedQueries({
    @NamedQuery(name = "CustRequestItemWorkEffort.findAll", query = "SELECT c FROM CustRequestItemWorkEffort c")})
public class CustRequestItemWorkEffort implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CustRequestItemWorkEffortPK custRequestItemWorkEffortPK;
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
    @JoinColumns({
        @JoinColumn(name = "CUST_REQUEST_ID", referencedColumnName = "CUST_REQUEST_ID", insertable = false, updatable = false),
        @JoinColumn(name = "CUST_REQUEST_ITEM_SEQ_ID", referencedColumnName = "CUST_REQUEST_ITEM_SEQ_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private CustRequestItem custRequestItem;
    @JoinColumn(name = "WORK_EFFORT_ID", referencedColumnName = "WORK_EFFORT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private WorkEffort workEffort;

    public CustRequestItemWorkEffort() {
    }

    public CustRequestItemWorkEffort(CustRequestItemWorkEffortPK custRequestItemWorkEffortPK) {
        this.custRequestItemWorkEffortPK = custRequestItemWorkEffortPK;
    }

    public CustRequestItemWorkEffort(String custRequestId, String custRequestItemSeqId, String workEffortId) {
        this.custRequestItemWorkEffortPK = new CustRequestItemWorkEffortPK(custRequestId, custRequestItemSeqId, workEffortId);
    }

    public CustRequestItemWorkEffortPK getCustRequestItemWorkEffortPK() {
        return custRequestItemWorkEffortPK;
    }

    public void setCustRequestItemWorkEffortPK(CustRequestItemWorkEffortPK custRequestItemWorkEffortPK) {
        this.custRequestItemWorkEffortPK = custRequestItemWorkEffortPK;
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

    public CustRequestItem getCustRequestItem() {
        return custRequestItem;
    }

    public void setCustRequestItem(CustRequestItem custRequestItem) {
        this.custRequestItem = custRequestItem;
    }

    public WorkEffort getWorkEffort() {
        return workEffort;
    }

    public void setWorkEffort(WorkEffort workEffort) {
        this.workEffort = workEffort;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (custRequestItemWorkEffortPK != null ? custRequestItemWorkEffortPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CustRequestItemWorkEffort)) {
            return false;
        }
        CustRequestItemWorkEffort other = (CustRequestItemWorkEffort) object;
        if ((this.custRequestItemWorkEffortPK == null && other.custRequestItemWorkEffortPK != null) || (this.custRequestItemWorkEffortPK != null && !this.custRequestItemWorkEffortPK.equals(other.custRequestItemWorkEffortPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.CustRequestItemWorkEffort[ custRequestItemWorkEffortPK=" + custRequestItemWorkEffortPK + " ]";
    }
    
}
