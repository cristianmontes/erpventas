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
public class RespondingPartyPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "RESPONDING_PARTY_SEQ_ID")
    private String respondingPartySeqId;
    @Basic(optional = false)
    @Column(name = "CUST_REQUEST_ID")
    private String custRequestId;
    @Basic(optional = false)
    @Column(name = "PARTY_ID")
    private String partyId;

    public RespondingPartyPK() {
    }

    public RespondingPartyPK(String respondingPartySeqId, String custRequestId, String partyId) {
        this.respondingPartySeqId = respondingPartySeqId;
        this.custRequestId = custRequestId;
        this.partyId = partyId;
    }

    public String getRespondingPartySeqId() {
        return respondingPartySeqId;
    }

    public void setRespondingPartySeqId(String respondingPartySeqId) {
        this.respondingPartySeqId = respondingPartySeqId;
    }

    public String getCustRequestId() {
        return custRequestId;
    }

    public void setCustRequestId(String custRequestId) {
        this.custRequestId = custRequestId;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (respondingPartySeqId != null ? respondingPartySeqId.hashCode() : 0);
        hash += (custRequestId != null ? custRequestId.hashCode() : 0);
        hash += (partyId != null ? partyId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RespondingPartyPK)) {
            return false;
        }
        RespondingPartyPK other = (RespondingPartyPK) object;
        if ((this.respondingPartySeqId == null && other.respondingPartySeqId != null) || (this.respondingPartySeqId != null && !this.respondingPartySeqId.equals(other.respondingPartySeqId))) {
            return false;
        }
        if ((this.custRequestId == null && other.custRequestId != null) || (this.custRequestId != null && !this.custRequestId.equals(other.custRequestId))) {
            return false;
        }
        if ((this.partyId == null && other.partyId != null) || (this.partyId != null && !this.partyId.equals(other.partyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.RespondingPartyPK[ respondingPartySeqId=" + respondingPartySeqId + ", custRequestId=" + custRequestId + ", partyId=" + partyId + " ]";
    }
    
}
