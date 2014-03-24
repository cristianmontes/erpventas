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

import com.wildc.ucumari.product.model.ProductCategory;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "tax_authority_category")
@NamedQueries({
    @NamedQuery(name = "TaxAuthorityCategory.findAll", query = "SELECT t FROM TaxAuthorityCategory t")})
public class TaxAuthorityCategory implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TaxAuthorityCategoryPK taxAuthorityCategoryPK;
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
    @JoinColumn(name = "PRODUCT_CATEGORY_ID", referencedColumnName = "PRODUCT_CATEGORY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProductCategory productCategory;

    public TaxAuthorityCategory() {
    }

    public TaxAuthorityCategory(TaxAuthorityCategoryPK taxAuthorityCategoryPK) {
        this.taxAuthorityCategoryPK = taxAuthorityCategoryPK;
    }

    public TaxAuthorityCategory(String taxAuthGeoId, String taxAuthPartyId, String productCategoryId) {
        this.taxAuthorityCategoryPK = new TaxAuthorityCategoryPK(taxAuthGeoId, taxAuthPartyId, productCategoryId);
    }

    public TaxAuthorityCategoryPK getTaxAuthorityCategoryPK() {
        return taxAuthorityCategoryPK;
    }

    public void setTaxAuthorityCategoryPK(TaxAuthorityCategoryPK taxAuthorityCategoryPK) {
        this.taxAuthorityCategoryPK = taxAuthorityCategoryPK;
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

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (taxAuthorityCategoryPK != null ? taxAuthorityCategoryPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TaxAuthorityCategory)) {
            return false;
        }
        TaxAuthorityCategory other = (TaxAuthorityCategory) object;
        if ((this.taxAuthorityCategoryPK == null && other.taxAuthorityCategoryPK != null) || (this.taxAuthorityCategoryPK != null && !this.taxAuthorityCategoryPK.equals(other.taxAuthorityCategoryPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.TaxAuthorityCategory[ taxAuthorityCategoryPK=" + taxAuthorityCategoryPK + " ]";
    }
    
}
