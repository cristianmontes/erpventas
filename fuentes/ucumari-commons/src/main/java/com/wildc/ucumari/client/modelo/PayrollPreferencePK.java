/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class PayrollPreferencePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PARTY_ID")
    private String partyId;
    @Basic(optional = false)
    @Column(name = "ROLE_TYPE_ID")
    private String roleTypeId;
    @Basic(optional = false)
    @Column(name = "PAYROLL_PREFERENCE_SEQ_ID")
    private String payrollPreferenceSeqId;

    public PayrollPreferencePK() {
    }

    public PayrollPreferencePK(String partyId, String roleTypeId, String payrollPreferenceSeqId) {
        this.partyId = partyId;
        this.roleTypeId = roleTypeId;
        this.payrollPreferenceSeqId = payrollPreferenceSeqId;
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

    public String getPayrollPreferenceSeqId() {
        return payrollPreferenceSeqId;
    }

    public void setPayrollPreferenceSeqId(String payrollPreferenceSeqId) {
        this.payrollPreferenceSeqId = payrollPreferenceSeqId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (partyId != null ? partyId.hashCode() : 0);
        hash += (roleTypeId != null ? roleTypeId.hashCode() : 0);
        hash += (payrollPreferenceSeqId != null ? payrollPreferenceSeqId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PayrollPreferencePK)) {
            return false;
        }
        PayrollPreferencePK other = (PayrollPreferencePK) object;
        if ((this.partyId == null && other.partyId != null) || (this.partyId != null && !this.partyId.equals(other.partyId))) {
            return false;
        }
        if ((this.roleTypeId == null && other.roleTypeId != null) || (this.roleTypeId != null && !this.roleTypeId.equals(other.roleTypeId))) {
            return false;
        }
        if ((this.payrollPreferenceSeqId == null && other.payrollPreferenceSeqId != null) || (this.payrollPreferenceSeqId != null && !this.payrollPreferenceSeqId.equals(other.payrollPreferenceSeqId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PayrollPreferencePK[ partyId=" + partyId + ", roleTypeId=" + roleTypeId + ", payrollPreferenceSeqId=" + payrollPreferenceSeqId + " ]";
    }
    
}
