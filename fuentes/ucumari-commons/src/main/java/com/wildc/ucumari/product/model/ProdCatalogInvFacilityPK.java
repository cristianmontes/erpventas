/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.product.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Embeddable
public class ProdCatalogInvFacilityPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PROD_CATALOG_ID")
    private String prodCatalogId;
    @Basic(optional = false)
    @Column(name = "FACILITY_ID")
    private String facilityId;
    @Basic(optional = false)
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;

    public ProdCatalogInvFacilityPK() {
    }

    public ProdCatalogInvFacilityPK(String prodCatalogId, String facilityId, Date fromDate) {
        this.prodCatalogId = prodCatalogId;
        this.facilityId = facilityId;
        this.fromDate = fromDate;
    }

    public String getProdCatalogId() {
        return prodCatalogId;
    }

    public void setProdCatalogId(String prodCatalogId) {
        this.prodCatalogId = prodCatalogId;
    }

    public String getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prodCatalogId != null ? prodCatalogId.hashCode() : 0);
        hash += (facilityId != null ? facilityId.hashCode() : 0);
        hash += (fromDate != null ? fromDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProdCatalogInvFacilityPK)) {
            return false;
        }
        ProdCatalogInvFacilityPK other = (ProdCatalogInvFacilityPK) object;
        if ((this.prodCatalogId == null && other.prodCatalogId != null) || (this.prodCatalogId != null && !this.prodCatalogId.equals(other.prodCatalogId))) {
            return false;
        }
        if ((this.facilityId == null && other.facilityId != null) || (this.facilityId != null && !this.facilityId.equals(other.facilityId))) {
            return false;
        }
        if ((this.fromDate == null && other.fromDate != null) || (this.fromDate != null && !this.fromDate.equals(other.fromDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProdCatalogInvFacilityPK[ prodCatalogId=" + prodCatalogId + ", facilityId=" + facilityId + ", fromDate=" + fromDate + " ]";
    }
    
}
