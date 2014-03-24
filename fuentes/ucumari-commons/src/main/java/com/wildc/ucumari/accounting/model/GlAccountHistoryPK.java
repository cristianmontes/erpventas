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
public class GlAccountHistoryPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "GL_ACCOUNT_ID")
    private String glAccountId;
    @Basic(optional = false)
    @Column(name = "ORGANIZATION_PARTY_ID")
    private String organizationPartyId;
    @Basic(optional = false)
    @Column(name = "CUSTOM_TIME_PERIOD_ID")
    private String customTimePeriodId;

    public GlAccountHistoryPK() {
    }

    public GlAccountHistoryPK(String glAccountId, String organizationPartyId, String customTimePeriodId) {
        this.glAccountId = glAccountId;
        this.organizationPartyId = organizationPartyId;
        this.customTimePeriodId = customTimePeriodId;
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

    public String getCustomTimePeriodId() {
        return customTimePeriodId;
    }

    public void setCustomTimePeriodId(String customTimePeriodId) {
        this.customTimePeriodId = customTimePeriodId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (glAccountId != null ? glAccountId.hashCode() : 0);
        hash += (organizationPartyId != null ? organizationPartyId.hashCode() : 0);
        hash += (customTimePeriodId != null ? customTimePeriodId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GlAccountHistoryPK)) {
            return false;
        }
        GlAccountHistoryPK other = (GlAccountHistoryPK) object;
        if ((this.glAccountId == null && other.glAccountId != null) || (this.glAccountId != null && !this.glAccountId.equals(other.glAccountId))) {
            return false;
        }
        if ((this.organizationPartyId == null && other.organizationPartyId != null) || (this.organizationPartyId != null && !this.organizationPartyId.equals(other.organizationPartyId))) {
            return false;
        }
        if ((this.customTimePeriodId == null && other.customTimePeriodId != null) || (this.customTimePeriodId != null && !this.customTimePeriodId.equals(other.customTimePeriodId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.GlAccountHistoryPK[ glAccountId=" + glAccountId + ", organizationPartyId=" + organizationPartyId + ", customTimePeriodId=" + customTimePeriodId + " ]";
    }
    
}
