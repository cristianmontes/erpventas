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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "payment_gateway_clear_commerce")
@NamedQueries({
    @NamedQuery(name = "PaymentGatewayClearCommerce.findAll", query = "SELECT p FROM PaymentGatewayClearCommerce p")})
public class PaymentGatewayClearCommerce implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PAYMENT_GATEWAY_CONFIG_ID")
    private String paymentGatewayConfigId;
    @Column(name = "SOURCE_ID")
    private String sourceId;
    @Column(name = "GROUP_ID")
    private String groupId;
    @Column(name = "CLIENT_ID")
    private String clientId;
    @Column(name = "USERNAME")
    private String username;
    @Column(name = "PWD")
    private String pwd;
    @Column(name = "USER_ALIAS")
    private String userAlias;
    @Column(name = "EFFECTIVE_ALIAS")
    private String effectiveAlias;
    @Column(name = "PROCESS_MODE")
    private Character processMode;
    @Column(name = "SERVER_U_R_L")
    private String serverURL;
    @Column(name = "ENABLE_C_V_M")
    private Character enableCVM;
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
    @JoinColumn(name = "PAYMENT_GATEWAY_CONFIG_ID", referencedColumnName = "PAYMENT_GATEWAY_CONFIG_ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private PaymentGatewayConfig paymentGatewayConfig;

    public PaymentGatewayClearCommerce() {
    }

    public PaymentGatewayClearCommerce(String paymentGatewayConfigId) {
        this.paymentGatewayConfigId = paymentGatewayConfigId;
    }

    public String getPaymentGatewayConfigId() {
        return paymentGatewayConfigId;
    }

    public void setPaymentGatewayConfigId(String paymentGatewayConfigId) {
        this.paymentGatewayConfigId = paymentGatewayConfigId;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getUserAlias() {
        return userAlias;
    }

    public void setUserAlias(String userAlias) {
        this.userAlias = userAlias;
    }

    public String getEffectiveAlias() {
        return effectiveAlias;
    }

    public void setEffectiveAlias(String effectiveAlias) {
        this.effectiveAlias = effectiveAlias;
    }

    public Character getProcessMode() {
        return processMode;
    }

    public void setProcessMode(Character processMode) {
        this.processMode = processMode;
    }

    public String getServerURL() {
        return serverURL;
    }

    public void setServerURL(String serverURL) {
        this.serverURL = serverURL;
    }

    public Character getEnableCVM() {
        return enableCVM;
    }

    public void setEnableCVM(Character enableCVM) {
        this.enableCVM = enableCVM;
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

    public PaymentGatewayConfig getPaymentGatewayConfig() {
        return paymentGatewayConfig;
    }

    public void setPaymentGatewayConfig(PaymentGatewayConfig paymentGatewayConfig) {
        this.paymentGatewayConfig = paymentGatewayConfig;
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
        if (!(object instanceof PaymentGatewayClearCommerce)) {
            return false;
        }
        PaymentGatewayClearCommerce other = (PaymentGatewayClearCommerce) object;
        if ((this.paymentGatewayConfigId == null && other.paymentGatewayConfigId != null) || (this.paymentGatewayConfigId != null && !this.paymentGatewayConfigId.equals(other.paymentGatewayConfigId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PaymentGatewayClearCommerce[ paymentGatewayConfigId=" + paymentGatewayConfigId + " ]";
    }
    
}
