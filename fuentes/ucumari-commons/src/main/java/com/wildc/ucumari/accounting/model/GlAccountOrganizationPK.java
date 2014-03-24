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
public class GlAccountOrganizationPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "GL_ACCOUNT_ID")
    private String glAccountId;
    @Basic(optional = false)
    @Column(name = "ORGANIZATION_PARTY_ID")
    private String organizationPartyId;

    public GlAccountOrganizationPK() {
    }

    public GlAccountOrganizationPK(String glAccountId, String organizationPartyId) {
        this.glAccountId = glAccountId;
        this.organizationPartyId = organizationPartyId;
    }

    public String getGlAccountId() {
        return glAccountId;
    }

    public void setGlAccountId(String glAccountId) {
        this.glAccountId = glAccountId;
    }

    public String getOrganizationPartyId() {
        return organizationPartyId;
    }

    public void setOrganizationPartyId(String organizationPartyId) {
        this.organizationPartyId = organizationPartyId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (glAccountId != null ? glAccountId.hashCode() : 0);
        hash += (organizationPartyId != null ? organizationPartyId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GlAccountOrganizationPK)) {
            return false;
        }
        GlAccountOrganizationPK other = (GlAccountOrganizationPK) object;
        if ((this.glAccountId == null && other.glAccountId != null) || (this.glAccountId != null && !this.glAccountId.equals(other.glAccountId))) {
            return false;
        }
        if ((this.organizationPartyId == null && other.organizationPartyId != null) || (this.organizationPartyId != null && !this.organizationPartyId.equals(other.organizationPartyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.GlAccountOrganizationPK[ glAccountId=" + glAccountId + ", organizationPartyId=" + organizationPartyId + " ]";
    }
    
}
