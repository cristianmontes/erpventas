/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.payment.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "payment_type")
public class PaymentType implements Serializable {
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "paymentType")
    private List<PaymentTypeAttr> paymentTypeAttrList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "paymentType")
    private List<PaymentGlAccountTypeMap> paymentGlAccountTypeMapList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "paymentType")
    private List<PaycheckTypeItemTypeAssoc> paycheckTypeItemTypeAssocList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "paymentType")
    private List<EmployeePaycheckType> employeePaycheckTypeList;*/
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PAYMENT_TYPE_ID")
    private String paymentTypeId;
    @Column(name = "HAS_TABLE")
    private Character hasTable;
    @Column(name = "DESCRIPTION")
    private String description;
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
    @Column(name = "SYSTEM_USE")
    private Character systemUse;
    /*@OneToMany(mappedBy = "paymentTypeId")
    private List<Payment> paymentList;
    @OneToMany(mappedBy = "parentTypeId")
    private List<PaymentType> paymentTypeList;*/
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "PAYMENT_TYPE_ID")
    @ManyToOne
    private PaymentType parentTypeId;

    public PaymentType() {
    }

    public PaymentType(String paymentTypeId) {
        this.paymentTypeId = paymentTypeId;
    }

    public String getPaymentTypeId() {
        return paymentTypeId;
    }

    public void setPaymentTypeId(String paymentTypeId) {
        this.paymentTypeId = paymentTypeId;
    }

    public Character getHasTable() {
        return hasTable;
    }

    public void setHasTable(Character hasTable) {
        this.hasTable = hasTable;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public Character getSystemUse() {
        return systemUse;
    }

    public void setSystemUse(Character systemUse) {
        this.systemUse = systemUse;
    }
/*
    public List<Payment> getPaymentList() {
        return paymentList;
    }

    public void setPaymentList(List<Payment> paymentList) {
        this.paymentList = paymentList;
    }

    public List<PaymentType> getPaymentTypeList() {
        return paymentTypeList;
    }

    public void setPaymentTypeList(List<PaymentType> paymentTypeList) {
        this.paymentTypeList = paymentTypeList;
    }*/

    public PaymentType getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(PaymentType parentTypeId) {
        this.parentTypeId = parentTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paymentTypeId != null ? paymentTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PaymentType)) {
            return false;
        }
        PaymentType other = (PaymentType) object;
        if ((this.paymentTypeId == null && other.paymentTypeId != null) || (this.paymentTypeId != null && !this.paymentTypeId.equals(other.paymentTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PaymentType[ paymentTypeId=" + paymentTypeId + " ]";
    }
/*
    public List<EmployeePaycheckType> getEmployeePaycheckTypeList() {
        return employeePaycheckTypeList;
    }

    public void setEmployeePaycheckTypeList(List<EmployeePaycheckType> employeePaycheckTypeList) {
        this.employeePaycheckTypeList = employeePaycheckTypeList;
    }

    public List<PaymentTypeAttr> getPaymentTypeAttrList() {
        return paymentTypeAttrList;
    }

    public void setPaymentTypeAttrList(List<PaymentTypeAttr> paymentTypeAttrList) {
        this.paymentTypeAttrList = paymentTypeAttrList;
    }

    public List<PaymentGlAccountTypeMap> getPaymentGlAccountTypeMapList() {
        return paymentGlAccountTypeMapList;
    }

    public void setPaymentGlAccountTypeMapList(List<PaymentGlAccountTypeMap> paymentGlAccountTypeMapList) {
        this.paymentGlAccountTypeMapList = paymentGlAccountTypeMapList;
    }

    public List<PaycheckTypeItemTypeAssoc> getPaycheckTypeItemTypeAssocList() {
        return paycheckTypeItemTypeAssocList;
    }

    public void setPaycheckTypeItemTypeAssocList(List<PaycheckTypeItemTypeAssoc> paycheckTypeItemTypeAssocList) {
        this.paycheckTypeItemTypeAssocList = paycheckTypeItemTypeAssocList;
    }
    */
}
