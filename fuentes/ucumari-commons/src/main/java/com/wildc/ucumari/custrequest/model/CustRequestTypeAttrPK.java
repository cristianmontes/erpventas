/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.custrequest.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class CustRequestTypeAttrPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CUST_REQUEST_TYPE_ID")
    private String custRequestTypeId;
    @Basic(optional = false)
    @Column(name = "ATTR_NAME")
    private String attrName;

    public CustRequestTypeAttrPK() {
    }

    public CustRequestTypeAttrPK(String custRequestTypeId, String attrName) {
        this.custRequestTypeId = custRequestTypeId;
        this.attrName = attrName;
    }

    public String getCustRequestTypeId() {
        return custRequestTypeId;
    }

    public void setCustRequestTypeId(String custRequestTypeId) {
        this.custRequestTypeId = custRequestTypeId;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (custRequestTypeId != null ? custRequestTypeId.hashCode() : 0);
        hash += (attrName != null ? attrName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CustRequestTypeAttrPK)) {
            return false;
        }
        CustRequestTypeAttrPK other = (CustRequestTypeAttrPK) object;
        if ((this.custRequestTypeId == null && other.custRequestTypeId != null) || (this.custRequestTypeId != null && !this.custRequestTypeId.equals(other.custRequestTypeId))) {
            return false;
        }
        if ((this.attrName == null && other.attrName != null) || (this.attrName != null && !this.attrName.equals(other.attrName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.CustRequestTypeAttrPK[ custRequestTypeId=" + custRequestTypeId + ", attrName=" + attrName + " ]";
    }
    
}
