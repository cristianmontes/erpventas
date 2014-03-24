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
public class PartyGlAccountPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ORGANIZATION_PARTY_ID")
    private String organizationPartyId;
    @Basic(optional = false)
    @Column(name = "PARTY_ID")
    private String partyId;
    @Basic(optional = false)
    @Column(name = "ROLE_TYPE_ID")
    private String roleTypeId;
    @Basic(optional = false)
    @Column(name = "GL_ACCOUNT_TYPE_ID")
    private String glAccountTypeId;

    public PartyGlAccountPK() {
    }

    public PartyGlAccountPK(String organizationPartyId, String partyId, String roleTypeId, String glAccountTypeId) {
        this.organizationPartyId = organizationPartyId;
        this.partyId = partyId;
        this.roleTypeId = roleTypeId;
        this.glAccountTypeId = glAccountTypeId;
    }

    public String getOrganizationPartyId() {
        return organizationPartyId;
    }

    public void setOrganizationPartyId(String organizationPartyId) {
        this.organizationPartyId = organizationPartyId;
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

    public String getGlAccountTypeId() {
        return glAccountTypeId;
    }

    public void setGlAccountTypeId(String glAccountTypeId) {
        this.glAccountTypeId = glAccountTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (organizationPartyId != null ? organizationPartyId.hashCode() : 0);
        hash += (partyId != null ? partyId.hashCode() : 0);
        hash += (roleTypeId != null ? roleTypeId.hashCode() : 0);
        hash += (glAccountTypeId != null ? glAccountTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PartyGlAccountPK)) {
            return false;
        }
        PartyGlAccountPK other = (PartyGlAccountPK) object;
        if ((this.organizationPartyId == null && other.organizationPartyId != null) || (this.organizationPartyId != null && !this.organizationPartyId.equals(other.organizationPartyId))) {
            return false;
        }
        if ((this.partyId == null && other.partyId != null) || (this.partyId != null && !this.partyId.equals(other.partyId))) {
            return false;
        }
        if ((this.roleTypeId == null && other.roleTypeId != null) || (this.roleTypeId != null && !this.roleTypeId.equals(other.roleTypeId))) {
            return false;
        }
        if ((this.glAccountTypeId == null && other.glAccountTypeId != null) || (this.glAccountTypeId != null && !this.glAccountTypeId.equals(other.glAccountTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PartyGlAccountPK[ organizationPartyId=" + organizationPartyId + ", partyId=" + partyId + ", roleTypeId=" + roleTypeId + ", glAccountTypeId=" + glAccountTypeId + " ]";
    }
    
}
