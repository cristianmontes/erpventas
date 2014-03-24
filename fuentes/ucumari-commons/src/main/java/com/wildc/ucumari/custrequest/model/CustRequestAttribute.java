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
@Table(name = "cust_request_attribute")
@NamedQueries({
    @NamedQuery(name = "CustRequestAttribute.findAll", query = "SELECT c FROM CustRequestAttribute c")})
public class CustRequestAttribute implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CustRequestAttributePK custRequestAttributePK;
    @Column(name = "ATTR_VALUE")
    private String attrValue;
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

    public CustRequestAttribute() {
    }

    public CustRequestAttribute(CustRequestAttributePK custRequestAttributePK) {
        this.custRequestAttributePK = custRequestAttributePK;
    }

    public CustRequestAttribute(String custRequestId, String attrName) {
        this.custRequestAttributePK = new CustRequestAttributePK(custRequestId, attrName);
    }

    public CustRequestAttributePK getCustRequestAttributePK() {
        return custRequestAttributePK;
    }

    public void setCustRequestAttributePK(CustRequestAttributePK custRequestAttributePK) {
        this.custRequestAttributePK = custRequestAttributePK;
    }

    public String getAttrValue() {
        return attrValue;
    }

    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (custRequestAttributePK != null ? custRequestAttributePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CustRequestAttribute)) {
            return false;
        }
        CustRequestAttribute other = (CustRequestAttribute) object;
        if ((this.custRequestAttributePK == null && other.custRequestAttributePK != null) || (this.custRequestAttributePK != null && !this.custRequestAttributePK.equals(other.custRequestAttributePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.CustRequestAttribute[ custRequestAttributePK=" + custRequestAttributePK + " ]";
    }
    
}
