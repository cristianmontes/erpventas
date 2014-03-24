/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.agreement.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.party.model.Party;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "agreement_party_applic")
public class AgreementPartyApplic implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AgreementPartyApplicPK agreementPartyApplicPK;
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
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Party party;
    @JoinColumn(name = "AGREEMENT_ID", referencedColumnName = "AGREEMENT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Agreement agreement;

    public AgreementPartyApplic() {
    }

    public AgreementPartyApplic(AgreementPartyApplicPK agreementPartyApplicPK) {
        this.agreementPartyApplicPK = agreementPartyApplicPK;
    }

    public AgreementPartyApplic(String agreementId, String agreementItemSeqId, String partyId) {
        this.agreementPartyApplicPK = new AgreementPartyApplicPK(agreementId, agreementItemSeqId, partyId);
    }

    public AgreementPartyApplicPK getAgreementPartyApplicPK() {
        return agreementPartyApplicPK;
    }

    public void setAgreementPartyApplicPK(AgreementPartyApplicPK agreementPartyApplicPK) {
        this.agreementPartyApplicPK = agreementPartyApplicPK;
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

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    public Agreement getAgreement() {
        return agreement;
    }

    public void setAgreement(Agreement agreement) {
        this.agreement = agreement;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (agreementPartyApplicPK != null ? agreementPartyApplicPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AgreementPartyApplic)) {
            return false;
        }
        AgreementPartyApplic other = (AgreementPartyApplic) object;
        if ((this.agreementPartyApplicPK == null && other.agreementPartyApplicPK != null) || (this.agreementPartyApplicPK != null && !this.agreementPartyApplicPK.equals(other.agreementPartyApplicPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.AgreementPartyApplic[ agreementPartyApplicPK=" + agreementPartyApplicPK + " ]";
    }
    
}
