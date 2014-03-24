/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.accounting.model;

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
@Table(name = "gl_account_role")
@NamedQueries({
    @NamedQuery(name = "GlAccountRole.findAll", query = "SELECT g FROM GlAccountRole g")})
public class GlAccountRole implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GlAccountRolePK glAccountRolePK;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
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
    @JoinColumn(name = "GL_ACCOUNT_ID", referencedColumnName = "GL_ACCOUNT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private GlAccount glAccount;

    public GlAccountRole() {
    }

    public GlAccountRole(GlAccountRolePK glAccountRolePK) {
        this.glAccountRolePK = glAccountRolePK;
    }

    public GlAccountRole(String glAccountId, String partyId, String roleTypeId, Date fromDate) {
        this.glAccountRolePK = new GlAccountRolePK(glAccountId, partyId, roleTypeId, fromDate);
    }

    public GlAccountRolePK getGlAccountRolePK() {
        return glAccountRolePK;
    }

    public void setGlAccountRolePK(GlAccountRolePK glAccountRolePK) {
        this.glAccountRolePK = glAccountRolePK;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
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

    public GlAccount getGlAccount() {
        return glAccount;
    }

    public void setGlAccount(GlAccount glAccount) {
        this.glAccount = glAccount;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (glAccountRolePK != null ? glAccountRolePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GlAccountRole)) {
            return false;
        }
        GlAccountRole other = (GlAccountRole) object;
        if ((this.glAccountRolePK == null && other.glAccountRolePK != null) || (this.glAccountRolePK != null && !this.glAccountRolePK.equals(other.glAccountRolePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.GlAccountRole[ glAccountRolePK=" + glAccountRolePK + " ]";
    }
    
}
