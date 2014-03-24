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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "payment_method_type")

public class PaymentMethodType implements Serializable {
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "paymentMethodType")
    private List<ProductStoreVendorPayment> productStoreVendorPaymentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "paymentMethodType")
    private List<ProductPaymentMethodType> productPaymentMethodTypeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "paymentMethodType")
    private List<ProductStorePaymentSetting> productStorePaymentSettingList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "paymentMethodType")
    private List<PaymentMethodTypeGlAccount> paymentMethodTypeGlAccountList;*/
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PAYMENT_METHOD_TYPE_ID")
    private String paymentMethodTypeId;
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
    /*@OneToMany(mappedBy = "paymentMethodTypeId")
    private List<Payment> paymentList;
    @OneToMany(mappedBy = "paymentMethodTypeId")
    private List<OrderPaymentPreference> orderPaymentPreferenceList;
    @OneToMany(mappedBy = "paymentMethodTypeId")
    private List<PaymentGatewayResponse> paymentGatewayResponseList;
    @OneToMany(mappedBy = "paymentMethodTypeId")
    private List<PaymentMethod> paymentMethodList;
    @JoinColumn(name = "DEFAULT_GL_ACCOUNT_ID", referencedColumnName = "GL_ACCOUNT_ID")
    @ManyToOne
    private GlAccount defaultGlAccountId;*/

    public PaymentMethodType() {
    }

    public PaymentMethodType(String paymentMethodTypeId) {
        this.paymentMethodTypeId = paymentMethodTypeId;
    }

    public String getPaymentMethodTypeId() {
        return paymentMethodTypeId;
    }

    public void setPaymentMethodTypeId(String paymentMethodTypeId) {
        this.paymentMethodTypeId = paymentMethodTypeId;
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
/*
    public List<Payment> getPaymentList() {
        return paymentList;
    }

    public void setPaymentList(List<Payment> paymentList) {
        this.paymentList = paymentList;
    }

    public List<OrderPaymentPreference> getOrderPaymentPreferenceList() {
        return orderPaymentPreferenceList;
    }

    public void setOrderPaymentPreferenceList(List<OrderPaymentPreference> orderPaymentPreferenceList) {
        this.orderPaymentPreferenceList = orderPaymentPreferenceList;
    }

    public List<PaymentGatewayResponse> getPaymentGatewayResponseList() {
        return paymentGatewayResponseList;
    }

    public void setPaymentGatewayResponseList(List<PaymentGatewayResponse> paymentGatewayResponseList) {
        this.paymentGatewayResponseList = paymentGatewayResponseList;
    }

    public List<PaymentMethod> getPaymentMethodList() {
        return paymentMethodList;
    }

    public void setPaymentMethodList(List<PaymentMethod> paymentMethodList) {
        this.paymentMethodList = paymentMethodList;
    }

    public GlAccount getDefaultGlAccountId() {
        return defaultGlAccountId;
    }

    public void setDefaultGlAccountId(GlAccount defaultGlAccountId) {
        this.defaultGlAccountId = defaultGlAccountId;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paymentMethodTypeId != null ? paymentMethodTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PaymentMethodType)) {
            return false;
        }
        PaymentMethodType other = (PaymentMethodType) object;
        if ((this.paymentMethodTypeId == null && other.paymentMethodTypeId != null) || (this.paymentMethodTypeId != null && !this.paymentMethodTypeId.equals(other.paymentMethodTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PaymentMethodType[ paymentMethodTypeId=" + paymentMethodTypeId + " ]";
    }
/*
    public List<ProductStoreVendorPayment> getProductStoreVendorPaymentList() {
        return productStoreVendorPaymentList;
    }

    public void setProductStoreVendorPaymentList(List<ProductStoreVendorPayment> productStoreVendorPaymentList) {
        this.productStoreVendorPaymentList = productStoreVendorPaymentList;
    }

    public List<ProductPaymentMethodType> getProductPaymentMethodTypeList() {
        return productPaymentMethodTypeList;
    }

    public void setProductPaymentMethodTypeList(List<ProductPaymentMethodType> productPaymentMethodTypeList) {
        this.productPaymentMethodTypeList = productPaymentMethodTypeList;
    }

    public List<ProductStorePaymentSetting> getProductStorePaymentSettingList() {
        return productStorePaymentSettingList;
    }

    public void setProductStorePaymentSettingList(List<ProductStorePaymentSetting> productStorePaymentSettingList) {
        this.productStorePaymentSettingList = productStorePaymentSettingList;
    }

    public List<PaymentMethodTypeGlAccount> getPaymentMethodTypeGlAccountList() {
        return paymentMethodTypeGlAccountList;
    }

    public void setPaymentMethodTypeGlAccountList(List<PaymentMethodTypeGlAccount> paymentMethodTypeGlAccountList) {
        this.paymentMethodTypeGlAccountList = paymentMethodTypeGlAccountList;
    }
    */
}
