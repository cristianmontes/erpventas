/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.budget.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.party.model.Party;
import com.wildc.ucumari.party.model.PartyRole;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "budget_role")
public class BudgetRole implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected BudgetRolePK budgetRolePK;
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
    @JoinColumn(name = "BUDGET_ID", referencedColumnName = "BUDGET_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Budget budget;

    public BudgetRole() {
    }

    public BudgetRole(BudgetRolePK budgetRolePK) {
        this.budgetRolePK = budgetRolePK;
    }

    public BudgetRole(String budgetId, String partyId, String roleTypeId) {
        this.budgetRolePK = new BudgetRolePK(budgetId, partyId, roleTypeId);
    }

    public BudgetRolePK getBudgetRolePK() {
        return budgetRolePK;
    }

    public void setBudgetRolePK(BudgetRolePK budgetRolePK) {
        this.budgetRolePK = budgetRolePK;
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

    public Budget getBudget() {
        return budget;
    }

    public void setBudget(Budget budget) {
        this.budget = budget;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (budgetRolePK != null ? budgetRolePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BudgetRole)) {
            return false;
        }
        BudgetRole other = (BudgetRole) object;
        if ((this.budgetRolePK == null && other.budgetRolePK != null) || (this.budgetRolePK != null && !this.budgetRolePK.equals(other.budgetRolePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.BudgetRole[ budgetRolePK=" + budgetRolePK + " ]";
    }
    
}
