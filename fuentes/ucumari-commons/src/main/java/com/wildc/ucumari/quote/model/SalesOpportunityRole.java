/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.quote.model;

import com.wildc.ucumari.parameters.model.RoleType;
import com.wildc.ucumari.party.model.Party;
import com.wildc.ucumari.party.model.PartyRole;

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
@Table(name = "sales_opportunity_role")
@NamedQueries({
    @NamedQuery(name = "SalesOpportunityRole.findAll", query = "SELECT s FROM SalesOpportunityRole s")})
public class SalesOpportunityRole implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SalesOpportunityRolePK salesOpportunityRolePK;
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
    @JoinColumn(name = "SALES_OPPORTUNITY_ID", referencedColumnName = "SALES_OPPORTUNITY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private SalesOpportunity salesOpportunity;
    @JoinColumn(name = "ROLE_TYPE_ID", referencedColumnName = "ROLE_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private RoleType roleType;
    @JoinColumns({
        @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false),
        @JoinColumn(name = "ROLE_TYPE_ID", referencedColumnName = "ROLE_TYPE_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private PartyRole partyRole;
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Party party;

    public SalesOpportunityRole() {
    }

    public SalesOpportunityRole(SalesOpportunityRolePK salesOpportunityRolePK) {
        this.salesOpportunityRolePK = salesOpportunityRolePK;
    }

    public SalesOpportunityRole(String salesOpportunityId, String partyId, String roleTypeId) {
        this.salesOpportunityRolePK = new SalesOpportunityRolePK(salesOpportunityId, partyId, roleTypeId);
    }

    public SalesOpportunityRolePK getSalesOpportunityRolePK() {
        return salesOpportunityRolePK;
    }

    public void setSalesOpportunityRolePK(SalesOpportunityRolePK salesOpportunityRolePK) {
        this.salesOpportunityRolePK = salesOpportunityRolePK;
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

    public SalesOpportunity getSalesOpportunity() {
        return salesOpportunity;
    }

    public void setSalesOpportunity(SalesOpportunity salesOpportunity) {
        this.salesOpportunity = salesOpportunity;
    }

    public RoleType getRoleType() {
        return roleType;
    }

    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (salesOpportunityRolePK != null ? salesOpportunityRolePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SalesOpportunityRole)) {
            return false;
        }
        SalesOpportunityRole other = (SalesOpportunityRole) object;
        if ((this.salesOpportunityRolePK == null && other.salesOpportunityRolePK != null) || (this.salesOpportunityRolePK != null && !this.salesOpportunityRolePK.equals(other.salesOpportunityRolePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.SalesOpportunityRole[ salesOpportunityRolePK=" + salesOpportunityRolePK + " ]";
    }
    
}
