/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import com.wildc.ucumari.parameters.model.Uom;
import com.wildc.ucumari.party.model.Party;
import com.wildc.ucumari.product.model.ProductFeature;

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

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "supplier_product_feature")
@NamedQueries({
    @NamedQuery(name = "SupplierProductFeature.findAll", query = "SELECT s FROM SupplierProductFeature s")})
public class SupplierProductFeature implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SupplierProductFeaturePK supplierProductFeaturePK;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "ID_CODE")
    private String idCode;
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
    @JoinColumn(name = "UOM_ID", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom uomId;
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Party party;
    @JoinColumn(name = "PRODUCT_FEATURE_ID", referencedColumnName = "PRODUCT_FEATURE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProductFeature productFeature;

    public SupplierProductFeature() {
    }

    public SupplierProductFeature(SupplierProductFeaturePK supplierProductFeaturePK) {
        this.supplierProductFeaturePK = supplierProductFeaturePK;
    }

    public SupplierProductFeature(String partyId, String productFeatureId) {
        this.supplierProductFeaturePK = new SupplierProductFeaturePK(partyId, productFeatureId);
    }

    public SupplierProductFeaturePK getSupplierProductFeaturePK() {
        return supplierProductFeaturePK;
    }

    public void setSupplierProductFeaturePK(SupplierProductFeaturePK supplierProductFeaturePK) {
        this.supplierProductFeaturePK = supplierProductFeaturePK;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode;
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

    public Uom getUomId() {
        return uomId;
    }

    public void setUomId(Uom uomId) {
        this.uomId = uomId;
    }

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    public ProductFeature getProductFeature() {
        return productFeature;
    }

    public void setProductFeature(ProductFeature productFeature) {
        this.productFeature = productFeature;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (supplierProductFeaturePK != null ? supplierProductFeaturePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SupplierProductFeature)) {
            return false;
        }
        SupplierProductFeature other = (SupplierProductFeature) object;
        if ((this.supplierProductFeaturePK == null && other.supplierProductFeaturePK != null) || (this.supplierProductFeaturePK != null && !this.supplierProductFeaturePK.equals(other.supplierProductFeaturePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.SupplierProductFeature[ supplierProductFeaturePK=" + supplierProductFeaturePK + " ]";
    }
    
}
