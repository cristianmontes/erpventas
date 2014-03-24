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
public class PartyNeedPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PARTY_NEED_ID")
    private String partyNeedId;
    @Basic(optional = false)
    @Column(name = "PARTY_ID")
    private String partyId;
    @Basic(optional = false)
    @Column(name = "ROLE_TYPE_ID")
    private String roleTypeId;

    public PartyNeedPK() {
    }

    public PartyNeedPK(String partyNeedId, String partyId, String roleTypeId) {
        this.partyNeedId = partyNeedId;
        this.partyId = partyId;
        this.roleTypeId = roleTypeId;
    }

    public String getPartyNeedId() {
        return partyNeedId;
    }

    public void setPartyNeedId(String partyNeedId) {
        this.partyNeedId = partyNeedId;
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
        hash += (partyNeedId != null ? partyNeedId.hashCode() : 0);
        hash += (partyId != null ? partyId.hashCode() : 0);
        hash += (roleTypeId != null ? roleTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PartyNeedPK)) {
            return false;
        }
        PartyNeedPK other = (PartyNeedPK) object;
        if ((this.partyNeedId == null && other.partyNeedId != null) || (this.partyNeedId != null && !this.partyNeedId.equals(other.partyNeedId))) {
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
        return "com.wildc.ucumari.client.modelo.PartyNeedPK[ partyNeedId=" + partyNeedId + ", partyId=" + partyId + ", roleTypeId=" + roleTypeId + " ]";
    }
    
}
