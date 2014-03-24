/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.agreement.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class AgreementTypeForRoleTypePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ORGANIZATION_PARTY_ID")
    private String organizationPartyId;
    @Basic(optional = false)
    @Column(name = "ROLE_TYPE_ID")
    private String roleTypeId;
    @Basic(optional = false)
    @Column(name = "AGREEMENT_TYPE_ID")
    private String agreementTypeId;

    public AgreementTypeForRoleTypePK() {
    }

    public AgreementTypeForRoleTypePK(String organizationPartyId, String roleTypeId, String agreementTypeId) {
        this.organizationPartyId = organizationPartyId;
        this.roleTypeId = roleTypeId;
        this.agreementTypeId = agreementTypeId;
    }

    public String getOrganizationPartyId() {
        return organizationPartyId;
    }

    public void setOrganizationPartyId(String organizationPartyId) {
        this.organizationPartyId = organizationPartyId;
    }

    public String getRoleTypeId() {
        return roleTypeId;
    }

    public void setRoleTypeId(String roleTypeId) {
        this.roleTypeId = roleTypeId;
    }

    public String getAgreementTypeId() {
        return agreementTypeId;
    }

    public void setAgreementTypeId(String agreementTypeId) {
        this.agreementTypeId = agreementTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (organizationPartyId != null ? organizationPartyId.hashCode() : 0);
        hash += (roleTypeId != null ? roleTypeId.hashCode() : 0);
        hash += (agreementTypeId != null ? agreementTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AgreementTypeForRoleTypePK)) {
            return false;
        }
        AgreementTypeForRoleTypePK other = (AgreementTypeForRoleTypePK) object;
        if ((this.organizationPartyId == null && other.organizationPartyId != null) || (this.organizationPartyId != null && !this.organizationPartyId.equals(other.organizationPartyId))) {
            return false;
        }
        if ((this.roleTypeId == null && other.roleTypeId != null) || (this.roleTypeId != null && !this.roleTypeId.equals(other.roleTypeId))) {
            return false;
        }
        if ((this.agreementTypeId == null && other.agreementTypeId != null) || (this.agreementTypeId != null && !this.agreementTypeId.equals(other.agreementTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.AgreementTypeForRoleTypePK[ organizationPartyId=" + organizationPartyId + ", roleTypeId=" + roleTypeId + ", agreementTypeId=" + agreementTypeId + " ]";
    }
    
}
