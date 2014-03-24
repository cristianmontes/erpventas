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

import com.wildc.ucumari.client.modelo.CommunicationEvent;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "cust_request_comm_event")
@NamedQueries({
    @NamedQuery(name = "CustRequestCommEvent.findAll", query = "SELECT c FROM CustRequestCommEvent c")})
public class CustRequestCommEvent implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CustRequestCommEventPK custRequestCommEventPK;
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
    @JoinColumn(name = "CUST_REQUEST_ID", referencedColumnName = "CUST_REQUEST_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private CustRequest custRequest;
    @JoinColumn(name = "COMMUNICATION_EVENT_ID", referencedColumnName = "COMMUNICATION_EVENT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private CommunicationEvent communicationEvent;

    public CustRequestCommEvent() {
    }

    public CustRequestCommEvent(CustRequestCommEventPK custRequestCommEventPK) {
        this.custRequestCommEventPK = custRequestCommEventPK;
    }

    public CustRequestCommEvent(String custRequestId, String communicationEventId) {
        this.custRequestCommEventPK = new CustRequestCommEventPK(custRequestId, communicationEventId);
    }

    public CustRequestCommEventPK getCustRequestCommEventPK() {
        return custRequestCommEventPK;
    }

    public void setCustRequestCommEventPK(CustRequestCommEventPK custRequestCommEventPK) {
        this.custRequestCommEventPK = custRequestCommEventPK;
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

    public CustRequest getCustRequest() {
        return custRequest;
    }

    public void setCustRequest(CustRequest custRequest) {
        this.custRequest = custRequest;
    }

    public CommunicationEvent getCommunicationEvent() {
        return communicationEvent;
    }

    public void setCommunicationEvent(CommunicationEvent communicationEvent) {
        this.communicationEvent = communicationEvent;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (custRequestCommEventPK != null ? custRequestCommEventPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CustRequestCommEvent)) {
            return false;
        }
        CustRequestCommEvent other = (CustRequestCommEvent) object;
        if ((this.custRequestCommEventPK == null && other.custRequestCommEventPK != null) || (this.custRequestCommEventPK != null && !this.custRequestCommEventPK.equals(other.custRequestCommEventPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.CustRequestCommEvent[ custRequestCommEventPK=" + custRequestCommEventPK + " ]";
    }
    
}
