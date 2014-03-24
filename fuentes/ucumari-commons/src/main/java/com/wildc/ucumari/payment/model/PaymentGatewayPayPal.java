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
@Table(name = "payment_gateway_pay_pal")
@NamedQueries({
    @NamedQuery(name = "PaymentGatewayPayPal.findAll", query = "SELECT p FROM PaymentGatewayPayPal p")})
public class PaymentGatewayPayPal implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PAYMENT_GATEWAY_CONFIG_ID")
    private String paymentGatewayConfigId;
    @Column(name = "BUSINESS_EMAIL")
    private String businessEmail;
    @Column(name = "NOTIFY_URL")
    private String notifyUrl;
    @Column(name = "RETURN_URL")
    private String returnUrl;
    @Column(name = "CANCEL_RETURN_URL")
    private String cancelReturnUrl;
    @Column(name = "IMAGE_URL")
    private String imageUrl;
    @Column(name = "CONFIRM_TEMPLATE")
    private String confirmTemplate;
    @Column(name = "REDIRECT_URL")
    private String redirectUrl;
    @Column(name = "CONFIRM_URL")
    private String confirmUrl;
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

    public PaymentGatewayPayPal() {
    }

    public PaymentGatewayPayPal(String paymentGatewayConfigId) {
        this.paymentGatewayConfigId = paymentGatewayConfigId;
    }

    public String getPaymentGatewayConfigId() {
        return paymentGatewayConfigId;
    }

    public void setPaymentGatewayConfigId(String paymentGatewayConfigId) {
        this.paymentGatewayConfigId = paymentGatewayConfigId;
    }

    public String getBusinessEmail() {
        return businessEmail;
    }

    public void setBusinessEmail(String businessEmail) {
        this.businessEmail = businessEmail;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getReturnUrl() {
        return returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    public String getCancelReturnUrl() {
        return cancelReturnUrl;
    }

    public void setCancelReturnUrl(String cancelReturnUrl) {
        this.cancelReturnUrl = cancelReturnUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getConfirmTemplate() {
        return confirmTemplate;
    }

    public void setConfirmTemplate(String confirmTemplate) {
        this.confirmTemplate = confirmTemplate;
    }

    public String getRedirectUrl() {
        return redirectUrl;
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    public String getConfirmUrl() {
        return confirmUrl;
    }

    public void setConfirmUrl(String confirmUrl) {
        this.confirmUrl = confirmUrl;
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
        if (!(object instanceof PaymentGatewayPayPal)) {
            return false;
        }
        PaymentGatewayPayPal other = (PaymentGatewayPayPal) object;
        if ((this.paymentGatewayConfigId == null && other.paymentGatewayConfigId != null) || (this.paymentGatewayConfigId != null && !this.paymentGatewayConfigId.equals(other.paymentGatewayConfigId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PaymentGatewayPayPal[ paymentGatewayConfigId=" + paymentGatewayConfigId + " ]";
    }
    
}
