/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.party.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "party_group")
public class PartyGroup implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PARTY_ID")
    private String partyId;
    @Column(name = "GROUP_NAME")
    private String groupName;
    @Column(name = "GROUP_NAME_LOCAL")
    private String groupNameLocal;
    @Column(name = "OFFICE_SITE_NAME")
    private String officeSiteName;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ANNUAL_REVENUE")
    private BigDecimal annualRevenue;
    @Column(name = "NUM_EMPLOYEES")
    private BigInteger numEmployees;
    @Column(name = "TICKER_SYMBOL")
    private String tickerSymbol;
    @Column(name = "COMMENTS")
    private String comments;
    @Column(name = "LOGO_IMAGE_URL")
    private String logoImageUrl;
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
    @Column(name = "IS_INCORPORATED")
    private Character isIncorporated;
    @Column(name = "FEDERAL_TAX_ID")
    private String federalTaxId;
    @Column(name = "REQUIRES1099")
    private Character requires1099;
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Party party;
    /*
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "partyGroup")
    private Affiliate affiliate;*/
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "partyGroup")
    private List<PartyInvitationGroupAssoc> partyInvitationGroupAssocList;*/

    public PartyGroup() {
    }

    public PartyGroup(String partyId) {
        this.partyId = partyId;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupNameLocal() {
        return groupNameLocal;
    }

    public void setGroupNameLocal(String groupNameLocal) {
        this.groupNameLocal = groupNameLocal;
    }

    public String getOfficeSiteName() {
        return officeSiteName;
    }

    public void setOfficeSiteName(String officeSiteName) {
        this.officeSiteName = officeSiteName;
    }

    public BigDecimal getAnnualRevenue() {
        return annualRevenue;
    }

    public void setAnnualRevenue(BigDecimal annualRevenue) {
        this.annualRevenue = annualRevenue;
    }

    public BigInteger getNumEmployees() {
        return numEmployees;
    }

    public void setNumEmployees(BigInteger numEmployees) {
        this.numEmployees = numEmployees;
    }

    public String getTickerSymbol() {
        return tickerSymbol;
    }

    public void setTickerSymbol(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getLogoImageUrl() {
        return logoImageUrl;
    }

    public void setLogoImageUrl(String logoImageUrl) {
        this.logoImageUrl = logoImageUrl;
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

    public Character getIsIncorporated() {
        return isIncorporated;
    }

    public void setIsIncorporated(Character isIncorporated) {
        this.isIncorporated = isIncorporated;
    }

    public String getFederalTaxId() {
        return federalTaxId;
    }

    public void setFederalTaxId(String federalTaxId) {
        this.federalTaxId = federalTaxId;
    }

    public Character getRequires1099() {
        return requires1099;
    }

    public void setRequires1099(Character requires1099) {
        this.requires1099 = requires1099;
    }

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    /*
    public Affiliate getAffiliate() {
        return affiliate;
    }

    public void setAffiliate(Affiliate affiliate) {
        this.affiliate = affiliate;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (partyId != null ? partyId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PartyGroup)) {
            return false;
        }
        PartyGroup other = (PartyGroup) object;
        if ((this.partyId == null && other.partyId != null) || (this.partyId != null && !this.partyId.equals(other.partyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PartyGroup[ partyId=" + partyId + " ]";
    }

    /*
    public List<PartyInvitationGroupAssoc> getPartyInvitationGroupAssocList() {
        return partyInvitationGroupAssocList;
    }

    public void setPartyInvitationGroupAssocList(List<PartyInvitationGroupAssoc> partyInvitationGroupAssocList) {
        this.partyInvitationGroupAssocList = partyInvitationGroupAssocList;
    }*/
    
}
