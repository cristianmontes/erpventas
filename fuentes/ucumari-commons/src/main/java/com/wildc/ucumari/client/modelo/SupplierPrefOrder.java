/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

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
@Table(name = "supplier_pref_order")
@NamedQueries({
    @NamedQuery(name = "SupplierPrefOrder.findAll", query = "SELECT s FROM SupplierPrefOrder s")})
public class SupplierPrefOrder implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SUPPLIER_PREF_ORDER_ID")
    private String supplierPrefOrderId;
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
    @OneToMany(mappedBy = "supplierPrefOrderId")
    private List<SupplierProduct> supplierProductList;

    public SupplierPrefOrder() {
    }

    public SupplierPrefOrder(String supplierPrefOrderId) {
        this.supplierPrefOrderId = supplierPrefOrderId;
    }

    public String getSupplierPrefOrderId() {
        return supplierPrefOrderId;
    }

    public void setSupplierPrefOrderId(String supplierPrefOrderId) {
        this.supplierPrefOrderId = supplierPrefOrderId;
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

    public List<SupplierProduct> getSupplierProductList() {
        return supplierProductList;
    }

    public void setSupplierProductList(List<SupplierProduct> supplierProductList) {
        this.supplierProductList = supplierProductList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (supplierPrefOrderId != null ? supplierPrefOrderId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SupplierPrefOrder)) {
            return false;
        }
        SupplierPrefOrder other = (SupplierPrefOrder) object;
        if ((this.supplierPrefOrderId == null && other.supplierPrefOrderId != null) || (this.supplierPrefOrderId != null && !this.supplierPrefOrderId.equals(other.supplierPrefOrderId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.SupplierPrefOrder[ supplierPrefOrderId=" + supplierPrefOrderId + " ]";
    }
    
}
