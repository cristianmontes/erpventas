/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.product.model;

import java.io.Serializable;
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

import com.wildc.ucumari.contact.model.PostalAddress;
import com.wildc.ucumari.facility.model.Facility;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "prod_store_facility_by_addr")
@NamedQueries({
    @NamedQuery(name = "ProdStoreFacilityByAddr.findAll", query = "SELECT p FROM ProdStoreFacilityByAddr p")})
public class ProdStoreFacilityByAddr implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProdStoreFacilityByAddrPK prodStoreFacilityByAddrPK;
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
    @JoinColumn(name = "PRODUCT_STORE_ID", referencedColumnName = "PRODUCT_STORE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProductStore productStore;
    @JoinColumn(name = "CONTACT_MECH_ID", referencedColumnName = "CONTACT_MECH_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private PostalAddress postalAddress;
    @JoinColumn(name = "FACILITY_ID", referencedColumnName = "FACILITY_ID")
    @ManyToOne
    private Facility facilityId;

    public ProdStoreFacilityByAddr() {
    }

    public ProdStoreFacilityByAddr(ProdStoreFacilityByAddrPK prodStoreFacilityByAddrPK) {
        this.prodStoreFacilityByAddrPK = prodStoreFacilityByAddrPK;
    }

    public ProdStoreFacilityByAddr(String productStoreId, String contactMechId) {
        this.prodStoreFacilityByAddrPK = new ProdStoreFacilityByAddrPK(productStoreId, contactMechId);
    }

    public ProdStoreFacilityByAddrPK getProdStoreFacilityByAddrPK() {
        return prodStoreFacilityByAddrPK;
    }

    public void setProdStoreFacilityByAddrPK(ProdStoreFacilityByAddrPK prodStoreFacilityByAddrPK) {
        this.prodStoreFacilityByAddrPK = prodStoreFacilityByAddrPK;
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

    public ProductStore getProductStore() {
        return productStore;
    }

    public void setProductStore(ProductStore productStore) {
        this.productStore = productStore;
    }

    public PostalAddress getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(PostalAddress postalAddress) {
        this.postalAddress = postalAddress;
    }

    public Facility getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(Facility facilityId) {
        this.facilityId = facilityId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prodStoreFacilityByAddrPK != null ? prodStoreFacilityByAddrPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProdStoreFacilityByAddr)) {
            return false;
        }
        ProdStoreFacilityByAddr other = (ProdStoreFacilityByAddr) object;
        if ((this.prodStoreFacilityByAddrPK == null && other.prodStoreFacilityByAddrPK != null) || (this.prodStoreFacilityByAddrPK != null && !this.prodStoreFacilityByAddrPK.equals(other.prodStoreFacilityByAddrPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProdStoreFacilityByAddr[ prodStoreFacilityByAddrPK=" + prodStoreFacilityByAddrPK + " ]";
    }
    
}
