/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.agreement.model;

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
public class AgreementEmploymentApplPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "AGREEMENT_ID")
    private String agreementId;
    @Basic(optional = false)
    @Column(name = "AGREEMENT_ITEM_SEQ_ID")
    private String agreementItemSeqId;
    @Basic(optional = false)
    @Column(name = "PARTY_ID_FROM")
    private String partyIdFrom;
    @Basic(optional = false)
    @Column(name = "PARTY_ID_TO")
    private String partyIdTo;
    @Basic(optional = false)
    @Column(name = "ROLE_TYPE_ID_FROM")
    private String roleTypeIdFrom;
    @Basic(optional = false)
    @Column(name = "ROLE_TYPE_ID_TO")
    private String roleTypeIdTo;
    @Basic(optional = false)
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;

    public AgreementEmploymentApplPK() {
    }

    public AgreementEmploymentApplPK(String agreementId, String agreementItemSeqId, String partyIdFrom, String partyIdTo, String roleTypeIdFrom, String roleTypeIdTo, Date fromDate) {
        this.agreementId = agreementId;
        this.agreementItemSeqId = agreementItemSeqId;
        this.partyIdFrom = partyIdFrom;
        this.partyIdTo = partyIdTo;
        this.roleTypeIdFrom = roleTypeIdFrom;
        this.roleTypeIdTo = roleTypeIdTo;
        this.fromDate = fromDate;
    }

    public String getAgreementId() {
        return agreementId;
    }

    public void setAgreementId(String agreementId) {
        this.agreementId = agreementId;
    }

    public String getAgreementItemSeqId() {
        return agreementItemSeqId;
    }

    public void setAgreementItemSeqId(String agreementItemSeqId) {
        this.agreementItemSeqId = agreementItemSeqId;
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

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (agreementId != null ? agreementId.hashCode() : 0);
        hash += (agreementItemSeqId != null ? agreementItemSeqId.hashCode() : 0);
        hash += (partyIdFrom != null ? partyIdFrom.hashCode() : 0);
        hash += (partyIdTo != null ? partyIdTo.hashCode() : 0);
        hash += (roleTypeIdFrom != null ? roleTypeIdFrom.hashCode() : 0);
        hash += (roleTypeIdTo != null ? roleTypeIdTo.hashCode() : 0);
        hash += (fromDate != null ? fromDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AgreementEmploymentApplPK)) {
            return false;
        }
        AgreementEmploymentApplPK other = (AgreementEmploymentApplPK) object;
        if ((this.agreementId == null && other.agreementId != null) || (this.agreementId != null && !this.agreementId.equals(other.agreementId))) {
            return false;
        }
        if ((this.agreementItemSeqId == null && other.agreementItemSeqId != null) || (this.agreementItemSeqId != null && !this.agreementItemSeqId.equals(other.agreementItemSeqId))) {
            return false;
        }
        if ((this.partyIdFrom == null && other.partyIdFrom != null) || (this.partyIdFrom != null && !this.partyIdFrom.equals(other.partyIdFrom))) {
            return false;
        }
        if ((this.partyIdTo == null && other.partyIdTo != null) || (this.partyIdTo != null && !this.partyIdTo.equals(other.partyIdTo))) {
            return false;
        }
        if ((this.roleTypeIdFrom == null && other.roleTypeIdFrom != null) || (this.roleTypeIdFrom != null && !this.roleTypeIdFrom.equals(other.roleTypeIdFrom))) {
            return false;
        }
        if ((this.roleTypeIdTo == null && other.roleTypeIdTo != null) || (this.roleTypeIdTo != null && !this.roleTypeIdTo.equals(other.roleTypeIdTo))) {
            return false;
        }
        if ((this.fromDate == null && other.fromDate != null) || (this.fromDate != null && !this.fromDate.equals(other.fromDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.AgreementEmploymentApplPK[ agreementId=" + agreementId + ", agreementItemSeqId=" + agreementItemSeqId + ", partyIdFrom=" + partyIdFrom + ", partyIdTo=" + partyIdTo + ", roleTypeIdFrom=" + roleTypeIdFrom + ", roleTypeIdTo=" + roleTypeIdTo + ", fromDate=" + fromDate + " ]";
    }
    
}
