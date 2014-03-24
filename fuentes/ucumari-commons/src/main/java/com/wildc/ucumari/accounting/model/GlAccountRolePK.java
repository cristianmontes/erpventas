/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.accounting.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Embeddable
public class GlAccountRolePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "GL_ACCOUNT_ID")
    private String glAccountId;
    @Basic(optional = false)
    @Column(name = "PARTY_ID")
    private String partyId;
    @Basic(optional = false)
    @Column(name = "ROLE_TYPE_ID")
    private String roleTypeId;
    @Basic(optional = false)
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;

    public GlAccountRolePK() {
    }

    public GlAccountRolePK(String glAccountId, String partyId, String roleTypeId, Date fromDate) {
        this.glAccountId = glAccountId;
        this.partyId = partyId;
        this.roleTypeId = roleTypeId;
        this.fromDate = fromDate;
    }

    public String getGlAccountId() {
        return glAccountId;
    }

    public void setGlAccountId(String glAccountId) {
        this.glAccountId = glAccountId;
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

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (glAccountId != null ? glAccountId.hashCode() : 0);
        hash += (partyId != null ? partyId.hashCode() : 0);
        hash += (roleTypeId != null ? roleTypeId.hashCode() : 0);
        hash += (fromDate != null ? fromDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GlAccountRolePK)) {
            return false;
        }
        GlAccountRolePK other = (GlAccountRolePK) object;
        if ((this.glAccountId == null && other.glAccountId != null) || (this.glAccountId != null && !this.glAccountId.equals(other.glAccountId))) {
            return false;
        }
        if ((this.partyId == null && other.partyId != null) || (this.partyId != null && !this.partyId.equals(other.partyId))) {
            return false;
        }
        if ((this.roleTypeId == null && other.roleTypeId != null) || (this.roleTypeId != null && !this.roleTypeId.equals(other.roleTypeId))) {
            return false;
        }
        if ((this.fromDate == null && other.fromDate != null) || (this.fromDate != null && !this.fromDate.equals(other.fromDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.GlAccountRolePK[ glAccountId=" + glAccountId + ", partyId=" + partyId + ", roleTypeId=" + roleTypeId + ", fromDate=" + fromDate + " ]";
    }
    
}
