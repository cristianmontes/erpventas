/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.party.model;

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
public class PartyBenefitPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ROLE_TYPE_ID_FROM")
    private String roleTypeIdFrom;
    @Basic(optional = false)
    @Column(name = "ROLE_TYPE_ID_TO")
    private String roleTypeIdTo;
    @Basic(optional = false)
    @Column(name = "PARTY_ID_FROM")
    private String partyIdFrom;
    @Basic(optional = false)
    @Column(name = "PARTY_ID_TO")
    private String partyIdTo;
    @Basic(optional = false)
    @Column(name = "BENEFIT_TYPE_ID")
    private String benefitTypeId;
    @Basic(optional = false)
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;

    public PartyBenefitPK() {
    }

    public PartyBenefitPK(String roleTypeIdFrom, String roleTypeIdTo, String partyIdFrom, String partyIdTo, String benefitTypeId, Date fromDate) {
        this.roleTypeIdFrom = roleTypeIdFrom;
        this.roleTypeIdTo = roleTypeIdTo;
        this.partyIdFrom = partyIdFrom;
        this.partyIdTo = partyIdTo;
        this.benefitTypeId = benefitTypeId;
        this.fromDate = fromDate;
    }

    public String getRoleTypeIdFrom() {
        return roleTypeIdFrom;
    }

    public void setRoleTypeIdFrom(String roleTypeIdFrom) {
        this.roleTypeIdFrom = roleTypeIdFrom;
    }

    public String getRoleTypeIdTo() {
        return roleTypeIdTo;
    }

    public void setRoleTypeIdTo(String roleTypeIdTo) {
        this.roleTypeIdTo = roleTypeIdTo;
    }

    public String getPartyIdFrom() {
        return partyIdFrom;
    }

    public void setPartyIdFrom(String partyIdFrom) {
        this.partyIdFrom = partyIdFrom;
    }

    public String getPartyIdTo() {
        return partyIdTo;
    }

    public void setPartyIdTo(String partyIdTo) {
        this.partyIdTo = partyIdTo;
    }

    public String getBenefitTypeId() {
        return benefitTypeId;
    }

    public void setBenefitTypeId(String benefitTypeId) {
        this.benefitTypeId = benefitTypeId;
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
        hash += (roleTypeIdFrom != null ? roleTypeIdFrom.hashCode() : 0);
        hash += (roleTypeIdTo != null ? roleTypeIdTo.hashCode() : 0);
        hash += (partyIdFrom != null ? partyIdFrom.hashCode() : 0);
        hash += (partyIdTo != null ? partyIdTo.hashCode() : 0);
        hash += (benefitTypeId != null ? benefitTypeId.hashCode() : 0);
        hash += (fromDate != null ? fromDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PartyBenefitPK)) {
            return false;
        }
        PartyBenefitPK other = (PartyBenefitPK) object;
        if ((this.roleTypeIdFrom == null && other.roleTypeIdFrom != null) || (this.roleTypeIdFrom != null && !this.roleTypeIdFrom.equals(other.roleTypeIdFrom))) {
            return false;
        }
        if ((this.roleTypeIdTo == null && other.roleTypeIdTo != null) || (this.roleTypeIdTo != null && !this.roleTypeIdTo.equals(other.roleTypeIdTo))) {
            return false;
        }
        if ((this.partyIdFrom == null && other.partyIdFrom != null) || (this.partyIdFrom != null && !this.partyIdFrom.equals(other.partyIdFrom))) {
            return false;
        }
        if ((this.partyIdTo == null && other.partyIdTo != null) || (this.partyIdTo != null && !this.partyIdTo.equals(other.partyIdTo))) {
            return false;
        }
        if ((this.benefitTypeId == null && other.benefitTypeId != null) || (this.benefitTypeId != null && !this.benefitTypeId.equals(other.benefitTypeId))) {
            return false;
        }
        if ((this.fromDate == null && other.fromDate != null) || (this.fromDate != null && !this.fromDate.equals(other.fromDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PartyBenefitPK[ roleTypeIdFrom=" + roleTypeIdFrom + ", roleTypeIdTo=" + roleTypeIdTo + ", partyIdFrom=" + partyIdFrom + ", partyIdTo=" + partyIdTo + ", benefitTypeId=" + benefitTypeId + ", fromDate=" + fromDate + " ]";
    }
    
}
