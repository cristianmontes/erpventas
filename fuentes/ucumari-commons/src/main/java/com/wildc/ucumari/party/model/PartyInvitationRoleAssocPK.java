/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.party.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class PartyInvitationRoleAssocPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PARTY_INVITATION_ID")
    private String partyInvitationId;
    @Basic(optional = false)
    @Column(name = "ROLE_TYPE_ID")
    private String roleTypeId;

    public PartyInvitationRoleAssocPK() {
    }

    public PartyInvitationRoleAssocPK(String partyInvitationId, String roleTypeId) {
        this.partyInvitationId = partyInvitationId;
        this.roleTypeId = roleTypeId;
    }

    public String getPartyInvitationId() {
        return partyInvitationId;
    }

    public void setPartyInvitationId(String partyInvitationId) {
        this.partyInvitationId = partyInvitationId;
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
        hash += (partyInvitationId != null ? partyInvitationId.hashCode() : 0);
        hash += (roleTypeId != null ? roleTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PartyInvitationRoleAssocPK)) {
            return false;
        }
        PartyInvitationRoleAssocPK other = (PartyInvitationRoleAssocPK) object;
        if ((this.partyInvitationId == null && other.partyInvitationId != null) || (this.partyInvitationId != null && !this.partyInvitationId.equals(other.partyInvitationId))) {
            return false;
        }
        if ((this.roleTypeId == null && other.roleTypeId != null) || (this.roleTypeId != null && !this.roleTypeId.equals(other.roleTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PartyInvitationRoleAssocPK[ partyInvitationId=" + partyInvitationId + ", roleTypeId=" + roleTypeId + " ]";
    }
    
}
