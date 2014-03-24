/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.party.model;

import com.wildc.ucumari.parameters.model.Geo;

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
@Table(name = "party_tax_info")
@NamedQueries({
    @NamedQuery(name = "PartyTaxInfo.findAll", query = "SELECT p FROM PartyTaxInfo p")})
public class PartyTaxInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PartyTaxInfoPK partyTaxInfoPK;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
    @Column(name = "PARTY_TAX_ID")
    private String partyTaxId;
    @Column(name = "IS_EXEMPT")
    private Character isExempt;
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
    @JoinColumn(name = "GEO_ID", referencedColumnName = "GEO_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Geo geo;

    public PartyTaxInfo() {
    }

    public PartyTaxInfo(PartyTaxInfoPK partyTaxInfoPK) {
        this.partyTaxInfoPK = partyTaxInfoPK;
    }

    public PartyTaxInfo(String partyId, String geoId, Date fromDate) {
        this.partyTaxInfoPK = new PartyTaxInfoPK(partyId, geoId, fromDate);
    }

    public PartyTaxInfoPK getPartyTaxInfoPK() {
        return partyTaxInfoPK;
    }

    public void setPartyTaxInfoPK(PartyTaxInfoPK partyTaxInfoPK) {
        this.partyTaxInfoPK = partyTaxInfoPK;
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

    public Geo getGeo() {
        return geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (partyTaxInfoPK != null ? partyTaxInfoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PartyTaxInfo)) {
            return false;
        }
        PartyTaxInfo other = (PartyTaxInfo) object;
        if ((this.partyTaxInfoPK == null && other.partyTaxInfoPK != null) || (this.partyTaxInfoPK != null && !this.partyTaxInfoPK.equals(other.partyTaxInfoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PartyTaxInfo[ partyTaxInfoPK=" + partyTaxInfoPK + " ]";
    }
    
}
