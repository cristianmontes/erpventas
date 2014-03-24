/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.agreement.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class AgreementPartyApplicPK implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Basic(optional = false)
    @Column(name = "AGREEMENT_ID")
    private String agreementId;
    @Basic(optional = false)
    @Column(name = "AGREEMENT_ITEM_SEQ_ID")
    private String agreementItemSeqId;
    @Basic(optional = false)
    @Column(name = "PARTY_ID")
    private String partyId;

    public AgreementPartyApplicPK() {
    }

    public AgreementPartyApplicPK(String agreementId, String agreementItemSeqId, String partyId) {
        this.agreementId = agreementId;
        this.agreementItemSeqId = agreementItemSeqId;
        this.partyId = partyId;
    }

    public String getAgreementId() {
        return agreementId;
    }

    public void setAgreementId(String agreementId) {
        this.agreementId = agreementId;
    }

    public String getAgreementItemSeqId() {
        return agreementItemSeqId;
    }

    public void setAgreementItemSeqId(String agreementItemSeqId) {
        this.agreementItemSeqId = agreementItemSeqId;
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
        hash += (agreementId != null ? agreementId.hashCode() : 0);
        hash += (agreementItemSeqId != null ? agreementItemSeqId.hashCode() : 0);
        hash += (partyId != null ? partyId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AgreementPartyApplicPK)) {
            return false;
        }
        AgreementPartyApplicPK other = (AgreementPartyApplicPK) object;
        if ((this.agreementId == null && other.agreementId != null) || (this.agreementId != null && !this.agreementId.equals(other.agreementId))) {
            return false;
        }
        if ((this.agreementItemSeqId == null && other.agreementItemSeqId != null) || (this.agreementItemSeqId != null && !this.agreementItemSeqId.equals(other.agreementItemSeqId))) {
            return false;
        }
        if ((this.partyId == null && other.partyId != null) || (this.partyId != null && !this.partyId.equals(other.partyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.AgreementPartyApplicPK[ agreementId=" + agreementId + ", agreementItemSeqId=" + agreementItemSeqId + ", partyId=" + partyId + " ]";
    }
    
}
