/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.party.model;

import com.wildc.ucumari.client.modelo.RateType;
import com.wildc.ucumari.parameters.model.Uom;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "party_rate")
@NamedQueries({
    @NamedQuery(name = "PartyRate.findAll", query = "SELECT p FROM PartyRate p")})
public class PartyRate implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PartyRatePK partyRatePK;
    @Column(name = "DEFAULT_RATE")
    private Character defaultRate;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "RATE")
    private BigDecimal rate;
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
    @JoinColumn(name = "RATE_TYPE_ID", referencedColumnName = "RATE_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private RateType rateType;
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Party party;
    @JoinColumn(name = "CURRENCY_UOM_ID", referencedColumnName = "UOM_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Uom uom;

    public PartyRate() {
    }

    public PartyRate(PartyRatePK partyRatePK) {
        this.partyRatePK = partyRatePK;
    }

    public PartyRate(String partyId, String rateTypeId, String currencyUomId, Date fromDate) {
        this.partyRatePK = new PartyRatePK(partyId, rateTypeId, currencyUomId, fromDate);
    }

    public PartyRatePK getPartyRatePK() {
        return partyRatePK;
    }

    public void setPartyRatePK(PartyRatePK partyRatePK) {
        this.partyRatePK = partyRatePK;
    }

    public Character getDefaultRate() {
        return defaultRate;
    }

    public void setDefaultRate(Character defaultRate) {
        this.defaultRate = defaultRate;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
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

    public RateType getRateType() {
        return rateType;
    }

    public void setRateType(RateType rateType) {
        this.rateType = rateType;
    }

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    public Uom getUom() {
        return uom;
    }

    public void setUom(Uom uom) {
        this.uom = uom;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (partyRatePK != null ? partyRatePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PartyRate)) {
            return false;
        }
        PartyRate other = (PartyRate) object;
        if ((this.partyRatePK == null && other.partyRatePK != null) || (this.partyRatePK != null && !this.partyRatePK.equals(other.partyRatePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PartyRate[ partyRatePK=" + partyRatePK + " ]";
    }
    
}
