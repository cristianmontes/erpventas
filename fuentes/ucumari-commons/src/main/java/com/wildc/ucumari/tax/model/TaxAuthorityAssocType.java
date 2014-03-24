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
@Table(name = "tax_authority_assoc_type")
@NamedQueries({
    @NamedQuery(name = "TaxAuthorityAssocType.findAll", query = "SELECT t FROM TaxAuthorityAssocType t")})
public class TaxAuthorityAssocType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TAX_AUTHORITY_ASSOC_TYPE_ID")
    private String taxAuthorityAssocTypeId;
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
    @OneToMany(mappedBy = "taxAuthorityAssocTypeId")
    private List<TaxAuthorityAssoc> taxAuthorityAssocList;

    public TaxAuthorityAssocType() {
    }

    public TaxAuthorityAssocType(String taxAuthorityAssocTypeId) {
        this.taxAuthorityAssocTypeId = taxAuthorityAssocTypeId;
    }

    public String getTaxAuthorityAssocTypeId() {
        return taxAuthorityAssocTypeId;
    }

    public void setTaxAuthorityAssocTypeId(String taxAuthorityAssocTypeId) {
        this.taxAuthorityAssocTypeId = taxAuthorityAssocTypeId;
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

    public List<TaxAuthorityAssoc> getTaxAuthorityAssocList() {
        return taxAuthorityAssocList;
    }

    public void setTaxAuthorityAssocList(List<TaxAuthorityAssoc> taxAuthorityAssocList) {
        this.taxAuthorityAssocList = taxAuthorityAssocList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (taxAuthorityAssocTypeId != null ? taxAuthorityAssocTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TaxAuthorityAssocType)) {
            return false;
        }
        TaxAuthorityAssocType other = (TaxAuthorityAssocType) object;
        if ((this.taxAuthorityAssocTypeId == null && other.taxAuthorityAssocTypeId != null) || (this.taxAuthorityAssocTypeId != null && !this.taxAuthorityAssocTypeId.equals(other.taxAuthorityAssocTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.TaxAuthorityAssocType[ taxAuthorityAssocTypeId=" + taxAuthorityAssocTypeId + " ]";
    }
    
}
