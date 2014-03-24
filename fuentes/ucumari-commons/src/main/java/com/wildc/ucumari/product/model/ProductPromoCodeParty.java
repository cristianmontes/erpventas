/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.product.model;

import com.wildc.ucumari.party.model.Party;
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
@Table(name = "product_promo_code_party")
@NamedQueries({
    @NamedQuery(name = "ProductPromoCodeParty.findAll", query = "SELECT p FROM ProductPromoCodeParty p")})
public class ProductPromoCodeParty implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductPromoCodePartyPK productPromoCodePartyPK;
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
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Party party;
    @JoinColumn(name = "PRODUCT_PROMO_CODE_ID", referencedColumnName = "PRODUCT_PROMO_CODE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProductPromoCode productPromoCode;

    public ProductPromoCodeParty() {
    }

    public ProductPromoCodeParty(ProductPromoCodePartyPK productPromoCodePartyPK) {
        this.productPromoCodePartyPK = productPromoCodePartyPK;
    }

    public ProductPromoCodeParty(String productPromoCodeId, String partyId) {
        this.productPromoCodePartyPK = new ProductPromoCodePartyPK(productPromoCodeId, partyId);
    }

    public ProductPromoCodePartyPK getProductPromoCodePartyPK() {
        return productPromoCodePartyPK;
    }

    public void setProductPromoCodePartyPK(ProductPromoCodePartyPK productPromoCodePartyPK) {
        this.productPromoCodePartyPK = productPromoCodePartyPK;
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

    public ProductPromoCode getProductPromoCode() {
        return productPromoCode;
    }

    public void setProductPromoCode(ProductPromoCode productPromoCode) {
        this.productPromoCode = productPromoCode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productPromoCodePartyPK != null ? productPromoCodePartyPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductPromoCodeParty)) {
            return false;
        }
        ProductPromoCodeParty other = (ProductPromoCodeParty) object;
        if ((this.productPromoCodePartyPK == null && other.productPromoCodePartyPK != null) || (this.productPromoCodePartyPK != null && !this.productPromoCodePartyPK.equals(other.productPromoCodePartyPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductPromoCodeParty[ productPromoCodePartyPK=" + productPromoCodePartyPK + " ]";
    }
    
}
