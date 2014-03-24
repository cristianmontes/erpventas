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
@Table(name = "store_dim")
@NamedQueries({
    @NamedQuery(name = "StoreDim.findAll", query = "SELECT s FROM StoreDim s")})
public class StoreDim implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "STORE_DIM_ID")
    private Long storeDimId;
    @Column(name = "DIM_VERSION")
    private Integer dimVersion;
    @Column(name = "DATE_FROM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateFrom;
    @Column(name = "DATE_TO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateTo;
    @Column(name = "PRODUCT_STORE_ID")
    private String productStoreId;
    @Column(name = "STORE_DIM_NAME")
    private String storeDimName;
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

    public StoreDim() {
    }

    public StoreDim(Long storeDimId) {
        this.storeDimId = storeDimId;
    }

    public Long getStoreDimId() {
        return storeDimId;
    }

    public void setStoreDimId(Long storeDimId) {
        this.storeDimId = storeDimId;
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

    public String getProductStoreId() {
        return productStoreId;
    }

    public void setProductStoreId(String productStoreId) {
        this.productStoreId = productStoreId;
    }

    public String getStoreDimName() {
        return storeDimName;
    }

    public void setStoreDimName(String storeDimName) {
        this.storeDimName = storeDimName;
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
        hash += (storeDimId != null ? storeDimId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StoreDim)) {
            return false;
        }
        StoreDim other = (StoreDim) object;
        if ((this.storeDimId == null && other.storeDimId != null) || (this.storeDimId != null && !this.storeDimId.equals(other.storeDimId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.StoreDim[ storeDimId=" + storeDimId + " ]";
    }
    
}
