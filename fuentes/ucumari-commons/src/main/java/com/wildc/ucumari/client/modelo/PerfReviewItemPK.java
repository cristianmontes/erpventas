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
public class PerfReviewItemPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "EMPLOYEE_PARTY_ID")
    private String employeePartyId;
    @Basic(optional = false)
    @Column(name = "EMPLOYEE_ROLE_TYPE_ID")
    private String employeeRoleTypeId;
    @Basic(optional = false)
    @Column(name = "PERF_REVIEW_ID")
    private String perfReviewId;
    @Basic(optional = false)
    @Column(name = "PERF_REVIEW_ITEM_SEQ_ID")
    private String perfReviewItemSeqId;

    public PerfReviewItemPK() {
    }

    public PerfReviewItemPK(String employeePartyId, String employeeRoleTypeId, String perfReviewId, String perfReviewItemSeqId) {
        this.employeePartyId = employeePartyId;
        this.employeeRoleTypeId = employeeRoleTypeId;
        this.perfReviewId = perfReviewId;
        this.perfReviewItemSeqId = perfReviewItemSeqId;
    }

    public String getEmployeePartyId() {
        return employeePartyId;
    }

    public void setEmployeePartyId(String employeePartyId) {
        this.employeePartyId = employeePartyId;
    }

    public String getEmployeeRoleTypeId() {
        return employeeRoleTypeId;
    }

    public void setEmployeeRoleTypeId(String employeeRoleTypeId) {
        this.employeeRoleTypeId = employeeRoleTypeId;
    }

    public String getPerfReviewId() {
        return perfReviewId;
    }

    public void setPerfReviewId(String perfReviewId) {
        this.perfReviewId = perfReviewId;
    }

    public String getPerfReviewItemSeqId() {
        return perfReviewItemSeqId;
    }

    public void setPerfReviewItemSeqId(String perfReviewItemSeqId) {
        this.perfReviewItemSeqId = perfReviewItemSeqId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (employeePartyId != null ? employeePartyId.hashCode() : 0);
        hash += (employeeRoleTypeId != null ? employeeRoleTypeId.hashCode() : 0);
        hash += (perfReviewId != null ? perfReviewId.hashCode() : 0);
        hash += (perfReviewItemSeqId != null ? perfReviewItemSeqId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PerfReviewItemPK)) {
            return false;
        }
        PerfReviewItemPK other = (PerfReviewItemPK) object;
        if ((this.employeePartyId == null && other.employeePartyId != null) || (this.employeePartyId != null && !this.employeePartyId.equals(other.employeePartyId))) {
            return false;
        }
        if ((this.employeeRoleTypeId == null && other.employeeRoleTypeId != null) || (this.employeeRoleTypeId != null && !this.employeeRoleTypeId.equals(other.employeeRoleTypeId))) {
            return false;
        }
        if ((this.perfReviewId == null && other.perfReviewId != null) || (this.perfReviewId != null && !this.perfReviewId.equals(other.perfReviewId))) {
            return false;
        }
        if ((this.perfReviewItemSeqId == null && other.perfReviewItemSeqId != null) || (this.perfReviewItemSeqId != null && !this.perfReviewItemSeqId.equals(other.perfReviewItemSeqId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PerfReviewItemPK[ employeePartyId=" + employeePartyId + ", employeeRoleTypeId=" + employeeRoleTypeId + ", perfReviewId=" + perfReviewId + ", perfReviewItemSeqId=" + perfReviewItemSeqId + " ]";
    }
    
}
