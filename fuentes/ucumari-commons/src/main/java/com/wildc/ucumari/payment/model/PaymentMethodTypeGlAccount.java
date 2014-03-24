/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.payment.model;

import com.wildc.ucumari.accounting.model.GlAccount;
import com.wildc.ucumari.party.model.Party;
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
@Table(name = "payment_method_type_gl_account")
@NamedQueries({
    @NamedQuery(name = "PaymentMethodTypeGlAccount.findAll", query = "SELECT p FROM PaymentMethodTypeGlAccount p")})
public class PaymentMethodTypeGlAccount implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PaymentMethodTypeGlAccountPK paymentMethodTypeGlAccountPK;
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
    @JoinColumn(name = "PAYMENT_METHOD_TYPE_ID", referencedColumnName = "PAYMENT_METHOD_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private PaymentMethodType paymentMethodType;
    @JoinColumn(name = "ORGANIZATION_PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Party party;
    @JoinColumn(name = "GL_ACCOUNT_ID", referencedColumnName = "GL_ACCOUNT_ID")
    @ManyToOne
    private GlAccount glAccountId;

    public PaymentMethodTypeGlAccount() {
    }

    public PaymentMethodTypeGlAccount(PaymentMethodTypeGlAccountPK paymentMethodTypeGlAccountPK) {
        this.paymentMethodTypeGlAccountPK = paymentMethodTypeGlAccountPK;
    }

    public PaymentMethodTypeGlAccount(String paymentMethodTypeId, String organizationPartyId) {
        this.paymentMethodTypeGlAccountPK = new PaymentMethodTypeGlAccountPK(paymentMethodTypeId, organizationPartyId);
    }

    public PaymentMethodTypeGlAccountPK getPaymentMethodTypeGlAccountPK() {
        return paymentMethodTypeGlAccountPK;
    }

    public void setPaymentMethodTypeGlAccountPK(PaymentMethodTypeGlAccountPK paymentMethodTypeGlAccountPK) {
        this.paymentMethodTypeGlAccountPK = paymentMethodTypeGlAccountPK;
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

    public PaymentMethodType getPaymentMethodType() {
        return paymentMethodType;
    }

    public void setPaymentMethodType(PaymentMethodType paymentMethodType) {
        this.paymentMethodType = paymentMethodType;
    }

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    public GlAccount getGlAccountId() {
        return glAccountId;
    }

    public void setGlAccountId(GlAccount glAccountId) {
        this.glAccountId = glAccountId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paymentMethodTypeGlAccountPK != null ? paymentMethodTypeGlAccountPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PaymentMethodTypeGlAccount)) {
            return false;
        }
        PaymentMethodTypeGlAccount other = (PaymentMethodTypeGlAccount) object;
        if ((this.paymentMethodTypeGlAccountPK == null && other.paymentMethodTypeGlAccountPK != null) || (this.paymentMethodTypeGlAccountPK != null && !this.paymentMethodTypeGlAccountPK.equals(other.paymentMethodTypeGlAccountPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PaymentMethodTypeGlAccount[ paymentMethodTypeGlAccountPK=" + paymentMethodTypeGlAccountPK + " ]";
    }
    
}
