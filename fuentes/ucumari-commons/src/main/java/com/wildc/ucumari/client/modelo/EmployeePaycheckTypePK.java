/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

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
public class EmployeePaycheckTypePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ORGANIZATION_PARTY_ID")
    private String organizationPartyId;
    @Basic(optional = false)
    @Column(name = "EMPLOYEE_PARTY_ID")
    private String employeePartyId;
    @Basic(optional = false)
    @Column(name = "PAYMENT_TYPE_ID")
    private String paymentTypeId;
    @Basic(optional = false)
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;

    public EmployeePaycheckTypePK() {
    }

    public EmployeePaycheckTypePK(String organizationPartyId, String employeePartyId, String paymentTypeId, Date fromDate) {
        this.organizationPartyId = organizationPartyId;
        this.employeePartyId = employeePartyId;
        this.paymentTypeId = paymentTypeId;
        this.fromDate = fromDate;
    }

    public String getOrganizationPartyId() {
        return organizationPartyId;
    }

    public void setOrganizationPartyId(String organizationPartyId) {
        this.organizationPartyId = organizationPartyId;
    }

    public String getEmployeePartyId() {
        return employeePartyId;
    }

    public void setEmployeePartyId(String employeePartyId) {
        this.employeePartyId = employeePartyId;
    }

    public String getPaymentTypeId() {
        return paymentTypeId;
    }

    public void setPaymentTypeId(String paymentTypeId) {
        this.paymentTypeId = paymentTypeId;
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
        hash += (organizationPartyId != null ? organizationPartyId.hashCode() : 0);
        hash += (employeePartyId != null ? employeePartyId.hashCode() : 0);
        hash += (paymentTypeId != null ? paymentTypeId.hashCode() : 0);
        hash += (fromDate != null ? fromDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmployeePaycheckTypePK)) {
            return false;
        }
        EmployeePaycheckTypePK other = (EmployeePaycheckTypePK) object;
        if ((this.organizationPartyId == null && other.organizationPartyId != null) || (this.organizationPartyId != null && !this.organizationPartyId.equals(other.organizationPartyId))) {
            return false;
        }
        if ((this.employeePartyId == null && other.employeePartyId != null) || (this.employeePartyId != null && !this.employeePartyId.equals(other.employeePartyId))) {
            return false;
        }
        if ((this.paymentTypeId == null && other.paymentTypeId != null) || (this.paymentTypeId != null && !this.paymentTypeId.equals(other.paymentTypeId))) {
            return false;
        }
        if ((this.fromDate == null && other.fromDate != null) || (this.fromDate != null && !this.fromDate.equals(other.fromDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.EmployeePaycheckTypePK[ organizationPartyId=" + organizationPartyId + ", employeePartyId=" + employeePartyId + ", paymentTypeId=" + paymentTypeId + ", fromDate=" + fromDate + " ]";
    }
    
}
