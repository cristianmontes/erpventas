/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class RequirementCustRequestPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CUST_REQUEST_ID")
    private String custRequestId;
    @Basic(optional = false)
    @Column(name = "CUST_REQUEST_ITEM_SEQ_ID")
    private String custRequestItemSeqId;
    @Basic(optional = false)
    @Column(name = "REQUIREMENT_ID")
    private String requirementId;

    public RequirementCustRequestPK() {
    }

    public RequirementCustRequestPK(String custRequestId, String custRequestItemSeqId, String requirementId) {
        this.custRequestId = custRequestId;
        this.custRequestItemSeqId = custRequestItemSeqId;
        this.requirementId = requirementId;
    }

    public String getCustRequestId() {
        return custRequestId;
    }

    public void setCustRequestId(String custRequestId) {
        this.custRequestId = custRequestId;
    }

    public String getCustRequestItemSeqId() {
        return custRequestItemSeqId;
    }

    public void setCustRequestItemSeqId(String custRequestItemSeqId) {
        this.custRequestItemSeqId = custRequestItemSeqId;
    }

    public String getRequirementId() {
        return requirementId;
    }

    public void setRequirementId(String requirementId) {
        this.requirementId = requirementId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (custRequestId != null ? custRequestId.hashCode() : 0);
        hash += (custRequestItemSeqId != null ? custRequestItemSeqId.hashCode() : 0);
        hash += (requirementId != null ? requirementId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RequirementCustRequestPK)) {
            return false;
        }
        RequirementCustRequestPK other = (RequirementCustRequestPK) object;
        if ((this.custRequestId == null && other.custRequestId != null) || (this.custRequestId != null && !this.custRequestId.equals(other.custRequestId))) {
            return false;
        }
        if ((this.custRequestItemSeqId == null && other.custRequestItemSeqId != null) || (this.custRequestItemSeqId != null && !this.custRequestItemSeqId.equals(other.custRequestItemSeqId))) {
            return false;
        }
        if ((this.requirementId == null && other.requirementId != null) || (this.requirementId != null && !this.requirementId.equals(other.requirementId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.RequirementCustRequestPK[ custRequestId=" + custRequestId + ", custRequestItemSeqId=" + custRequestItemSeqId + ", requirementId=" + requirementId + " ]";
    }
    
}
