/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.tax.model;

import com.wildc.ucumari.accounting.model.GlAccount;
import com.wildc.ucumari.party.model.Party;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
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
@Table(name = "tax_authority_gl_account")
@NamedQueries({
    @NamedQuery(name = "TaxAuthorityGlAccount.findAll", query = "SELECT t FROM TaxAuthorityGlAccount t")})
public class TaxAuthorityGlAccount implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TaxAuthorityGlAccountPK taxAuthorityGlAccountPK;
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
    @JoinColumns({
        @JoinColumn(name = "TAX_AUTH_GEO_ID", referencedColumnName = "TAX_AUTH_GEO_ID", insertable = false, updatable = false),
        @JoinColumn(name = "TAX_AUTH_PARTY_ID", referencedColumnName = "TAX_AUTH_PARTY_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private TaxAuthority taxAuthority;
    @JoinColumn(name = "ORGANIZATION_PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Party party;
    @JoinColumn(name = "GL_ACCOUNT_ID", referencedColumnName = "GL_ACCOUNT_ID")
    @ManyToOne
    private GlAccount glAccountId;

    public TaxAuthorityGlAccount() {
    }

    public TaxAuthorityGlAccount(TaxAuthorityGlAccountPK taxAuthorityGlAccountPK) {
        this.taxAuthorityGlAccountPK = taxAuthorityGlAccountPK;
    }

    public TaxAuthorityGlAccount(String taxAuthGeoId, String taxAuthPartyId, String organizationPartyId) {
        this.taxAuthorityGlAccountPK = new TaxAuthorityGlAccountPK(taxAuthGeoId, taxAuthPartyId, organizationPartyId);
    }

    public TaxAuthorityGlAccountPK getTaxAuthorityGlAccountPK() {
        return taxAuthorityGlAccountPK;
    }

    public void setTaxAuthorityGlAccountPK(TaxAuthorityGlAccountPK taxAuthorityGlAccountPK) {
        this.taxAuthorityGlAccountPK = taxAuthorityGlAccountPK;
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

    public TaxAuthority getTaxAuthority() {
        return taxAuthority;
    }

    public void setTaxAuthority(TaxAuthority taxAuthority) {
        this.taxAuthority = taxAuthority;
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
        hash += (taxAuthorityGlAccountPK != null ? taxAuthorityGlAccountPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TaxAuthorityGlAccount)) {
            return false;
        }
        TaxAuthorityGlAccount other = (TaxAuthorityGlAccount) object;
        if ((this.taxAuthorityGlAccountPK == null && other.taxAuthorityGlAccountPK != null) || (this.taxAuthorityGlAccountPK != null && !this.taxAuthorityGlAccountPK.equals(other.taxAuthorityGlAccountPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.TaxAuthorityGlAccount[ taxAuthorityGlAccountPK=" + taxAuthorityGlAccountPK + " ]";
    }
    
}
