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
@Table(name = "paycheck_item_type_gl_account")
@NamedQueries({
    @NamedQuery(name = "PaycheckItemTypeGlAccount.findAll", query = "SELECT p FROM PaycheckItemTypeGlAccount p")})
public class PaycheckItemTypeGlAccount implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PaycheckItemTypeGlAccountPK paycheckItemTypeGlAccountPK;
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
    @JoinColumn(name = "DEFAULT_DUE_TO_PARTY_ID", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party defaultDueToPartyId;
    @JoinColumn(name = "ORGANIZATION_PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Party party;
    @JoinColumn(name = "DEBIT_GL_ACCOUNT_ID", referencedColumnName = "GL_ACCOUNT_ID")
    @ManyToOne
    private GlAccount debitGlAccountId;
    @JoinColumn(name = "CREDIT_GL_ACCOUNT_ID", referencedColumnName = "GL_ACCOUNT_ID")
    @ManyToOne
    private GlAccount creditGlAccountId;

    public PaycheckItemTypeGlAccount() {
    }

    public PaycheckItemTypeGlAccount(PaycheckItemTypeGlAccountPK paycheckItemTypeGlAccountPK) {
        this.paycheckItemTypeGlAccountPK = paycheckItemTypeGlAccountPK;
    }

    public PaycheckItemTypeGlAccount(String paycheckItemTypeId, String organizationPartyId) {
        this.paycheckItemTypeGlAccountPK = new PaycheckItemTypeGlAccountPK(paycheckItemTypeId, organizationPartyId);
    }

    public PaycheckItemTypeGlAccountPK getPaycheckItemTypeGlAccountPK() {
        return paycheckItemTypeGlAccountPK;
    }

    public void setPaycheckItemTypeGlAccountPK(PaycheckItemTypeGlAccountPK paycheckItemTypeGlAccountPK) {
        this.paycheckItemTypeGlAccountPK = paycheckItemTypeGlAccountPK;
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

    public Party getDefaultDueToPartyId() {
        return defaultDueToPartyId;
    }

    public void setDefaultDueToPartyId(Party defaultDueToPartyId) {
        this.defaultDueToPartyId = defaultDueToPartyId;
    }

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    public GlAccount getDebitGlAccountId() {
        return debitGlAccountId;
    }

    public void setDebitGlAccountId(GlAccount debitGlAccountId) {
        this.debitGlAccountId = debitGlAccountId;
    }

    public GlAccount getCreditGlAccountId() {
        return creditGlAccountId;
    }

    public void setCreditGlAccountId(GlAccount creditGlAccountId) {
        this.creditGlAccountId = creditGlAccountId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paycheckItemTypeGlAccountPK != null ? paycheckItemTypeGlAccountPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PaycheckItemTypeGlAccount)) {
            return false;
        }
        PaycheckItemTypeGlAccount other = (PaycheckItemTypeGlAccount) object;
        if ((this.paycheckItemTypeGlAccountPK == null && other.paycheckItemTypeGlAccountPK != null) || (this.paycheckItemTypeGlAccountPK != null && !this.paycheckItemTypeGlAccountPK.equals(other.paycheckItemTypeGlAccountPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PaycheckItemTypeGlAccount[ paycheckItemTypeGlAccountPK=" + paycheckItemTypeGlAccountPK + " ]";
    }
    
}
