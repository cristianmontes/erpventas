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
import javax.persistence.Lob;
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
@Table(name = "payment_gateway_resp_msg")
@NamedQueries({
    @NamedQuery(name = "PaymentGatewayRespMsg.findAll", query = "SELECT p FROM PaymentGatewayRespMsg p")})
public class PaymentGatewayRespMsg implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PAYMENT_GATEWAY_RESP_MSG_ID")
    private String paymentGatewayRespMsgId;
    @Lob
    @Column(name = "PGR_MESSAGE")
    private String pgrMessage;
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
    @JoinColumn(name = "PAYMENT_GATEWAY_RESPONSE_ID", referencedColumnName = "PAYMENT_GATEWAY_RESPONSE_ID")
    @ManyToOne
    private PaymentGatewayResponse paymentGatewayResponseId;

    public PaymentGatewayRespMsg() {
    }

    public PaymentGatewayRespMsg(String paymentGatewayRespMsgId) {
        this.paymentGatewayRespMsgId = paymentGatewayRespMsgId;
    }

    public String getPaymentGatewayRespMsgId() {
        return paymentGatewayRespMsgId;
    }

    public void setPaymentGatewayRespMsgId(String paymentGatewayRespMsgId) {
        this.paymentGatewayRespMsgId = paymentGatewayRespMsgId;
    }

    public String getPgrMessage() {
        return pgrMessage;
    }

    public void setPgrMessage(String pgrMessage) {
        this.pgrMessage = pgrMessage;
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

    public PaymentGatewayResponse getPaymentGatewayResponseId() {
        return paymentGatewayResponseId;
    }

    public void setPaymentGatewayResponseId(PaymentGatewayResponse paymentGatewayResponseId) {
        this.paymentGatewayResponseId = paymentGatewayResponseId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paymentGatewayRespMsgId != null ? paymentGatewayRespMsgId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PaymentGatewayRespMsg)) {
            return false;
        }
        PaymentGatewayRespMsg other = (PaymentGatewayRespMsg) object;
        if ((this.paymentGatewayRespMsgId == null && other.paymentGatewayRespMsgId != null) || (this.paymentGatewayRespMsgId != null && !this.paymentGatewayRespMsgId.equals(other.paymentGatewayRespMsgId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PaymentGatewayRespMsg[ paymentGatewayRespMsgId=" + paymentGatewayRespMsgId + " ]";
    }
    
}
