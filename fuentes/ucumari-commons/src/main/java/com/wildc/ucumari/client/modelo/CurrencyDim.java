/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

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
@Table(name = "currency_dim")
@NamedQueries({
    @NamedQuery(name = "CurrencyDim.findAll", query = "SELECT c FROM CurrencyDim c")})
public class CurrencyDim implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CURRENCY_DIM_ID")
    private Long currencyDimId;
    @Column(name = "DIM_VERSION")
    private Integer dimVersion;
    @Column(name = "DATE_FROM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateFrom;
    @Column(name = "DATE_TO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateTo;
    @Column(name = "UOM_ID")
    private String uomId;
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

    public CurrencyDim() {
    }

    public CurrencyDim(Long currencyDimId) {
        this.currencyDimId = currencyDimId;
    }

    public Long getCurrencyDimId() {
        return currencyDimId;
    }

    public void setCurrencyDimId(Long currencyDimId) {
        this.currencyDimId = currencyDimId;
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

    public String getUomId() {
        return uomId;
    }

    public void setUomId(String uomId) {
        this.uomId = uomId;
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
        hash += (currencyDimId != null ? currencyDimId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CurrencyDim)) {
            return false;
        }
        CurrencyDim other = (CurrencyDim) object;
        if ((this.currencyDimId == null && other.currencyDimId != null) || (this.currencyDimId != null && !this.currencyDimId.equals(other.currencyDimId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.CurrencyDim[ currencyDimId=" + currencyDimId + " ]";
    }
    
}
