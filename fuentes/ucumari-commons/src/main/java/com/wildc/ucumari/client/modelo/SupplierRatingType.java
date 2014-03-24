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
@Table(name = "supplier_rating_type")
@NamedQueries({
    @NamedQuery(name = "SupplierRatingType.findAll", query = "SELECT s FROM SupplierRatingType s")})
public class SupplierRatingType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SUPPLIER_RATING_TYPE_ID")
    private String supplierRatingTypeId;
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
    @OneToMany(mappedBy = "supplierRatingTypeId")
    private List<SupplierProduct> supplierProductList;

    public SupplierRatingType() {
    }

    public SupplierRatingType(String supplierRatingTypeId) {
        this.supplierRatingTypeId = supplierRatingTypeId;
    }

    public String getSupplierRatingTypeId() {
        return supplierRatingTypeId;
    }

    public void setSupplierRatingTypeId(String supplierRatingTypeId) {
        this.supplierRatingTypeId = supplierRatingTypeId;
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
        hash += (supplierRatingTypeId != null ? supplierRatingTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SupplierRatingType)) {
            return false;
        }
        SupplierRatingType other = (SupplierRatingType) object;
        if ((this.supplierRatingTypeId == null && other.supplierRatingTypeId != null) || (this.supplierRatingTypeId != null && !this.supplierRatingTypeId.equals(other.supplierRatingTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.SupplierRatingType[ supplierRatingTypeId=" + supplierRatingTypeId + " ]";
    }
    
}
