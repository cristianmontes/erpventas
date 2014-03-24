/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.accounting.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class AcctgTransEntryRolePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ACCTG_TRANS_ID")
    private String acctgTransId;
    @Basic(optional = false)
    @Column(name = "ACCTG_TRANS_ENTRY_SEQ_ID")
    private String acctgTransEntrySeqId;
    @Basic(optional = false)
    @Column(name = "PARTY_ID")
    private String partyId;
    @Basic(optional = false)
    @Column(name = "ROLE_TYPE_ID")
    private String roleTypeId;

    public AcctgTransEntryRolePK() {
    }

    public AcctgTransEntryRolePK(String acctgTransId, String acctgTransEntrySeqId, String partyId, String roleTypeId) {
        this.acctgTransId = acctgTransId;
        this.acctgTransEntrySeqId = acctgTransEntrySeqId;
        this.partyId = partyId;
        this.roleTypeId = roleTypeId;
    }

    public String getAcctgTransId() {
        return acctgTransId;
    }

    public void setAcctgTransId(String acctgTransId) {
        this.acctgTransId = acctgTransId;
    }

    public String getAcctgTransEntrySeqId() {
        return acctgTransEntrySeqId;
    }

    public void setAcctgTransEntrySeqId(String acctgTransEntrySeqId) {
        this.acctgTransEntrySeqId = acctgTransEntrySeqId;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public String getRoleTypeId() {
        return roleTypeId;
    }

    public void setRoleTypeId(String roleTypeId) {
        this.roleTypeId = roleTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (acctgTransId != null ? acctgTransId.hashCode() : 0);
        hash += (acctgTransEntrySeqId != null ? acctgTransEntrySeqId.hashCode() : 0);
        hash += (partyId != null ? partyId.hashCode() : 0);
        hash += (roleTypeId != null ? roleTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AcctgTransEntryRolePK)) {
            return false;
        }
        AcctgTransEntryRolePK other = (AcctgTransEntryRolePK) object;
        if ((this.acctgTransId == null && other.acctgTransId != null) || (this.acctgTransId != null && !this.acctgTransId.equals(other.acctgTransId))) {
            return false;
        }
        if ((this.acctgTransEntrySeqId == null && other.acctgTransEntrySeqId != null) || (this.acctgTransEntrySeqId != null && !this.acctgTransEntrySeqId.equals(other.acctgTransEntrySeqId))) {
            return false;
        }
        if ((this.partyId == null && other.partyId != null) || (this.partyId != null && !this.partyId.equals(other.partyId))) {
            return false;
        }
        if ((this.roleTypeId == null && other.roleTypeId != null) || (this.roleTypeId != null && !this.roleTypeId.equals(other.roleTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.AcctgTransEntryRolePK[ acctgTransId=" + acctgTransId + ", acctgTransEntrySeqId=" + acctgTransEntrySeqId + ", partyId=" + partyId + ", roleTypeId=" + roleTypeId + " ]";
    }
    
}
