/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.tax.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "tax_authority_rate_type")
@NamedQueries({
    @NamedQuery(name = "TaxAuthorityRateType.findAll", query = "SELECT t FROM TaxAuthorityRateType t")})
public class TaxAuthorityRateType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TAX_AUTHORITY_RATE_TYPE_ID")
    private String taxAuthorityRateTypeId;
    @Column(name = "DESCRIPTION")
    private String description;
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
    @OneToMany(mappedBy = "taxAuthorityRateTypeId")
    private List<TaxAuthorityRateProduct> taxAuthorityRateProductList;

    public TaxAuthorityRateType() {
    }

    public TaxAuthorityRateType(String taxAuthorityRateTypeId) {
        this.taxAuthorityRateTypeId = taxAuthorityRateTypeId;
    }

    public String getTaxAuthorityRateTypeId() {
        return taxAuthorityRateTypeId;
    }

    public void setTaxAuthorityRateTypeId(String taxAuthorityRateTypeId) {
        this.taxAuthorityRateTypeId = taxAuthorityRateTypeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public List<TaxAuthorityRateProduct> getTaxAuthorityRateProductList() {
        return taxAuthorityRateProductList;
    }

    public void setTaxAuthorityRateProductList(List<TaxAuthorityRateProduct> taxAuthorityRateProductList) {
        this.taxAuthorityRateProductList = taxAuthorityRateProductList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (taxAuthorityRateTypeId != null ? taxAuthorityRateTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TaxAuthorityRateType)) {
            return false;
        }
        TaxAuthorityRateType other = (TaxAuthorityRateType) object;
        if ((this.taxAuthorityRateTypeId == null && other.taxAuthorityRateTypeId != null) || (this.taxAuthorityRateTypeId != null && !this.taxAuthorityRateTypeId.equals(other.taxAuthorityRateTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.TaxAuthorityRateType[ taxAuthorityRateTypeId=" + taxAuthorityRateTypeId + " ]";
    }
    
}
