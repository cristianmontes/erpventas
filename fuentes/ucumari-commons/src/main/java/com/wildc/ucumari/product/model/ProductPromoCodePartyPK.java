/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.product.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class ProductPromoCodePartyPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PRODUCT_PROMO_CODE_ID")
    private String productPromoCodeId;
    @Basic(optional = false)
    @Column(name = "PARTY_ID")
    private String partyId;

    public ProductPromoCodePartyPK() {
    }

    public ProductPromoCodePartyPK(String productPromoCodeId, String partyId) {
        this.productPromoCodeId = productPromoCodeId;
        this.partyId = partyId;
    }

    public String getProductPromoCodeId() {
        return productPromoCodeId;
    }

    public void setProductPromoCodeId(String productPromoCodeId) {
        this.productPromoCodeId = productPromoCodeId;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productPromoCodeId != null ? productPromoCodeId.hashCode() : 0);
        hash += (partyId != null ? partyId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductPromoCodePartyPK)) {
            return false;
        }
        ProductPromoCodePartyPK other = (ProductPromoCodePartyPK) object;
        if ((this.productPromoCodeId == null && other.productPromoCodeId != null) || (this.productPromoCodeId != null && !this.productPromoCodeId.equals(other.productPromoCodeId))) {
            return false;
        }
        if ((this.partyId == null && other.partyId != null) || (this.partyId != null && !this.partyId.equals(other.partyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductPromoCodePartyPK[ productPromoCodeId=" + productPromoCodeId + ", partyId=" + partyId + " ]";
    }
    
}
