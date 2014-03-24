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

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "cust_request_type_attr")
@NamedQueries({
    @NamedQuery(name = "CustRequestTypeAttr.findAll", query = "SELECT c FROM CustRequestTypeAttr c")})
public class CustRequestTypeAttr implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CustRequestTypeAttrPK custRequestTypeAttrPK;
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
    @JoinColumn(name = "CUST_REQUEST_TYPE_ID", referencedColumnName = "CUST_REQUEST_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private CustRequestType custRequestType;

    public CustRequestTypeAttr() {
    }

    public CustRequestTypeAttr(CustRequestTypeAttrPK custRequestTypeAttrPK) {
        this.custRequestTypeAttrPK = custRequestTypeAttrPK;
    }

    public CustRequestTypeAttr(String custRequestTypeId, String attrName) {
        this.custRequestTypeAttrPK = new CustRequestTypeAttrPK(custRequestTypeId, attrName);
    }

    public CustRequestTypeAttrPK getCustRequestTypeAttrPK() {
        return custRequestTypeAttrPK;
    }

    public void setCustRequestTypeAttrPK(CustRequestTypeAttrPK custRequestTypeAttrPK) {
        this.custRequestTypeAttrPK = custRequestTypeAttrPK;
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

    public CustRequestType getCustRequestType() {
        return custRequestType;
    }

    public void setCustRequestType(CustRequestType custRequestType) {
        this.custRequestType = custRequestType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (custRequestTypeAttrPK != null ? custRequestTypeAttrPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CustRequestTypeAttr)) {
            return false;
        }
        CustRequestTypeAttr other = (CustRequestTypeAttr) object;
        if ((this.custRequestTypeAttrPK == null && other.custRequestTypeAttrPK != null) || (this.custRequestTypeAttrPK != null && !this.custRequestTypeAttrPK.equals(other.custRequestTypeAttrPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.CustRequestTypeAttr[ custRequestTypeAttrPK=" + custRequestTypeAttrPK + " ]";
    }
    
}
