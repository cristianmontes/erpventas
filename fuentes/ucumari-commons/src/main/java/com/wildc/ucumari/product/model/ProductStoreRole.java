/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.product.model;

import com.wildc.ucumari.party.model.PartyRole;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
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
@Table(name = "product_store_role")
@NamedQueries({
    @NamedQuery(name = "ProductStoreRole.findAll", query = "SELECT p FROM ProductStoreRole p")})
public class ProductStoreRole implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductStoreRolePK productStoreRolePK;
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
    @JoinColumns({
        @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false),
        @JoinColumn(name = "ROLE_TYPE_ID", referencedColumnName = "ROLE_TYPE_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private PartyRole partyRole;
    @JoinColumn(name = "PRODUCT_STORE_ID", referencedColumnName = "PRODUCT_STORE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProductStore productStore;

    public ProductStoreRole() {
    }

    public ProductStoreRole(ProductStoreRolePK productStoreRolePK) {
        this.productStoreRolePK = productStoreRolePK;
    }

    public ProductStoreRole(String partyId, String roleTypeId, String productStoreId, Date fromDate) {
        this.productStoreRolePK = new ProductStoreRolePK(partyId, roleTypeId, productStoreId, fromDate);
    }

    public ProductStoreRolePK getProductStoreRolePK() {
        return productStoreRolePK;
    }

    public void setProductStoreRolePK(ProductStoreRolePK productStoreRolePK) {
        this.productStoreRolePK = productStoreRolePK;
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

    public PartyRole getPartyRole() {
        return partyRole;
    }

    public void setPartyRole(PartyRole partyRole) {
        this.partyRole = partyRole;
    }

    public ProductStore getProductStore() {
        return productStore;
    }

    public void setProductStore(ProductStore productStore) {
        this.productStore = productStore;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productStoreRolePK != null ? productStoreRolePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductStoreRole)) {
            return false;
        }
        ProductStoreRole other = (ProductStoreRole) object;
        if ((this.productStoreRolePK == null && other.productStoreRolePK != null) || (this.productStoreRolePK != null && !this.productStoreRolePK.equals(other.productStoreRolePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductStoreRole[ productStoreRolePK=" + productStoreRolePK + " ]";
    }
    
}
