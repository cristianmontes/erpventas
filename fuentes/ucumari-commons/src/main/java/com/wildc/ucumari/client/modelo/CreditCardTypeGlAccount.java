/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "credit_card_type_gl_account")
@NamedQueries({
    @NamedQuery(name = "CreditCardTypeGlAccount.findAll", query = "SELECT c FROM CreditCardTypeGlAccount c")})
public class CreditCardTypeGlAccount implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CreditCardTypeGlAccountPK creditCardTypeGlAccountPK;
    @Column(name = "GL_ACCOUNT_ID")
    private String glAccountId;
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

    public CreditCardTypeGlAccount() {
    }

    public CreditCardTypeGlAccount(CreditCardTypeGlAccountPK creditCardTypeGlAccountPK) {
        this.creditCardTypeGlAccountPK = creditCardTypeGlAccountPK;
    }

    public CreditCardTypeGlAccount(String cardType, String organizationPartyId) {
        this.creditCardTypeGlAccountPK = new CreditCardTypeGlAccountPK(cardType, organizationPartyId);
    }

    public CreditCardTypeGlAccountPK getCreditCardTypeGlAccountPK() {
        return creditCardTypeGlAccountPK;
    }

    public void setCreditCardTypeGlAccountPK(CreditCardTypeGlAccountPK creditCardTypeGlAccountPK) {
        this.creditCardTypeGlAccountPK = creditCardTypeGlAccountPK;
    }

    public String getGlAccountId() {
        return glAccountId;
    }

    public void setGlAccountId(String glAccountId) {
        this.glAccountId = glAccountId;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (creditCardTypeGlAccountPK != null ? creditCardTypeGlAccountPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CreditCardTypeGlAccount)) {
            return false;
        }
        CreditCardTypeGlAccount other = (CreditCardTypeGlAccount) object;
        if ((this.creditCardTypeGlAccountPK == null && other.creditCardTypeGlAccountPK != null) || (this.creditCardTypeGlAccountPK != null && !this.creditCardTypeGlAccountPK.equals(other.creditCardTypeGlAccountPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.CreditCardTypeGlAccount[ creditCardTypeGlAccountPK=" + creditCardTypeGlAccountPK + " ]";
    }
    
}
