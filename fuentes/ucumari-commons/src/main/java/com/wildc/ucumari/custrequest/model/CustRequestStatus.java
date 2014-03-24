/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.custrequest.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.parameters.model.StatusItem;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "cust_request_status")
public class CustRequestStatus implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CUST_REQUEST_STATUS_ID")
    private String custRequestStatusId;
    @Column(name = "CUST_REQUEST_ITEM_SEQ_ID")
    private String custRequestItemSeqId;
    @Column(name = "STATUS_DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date statusDatetime;
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
    @JoinColumn(name = "CUST_REQUEST_ID", referencedColumnName = "CUST_REQUEST_ID")
    @ManyToOne
    private CustRequest custRequestId;
    @JoinColumn(name = "STATUS_ID", referencedColumnName = "STATUS_ID")
    @ManyToOne
    private StatusItem statusId;

    public CustRequestStatus() {
    }

    public CustRequestStatus(String custRequestStatusId) {
        this.custRequestStatusId = custRequestStatusId;
    }

    public String getCustRequestStatusId() {
        return custRequestStatusId;
    }

    public void setCustRequestStatusId(String custRequestStatusId) {
        this.custRequestStatusId = custRequestStatusId;
    }

    public String getCustRequestItemSeqId() {
        return custRequestItemSeqId;
    }

    public void setCustRequestItemSeqId(String custRequestItemSeqId) {
        this.custRequestItemSeqId = custRequestItemSeqId;
    }

    public Date getStatusDatetime() {
        return statusDatetime;
    }

    public void setStatusDatetime(Date statusDatetime) {
        this.statusDatetime = statusDatetime;
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

    public CustRequest getCustRequestId() {
        return custRequestId;
    }

    public void setCustRequestId(CustRequest custRequestId) {
        this.custRequestId = custRequestId;
    }

    public StatusItem getStatusId() {
        return statusId;
    }

    public void setStatusId(StatusItem statusId) {
        this.statusId = statusId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (custRequestStatusId != null ? custRequestStatusId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CustRequestStatus)) {
            return false;
        }
        CustRequestStatus other = (CustRequestStatus) object;
        if ((this.custRequestStatusId == null && other.custRequestStatusId != null) || (this.custRequestStatusId != null && !this.custRequestStatusId.equals(other.custRequestStatusId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.CustRequestStatus[ custRequestStatusId=" + custRequestStatusId + " ]";
    }
    
}
