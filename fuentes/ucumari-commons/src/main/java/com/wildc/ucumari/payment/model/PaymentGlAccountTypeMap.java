/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.payment.model;

import com.wildc.ucumari.accounting.model.GlAccountType;
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
@Table(name = "payment_gl_account_type_map")
@NamedQueries({
    @NamedQuery(name = "PaymentGlAccountTypeMap.findAll", query = "SELECT p FROM PaymentGlAccountTypeMap p")})
public class PaymentGlAccountTypeMap implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PaymentGlAccountTypeMapPK paymentGlAccountTypeMapPK;
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
    @JoinColumn(name = "GL_ACCOUNT_TYPE_ID", referencedColumnName = "GL_ACCOUNT_TYPE_ID")
    @ManyToOne
    private GlAccountType glAccountTypeId;

    public PaymentGlAccountTypeMap() {
    }

    public PaymentGlAccountTypeMap(PaymentGlAccountTypeMapPK paymentGlAccountTypeMapPK) {
        this.paymentGlAccountTypeMapPK = paymentGlAccountTypeMapPK;
    }

    public PaymentGlAccountTypeMap(String paymentTypeId, String organizationPartyId) {
        this.paymentGlAccountTypeMapPK = new PaymentGlAccountTypeMapPK(paymentTypeId, organizationPartyId);
    }

    public PaymentGlAccountTypeMapPK getPaymentGlAccountTypeMapPK() {
        return paymentGlAccountTypeMapPK;
    }

    public void setPaymentGlAccountTypeMapPK(PaymentGlAccountTypeMapPK paymentGlAccountTypeMapPK) {
        this.paymentGlAccountTypeMapPK = paymentGlAccountTypeMapPK;
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

    public GlAccountType getGlAccountTypeId() {
        return glAccountTypeId;
    }

    public void setGlAccountTypeId(GlAccountType glAccountTypeId) {
        this.glAccountTypeId = glAccountTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paymentGlAccountTypeMapPK != null ? paymentGlAccountTypeMapPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PaymentGlAccountTypeMap)) {
            return false;
        }
        PaymentGlAccountTypeMap other = (PaymentGlAccountTypeMap) object;
        if ((this.paymentGlAccountTypeMapPK == null && other.paymentGlAccountTypeMapPK != null) || (this.paymentGlAccountTypeMapPK != null && !this.paymentGlAccountTypeMapPK.equals(other.paymentGlAccountTypeMapPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PaymentGlAccountTypeMap[ paymentGlAccountTypeMapPK=" + paymentGlAccountTypeMapPK + " ]";
    }
    
}
