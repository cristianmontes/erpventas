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

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "cust_request_resolution")
public class CustRequestResolution implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CUST_REQUEST_RESOLUTION_ID")
    private String custRequestResolutionId;
    @Column(name = "DESCRIPTION")
    private String description;
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
    /*@OneToMany(mappedBy = "custRequestResolutionId")
    private List<CustRequestItem> custRequestItemList;*/
    @JoinColumn(name = "CUST_REQUEST_TYPE_ID", referencedColumnName = "CUST_REQUEST_TYPE_ID")
    @ManyToOne
    private CustRequestType custRequestTypeId;

    public CustRequestResolution() {
    }

    public CustRequestResolution(String custRequestResolutionId) {
        this.custRequestResolutionId = custRequestResolutionId;
    }

    public String getCustRequestResolutionId() {
        return custRequestResolutionId;
    }

    public void setCustRequestResolutionId(String custRequestResolutionId) {
        this.custRequestResolutionId = custRequestResolutionId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
/*
    public List<CustRequestItem> getCustRequestItemList() {
        return custRequestItemList;
    }

    public void setCustRequestItemList(List<CustRequestItem> custRequestItemList) {
        this.custRequestItemList = custRequestItemList;
    }*/

    public CustRequestType getCustRequestTypeId() {
        return custRequestTypeId;
    }

    public void setCustRequestTypeId(CustRequestType custRequestTypeId) {
        this.custRequestTypeId = custRequestTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (custRequestResolutionId != null ? custRequestResolutionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CustRequestResolution)) {
            return false;
        }
        CustRequestResolution other = (CustRequestResolution) object;
        if ((this.custRequestResolutionId == null && other.custRequestResolutionId != null) || (this.custRequestResolutionId != null && !this.custRequestResolutionId.equals(other.custRequestResolutionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.CustRequestResolution[ custRequestResolutionId=" + custRequestResolutionId + " ]";
    }
    
}
