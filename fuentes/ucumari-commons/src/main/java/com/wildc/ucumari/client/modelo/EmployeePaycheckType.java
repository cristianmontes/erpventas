/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import com.wildc.ucumari.party.model.Party;
import com.wildc.ucumari.payment.model.PaymentType;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "employee_paycheck_type")
@NamedQueries({
    @NamedQuery(name = "EmployeePaycheckType.findAll", query = "SELECT e FROM EmployeePaycheckType e")})
public class EmployeePaycheckType implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EmployeePaycheckTypePK employeePaycheckTypePK;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
    @Column(name = "COMMENTS")
    private String comments;
    @Column(name = "LAST_UPDATED_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdatedStamp;
    @Column(name = "LAST_UPDATED_TX_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdatedTxStamp;
    @Column(name = "CREATED_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdStamp;
    @Column(name = "CREATED_TX_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdTxStamp;
    @JoinColumn(name = "PAYMENT_TYPE_ID", referencedColumnName = "PAYMENT_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private PaymentType paymentType;
    @JoinColumn(name = "ORGANIZATION_PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Party party;
    @JoinColumn(name = "EMPLOYEE_PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Party party1;

    public EmployeePaycheckType() {
    }

    public EmployeePaycheckType(EmployeePaycheckTypePK employeePaycheckTypePK) {
        this.employeePaycheckTypePK = employeePaycheckTypePK;
    }

    public EmployeePaycheckType(String organizationPartyId, String employeePartyId, String paymentTypeId, Date fromDate) {
        this.employeePaycheckTypePK = new EmployeePaycheckTypePK(organizationPartyId, employeePartyId, paymentTypeId, fromDate);
    }

    public EmployeePaycheckTypePK getEmployeePaycheckTypePK() {
        return employeePaycheckTypePK;
    }

    public void setEmployeePaycheckTypePK(EmployeePaycheckTypePK employeePaycheckTypePK) {
        this.employeePaycheckTypePK = employeePaycheckTypePK;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Date getLastUpdatedStamp() {
        return lastUpdatedStamp;
    }

    public void setLastUpdatedStamp(Date lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }

    public Date getLastUpdatedTxStamp() {
        return lastUpdatedTxStamp;
    }

    public void setLastUpdatedTxStamp(Date lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }

    public Date getCreatedStamp() {
        return createdStamp;
    }

    public void setCreatedStamp(Date createdStamp) {
        this.createdStamp = createdStamp;
    }

    public Date getCreatedTxStamp() {
        return createdTxStamp;
    }

    public void setCreatedTxStamp(Date createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    public Party getParty1() {
        return party1;
    }

    public void setParty1(Party party1) {
        this.party1 = party1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (employeePaycheckTypePK != null ? employeePaycheckTypePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmployeePaycheckType)) {
            return false;
        }
        EmployeePaycheckType other = (EmployeePaycheckType) object;
        if ((this.employeePaycheckTypePK == null && other.employeePaycheckTypePK != null) || (this.employeePaycheckTypePK != null && !this.employeePaycheckTypePK.equals(other.employeePaycheckTypePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.EmployeePaycheckType[ employeePaycheckTypePK=" + employeePaycheckTypePK + " ]";
    }
    
}
