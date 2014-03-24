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

import com.wildc.ucumari.client.modelo.Content;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "cust_request_content")
@NamedQueries({
    @NamedQuery(name = "CustRequestContent.findAll", query = "SELECT c FROM CustRequestContent c")})
public class CustRequestContent implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CustRequestContentPK custRequestContentPK;
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
    @JoinColumn(name = "CUST_REQUEST_ID", referencedColumnName = "CUST_REQUEST_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private CustRequest custRequest;
    @JoinColumn(name = "CONTENT_ID", referencedColumnName = "CONTENT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Content content;

    public CustRequestContent() {
    }

    public CustRequestContent(CustRequestContentPK custRequestContentPK) {
        this.custRequestContentPK = custRequestContentPK;
    }

    public CustRequestContent(String custRequestId, String contentId, Date fromDate) {
        this.custRequestContentPK = new CustRequestContentPK(custRequestId, contentId, fromDate);
    }

    public CustRequestContentPK getCustRequestContentPK() {
        return custRequestContentPK;
    }

    public void setCustRequestContentPK(CustRequestContentPK custRequestContentPK) {
        this.custRequestContentPK = custRequestContentPK;
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

    public CustRequest getCustRequest() {
        return custRequest;
    }

    public void setCustRequest(CustRequest custRequest) {
        this.custRequest = custRequest;
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
        hash += (custRequestContentPK != null ? custRequestContentPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CustRequestContent)) {
            return false;
        }
        CustRequestContent other = (CustRequestContent) object;
        if ((this.custRequestContentPK == null && other.custRequestContentPK != null) || (this.custRequestContentPK != null && !this.custRequestContentPK.equals(other.custRequestContentPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.CustRequestContent[ custRequestContentPK=" + custRequestContentPK + " ]";
    }
    
}
