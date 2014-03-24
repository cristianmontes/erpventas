/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.party.model;

import com.wildc.ucumari.product.model.ProductStore;

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
@Table(name = "party_profile_default")
@NamedQueries({
    @NamedQuery(name = "PartyProfileDefault.findAll", query = "SELECT p FROM PartyProfileDefault p")})
public class PartyProfileDefault implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PartyProfileDefaultPK partyProfileDefaultPK;
    @Column(name = "DEFAULT_SHIP_ADDR")
    private String defaultShipAddr;
    @Column(name = "DEFAULT_BILL_ADDR")
    private String defaultBillAddr;
    @Column(name = "DEFAULT_PAY_METH")
    private String defaultPayMeth;
    @Column(name = "DEFAULT_SHIP_METH")
    private String defaultShipMeth;
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
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Party party;

    public PartyProfileDefault() {
    }

    public PartyProfileDefault(PartyProfileDefaultPK partyProfileDefaultPK) {
        this.partyProfileDefaultPK = partyProfileDefaultPK;
    }

    public PartyProfileDefault(String partyId, String productStoreId) {
        this.partyProfileDefaultPK = new PartyProfileDefaultPK(partyId, productStoreId);
    }

    public PartyProfileDefaultPK getPartyProfileDefaultPK() {
        return partyProfileDefaultPK;
    }

    public void setPartyProfileDefaultPK(PartyProfileDefaultPK partyProfileDefaultPK) {
        this.partyProfileDefaultPK = partyProfileDefaultPK;
    }

    public String getDefaultShipAddr() {
        return defaultShipAddr;
    }

    public void setDefaultShipAddr(String defaultShipAddr) {
        this.defaultShipAddr = defaultShipAddr;
    }

    public String getDefaultBillAddr() {
        return defaultBillAddr;
    }

    public void setDefaultBillAddr(String defaultBillAddr) {
        this.defaultBillAddr = defaultBillAddr;
    }

    public String getDefaultPayMeth() {
        return defaultPayMeth;
    }

    public void setDefaultPayMeth(String defaultPayMeth) {
        this.defaultPayMeth = defaultPayMeth;
    }

    public String getDefaultShipMeth() {
        return defaultShipMeth;
    }

    public void setDefaultShipMeth(String defaultShipMeth) {
        this.defaultShipMeth = defaultShipMeth;
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

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (partyProfileDefaultPK != null ? partyProfileDefaultPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PartyProfileDefault)) {
            return false;
        }
        PartyProfileDefault other = (PartyProfileDefault) object;
        if ((this.partyProfileDefaultPK == null && other.partyProfileDefaultPK != null) || (this.partyProfileDefaultPK != null && !this.partyProfileDefaultPK.equals(other.partyProfileDefaultPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PartyProfileDefault[ partyProfileDefaultPK=" + partyProfileDefaultPK + " ]";
    }
    
}
