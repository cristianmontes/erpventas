/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.product.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.facility.model.Facility;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "prod_catalog_inv_facility")
@NamedQueries({
    @NamedQuery(name = "ProdCatalogInvFacility.findAll", query = "SELECT p FROM ProdCatalogInvFacility p")})
public class ProdCatalogInvFacility implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProdCatalogInvFacilityPK prodCatalogInvFacilityPK;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
    @Column(name = "SEQUENCE_NUM")
    private BigInteger sequenceNum;
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
    @JoinColumn(name = "FACILITY_ID", referencedColumnName = "FACILITY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Facility facility;
    @JoinColumn(name = "PROD_CATALOG_ID", referencedColumnName = "PROD_CATALOG_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProdCatalog prodCatalog;

    public ProdCatalogInvFacility() {
    }

    public ProdCatalogInvFacility(ProdCatalogInvFacilityPK prodCatalogInvFacilityPK) {
        this.prodCatalogInvFacilityPK = prodCatalogInvFacilityPK;
    }

    public ProdCatalogInvFacility(String prodCatalogId, String facilityId, Date fromDate) {
        this.prodCatalogInvFacilityPK = new ProdCatalogInvFacilityPK(prodCatalogId, facilityId, fromDate);
    }

    public ProdCatalogInvFacilityPK getProdCatalogInvFacilityPK() {
        return prodCatalogInvFacilityPK;
    }

    public void setProdCatalogInvFacilityPK(ProdCatalogInvFacilityPK prodCatalogInvFacilityPK) {
        this.prodCatalogInvFacilityPK = prodCatalogInvFacilityPK;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
    }

    public BigInteger getSequenceNum() {
        return sequenceNum;
    }

    public void setSequenceNum(BigInteger sequenceNum) {
        this.sequenceNum = sequenceNum;
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

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    public ProdCatalog getProdCatalog() {
        return prodCatalog;
    }

    public void setProdCatalog(ProdCatalog prodCatalog) {
        this.prodCatalog = prodCatalog;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prodCatalogInvFacilityPK != null ? prodCatalogInvFacilityPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProdCatalogInvFacility)) {
            return false;
        }
        ProdCatalogInvFacility other = (ProdCatalogInvFacility) object;
        if ((this.prodCatalogInvFacilityPK == null && other.prodCatalogInvFacilityPK != null) || (this.prodCatalogInvFacilityPK != null && !this.prodCatalogInvFacilityPK.equals(other.prodCatalogInvFacilityPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProdCatalogInvFacility[ prodCatalogInvFacilityPK=" + prodCatalogInvFacilityPK + " ]";
    }
    
}
