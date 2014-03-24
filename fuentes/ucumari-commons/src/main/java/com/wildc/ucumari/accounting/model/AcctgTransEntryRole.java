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
@Table(name = "acctg_trans_entry_role")
@NamedQueries({
    @NamedQuery(name = "AcctgTransEntryRole.findAll", query = "SELECT a FROM AcctgTransEntryRole a")})
public class AcctgTransEntryRole implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AcctgTransEntryRolePK acctgTransEntryRolePK;
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
    @JoinColumns({
        @JoinColumn(name = "ACCTG_TRANS_ID", referencedColumnName = "ACCTG_TRANS_ID", insertable = false, updatable = false),
        @JoinColumn(name = "ACCTG_TRANS_ENTRY_SEQ_ID", referencedColumnName = "ACCTG_TRANS_ENTRY_SEQ_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private AcctgTransEntry acctgTransEntry;

    public AcctgTransEntryRole() {
    }

    public AcctgTransEntryRole(AcctgTransEntryRolePK acctgTransEntryRolePK) {
        this.acctgTransEntryRolePK = acctgTransEntryRolePK;
    }

    public AcctgTransEntryRole(String acctgTransId, String acctgTransEntrySeqId, String partyId, String roleTypeId) {
        this.acctgTransEntryRolePK = new AcctgTransEntryRolePK(acctgTransId, acctgTransEntrySeqId, partyId, roleTypeId);
    }

    public AcctgTransEntryRolePK getAcctgTransEntryRolePK() {
        return acctgTransEntryRolePK;
    }

    public void setAcctgTransEntryRolePK(AcctgTransEntryRolePK acctgTransEntryRolePK) {
        this.acctgTransEntryRolePK = acctgTransEntryRolePK;
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

    public AcctgTransEntry getAcctgTransEntry() {
        return acctgTransEntry;
    }

    public void setAcctgTransEntry(AcctgTransEntry acctgTransEntry) {
        this.acctgTransEntry = acctgTransEntry;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (acctgTransEntryRolePK != null ? acctgTransEntryRolePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AcctgTransEntryRole)) {
            return false;
        }
        AcctgTransEntryRole other = (AcctgTransEntryRole) object;
        if ((this.acctgTransEntryRolePK == null && other.acctgTransEntryRolePK != null) || (this.acctgTransEntryRolePK != null && !this.acctgTransEntryRolePK.equals(other.acctgTransEntryRolePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.AcctgTransEntryRole[ acctgTransEntryRolePK=" + acctgTransEntryRolePK + " ]";
    }
    
}
