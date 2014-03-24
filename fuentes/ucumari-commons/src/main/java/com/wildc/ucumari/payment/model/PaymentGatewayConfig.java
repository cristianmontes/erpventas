/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.payment.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.product.model.ProductStorePaymentSetting;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "payment_gateway_config")
@NamedQueries({
    @NamedQuery(name = "PaymentGatewayConfig.findAll", query = "SELECT p FROM PaymentGatewayConfig p")})
public class PaymentGatewayConfig implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PAYMENT_GATEWAY_CONFIG_ID")
    private String paymentGatewayConfigId;
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
    @JoinColumn(name = "PAYMENT_GATEWAY_CONFIG_TYPE_ID", referencedColumnName = "PAYMENT_GATEWAY_CONFIG_TYPE_ID")
    @ManyToOne
    private PaymentGatewayConfigType paymentGatewayConfigTypeId;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "paymentGatewayConfig")
    private PaymentGatewayPayPal paymentGatewayPayPal;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "paymentGatewayConfig")
    private PaymentGatewayPayflowPro paymentGatewayPayflowPro;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "paymentGatewayConfig")
    private PaymentGatewayClearCommerce paymentGatewayClearCommerce;
    @OneToMany(mappedBy = "paymentGatewayConfigId")
    private List<ProductStorePaymentSetting> productStorePaymentSettingList;

    public PaymentGatewayConfig() {
    }

    public PaymentGatewayConfig(String paymentGatewayConfigId) {
        this.paymentGatewayConfigId = paymentGatewayConfigId;
    }

    public String getPaymentGatewayConfigId() {
        return paymentGatewayConfigId;
    }

    public void setPaymentGatewayConfigId(String paymentGatewayConfigId) {
        this.paymentGatewayConfigId = paymentGatewayConfigId;
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

    public PaymentGatewayConfigType getPaymentGatewayConfigTypeId() {
        return paymentGatewayConfigTypeId;
    }

    public void setPaymentGatewayConfigTypeId(PaymentGatewayConfigType paymentGatewayConfigTypeId) {
        this.paymentGatewayConfigTypeId = paymentGatewayConfigTypeId;
    }

    public PaymentGatewayPayPal getPaymentGatewayPayPal() {
        return paymentGatewayPayPal;
    }

    public void setPaymentGatewayPayPal(PaymentGatewayPayPal paymentGatewayPayPal) {
        this.paymentGatewayPayPal = paymentGatewayPayPal;
    }

    public PaymentGatewayPayflowPro getPaymentGatewayPayflowPro() {
        return paymentGatewayPayflowPro;
    }

    public void setPaymentGatewayPayflowPro(PaymentGatewayPayflowPro paymentGatewayPayflowPro) {
        this.paymentGatewayPayflowPro = paymentGatewayPayflowPro;
    }

    public PaymentGatewayClearCommerce getPaymentGatewayClearCommerce() {
        return paymentGatewayClearCommerce;
    }

    public void setPaymentGatewayClearCommerce(PaymentGatewayClearCommerce paymentGatewayClearCommerce) {
        this.paymentGatewayClearCommerce = paymentGatewayClearCommerce;
    }

    public List<ProductStorePaymentSetting> getProductStorePaymentSettingList() {
        return productStorePaymentSettingList;
    }

    public void setProductStorePaymentSettingList(List<ProductStorePaymentSetting> productStorePaymentSettingList) {
        this.productStorePaymentSettingList = productStorePaymentSettingList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paymentGatewayConfigId != null ? paymentGatewayConfigId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PaymentGatewayConfig)) {
            return false;
        }
        PaymentGatewayConfig other = (PaymentGatewayConfig) object;
        if ((this.paymentGatewayConfigId == null && other.paymentGatewayConfigId != null) || (this.paymentGatewayConfigId != null && !this.paymentGatewayConfigId.equals(other.paymentGatewayConfigId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PaymentGatewayConfig[ paymentGatewayConfigId=" + paymentGatewayConfigId + " ]";
    }
    
}
