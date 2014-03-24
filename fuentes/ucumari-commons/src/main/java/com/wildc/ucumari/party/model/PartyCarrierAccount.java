/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.party.model;

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
@Table(name = "party_carrier_account")
@NamedQueries({
    @NamedQuery(name = "PartyCarrierAccount.findAll", query = "SELECT p FROM PartyCarrierAccount p")})
public class PartyCarrierAccount implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PartyCarrierAccountPK partyCarrierAccountPK;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
    @Column(name = "ACCOUNT_NUMBER")
    private String accountNumber;
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
    @Column(name = "POSTAL_CODE")
    private String postalCode;
    @Column(name = "COUNTRY_GEO_CODE")
    private String countryGeoCode;
    @Column(name = "IS_DEFAULT")
    private Character isDefault;
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Party party;
    @JoinColumn(name = "CARRIER_PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Party party1;

    public PartyCarrierAccount() {
    }

    public PartyCarrierAccount(PartyCarrierAccountPK partyCarrierAccountPK) {
        this.partyCarrierAccountPK = partyCarrierAccountPK;
    }

    public PartyCarrierAccount(String partyId, String carrierPartyId, Date fromDate) {
        this.partyCarrierAccountPK = new PartyCarrierAccountPK(partyId, carrierPartyId, fromDate);
    }

    public PartyCarrierAccountPK getPartyCarrierAccountPK() {
        return partyCarrierAccountPK;
    }

    public void setPartyCarrierAccountPK(PartyCarrierAccountPK partyCarrierAccountPK) {
        this.partyCarrierAccountPK = partyCarrierAccountPK;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
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

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountryGeoCode() {
        return countryGeoCode;
    }

    public void setCountryGeoCode(String countryGeoCode) {
        this.countryGeoCode = countryGeoCode;
    }

    public Character getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Character isDefault) {
        this.isDefault = isDefault;
    }

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    public Party getParty1() {
        return party1;
    }

    public void setParty1(Party party1) {
        this.party1 = party1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (partyCarrierAccountPK != null ? partyCarrierAccountPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PartyCarrierAccount)) {
            return false;
        }
        PartyCarrierAccount other = (PartyCarrierAccount) object;
        if ((this.partyCarrierAccountPK == null && other.partyCarrierAccountPK != null) || (this.partyCarrierAccountPK != null && !this.partyCarrierAccountPK.equals(other.partyCarrierAccountPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PartyCarrierAccount[ partyCarrierAccountPK=" + partyCarrierAccountPK + " ]";
    }
    
}
