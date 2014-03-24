/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import com.wildc.ucumari.party.model.Party;
import com.wildc.ucumari.product.model.Product;
import com.wildc.ucumari.product.model.ProductStoreGroup;

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
@Table(name = "vendor_product")
@NamedQueries({
    @NamedQuery(name = "VendorProduct.findAll", query = "SELECT v FROM VendorProduct v")})
public class VendorProduct implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected VendorProductPK vendorProductPK;
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
    @JoinColumn(name = "VENDOR_PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Party party;
    @JoinColumn(name = "PRODUCT_STORE_GROUP_ID", referencedColumnName = "PRODUCT_STORE_GROUP_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProductStoreGroup productStoreGroup;
    @JoinColumn(name = "PRODUCT_ID", referencedColumnName = "PRODUCT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Product product;

    public VendorProduct() {
    }

    public VendorProduct(VendorProductPK vendorProductPK) {
        this.vendorProductPK = vendorProductPK;
    }

    public VendorProduct(String productId, String vendorPartyId, String productStoreGroupId) {
        this.vendorProductPK = new VendorProductPK(productId, vendorPartyId, productStoreGroupId);
    }

    public VendorProductPK getVendorProductPK() {
        return vendorProductPK;
    }

    public void setVendorProductPK(VendorProductPK vendorProductPK) {
        this.vendorProductPK = vendorProductPK;
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

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    public ProductStoreGroup getProductStoreGroup() {
        return productStoreGroup;
    }

    public void setProductStoreGroup(ProductStoreGroup productStoreGroup) {
        this.productStoreGroup = productStoreGroup;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vendorProductPK != null ? vendorProductPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VendorProduct)) {
            return false;
        }
        VendorProduct other = (VendorProduct) object;
        if ((this.vendorProductPK == null && other.vendorProductPK != null) || (this.vendorProductPK != null && !this.vendorProductPK.equals(other.vendorProductPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.VendorProduct[ vendorProductPK=" + vendorProductPK + " ]";
    }
    
}
