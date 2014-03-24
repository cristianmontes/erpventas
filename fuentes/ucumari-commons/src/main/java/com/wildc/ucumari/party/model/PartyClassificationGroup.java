/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.party.model;

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
@Table(name = "party_classification_group")
public class PartyClassificationGroup implements Serializable {
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "partyClassificationGroup")
    private List<SegmentGroupClassification> segmentGroupClassificationList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "partyClassificationGroup")
    private List<PartyClassification> partyClassificationList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "partyClassificationGroup")
    private List<MarketInterest> marketInterestList;*/
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PARTY_CLASSIFICATION_GROUP_ID")
    private String partyClassificationGroupId;
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
    @JoinColumn(name = "PARTY_CLASSIFICATION_TYPE_ID", referencedColumnName = "PARTY_CLASSIFICATION_TYPE_ID")
    @ManyToOne
    private PartyClassificationType partyClassificationTypeId;
    /*@OneToMany(mappedBy = "parentGroupId")
    private List<PartyClassificationGroup> partyClassificationGroupList;*/
    @JoinColumn(name = "PARENT_GROUP_ID", referencedColumnName = "PARTY_CLASSIFICATION_GROUP_ID")
    @ManyToOne
    private PartyClassificationGroup parentGroupId;
    /*@OneToMany(mappedBy = "partyClassificationGroupId")
    private List<AgreementTerm> agreementTermList;
    @OneToMany(mappedBy = "toPartyClassGroupId")
    private List<Agreement> agreementList;
    @OneToMany(mappedBy = "fromPartyClassGroupId")
    private List<Agreement> agreementList1;*/

    public PartyClassificationGroup() {
    }

    public PartyClassificationGroup(String partyClassificationGroupId) {
        this.partyClassificationGroupId = partyClassificationGroupId;
    }

    public String getPartyClassificationGroupId() {
        return partyClassificationGroupId;
    }

    public void setPartyClassificationGroupId(String partyClassificationGroupId) {
        this.partyClassificationGroupId = partyClassificationGroupId;
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

    public PartyClassificationType getPartyClassificationTypeId() {
        return partyClassificationTypeId;
    }

    public void setPartyClassificationTypeId(PartyClassificationType partyClassificationTypeId) {
        this.partyClassificationTypeId = partyClassificationTypeId;
    }
/*
    public List<PartyClassificationGroup> getPartyClassificationGroupList() {
        return partyClassificationGroupList;
    }

    public void setPartyClassificationGroupList(List<PartyClassificationGroup> partyClassificationGroupList) {
        this.partyClassificationGroupList = partyClassificationGroupList;
    }*/

    public PartyClassificationGroup getParentGroupId() {
        return parentGroupId;
    }

    public void setParentGroupId(PartyClassificationGroup parentGroupId) {
        this.parentGroupId = parentGroupId;
    }
/*
    public List<AgreementTerm> getAgreementTermList() {
        return agreementTermList;
    }

    public void setAgreementTermList(List<AgreementTerm> agreementTermList) {
        this.agreementTermList = agreementTermList;
    }

    public List<Agreement> getAgreementList() {
        return agreementList;
    }

    public void setAgreementList(List<Agreement> agreementList) {
        this.agreementList = agreementList;
    }

    public List<Agreement> getAgreementList1() {
        return agreementList1;
    }

    public void setAgreementList1(List<Agreement> agreementList1) {
        this.agreementList1 = agreementList1;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (partyClassificationGroupId != null ? partyClassificationGroupId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PartyClassificationGroup)) {
            return false;
        }
        PartyClassificationGroup other = (PartyClassificationGroup) object;
        if ((this.partyClassificationGroupId == null && other.partyClassificationGroupId != null) || (this.partyClassificationGroupId != null && !this.partyClassificationGroupId.equals(other.partyClassificationGroupId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PartyClassificationGroup[ partyClassificationGroupId=" + partyClassificationGroupId + " ]";
    }
/*
    public List<MarketInterest> getMarketInterestList() {
        return marketInterestList;
    }

    public void setMarketInterestList(List<MarketInterest> marketInterestList) {
        this.marketInterestList = marketInterestList;
    }

    public List<PartyClassification> getPartyClassificationList() {
        return partyClassificationList;
    }

    public void setPartyClassificationList(List<PartyClassification> partyClassificationList) {
        this.partyClassificationList = partyClassificationList;
    }

    public List<SegmentGroupClassification> getSegmentGroupClassificationList() {
        return segmentGroupClassificationList;
    }

    public void setSegmentGroupClassificationList(List<SegmentGroupClassification> segmentGroupClassificationList) {
        this.segmentGroupClassificationList = segmentGroupClassificationList;
    }
    */
}
