/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.payment.model;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "payment_gateway_payflow_pro")
@NamedQueries({
    @NamedQuery(name = "PaymentGatewayPayflowPro.findAll", query = "SELECT p FROM PaymentGatewayPayflowPro p")})
public class PaymentGatewayPayflowPro implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PAYMENT_GATEWAY_CONFIG_ID")
    private String paymentGatewayConfigId;
    @Column(name = "CERTS_PATH")
    private String certsPath;
    @Column(name = "HOST_ADDRESS")
    private String hostAddress;
    @Column(name = "HOST_PORT")
    private BigInteger hostPort;
    @Column(name = "TIMEOUT")
    private BigInteger timeout;
    @Column(name = "PROXY_ADDRESS")
    private String proxyAddress;
    @Column(name = "PROXY_PORT")
    private BigInteger proxyPort;
    @Column(name = "PROXY_LOGON")
    private String proxyLogon;
    @Column(name = "PROXY_PASSWORD")
    private String proxyPassword;
    @Column(name = "VENDOR")
    private String vendor;
    @Column(name = "USER_ID")
    private String userId;
    @Column(name = "PWD")
    private String pwd;
    @Column(name = "PARTNER")
    private String partner;
    @Column(name = "CHECK_AVS")
    private Character checkAvs;
    @Column(name = "CHECK_CVV2")
    private Character checkCvv2;
    @Column(name = "PRE_AUTH")
    private Character preAuth;
    @Column(name = "ENABLE_TRANSMIT")
    private String enableTransmit;
    @Column(name = "LOG_FILE_NAME")
    private String logFileName;
    @Column(name = "LOGGING_LEVEL")
    private BigInteger loggingLevel;
    @Column(name = "MAX_LOG_FILE_SIZE")
    private BigInteger maxLogFileSize;
    @Column(name = "STACK_TRACE_ON")
    private Character stackTraceOn;
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

    public PaymentGatewayPayflowPro() {
    }

    public PaymentGatewayPayflowPro(String paymentGatewayConfigId) {
        this.paymentGatewayConfigId = paymentGatewayConfigId;
    }

    public String getPaymentGatewayConfigId() {
        return paymentGatewayConfigId;
    }

    public void setPaymentGatewayConfigId(String paymentGatewayConfigId) {
        this.paymentGatewayConfigId = paymentGatewayConfigId;
    }

    public String getCertsPath() {
        return certsPath;
    }

    public void setCertsPath(String certsPath) {
        this.certsPath = certsPath;
    }

    public String getHostAddress() {
        return hostAddress;
    }

    public void setHostAddress(String hostAddress) {
        this.hostAddress = hostAddress;
    }

    public BigInteger getHostPort() {
        return hostPort;
    }

    public void setHostPort(BigInteger hostPort) {
        this.hostPort = hostPort;
    }

    public BigInteger getTimeout() {
        return timeout;
    }

    public void setTimeout(BigInteger timeout) {
        this.timeout = timeout;
    }

    public String getProxyAddress() {
        return proxyAddress;
    }

    public void setProxyAddress(String proxyAddress) {
        this.proxyAddress = proxyAddress;
    }

    public BigInteger getProxyPort() {
        return proxyPort;
    }

    public void setProxyPort(BigInteger proxyPort) {
        this.proxyPort = proxyPort;
    }

    public String getProxyLogon() {
        return proxyLogon;
    }

    public void setProxyLogon(String proxyLogon) {
        this.proxyLogon = proxyLogon;
    }

    public String getProxyPassword() {
        return proxyPassword;
    }

    public void setProxyPassword(String proxyPassword) {
        this.proxyPassword = proxyPassword;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getPartner() {
        return partner;
    }

    public void setPartner(String partner) {
        this.partner = partner;
    }

    public Character getCheckAvs() {
        return checkAvs;
    }

    public void setCheckAvs(Character checkAvs) {
        this.checkAvs = checkAvs;
    }

    public Character getCheckCvv2() {
        return checkCvv2;
    }

    public void setCheckCvv2(Character checkCvv2) {
        this.checkCvv2 = checkCvv2;
    }

    public Character getPreAuth() {
        return preAuth;
    }

    public void setPreAuth(Character preAuth) {
        this.preAuth = preAuth;
    }

    public String getEnableTransmit() {
        return enableTransmit;
    }

    public void setEnableTransmit(String enableTransmit) {
        this.enableTransmit = enableTransmit;
    }

    public String getLogFileName() {
        return logFileName;
    }

    public void setLogFileName(String logFileName) {
        this.logFileName = logFileName;
    }

    public BigInteger getLoggingLevel() {
        return loggingLevel;
    }

    public void setLoggingLevel(BigInteger loggingLevel) {
        this.loggingLevel = loggingLevel;
    }

    public BigInteger getMaxLogFileSize() {
        return maxLogFileSize;
    }

    public void setMaxLogFileSize(BigInteger maxLogFileSize) {
        this.maxLogFileSize = maxLogFileSize;
    }

    public Character getStackTraceOn() {
        return stackTraceOn;
    }

    public void setStackTraceOn(Character stackTraceOn) {
        this.stackTraceOn = stackTraceOn;
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
        if (!(object instanceof PaymentGatewayPayflowPro)) {
            return false;
        }
        PaymentGatewayPayflowPro other = (PaymentGatewayPayflowPro) object;
        if ((this.paymentGatewayConfigId == null && other.paymentGatewayConfigId != null) || (this.paymentGatewayConfigId != null && !this.paymentGatewayConfigId.equals(other.paymentGatewayConfigId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PaymentGatewayPayflowPro[ paymentGatewayConfigId=" + paymentGatewayConfigId + " ]";
    }
    
}
