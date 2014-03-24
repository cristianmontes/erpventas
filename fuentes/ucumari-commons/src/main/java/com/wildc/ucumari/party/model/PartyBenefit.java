/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.party.model;

import com.wildc.ucumari.client.modelo.BenefitType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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
@Table(name = "party_benefit")
@NamedQueries({
    @NamedQuery(name = "PartyBenefit.findAll", query = "SELECT p FROM PartyBenefit p")})
public class PartyBenefit implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PartyBenefitPK partyBenefitPK;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
    @Column(name = "PERIOD_TYPE_ID")
    private String periodTypeId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "COST")
    private BigDecimal cost;
    @Column(name = "ACTUAL_EMPLOYER_PAID_PERCENT")
    private BigDecimal actualEmployerPaidPercent;
    @Column(name = "AVAILABLE_TIME")
    private BigInteger availableTime;
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
    @JoinColumn(name = "PARTY_ID_TO", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Party party;
    @JoinColumns({
        @JoinColumn(name = "PARTY_ID_TO", referencedColumnName = "PARTY_ID", insertable = false, updatable = false),
        @JoinColumn(name = "ROLE_TYPE_ID_TO", referencedColumnName = "ROLE_TYPE_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private PartyRole partyRole;
    @JoinColumn(name = "PARTY_ID_FROM", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Party party1;
    @JoinColumns({
        @JoinColumn(name = "PARTY_ID_FROM", referencedColumnName = "PARTY_ID", insertable = false, updatable = false),
        @JoinColumn(name = "ROLE_TYPE_ID_FROM", referencedColumnName = "ROLE_TYPE_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private PartyRole partyRole1;
    @JoinColumn(name = "BENEFIT_TYPE_ID", referencedColumnName = "BENEFIT_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private BenefitType benefitType;

    public PartyBenefit() {
    }

    public PartyBenefit(PartyBenefitPK partyBenefitPK) {
        this.partyBenefitPK = partyBenefitPK;
    }

    public PartyBenefit(String roleTypeIdFrom, String roleTypeIdTo, String partyIdFrom, String partyIdTo, String benefitTypeId, Date fromDate) {
        this.partyBenefitPK = new PartyBenefitPK(roleTypeIdFrom, roleTypeIdTo, partyIdFrom, partyIdTo, benefitTypeId, fromDate);
    }

    public PartyBenefitPK getPartyBenefitPK() {
        return partyBenefitPK;
    }

    public void setPartyBenefitPK(PartyBenefitPK partyBenefitPK) {
        this.partyBenefitPK = partyBenefitPK;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
    }

    public String getPeriodTypeId() {
        return periodTypeId;
    }

    public void setPeriodTypeId(String periodTypeId) {
        this.periodTypeId = periodTypeId;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public BigDecimal getActualEmployerPaidPercent() {
        return actualEmployerPaidPercent;
    }

    public void setActualEmployerPaidPercent(BigDecimal actualEmployerPaidPercent) {
        this.actualEmployerPaidPercent = actualEmployerPaidPercent;
    }

    public BigInteger getAvailableTime() {
        return availableTime;
    }

    public void setAvailableTime(BigInteger availableTime) {
        this.availableTime = availableTime;
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

    public PartyRole getPartyRole() {
        return partyRole;
    }

    public void setPartyRole(PartyRole partyRole) {
        this.partyRole = partyRole;
    }

    public Party getParty1() {
        return party1;
    }

    public void setParty1(Party party1) {
        this.party1 = party1;
    }

    public PartyRole getPartyRole1() {
        return partyRole1;
    }

    public void setPartyRole1(PartyRole partyRole1) {
        this.partyRole1 = partyRole1;
    }

    public BenefitType getBenefitType() {
        return benefitType;
    }

    public void setBenefitType(BenefitType benefitType) {
        this.benefitType = benefitType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (partyBenefitPK != null ? partyBenefitPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PartyBenefit)) {
            return false;
        }
        PartyBenefit other = (PartyBenefit) object;
        if ((this.partyBenefitPK == null && other.partyBenefitPK != null) || (this.partyBenefitPK != null && !this.partyBenefitPK.equals(other.partyBenefitPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PartyBenefit[ partyBenefitPK=" + partyBenefitPK + " ]";
    }
    
}
