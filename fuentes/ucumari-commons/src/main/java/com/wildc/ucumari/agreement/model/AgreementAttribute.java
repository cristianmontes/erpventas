/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.agreement.model;

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
@Table(name = "agreement_attribute")
@NamedQueries({
    @NamedQuery(name = "AgreementAttribute.findAll", query = "SELECT a FROM AgreementAttribute a")})
public class AgreementAttribute implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AgreementAttributePK agreementAttributePK;
    @Column(name = "ATTR_VALUE")
    private String attrValue;
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
    @JoinColumn(name = "AGREEMENT_ID", referencedColumnName = "AGREEMENT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Agreement agreement;

    public AgreementAttribute() {
    }

    public AgreementAttribute(AgreementAttributePK agreementAttributePK) {
        this.agreementAttributePK = agreementAttributePK;
    }

    public AgreementAttribute(String agreementId, String attrName) {
        this.agreementAttributePK = new AgreementAttributePK(agreementId, attrName);
    }

    public AgreementAttributePK getAgreementAttributePK() {
        return agreementAttributePK;
    }

    public void setAgreementAttributePK(AgreementAttributePK agreementAttributePK) {
        this.agreementAttributePK = agreementAttributePK;
    }

    public String getAttrValue() {
        return attrValue;
    }

    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue;
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

    public Agreement getAgreement() {
        return agreement;
    }

    public void setAgreement(Agreement agreement) {
        this.agreement = agreement;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (agreementAttributePK != null ? agreementAttributePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AgreementAttribute)) {
            return false;
        }
        AgreementAttribute other = (AgreementAttribute) object;
        if ((this.agreementAttributePK == null && other.agreementAttributePK != null) || (this.agreementAttributePK != null && !this.agreementAttributePK.equals(other.agreementAttributePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.AgreementAttribute[ agreementAttributePK=" + agreementAttributePK + " ]";
    }
    
}
