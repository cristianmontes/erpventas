/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.party.model;

import com.wildc.ucumari.accounting.model.GlAccount;
import com.wildc.ucumari.accounting.model.GlAccountType;

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
@Table(name = "party_gl_account")
@NamedQueries({
    @NamedQuery(name = "PartyGlAccount.findAll", query = "SELECT p FROM PartyGlAccount p")})
public class PartyGlAccount implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PartyGlAccountPK partyGlAccountPK;
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
        @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false),
        @JoinColumn(name = "ROLE_TYPE_ID", referencedColumnName = "ROLE_TYPE_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private PartyRole partyRole;
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Party party;
    @JoinColumn(name = "ORGANIZATION_PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Party party1;
    @JoinColumn(name = "GL_ACCOUNT_TYPE_ID", referencedColumnName = "GL_ACCOUNT_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private GlAccountType glAccountType;
    @JoinColumn(name = "GL_ACCOUNT_ID", referencedColumnName = "GL_ACCOUNT_ID")
    @ManyToOne
    private GlAccount glAccountId;

    public PartyGlAccount() {
    }

    public PartyGlAccount(PartyGlAccountPK partyGlAccountPK) {
        this.partyGlAccountPK = partyGlAccountPK;
    }

    public PartyGlAccount(String organizationPartyId, String partyId, String roleTypeId, String glAccountTypeId) {
        this.partyGlAccountPK = new PartyGlAccountPK(organizationPartyId, partyId, roleTypeId, glAccountTypeId);
    }

    public PartyGlAccountPK getPartyGlAccountPK() {
        return partyGlAccountPK;
    }

    public void setPartyGlAccountPK(PartyGlAccountPK partyGlAccountPK) {
        this.partyGlAccountPK = partyGlAccountPK;
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

    public PartyRole getPartyRole() {
        return partyRole;
    }

    public void setPartyRole(PartyRole partyRole) {
        this.partyRole = partyRole;
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

    public GlAccountType getGlAccountType() {
        return glAccountType;
    }

    public void setGlAccountType(GlAccountType glAccountType) {
        this.glAccountType = glAccountType;
    }

    public GlAccount getGlAccountId() {
        return glAccountId;
    }

    public void setGlAccountId(GlAccount glAccountId) {
        this.glAccountId = glAccountId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (partyGlAccountPK != null ? partyGlAccountPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PartyGlAccount)) {
            return false;
        }
        PartyGlAccount other = (PartyGlAccount) object;
        if ((this.partyGlAccountPK == null && other.partyGlAccountPK != null) || (this.partyGlAccountPK != null && !this.partyGlAccountPK.equals(other.partyGlAccountPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PartyGlAccount[ partyGlAccountPK=" + partyGlAccountPK + " ]";
    }
    
}
