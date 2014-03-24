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
public class AcctgTagEnumTypePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ORGANIZATION_PARTY_ID")
    private String organizationPartyId;
    @Basic(optional = false)
    @Column(name = "ACCTG_TAG_USAGE_TYPE_ID")
    private String acctgTagUsageTypeId;

    public AcctgTagEnumTypePK() {
    }

    public AcctgTagEnumTypePK(String organizationPartyId, String acctgTagUsageTypeId) {
        this.organizationPartyId = organizationPartyId;
        this.acctgTagUsageTypeId = acctgTagUsageTypeId;
    }

    public String getOrganizationPartyId() {
        return organizationPartyId;
    }

    public void setOrganizationPartyId(String organizationPartyId) {
        this.organizationPartyId = organizationPartyId;
    }

    public String getAcctgTagUsageTypeId() {
        return acctgTagUsageTypeId;
    }

    public void setAcctgTagUsageTypeId(String acctgTagUsageTypeId) {
        this.acctgTagUsageTypeId = acctgTagUsageTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (organizationPartyId != null ? organizationPartyId.hashCode() : 0);
        hash += (acctgTagUsageTypeId != null ? acctgTagUsageTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AcctgTagEnumTypePK)) {
            return false;
        }
        AcctgTagEnumTypePK other = (AcctgTagEnumTypePK) object;
        if ((this.organizationPartyId == null && other.organizationPartyId != null) || (this.organizationPartyId != null && !this.organizationPartyId.equals(other.organizationPartyId))) {
            return false;
        }
        if ((this.acctgTagUsageTypeId == null && other.acctgTagUsageTypeId != null) || (this.acctgTagUsageTypeId != null && !this.acctgTagUsageTypeId.equals(other.acctgTagUsageTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.AcctgTagEnumTypePK[ organizationPartyId=" + organizationPartyId + ", acctgTagUsageTypeId=" + acctgTagUsageTypeId + " ]";
    }
    
}
