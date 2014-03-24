/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.party.model;

import com.wildc.ucumari.tax.model.TaxAuthority;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
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
@Table(name = "party_tax_auth_info")
@NamedQueries({
    @NamedQuery(name = "PartyTaxAuthInfo.findAll", query = "SELECT p FROM PartyTaxAuthInfo p")})
public class PartyTaxAuthInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PartyTaxAuthInfoPK partyTaxAuthInfoPK;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
    @Column(name = "PARTY_TAX_ID")
    private String partyTaxId;
    @Column(name = "IS_EXEMPT")
    private Character isExempt;
    @Column(name = "IS_NEXUS")
    private Character isNexus;
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
    @JoinColumns({
        @JoinColumn(name = "TAX_AUTH_GEO_ID", referencedColumnName = "TAX_AUTH_GEO_ID", insertable = false, updatable = false),
        @JoinColumn(name = "TAX_AUTH_PARTY_ID", referencedColumnName = "TAX_AUTH_PARTY_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private TaxAuthority taxAuthority;
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Party party;

    public PartyTaxAuthInfo() {
    }

    public PartyTaxAuthInfo(PartyTaxAuthInfoPK partyTaxAuthInfoPK) {
        this.partyTaxAuthInfoPK = partyTaxAuthInfoPK;
    }

    public PartyTaxAuthInfo(String partyId, String taxAuthGeoId, String taxAuthPartyId, Date fromDate) {
        this.partyTaxAuthInfoPK = new PartyTaxAuthInfoPK(partyId, taxAuthGeoId, taxAuthPartyId, fromDate);
    }

    public PartyTaxAuthInfoPK getPartyTaxAuthInfoPK() {
        return partyTaxAuthInfoPK;
    }

    public void setPartyTaxAuthInfoPK(PartyTaxAuthInfoPK partyTaxAuthInfoPK) {
        this.partyTaxAuthInfoPK = partyTaxAuthInfoPK;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
    }

    public String getPartyTaxId() {
        return partyTaxId;
    }

    public void setPartyTaxId(String partyTaxId) {
        this.partyTaxId = partyTaxId;
    }

    public Character getIsExempt() {
        return isExempt;
    }

    public void setIsExempt(Character isExempt) {
        this.isExempt = isExempt;
    }

    public Character getIsNexus() {
        return isNexus;
    }

    public void setIsNexus(Character isNexus) {
        this.isNexus = isNexus;
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

    public TaxAuthority getTaxAuthority() {
        return taxAuthority;
    }

    public void setTaxAuthority(TaxAuthority taxAuthority) {
        this.taxAuthority = taxAuthority;
    }

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (partyTaxAuthInfoPK != null ? partyTaxAuthInfoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PartyTaxAuthInfo)) {
            return false;
        }
        PartyTaxAuthInfo other = (PartyTaxAuthInfo) object;
        if ((this.partyTaxAuthInfoPK == null && other.partyTaxAuthInfoPK != null) || (this.partyTaxAuthInfoPK != null && !this.partyTaxAuthInfoPK.equals(other.partyTaxAuthInfoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PartyTaxAuthInfo[ partyTaxAuthInfoPK=" + partyTaxAuthInfoPK + " ]";
    }
    
}
