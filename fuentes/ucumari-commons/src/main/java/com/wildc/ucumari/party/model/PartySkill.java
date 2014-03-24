/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.party.model;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "party_skill")
@NamedQueries({
    @NamedQuery(name = "PartySkill.findAll", query = "SELECT p FROM PartySkill p")})
public class PartySkill implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PartySkillPK partySkillPK;
    @Column(name = "YEARS_EXPERIENCE")
    private BigInteger yearsExperience;
    @Column(name = "RATING")
    private BigInteger rating;
    @Column(name = "SKILL_LEVEL")
    private BigInteger skillLevel;
    @Column(name = "STARTED_USING_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startedUsingDate;
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
    @JoinColumn(name = "SKILL_TYPE_ID", referencedColumnName = "SKILL_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private SkillType skillType;
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Party party;

    public PartySkill() {
    }

    public PartySkill(PartySkillPK partySkillPK) {
        this.partySkillPK = partySkillPK;
    }

    public PartySkill(String partyId, String skillTypeId) {
        this.partySkillPK = new PartySkillPK(partyId, skillTypeId);
    }

    public PartySkillPK getPartySkillPK() {
        return partySkillPK;
    }

    public void setPartySkillPK(PartySkillPK partySkillPK) {
        this.partySkillPK = partySkillPK;
    }

    public BigInteger getYearsExperience() {
        return yearsExperience;
    }

    public void setYearsExperience(BigInteger yearsExperience) {
        this.yearsExperience = yearsExperience;
    }

    public BigInteger getRating() {
        return rating;
    }

    public void setRating(BigInteger rating) {
        this.rating = rating;
    }

    public BigInteger getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(BigInteger skillLevel) {
        this.skillLevel = skillLevel;
    }

    public Date getStartedUsingDate() {
        return startedUsingDate;
    }

    public void setStartedUsingDate(Date startedUsingDate) {
        this.startedUsingDate = startedUsingDate;
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

    public SkillType getSkillType() {
        return skillType;
    }

    public void setSkillType(SkillType skillType) {
        this.skillType = skillType;
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
        hash += (partySkillPK != null ? partySkillPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PartySkill)) {
            return false;
        }
        PartySkill other = (PartySkill) object;
        if ((this.partySkillPK == null && other.partySkillPK != null) || (this.partySkillPK != null && !this.partySkillPK.equals(other.partySkillPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PartySkill[ partySkillPK=" + partySkillPK + " ]";
    }
    
}
