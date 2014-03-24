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
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.parameters.model.Geo;
import com.wildc.ucumari.party.model.Party;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "tax_authority")

public class TaxAuthority implements Serializable {
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "taxAuthority")
    private List<TaxAuthorityAssoc> taxAuthorityAssocList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "taxAuthority1")
    private List<TaxAuthorityAssoc> taxAuthorityAssocList1;
    @OneToMany(mappedBy = "taxAuthority")
    private List<ReturnAdjustment> returnAdjustmentList;
    @OneToMany(mappedBy = "taxAuthority")
    private List<QuoteAdjustment> quoteAdjustmentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "taxAuthority")
    private List<TaxAuthorityCategory> taxAuthorityCategoryList;
    @OneToMany(mappedBy = "taxAuthority")
    private List<OrderAdjustment> orderAdjustmentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "taxAuthority")
    private List<TaxAuthorityGlAccount> taxAuthorityGlAccountList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "taxAuthority")
    private List<PartyTaxAuthInfo> partyTaxAuthInfoList;*/
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TaxAuthorityPK taxAuthorityPK;
    @Column(name = "REQUIRE_TAX_ID_FOR_EXEMPTION")
    private Character requireTaxIdForExemption;
    @Column(name = "TAX_ID_FORMAT_PATTERN")
    private String taxIdFormatPattern;
    @Column(name = "INCLUDE_TAX_IN_PRICE")
    private Character includeTaxInPrice;
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
    /*@OneToMany(mappedBy = "taxAuthority")
    private List<ProductStore> productStoreList;
    @OneToMany(mappedBy = "taxAuthority")
    private List<TaxAuthorityRateProduct> taxAuthorityRateProductList;*/
    @JoinColumn(name = "TAX_AUTH_PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Party party;
    @JoinColumn(name = "TAX_AUTH_GEO_ID", referencedColumnName = "GEO_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Geo geo;

    public TaxAuthority() {
    }

    public TaxAuthority(TaxAuthorityPK taxAuthorityPK) {
        this.taxAuthorityPK = taxAuthorityPK;
    }

    public TaxAuthority(String taxAuthGeoId, String taxAuthPartyId) {
        this.taxAuthorityPK = new TaxAuthorityPK(taxAuthGeoId, taxAuthPartyId);
    }

    public TaxAuthorityPK getTaxAuthorityPK() {
        return taxAuthorityPK;
    }

    public void setTaxAuthorityPK(TaxAuthorityPK taxAuthorityPK) {
        this.taxAuthorityPK = taxAuthorityPK;
    }

    public Character getRequireTaxIdForExemption() {
        return requireTaxIdForExemption;
    }

    public void setRequireTaxIdForExemption(Character requireTaxIdForExemption) {
        this.requireTaxIdForExemption = requireTaxIdForExemption;
    }

    public String getTaxIdFormatPattern() {
        return taxIdFormatPattern;
    }

    public void setTaxIdFormatPattern(String taxIdFormatPattern) {
        this.taxIdFormatPattern = taxIdFormatPattern;
    }

    public Character getIncludeTaxInPrice() {
        return includeTaxInPrice;
    }

    public void setIncludeTaxInPrice(Character includeTaxInPrice) {
        this.includeTaxInPrice = includeTaxInPrice;
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
/*
    public List<ProductStore> getProductStoreList() {
        return productStoreList;
    }

    public void setProductStoreList(List<ProductStore> productStoreList) {
        this.productStoreList = productStoreList;
    }

    public List<TaxAuthorityRateProduct> getTaxAuthorityRateProductList() {
        return taxAuthorityRateProductList;
    }

    public void setTaxAuthorityRateProductList(List<TaxAuthorityRateProduct> taxAuthorityRateProductList) {
        this.taxAuthorityRateProductList = taxAuthorityRateProductList;
    }*/

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    public Geo getGeo() {
        return geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (taxAuthorityPK != null ? taxAuthorityPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TaxAuthority)) {
            return false;
        }
        TaxAuthority other = (TaxAuthority) object;
        if ((this.taxAuthorityPK == null && other.taxAuthorityPK != null) || (this.taxAuthorityPK != null && !this.taxAuthorityPK.equals(other.taxAuthorityPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.TaxAuthority[ taxAuthorityPK=" + taxAuthorityPK + " ]";
    }
/*
    public List<PartyTaxAuthInfo> getPartyTaxAuthInfoList() {
        return partyTaxAuthInfoList;
    }

    public void setPartyTaxAuthInfoList(List<PartyTaxAuthInfo> partyTaxAuthInfoList) {
        this.partyTaxAuthInfoList = partyTaxAuthInfoList;
    }

    public List<TaxAuthorityAssoc> getTaxAuthorityAssocList() {
        return taxAuthorityAssocList;
    }

    public void setTaxAuthorityAssocList(List<TaxAuthorityAssoc> taxAuthorityAssocList) {
        this.taxAuthorityAssocList = taxAuthorityAssocList;
    }

    public List<TaxAuthorityAssoc> getTaxAuthorityAssocList1() {
        return taxAuthorityAssocList1;
    }

    public void setTaxAuthorityAssocList1(List<TaxAuthorityAssoc> taxAuthorityAssocList1) {
        this.taxAuthorityAssocList1 = taxAuthorityAssocList1;
    }

    public List<ReturnAdjustment> getReturnAdjustmentList() {
        return returnAdjustmentList;
    }

    public void setReturnAdjustmentList(List<ReturnAdjustment> returnAdjustmentList) {
        this.returnAdjustmentList = returnAdjustmentList;
    }

    public List<QuoteAdjustment> getQuoteAdjustmentList() {
        return quoteAdjustmentList;
    }

    public void setQuoteAdjustmentList(List<QuoteAdjustment> quoteAdjustmentList) {
        this.quoteAdjustmentList = quoteAdjustmentList;
    }

    public List<TaxAuthorityCategory> getTaxAuthorityCategoryList() {
        return taxAuthorityCategoryList;
    }

    public void setTaxAuthorityCategoryList(List<TaxAuthorityCategory> taxAuthorityCategoryList) {
        this.taxAuthorityCategoryList = taxAuthorityCategoryList;
    }

    public List<OrderAdjustment> getOrderAdjustmentList() {
        return orderAdjustmentList;
    }

    public void setOrderAdjustmentList(List<OrderAdjustment> orderAdjustmentList) {
        this.orderAdjustmentList = orderAdjustmentList;
    }

    public List<TaxAuthorityGlAccount> getTaxAuthorityGlAccountList() {
        return taxAuthorityGlAccountList;
    }

    public void setTaxAuthorityGlAccountList(List<TaxAuthorityGlAccount> taxAuthorityGlAccountList) {
        this.taxAuthorityGlAccountList = taxAuthorityGlAccountList;
    }*/
    
}
