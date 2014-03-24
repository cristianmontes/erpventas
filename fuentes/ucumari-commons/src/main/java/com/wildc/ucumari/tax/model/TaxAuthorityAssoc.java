/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.tax.model;

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
@Table(name = "tax_authority_assoc")
@NamedQueries({
    @NamedQuery(name = "TaxAuthorityAssoc.findAll", query = "SELECT t FROM TaxAuthorityAssoc t")})
public class TaxAuthorityAssoc implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TaxAuthorityAssocPK taxAuthorityAssocPK;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
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
    @JoinColumns({
        @JoinColumn(name = "TO_TAX_AUTH_GEO_ID", referencedColumnName = "TAX_AUTH_GEO_ID", insertable = false, updatable = false),
        @JoinColumn(name = "TO_TAX_AUTH_PARTY_ID", referencedColumnName = "TAX_AUTH_PARTY_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private TaxAuthority taxAuthority1;
    @JoinColumn(name = "TAX_AUTHORITY_ASSOC_TYPE_ID", referencedColumnName = "TAX_AUTHORITY_ASSOC_TYPE_ID")
    @ManyToOne
    private TaxAuthorityAssocType taxAuthorityAssocTypeId;

    public TaxAuthorityAssoc() {
    }

    public TaxAuthorityAssoc(TaxAuthorityAssocPK taxAuthorityAssocPK) {
        this.taxAuthorityAssocPK = taxAuthorityAssocPK;
    }

    public TaxAuthorityAssoc(String taxAuthGeoId, String taxAuthPartyId, String toTaxAuthGeoId, String toTaxAuthPartyId, Date fromDate) {
        this.taxAuthorityAssocPK = new TaxAuthorityAssocPK(taxAuthGeoId, taxAuthPartyId, toTaxAuthGeoId, toTaxAuthPartyId, fromDate);
    }

    public TaxAuthorityAssocPK getTaxAuthorityAssocPK() {
        return taxAuthorityAssocPK;
    }

    public void setTaxAuthorityAssocPK(TaxAuthorityAssocPK taxAuthorityAssocPK) {
        this.taxAuthorityAssocPK = taxAuthorityAssocPK;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
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

    public TaxAuthority getTaxAuthority1() {
        return taxAuthority1;
    }

    public void setTaxAuthority1(TaxAuthority taxAuthority1) {
        this.taxAuthority1 = taxAuthority1;
    }

    public TaxAuthorityAssocType getTaxAuthorityAssocTypeId() {
        return taxAuthorityAssocTypeId;
    }

    public void setTaxAuthorityAssocTypeId(TaxAuthorityAssocType taxAuthorityAssocTypeId) {
        this.taxAuthorityAssocTypeId = taxAuthorityAssocTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (taxAuthorityAssocPK != null ? taxAuthorityAssocPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TaxAuthorityAssoc)) {
            return false;
        }
        TaxAuthorityAssoc other = (TaxAuthorityAssoc) object;
        if ((this.taxAuthorityAssocPK == null && other.taxAuthorityAssocPK != null) || (this.taxAuthorityAssocPK != null && !this.taxAuthorityAssocPK.equals(other.taxAuthorityAssocPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.TaxAuthorityAssoc[ taxAuthorityAssocPK=" + taxAuthorityAssocPK + " ]";
    }
    
}
