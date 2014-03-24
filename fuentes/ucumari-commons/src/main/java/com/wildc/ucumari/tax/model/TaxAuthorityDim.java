/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.tax.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "tax_authority_dim")
@NamedQueries({
    @NamedQuery(name = "TaxAuthorityDim.findAll", query = "SELECT t FROM TaxAuthorityDim t")})
public class TaxAuthorityDim implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TAX_AUTHORITY_DIM_ID")
    private Long taxAuthorityDimId;
    @Column(name = "DIM_VERSION")
    private Integer dimVersion;
    @Column(name = "DATE_FROM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateFrom;
    @Column(name = "DATE_TO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateTo;
    @Column(name = "TAX_AUTH_PARTY_ID")
    private String taxAuthPartyId;
    @Column(name = "TAX_AUTH_GEO_ID")
    private String taxAuthGeoId;
    @Column(name = "GROUP_NAME")
    private String groupName;
    @Column(name = "GEO_NAME")
    private String geoName;
    @Column(name = "GEO_CODE")
    private String geoCode;
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

    public TaxAuthorityDim() {
    }

    public TaxAuthorityDim(Long taxAuthorityDimId) {
        this.taxAuthorityDimId = taxAuthorityDimId;
    }

    public Long getTaxAuthorityDimId() {
        return taxAuthorityDimId;
    }

    public void setTaxAuthorityDimId(Long taxAuthorityDimId) {
        this.taxAuthorityDimId = taxAuthorityDimId;
    }

    public Integer getDimVersion() {
        return dimVersion;
    }

    public void setDimVersion(Integer dimVersion) {
        this.dimVersion = dimVersion;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public String getTaxAuthPartyId() {
        return taxAuthPartyId;
    }

    public void setTaxAuthPartyId(String taxAuthPartyId) {
        this.taxAuthPartyId = taxAuthPartyId;
    }

    public String getTaxAuthGeoId() {
        return taxAuthGeoId;
    }

    public void setTaxAuthGeoId(String taxAuthGeoId) {
        this.taxAuthGeoId = taxAuthGeoId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGeoName() {
        return geoName;
    }

    public void setGeoName(String geoName) {
        this.geoName = geoName;
    }

    public String getGeoCode() {
        return geoCode;
    }

    public void setGeoCode(String geoCode) {
        this.geoCode = geoCode;
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
        hash += (taxAuthorityDimId != null ? taxAuthorityDimId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TaxAuthorityDim)) {
            return false;
        }
        TaxAuthorityDim other = (TaxAuthorityDim) object;
        if ((this.taxAuthorityDimId == null && other.taxAuthorityDimId != null) || (this.taxAuthorityDimId != null && !this.taxAuthorityDimId.equals(other.taxAuthorityDimId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.TaxAuthorityDim[ taxAuthorityDimId=" + taxAuthorityDimId + " ]";
    }
    
}
